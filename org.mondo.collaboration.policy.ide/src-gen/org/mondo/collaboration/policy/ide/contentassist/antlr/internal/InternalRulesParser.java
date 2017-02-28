package org.mondo.collaboration.policy.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'obfuscate'", "'deny'", "'R'", "'RW'", "'ObjectFact'", "'ReferenceFact'", "'AttributeFact'", "'restrictive'", "'permissive'", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "'select'", "'from'", "'query'", "'where'", "'bound'", "'priority'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalRules.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRules.g:54:1: ( ruleModel EOF )
            // InternalRules.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRules.g:62:1: ruleModel : ( ( rule__Model__PolicyAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:66:2: ( ( ( rule__Model__PolicyAssignment ) ) )
            // InternalRules.g:67:2: ( ( rule__Model__PolicyAssignment ) )
            {
            // InternalRules.g:67:2: ( ( rule__Model__PolicyAssignment ) )
            // InternalRules.g:68:3: ( rule__Model__PolicyAssignment )
            {
             before(grammarAccess.getModelAccess().getPolicyAssignment()); 
            // InternalRules.g:69:3: ( rule__Model__PolicyAssignment )
            // InternalRules.g:69:4: rule__Model__PolicyAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__PolicyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPolicyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePolicy"
    // InternalRules.g:78:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalRules.g:79:1: ( rulePolicy EOF )
            // InternalRules.g:80:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalRules.g:87:1: rulePolicy : ( ( rule__Policy__UnorderedGroup ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:91:2: ( ( ( rule__Policy__UnorderedGroup ) ) )
            // InternalRules.g:92:2: ( ( rule__Policy__UnorderedGroup ) )
            {
            // InternalRules.g:92:2: ( ( rule__Policy__UnorderedGroup ) )
            // InternalRules.g:93:3: ( rule__Policy__UnorderedGroup )
            {
             before(grammarAccess.getPolicyAccess().getUnorderedGroup()); 
            // InternalRules.g:94:3: ( rule__Policy__UnorderedGroup )
            // InternalRules.g:94:4: rule__Policy__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Policy__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // InternalRules.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRules.g:104:1: ( ruleRule EOF )
            // InternalRules.g:105:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRules.g:112:1: ruleRule : ( ( rule__Rule__UnorderedGroup ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:116:2: ( ( ( rule__Rule__UnorderedGroup ) ) )
            // InternalRules.g:117:2: ( ( rule__Rule__UnorderedGroup ) )
            {
            // InternalRules.g:117:2: ( ( rule__Rule__UnorderedGroup ) )
            // InternalRules.g:118:3: ( rule__Rule__UnorderedGroup )
            {
             before(grammarAccess.getRuleAccess().getUnorderedGroup()); 
            // InternalRules.g:119:3: ( rule__Rule__UnorderedGroup )
            // InternalRules.g:119:4: rule__Rule__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Rule__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleUser"
    // InternalRules.g:128:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalRules.g:129:1: ( ruleUser EOF )
            // InternalRules.g:130:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalRules.g:137:1: ruleUser : ( ( rule__User__NameAssignment ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:141:2: ( ( ( rule__User__NameAssignment ) ) )
            // InternalRules.g:142:2: ( ( rule__User__NameAssignment ) )
            {
            // InternalRules.g:142:2: ( ( rule__User__NameAssignment ) )
            // InternalRules.g:143:3: ( rule__User__NameAssignment )
            {
             before(grammarAccess.getUserAccess().getNameAssignment()); 
            // InternalRules.g:144:3: ( rule__User__NameAssignment )
            // InternalRules.g:144:4: rule__User__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleQuery"
    // InternalRules.g:153:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalRules.g:154:1: ( ruleQuery EOF )
            // InternalRules.g:155:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalRules.g:162:1: ruleQuery : ( ( rule__Query__NameAssignment ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:166:2: ( ( ( rule__Query__NameAssignment ) ) )
            // InternalRules.g:167:2: ( ( rule__Query__NameAssignment ) )
            {
            // InternalRules.g:167:2: ( ( rule__Query__NameAssignment ) )
            // InternalRules.g:168:3: ( rule__Query__NameAssignment )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment()); 
            // InternalRules.g:169:3: ( rule__Query__NameAssignment )
            // InternalRules.g:169:4: rule__Query__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleValue"
    // InternalRules.g:178:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalRules.g:179:1: ( ruleValue EOF )
            // InternalRules.g:180:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalRules.g:187:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:191:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalRules.g:192:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalRules.g:192:2: ( ( rule__Value__Alternatives ) )
            // InternalRules.g:193:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalRules.g:194:3: ( rule__Value__Alternatives )
            // InternalRules.g:194:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:203:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:207:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:208:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:208:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:209:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:210:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:210:4: rule__AccessibilityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessibilityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalRules.g:219:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:223:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:224:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:224:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:225:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:226:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:226:4: rule__OperationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleAssetType"
    // InternalRules.g:235:1: ruleAssetType : ( ( rule__AssetType__Alternatives ) ) ;
    public final void ruleAssetType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:239:1: ( ( ( rule__AssetType__Alternatives ) ) )
            // InternalRules.g:240:2: ( ( rule__AssetType__Alternatives ) )
            {
            // InternalRules.g:240:2: ( ( rule__AssetType__Alternatives ) )
            // InternalRules.g:241:3: ( rule__AssetType__Alternatives )
            {
             before(grammarAccess.getAssetTypeAccess().getAlternatives()); 
            // InternalRules.g:242:3: ( rule__AssetType__Alternatives )
            // InternalRules.g:242:4: rule__AssetType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssetType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssetTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssetType"


    // $ANTLR start "ruleResolutionType"
    // InternalRules.g:251:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:255:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:256:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:256:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:257:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:258:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:258:4: rule__ResolutionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResolutionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResolutionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResolutionType"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalRules.g:266:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:270:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:271:2: ( RULE_INT )
                    {
                    // InternalRules.g:271:2: ( RULE_INT )
                    // InternalRules.g:272:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:277:2: ( RULE_STRING )
                    {
                    // InternalRules.g:277:2: ( RULE_STRING )
                    // InternalRules.g:278:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalRules.g:287:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'obfuscate' ) ) | ( ( 'deny' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:291:1: ( ( ( 'allow' ) ) | ( ( 'obfuscate' ) ) | ( ( 'deny' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRules.g:292:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:292:2: ( ( 'allow' ) )
                    // InternalRules.g:293:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:294:3: ( 'allow' )
                    // InternalRules.g:294:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:298:2: ( ( 'obfuscate' ) )
                    {
                    // InternalRules.g:298:2: ( ( 'obfuscate' ) )
                    // InternalRules.g:299:3: ( 'obfuscate' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:300:3: ( 'obfuscate' )
                    // InternalRules.g:300:4: 'obfuscate'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:304:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:304:2: ( ( 'deny' ) )
                    // InternalRules.g:305:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2()); 
                    // InternalRules.g:306:3: ( 'deny' )
                    // InternalRules.g:306:4: 'deny'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessibilityLevel__Alternatives"


    // $ANTLR start "rule__OperationType__Alternatives"
    // InternalRules.g:314:1: rule__OperationType__Alternatives : ( ( ( 'R' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:318:1: ( ( ( 'R' ) ) | ( ( 'RW' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRules.g:319:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:319:2: ( ( 'R' ) )
                    // InternalRules.g:320:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalRules.g:321:3: ( 'R' )
                    // InternalRules.g:321:4: 'R'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:325:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:325:2: ( ( 'RW' ) )
                    // InternalRules.g:326:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:327:3: ( 'RW' )
                    // InternalRules.g:327:4: 'RW'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__Alternatives"


    // $ANTLR start "rule__AssetType__Alternatives"
    // InternalRules.g:335:1: rule__AssetType__Alternatives : ( ( ( 'ObjectFact' ) ) | ( ( 'ReferenceFact' ) ) | ( ( 'AttributeFact' ) ) );
    public final void rule__AssetType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:339:1: ( ( ( 'ObjectFact' ) ) | ( ( 'ReferenceFact' ) ) | ( ( 'AttributeFact' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRules.g:340:2: ( ( 'ObjectFact' ) )
                    {
                    // InternalRules.g:340:2: ( ( 'ObjectFact' ) )
                    // InternalRules.g:341:3: ( 'ObjectFact' )
                    {
                     before(grammarAccess.getAssetTypeAccess().getObjectFactEnumLiteralDeclaration_0()); 
                    // InternalRules.g:342:3: ( 'ObjectFact' )
                    // InternalRules.g:342:4: 'ObjectFact'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssetTypeAccess().getObjectFactEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:346:2: ( ( 'ReferenceFact' ) )
                    {
                    // InternalRules.g:346:2: ( ( 'ReferenceFact' ) )
                    // InternalRules.g:347:3: ( 'ReferenceFact' )
                    {
                     before(grammarAccess.getAssetTypeAccess().getReferenceFactEnumLiteralDeclaration_1()); 
                    // InternalRules.g:348:3: ( 'ReferenceFact' )
                    // InternalRules.g:348:4: 'ReferenceFact'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssetTypeAccess().getReferenceFactEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:352:2: ( ( 'AttributeFact' ) )
                    {
                    // InternalRules.g:352:2: ( ( 'AttributeFact' ) )
                    // InternalRules.g:353:3: ( 'AttributeFact' )
                    {
                     before(grammarAccess.getAssetTypeAccess().getAttributeFactEnumLiteralDeclaration_2()); 
                    // InternalRules.g:354:3: ( 'AttributeFact' )
                    // InternalRules.g:354:4: 'AttributeFact'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssetTypeAccess().getAttributeFactEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssetType__Alternatives"


    // $ANTLR start "rule__ResolutionType__Alternatives"
    // InternalRules.g:362:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:366:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:367:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:367:2: ( ( 'restrictive' ) )
                    // InternalRules.g:368:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:369:3: ( 'restrictive' )
                    // InternalRules.g:369:4: 'restrictive'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:373:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:373:2: ( ( 'permissive' ) )
                    // InternalRules.g:374:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:375:3: ( 'permissive' )
                    // InternalRules.g:375:4: 'permissive'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResolutionType__Alternatives"


    // $ANTLR start "rule__Policy__Group_0__0"
    // InternalRules.g:383:1: rule__Policy__Group_0__0 : rule__Policy__Group_0__0__Impl rule__Policy__Group_0__1 ;
    public final void rule__Policy__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:387:1: ( rule__Policy__Group_0__0__Impl rule__Policy__Group_0__1 )
            // InternalRules.g:388:2: rule__Policy__Group_0__0__Impl rule__Policy__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Policy__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_0__0"


    // $ANTLR start "rule__Policy__Group_0__0__Impl"
    // InternalRules.g:395:1: rule__Policy__Group_0__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:399:1: ( ( 'policy' ) )
            // InternalRules.g:400:1: ( 'policy' )
            {
            // InternalRules.g:400:1: ( 'policy' )
            // InternalRules.g:401:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_0__0__Impl"


    // $ANTLR start "rule__Policy__Group_0__1"
    // InternalRules.g:410:1: rule__Policy__Group_0__1 : rule__Policy__Group_0__1__Impl ;
    public final void rule__Policy__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:414:1: ( rule__Policy__Group_0__1__Impl )
            // InternalRules.g:415:2: rule__Policy__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_0__1"


    // $ANTLR start "rule__Policy__Group_0__1__Impl"
    // InternalRules.g:421:1: rule__Policy__Group_0__1__Impl : ( ( rule__Policy__NameAssignment_0_1 ) ) ;
    public final void rule__Policy__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:425:1: ( ( ( rule__Policy__NameAssignment_0_1 ) ) )
            // InternalRules.g:426:1: ( ( rule__Policy__NameAssignment_0_1 ) )
            {
            // InternalRules.g:426:1: ( ( rule__Policy__NameAssignment_0_1 ) )
            // InternalRules.g:427:2: ( rule__Policy__NameAssignment_0_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_0_1()); 
            // InternalRules.g:428:2: ( rule__Policy__NameAssignment_0_1 )
            // InternalRules.g:428:3: rule__Policy__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_0__1__Impl"


    // $ANTLR start "rule__Policy__Group_2__0"
    // InternalRules.g:437:1: rule__Policy__Group_2__0 : rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1 ;
    public final void rule__Policy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:441:1: ( rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1 )
            // InternalRules.g:442:2: rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Policy__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__0"


    // $ANTLR start "rule__Policy__Group_2__0__Impl"
    // InternalRules.g:449:1: rule__Policy__Group_2__0__Impl : ( ( rule__Policy__OperationAssignment_2_0 ) ) ;
    public final void rule__Policy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:453:1: ( ( ( rule__Policy__OperationAssignment_2_0 ) ) )
            // InternalRules.g:454:1: ( ( rule__Policy__OperationAssignment_2_0 ) )
            {
            // InternalRules.g:454:1: ( ( rule__Policy__OperationAssignment_2_0 ) )
            // InternalRules.g:455:2: ( rule__Policy__OperationAssignment_2_0 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_2_0()); 
            // InternalRules.g:456:2: ( rule__Policy__OperationAssignment_2_0 )
            // InternalRules.g:456:3: rule__Policy__OperationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__OperationAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getOperationAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__0__Impl"


    // $ANTLR start "rule__Policy__Group_2__1"
    // InternalRules.g:464:1: rule__Policy__Group_2__1 : rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2 ;
    public final void rule__Policy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:468:1: ( rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2 )
            // InternalRules.g:469:2: rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__1"


    // $ANTLR start "rule__Policy__Group_2__1__Impl"
    // InternalRules.g:476:1: rule__Policy__Group_2__1__Impl : ( 'by' ) ;
    public final void rule__Policy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:480:1: ( ( 'by' ) )
            // InternalRules.g:481:1: ( 'by' )
            {
            // InternalRules.g:481:1: ( 'by' )
            // InternalRules.g:482:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getByKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__1__Impl"


    // $ANTLR start "rule__Policy__Group_2__2"
    // InternalRules.g:491:1: rule__Policy__Group_2__2 : rule__Policy__Group_2__2__Impl rule__Policy__Group_2__3 ;
    public final void rule__Policy__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:495:1: ( rule__Policy__Group_2__2__Impl rule__Policy__Group_2__3 )
            // InternalRules.g:496:2: rule__Policy__Group_2__2__Impl rule__Policy__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__2"


    // $ANTLR start "rule__Policy__Group_2__2__Impl"
    // InternalRules.g:503:1: rule__Policy__Group_2__2__Impl : ( 'default' ) ;
    public final void rule__Policy__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:507:1: ( ( 'default' ) )
            // InternalRules.g:508:1: ( 'default' )
            {
            // InternalRules.g:508:1: ( 'default' )
            // InternalRules.g:509:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getDefaultKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__2__Impl"


    // $ANTLR start "rule__Policy__Group_2__3"
    // InternalRules.g:518:1: rule__Policy__Group_2__3 : rule__Policy__Group_2__3__Impl rule__Policy__Group_2__4 ;
    public final void rule__Policy__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:522:1: ( rule__Policy__Group_2__3__Impl rule__Policy__Group_2__4 )
            // InternalRules.g:523:2: rule__Policy__Group_2__3__Impl rule__Policy__Group_2__4
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__3"


    // $ANTLR start "rule__Policy__Group_2__3__Impl"
    // InternalRules.g:530:1: rule__Policy__Group_2__3__Impl : ( '{' ) ;
    public final void rule__Policy__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:534:1: ( ( '{' ) )
            // InternalRules.g:535:1: ( '{' )
            {
            // InternalRules.g:535:1: ( '{' )
            // InternalRules.g:536:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__3__Impl"


    // $ANTLR start "rule__Policy__Group_2__4"
    // InternalRules.g:545:1: rule__Policy__Group_2__4 : rule__Policy__Group_2__4__Impl rule__Policy__Group_2__5 ;
    public final void rule__Policy__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:549:1: ( rule__Policy__Group_2__4__Impl rule__Policy__Group_2__5 )
            // InternalRules.g:550:2: rule__Policy__Group_2__4__Impl rule__Policy__Group_2__5
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__4"


    // $ANTLR start "rule__Policy__Group_2__4__Impl"
    // InternalRules.g:557:1: rule__Policy__Group_2__4__Impl : ( ( rule__Policy__RulesAssignment_2_4 )* ) ;
    public final void rule__Policy__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:561:1: ( ( ( rule__Policy__RulesAssignment_2_4 )* ) )
            // InternalRules.g:562:1: ( ( rule__Policy__RulesAssignment_2_4 )* )
            {
            // InternalRules.g:562:1: ( ( rule__Policy__RulesAssignment_2_4 )* )
            // InternalRules.g:563:2: ( rule__Policy__RulesAssignment_2_4 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_2_4()); 
            // InternalRules.g:564:2: ( rule__Policy__RulesAssignment_2_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=15)||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRules.g:564:3: rule__Policy__RulesAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Policy__RulesAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__4__Impl"


    // $ANTLR start "rule__Policy__Group_2__5"
    // InternalRules.g:572:1: rule__Policy__Group_2__5 : rule__Policy__Group_2__5__Impl rule__Policy__Group_2__6 ;
    public final void rule__Policy__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:576:1: ( rule__Policy__Group_2__5__Impl rule__Policy__Group_2__6 )
            // InternalRules.g:577:2: rule__Policy__Group_2__5__Impl rule__Policy__Group_2__6
            {
            pushFollow(FOLLOW_9);
            rule__Policy__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__5"


    // $ANTLR start "rule__Policy__Group_2__5__Impl"
    // InternalRules.g:584:1: rule__Policy__Group_2__5__Impl : ( '}' ) ;
    public final void rule__Policy__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:588:1: ( ( '}' ) )
            // InternalRules.g:589:1: ( '}' )
            {
            // InternalRules.g:589:1: ( '}' )
            // InternalRules.g:590:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__5__Impl"


    // $ANTLR start "rule__Policy__Group_2__6"
    // InternalRules.g:599:1: rule__Policy__Group_2__6 : rule__Policy__Group_2__6__Impl rule__Policy__Group_2__7 ;
    public final void rule__Policy__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:603:1: ( rule__Policy__Group_2__6__Impl rule__Policy__Group_2__7 )
            // InternalRules.g:604:2: rule__Policy__Group_2__6__Impl rule__Policy__Group_2__7
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__6"


    // $ANTLR start "rule__Policy__Group_2__6__Impl"
    // InternalRules.g:611:1: rule__Policy__Group_2__6__Impl : ( 'with' ) ;
    public final void rule__Policy__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:615:1: ( ( 'with' ) )
            // InternalRules.g:616:1: ( 'with' )
            {
            // InternalRules.g:616:1: ( 'with' )
            // InternalRules.g:617:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_2_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWithKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__6__Impl"


    // $ANTLR start "rule__Policy__Group_2__7"
    // InternalRules.g:626:1: rule__Policy__Group_2__7 : rule__Policy__Group_2__7__Impl rule__Policy__Group_2__8 ;
    public final void rule__Policy__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:630:1: ( rule__Policy__Group_2__7__Impl rule__Policy__Group_2__8 )
            // InternalRules.g:631:2: rule__Policy__Group_2__7__Impl rule__Policy__Group_2__8
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__7"


    // $ANTLR start "rule__Policy__Group_2__7__Impl"
    // InternalRules.g:638:1: rule__Policy__Group_2__7__Impl : ( ( rule__Policy__ResolutionAssignment_2_7 ) ) ;
    public final void rule__Policy__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:642:1: ( ( ( rule__Policy__ResolutionAssignment_2_7 ) ) )
            // InternalRules.g:643:1: ( ( rule__Policy__ResolutionAssignment_2_7 ) )
            {
            // InternalRules.g:643:1: ( ( rule__Policy__ResolutionAssignment_2_7 ) )
            // InternalRules.g:644:2: ( rule__Policy__ResolutionAssignment_2_7 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_2_7()); 
            // InternalRules.g:645:2: ( rule__Policy__ResolutionAssignment_2_7 )
            // InternalRules.g:645:3: rule__Policy__ResolutionAssignment_2_7
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ResolutionAssignment_2_7();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getResolutionAssignment_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__7__Impl"


    // $ANTLR start "rule__Policy__Group_2__8"
    // InternalRules.g:653:1: rule__Policy__Group_2__8 : rule__Policy__Group_2__8__Impl ;
    public final void rule__Policy__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:657:1: ( rule__Policy__Group_2__8__Impl )
            // InternalRules.g:658:2: rule__Policy__Group_2__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group_2__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__8"


    // $ANTLR start "rule__Policy__Group_2__8__Impl"
    // InternalRules.g:664:1: rule__Policy__Group_2__8__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:668:1: ( ( 'resolution' ) )
            // InternalRules.g:669:1: ( 'resolution' )
            {
            // InternalRules.g:669:1: ( 'resolution' )
            // InternalRules.g:670:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_2_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getResolutionKeyword_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group_2__8__Impl"


    // $ANTLR start "rule__Rule__Group_0__0"
    // InternalRules.g:680:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:684:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalRules.g:685:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__0"


    // $ANTLR start "rule__Rule__Group_0__0__Impl"
    // InternalRules.g:692:1: rule__Rule__Group_0__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:696:1: ( ( 'rule' ) )
            // InternalRules.g:697:1: ( 'rule' )
            {
            // InternalRules.g:697:1: ( 'rule' )
            // InternalRules.g:698:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_0__1"
    // InternalRules.g:707:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:711:1: ( rule__Rule__Group_0__1__Impl )
            // InternalRules.g:712:2: rule__Rule__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__1"


    // $ANTLR start "rule__Rule__Group_0__1__Impl"
    // InternalRules.g:718:1: rule__Rule__Group_0__1__Impl : ( ( rule__Rule__NameAssignment_0_1 ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:722:1: ( ( ( rule__Rule__NameAssignment_0_1 ) ) )
            // InternalRules.g:723:1: ( ( rule__Rule__NameAssignment_0_1 ) )
            {
            // InternalRules.g:723:1: ( ( rule__Rule__NameAssignment_0_1 ) )
            // InternalRules.g:724:2: ( rule__Rule__NameAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0_1()); 
            // InternalRules.g:725:2: ( rule__Rule__NameAssignment_0_1 )
            // InternalRules.g:725:3: rule__Rule__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_2__0"
    // InternalRules.g:734:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:738:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // InternalRules.g:739:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0"


    // $ANTLR start "rule__Rule__Group_2__0__Impl"
    // InternalRules.g:746:1: rule__Rule__Group_2__0__Impl : ( ( rule__Rule__OperationAssignment_2_0 ) ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:750:1: ( ( ( rule__Rule__OperationAssignment_2_0 ) ) )
            // InternalRules.g:751:1: ( ( rule__Rule__OperationAssignment_2_0 ) )
            {
            // InternalRules.g:751:1: ( ( rule__Rule__OperationAssignment_2_0 ) )
            // InternalRules.g:752:2: ( rule__Rule__OperationAssignment_2_0 )
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_2_0()); 
            // InternalRules.g:753:2: ( rule__Rule__OperationAssignment_2_0 )
            // InternalRules.g:753:3: rule__Rule__OperationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OperationAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOperationAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2__1"
    // InternalRules.g:761:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:765:1: ( rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 )
            // InternalRules.g:766:2: rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1"


    // $ANTLR start "rule__Rule__Group_2__1__Impl"
    // InternalRules.g:773:1: rule__Rule__Group_2__1__Impl : ( 'to' ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:777:1: ( ( 'to' ) )
            // InternalRules.g:778:1: ( 'to' )
            {
            // InternalRules.g:778:1: ( 'to' )
            // InternalRules.g:779:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_2_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_2__2"
    // InternalRules.g:788:1: rule__Rule__Group_2__2 : rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 ;
    public final void rule__Rule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:792:1: ( rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 )
            // InternalRules.g:793:2: rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__2"


    // $ANTLR start "rule__Rule__Group_2__2__Impl"
    // InternalRules.g:800:1: rule__Rule__Group_2__2__Impl : ( ( rule__Rule__UserAssignment_2_2 ) ) ;
    public final void rule__Rule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:804:1: ( ( ( rule__Rule__UserAssignment_2_2 ) ) )
            // InternalRules.g:805:1: ( ( rule__Rule__UserAssignment_2_2 ) )
            {
            // InternalRules.g:805:1: ( ( rule__Rule__UserAssignment_2_2 ) )
            // InternalRules.g:806:2: ( rule__Rule__UserAssignment_2_2 )
            {
             before(grammarAccess.getRuleAccess().getUserAssignment_2_2()); 
            // InternalRules.g:807:2: ( rule__Rule__UserAssignment_2_2 )
            // InternalRules.g:807:3: rule__Rule__UserAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__UserAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getUserAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__2__Impl"


    // $ANTLR start "rule__Rule__Group_2__3"
    // InternalRules.g:815:1: rule__Rule__Group_2__3 : rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4 ;
    public final void rule__Rule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:819:1: ( rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4 )
            // InternalRules.g:820:2: rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__3"


    // $ANTLR start "rule__Rule__Group_2__3__Impl"
    // InternalRules.g:827:1: rule__Rule__Group_2__3__Impl : ( '{' ) ;
    public final void rule__Rule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:831:1: ( ( '{' ) )
            // InternalRules.g:832:1: ( '{' )
            {
            // InternalRules.g:832:1: ( '{' )
            // InternalRules.g:833:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__3__Impl"


    // $ANTLR start "rule__Rule__Group_2__4"
    // InternalRules.g:842:1: rule__Rule__Group_2__4 : rule__Rule__Group_2__4__Impl rule__Rule__Group_2__5 ;
    public final void rule__Rule__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:846:1: ( rule__Rule__Group_2__4__Impl rule__Rule__Group_2__5 )
            // InternalRules.g:847:2: rule__Rule__Group_2__4__Impl rule__Rule__Group_2__5
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__4"


    // $ANTLR start "rule__Rule__Group_2__4__Impl"
    // InternalRules.g:854:1: rule__Rule__Group_2__4__Impl : ( 'select' ) ;
    public final void rule__Rule__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:858:1: ( ( 'select' ) )
            // InternalRules.g:859:1: ( 'select' )
            {
            // InternalRules.g:859:1: ( 'select' )
            // InternalRules.g:860:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_2_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__4__Impl"


    // $ANTLR start "rule__Rule__Group_2__5"
    // InternalRules.g:869:1: rule__Rule__Group_2__5 : rule__Rule__Group_2__5__Impl rule__Rule__Group_2__6 ;
    public final void rule__Rule__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:873:1: ( rule__Rule__Group_2__5__Impl rule__Rule__Group_2__6 )
            // InternalRules.g:874:2: rule__Rule__Group_2__5__Impl rule__Rule__Group_2__6
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__5"


    // $ANTLR start "rule__Rule__Group_2__5__Impl"
    // InternalRules.g:881:1: rule__Rule__Group_2__5__Impl : ( ( rule__Rule__AssetAssignment_2_5 ) ) ;
    public final void rule__Rule__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:885:1: ( ( ( rule__Rule__AssetAssignment_2_5 ) ) )
            // InternalRules.g:886:1: ( ( rule__Rule__AssetAssignment_2_5 ) )
            {
            // InternalRules.g:886:1: ( ( rule__Rule__AssetAssignment_2_5 ) )
            // InternalRules.g:887:2: ( rule__Rule__AssetAssignment_2_5 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_2_5()); 
            // InternalRules.g:888:2: ( rule__Rule__AssetAssignment_2_5 )
            // InternalRules.g:888:3: rule__Rule__AssetAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__5__Impl"


    // $ANTLR start "rule__Rule__Group_2__6"
    // InternalRules.g:896:1: rule__Rule__Group_2__6 : rule__Rule__Group_2__6__Impl rule__Rule__Group_2__7 ;
    public final void rule__Rule__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:900:1: ( rule__Rule__Group_2__6__Impl rule__Rule__Group_2__7 )
            // InternalRules.g:901:2: rule__Rule__Group_2__6__Impl rule__Rule__Group_2__7
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__6"


    // $ANTLR start "rule__Rule__Group_2__6__Impl"
    // InternalRules.g:908:1: rule__Rule__Group_2__6__Impl : ( 'from' ) ;
    public final void rule__Rule__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:912:1: ( ( 'from' ) )
            // InternalRules.g:913:1: ( 'from' )
            {
            // InternalRules.g:913:1: ( 'from' )
            // InternalRules.g:914:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_2_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__6__Impl"


    // $ANTLR start "rule__Rule__Group_2__7"
    // InternalRules.g:923:1: rule__Rule__Group_2__7 : rule__Rule__Group_2__7__Impl rule__Rule__Group_2__8 ;
    public final void rule__Rule__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:927:1: ( rule__Rule__Group_2__7__Impl rule__Rule__Group_2__8 )
            // InternalRules.g:928:2: rule__Rule__Group_2__7__Impl rule__Rule__Group_2__8
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__7"


    // $ANTLR start "rule__Rule__Group_2__7__Impl"
    // InternalRules.g:935:1: rule__Rule__Group_2__7__Impl : ( 'query' ) ;
    public final void rule__Rule__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:939:1: ( ( 'query' ) )
            // InternalRules.g:940:1: ( 'query' )
            {
            // InternalRules.g:940:1: ( 'query' )
            // InternalRules.g:941:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_2_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__7__Impl"


    // $ANTLR start "rule__Rule__Group_2__8"
    // InternalRules.g:950:1: rule__Rule__Group_2__8 : rule__Rule__Group_2__8__Impl rule__Rule__Group_2__9 ;
    public final void rule__Rule__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:954:1: ( rule__Rule__Group_2__8__Impl rule__Rule__Group_2__9 )
            // InternalRules.g:955:2: rule__Rule__Group_2__8__Impl rule__Rule__Group_2__9
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__8"


    // $ANTLR start "rule__Rule__Group_2__8__Impl"
    // InternalRules.g:962:1: rule__Rule__Group_2__8__Impl : ( ( rule__Rule__QueryAssignment_2_8 ) ) ;
    public final void rule__Rule__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:966:1: ( ( ( rule__Rule__QueryAssignment_2_8 ) ) )
            // InternalRules.g:967:1: ( ( rule__Rule__QueryAssignment_2_8 ) )
            {
            // InternalRules.g:967:1: ( ( rule__Rule__QueryAssignment_2_8 ) )
            // InternalRules.g:968:2: ( rule__Rule__QueryAssignment_2_8 )
            {
             before(grammarAccess.getRuleAccess().getQueryAssignment_2_8()); 
            // InternalRules.g:969:2: ( rule__Rule__QueryAssignment_2_8 )
            // InternalRules.g:969:3: rule__Rule__QueryAssignment_2_8
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QueryAssignment_2_8();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQueryAssignment_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__8__Impl"


    // $ANTLR start "rule__Rule__Group_2__9"
    // InternalRules.g:977:1: rule__Rule__Group_2__9 : rule__Rule__Group_2__9__Impl rule__Rule__Group_2__10 ;
    public final void rule__Rule__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:981:1: ( rule__Rule__Group_2__9__Impl rule__Rule__Group_2__10 )
            // InternalRules.g:982:2: rule__Rule__Group_2__9__Impl rule__Rule__Group_2__10
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__9"


    // $ANTLR start "rule__Rule__Group_2__9__Impl"
    // InternalRules.g:989:1: rule__Rule__Group_2__9__Impl : ( ( rule__Rule__Group_2_9__0 )? ) ;
    public final void rule__Rule__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:993:1: ( ( ( rule__Rule__Group_2_9__0 )? ) )
            // InternalRules.g:994:1: ( ( rule__Rule__Group_2_9__0 )? )
            {
            // InternalRules.g:994:1: ( ( rule__Rule__Group_2_9__0 )? )
            // InternalRules.g:995:2: ( rule__Rule__Group_2_9__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2_9()); 
            // InternalRules.g:996:2: ( rule__Rule__Group_2_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRules.g:996:3: rule__Rule__Group_2_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__9__Impl"


    // $ANTLR start "rule__Rule__Group_2__10"
    // InternalRules.g:1004:1: rule__Rule__Group_2__10 : rule__Rule__Group_2__10__Impl rule__Rule__Group_2__11 ;
    public final void rule__Rule__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1008:1: ( rule__Rule__Group_2__10__Impl rule__Rule__Group_2__11 )
            // InternalRules.g:1009:2: rule__Rule__Group_2__10__Impl rule__Rule__Group_2__11
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__10"


    // $ANTLR start "rule__Rule__Group_2__10__Impl"
    // InternalRules.g:1016:1: rule__Rule__Group_2__10__Impl : ( '}' ) ;
    public final void rule__Rule__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1020:1: ( ( '}' ) )
            // InternalRules.g:1021:1: ( '}' )
            {
            // InternalRules.g:1021:1: ( '}' )
            // InternalRules.g:1022:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_2_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_2_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__10__Impl"


    // $ANTLR start "rule__Rule__Group_2__11"
    // InternalRules.g:1031:1: rule__Rule__Group_2__11 : rule__Rule__Group_2__11__Impl ;
    public final void rule__Rule__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1035:1: ( rule__Rule__Group_2__11__Impl )
            // InternalRules.g:1036:2: rule__Rule__Group_2__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__11"


    // $ANTLR start "rule__Rule__Group_2__11__Impl"
    // InternalRules.g:1042:1: rule__Rule__Group_2__11__Impl : ( ( rule__Rule__Group_2_11__0 )? ) ;
    public final void rule__Rule__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1046:1: ( ( ( rule__Rule__Group_2_11__0 )? ) )
            // InternalRules.g:1047:1: ( ( rule__Rule__Group_2_11__0 )? )
            {
            // InternalRules.g:1047:1: ( ( rule__Rule__Group_2_11__0 )? )
            // InternalRules.g:1048:2: ( rule__Rule__Group_2_11__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2_11()); 
            // InternalRules.g:1049:2: ( rule__Rule__Group_2_11__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRules.g:1049:3: rule__Rule__Group_2_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__11__Impl"


    // $ANTLR start "rule__Rule__Group_2_9__0"
    // InternalRules.g:1058:1: rule__Rule__Group_2_9__0 : rule__Rule__Group_2_9__0__Impl rule__Rule__Group_2_9__1 ;
    public final void rule__Rule__Group_2_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1062:1: ( rule__Rule__Group_2_9__0__Impl rule__Rule__Group_2_9__1 )
            // InternalRules.g:1063:2: rule__Rule__Group_2_9__0__Impl rule__Rule__Group_2_9__1
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group_2_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_9__0"


    // $ANTLR start "rule__Rule__Group_2_9__0__Impl"
    // InternalRules.g:1070:1: rule__Rule__Group_2_9__0__Impl : ( 'where' ) ;
    public final void rule__Rule__Group_2_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1074:1: ( ( 'where' ) )
            // InternalRules.g:1075:1: ( 'where' )
            {
            // InternalRules.g:1075:1: ( 'where' )
            // InternalRules.g:1076:2: 'where'
            {
             before(grammarAccess.getRuleAccess().getWhereKeyword_2_9_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWhereKeyword_2_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_9__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_9__1"
    // InternalRules.g:1085:1: rule__Rule__Group_2_9__1 : rule__Rule__Group_2_9__1__Impl rule__Rule__Group_2_9__2 ;
    public final void rule__Rule__Group_2_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1089:1: ( rule__Rule__Group_2_9__1__Impl rule__Rule__Group_2_9__2 )
            // InternalRules.g:1090:2: rule__Rule__Group_2_9__1__Impl rule__Rule__Group_2_9__2
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group_2_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_9__1"


    // $ANTLR start "rule__Rule__Group_2_9__1__Impl"
    // InternalRules.g:1097:1: rule__Rule__Group_2_9__1__Impl : ( 'bound' ) ;
    public final void rule__Rule__Group_2_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1101:1: ( ( 'bound' ) )
            // InternalRules.g:1102:1: ( 'bound' )
            {
            // InternalRules.g:1102:1: ( 'bound' )
            // InternalRules.g:1103:2: 'bound'
            {
             before(grammarAccess.getRuleAccess().getBoundKeyword_2_9_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getBoundKeyword_2_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_9__1__Impl"


    // $ANTLR start "rule__Rule__Group_2_9__2"
    // InternalRules.g:1112:1: rule__Rule__Group_2_9__2 : rule__Rule__Group_2_9__2__Impl ;
    public final void rule__Rule__Group_2_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1116:1: ( rule__Rule__Group_2_9__2__Impl )
            // InternalRules.g:1117:2: rule__Rule__Group_2_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_9__2"


    // $ANTLR start "rule__Rule__Group_2_9__2__Impl"
    // InternalRules.g:1123:1: rule__Rule__Group_2_9__2__Impl : ( 'to' ) ;
    public final void rule__Rule__Group_2_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1127:1: ( ( 'to' ) )
            // InternalRules.g:1128:1: ( 'to' )
            {
            // InternalRules.g:1128:1: ( 'to' )
            // InternalRules.g:1129:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_2_9_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_2_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_9__2__Impl"


    // $ANTLR start "rule__Rule__Group_2_11__0"
    // InternalRules.g:1139:1: rule__Rule__Group_2_11__0 : rule__Rule__Group_2_11__0__Impl rule__Rule__Group_2_11__1 ;
    public final void rule__Rule__Group_2_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1143:1: ( rule__Rule__Group_2_11__0__Impl rule__Rule__Group_2_11__1 )
            // InternalRules.g:1144:2: rule__Rule__Group_2_11__0__Impl rule__Rule__Group_2_11__1
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group_2_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_11__0"


    // $ANTLR start "rule__Rule__Group_2_11__0__Impl"
    // InternalRules.g:1151:1: rule__Rule__Group_2_11__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_2_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1155:1: ( ( 'with' ) )
            // InternalRules.g:1156:1: ( 'with' )
            {
            // InternalRules.g:1156:1: ( 'with' )
            // InternalRules.g:1157:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_2_11_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_2_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_11__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_11__1"
    // InternalRules.g:1166:1: rule__Rule__Group_2_11__1 : rule__Rule__Group_2_11__1__Impl rule__Rule__Group_2_11__2 ;
    public final void rule__Rule__Group_2_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1170:1: ( rule__Rule__Group_2_11__1__Impl rule__Rule__Group_2_11__2 )
            // InternalRules.g:1171:2: rule__Rule__Group_2_11__1__Impl rule__Rule__Group_2_11__2
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group_2_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_11__1"


    // $ANTLR start "rule__Rule__Group_2_11__1__Impl"
    // InternalRules.g:1178:1: rule__Rule__Group_2_11__1__Impl : ( ( rule__Rule__PriorityAssignment_2_11_1 ) ) ;
    public final void rule__Rule__Group_2_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1182:1: ( ( ( rule__Rule__PriorityAssignment_2_11_1 ) ) )
            // InternalRules.g:1183:1: ( ( rule__Rule__PriorityAssignment_2_11_1 ) )
            {
            // InternalRules.g:1183:1: ( ( rule__Rule__PriorityAssignment_2_11_1 ) )
            // InternalRules.g:1184:2: ( rule__Rule__PriorityAssignment_2_11_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_2_11_1()); 
            // InternalRules.g:1185:2: ( rule__Rule__PriorityAssignment_2_11_1 )
            // InternalRules.g:1185:3: rule__Rule__PriorityAssignment_2_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PriorityAssignment_2_11_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPriorityAssignment_2_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_11__1__Impl"


    // $ANTLR start "rule__Rule__Group_2_11__2"
    // InternalRules.g:1193:1: rule__Rule__Group_2_11__2 : rule__Rule__Group_2_11__2__Impl ;
    public final void rule__Rule__Group_2_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1197:1: ( rule__Rule__Group_2_11__2__Impl )
            // InternalRules.g:1198:2: rule__Rule__Group_2_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_11__2"


    // $ANTLR start "rule__Rule__Group_2_11__2__Impl"
    // InternalRules.g:1204:1: rule__Rule__Group_2_11__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_2_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1208:1: ( ( 'priority' ) )
            // InternalRules.g:1209:1: ( 'priority' )
            {
            // InternalRules.g:1209:1: ( 'priority' )
            // InternalRules.g:1210:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_2_11_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityKeyword_2_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_11__2__Impl"


    // $ANTLR start "rule__Policy__UnorderedGroup"
    // InternalRules.g:1220:1: rule__Policy__UnorderedGroup : rule__Policy__UnorderedGroup__0 {...}?;
    public final void rule__Policy__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPolicyAccess().getUnorderedGroup());
        	
        try {
            // InternalRules.g:1225:1: ( rule__Policy__UnorderedGroup__0 {...}?)
            // InternalRules.g:1226:2: rule__Policy__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Policy__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPolicyAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup"


    // $ANTLR start "rule__Policy__UnorderedGroup__Impl"
    // InternalRules.g:1234:1: rule__Policy__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) ) ;
    public final void rule__Policy__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRules.g:1239:1: ( ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) ) )
            // InternalRules.g:1240:3: ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) )
            {
            // InternalRules.g:1240:3: ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 >= 11 && LA9_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                alt9=2;
            }
            else if ( LA9_0 >= 14 && LA9_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRules.g:1241:3: ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) )
                    {
                    // InternalRules.g:1241:3: ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) )
                    // InternalRules.g:1242:4: {...}? => ( ( ( rule__Policy__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalRules.g:1242:100: ( ( ( rule__Policy__Group_0__0 ) ) )
                    // InternalRules.g:1243:5: ( ( rule__Policy__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1249:5: ( ( rule__Policy__Group_0__0 ) )
                    // InternalRules.g:1250:6: ( rule__Policy__Group_0__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_0()); 
                    // InternalRules.g:1251:6: ( rule__Policy__Group_0__0 )
                    // InternalRules.g:1251:7: rule__Policy__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Policy__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolicyAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1256:3: ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) )
                    {
                    // InternalRules.g:1256:3: ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) )
                    // InternalRules.g:1257:4: {...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalRules.g:1257:100: ( ( ( rule__Policy__AccessAssignment_1 ) ) )
                    // InternalRules.g:1258:5: ( ( rule__Policy__AccessAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1264:5: ( ( rule__Policy__AccessAssignment_1 ) )
                    // InternalRules.g:1265:6: ( rule__Policy__AccessAssignment_1 )
                    {
                     before(grammarAccess.getPolicyAccess().getAccessAssignment_1()); 
                    // InternalRules.g:1266:6: ( rule__Policy__AccessAssignment_1 )
                    // InternalRules.g:1266:7: rule__Policy__AccessAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Policy__AccessAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolicyAccess().getAccessAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1271:3: ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) )
                    {
                    // InternalRules.g:1271:3: ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) )
                    // InternalRules.g:1272:4: {...}? => ( ( ( rule__Policy__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalRules.g:1272:100: ( ( ( rule__Policy__Group_2__0 ) ) )
                    // InternalRules.g:1273:5: ( ( rule__Policy__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1279:5: ( ( rule__Policy__Group_2__0 ) )
                    // InternalRules.g:1280:6: ( rule__Policy__Group_2__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_2()); 
                    // InternalRules.g:1281:6: ( rule__Policy__Group_2__0 )
                    // InternalRules.g:1281:7: rule__Policy__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Policy__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolicyAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup__Impl"


    // $ANTLR start "rule__Policy__UnorderedGroup__0"
    // InternalRules.g:1294:1: rule__Policy__UnorderedGroup__0 : rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__1 )? ;
    public final void rule__Policy__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1298:1: ( rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__1 )? )
            // InternalRules.g:1299:2: rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__Policy__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1300:2: ( rule__Policy__UnorderedGroup__1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 >= 11 && LA10_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 >= 14 && LA10_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:1300:2: rule__Policy__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Policy__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup__0"


    // $ANTLR start "rule__Policy__UnorderedGroup__1"
    // InternalRules.g:1306:1: rule__Policy__UnorderedGroup__1 : rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__2 )? ;
    public final void rule__Policy__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1310:1: ( rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__2 )? )
            // InternalRules.g:1311:2: rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_22);
            rule__Policy__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1312:2: ( rule__Policy__UnorderedGroup__2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 >= 11 && LA11_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 >= 14 && LA11_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRules.g:1312:2: rule__Policy__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Policy__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup__1"


    // $ANTLR start "rule__Policy__UnorderedGroup__2"
    // InternalRules.g:1318:1: rule__Policy__UnorderedGroup__2 : rule__Policy__UnorderedGroup__Impl ;
    public final void rule__Policy__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1322:1: ( rule__Policy__UnorderedGroup__Impl )
            // InternalRules.g:1323:2: rule__Policy__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__UnorderedGroup__2"


    // $ANTLR start "rule__Rule__UnorderedGroup"
    // InternalRules.g:1330:1: rule__Rule__UnorderedGroup : rule__Rule__UnorderedGroup__0 {...}?;
    public final void rule__Rule__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRuleAccess().getUnorderedGroup());
        	
        try {
            // InternalRules.g:1335:1: ( rule__Rule__UnorderedGroup__0 {...}?)
            // InternalRules.g:1336:2: rule__Rule__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Rule__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRuleAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UnorderedGroup"


    // $ANTLR start "rule__Rule__UnorderedGroup__Impl"
    // InternalRules.g:1344:1: rule__Rule__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) ) ;
    public final void rule__Rule__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRules.g:1349:1: ( ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) ) )
            // InternalRules.g:1350:3: ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) )
            {
            // InternalRules.g:1350:3: ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 >= 11 && LA12_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {
                alt12=2;
            }
            else if ( LA12_0 >= 14 && LA12_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {
                alt12=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRules.g:1351:3: ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) )
                    {
                    // InternalRules.g:1351:3: ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) )
                    // InternalRules.g:1352:4: {...}? => ( ( ( rule__Rule__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalRules.g:1352:98: ( ( ( rule__Rule__Group_0__0 ) ) )
                    // InternalRules.g:1353:5: ( ( rule__Rule__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1359:5: ( ( rule__Rule__Group_0__0 ) )
                    // InternalRules.g:1360:6: ( rule__Rule__Group_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_0()); 
                    // InternalRules.g:1361:6: ( rule__Rule__Group_0__0 )
                    // InternalRules.g:1361:7: rule__Rule__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:1366:3: ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) )
                    {
                    // InternalRules.g:1366:3: ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) )
                    // InternalRules.g:1367:4: {...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalRules.g:1367:98: ( ( ( rule__Rule__AccessAssignment_1 ) ) )
                    // InternalRules.g:1368:5: ( ( rule__Rule__AccessAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1374:5: ( ( rule__Rule__AccessAssignment_1 ) )
                    // InternalRules.g:1375:6: ( rule__Rule__AccessAssignment_1 )
                    {
                     before(grammarAccess.getRuleAccess().getAccessAssignment_1()); 
                    // InternalRules.g:1376:6: ( rule__Rule__AccessAssignment_1 )
                    // InternalRules.g:1376:7: rule__Rule__AccessAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__AccessAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getAccessAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:1381:3: ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) )
                    {
                    // InternalRules.g:1381:3: ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) )
                    // InternalRules.g:1382:4: {...}? => ( ( ( rule__Rule__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalRules.g:1382:98: ( ( ( rule__Rule__Group_2__0 ) ) )
                    // InternalRules.g:1383:5: ( ( rule__Rule__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1389:5: ( ( rule__Rule__Group_2__0 ) )
                    // InternalRules.g:1390:6: ( rule__Rule__Group_2__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2()); 
                    // InternalRules.g:1391:6: ( rule__Rule__Group_2__0 )
                    // InternalRules.g:1391:7: rule__Rule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UnorderedGroup__Impl"


    // $ANTLR start "rule__Rule__UnorderedGroup__0"
    // InternalRules.g:1404:1: rule__Rule__UnorderedGroup__0 : rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__1 )? ;
    public final void rule__Rule__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1408:1: ( rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__1 )? )
            // InternalRules.g:1409:2: rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_8);
            rule__Rule__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1410:2: ( rule__Rule__UnorderedGroup__1 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalRules.g:1410:2: rule__Rule__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UnorderedGroup__0"


    // $ANTLR start "rule__Rule__UnorderedGroup__1"
    // InternalRules.g:1416:1: rule__Rule__UnorderedGroup__1 : rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__2 )? ;
    public final void rule__Rule__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1420:1: ( rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__2 )? )
            // InternalRules.g:1421:2: rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_8);
            rule__Rule__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1422:2: ( rule__Rule__UnorderedGroup__2 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalRules.g:1422:2: rule__Rule__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UnorderedGroup__1"


    // $ANTLR start "rule__Rule__UnorderedGroup__2"
    // InternalRules.g:1428:1: rule__Rule__UnorderedGroup__2 : rule__Rule__UnorderedGroup__Impl ;
    public final void rule__Rule__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1432:1: ( rule__Rule__UnorderedGroup__Impl )
            // InternalRules.g:1433:2: rule__Rule__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UnorderedGroup__2"


    // $ANTLR start "rule__Model__PolicyAssignment"
    // InternalRules.g:1440:1: rule__Model__PolicyAssignment : ( rulePolicy ) ;
    public final void rule__Model__PolicyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1444:1: ( ( rulePolicy ) )
            // InternalRules.g:1445:2: ( rulePolicy )
            {
            // InternalRules.g:1445:2: ( rulePolicy )
            // InternalRules.g:1446:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PolicyAssignment"


    // $ANTLR start "rule__Policy__NameAssignment_0_1"
    // InternalRules.g:1455:1: rule__Policy__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1459:1: ( ( RULE_ID ) )
            // InternalRules.g:1460:2: ( RULE_ID )
            {
            // InternalRules.g:1460:2: ( RULE_ID )
            // InternalRules.g:1461:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_0_1"


    // $ANTLR start "rule__Policy__AccessAssignment_1"
    // InternalRules.g:1470:1: rule__Policy__AccessAssignment_1 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1474:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:1475:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:1475:2: ( ruleAccessibilityLevel )
            // InternalRules.g:1476:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__AccessAssignment_1"


    // $ANTLR start "rule__Policy__OperationAssignment_2_0"
    // InternalRules.g:1485:1: rule__Policy__OperationAssignment_2_0 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1489:1: ( ( ruleOperationType ) )
            // InternalRules.g:1490:2: ( ruleOperationType )
            {
            // InternalRules.g:1490:2: ( ruleOperationType )
            // InternalRules.g:1491:3: ruleOperationType
            {
             before(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__OperationAssignment_2_0"


    // $ANTLR start "rule__Policy__RulesAssignment_2_4"
    // InternalRules.g:1500:1: rule__Policy__RulesAssignment_2_4 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1504:1: ( ( ruleRule ) )
            // InternalRules.g:1505:2: ( ruleRule )
            {
            // InternalRules.g:1505:2: ( ruleRule )
            // InternalRules.g:1506:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RulesAssignment_2_4"


    // $ANTLR start "rule__Policy__ResolutionAssignment_2_7"
    // InternalRules.g:1515:1: rule__Policy__ResolutionAssignment_2_7 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1519:1: ( ( ruleResolutionType ) )
            // InternalRules.g:1520:2: ( ruleResolutionType )
            {
            // InternalRules.g:1520:2: ( ruleResolutionType )
            // InternalRules.g:1521:3: ruleResolutionType
            {
             before(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_2_7_0()); 
            pushFollow(FOLLOW_2);
            ruleResolutionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_2_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ResolutionAssignment_2_7"


    // $ANTLR start "rule__Rule__NameAssignment_0_1"
    // InternalRules.g:1530:1: rule__Rule__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1534:1: ( ( RULE_ID ) )
            // InternalRules.g:1535:2: ( RULE_ID )
            {
            // InternalRules.g:1535:2: ( RULE_ID )
            // InternalRules.g:1536:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_0_1"


    // $ANTLR start "rule__Rule__AccessAssignment_1"
    // InternalRules.g:1545:1: rule__Rule__AccessAssignment_1 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1549:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:1550:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:1550:2: ( ruleAccessibilityLevel )
            // InternalRules.g:1551:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AccessAssignment_1"


    // $ANTLR start "rule__Rule__OperationAssignment_2_0"
    // InternalRules.g:1560:1: rule__Rule__OperationAssignment_2_0 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1564:1: ( ( ruleOperationType ) )
            // InternalRules.g:1565:2: ( ruleOperationType )
            {
            // InternalRules.g:1565:2: ( ruleOperationType )
            // InternalRules.g:1566:3: ruleOperationType
            {
             before(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OperationAssignment_2_0"


    // $ANTLR start "rule__Rule__UserAssignment_2_2"
    // InternalRules.g:1575:1: rule__Rule__UserAssignment_2_2 : ( ruleUser ) ;
    public final void rule__Rule__UserAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1579:1: ( ( ruleUser ) )
            // InternalRules.g:1580:2: ( ruleUser )
            {
            // InternalRules.g:1580:2: ( ruleUser )
            // InternalRules.g:1581:3: ruleUser
            {
             before(grammarAccess.getRuleAccess().getUserUserParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getUserUserParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UserAssignment_2_2"


    // $ANTLR start "rule__Rule__AssetAssignment_2_5"
    // InternalRules.g:1590:1: rule__Rule__AssetAssignment_2_5 : ( ruleAssetType ) ;
    public final void rule__Rule__AssetAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1594:1: ( ( ruleAssetType ) )
            // InternalRules.g:1595:2: ( ruleAssetType )
            {
            // InternalRules.g:1595:2: ( ruleAssetType )
            // InternalRules.g:1596:3: ruleAssetType
            {
             before(grammarAccess.getRuleAccess().getAssetAssetTypeEnumRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssetType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetAssetTypeEnumRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AssetAssignment_2_5"


    // $ANTLR start "rule__Rule__QueryAssignment_2_8"
    // InternalRules.g:1605:1: rule__Rule__QueryAssignment_2_8 : ( ruleQuery ) ;
    public final void rule__Rule__QueryAssignment_2_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1609:1: ( ( ruleQuery ) )
            // InternalRules.g:1610:2: ( ruleQuery )
            {
            // InternalRules.g:1610:2: ( ruleQuery )
            // InternalRules.g:1611:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_8_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__QueryAssignment_2_8"


    // $ANTLR start "rule__Rule__PriorityAssignment_2_11_1"
    // InternalRules.g:1620:1: rule__Rule__PriorityAssignment_2_11_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_2_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1624:1: ( ( RULE_INT ) )
            // InternalRules.g:1625:2: ( RULE_INT )
            {
            // InternalRules.g:1625:2: ( RULE_INT )
            // InternalRules.g:1626:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_2_11_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_2_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PriorityAssignment_2_11_1"


    // $ANTLR start "rule__User__NameAssignment"
    // InternalRules.g:1635:1: rule__User__NameAssignment : ( RULE_ID ) ;
    public final void rule__User__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1639:1: ( ( RULE_ID ) )
            // InternalRules.g:1640:2: ( RULE_ID )
            {
            // InternalRules.g:1640:2: ( RULE_ID )
            // InternalRules.g:1641:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment"


    // $ANTLR start "rule__Query__NameAssignment"
    // InternalRules.g:1650:1: rule__Query__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Query__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1654:1: ( ( RULE_STRING ) )
            // InternalRules.g:1655:2: ( RULE_STRING )
            {
            // InternalRules.g:1655:2: ( RULE_STRING )
            // InternalRules.g:1656:3: RULE_STRING
            {
             before(grammarAccess.getQueryAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NameAssignment"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\7\27\uffff";
    static final String dfa_3s = "\1\13\1\6\3\0\2\35\1\uffff\1\0\1\uffff\1\6\1\30\1\36\1\20\3\37\1\40\1\5\1\31\1\42\1\0\1\35\1\31";
    static final String dfa_4s = "\1\34\1\6\3\0\2\35\1\uffff\1\0\1\uffff\1\6\1\30\1\36\1\22\3\37\1\40\1\5\1\41\1\42\1\0\1\35\1\31";
    static final String dfa_5s = "\7\uffff\1\2\1\uffff\1\1\16\uffff";
    static final String dfa_6s = "\2\uffff\1\1\1\2\1\3\3\uffff\1\0\14\uffff\1\4\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\2\uffff\1\1",
            "\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\12",
            "\1\12",
            "",
            "\1\uffff",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\17\1\20",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\25\7\uffff\1\24",
            "\1\26",
            "\1\uffff",
            "\1\27",
            "\1\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1410:2: ( rule__Rule__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_21 = input.LA(1);

                         
                        int index13_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index13_21);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1422:2: ( rule__Rule__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001200F800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001000F802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001020F802L});

}
