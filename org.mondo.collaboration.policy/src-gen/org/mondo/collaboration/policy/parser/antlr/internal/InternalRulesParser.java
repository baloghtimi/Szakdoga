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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "','", "'from'", "'query'", "'select'", "'priority'", "'user'", "'group'", "'obj('", "')'", "'ref('", "'->'", "':'", "'attr('", "'where'", "'bound'", "'object'", "'value'", "'STRING'", "'INT'", "'allow'", "'deny'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalRules.g:270:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleAsset ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_priority_17_0=null;
        Token otherlv_18=null;
        Enumerator lv_access_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_asset_13_0 = null;

        EObject lv_bindings_14_0 = null;



        	enterRule();

        try {
            // InternalRules.g:276:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleAsset ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) )
            // InternalRules.g:277:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleAsset ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            {
            // InternalRules.g:277:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleAsset ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            // InternalRules.g:278:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleAsset ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
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

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getFromKeyword_8());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getQueryKeyword_9());
            		
            // InternalRules.g:386:3: ( (otherlv_11= RULE_STRING ) )
            // InternalRules.g:387:4: (otherlv_11= RULE_STRING )
            {
            // InternalRules.g:387:4: (otherlv_11= RULE_STRING )
            // InternalRules.g:388:5: otherlv_11= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0());
            				

            }


            }

            otherlv_12=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getSelectKeyword_11());
            		
            // InternalRules.g:403:3: ( (lv_asset_13_0= ruleAsset ) )
            // InternalRules.g:404:4: (lv_asset_13_0= ruleAsset )
            {
            // InternalRules.g:404:4: (lv_asset_13_0= ruleAsset )
            // InternalRules.g:405:5: lv_asset_13_0= ruleAsset
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_asset_13_0=ruleAsset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"asset",
            						lv_asset_13_0,
            						"org.mondo.collaboration.policy.Rules.Asset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRules.g:422:3: ( (lv_bindings_14_0= ruleBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRules.g:423:4: (lv_bindings_14_0= ruleBinding )
            	    {
            	    // InternalRules.g:423:4: (lv_bindings_14_0= ruleBinding )
            	    // InternalRules.g:424:5: lv_bindings_14_0= ruleBinding
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
            		
            // InternalRules.g:445:3: (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:446:4: otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority'
                    {
                    otherlv_16=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getWithKeyword_15_0());
                    			
                    // InternalRules.g:450:4: ( (lv_priority_17_0= RULE_INT ) )
                    // InternalRules.g:451:5: (lv_priority_17_0= RULE_INT )
                    {
                    // InternalRules.g:451:5: (lv_priority_17_0= RULE_INT )
                    // InternalRules.g:452:6: lv_priority_17_0= RULE_INT
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
    // InternalRules.g:477:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalRules.g:477:45: (iv_ruleRole= ruleRole EOF )
            // InternalRules.g:478:2: iv_ruleRole= ruleRole EOF
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
    // InternalRules.g:484:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalRules.g:490:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalRules.g:491:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalRules.g:491:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
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
                    // InternalRules.g:492:3: this_User_0= ruleUser
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
                    // InternalRules.g:501:3: this_Group_1= ruleGroup
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
    // InternalRules.g:513:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalRules.g:513:45: (iv_ruleUser= ruleUser EOF )
            // InternalRules.g:514:2: iv_ruleUser= ruleUser EOF
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
    // InternalRules.g:520:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:526:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRules.g:527:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRules.g:527:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRules.g:528:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalRules.g:532:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:533:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:533:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:534:5: lv_name_1_0= RULE_ID
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
    // InternalRules.g:554:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalRules.g:554:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalRules.g:555:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalRules.g:561:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
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
            // InternalRules.g:567:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalRules.g:568:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalRules.g:568:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalRules.g:569:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalRules.g:573:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:574:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:574:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:575:5: lv_name_1_0= RULE_ID
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
            		
            // InternalRules.g:595:3: ( (otherlv_3= RULE_ID ) )
            // InternalRules.g:596:4: (otherlv_3= RULE_ID )
            {
            // InternalRules.g:596:4: (otherlv_3= RULE_ID )
            // InternalRules.g:597:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0());
            				

            }


            }

            // InternalRules.g:608:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:609:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRules.g:613:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalRules.g:614:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalRules.g:614:5: (otherlv_5= RULE_ID )
            	    // InternalRules.g:615:6: otherlv_5= RULE_ID
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
    // InternalRules.g:635:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalRules.g:635:46: (iv_ruleAsset= ruleAsset EOF )
            // InternalRules.g:636:2: iv_ruleAsset= ruleAsset EOF
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
    // InternalRules.g:642:1: ruleAsset returns [EObject current=null] : (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectFact_0 = null;

        EObject this_ReferenceFact_1 = null;

        EObject this_AttributeFact_2 = null;



        	enterRule();

        try {
            // InternalRules.g:648:2: ( (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) )
            // InternalRules.g:649:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            {
            // InternalRules.g:649:2: (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRules.g:650:3: this_ObjectFact_0= ruleObjectFact
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
                    // InternalRules.g:659:3: this_ReferenceFact_1= ruleReferenceFact
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceFact_1=ruleReferenceFact();

                    state._fsp--;


                    			current = this_ReferenceFact_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRules.g:668:3: this_AttributeFact_2= ruleAttributeFact
                    {

                    			newCompositeNode(grammarAccess.getAssetAccess().getAttributeFactParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeFact_2=ruleAttributeFact();

                    state._fsp--;


                    			current = this_AttributeFact_2;
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
    // InternalRules.g:680:1: entryRuleObjectFact returns [EObject current=null] : iv_ruleObjectFact= ruleObjectFact EOF ;
    public final EObject entryRuleObjectFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectFact = null;


        try {
            // InternalRules.g:680:51: (iv_ruleObjectFact= ruleObjectFact EOF )
            // InternalRules.g:681:2: iv_ruleObjectFact= ruleObjectFact EOF
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
    // InternalRules.g:687:1: ruleObjectFact returns [EObject current=null] : (otherlv_0= 'obj(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleObjectFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRules.g:693:2: ( (otherlv_0= 'obj(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalRules.g:694:2: (otherlv_0= 'obj(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalRules.g:694:2: (otherlv_0= 'obj(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // InternalRules.g:695:3: otherlv_0= 'obj(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectFactAccess().getObjKeyword_0());
            		
            // InternalRules.g:699:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:700:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:700:4: (otherlv_1= RULE_ID )
            // InternalRules.g:701:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFactRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_1_0());
            				

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
    // InternalRules.g:720:1: entryRuleReferenceFact returns [EObject current=null] : iv_ruleReferenceFact= ruleReferenceFact EOF ;
    public final EObject entryRuleReferenceFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFact = null;


        try {
            // InternalRules.g:720:54: (iv_ruleReferenceFact= ruleReferenceFact EOF )
            // InternalRules.g:721:2: iv_ruleReferenceFact= ruleReferenceFact EOF
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
    // InternalRules.g:727:1: ruleReferenceFact returns [EObject current=null] : (otherlv_0= 'ref(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleReferenceFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRules.g:733:2: ( (otherlv_0= 'ref(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalRules.g:734:2: (otherlv_0= 'ref(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalRules.g:734:2: (otherlv_0= 'ref(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalRules.g:735:3: otherlv_0= 'ref(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceFactAccess().getRefKeyword_0());
            		
            // InternalRules.g:739:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:740:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:740:4: (otherlv_1= RULE_ID )
            // InternalRules.g:741:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalRules.g:756:3: ( (otherlv_3= RULE_ID ) )
            // InternalRules.g:757:4: (otherlv_3= RULE_ID )
            {
            // InternalRules.g:757:4: (otherlv_3= RULE_ID )
            // InternalRules.g:758:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceFactAccess().getColonKeyword_4());
            		
            // InternalRules.g:773:3: ( (otherlv_5= RULE_ID ) )
            // InternalRules.g:774:4: (otherlv_5= RULE_ID )
            {
            // InternalRules.g:774:4: (otherlv_5= RULE_ID )
            // InternalRules.g:775:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_5, grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "entryRuleAttributeFact"
    // InternalRules.g:794:1: entryRuleAttributeFact returns [EObject current=null] : iv_ruleAttributeFact= ruleAttributeFact EOF ;
    public final EObject entryRuleAttributeFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFact = null;


        try {
            // InternalRules.g:794:54: (iv_ruleAttributeFact= ruleAttributeFact EOF )
            // InternalRules.g:795:2: iv_ruleAttributeFact= ruleAttributeFact EOF
            {
             newCompositeNode(grammarAccess.getAttributeFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeFact=ruleAttributeFact();

            state._fsp--;

             current =iv_ruleAttributeFact; 
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
    // $ANTLR end "entryRuleAttributeFact"


    // $ANTLR start "ruleAttributeFact"
    // InternalRules.g:801:1: ruleAttributeFact returns [EObject current=null] : (otherlv_0= 'attr(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleAttributeFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRules.g:807:2: ( (otherlv_0= 'attr(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalRules.g:808:2: (otherlv_0= 'attr(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalRules.g:808:2: (otherlv_0= 'attr(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // InternalRules.g:809:3: otherlv_0= 'attr(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeFactAccess().getAttrKeyword_0());
            		
            // InternalRules.g:813:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:814:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:814:4: (otherlv_1= RULE_ID )
            // InternalRules.g:815:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleAttributeFact"


    // $ANTLR start "entryRuleBinding"
    // InternalRules.g:834:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalRules.g:834:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalRules.g:835:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalRules.g:841:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_bind_4_0 = null;



        	enterRule();

        try {
            // InternalRules.g:847:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) ) )
            // InternalRules.g:848:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) )
            {
            // InternalRules.g:848:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) ) )
            // InternalRules.g:849:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'bound' otherlv_3= 'to' ( (lv_bind_4_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getWhereKeyword_0());
            		
            // InternalRules.g:853:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:854:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:854:4: (otherlv_1= RULE_ID )
            // InternalRules.g:855:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getBoundKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getToKeyword_3());
            		
            // InternalRules.g:874:3: ( (lv_bind_4_0= ruleBind ) )
            // InternalRules.g:875:4: (lv_bind_4_0= ruleBind )
            {
            // InternalRules.g:875:4: (lv_bind_4_0= ruleBind )
            // InternalRules.g:876:5: lv_bind_4_0= ruleBind
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


    // $ANTLR start "entryRuleBind"
    // InternalRules.g:897:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalRules.g:897:45: (iv_ruleBind= ruleBind EOF )
            // InternalRules.g:898:2: iv_ruleBind= ruleBind EOF
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
    // InternalRules.g:904:1: ruleBind returns [EObject current=null] : (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectBind_0 = null;

        EObject this_ValueBind_1 = null;



        	enterRule();

        try {
            // InternalRules.g:910:2: ( (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind ) )
            // InternalRules.g:911:2: (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind )
            {
            // InternalRules.g:911:2: (this_ObjectBind_0= ruleObjectBind | this_ValueBind_1= ruleValueBind )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRules.g:912:3: this_ObjectBind_0= ruleObjectBind
                    {

                    			newCompositeNode(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectBind_0=ruleObjectBind();

                    state._fsp--;


                    			current = this_ObjectBind_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRules.g:921:3: this_ValueBind_1= ruleValueBind
                    {

                    			newCompositeNode(grammarAccess.getBindAccess().getValueBindParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueBind_1=ruleValueBind();

                    state._fsp--;


                    			current = this_ValueBind_1;
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
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleObjectBind"
    // InternalRules.g:933:1: entryRuleObjectBind returns [EObject current=null] : iv_ruleObjectBind= ruleObjectBind EOF ;
    public final EObject entryRuleObjectBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectBind = null;


        try {
            // InternalRules.g:933:51: (iv_ruleObjectBind= ruleObjectBind EOF )
            // InternalRules.g:934:2: iv_ruleObjectBind= ruleObjectBind EOF
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
    // InternalRules.g:940:1: ruleObjectBind returns [EObject current=null] : (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleObjectBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRules.g:946:2: ( (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRules.g:947:2: (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRules.g:947:2: (otherlv_0= 'object' ( (otherlv_1= RULE_ID ) ) )
            // InternalRules.g:948:3: otherlv_0= 'object' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectBindAccess().getObjectKeyword_0());
            		
            // InternalRules.g:952:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:953:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:953:4: (otherlv_1= RULE_ID )
            // InternalRules.g:954:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectBindRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0());
            				

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
    // $ANTLR end "ruleObjectBind"


    // $ANTLR start "entryRuleValueBind"
    // InternalRules.g:969:1: entryRuleValueBind returns [EObject current=null] : iv_ruleValueBind= ruleValueBind EOF ;
    public final EObject entryRuleValueBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueBind = null;


        try {
            // InternalRules.g:969:50: (iv_ruleValueBind= ruleValueBind EOF )
            // InternalRules.g:970:2: iv_ruleValueBind= ruleValueBind EOF
            {
             newCompositeNode(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueBind=ruleValueBind();

            state._fsp--;

             current =iv_ruleValueBind; 
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
    // $ANTLR end "entryRuleValueBind"


    // $ANTLR start "ruleValueBind"
    // InternalRules.g:976:1: ruleValueBind returns [EObject current=null] : (otherlv_0= 'value' ( (lv_value_1_0= ruleValueType ) ) ) ;
    public final EObject ruleValueBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalRules.g:982:2: ( (otherlv_0= 'value' ( (lv_value_1_0= ruleValueType ) ) ) )
            // InternalRules.g:983:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleValueType ) ) )
            {
            // InternalRules.g:983:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleValueType ) ) )
            // InternalRules.g:984:3: otherlv_0= 'value' ( (lv_value_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getValueBindAccess().getValueKeyword_0());
            		
            // InternalRules.g:988:3: ( (lv_value_1_0= ruleValueType ) )
            // InternalRules.g:989:4: (lv_value_1_0= ruleValueType )
            {
            // InternalRules.g:989:4: (lv_value_1_0= ruleValueType )
            // InternalRules.g:990:5: lv_value_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getValueBindAccess().getValueValueTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueBindRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.mondo.collaboration.policy.Rules.ValueType");
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
    // $ANTLR end "ruleValueBind"


    // $ANTLR start "ruleValueType"
    // InternalRules.g:1011:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INT' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:1017:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INT' ) ) )
            // InternalRules.g:1018:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INT' ) )
            {
            // InternalRules.g:1018:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INT' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:1019:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalRules.g:1019:3: (enumLiteral_0= 'STRING' )
                    // InternalRules.g:1020:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1027:3: (enumLiteral_1= 'INT' )
                    {
                    // InternalRules.g:1027:3: (enumLiteral_1= 'INT' )
                    // InternalRules.g:1028:4: enumLiteral_1= 'INT'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:1038:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:1044:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) ) )
            // InternalRules.g:1045:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) )
            {
            // InternalRules.g:1045:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRules.g:1046:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalRules.g:1046:3: (enumLiteral_0= 'allow' )
                    // InternalRules.g:1047:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1054:3: (enumLiteral_1= 'deny' )
                    {
                    // InternalRules.g:1054:3: (enumLiteral_1= 'deny' )
                    // InternalRules.g:1055:4: enumLiteral_1= 'deny'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

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
    // InternalRules.g:1065:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRules.g:1071:2: ( ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) ) )
            // InternalRules.g:1072:2: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) )
            {
            // InternalRules.g:1072:2: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'W' ) | (enumLiteral_2= 'RW' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 42:
                {
                alt12=2;
                }
                break;
            case 43:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRules.g:1073:3: (enumLiteral_0= 'R' )
                    {
                    // InternalRules.g:1073:3: (enumLiteral_0= 'R' )
                    // InternalRules.g:1074:4: enumLiteral_0= 'R'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1081:3: (enumLiteral_1= 'W' )
                    {
                    // InternalRules.g:1081:3: (enumLiteral_1= 'W' )
                    // InternalRules.g:1082:4: enumLiteral_1= 'W'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1089:3: (enumLiteral_2= 'RW' )
                    {
                    // InternalRules.g:1089:3: (enumLiteral_2= 'RW' )
                    // InternalRules.g:1090:4: enumLiteral_2= 'RW'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    // InternalRules.g:1100:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:1106:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalRules.g:1107:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalRules.g:1107:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRules.g:1108:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalRules.g:1108:3: (enumLiteral_0= 'restrictive' )
                    // InternalRules.g:1109:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1116:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalRules.g:1116:3: (enumLiteral_1= 'permissive' )
                    // InternalRules.g:1117:4: enumLiteral_1= 'permissive'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000128000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000000L});

}