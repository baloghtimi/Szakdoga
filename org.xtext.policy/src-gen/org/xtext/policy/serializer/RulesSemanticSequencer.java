/*
 * generated by Xtext 2.10.0
 */
package org.xtext.policy.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.policy.rules.Model;
import org.xtext.policy.rules.Policy;
import org.xtext.policy.rules.Query;
import org.xtext.policy.rules.Rule;
import org.xtext.policy.rules.RulesPackage;
import org.xtext.policy.rules.User;
import org.xtext.policy.services.RulesGrammarAccess;

@SuppressWarnings("all")
public class RulesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RulesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RulesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RulesPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RulesPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case RulesPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case RulesPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case RulesPackage.USER:
				sequence_User(context, (User) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     policy=Policy
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RulesPackage.Literals.MODEL__POLICY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesPackage.Literals.MODEL__POLICY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_0(), semanticObject.getPolicy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Policy returns Policy
	 *
	 * Constraint:
	 *     (name=ID | access=AccessibilityLevel | (operation=OperationType rules+=Rule* resolution=ResolutionType))+
	 */
	protected void sequence_Policy(ISerializationContext context, Policy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns Query
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Query(ISerializationContext context, Query semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RulesPackage.Literals.QUERY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesPackage.Literals.QUERY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (name=ID | access=AccessibilityLevel | (operation=OperationType user=User query=Query priority=INT?))+
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     User returns User
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_User(ISerializationContext context, User semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RulesPackage.Literals.USER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesPackage.Literals.USER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
