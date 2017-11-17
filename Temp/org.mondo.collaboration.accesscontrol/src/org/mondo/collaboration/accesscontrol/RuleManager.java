package org.mondo.collaboration.accesscontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

import com.google.common.collect.Sets;

public class RuleManager {
	private SortedSet<Judgement> permissionSet;
	private Collection<IConsequence> strongConsequences;
	private Collection<IConsequence> weakConsequences;
    
	public RuleManager(Collection<IConsequence> weakConsequences, Collection<IConsequence> strongConsequences) {
		this.weakConsequences = weakConsequences;
		this.strongConsequences = strongConsequences;
	}
	
	public Set<Judgement> getEffectivePermissions(Resource model, Model rules, User user) throws ViatraQueryException {
		permissionSet = new TreeSet<Judgement>();
		Set<Judgement> processed = new HashSet<Judgement>();
		
		addInitialPermissions(model, rules, user);
	   // System.out.println("Processed");
		while(!processed.containsAll(permissionSet)) {
			Judgement j = chooseDominant(permissionSet, processed);
			
			processed.add(j);
			//System.out.println("Processed: " + j);
			
			resolveConflict(j);
			
			if(j.getPriority() > -1){
				propagateStrongConsequences(j);
				propagateWeakConsequences(j);
			}
		}
		return processed;
	}
	
	private void addInitialPermissions(Resource model, Model rules, User user) throws ViatraQueryException {
		addExplicitPermissions(model, rules, user);
		addDefaultPermissions(model, rules);
	}
	
	private void addExplicitPermissions(Resource model, Model rules, User user) throws ViatraQueryException {
		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(model));
		AdvancedViatraQueryEngine advancedQueryEngine = AdvancedViatraQueryEngine.from(queryEngine);
		
