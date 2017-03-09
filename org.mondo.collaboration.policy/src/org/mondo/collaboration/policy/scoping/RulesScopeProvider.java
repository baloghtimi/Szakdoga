package org.mondo.collaboration.policy.scoping;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Type;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xtype.impl.XImportSectionImpl;
import org.mondo.collaboration.policy.rules.*;

import com.google.common.collect.Lists;

public class RulesScopeProvider extends AbstractRulesScopeProvider {
	
    @Override
    public IScope getScope(EObject context, EReference reference) {
    	if(reference == RulesPackage.eINSTANCE.getRule_Pattern() && context instanceof Rule){
    		return getScopeRule_Pattern(context, reference);
    	}
    	if((reference == RulesPackage.eINSTANCE.getBinding_Variable() && context instanceof Binding) ||
    	   (reference == RulesPackage.eINSTANCE.getObjectFact_Variable() && context instanceof ObjectFact) ||
    	   (reference == RulesPackage.eINSTANCE.getReferenceFact_SourceVar() && context instanceof ReferenceFact) ||
    	   (reference == RulesPackage.eINSTANCE.getReferenceFact_TargetVar() && context instanceof ReferenceFact)){
    		return getScopeVariable(context, reference);
    	}
    	if(reference == RulesPackage.eINSTANCE.getReferenceFact_Reference() && context instanceof ReferenceFact){
    		return getScopeReferenceFact_Reference(context, reference);
    	}
    	if(reference == RulesPackage.eINSTANCE.getObjectBind_Object() && context instanceof ObjectBind){
    		return getScopeObjectBind_Object(context, reference);
    	}
    	return super.getScope(context, reference);
    }

	private IScope getScopeRule_Pattern(EObject context, EReference reference){
	    TreeIterator<EObject> iterator = getResourceContent(context, ".vql");
	    ArrayList<Pattern> patterns = Lists.newArrayList();
	    while(iterator.hasNext()){
	    	EObject eObject = iterator.next();
	    	if(eObject instanceof Pattern){
				Pattern pattern = (Pattern) eObject;
				patterns.add(pattern);
	    	}
	    }
		return Scopes.scopeFor(patterns);
	}
	
	private IScope getScopeVariable(EObject context, EReference reference){
		EObject container = context.eContainer();
		while(!(container instanceof Rule)){
			container = context.eContainer();
		}
		Rule rule = (Rule) container;
		EList<Variable> variables = rule.getPattern().getParameters();
		return Scopes.scopeFor(variables);
	}
	
	private IScope getScopeReferenceFact_Reference(EObject context, EReference reference){
	    ReferenceFact ref = (ReferenceFact) context;
	    Type classType = ref.getSourceVar().getType();
	    EStructuralFeature classNameFeature = classType.eClass().getEStructuralFeature("classname");
	    EClass parameterClass = (EClass) classType.eGet(classNameFeature);
	    String className = parameterClass.getName();
	    
	    ArrayList<EObject> references = Lists.newArrayList();
	    return Scopes.scopeFor(references);
	}
	
	private IScope getScopeObjectBind_Object(EObject context, EReference reference){
	    TreeIterator<EObject> iterator = getResourceContent(context, ".freshmancamp");
	    Binding binding = (Binding) context.eContainer();
	    ArrayList<EObject> objects = Lists.newArrayList();
	    while(iterator.hasNext()){
	    	EObject eObject = iterator.next();
	    		objects.add(eObject);
	    }
	    return Scopes.scopeFor(objects);
	}
	
	private TreeIterator<EObject> getResourceContent(EObject context, String extension){
		Resource contextResource = context.eResource();
		String newURI = contextResource.getURI().toString().replace(".rules", extension);
	    Resource otherResource = contextResource.getResourceSet().getResource(URI.createURI(newURI), true);
	    PatternModel patternModel = (PatternModel) otherResource.getContents().get(0);
	    EStructuralFeature a = patternModel.eClass().getEStructuralFeature("importPackages");
	    XImportSectionImpl b = (XImportSectionImpl) patternModel.eGet(a);
	    String packageURI = b.getImportDeclarations().get(0).getImportedNamespace();
	    contextResource.getResourceSet().getResource(URI.createURI(packageURI), true);
	    
	    return otherResource.getAllContents();
	}
}	
