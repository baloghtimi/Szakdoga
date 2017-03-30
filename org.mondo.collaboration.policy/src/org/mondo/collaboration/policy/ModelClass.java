package org.mondo.collaboration.policy;

import java.util.Iterator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mondo.collaboration.policy.rules.*;
import com.google.inject.Injector;

public class ModelClass {
    Model model;
    EList<Role> roles;
    EList<Asset> assets;
    
    public ModelClass(){
    	model = loadModel();
    	roles = model.getRoles();
    	assets = getAssets();
    	
    }
    
    public Model loadModel(){
    	new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
    	Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
    	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    	Resource resource = resourceSet.getResource(
    	    URI.createURI("platform:/resource/FreshmanCamp.queries/src/freshmancamp/FreshmanCamp.rules"), true);
    	Model model = (Model) resource.getContents().get(0);
    	return model;
    }
    
    public boolean canModify(Role role, Asset asset){
    	EList<Rule> rules = model.getPolicy().getRules();
    	Iterator<Rule> iRule = rules.iterator();
    	while(iRule.hasNext()){
    		Rule rule = iRule.next();
    		EList<Role> roles = rule.getRoles();
    		Iterator<Role> iRole = roles.iterator();
    		while(iRole.hasNext()){
    		    Role r = iRole.next();
    		    if(r == role && rule.getAsset() == asset && rule.getAccess() == AccessibilityLevel.ALLOW){
    			    return true;
    		    }
    		}
    	}
    	return false;
    }
    
    public Role getRoleByName(String name){
		Iterator<Role> iter = roles.iterator();
		while(iter.hasNext()){
			Role role = iter.next();
			if(role.getName().equals(name)){
				return role;
			}
		}
		return null;
    }
    
    public EList<Asset> getAssets(){
    	EList<Asset> assetList = new BasicEList<Asset>();
    	EList<Rule> rules = model.getPolicy().getRules();
    	Iterator<Rule> iterator = rules.iterator();
    	while(iterator.hasNext()){
    		Rule rule = iterator.next();
    		assetList.add(rule.getAsset());
    	}
    	return assetList;
    }
    
    public ObjectFact getObjectFact(){
    	Iterator<Asset> iter = assets.iterator();
		while(iter.hasNext()){
			Asset asset = iter.next();
		    if(asset instanceof ObjectFact){
		        ObjectFact obj = (ObjectFact) asset;
		        	return obj;
		    }
	    }
		return null;
    }
}
