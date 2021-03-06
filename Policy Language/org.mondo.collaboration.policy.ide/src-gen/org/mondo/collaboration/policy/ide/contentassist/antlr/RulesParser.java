/*
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
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
					put(grammarAccess.getModelFactAccess().getAlternatives(), "rule__ModelFact__Alternatives");
					put(grammarAccess.getBindAccess().getAlternatives(), "rule__Bind__Alternatives");
					put(grammarAccess.getAccessibilityLevelAccess().getAlternatives(), "rule__AccessibilityLevel__Alternatives");
					put(grammarAccess.getOperationTypeAccess().getAlternatives(), "rule__OperationType__Alternatives");
					put(grammarAccess.getResolutionTypeAccess().getAlternatives(), "rule__ResolutionType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_6(), "rule__Rule__Group_6__0");
					put(grammarAccess.getRuleAccess().getGroup_15(), "rule__Rule__Group_15__0");
					put(grammarAccess.getObjectFactAccess().getGroup(), "rule__ObjectFact__Group__0");
					put(grammarAccess.getReferenceFactAccess().getGroup(), "rule__ReferenceFact__Group__0");
					put(grammarAccess.getAttributeFactAccess().getGroup(), "rule__AttributeFact__Group__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getModelAccess().getRolesAssignment_0(), "rule__Model__RolesAssignment_0");
					put(grammarAccess.getModelAccess().getPolicyAssignment_1(), "rule__Model__PolicyAssignment_1");
					put(grammarAccess.getUserAccess().getNameAssignment_1(), "rule__User__NameAssignment_1");
					put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
					put(grammarAccess.getGroupAccess().getRolesAssignment_3(), "rule__Group__RolesAssignment_3");
					put(grammarAccess.getGroupAccess().getRolesAssignment_4_1(), "rule__Group__RolesAssignment_4_1");
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
					put(grammarAccess.getRuleAccess().getPatternAssignment_10(), "rule__Rule__PatternAssignment_10");
					put(grammarAccess.getRuleAccess().getAssetAssignment_12(), "rule__Rule__AssetAssignment_12");
					put(grammarAccess.getRuleAccess().getBindingsAssignment_13(), "rule__Rule__BindingsAssignment_13");
					put(grammarAccess.getRuleAccess().getPriorityAssignment_15_1(), "rule__Rule__PriorityAssignment_15_1");
					put(grammarAccess.getObjectFactAccess().getVariableAssignment_2(), "rule__ObjectFact__VariableAssignment_2");
					put(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2(), "rule__ReferenceFact__SourceVarAssignment_2");
					put(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4(), "rule__ReferenceFact__TargetVarAssignment_4");
					put(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6(), "rule__ReferenceFact__ReferenceAssignment_6");
					put(grammarAccess.getAttributeFactAccess().getVariableAssignment_2(), "rule__AttributeFact__VariableAssignment_2");
					put(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4(), "rule__AttributeFact__AttributeAssignment_4");
					put(grammarAccess.getBindingAccess().getVariableAssignment_1(), "rule__Binding__VariableAssignment_1");
					put(grammarAccess.getBindingAccess().getBindAssignment_5(), "rule__Binding__BindAssignment_5");
					put(grammarAccess.getBindAccess().getValueStringAssignment_0(), "rule__Bind__ValueStringAssignment_0");
					put(grammarAccess.getBindAccess().getValueIntegerAssignment_1(), "rule__Bind__ValueIntegerAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
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
