package org.mondo.collaboration.policy.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "','", "'select'", "'from'", "'query'", "'priority'", "'user'", "'group'", "'obj('", "')'", "'ref('", "'->'", "'where'", "'bound'", "'allow'", "'deny'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRules.g"; }



     	private RulesGrammarAccess grammarAccess;

        public InternalRulesParser(TokenStream input, RulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRules.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRules.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRules.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRules.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_roles_0_0 = null;

        EObject lv_policy_1_0 = null;



        	enterRule();

        try {
            // InternalRules.g:78:2: ( ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) ) )
            // InternalRules.g:79:2: ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) )
            {
            // InternalRules.g:79:2: ( ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) ) )
            // InternalRules.g:80:3: ( (lv_roles_0_0= ruleRole ) )* ( (lv_policy_1_0= rulePolicy ) )
            {
            // InternalRules.g:80:3: ( (lv_roles_0_0= ruleRole ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRules.g:81:4: (lv_roles_0_0= ruleRole )
            	    {
            	    // InternalRules.g:81:4: (lv_roles_0_0= ruleRole )
            	    // InternalRules.g:82:5: lv_roles_0_0= ruleRole
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_roles_0_0=ruleRole();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roles",
            	    						lv_roles_0_0,
            	    						"org.mondo.collaboration.policy.Rules.Role");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRules.g:99:3: ( (lv_policy_1_0= rulePolicy ) )
            // InternalRules.g:100:4: (lv_policy_1_0= rulePolicy )
            {
            // InternalRules.g:100:4: (lv_policy_1_0= rulePolicy )
            // InternalRules.g:101:5: lv_policy_1_0= rulePolicy
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_policy_1_0=rulePolicy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_1_0,
            						"org.mondo.collaboration.policy.Rules.Policy");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePolicy"
    // InternalRules.g:122:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalRules.g:122:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalRules.g:123:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalRules.g:129:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_access_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_rules_7_0 = null;

        Enumerator lv_resolution_10_0 = null;



        	enterRule();

        try {
            // InternalRules.g:135:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' ) )
            // InternalRules.g:136:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' )
            {
            // InternalRules.g:136:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' )
            // InternalRules.g:137:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalRules.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRules.g:159:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalRules.g:160:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalRules.g:160:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalRules.g:161:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_access_2_0=ruleAccessibilityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_2_0,
            						"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRules.g:178:3: ( (lv_operation_3_0= ruleOperationType ) )
            // InternalRules.g:179:4: (lv_operation_3_0= ruleOperationType )
            {
            // InternalRules.g:179:4: (lv_operation_3_0= ruleOperationType )
            // InternalRules.g:180:5: lv_operation_3_0= ruleOperationType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_operation_3_0=ruleOperationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_3_0,
            						"org.mondo.collaboration.policy.Rules.OperationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getByKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getDefaultKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalRules.g:209:3: ( (lv_rules_7_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRules.g:210:4: (lv_rules_7_0= ruleRule )
            	    {
            	    // InternalRules.g:210:4: (lv_rules_7_0= ruleRule )
            	    // InternalRules.g:211:5: lv_rules_7_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_rules_7_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_7_0,
            	    						"org.mondo.collaboration.policy.Rules.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getWithKeyword_9());
            		
            // InternalRules.g:236:3: ( (lv_resolution_10_0= ruleResolutionType ) )
            // InternalRules.g:237:4: (lv_resolution_10_0= ruleResolutionType )
            {
            // InternalRules.g:237:4: (lv_resolution_10_0= ruleResolutionType )
            // InternalRules.g:238:5: lv_resolution_10_0= ruleResolutionType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
            lv_resolution_10_0=ruleResolutionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"resolution",
            						lv_resolution_10_0,
            						"org.mondo.collaboration.policy.Rules.ResolutionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getResolutionKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // InternalRules.g:263:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRules.g:263:45: (iv_ruleRule= ruleRule EOF )
            // InternalRules.g:264:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRules.g:270:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'select' ( (lv_asset_10_0= ruleAsset ) ) otherlv_11= 'from' otherlv_12= 'query' ( (lv_query_13_0= ruleQuery ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_priority_17_0=null;
        Token otherlv_18=null;
        Enumerator lv_access_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_asset_10_0 = null;

        EObject lv_query_13_0 = null;

        EObject lv_bindings_14_0 = null;



        	enterRule();

        try {
            // InternalRules.g:276:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'select' ( (lv_asset_10_0= ruleAsset ) ) otherlv_11= 'from' otherlv_12= 'query' ( (lv_query_13_0= ruleQuery ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) )
            // InternalRules.g:277:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'select' ( (lv_asset_10_0= ruleAsset ) ) otherlv_11= 'from' otherlv_12= 'query' ( (lv_query_13_0= ruleQuery ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            {
            // InternalRules.g:277:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'select' ( (lv_asset_10_0= ruleAsset ) ) otherlv_11= 'from' otherlv_12= 'query' ( (lv_query_13_0= ruleQuery ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            // InternalRules.g:278:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'select' ( (lv_asset_10_0= ruleAsset ) ) otherlv_11= 'from' otherlv_12= 'query' ( (lv_query_13_0= ruleQuery ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalRules.g:282:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:283:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:283:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:284:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRules.g:300:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalRules.g:301:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalRules.g:301:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalRules.g:302:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_access_2_0=ruleAccessibilityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_2_0,
            						"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRules.g:319:3: ( (lv_operation_3_0= ruleOperationType ) )
            // InternalRules.g:320:4: (lv_operation_3_0= ruleOperationType )
            {
            // InternalRules.g:320:4: (lv_operation_3_0= ruleOperationType )
            // InternalRules.g:321:5: lv_operation_3_0= ruleOperationType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_operation_3_0=ruleOperationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_3_0,
            						"org.mondo.collaboration.policy.Rules.OperationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getToKeyword_4());
            		
            // InternalRules.g:342:3: ( (otherlv_5= RULE_ID ) )
            // InternalRules.g:343:4: (otherlv_5= RULE_ID )
            {
            // InternalRules.g:343:4: (otherlv_5= RULE_ID )
            // InternalRules.g:344:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0());
            				

            }


            }

            // InternalRules.g:355:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRules.g:356:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRules.g:360:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalRules.g:361:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalRules.g:361:5: (otherlv_7= RULE_ID )
            	    // InternalRules.g:362:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getSelectKeyword_8());
            		
            // InternalRules.g:382:3: ( (lv_asset_10_0= ruleAsset ) )
            // InternalRules.g:383:4: (lv_asset_10_0= ruleAsset )
            {
            // InternalRules.g:383:4: (lv_asset_10_0= ruleAsset )
            // InternalRules.g:384:5: lv_asset_10_0= ruleAsset
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_asset_10_0=ruleAsset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"asset",
            						lv_asset_10_0,
            						"org.mondo.collaboration.policy.Rules.Asset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getFromKeyword_10());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getQueryKeyword_11());
            		
            // InternalRules.g:409:3: ( (lv_query_13_0= ruleQuery ) )
            // InternalRules.g:410:4: (lv_query_13_0= ruleQuery )
            {
            // InternalRules.g:410:4: (lv_query_13_0= ruleQuery )
            // InternalRules.g:411:5: lv_query_13_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_query_13_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_13_0,
            						"org.mondo.collaboration.policy.Rules.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRules.g:428:3: ( (lv_bindings_14_0= ruleBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRules.g:429:4: (lv_bindings_14_0= ruleBinding )
            	    {
            	    // InternalRules.g:429:4: (lv_bindings_14_0= ruleBinding )
            	    // InternalRules.g:430:5: lv_bindings_14_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_bindings_14_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bindings",
            	    						lv_bindings_14_0,
            	    						"org.mondo.collaboration.policy.Rules.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalRules.g:451:3: (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:452:4: otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority'
                    {
                    otherlv_16=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getWithKeyword_15_0());
                    			
                    // InternalRules.g:456:4: ( (lv_priority_17_0= RULE_INT ) )
                    // InternalRules.g:457:5: (lv_priority_17_0= RULE_INT )
                    {
                    // InternalRules.g:457:5: (lv_priority_17_0= RULE_INT )
                    // InternalRules.g:458:6: lv_priority_17_0= RULE_INT
                    {
                    lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_priority_17_0, grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getRuleAccess().getPriorityKeyword_15_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRole"
    // InternalRules.g:483:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalRules.g:483:45: (iv_ruleRole= ruleRole EOF )
            // InternalRules.g:484:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalRules.g:490:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalRules.g:496:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalRules.g:497:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalRules.g:497:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRules.g:498:3: this_User_0= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getUserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_0=ruleUser();

                    state._fsp--;


                    			current = this_User_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRules.g:507:3: this_Group_1= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    			current = this_Group_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // InternalRules.g:519:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalRules.g:519:45: (iv_ruleUser= ruleUser EOF )
            // InternalRules.g:520:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalRules.g:526:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:532:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRules.g:533:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRules.g:533:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRules.g:534:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalRules.g:538:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:539:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:539:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:540:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleGroup"
    // InternalRules.g:560:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalRules.g:560:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalRules.g:561:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalRules.g:567:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRules.g:573:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalRules.g:574:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalRules.g:574:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalRules.g:575:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalRules.g:579:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:580:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:580:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:581:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRules.g:601:3: ( (otherlv_3= RULE_ID ) )
            // InternalRules.g:602:4: (otherlv_3= RULE_ID )
            {
            // InternalRules.g:602:4: (otherlv_3= RULE_ID )
            // InternalRules.g:603:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0());
            				

            }


            }

            // InternalRules.g:614:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:615:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRules.g:619:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalRules.g:620:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalRules.g:620:5: (otherlv_5= RULE_ID )
            	    // InternalRules.g:621:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAsset"
    // InternalRules.g:641:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalRules.g:641:46: (iv_ruleAsset= ruleAsset EOF )
            // InternalRules.g:642:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalRules.g:648:1: ruleAsset returns [EObject current=null] : (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectFact_0 = null;

        EObject this_ReferenceFact_1 = null;



        	enterRule();

        try {
            // InternalRules.g:654:2: ( (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact ) )
            // InternalRules.g:655:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact )
            {
            // InternalRules.g:655:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRules.g:656:3: this_ObjectFact_0= ruleObjectFact
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getObjectFactParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectFact_0=ruleObjectFact();

                    state._fsp--;


                    			current = this_ObjectFact_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRules.g:665:3: this_ReferenceFact_1= ruleReferenceFact
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceFact_1=ruleReferenceFact();

                    state._fsp--;


                    			current = this_ReferenceFact_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleObjectFact"
    // InternalRules.g:677:1: entryRuleObjectFact returns [EObject current=null] : iv_ruleObjectFact= ruleObjectFact EOF ;
    public final EObject entryRuleObjectFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectFact = null;


        try {
            // InternalRules.g:677:51: (iv_ruleObjectFact= ruleObjectFact EOF )
            // InternalRules.g:678:2: iv_ruleObjectFact= ruleObjectFact EOF
            {
             newCompositeNode(grammarAccess.getObjectFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectFact=ruleObjectFact();

            state._fsp--;

             current =iv_ruleObjectFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectFact"


    // $ANTLR start "ruleObjectFact"
    // InternalRules.g:684:1: ruleObjectFact returns [EObject current=null] : (otherlv_0= 'obj(' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= ')' ) ;
    public final EObject ruleObjectFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_parameter_1_0 = null;



        	enterRule();

        try {
            // InternalRules.g:690:2: ( (otherlv_0= 'obj(' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= ')' ) )
            // InternalRules.g:691:2: (otherlv_0= 'obj(' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= ')' )
            {
            // InternalRules.g:691:2: (otherlv_0= 'obj(' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= ')' )
            // InternalRules.g:692:3: otherlv_0= 'obj(' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectFactAccess().getObjKeyword_0());
            		
            // InternalRules.g:696:3: ( (lv_parameter_1_0= ruleParameter ) )
            // InternalRules.g:697:4: (lv_parameter_1_0= ruleParameter )
            {
            // InternalRules.g:697:4: (lv_parameter_1_0= ruleParameter )
            // InternalRules.g:698:5: lv_parameter_1_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getObjectFactAccess().getParameterParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_parameter_1_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectFactRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_1_0,
            						"org.mondo.collaboration.policy.Rules.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectFact"


    // $ANTLR start "entryRuleReferenceFact"
    // InternalRules.g:723:1: entryRuleReferenceFact returns [EObject current=null] : iv_ruleReferenceFact= ruleReferenceFact EOF ;
    public final EObject entryRuleReferenceFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFact = null;


        try {
            // InternalRules.g:723:54: (iv_ruleReferenceFact= ruleReferenceFact EOF )
            // InternalRules.g:724:2: iv_ruleReferenceFact= ruleReferenceFact EOF
            {
             newCompositeNode(grammarAccess.getReferenceFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceFact=ruleReferenceFact();

            state._fsp--;

             current =iv_ruleReferenceFact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceFact"


    // $ANTLR start "ruleReferenceFact"
    // InternalRules.g:730:1: ruleReferenceFact returns [EObject current=null] : (otherlv_0= 'ref(' ( (lv_sourceParam_1_0= ruleParameter ) ) otherlv_2= '->' otherlv_3= '->' ( (lv_targetParam_4_0= ruleParameter ) ) otherlv_5= ')' ) ;
    public final EObject ruleReferenceFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sourceParam_1_0 = null;

        EObject lv_targetParam_4_0 = null;



        	enterRule();

        try {
            // InternalRules.g:736:2: ( (otherlv_0= 'ref(' ( (lv_sourceParam_1_0= ruleParameter ) ) otherlv_2= '->' otherlv_3= '->' ( (lv_targetParam_4_0= ruleParameter ) ) otherlv_5= ')' ) )
            // InternalRules.g:737:2: (otherlv_0= 'ref(' ( (lv_sourceParam_1_0= ruleParameter ) ) otherlv_2= '->' otherlv_3= '->' ( (lv_targetParam_4_0= ruleParameter ) ) otherlv_5= ')' )
            {
            // InternalRules.g:737:2: (otherlv_0= 'ref(' ( (lv_sourceParam_1_0= ruleParameter ) ) otherlv_2= '->' otherlv_3= '->' ( (lv_targetParam_4_0= ruleParameter ) ) otherlv_5= ')' )
            // InternalRules.g:738:3: otherlv_0= 'ref(' ( (lv_sourceParam_1_0= ruleParameter ) ) otherlv_2= '->' otherlv_3= '->' ( (lv_targetParam_4_0= ruleParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceFactAccess().getRefKeyword_0());
            		
            // InternalRules.g:742:3: ( (lv_sourceParam_1_0= ruleParameter ) )
            // InternalRules.g:743:4: (lv_sourceParam_1_0= ruleParameter )
            {
            // InternalRules.g:743:4: (lv_sourceParam_1_0= ruleParameter )
            // InternalRules.g:744:5: lv_sourceParam_1_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getReferenceFactAccess().getSourceParamParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_sourceParam_1_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceFactRule());
            					}
            					set(
            						current,
            						"sourceParam",
            						lv_sourceParam_1_0,
            						"org.mondo.collaboration.policy.Rules.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalRules.g:769:3: ( (lv_targetParam_4_0= ruleParameter ) )
            // InternalRules.g:770:4: (lv_targetParam_4_0= ruleParameter )
            {
            // InternalRules.g:770:4: (lv_targetParam_4_0= ruleParameter )
            // InternalRules.g:771:5: lv_targetParam_4_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getReferenceFactAccess().getTargetParamParameterParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_targetParam_4_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceFactRule());
            					}
            					set(
            						current,
            						"targetParam",
            						lv_targetParam_4_0,
            						"org.mondo.collaboration.policy.Rules.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceFact"


    // $ANTLR start "entryRuleQuery"
    // InternalRules.g:796:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalRules.g:796:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalRules.g:797:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalRules.g:803:1: ruleQuery returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRules.g:809:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalRules.g:810:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalRules.g:810:2: ( (otherlv_0= RULE_STRING ) )
            // InternalRules.g:811:3: (otherlv_0= RULE_STRING )
            {
            // InternalRules.g:811:3: (otherlv_0= RULE_STRING )
            // InternalRules.g:812:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQueryRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getPatternPatternCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleBinding"
    // InternalRules.g:826:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalRules.g:826:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalRules.g:827:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalRules.g:833:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'where' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_parameter_1_0 = null;

        EObject lv_bind_4_0 = null;



        	enterRule();

        try {
            // InternalRules.g:839:2: ( (otherlv_0= 'where' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) ) )
            // InternalRules.g:840:2: (otherlv_0= 'where' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) )
            {
            // InternalRules.g:840:2: (otherlv_0= 'where' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) )
            // InternalRules.g:841:3: otherlv_0= 'where' ( (lv_parameter_1_0= ruleParameter ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getWhereKeyword_0());
            		
            // InternalRules.g:845:3: ( (lv_parameter_1_0= ruleParameter ) )
            // InternalRules.g:846:4: (lv_parameter_1_0= ruleParameter )
            {
            // InternalRules.g:846:4: (lv_parameter_1_0= ruleParameter )
            // InternalRules.g:847:5: lv_parameter_1_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getParameterParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_parameter_1_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_1_0,
            						"org.mondo.collaboration.policy.Rules.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getBoundKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getToKeyword_3());
            		
            // InternalRules.g:872:3: ( (lv_bind_4_0= ruleBind ) )
            // InternalRules.g:873:4: (lv_bind_4_0= ruleBind )
            {
            // InternalRules.g:873:4: (lv_bind_4_0= ruleBind )
            // InternalRules.g:874:5: lv_bind_4_0= ruleBind
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getBindBindParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_bind_4_0=ruleBind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"bind",
            						lv_bind_4_0,
            						"org.mondo.collaboration.policy.Rules.Bind");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleParameter"
    // InternalRules.g:895:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRules.g:895:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRules.g:896:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRules.g:902:1: ruleParameter returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRules.g:908:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRules.g:909:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRules.g:909:2: ( (otherlv_0= RULE_ID ) )
            // InternalRules.g:910:3: (otherlv_0= RULE_ID )
            {
            // InternalRules.g:910:3: (otherlv_0= RULE_ID )
            // InternalRules.g:911:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getVariableVariableCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBind"
    // InternalRules.g:925:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalRules.g:925:45: (iv_ruleBind= ruleBind EOF )
            // InternalRules.g:926:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalRules.g:932:1: ruleBind returns [EObject current=null] : this_ObjectBind_0= ruleObjectBind ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectBind_0 = null;



        	enterRule();

        try {
            // InternalRules.g:938:2: (this_ObjectBind_0= ruleObjectBind )
            // InternalRules.g:939:2: this_ObjectBind_0= ruleObjectBind
            {

            		newCompositeNode(grammarAccess.getBindAccess().getObjectBindParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ObjectBind_0=ruleObjectBind();

            state._fsp--;


            		current = this_ObjectBind_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleObjectBind"
    // InternalRules.g:950:1: entryRuleObjectBind returns [EObject current=null] : iv_ruleObjectBind= ruleObjectBind EOF ;
    public final EObject entryRuleObjectBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectBind = null;


        try {
            // InternalRules.g:950:51: (iv_ruleObjectBind= ruleObjectBind EOF )
            // InternalRules.g:951:2: iv_ruleObjectBind= ruleObjectBind EOF
            {
             newCompositeNode(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectBind=ruleObjectBind();

            state._fsp--;

             current =iv_ruleObjectBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectBind"


    // $ANTLR start "ruleObjectBind"
    // InternalRules.g:957:1: ruleObjectBind returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleObjectBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRules.g:963:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRules.g:964:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRules.g:964:2: ( (otherlv_0= RULE_ID ) )
            // InternalRules.g:965:3: (otherlv_0= RULE_ID )
            {
            // InternalRules.g:965:3: (otherlv_0= RULE_ID )
            // InternalRules.g:966:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getObjectBindRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectBind"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:980:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:986:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) ) )
            // InternalRules.g:987:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) )
            {
            // InternalRules.g:987:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRules.g:988:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalRules.g:988:3: (enumLiteral_0= 'allow' )
                    // InternalRules.g:989:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:996:3: (enumLiteral_1= 'deny' )
                    {
                    // InternalRules.g:996:3: (enumLiteral_1= 'deny' )
                    // InternalRules.g:997:4: enumLiteral_1= 'deny'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalRules.g:1007:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRules.g:1013:2: ( ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) ) )
            // InternalRules.g:1014:2: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) )
            {
            // InternalRules.g:1014:2: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRules.g:1015:3: (enumLiteral_0= 'R' )
                    {
                    // InternalRules.g:1015:3: (enumLiteral_0= 'R' )
                    // InternalRules.g:1016:4: enumLiteral_0= 'R'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1023:3: (enumLiteral_1= 'W' )
                    {
                    // InternalRules.g:1023:3: (enumLiteral_1= 'W' )
                    // InternalRules.g:1024:4: enumLiteral_1= 'W'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1031:3: (enumLiteral_2= 'RW' )
                    {
                    // InternalRules.g:1031:3: (enumLiteral_2= 'RW' )
                    // InternalRules.g:1032:4: enumLiteral_2= 'RW'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleResolutionType"
    // InternalRules.g:1042:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:1048:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalRules.g:1049:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalRules.g:1049:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRules.g:1050:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalRules.g:1050:3: (enumLiteral_0= 'restrictive' )
                    // InternalRules.g:1051:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1058:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalRules.g:1058:3: (enumLiteral_1= 'permissive' )
                    // InternalRules.g:1059:4: enumLiteral_1= 'permissive'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResolutionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});

}