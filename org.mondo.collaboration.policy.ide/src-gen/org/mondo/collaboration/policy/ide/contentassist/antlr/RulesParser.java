/*
 * generated by Xtext 2.10.0
 */
package org.mondo.collaboration.policy.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.mondo.collaboration.policy.ide.contentassist.antlr.internal.InternalRulesParser;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;

public class RulesParser extends AbstractContentAssistParser {

	@Inject
	private RulesGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRulesParser createParser() {
		InternalRulesParser result = new InternalRulesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRoleAccess().getAlternatives(), "rule__Role__Alternatives");
					put(grammarAccess.getAssetAccess().getAlternatives(), "rule__Asset__Alternatives");
					put(grammarAccess.getAccessibilityLevelAccess().getAlternatives(), "rule__AccessibilityLevel__Alternatives");
					put(grammarAccess.getOperationTypeAccess().getAlternatives(), "rule__OperationType__Alternatives");
					put(grammarAccess.getResolutionTypeAccess().getAlternatives(), "rule__ResolutionType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_6(), "rule__Rule__Group_6__0");
					put(grammarAccess.getRuleAccess().getGroup_15(), "rule__Rule__Group_15__0");
					put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
					put(grammarAccess.getObjectFactAccess().getGroup(), "rule__ObjectFact__Group__0");
					put(grammarAccess.getReferenceFactAccess().getGroup(), "rule__ReferenceFact__Group__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getModelAccess().getRolesAssignment_0(), "rule__Model__RolesAssignment_0");
					put(grammarAccess.getModelAccess().getPolicyAssignment_1(), "rule__Model__PolicyAssignment_1");
					put(grammarAccess.getPolicyAccess().getNameAssignment_1(), "rule__Policy__NameAssignment_1");
					put(grammarAccess.getPolicyAccess().getAccessAssignment_2(), "rule__Policy__AccessAssignment_2");
					put(grammarAccess.getPolicyAccess().getOperationAssignment_3(), "rule__Policy__OperationAssignment_3");
					put(grammarAccess.getPolicyAccess().getRulesAssignment_7(), "rule__Policy__RulesAssignment_7");
					put(grammarAccess.getPolicyAccess().getResolutionAssignment_10(), "rule__Policy__ResolutionAssignment_10");
					put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
					put(grammarAccess.getRuleAccess().getAccessAssignment_2(), "rule__Rule__AccessAssignment_2");
					put(grammarAccess.getRuleAccess().getOperationAssignment_3(), "rule__Rule__OperationAssignment_3");
					put(grammarAccess.getRuleAccess().getRolesAssignment_5(), "rule__Rule__RolesAssignment_5");
					put(grammarAccess.getRuleAccess().getRolesAssignment_6_1(), "rule__Rule__RolesAssignment_6_1");
					put(grammarAccess.getRuleAccess().getAssetAssignment_9(), "rule__Rule__AssetAssignment_9");
					put(grammarAccess.getRuleAccess().getQueryAssignment_12(), "rule__Rule__QueryAssignment_12");
					put(grammarAccess.getRuleAccess().getBindingsAssignment_13(), "rule__Rule__BindingsAssignment_13");
					put(grammarAccess.getRuleAccess().getPriorityAssignment_15_1(), "rule__Rule__PriorityAssignment_15_1");
					put(grammarAccess.getUserAccess().getNameAssignment_1(), "rule__User__NameAssignment_1");
					put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
					put(grammarAccess.getGroupAccess().getUsersAssignment_3(), "rule__Group__UsersAssignment_3");
					put(grammarAccess.getGroupAccess().getUsersAssignment_4_1(), "rule__Group__UsersAssignment_4_1");
					put(grammarAccess.getObjectFactAccess().getParameterAssignment_1(), "rule__ObjectFact__ParameterAssignment_1");
					put(grammarAccess.getReferenceFactAccess().getSourceParamAssignment_1(), "rule__ReferenceFact__SourceParamAssignment_1");
					put(grammarAccess.getReferenceFactAccess().getTargetParamAssignment_4(), "rule__ReferenceFact__TargetParamAssignment_4");
					put(grammarAccess.getQueryAccess().getPatternAssignment(), "rule__Query__PatternAssignment");
					put(grammarAccess.getBindingAccess().getParameterAssignment_1(), "rule__Binding__ParameterAssignment_1");
					put(grammarAccess.getBindingAccess().getBindAssignment_4(), "rule__Binding__BindAssignment_4");
					put(grammarAccess.getParameterAccess().getVariableAssignment(), "rule__Parameter__VariableAssignment");
					put(grammarAccess.getObjectBindAccess().getObjectAssignment(), "rule__ObjectBind__ObjectAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalRulesParser typedParser = (InternalRulesParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
