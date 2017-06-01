package org.mondo.collaboration.accesscontrol;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mondo.collaboration.accesscontrol.Asset.Factory;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.policy.rules.Model;
import org.mondo.collaboration.policy.rules.ObjectFact;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.Rule;

import com.google.inject.Injector;

import FreshmanCamp.freshmanCamp.Camp;
import FreshmanCamp.freshmanCamp.FreshmanCampFactory;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;

public class ModelClass {
    private static final String QUERIES_PATH = "D:\\MEREZEGYEGYETEM\\6\\Onlab\\runtime-EclipseApplication\\FreshmanCamp.accesscontrol\\src\\freshmancamp\\FreshmanCamp.vql";
	private static final String RULES_PATH = "D:\\MEREZEGYEGYETEM\\6\\Onlab\\runtime-EclipseApplication\\FreshmanCamp.accesscontrol\\src\\freshmancamp\\FreshmanCamp.rules";
	private static final String MODELS_PATH = "D:\\MEREZEGYEGYETEM\\6\\Onlab\\runtime-EclipseApplication\\FreshmanCamp.accesscontrol\\src\\freshmancamp\\FreshmanCamp.freshmancamp";
	
	private XtextResourceSet resourceSet;
	private Model ruleModel;
	private Resource queryResource;
	private PatternModel queriesModel;
	private Resource modelResource;
	private Camp model;
    
	EList<Role> roles;
    EList<Asset> assets;
    
    public ModelClass(){
    	FreshmanCampFactory.eINSTANCE.eClass();
    	FreshmanCampPackage.eINSTANCE.eClass();
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("freshmancamp", new XMIResourceFactoryImpl());
    	
    	Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
   	    new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
    	
    	resourceSet = injector.getInstance(XtextResourceSet.class);
    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

    	queryResource = resourceSet.getResource(URI.createFileURI(QUERIES_PATH), true);
    	queriesModel = (PatternModel) queryResource.getContents().get(0);
    	
    	Resource ruleResource = resourceSet.getResource(URI.createFileURI(RULES_PATH), true);
    	ruleModel = (Model) ruleResource.getContents().get(0);
    	
    	modelResource = resourceSet.getResource(URI.createFileURI(MODELS_PATH), true);
    	model = (Camp) modelResource.getContents().get(0);
    	
    	//string = executeDemo_GenericAPI_LoadFromEIQ(modelResource, "cardSeniors");
    	
    	//roles = ruleModel.getRoles();
    	assets = getAssets();
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
    
    public boolean canModify(Role role, Asset asset){
    	EList<Rule> rules = ruleModel.getPolicy().getRules();
    	Iterator<Rule> iRule = rules.iterator();
    	while(iRule.hasNext()){
    		Rule rule = iRule.next();
    		String patternName = rule.getPattern().getName();
    		String modelPath = QUERIES_PATH;
    		modelPath.length();
    	}
    	return false;
    }
    
    public EList<Asset> getAssets(){
    	EList<Asset> assetList = new BasicEList<Asset>();
    	EList<Rule> rules = ruleModel.getPolicy().getRules();
    	Iterator<Rule> iterator = rules.iterator();
    	while(iterator.hasNext()){
    		Rule rule = iterator.next();
    		AssetFactory assetFactory = new AssetFactory();
    		Factory factory = assetFactory.factoryFrom(resourceSet, queryResource, modelResource, rule);
    	}
    	return assetList;
    }
}