		for (Rule rule : rules.getPolicy().getRules()) {
			for (Role role : rule.getRoles()){
				if(getRolesOfUser(rules, user).contains(role)){
					Collection<? extends IPatternMatch> matches = getPatternMatches(advancedQueryEngine, rule);
					for (IPatternMatch match : matches) {
						Factory factory = AssetFactory.factoryFrom(rule);
						Set<? extends Asset> assetSet = factory.apply(match);
						for(Asset asset : assetSet) {
							addExplicitPermission(rule, asset);
						}
					}
					break;
				}
			}
		}
	}
	
	private void addDefaultPermissions(Resource model, Model rules) {
		TreeIterator<EObject> allContents = model.getAllContents();
		while(allContents.hasNext()){
			EObject object = allContents.next();
			
			// object
			ObjectAsset objAsset = new Asset.ObjectAsset(object);
			addDefaultPermission(rules, objAsset);
			
			// attributes
			for(EAttribute attribute : object.eClass().getEAllAttributes()) {
				AttributeAsset attrAsset = new Asset.AttributeAsset(object, attribute);
				addDefaultPermission(rules, attrAsset);
			}
			
			// references
			for(EReference reference : object.eClass().getEAllReferences()) {
				// containment reference
				if(reference.isMany()) {
    				@SuppressWarnings("unchecked")
					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
    				for (EObject target : targets) {
    					ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
    					addDefaultPermission(rules, refAsset);
					}
    			// association
    			} else {
    				EObject target = (EObject) object.eGet(reference);
    				if(target != null){
    				ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
    				addDefaultPermission(rules, refAsset);
    				}
    			}
			}
		}
	}
	
	private void addDefaultPermission(Model rules, Asset asset){
		AccessibilityLevel access = rules.getPolicy().getAccess();
		OperationType operation = rules.getPolicy().getOperation();
		ResolutionType resolution = rules.getPolicy().getResolution();
		if(operation == OperationType.READWRITE){
			addToPermissionSet(new Judgement(access, OperationType.READ, asset, -1, resolution));
			addToPermissionSet(new Judgement(access, OperationType.WRITE, asset, -1, resolution));
		} else if(operation == OperationType.READ || operation == OperationType.WRITE) {
			addToPermissionSet(new Judgement(access, operation, asset, -1, resolution));
		}
	}
	
	private void addExplicitPermission(Rule rule, Asset asset){
		AccessibilityLevel access = rule.getAccess();
		ResolutionType resolution = ((Policy)rule.eContainer()).getResolution();
		int priority = rule.getPriority();
		if(access == AccessibilityLevel.OBFUSCATE){
			addToPermissionSet(new Judgement(access, OperationType.READ, asset, priority, resolution));
		} else {
			OperationType operation = rule.getOperation();
		    if(operation == OperationType.READWRITE){
		    	addToPermissionSet(new Judgement(access, OperationType.READ, asset, priority, resolution));
		    	addToPermissionSet(new Judgement(access, OperationType.WRITE, asset, priority, resolution));
			} else if(operation == OperationType.READ || operation == OperationType.WRITE) {
				addToPermissionSet(new Judgement(access, operation, asset, priority, resolution));
			}
		}
	}
	
	private void propagateWeakConsequences(Judgement judgement) {
		for (IConsequence weakConsequence : weakConsequences) {
			Set<Judgement> consequences = weakConsequence.propagate(judgement);
			for(Judgement j : consequences) {
				addToPermissionSet(j);
				//System.out.println("weakConsequence" + weakConsequence + j);
			}
		}
	}
	
	private void propagateStrongConsequences(Judgement judgement) {
		for (IConsequence strongConsequence : strongConsequences) {
			Set<Judgement> consequences = strongConsequence.propagate(judgement);
			for(Judgement j : consequences) {
				addToPermissionSet(j);
				//System.out.println("strongConsequence" + strongConsequence + j);
			}
		}
	}
	
	private void addToPermissionSet(Judgement judgement){
		if(canAdd(judgement)){
		    permissionSet.add(judgement);
		}
	}
	
	private boolean canAdd(Judgement judgement) {
		boolean result = true;
		if(permissionSet.isEmpty()){
			return true;
		}
		List<Judgement> judgementList = new ArrayList<Judgement>();
	    judgementList.addAll(permissionSet);
	    ListIterator<Judgement> listIterator = judgementList.listIterator();
	    while(listIterator.hasNext()){
		    Judgement j = listIterator.next();
		    if(judgement.getAsset().equals(j.getAsset())) {
		    	if(judgement.getAccess() == AccessibilityLevel.OBFUSCATE && j.getAccess() == AccessibilityLevel.ALLOW && j.getOperation() == OperationType.READ){
		    		result = false;
		    	}
		        if(judgement.getAccess() == j.getAccess() && judgement.getOperation() == j.getOperation()){
		        	result = false;
		    	    if(judgement.getPriority() - j.getPriority() > 0){
				        listIterator.remove();
				        listIterator.add(judgement);
			        }
		        }
		    }
	    }
	    permissionSet.clear();
	    permissionSet.addAll(judgementList);
	    return result;
	}
	
	private void resolveConflict(Judgement j){
		Iterator<Judgement> iterator = permissionSet.iterator();
		while(iterator.hasNext()){
			Judgement judgement = iterator.next();
			if(j.getAsset().equals(judgement.getAsset())){
				if(j.getOperation() == judgement.getOperation()){
					if(j.getAccess() != judgement.getAccess()){
						//judgement.setAccess(j.getAccess());
						iterator.remove();
				    }
			    }
			}
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
		SpecificationBuilder builder = new SpecificationBuilder();
		IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) builder.getOrCreateSpecification(rule.getPattern());
		ViatraQueryMatcher<IPatternMatch> queryMatcher = advancedQueryEngine.getMatcher(querySpecification);
		
		Collection<? extends IPatternMatch> matches = null;
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
	
	private Judgement chooseDominant(SortedSet<Judgement> permissionSet, Set<Judgement> processed) {
		SortedSet<Judgement> set = new TreeSet<Judgement>();
		for(Judgement j : permissionSet){
			if(!processed.contains(j)){
				set.add(j);
			}
		}
		return set.first();
	}
}
