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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'user'", "'group'", "'{'", "','", "'}'", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'to'", "'from'", "'query'", "'select'", "'priority'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'", "'allow'", "'deny'", "'obfuscate'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'"
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

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
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


    // $ANTLR start "entryRuleRole"
    // InternalRules.g:122:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalRules.g:122:45: (iv_ruleRole= ruleRole EOF )
            // InternalRules.g:123:2: iv_ruleRole= ruleRole EOF
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
    // InternalRules.g:129:1: ruleRole returns [EObject current=null] : (this_User_0= ruleUser | this_Group_1= ruleGroup ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Group_1 = null;



        	enterRule();

        try {
            // InternalRules.g:135:2: ( (this_User_0= ruleUser | this_Group_1= ruleGroup ) )
            // InternalRules.g:136:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            {
            // InternalRules.g:136:2: (this_User_0= ruleUser | this_Group_1= ruleGroup )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRules.g:137:3: this_User_0= ruleUser
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
                    // InternalRules.g:146:3: this_Group_1= ruleGroup
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
    // InternalRules.g:158:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalRules.g:158:45: (iv_ruleUser= ruleUser EOF )
            // InternalRules.g:159:2: iv_ruleUser= ruleUser EOF
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
    // InternalRules.g:165:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:171:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRules.g:172:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRules.g:172:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRules.g:173:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalRules.g:177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:178:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:179:5: lv_name_1_0= RULE_ID
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
    // InternalRules.g:199:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalRules.g:199:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalRules.g:200:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalRules.g:206:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) ;
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
            // InternalRules.g:212:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' ) )
            // InternalRules.g:213:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // InternalRules.g:213:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}' )
            // InternalRules.g:214:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalRules.g:218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:219:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRules.g:240:3: ( (otherlv_3= RULE_ID ) )
            // InternalRules.g:241:4: (otherlv_3= RULE_ID )
            {
            // InternalRules.g:241:4: (otherlv_3= RULE_ID )
            // InternalRules.g:242:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0());
            				

            }


            }

            // InternalRules.g:253:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRules.g:254:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRules.g:258:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalRules.g:259:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalRules.g:259:5: (otherlv_5= RULE_ID )
            	    // InternalRules.g:260:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRulePolicy"
    // InternalRules.g:280:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalRules.g:280:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalRules.g:281:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalRules.g:287:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' ) ;
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
            // InternalRules.g:293:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' ) )
            // InternalRules.g:294:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' )
            {
            // InternalRules.g:294:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution' )
            // InternalRules.g:295:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) ) otherlv_4= 'by' otherlv_5= 'default' otherlv_6= '{' ( (lv_rules_7_0= ruleRule ) )* otherlv_8= '}' otherlv_9= 'with' ( (lv_resolution_10_0= ruleResolutionType ) ) otherlv_11= 'resolution'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalRules.g:299:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:300:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:300:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:301:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalRules.g:317:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalRules.g:318:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalRules.g:318:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalRules.g:319:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalRules.g:336:3: ( (lv_operation_3_0= ruleOperationType ) )
            // InternalRules.g:337:4: (lv_operation_3_0= ruleOperationType )
            {
            // InternalRules.g:337:4: (lv_operation_3_0= ruleOperationType )
            // InternalRules.g:338:5: lv_operation_3_0= ruleOperationType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getByKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getDefaultKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalRules.g:367:3: ( (lv_rules_7_0= ruleRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRules.g:368:4: (lv_rules_7_0= ruleRule )
            	    {
            	    // InternalRules.g:368:4: (lv_rules_7_0= ruleRule )
            	    // InternalRules.g:369:5: lv_rules_7_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getWithKeyword_9());
            		
            // InternalRules.g:394:3: ( (lv_resolution_10_0= ruleResolutionType ) )
            // InternalRules.g:395:4: (lv_resolution_10_0= ruleResolutionType )
            {
            // InternalRules.g:395:4: (lv_resolution_10_0= ruleResolutionType )
            // InternalRules.g:396:5: lv_resolution_10_0= ruleResolutionType
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

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
    // InternalRules.g:421:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRules.g:421:45: (iv_ruleRule= ruleRule EOF )
            // InternalRules.g:422:2: iv_ruleRule= ruleRule EOF
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
    // InternalRules.g:428:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) ;
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
            // InternalRules.g:434:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? ) )
            // InternalRules.g:435:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            {
            // InternalRules.g:435:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )? )
            // InternalRules.g:436:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( (lv_access_2_0= ruleAccessibilityLevel ) ) ( (lv_operation_3_0= ruleOperationType ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '{' otherlv_9= 'from' otherlv_10= 'query' ( (otherlv_11= RULE_STRING ) ) otherlv_12= 'select' ( (lv_asset_13_0= ruleModelFact ) ) ( (lv_bindings_14_0= ruleBinding ) )* otherlv_15= '}' (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalRules.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRules.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRules.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalRules.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalRules.g:458:3: ( (lv_access_2_0= ruleAccessibilityLevel ) )
            // InternalRules.g:459:4: (lv_access_2_0= ruleAccessibilityLevel )
            {
            // InternalRules.g:459:4: (lv_access_2_0= ruleAccessibilityLevel )
            // InternalRules.g:460:5: lv_access_2_0= ruleAccessibilityLevel
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalRules.g:477:3: ( (lv_operation_3_0= ruleOperationType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=40 && LA5_0<=43)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:478:4: (lv_operation_3_0= ruleOperationType )
                    {
                    // InternalRules.g:478:4: (lv_operation_3_0= ruleOperationType )
                    // InternalRules.g:479:5: lv_operation_3_0= ruleOperationType
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
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
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getToKeyword_4());
            		
            // InternalRules.g:500:3: ( (otherlv_5= RULE_ID ) )
            // InternalRules.g:501:4: (otherlv_5= RULE_ID )
            {
            // InternalRules.g:501:4: (otherlv_5= RULE_ID )
            // InternalRules.g:502:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0());
            				

            }


            }

            // InternalRules.g:513:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRules.g:514:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRules.g:518:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalRules.g:519:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalRules.g:519:5: (otherlv_7= RULE_ID )
            	    // InternalRules.g:520:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    						newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getFromKeyword_8());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getQueryKeyword_9());
            		
            // InternalRules.g:544:3: ( (otherlv_11= RULE_STRING ) )
            // InternalRules.g:545:4: (otherlv_11= RULE_STRING )
            {
            // InternalRules.g:545:4: (otherlv_11= RULE_STRING )
            // InternalRules.g:546:5: otherlv_11= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0());
            				

            }


            }

            otherlv_12=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getRuleAccess().getSelectKeyword_11());
            		
            // InternalRules.g:561:3: ( (lv_asset_13_0= ruleModelFact ) )
            // InternalRules.g:562:4: (lv_asset_13_0= ruleModelFact )
            {
            // InternalRules.g:562:4: (lv_asset_13_0= ruleModelFact )
            // InternalRules.g:563:5: lv_asset_13_0= ruleModelFact
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_23);
            lv_asset_13_0=ruleModelFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"asset",
            						lv_asset_13_0,
            						"org.mondo.collaboration.policy.Rules.ModelFact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRules.g:580:3: ( (lv_bindings_14_0= ruleBinding ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:581:4: (lv_bindings_14_0= ruleBinding )
            	    {
            	    // InternalRules.g:581:4: (lv_bindings_14_0= ruleBinding )
            	    // InternalRules.g:582:5: lv_bindings_14_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    break loop7;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalRules.g:603:3: (otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRules.g:604:4: otherlv_16= 'with' ( (lv_priority_17_0= RULE_INT ) ) otherlv_18= 'priority'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getWithKeyword_15_0());
                    			
                    // InternalRules.g:608:4: ( (lv_priority_17_0= RULE_INT ) )
                    // InternalRules.g:609:5: (lv_priority_17_0= RULE_INT )
                    {
                    // InternalRules.g:609:5: (lv_priority_17_0= RULE_INT )
                    // InternalRules.g:610:6: lv_priority_17_0= RULE_INT
                    {
                    lv_priority_17_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

                    otherlv_18=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleModelFact"
    // InternalRules.g:635:1: entryRuleModelFact returns [EObject current=null] : iv_ruleModelFact= ruleModelFact EOF ;
    public final EObject entryRuleModelFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFact = null;


        try {
            // InternalRules.g:635:50: (iv_ruleModelFact= ruleModelFact EOF )
            // InternalRules.g:636:2: iv_ruleModelFact= ruleModelFact EOF
            {
             newCompositeNode(grammarAccess.getModelFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFact=ruleModelFact();

            state._fsp--;

             current =iv_ruleModelFact; 
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
    // $ANTLR end "entryRuleModelFact"


    // $ANTLR start "ruleModelFact"
    // InternalRules.g:642:1: ruleModelFact returns [EObject current=null] : (this_ObjectFact_0= ruleObjectFact | this_ReferenceFact_1= ruleReferenceFact | this_AttributeFact_2= ruleAttributeFact ) ;
    public final EObject ruleModelFact() throws RecognitionException {
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
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRules.g:650:3: this_ObjectFact_0= ruleObjectFact
                    {

                    			newCompositeNode(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0());
                    		
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

                    			newCompositeNode(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1());
                    		
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

                    			newCompositeNode(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2());
                    		
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
    // $ANTLR end "ruleModelFact"


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
    // InternalRules.g:687:1: ruleObjectFact returns [EObject current=null] : (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRules.g:693:2: ( (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRules.g:694:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRules.g:694:2: (otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRules.g:695:3: otherlv_0= 'obj' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectFactAccess().getObjKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRules.g:703:3: ( (otherlv_2= RULE_ID ) )
            // InternalRules.g:704:4: (otherlv_2= RULE_ID )
            {
            // InternalRules.g:704:4: (otherlv_2= RULE_ID )
            // InternalRules.g:705:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalRules.g:724:1: entryRuleReferenceFact returns [EObject current=null] : iv_ruleReferenceFact= ruleReferenceFact EOF ;
    public final EObject entryRuleReferenceFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFact = null;


        try {
            // InternalRules.g:724:54: (iv_ruleReferenceFact= ruleReferenceFact EOF )
            // InternalRules.g:725:2: iv_ruleReferenceFact= ruleReferenceFact EOF
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
    // InternalRules.g:731:1: ruleReferenceFact returns [EObject current=null] : (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleReferenceFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRules.g:737:2: ( (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalRules.g:738:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalRules.g:738:2: (otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalRules.g:739:3: otherlv_0= 'ref' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceFactAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRules.g:747:3: ( (otherlv_2= RULE_ID ) )
            // InternalRules.g:748:4: (otherlv_2= RULE_ID )
            {
            // InternalRules.g:748:4: (otherlv_2= RULE_ID )
            // InternalRules.g:749:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_2, grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalRules.g:764:3: ( (otherlv_4= RULE_ID ) )
            // InternalRules.g:765:4: (otherlv_4= RULE_ID )
            {
            // InternalRules.g:765:4: (otherlv_4= RULE_ID )
            // InternalRules.g:766:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_4, grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceFactAccess().getColonKeyword_5());
            		
            // InternalRules.g:781:3: ( (otherlv_6= RULE_ID ) )
            // InternalRules.g:782:4: (otherlv_6= RULE_ID )
            {
            // InternalRules.g:782:4: (otherlv_6= RULE_ID )
            // InternalRules.g:783:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceFactRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_6, grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalRules.g:802:1: entryRuleAttributeFact returns [EObject current=null] : iv_ruleAttributeFact= ruleAttributeFact EOF ;
    public final EObject entryRuleAttributeFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFact = null;


        try {
            // InternalRules.g:802:54: (iv_ruleAttributeFact= ruleAttributeFact EOF )
            // InternalRules.g:803:2: iv_ruleAttributeFact= ruleAttributeFact EOF
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
    // InternalRules.g:809:1: ruleAttributeFact returns [EObject current=null] : (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleAttributeFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRules.g:815:2: ( (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalRules.g:816:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalRules.g:816:2: (otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalRules.g:817:3: otherlv_0= 'attr' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeFactAccess().getAttrKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRules.g:825:3: ( (otherlv_2= RULE_ID ) )
            // InternalRules.g:826:4: (otherlv_2= RULE_ID )
            {
            // InternalRules.g:826:4: (otherlv_2= RULE_ID )
            // InternalRules.g:827:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeFactAccess().getColonKeyword_3());
            		
            // InternalRules.g:842:3: ( (otherlv_4= RULE_ID ) )
            // InternalRules.g:843:4: (otherlv_4= RULE_ID )
            {
            // InternalRules.g:843:4: (otherlv_4= RULE_ID )
            // InternalRules.g:844:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFactRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_4, grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalRules.g:863:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalRules.g:863:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalRules.g:864:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalRules.g:870:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_bind_5_0 = null;



        	enterRule();

        try {
            // InternalRules.g:876:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) ) )
            // InternalRules.g:877:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            {
            // InternalRules.g:877:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) ) )
            // InternalRules.g:878:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is' otherlv_3= 'bound' otherlv_4= 'to' ( (lv_bind_5_0= ruleBind ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getWhereKeyword_0());
            		
            // InternalRules.g:882:3: ( (otherlv_1= RULE_ID ) )
            // InternalRules.g:883:4: (otherlv_1= RULE_ID )
            {
            // InternalRules.g:883:4: (otherlv_1= RULE_ID )
            // InternalRules.g:884:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getBoundKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getToKeyword_4());
            		
            // InternalRules.g:907:3: ( (lv_bind_5_0= ruleBind ) )
            // InternalRules.g:908:4: (lv_bind_5_0= ruleBind )
            {
            // InternalRules.g:908:4: (lv_bind_5_0= ruleBind )
            // InternalRules.g:909:5: lv_bind_5_0= ruleBind
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_bind_5_0=ruleBind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"bind",
            						lv_bind_5_0,
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
    // InternalRules.g:930:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalRules.g:930:45: (iv_ruleBind= ruleBind EOF )
            // InternalRules.g:931:2: iv_ruleBind= ruleBind EOF
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
    // InternalRules.g:937:1: ruleBind returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token lv_valueInteger_1_0=null;


        	enterRule();

        try {
            // InternalRules.g:943:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) ) )
            // InternalRules.g:944:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            {
            // InternalRules.g:944:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInteger_1_0= RULE_INT ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:945:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalRules.g:945:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalRules.g:946:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalRules.g:946:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalRules.g:947:5: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_valueString_0_0, grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueString",
                    						lv_valueString_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:964:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    {
                    // InternalRules.g:964:3: ( (lv_valueInteger_1_0= RULE_INT ) )
                    // InternalRules.g:965:4: (lv_valueInteger_1_0= RULE_INT )
                    {
                    // InternalRules.g:965:4: (lv_valueInteger_1_0= RULE_INT )
                    // InternalRules.g:966:5: lv_valueInteger_1_0= RULE_INT
                    {
                    lv_valueInteger_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valueInteger_1_0, grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueInteger",
                    						lv_valueInteger_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


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
    // $ANTLR end "ruleBind"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:986:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRules.g:992:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) ) )
            // InternalRules.g:993:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) )
            {
            // InternalRules.g:993:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'deny' ) | (enumLiteral_2= 'obfuscate' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRules.g:994:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalRules.g:994:3: (enumLiteral_0= 'allow' )
                    // InternalRules.g:995:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1002:3: (enumLiteral_1= 'deny' )
                    {
                    // InternalRules.g:1002:3: (enumLiteral_1= 'deny' )
                    // InternalRules.g:1003:4: enumLiteral_1= 'deny'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1010:3: (enumLiteral_2= 'obfuscate' )
                    {
                    // InternalRules.g:1010:3: (enumLiteral_2= 'obfuscate' )
                    // InternalRules.g:1011:4: enumLiteral_2= 'obfuscate'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2());
                    			

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
    // InternalRules.g:1021:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRules.g:1027:2: ( ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) ) )
            // InternalRules.g:1028:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            {
            // InternalRules.g:1028:2: ( (enumLiteral_0= 'unset' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'W' ) | (enumLiteral_3= 'RW' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            case 43:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRules.g:1029:3: (enumLiteral_0= 'unset' )
                    {
                    // InternalRules.g:1029:3: (enumLiteral_0= 'unset' )
                    // InternalRules.g:1030:4: enumLiteral_0= 'unset'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1037:3: (enumLiteral_1= 'R' )
                    {
                    // InternalRules.g:1037:3: (enumLiteral_1= 'R' )
                    // InternalRules.g:1038:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1045:3: (enumLiteral_2= 'W' )
                    {
                    // InternalRules.g:1045:3: (enumLiteral_2= 'W' )
                    // InternalRules.g:1046:4: enumLiteral_2= 'W'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRules.g:1053:3: (enumLiteral_3= 'RW' )
                    {
                    // InternalRules.g:1053:3: (enumLiteral_3= 'RW' )
                    // InternalRules.g:1054:4: enumLiteral_3= 'RW'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3());
                    			

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
    // InternalRules.g:1064:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:1070:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalRules.g:1071:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalRules.g:1071:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
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
                    // InternalRules.g:1072:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalRules.g:1072:3: (enumLiteral_0= 'restrictive' )
                    // InternalRules.g:1073:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1080:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalRules.g:1080:3: (enumLiteral_1= 'permissive' )
                    // InternalRules.g:1081:4: enumLiteral_1= 'permissive'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000F0000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000248000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000060L});

}