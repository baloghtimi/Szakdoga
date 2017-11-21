package org.mondo.collaboration.accesscontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.Factory;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.accesscontrol.Judgement.JudgementKey;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.Binding;
import org.mondo.collaboration.policy.rules.Group;
import org.mondo.collaboration.policy.rules.Model;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.Policy;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.policy.rules.User;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class RuleManager {
	private Logger LOGGER = Logger.getLogger(RuleManager.class);
	
	private List<Judgement> permissionSet;
	private Collection<IConsequence> weakConsequences;
	private Collection<IConsequence> strongConsequences;
//	private Collection<IConsequence> objStrongConsequences;
//	private Collection<IConsequence> refStrongConsequences;
//	private Collection<IConsequence> attrStrongConsequences;
	
	
	private Resource model;
	private Model rules;
	private AdvancedViatraQueryEngine advancedQueryEngine;
	private Map<Pattern, ViatraQueryMatcher<IPatternMatch>> matchers = Maps.newHashMap();
	private Map<JudgementKey, Judgement> firstOccurences = Maps.newHashMap();
	private List<Judgement> processed;
    
	public RuleManager(Collection<IConsequence> weakConsequences, Collection<IConsequence> strongConsequences) {
		this.weakConsequences = weakConsequences;
		this.strongConsequences = strongConsequences;
	}
	
//	public RuleManager(Collection<IConsequence> weakConsequences, Collection<IConsequence> strongConsequences,
//			Collection<IConsequence> objStrongConsequences, Collection<IConsequence> refStrongConsequences,
//			Collection<IConsequence> attrStrongConsequences) {
//		this.weakConsequences = weakConsequences;
//		this.strongConsequences = strongConsequences;
//		this.objStrongConsequences = objStrongConsequences;
//		this.refStrongConsequences = refStrongConsequences;
//		this.attrStrongConsequences = attrStrongConsequences;
//	}
	
	@SuppressWarnings("unchecked")
	public void initializeWithRulesOnModel(Resource model, Model rules) throws ViatraQueryException {
		this.model = model;
		this.rules = rules;
		
		LOGGER.info("Inizialize ViatraQueryEngine with Rules on the Model");
		long start = System.nanoTime();
		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(model));
		advancedQueryEngine = AdvancedViatraQueryEngine.from(queryEngine);
		
		for (Rule rule : rules.getPolicy().getRules()) {
			SpecificationBuilder builder = new SpecificationBuilder();
			IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) builder.getOrCreateSpecification(rule.getPattern());
			ViatraQueryMatcher<IPatternMatch> queryMatcher = advancedQueryEngine.getMatcher(querySpecification);
			matchers.put(rule.getPattern(), queryMatcher);
		}
		long end = System.nanoTime();
		LOGGER.info(String.format("ViatraQueryEngine is initialized in %d nanosec", end-start));
	}
	
	public List<Judgement> getEffectivePermissions(User user) throws ViatraQueryException {
		permissionSet = Lists.newArrayList();
		processed = Lists.newArrayList();
		
		addInitialPermissions(user);
		
		LOGGER.info("Calculating effective permissions");
		long start = System.nanoTime();
		
		int i = permissionSet.size();
		int numOfConsequences = 0;
		while(!permissionSet.isEmpty()) {
			Judgement j = chooseDominant();
			if(j != null) {
				processed.add(j);
				removeFromPermissionSet(j);
//				permissionSet.remove(j);
				resolveConflict(j);
				
				if(j.getPriority() > -1){
					numOfConsequences += propagateStrongConsequences(j);
					numOfConsequences += propagateWeakConsequences(j);
				}
			}
//			if(permissionSet.size() <= i -1000) {
//				LOGGER.info(permissionSet.size());
//				i -= 1000;
//			}
			
		}
		long end = System.nanoTime();
		LOGGER.info(String.format("Effective Permissions are calculated in %d nanosec", end-start));
		LOGGER.info(String.format("Number of propagated consequences: %d", numOfConsequences));
		return processed;
	}
	
	private void addInitialPermissions(User user) throws ViatraQueryException {
		addExplicitPermissions(user);
		addDefaultPermissions();
	}
	
	private void addExplicitPermissions(User user) throws ViatraQueryException {
//		LOGGER.info("Initialize exlipcit permissions");
		int numOfExplicits = 0; 
		long start = System.nanoTime();
		for (Rule rule : rules.getPolicy().getRules()) {
			for (Role role : rule.getRoles()){
				if(getRolesOfUser(rules, user).contains(role)){
//					LOGGER.info(String.format("Executing Rule: %s", rule.getName()));
					long startRule = System.nanoTime();
					Collection<? extends IPatternMatch> matches = getPatternMatches(advancedQueryEngine, rule);
					for (IPatternMatch match : matches) {
						Factory factory = AssetFactory.factoryFrom(rule);
						Set<? extends Asset> assetSet = factory.apply(match);
						for(Asset asset : assetSet) {
							addExplicitPermission(rule, asset);
							numOfExplicits++;
						}
					}
					long endRule = System.nanoTime();
//					LOGGER.info(String.format("Rule %s is executed in %d nanosec", rule.getName(), endRule-startRule));
					LOGGER.info(String.format("Number of explicit judgements: %s", numOfExplicits));
					
					break;
				}
			}
		}
		long end = System.nanoTime();
//		LOGGER.info(String.format("Explicit permissions are added in %d nanosec", end-start));
	}
	
	private void addDefaultPermissions() {
//		LOGGER.info("Initialize default permissions");
		int numOfAssets = 0;
		long start = System.nanoTime();
		TreeIterator<EObject> allContents = model.getAllContents();
		while(allContents.hasNext()){
			EObject object = allContents.next();
			
			// object
			ObjectAsset objAsset = new Asset.ObjectAsset(object);
			numOfAssets++;
			addDefaultPermission(objAsset);
			
			// attributes
			for(EAttribute attribute : object.eClass().getEAllAttributes()) {
				AttributeAsset attrAsset = new Asset.AttributeAsset(object, attribute);
				numOfAssets++;
				addDefaultPermission(attrAsset);
			}
			
			// references
			for(EReference reference : object.eClass().getEAllReferences()) {
				// containment reference
				if(reference.isMany()) {
    				@SuppressWarnings("unchecked")
					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
    				for (EObject target : targets) {
    					ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
    					numOfAssets++;
    					addDefaultPermission(refAsset);
					}
    			// association
    			} else {
    				EObject target = (EObject) object.eGet(reference);
    				if(target != null){
    				ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
    				numOfAssets++;
    				addDefaultPermission(refAsset);
    				}
    			}
			}
		}
		long end = System.nanoTime();
//		LOGGER.info(String.format("Default permissions are added in %d nanosec", end-start));
		LOGGER.info(String.format("Number of assets: %d", numOfAssets));
	}
	
	private void addDefaultPermission(Asset asset){
		AccessibilityLevel access = rules.getPolicy().getAccess();
		OperationType operation = rules.getPolicy().getOperation();
		ResolutionType resolution = rules.getPolicy().getResolution();
		if(operation == OperationType.READWRITE){
			permissionSet.add(new Judgement(access, OperationType.READ, asset, -1, resolution));
			permissionSet.add(new Judgement(access, OperationType.WRITE, asset, -1, resolution));
		} else if(operation == OperationType.READ || operation == OperationType.WRITE) {
			permissionSet.add(new Judgement(access, operation, asset, -1, resolution));
		}
	}
	
	private void addExplicitPermission(Rule rule, Asset asset){
		AccessibilityLevel access = rule.getAccess();
		ResolutionType resolution = ((Policy)rule.eContainer()).getResolution();
		int priority = rule.getPriority();
		if(access == AccessibilityLevel.OBFUSCATE){
			addToOrderedPermissionSet(new Judgement(access, OperationType.READ, asset, priority, resolution));
		} else {
			OperationType operation = rule.getOperation();
		    if(operation == OperationType.READWRITE){
		    	addToOrderedPermissionSet(new Judgement(access, OperationType.READ, asset, priority, resolution));
		    	addToOrderedPermissionSet(new Judgement(access, OperationType.WRITE, asset, priority, resolution));
			} else if(operation == OperationType.READ || operation == OperationType.WRITE) {
				addToOrderedPermissionSet(new Judgement(access, operation, asset, priority, resolution));
			}
		}
	}
	
	private Judgement chooseDominant() {
		return permissionSet.isEmpty() ? null : permissionSet.get(0);
	}
	
	private int propagateWeakConsequences(Judgement judgement) {
		int numOfConsequences = 0;
		for (IConsequence weakConsequence : weakConsequences) {
			Set<Judgement> consequences = weakConsequence.propagate(judgement);
			for(Judgement j : consequences) {
				addToOrderedPermissionSet(j);
				numOfConsequences++;
			}
		}
		return numOfConsequences;
	}
	
	private int propagateStrongConsequences(Judgement judgement) {
		int numOfConsequences = 0;
		for (IConsequence strongConsequence : strongConsequences) {
			Set<Judgement> consequences = strongConsequence.propagate(judgement);
			for(Judgement j : consequences) {
				addToOrderedPermissionSet(j);
				numOfConsequences++;
			}
		}
		return numOfConsequences;
		
//		if(judgement.getAsset() instanceof ObjectAsset) {
//			for (IConsequence strongConsequence : objStrongConsequences) {
//				Set<Judgement> consequences = strongConsequence.propagate(judgement);
//				for(Judgement j : consequences) {
//					addToOrderedPermissionSet(j);
//				}
//			}
//			return;
//		}
//		if(judgement.getAsset() instanceof ReferenceAsset) {
//			for (IConsequence strongConsequence : refStrongConsequences) {
//				Set<Judgement> consequences = strongConsequence.propagate(judgement);
//				for(Judgement j : consequences) {
//					addToOrderedPermissionSet(j);
//				}
//			}
//			return;
//		}
//		if(judgement.getAsset() instanceof AttributeAsset) {
//			for (IConsequence strongConsequence : attrStrongConsequences) {
//				Set<Judgement> consequences = strongConsequence.propagate(judgement);
//				for(Judgement j : consequences) {
//					addToOrderedPermissionSet(j);
//				}
//			}
//		}
	}
	
	
	private void addToOrderedPermissionSet(Judgement judgement){
		if(processed.contains(judgement)) return;
		
		if(permissionSet.contains(judgement)) {
			int index = permissionSet.indexOf(judgement);
			Judgement oldJudgement = permissionSet.get(index);
			if(judgement.getPriority() <= oldJudgement.getPriority()) {
				return;
			} else {
				oldJudgement.setPriority(judgement.getPriority());
				return;
			}
		}
		
		JudgementKey key = judgement.new JudgementKey(judgement.getPriority(), judgement.isDominant());
		if(firstOccurences.containsKey(key)){
			Judgement judgementWithSamePrior = firstOccurences.get(key);
			int index = permissionSet.indexOf(judgementWithSamePrior);
			permissionSet.add(index, judgement);
			firstOccurences.put(key, judgement);
		} else {
			boolean isAdded = false;
			for (Judgement oldJudgement : permissionSet) {
				if(judgement.getPriority() > oldJudgement.getPriority()){
					permissionSet.add(permissionSet.indexOf(oldJudgement), judgement);
					isAdded = true;
					break;
				} else if(judgement.getPriority() == oldJudgement.getPriority() && judgement.isDominant()){
					permissionSet.add(permissionSet.indexOf(oldJudgement), judgement);
					isAdded = true;
					break;
				}
			}
			if(!isAdded){
				permissionSet.add(judgement);
			}
			firstOccurences.put(key, judgement);
		}
	}
	
	private void removeFromPermissionSet(Judgement judgement) {
		if(firstOccurences.containsValue(judgement)){
	    	firstOccurences.remove(judgement.new JudgementKey(judgement.getPriority(), judgement.isDominant()));
	    }
		permissionSet.remove(judgement);
	}
	
	private void resolveConflict(Judgement j){
		List<Judgement> conflictingJudgements = new ArrayList<Judgement>();
		for (Judgement judgement : permissionSet) {
			if(j.getAsset().equals(judgement.getAsset())){
				if(j.getOperation() == judgement.getOperation()){
					if(j.getAccess() != judgement.getAccess()){
						conflictingJudgements.add(judgement);
						if(judgement.getOperation() == OperationType.WRITE){
							break;
						} else {
							if(conflictingJudgements.size() == 2){
								break;
							}
						}
						
					}
				}
			}
		}
		for (Judgement conflictingJudgement : conflictingJudgements) {
			removeFromPermissionSet(conflictingJudgement);
		}
	}

	private List<Role> getRolesOfUser(Model rules, User user) {
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(user);
		for (Role role : rules.getRoles()) {
			if(role instanceof Group){
				for (User u : getUsersOfGroup((Group)role)) {
					if(u.equals(user)){
						roleList.add(role);
					}
				}
			}
		}
		return roleList;
	}
	
	public List<User> getUsersOfGroup(Group group){
		List<User> userList = new ArrayList<User>();
		for (Role role : group.getRoles()) {
			if(role instanceof User){
			    userList.add((User)role);
			} else {
				userList.addAll(getUsersOfGroup((Group)role));
			}
		}
		return userList;
	}
	
	public Collection<? extends IPatternMatch> getPatternMatches(AdvancedViatraQueryEngine advancedQueryEngine, Rule rule) throws ViatraQueryException{
		Collection<? extends IPatternMatch> matches = null;
		ViatraQueryMatcher<IPatternMatch> queryMatcher = matchers.get(rule.getPattern());
		if(queryMatcher != null) {
	        if(!rule.getBindings().isEmpty()) {
		        List<Object> bindList = getBindList(rule.getPattern(), rule);
		        IPatternMatch filterMatch = queryMatcher.newMatch(bindList.toArray(new Object[bindList.size()]));
		        matches = queryMatcher.getAllMatches(filterMatch);
	        } else {
		        matches = queryMatcher.getAllMatches();
	        }
		}
		return matches;
	}
	
	public List<Object> getBindList(Pattern pattern, Rule rule) {
		List<Object> bindList = new ArrayList<Object>();
		EList<Variable> parameterList = pattern.getParameters();
		for (Variable parameter : parameterList) {
			bindList.add(getBoundValue(parameter, rule));
		}
		return bindList;
	}
	
	public Object getBoundValue(Variable parameter, Rule rule) {
		for(Binding binding : rule.getBindings()){
			if(binding.getVariable().equals(parameter)){
				String bind = binding.getBind().getValueString();
				return bind;
			}
		}
		return null;
	}
}
