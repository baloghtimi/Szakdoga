package org.mondo.collaboration.accesscontrol;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.Factory;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.policy.rules.AttributeFact;
import org.mondo.collaboration.policy.rules.ObjectFact;
import org.mondo.collaboration.policy.rules.ReferenceFact;
import org.mondo.collaboration.policy.rules.Rule;

public class AssetFactory {

	public Factory factoryFrom(ResourceSet resourceSet, Resource queryResource, Resource modelResource, Rule rule) {
		if(rule.getAsset() instanceof ObjectFact){
			ObjectFact objFact = (ObjectFact) rule.getAsset();
			int objectPos = rule.getPattern().getParameters().indexOf(objFact.getVariable());
			return ObjectAsset.factory(objectPos);
		}
		
		if(rule.getAsset() instanceof ReferenceFact){
			ReferenceFact refFact = (ReferenceFact) rule.getAsset();
			int srcPos = rule.getPattern().getParameters().indexOf(refFact.getSourceVar());
			String featureName = refFact.getReference().getName();
			int trgPos = rule.getPattern().getParameters().indexOf(refFact.getTargetVar());
			return ReferenceAsset.factory(srcPos, featureName, trgPos);
		}
		
		if(rule.getAsset() instanceof AttributeFact){
			AttributeFact attrFact = (AttributeFact) rule.getAsset();
			int srcPos = rule.getPattern().getParameters().indexOf(attrFact.getVariable());
			String featureName = attrFact.getAttribute().getName();
			return AttributeAsset.factory(srcPos, featureName);
		}
		
		throw new IllegalArgumentException();
	}
	
}
