package org.xtext.policy.ide.contentassist.antlr.internal;

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
import org.xtext.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'obfuscate'", "'deny'", "'R'", "'RW'", "'restrictive'", "'permissive'", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "'query'", "'priority'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:178:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:182:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:183:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:183:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:184:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:185:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:185:4: rule__AccessibilityLevel__Alternatives
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
    // InternalRules.g:194:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:198:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:199:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:199:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:200:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:201:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:201:4: rule__OperationType__Alternatives
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


    // $ANTLR start "ruleResolutionType"
    // InternalRules.g:210:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:214:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:215:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:215:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:216:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:217:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:217:4: rule__ResolutionType__Alternatives
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


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalRules.g:225:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'obfuscate' ) ) | ( ( 'deny' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:229:1: ( ( ( 'allow' ) ) | ( ( 'obfuscate' ) ) | ( ( 'deny' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRules.g:230:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:230:2: ( ( 'allow' ) )
                    // InternalRules.g:231:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:232:3: ( 'allow' )
                    // InternalRules.g:232:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:236:2: ( ( 'obfuscate' ) )
                    {
                    // InternalRules.g:236:2: ( ( 'obfuscate' ) )
                    // InternalRules.g:237:3: ( 'obfuscate' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:238:3: ( 'obfuscate' )
                    // InternalRules.g:238:4: 'obfuscate'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:242:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:242:2: ( ( 'deny' ) )
                    // InternalRules.g:243:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2()); 
                    // InternalRules.g:244:3: ( 'deny' )
                    // InternalRules.g:244:4: 'deny'
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
    // InternalRules.g:252:1: rule__OperationType__Alternatives : ( ( ( 'R' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:256:1: ( ( ( 'R' ) ) | ( ( 'RW' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRules.g:257:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:257:2: ( ( 'R' ) )
                    // InternalRules.g:258:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalRules.g:259:3: ( 'R' )
                    // InternalRules.g:259:4: 'R'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:263:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:263:2: ( ( 'RW' ) )
                    // InternalRules.g:264:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:265:3: ( 'RW' )
                    // InternalRules.g:265:4: 'RW'
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


    // $ANTLR start "rule__ResolutionType__Alternatives"
    // InternalRules.g:273:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:277:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRules.g:278:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:278:2: ( ( 'restrictive' ) )
                    // InternalRules.g:279:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:280:3: ( 'restrictive' )
                    // InternalRules.g:280:4: 'restrictive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:284:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:284:2: ( ( 'permissive' ) )
                    // InternalRules.g:285:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:286:3: ( 'permissive' )
                    // InternalRules.g:286:4: 'permissive'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalRules.g:294:1: rule__Policy__Group_0__0 : rule__Policy__Group_0__0__Impl rule__Policy__Group_0__1 ;
    public final void rule__Policy__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:298:1: ( rule__Policy__Group_0__0__Impl rule__Policy__Group_0__1 )
            // InternalRules.g:299:2: rule__Policy__Group_0__0__Impl rule__Policy__Group_0__1
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
    // InternalRules.g:306:1: rule__Policy__Group_0__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:310:1: ( ( 'policy' ) )
            // InternalRules.g:311:1: ( 'policy' )
            {
            // InternalRules.g:311:1: ( 'policy' )
            // InternalRules.g:312:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRules.g:321:1: rule__Policy__Group_0__1 : rule__Policy__Group_0__1__Impl ;
    public final void rule__Policy__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:325:1: ( rule__Policy__Group_0__1__Impl )
            // InternalRules.g:326:2: rule__Policy__Group_0__1__Impl
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
    // InternalRules.g:332:1: rule__Policy__Group_0__1__Impl : ( ( rule__Policy__NameAssignment_0_1 ) ) ;
    public final void rule__Policy__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:336:1: ( ( ( rule__Policy__NameAssignment_0_1 ) ) )
            // InternalRules.g:337:1: ( ( rule__Policy__NameAssignment_0_1 ) )
            {
            // InternalRules.g:337:1: ( ( rule__Policy__NameAssignment_0_1 ) )
            // InternalRules.g:338:2: ( rule__Policy__NameAssignment_0_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_0_1()); 
            // InternalRules.g:339:2: ( rule__Policy__NameAssignment_0_1 )
            // InternalRules.g:339:3: rule__Policy__NameAssignment_0_1
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
    // InternalRules.g:348:1: rule__Policy__Group_2__0 : rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1 ;
    public final void rule__Policy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:352:1: ( rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1 )
            // InternalRules.g:353:2: rule__Policy__Group_2__0__Impl rule__Policy__Group_2__1
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
    // InternalRules.g:360:1: rule__Policy__Group_2__0__Impl : ( ( rule__Policy__OperationAssignment_2_0 ) ) ;
    public final void rule__Policy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:364:1: ( ( ( rule__Policy__OperationAssignment_2_0 ) ) )
            // InternalRules.g:365:1: ( ( rule__Policy__OperationAssignment_2_0 ) )
            {
            // InternalRules.g:365:1: ( ( rule__Policy__OperationAssignment_2_0 ) )
            // InternalRules.g:366:2: ( rule__Policy__OperationAssignment_2_0 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_2_0()); 
            // InternalRules.g:367:2: ( rule__Policy__OperationAssignment_2_0 )
            // InternalRules.g:367:3: rule__Policy__OperationAssignment_2_0
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
    // InternalRules.g:375:1: rule__Policy__Group_2__1 : rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2 ;
    public final void rule__Policy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:379:1: ( rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2 )
            // InternalRules.g:380:2: rule__Policy__Group_2__1__Impl rule__Policy__Group_2__2
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
    // InternalRules.g:387:1: rule__Policy__Group_2__1__Impl : ( 'by' ) ;
    public final void rule__Policy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:391:1: ( ( 'by' ) )
            // InternalRules.g:392:1: ( 'by' )
            {
            // InternalRules.g:392:1: ( 'by' )
            // InternalRules.g:393:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRules.g:402:1: rule__Policy__Group_2__2 : rule__Policy__Group_2__2__Impl rule__Policy__Group_2__3 ;
    public final void rule__Policy__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:406:1: ( rule__Policy__Group_2__2__Impl rule__Policy__Group_2__3 )
            // InternalRules.g:407:2: rule__Policy__Group_2__2__Impl rule__Policy__Group_2__3
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
    // InternalRules.g:414:1: rule__Policy__Group_2__2__Impl : ( 'default' ) ;
    public final void rule__Policy__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:418:1: ( ( 'default' ) )
            // InternalRules.g:419:1: ( 'default' )
            {
            // InternalRules.g:419:1: ( 'default' )
            // InternalRules.g:420:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRules.g:429:1: rule__Policy__Group_2__3 : rule__Policy__Group_2__3__Impl rule__Policy__Group_2__4 ;
    public final void rule__Policy__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:433:1: ( rule__Policy__Group_2__3__Impl rule__Policy__Group_2__4 )
            // InternalRules.g:434:2: rule__Policy__Group_2__3__Impl rule__Policy__Group_2__4
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
    // InternalRules.g:441:1: rule__Policy__Group_2__3__Impl : ( '{' ) ;
    public final void rule__Policy__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:445:1: ( ( '{' ) )
            // InternalRules.g:446:1: ( '{' )
            {
            // InternalRules.g:446:1: ( '{' )
            // InternalRules.g:447:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRules.g:456:1: rule__Policy__Group_2__4 : rule__Policy__Group_2__4__Impl rule__Policy__Group_2__5 ;
    public final void rule__Policy__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:460:1: ( rule__Policy__Group_2__4__Impl rule__Policy__Group_2__5 )
            // InternalRules.g:461:2: rule__Policy__Group_2__4__Impl rule__Policy__Group_2__5
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
    // InternalRules.g:468:1: rule__Policy__Group_2__4__Impl : ( ( rule__Policy__RulesAssignment_2_4 )* ) ;
    public final void rule__Policy__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:472:1: ( ( ( rule__Policy__RulesAssignment_2_4 )* ) )
            // InternalRules.g:473:1: ( ( rule__Policy__RulesAssignment_2_4 )* )
            {
            // InternalRules.g:473:1: ( ( rule__Policy__RulesAssignment_2_4 )* )
            // InternalRules.g:474:2: ( rule__Policy__RulesAssignment_2_4 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_2_4()); 
            // InternalRules.g:475:2: ( rule__Policy__RulesAssignment_2_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=15)||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRules.g:475:3: rule__Policy__RulesAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Policy__RulesAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalRules.g:483:1: rule__Policy__Group_2__5 : rule__Policy__Group_2__5__Impl rule__Policy__Group_2__6 ;
    public final void rule__Policy__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:487:1: ( rule__Policy__Group_2__5__Impl rule__Policy__Group_2__6 )
            // InternalRules.g:488:2: rule__Policy__Group_2__5__Impl rule__Policy__Group_2__6
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
    // InternalRules.g:495:1: rule__Policy__Group_2__5__Impl : ( '}' ) ;
    public final void rule__Policy__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:499:1: ( ( '}' ) )
            // InternalRules.g:500:1: ( '}' )
            {
            // InternalRules.g:500:1: ( '}' )
            // InternalRules.g:501:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:510:1: rule__Policy__Group_2__6 : rule__Policy__Group_2__6__Impl rule__Policy__Group_2__7 ;
    public final void rule__Policy__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:514:1: ( rule__Policy__Group_2__6__Impl rule__Policy__Group_2__7 )
            // InternalRules.g:515:2: rule__Policy__Group_2__6__Impl rule__Policy__Group_2__7
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
    // InternalRules.g:522:1: rule__Policy__Group_2__6__Impl : ( 'with' ) ;
    public final void rule__Policy__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:526:1: ( ( 'with' ) )
            // InternalRules.g:527:1: ( 'with' )
            {
            // InternalRules.g:527:1: ( 'with' )
            // InternalRules.g:528:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_2_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:537:1: rule__Policy__Group_2__7 : rule__Policy__Group_2__7__Impl rule__Policy__Group_2__8 ;
    public final void rule__Policy__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:541:1: ( rule__Policy__Group_2__7__Impl rule__Policy__Group_2__8 )
            // InternalRules.g:542:2: rule__Policy__Group_2__7__Impl rule__Policy__Group_2__8
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
    // InternalRules.g:549:1: rule__Policy__Group_2__7__Impl : ( ( rule__Policy__ResolutionAssignment_2_7 ) ) ;
    public final void rule__Policy__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:553:1: ( ( ( rule__Policy__ResolutionAssignment_2_7 ) ) )
            // InternalRules.g:554:1: ( ( rule__Policy__ResolutionAssignment_2_7 ) )
            {
            // InternalRules.g:554:1: ( ( rule__Policy__ResolutionAssignment_2_7 ) )
            // InternalRules.g:555:2: ( rule__Policy__ResolutionAssignment_2_7 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_2_7()); 
            // InternalRules.g:556:2: ( rule__Policy__ResolutionAssignment_2_7 )
            // InternalRules.g:556:3: rule__Policy__ResolutionAssignment_2_7
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
    // InternalRules.g:564:1: rule__Policy__Group_2__8 : rule__Policy__Group_2__8__Impl ;
    public final void rule__Policy__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:568:1: ( rule__Policy__Group_2__8__Impl )
            // InternalRules.g:569:2: rule__Policy__Group_2__8__Impl
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
    // InternalRules.g:575:1: rule__Policy__Group_2__8__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:579:1: ( ( 'resolution' ) )
            // InternalRules.g:580:1: ( 'resolution' )
            {
            // InternalRules.g:580:1: ( 'resolution' )
            // InternalRules.g:581:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_2_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:591:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:595:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalRules.g:596:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
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
    // InternalRules.g:603:1: rule__Rule__Group_0__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:607:1: ( ( 'rule' ) )
            // InternalRules.g:608:1: ( 'rule' )
            {
            // InternalRules.g:608:1: ( 'rule' )
            // InternalRules.g:609:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRules.g:618:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:622:1: ( rule__Rule__Group_0__1__Impl )
            // InternalRules.g:623:2: rule__Rule__Group_0__1__Impl
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
    // InternalRules.g:629:1: rule__Rule__Group_0__1__Impl : ( ( rule__Rule__NameAssignment_0_1 ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:633:1: ( ( ( rule__Rule__NameAssignment_0_1 ) ) )
            // InternalRules.g:634:1: ( ( rule__Rule__NameAssignment_0_1 ) )
            {
            // InternalRules.g:634:1: ( ( rule__Rule__NameAssignment_0_1 ) )
            // InternalRules.g:635:2: ( rule__Rule__NameAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0_1()); 
            // InternalRules.g:636:2: ( rule__Rule__NameAssignment_0_1 )
            // InternalRules.g:636:3: rule__Rule__NameAssignment_0_1
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
    // InternalRules.g:645:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:649:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // InternalRules.g:650:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
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
    // InternalRules.g:657:1: rule__Rule__Group_2__0__Impl : ( ( rule__Rule__OperationAssignment_2_0 ) ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:661:1: ( ( ( rule__Rule__OperationAssignment_2_0 ) ) )
            // InternalRules.g:662:1: ( ( rule__Rule__OperationAssignment_2_0 ) )
            {
            // InternalRules.g:662:1: ( ( rule__Rule__OperationAssignment_2_0 ) )
            // InternalRules.g:663:2: ( rule__Rule__OperationAssignment_2_0 )
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_2_0()); 
            // InternalRules.g:664:2: ( rule__Rule__OperationAssignment_2_0 )
            // InternalRules.g:664:3: rule__Rule__OperationAssignment_2_0
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
    // InternalRules.g:672:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:676:1: ( rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 )
            // InternalRules.g:677:2: rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2
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
    // InternalRules.g:684:1: rule__Rule__Group_2__1__Impl : ( 'to' ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:688:1: ( ( 'to' ) )
            // InternalRules.g:689:1: ( 'to' )
            {
            // InternalRules.g:689:1: ( 'to' )
            // InternalRules.g:690:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_2_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRules.g:699:1: rule__Rule__Group_2__2 : rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 ;
    public final void rule__Rule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:703:1: ( rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 )
            // InternalRules.g:704:2: rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3
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
    // InternalRules.g:711:1: rule__Rule__Group_2__2__Impl : ( ( rule__Rule__UserAssignment_2_2 ) ) ;
    public final void rule__Rule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:715:1: ( ( ( rule__Rule__UserAssignment_2_2 ) ) )
            // InternalRules.g:716:1: ( ( rule__Rule__UserAssignment_2_2 ) )
            {
            // InternalRules.g:716:1: ( ( rule__Rule__UserAssignment_2_2 ) )
            // InternalRules.g:717:2: ( rule__Rule__UserAssignment_2_2 )
            {
             before(grammarAccess.getRuleAccess().getUserAssignment_2_2()); 
            // InternalRules.g:718:2: ( rule__Rule__UserAssignment_2_2 )
            // InternalRules.g:718:3: rule__Rule__UserAssignment_2_2
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
    // InternalRules.g:726:1: rule__Rule__Group_2__3 : rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4 ;
    public final void rule__Rule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:730:1: ( rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4 )
            // InternalRules.g:731:2: rule__Rule__Group_2__3__Impl rule__Rule__Group_2__4
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
    // InternalRules.g:738:1: rule__Rule__Group_2__3__Impl : ( '{' ) ;
    public final void rule__Rule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:742:1: ( ( '{' ) )
            // InternalRules.g:743:1: ( '{' )
            {
            // InternalRules.g:743:1: ( '{' )
            // InternalRules.g:744:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRules.g:753:1: rule__Rule__Group_2__4 : rule__Rule__Group_2__4__Impl rule__Rule__Group_2__5 ;
    public final void rule__Rule__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:757:1: ( rule__Rule__Group_2__4__Impl rule__Rule__Group_2__5 )
            // InternalRules.g:758:2: rule__Rule__Group_2__4__Impl rule__Rule__Group_2__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalRules.g:765:1: rule__Rule__Group_2__4__Impl : ( 'query' ) ;
    public final void rule__Rule__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:769:1: ( ( 'query' ) )
            // InternalRules.g:770:1: ( 'query' )
            {
            // InternalRules.g:770:1: ( 'query' )
            // InternalRules.g:771:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_2_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_2_4()); 

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
    // InternalRules.g:780:1: rule__Rule__Group_2__5 : rule__Rule__Group_2__5__Impl rule__Rule__Group_2__6 ;
    public final void rule__Rule__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:784:1: ( rule__Rule__Group_2__5__Impl rule__Rule__Group_2__6 )
            // InternalRules.g:785:2: rule__Rule__Group_2__5__Impl rule__Rule__Group_2__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalRules.g:792:1: rule__Rule__Group_2__5__Impl : ( ( rule__Rule__QueryAssignment_2_5 ) ) ;
    public final void rule__Rule__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:796:1: ( ( ( rule__Rule__QueryAssignment_2_5 ) ) )
            // InternalRules.g:797:1: ( ( rule__Rule__QueryAssignment_2_5 ) )
            {
            // InternalRules.g:797:1: ( ( rule__Rule__QueryAssignment_2_5 ) )
            // InternalRules.g:798:2: ( rule__Rule__QueryAssignment_2_5 )
            {
             before(grammarAccess.getRuleAccess().getQueryAssignment_2_5()); 
            // InternalRules.g:799:2: ( rule__Rule__QueryAssignment_2_5 )
            // InternalRules.g:799:3: rule__Rule__QueryAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QueryAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQueryAssignment_2_5()); 

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
    // InternalRules.g:807:1: rule__Rule__Group_2__6 : rule__Rule__Group_2__6__Impl rule__Rule__Group_2__7 ;
    public final void rule__Rule__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:811:1: ( rule__Rule__Group_2__6__Impl rule__Rule__Group_2__7 )
            // InternalRules.g:812:2: rule__Rule__Group_2__6__Impl rule__Rule__Group_2__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalRules.g:819:1: rule__Rule__Group_2__6__Impl : ( '}' ) ;
    public final void rule__Rule__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:823:1: ( ( '}' ) )
            // InternalRules.g:824:1: ( '}' )
            {
            // InternalRules.g:824:1: ( '}' )
            // InternalRules.g:825:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_2_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_2_6()); 

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
    // InternalRules.g:834:1: rule__Rule__Group_2__7 : rule__Rule__Group_2__7__Impl ;
    public final void rule__Rule__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:838:1: ( rule__Rule__Group_2__7__Impl )
            // InternalRules.g:839:2: rule__Rule__Group_2__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__7__Impl();

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
    // InternalRules.g:845:1: rule__Rule__Group_2__7__Impl : ( ( rule__Rule__Group_2_7__0 )? ) ;
    public final void rule__Rule__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:849:1: ( ( ( rule__Rule__Group_2_7__0 )? ) )
            // InternalRules.g:850:1: ( ( rule__Rule__Group_2_7__0 )? )
            {
            // InternalRules.g:850:1: ( ( rule__Rule__Group_2_7__0 )? )
            // InternalRules.g:851:2: ( rule__Rule__Group_2_7__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2_7()); 
            // InternalRules.g:852:2: ( rule__Rule__Group_2_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:852:3: rule__Rule__Group_2_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2_7()); 

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


    // $ANTLR start "rule__Rule__Group_2_7__0"
    // InternalRules.g:861:1: rule__Rule__Group_2_7__0 : rule__Rule__Group_2_7__0__Impl rule__Rule__Group_2_7__1 ;
    public final void rule__Rule__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:865:1: ( rule__Rule__Group_2_7__0__Impl rule__Rule__Group_2_7__1 )
            // InternalRules.g:866:2: rule__Rule__Group_2_7__0__Impl rule__Rule__Group_2_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group_2_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_7__1();

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
    // $ANTLR end "rule__Rule__Group_2_7__0"


    // $ANTLR start "rule__Rule__Group_2_7__0__Impl"
    // InternalRules.g:873:1: rule__Rule__Group_2_7__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:877:1: ( ( 'with' ) )
            // InternalRules.g:878:1: ( 'with' )
            {
            // InternalRules.g:878:1: ( 'with' )
            // InternalRules.g:879:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_2_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_2_7_0()); 

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
    // $ANTLR end "rule__Rule__Group_2_7__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_7__1"
    // InternalRules.g:888:1: rule__Rule__Group_2_7__1 : rule__Rule__Group_2_7__1__Impl rule__Rule__Group_2_7__2 ;
    public final void rule__Rule__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:892:1: ( rule__Rule__Group_2_7__1__Impl rule__Rule__Group_2_7__2 )
            // InternalRules.g:893:2: rule__Rule__Group_2_7__1__Impl rule__Rule__Group_2_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group_2_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_7__2();

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
    // $ANTLR end "rule__Rule__Group_2_7__1"


    // $ANTLR start "rule__Rule__Group_2_7__1__Impl"
    // InternalRules.g:900:1: rule__Rule__Group_2_7__1__Impl : ( ( rule__Rule__PriorityAssignment_2_7_1 ) ) ;
    public final void rule__Rule__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:904:1: ( ( ( rule__Rule__PriorityAssignment_2_7_1 ) ) )
            // InternalRules.g:905:1: ( ( rule__Rule__PriorityAssignment_2_7_1 ) )
            {
            // InternalRules.g:905:1: ( ( rule__Rule__PriorityAssignment_2_7_1 ) )
            // InternalRules.g:906:2: ( rule__Rule__PriorityAssignment_2_7_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_2_7_1()); 
            // InternalRules.g:907:2: ( rule__Rule__PriorityAssignment_2_7_1 )
            // InternalRules.g:907:3: rule__Rule__PriorityAssignment_2_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PriorityAssignment_2_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPriorityAssignment_2_7_1()); 

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
    // $ANTLR end "rule__Rule__Group_2_7__1__Impl"


    // $ANTLR start "rule__Rule__Group_2_7__2"
    // InternalRules.g:915:1: rule__Rule__Group_2_7__2 : rule__Rule__Group_2_7__2__Impl ;
    public final void rule__Rule__Group_2_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:919:1: ( rule__Rule__Group_2_7__2__Impl )
            // InternalRules.g:920:2: rule__Rule__Group_2_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2_7__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_2_7__2"


    // $ANTLR start "rule__Rule__Group_2_7__2__Impl"
    // InternalRules.g:926:1: rule__Rule__Group_2_7__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_2_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:930:1: ( ( 'priority' ) )
            // InternalRules.g:931:1: ( 'priority' )
            {
            // InternalRules.g:931:1: ( 'priority' )
            // InternalRules.g:932:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_2_7_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityKeyword_2_7_2()); 

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
    // $ANTLR end "rule__Rule__Group_2_7__2__Impl"


    // $ANTLR start "rule__Policy__UnorderedGroup"
    // InternalRules.g:942:1: rule__Policy__UnorderedGroup : rule__Policy__UnorderedGroup__0 {...}?;
    public final void rule__Policy__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPolicyAccess().getUnorderedGroup());
        	
        try {
            // InternalRules.g:947:1: ( rule__Policy__UnorderedGroup__0 {...}?)
            // InternalRules.g:948:2: rule__Policy__UnorderedGroup__0 {...}?
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
    // InternalRules.g:956:1: rule__Policy__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) ) ;
    public final void rule__Policy__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRules.g:961:1: ( ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) ) )
            // InternalRules.g:962:3: ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) )
            {
            // InternalRules.g:962:3: ( ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 >= 11 && LA6_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                alt6=2;
            }
            else if ( LA6_0 >= 14 && LA6_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRules.g:963:3: ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) )
                    {
                    // InternalRules.g:963:3: ({...}? => ( ( ( rule__Policy__Group_0__0 ) ) ) )
                    // InternalRules.g:964:4: {...}? => ( ( ( rule__Policy__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalRules.g:964:100: ( ( ( rule__Policy__Group_0__0 ) ) )
                    // InternalRules.g:965:5: ( ( rule__Policy__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:971:5: ( ( rule__Policy__Group_0__0 ) )
                    // InternalRules.g:972:6: ( rule__Policy__Group_0__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_0()); 
                    // InternalRules.g:973:6: ( rule__Policy__Group_0__0 )
                    // InternalRules.g:973:7: rule__Policy__Group_0__0
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
                    // InternalRules.g:978:3: ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) )
                    {
                    // InternalRules.g:978:3: ({...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) ) )
                    // InternalRules.g:979:4: {...}? => ( ( ( rule__Policy__AccessAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalRules.g:979:100: ( ( ( rule__Policy__AccessAssignment_1 ) ) )
                    // InternalRules.g:980:5: ( ( rule__Policy__AccessAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:986:5: ( ( rule__Policy__AccessAssignment_1 ) )
                    // InternalRules.g:987:6: ( rule__Policy__AccessAssignment_1 )
                    {
                     before(grammarAccess.getPolicyAccess().getAccessAssignment_1()); 
                    // InternalRules.g:988:6: ( rule__Policy__AccessAssignment_1 )
                    // InternalRules.g:988:7: rule__Policy__AccessAssignment_1
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
                    // InternalRules.g:993:3: ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) )
                    {
                    // InternalRules.g:993:3: ({...}? => ( ( ( rule__Policy__Group_2__0 ) ) ) )
                    // InternalRules.g:994:4: {...}? => ( ( ( rule__Policy__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Policy__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalRules.g:994:100: ( ( ( rule__Policy__Group_2__0 ) ) )
                    // InternalRules.g:995:5: ( ( rule__Policy__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1001:5: ( ( rule__Policy__Group_2__0 ) )
                    // InternalRules.g:1002:6: ( rule__Policy__Group_2__0 )
                    {
                     before(grammarAccess.getPolicyAccess().getGroup_2()); 
                    // InternalRules.g:1003:6: ( rule__Policy__Group_2__0 )
                    // InternalRules.g:1003:7: rule__Policy__Group_2__0
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
    // InternalRules.g:1016:1: rule__Policy__UnorderedGroup__0 : rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__1 )? ;
    public final void rule__Policy__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1020:1: ( rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__1 )? )
            // InternalRules.g:1021:2: rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__Policy__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1022:2: ( rule__Policy__UnorderedGroup__1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 >= 11 && LA7_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 >= 14 && LA7_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRules.g:1022:2: rule__Policy__UnorderedGroup__1
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
    // InternalRules.g:1028:1: rule__Policy__UnorderedGroup__1 : rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__2 )? ;
    public final void rule__Policy__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1032:1: ( rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__2 )? )
            // InternalRules.g:1033:2: rule__Policy__UnorderedGroup__Impl ( rule__Policy__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_17);
            rule__Policy__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1034:2: ( rule__Policy__UnorderedGroup__2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 >= 11 && LA8_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 >= 14 && LA8_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRules.g:1034:2: rule__Policy__UnorderedGroup__2
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
    // InternalRules.g:1040:1: rule__Policy__UnorderedGroup__2 : rule__Policy__UnorderedGroup__Impl ;
    public final void rule__Policy__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1044:1: ( rule__Policy__UnorderedGroup__Impl )
            // InternalRules.g:1045:2: rule__Policy__UnorderedGroup__Impl
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
    // InternalRules.g:1052:1: rule__Rule__UnorderedGroup : rule__Rule__UnorderedGroup__0 {...}?;
    public final void rule__Rule__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRuleAccess().getUnorderedGroup());
        	
        try {
            // InternalRules.g:1057:1: ( rule__Rule__UnorderedGroup__0 {...}?)
            // InternalRules.g:1058:2: rule__Rule__UnorderedGroup__0 {...}?
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
    // InternalRules.g:1066:1: rule__Rule__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) ) ;
    public final void rule__Rule__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRules.g:1071:1: ( ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) ) )
            // InternalRules.g:1072:3: ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) )
            {
            // InternalRules.g:1072:3: ( ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 >= 11 && LA9_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {
                alt9=2;
            }
            else if ( LA9_0 >= 14 && LA9_0 <= 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRules.g:1073:3: ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) )
                    {
                    // InternalRules.g:1073:3: ({...}? => ( ( ( rule__Rule__Group_0__0 ) ) ) )
                    // InternalRules.g:1074:4: {...}? => ( ( ( rule__Rule__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalRules.g:1074:98: ( ( ( rule__Rule__Group_0__0 ) ) )
                    // InternalRules.g:1075:5: ( ( rule__Rule__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1081:5: ( ( rule__Rule__Group_0__0 ) )
                    // InternalRules.g:1082:6: ( rule__Rule__Group_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_0()); 
                    // InternalRules.g:1083:6: ( rule__Rule__Group_0__0 )
                    // InternalRules.g:1083:7: rule__Rule__Group_0__0
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
                    // InternalRules.g:1088:3: ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) )
                    {
                    // InternalRules.g:1088:3: ({...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) ) )
                    // InternalRules.g:1089:4: {...}? => ( ( ( rule__Rule__AccessAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalRules.g:1089:98: ( ( ( rule__Rule__AccessAssignment_1 ) ) )
                    // InternalRules.g:1090:5: ( ( rule__Rule__AccessAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1096:5: ( ( rule__Rule__AccessAssignment_1 ) )
                    // InternalRules.g:1097:6: ( rule__Rule__AccessAssignment_1 )
                    {
                     before(grammarAccess.getRuleAccess().getAccessAssignment_1()); 
                    // InternalRules.g:1098:6: ( rule__Rule__AccessAssignment_1 )
                    // InternalRules.g:1098:7: rule__Rule__AccessAssignment_1
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
                    // InternalRules.g:1103:3: ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) )
                    {
                    // InternalRules.g:1103:3: ({...}? => ( ( ( rule__Rule__Group_2__0 ) ) ) )
                    // InternalRules.g:1104:4: {...}? => ( ( ( rule__Rule__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Rule__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalRules.g:1104:98: ( ( ( rule__Rule__Group_2__0 ) ) )
                    // InternalRules.g:1105:5: ( ( rule__Rule__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRules.g:1111:5: ( ( rule__Rule__Group_2__0 ) )
                    // InternalRules.g:1112:6: ( rule__Rule__Group_2__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2()); 
                    // InternalRules.g:1113:6: ( rule__Rule__Group_2__0 )
                    // InternalRules.g:1113:7: rule__Rule__Group_2__0
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
    // InternalRules.g:1126:1: rule__Rule__UnorderedGroup__0 : rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__1 )? ;
    public final void rule__Rule__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1130:1: ( rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__1 )? )
            // InternalRules.g:1131:2: rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_8);
            rule__Rule__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1132:2: ( rule__Rule__UnorderedGroup__1 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalRules.g:1132:2: rule__Rule__UnorderedGroup__1
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
    // InternalRules.g:1138:1: rule__Rule__UnorderedGroup__1 : rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__2 )? ;
    public final void rule__Rule__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1142:1: ( rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__2 )? )
            // InternalRules.g:1143:2: rule__Rule__UnorderedGroup__Impl ( rule__Rule__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_8);
            rule__Rule__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRules.g:1144:2: ( rule__Rule__UnorderedGroup__2 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalRules.g:1144:2: rule__Rule__UnorderedGroup__2
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
    // InternalRules.g:1150:1: rule__Rule__UnorderedGroup__2 : rule__Rule__UnorderedGroup__Impl ;
    public final void rule__Rule__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1154:1: ( rule__Rule__UnorderedGroup__Impl )
            // InternalRules.g:1155:2: rule__Rule__UnorderedGroup__Impl
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
    // InternalRules.g:1162:1: rule__Model__PolicyAssignment : ( rulePolicy ) ;
    public final void rule__Model__PolicyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1166:1: ( ( rulePolicy ) )
            // InternalRules.g:1167:2: ( rulePolicy )
            {
            // InternalRules.g:1167:2: ( rulePolicy )
            // InternalRules.g:1168:3: rulePolicy
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
    // InternalRules.g:1177:1: rule__Policy__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1181:1: ( ( RULE_ID ) )
            // InternalRules.g:1182:2: ( RULE_ID )
            {
            // InternalRules.g:1182:2: ( RULE_ID )
            // InternalRules.g:1183:3: RULE_ID
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
    // InternalRules.g:1192:1: rule__Policy__AccessAssignment_1 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1196:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:1197:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:1197:2: ( ruleAccessibilityLevel )
            // InternalRules.g:1198:3: ruleAccessibilityLevel
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
    // InternalRules.g:1207:1: rule__Policy__OperationAssignment_2_0 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1211:1: ( ( ruleOperationType ) )
            // InternalRules.g:1212:2: ( ruleOperationType )
            {
            // InternalRules.g:1212:2: ( ruleOperationType )
            // InternalRules.g:1213:3: ruleOperationType
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
    // InternalRules.g:1222:1: rule__Policy__RulesAssignment_2_4 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1226:1: ( ( ruleRule ) )
            // InternalRules.g:1227:2: ( ruleRule )
            {
            // InternalRules.g:1227:2: ( ruleRule )
            // InternalRules.g:1228:3: ruleRule
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
    // InternalRules.g:1237:1: rule__Policy__ResolutionAssignment_2_7 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1241:1: ( ( ruleResolutionType ) )
            // InternalRules.g:1242:2: ( ruleResolutionType )
            {
            // InternalRules.g:1242:2: ( ruleResolutionType )
            // InternalRules.g:1243:3: ruleResolutionType
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
    // InternalRules.g:1252:1: rule__Rule__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1256:1: ( ( RULE_ID ) )
            // InternalRules.g:1257:2: ( RULE_ID )
            {
            // InternalRules.g:1257:2: ( RULE_ID )
            // InternalRules.g:1258:3: RULE_ID
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
    // InternalRules.g:1267:1: rule__Rule__AccessAssignment_1 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1271:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:1272:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:1272:2: ( ruleAccessibilityLevel )
            // InternalRules.g:1273:3: ruleAccessibilityLevel
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
    // InternalRules.g:1282:1: rule__Rule__OperationAssignment_2_0 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1286:1: ( ( ruleOperationType ) )
            // InternalRules.g:1287:2: ( ruleOperationType )
            {
            // InternalRules.g:1287:2: ( ruleOperationType )
            // InternalRules.g:1288:3: ruleOperationType
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
    // InternalRules.g:1297:1: rule__Rule__UserAssignment_2_2 : ( ruleUser ) ;
    public final void rule__Rule__UserAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1301:1: ( ( ruleUser ) )
            // InternalRules.g:1302:2: ( ruleUser )
            {
            // InternalRules.g:1302:2: ( ruleUser )
            // InternalRules.g:1303:3: ruleUser
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


    // $ANTLR start "rule__Rule__QueryAssignment_2_5"
    // InternalRules.g:1312:1: rule__Rule__QueryAssignment_2_5 : ( ruleQuery ) ;
    public final void rule__Rule__QueryAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1316:1: ( ( ruleQuery ) )
            // InternalRules.g:1317:2: ( ruleQuery )
            {
            // InternalRules.g:1317:2: ( ruleQuery )
            // InternalRules.g:1318:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_5_0()); 

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
    // $ANTLR end "rule__Rule__QueryAssignment_2_5"


    // $ANTLR start "rule__Rule__PriorityAssignment_2_7_1"
    // InternalRules.g:1327:1: rule__Rule__PriorityAssignment_2_7_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1331:1: ( ( RULE_INT ) )
            // InternalRules.g:1332:2: ( RULE_INT )
            {
            // InternalRules.g:1332:2: ( RULE_INT )
            // InternalRules.g:1333:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_2_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_2_7_1_0()); 

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
    // $ANTLR end "rule__Rule__PriorityAssignment_2_7_1"


    // $ANTLR start "rule__User__NameAssignment"
    // InternalRules.g:1342:1: rule__User__NameAssignment : ( RULE_ID ) ;
    public final void rule__User__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1346:1: ( ( RULE_ID ) )
            // InternalRules.g:1347:2: ( RULE_ID )
            {
            // InternalRules.g:1347:2: ( RULE_ID )
            // InternalRules.g:1348:3: RULE_ID
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
    // InternalRules.g:1357:1: rule__Query__NameAssignment : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1361:1: ( ( RULE_ID ) )
            // InternalRules.g:1362:2: ( RULE_ID )
            {
            // InternalRules.g:1362:2: ( RULE_ID )
            // InternalRules.g:1363:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0()); 

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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\7\17\uffff";
    static final String dfa_3s = "\1\13\1\4\3\0\2\32\1\uffff\1\0\1\uffff\1\4\1\25\1\33\1\4\1\26\1\0";
    static final String dfa_4s = "\1\31\1\4\3\0\2\32\1\uffff\1\0\1\uffff\1\4\1\25\1\33\1\4\1\26\1\0";
    static final String dfa_5s = "\7\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String dfa_6s = "\2\uffff\1\0\1\1\1\2\3\uffff\1\3\6\uffff\1\4}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\6\uffff\1\7\2\uffff\1\1",
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
            "\1\16",
            "\1\17",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1132:2: ( rule__Rule__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_15 = input.LA(1);

                         
                        int index10_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index10_15);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\2\uffff\1\2\1\3\1\4\3\uffff\1\1\6\uffff\1\0}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1144:2: ( rule__Rule__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 7;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000240F800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000200F802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000204F802L});

}
