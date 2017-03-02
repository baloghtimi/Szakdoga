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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "'select'", "'from'", "'query'", "','", "'priority'", "'user'", "'group'", "'obj('", "')'", "'ref('", "'->'", "'where'", "'bound'"
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
    // InternalRules.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRules.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalRules.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalRules.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalRules.g:69:3: ( rule__Model__Group__0 )
            // InternalRules.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // InternalRules.g:87:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:91:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalRules.g:92:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalRules.g:92:2: ( ( rule__Policy__Group__0 ) )
            // InternalRules.g:93:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalRules.g:94:3: ( rule__Policy__Group__0 )
            // InternalRules.g:94:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

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
    // InternalRules.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRules.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRules.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalRules.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRules.g:119:3: ( rule__Rule__Group__0 )
            // InternalRules.g:119:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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


    // $ANTLR start "entryRuleRole"
    // InternalRules.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalRules.g:129:1: ( ruleRole EOF )
            // InternalRules.g:130:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalRules.g:137:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:141:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalRules.g:142:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalRules.g:142:2: ( ( rule__Role__Alternatives ) )
            // InternalRules.g:143:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalRules.g:144:3: ( rule__Role__Alternatives )
            // InternalRules.g:144:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // InternalRules.g:153:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalRules.g:154:1: ( ruleUser EOF )
            // InternalRules.g:155:1: ruleUser EOF
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
    // InternalRules.g:162:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:166:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalRules.g:167:2: ( ( rule__User__Group__0 ) )
            {
            // InternalRules.g:167:2: ( ( rule__User__Group__0 ) )
            // InternalRules.g:168:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalRules.g:169:3: ( rule__User__Group__0 )
            // InternalRules.g:169:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

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


    // $ANTLR start "entryRuleGroup"
    // InternalRules.g:178:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalRules.g:179:1: ( ruleGroup EOF )
            // InternalRules.g:180:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalRules.g:187:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:191:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalRules.g:192:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalRules.g:192:2: ( ( rule__Group__Group__0 ) )
            // InternalRules.g:193:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalRules.g:194:3: ( rule__Group__Group__0 )
            // InternalRules.g:194:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAsset"
    // InternalRules.g:203:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // InternalRules.g:204:1: ( ruleAsset EOF )
            // InternalRules.g:205:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getAssetRule()); 
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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalRules.g:212:1: ruleAsset : ( ( rule__Asset__Alternatives ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:216:2: ( ( ( rule__Asset__Alternatives ) ) )
            // InternalRules.g:217:2: ( ( rule__Asset__Alternatives ) )
            {
            // InternalRules.g:217:2: ( ( rule__Asset__Alternatives ) )
            // InternalRules.g:218:3: ( rule__Asset__Alternatives )
            {
             before(grammarAccess.getAssetAccess().getAlternatives()); 
            // InternalRules.g:219:3: ( rule__Asset__Alternatives )
            // InternalRules.g:219:4: rule__Asset__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Asset__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleObjectFact"
    // InternalRules.g:228:1: entryRuleObjectFact : ruleObjectFact EOF ;
    public final void entryRuleObjectFact() throws RecognitionException {
        try {
            // InternalRules.g:229:1: ( ruleObjectFact EOF )
            // InternalRules.g:230:1: ruleObjectFact EOF
            {
             before(grammarAccess.getObjectFactRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectFact();

            state._fsp--;

             after(grammarAccess.getObjectFactRule()); 
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
    // $ANTLR end "entryRuleObjectFact"


    // $ANTLR start "ruleObjectFact"
    // InternalRules.g:237:1: ruleObjectFact : ( ( rule__ObjectFact__Group__0 ) ) ;
    public final void ruleObjectFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:241:2: ( ( ( rule__ObjectFact__Group__0 ) ) )
            // InternalRules.g:242:2: ( ( rule__ObjectFact__Group__0 ) )
            {
            // InternalRules.g:242:2: ( ( rule__ObjectFact__Group__0 ) )
            // InternalRules.g:243:3: ( rule__ObjectFact__Group__0 )
            {
             before(grammarAccess.getObjectFactAccess().getGroup()); 
            // InternalRules.g:244:3: ( rule__ObjectFact__Group__0 )
            // InternalRules.g:244:4: rule__ObjectFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectFact"


    // $ANTLR start "entryRuleReferenceFact"
    // InternalRules.g:253:1: entryRuleReferenceFact : ruleReferenceFact EOF ;
    public final void entryRuleReferenceFact() throws RecognitionException {
        try {
            // InternalRules.g:254:1: ( ruleReferenceFact EOF )
            // InternalRules.g:255:1: ruleReferenceFact EOF
            {
             before(grammarAccess.getReferenceFactRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceFact();

            state._fsp--;

             after(grammarAccess.getReferenceFactRule()); 
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
    // $ANTLR end "entryRuleReferenceFact"


    // $ANTLR start "ruleReferenceFact"
    // InternalRules.g:262:1: ruleReferenceFact : ( ( rule__ReferenceFact__Group__0 ) ) ;
    public final void ruleReferenceFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:266:2: ( ( ( rule__ReferenceFact__Group__0 ) ) )
            // InternalRules.g:267:2: ( ( rule__ReferenceFact__Group__0 ) )
            {
            // InternalRules.g:267:2: ( ( rule__ReferenceFact__Group__0 ) )
            // InternalRules.g:268:3: ( rule__ReferenceFact__Group__0 )
            {
             before(grammarAccess.getReferenceFactAccess().getGroup()); 
            // InternalRules.g:269:3: ( rule__ReferenceFact__Group__0 )
            // InternalRules.g:269:4: rule__ReferenceFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getGroup()); 

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
    // $ANTLR end "ruleReferenceFact"


    // $ANTLR start "entryRuleQuery"
    // InternalRules.g:278:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalRules.g:279:1: ( ruleQuery EOF )
            // InternalRules.g:280:1: ruleQuery EOF
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
    // InternalRules.g:287:1: ruleQuery : ( ( rule__Query__PatternAssignment ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:291:2: ( ( ( rule__Query__PatternAssignment ) ) )
            // InternalRules.g:292:2: ( ( rule__Query__PatternAssignment ) )
            {
            // InternalRules.g:292:2: ( ( rule__Query__PatternAssignment ) )
            // InternalRules.g:293:3: ( rule__Query__PatternAssignment )
            {
             before(grammarAccess.getQueryAccess().getPatternAssignment()); 
            // InternalRules.g:294:3: ( rule__Query__PatternAssignment )
            // InternalRules.g:294:4: rule__Query__PatternAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Query__PatternAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getPatternAssignment()); 

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


    // $ANTLR start "entryRuleBinding"
    // InternalRules.g:303:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalRules.g:304:1: ( ruleBinding EOF )
            // InternalRules.g:305:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalRules.g:312:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:316:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalRules.g:317:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalRules.g:317:2: ( ( rule__Binding__Group__0 ) )
            // InternalRules.g:318:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalRules.g:319:3: ( rule__Binding__Group__0 )
            // InternalRules.g:319:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleParameter"
    // InternalRules.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRules.g:329:1: ( ruleParameter EOF )
            // InternalRules.g:330:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRules.g:337:1: ruleParameter : ( ( rule__Parameter__VariableAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:341:2: ( ( ( rule__Parameter__VariableAssignment ) ) )
            // InternalRules.g:342:2: ( ( rule__Parameter__VariableAssignment ) )
            {
            // InternalRules.g:342:2: ( ( rule__Parameter__VariableAssignment ) )
            // InternalRules.g:343:3: ( rule__Parameter__VariableAssignment )
            {
             before(grammarAccess.getParameterAccess().getVariableAssignment()); 
            // InternalRules.g:344:3: ( rule__Parameter__VariableAssignment )
            // InternalRules.g:344:4: rule__Parameter__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getVariableAssignment()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBind"
    // InternalRules.g:353:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalRules.g:354:1: ( ruleBind EOF )
            // InternalRules.g:355:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
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
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalRules.g:362:1: ruleBind : ( ruleObjectBind ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:366:2: ( ( ruleObjectBind ) )
            // InternalRules.g:367:2: ( ruleObjectBind )
            {
            // InternalRules.g:367:2: ( ruleObjectBind )
            // InternalRules.g:368:3: ruleObjectBind
            {
             before(grammarAccess.getBindAccess().getObjectBindParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleObjectBind();

            state._fsp--;

             after(grammarAccess.getBindAccess().getObjectBindParserRuleCall()); 

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
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleObjectBind"
    // InternalRules.g:378:1: entryRuleObjectBind : ruleObjectBind EOF ;
    public final void entryRuleObjectBind() throws RecognitionException {
        try {
            // InternalRules.g:379:1: ( ruleObjectBind EOF )
            // InternalRules.g:380:1: ruleObjectBind EOF
            {
             before(grammarAccess.getObjectBindRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectBind();

            state._fsp--;

             after(grammarAccess.getObjectBindRule()); 
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
    // $ANTLR end "entryRuleObjectBind"


    // $ANTLR start "ruleObjectBind"
    // InternalRules.g:387:1: ruleObjectBind : ( ( rule__ObjectBind__ObjectAssignment ) ) ;
    public final void ruleObjectBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:391:2: ( ( ( rule__ObjectBind__ObjectAssignment ) ) )
            // InternalRules.g:392:2: ( ( rule__ObjectBind__ObjectAssignment ) )
            {
            // InternalRules.g:392:2: ( ( rule__ObjectBind__ObjectAssignment ) )
            // InternalRules.g:393:3: ( rule__ObjectBind__ObjectAssignment )
            {
             before(grammarAccess.getObjectBindAccess().getObjectAssignment()); 
            // InternalRules.g:394:3: ( rule__ObjectBind__ObjectAssignment )
            // InternalRules.g:394:4: rule__ObjectBind__ObjectAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ObjectBind__ObjectAssignment();

            state._fsp--;


            }

             after(grammarAccess.getObjectBindAccess().getObjectAssignment()); 

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
    // $ANTLR end "ruleObjectBind"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:403:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:407:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:408:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:408:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:409:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:410:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:410:4: rule__AccessibilityLevel__Alternatives
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
    // InternalRules.g:419:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:423:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:424:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:424:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:425:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:426:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:426:4: rule__OperationType__Alternatives
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
    // InternalRules.g:435:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:439:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:440:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:440:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:441:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:442:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:442:4: rule__ResolutionType__Alternatives
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


    // $ANTLR start "rule__Role__Alternatives"
    // InternalRules.g:450:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:454:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:455:2: ( ruleUser )
                    {
                    // InternalRules.g:455:2: ( ruleUser )
                    // InternalRules.g:456:3: ruleUser
                    {
                     before(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:461:2: ( ruleGroup )
                    {
                    // InternalRules.g:461:2: ( ruleGroup )
                    // InternalRules.g:462:3: ruleGroup
                    {
                     before(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getGroupParserRuleCall_1()); 

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
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__Asset__Alternatives"
    // InternalRules.g:471:1: rule__Asset__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) );
    public final void rule__Asset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:475:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRules.g:476:2: ( ruleObjectFact )
                    {
                    // InternalRules.g:476:2: ( ruleObjectFact )
                    // InternalRules.g:477:3: ruleObjectFact
                    {
                     before(grammarAccess.getAssetAccess().getObjectFactParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getObjectFactParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:482:2: ( ruleReferenceFact )
                    {
                    // InternalRules.g:482:2: ( ruleReferenceFact )
                    // InternalRules.g:483:3: ruleReferenceFact
                    {
                     before(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1()); 

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
    // $ANTLR end "rule__Asset__Alternatives"


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalRules.g:492:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'deny' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:496:1: ( ( ( 'allow' ) ) | ( ( 'deny' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRules.g:497:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:497:2: ( ( 'allow' ) )
                    // InternalRules.g:498:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:499:3: ( 'allow' )
                    // InternalRules.g:499:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:503:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:503:2: ( ( 'deny' ) )
                    // InternalRules.g:504:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 
                    // InternalRules.g:505:3: ( 'deny' )
                    // InternalRules.g:505:4: 'deny'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 

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
    // InternalRules.g:513:1: rule__OperationType__Alternatives : ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:517:1: ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
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
                    // InternalRules.g:518:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:518:2: ( ( 'R' ) )
                    // InternalRules.g:519:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalRules.g:520:3: ( 'R' )
                    // InternalRules.g:520:4: 'R'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:524:2: ( ( 'W' ) )
                    {
                    // InternalRules.g:524:2: ( ( 'W' ) )
                    // InternalRules.g:525:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:526:3: ( 'W' )
                    // InternalRules.g:526:4: 'W'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:530:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:530:2: ( ( 'RW' ) )
                    // InternalRules.g:531:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:532:3: ( 'RW' )
                    // InternalRules.g:532:4: 'RW'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2()); 

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
    // InternalRules.g:540:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:544:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:545:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:545:2: ( ( 'restrictive' ) )
                    // InternalRules.g:546:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:547:3: ( 'restrictive' )
                    // InternalRules.g:547:4: 'restrictive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:551:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:551:2: ( ( 'permissive' ) )
                    // InternalRules.g:552:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:553:3: ( 'permissive' )
                    // InternalRules.g:553:4: 'permissive'
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalRules.g:561:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:565:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRules.g:566:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalRules.g:573:1: rule__Model__Group__0__Impl : ( ( rule__Model__RolesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:577:1: ( ( ( rule__Model__RolesAssignment_0 )* ) )
            // InternalRules.g:578:1: ( ( rule__Model__RolesAssignment_0 )* )
            {
            // InternalRules.g:578:1: ( ( rule__Model__RolesAssignment_0 )* )
            // InternalRules.g:579:2: ( rule__Model__RolesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_0()); 
            // InternalRules.g:580:2: ( rule__Model__RolesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=32 && LA6_0<=33)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRules.g:580:3: rule__Model__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRolesAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalRules.g:588:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:592:1: ( rule__Model__Group__1__Impl )
            // InternalRules.g:593:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalRules.g:599:1: rule__Model__Group__1__Impl : ( ( rule__Model__PolicyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:603:1: ( ( ( rule__Model__PolicyAssignment_1 ) ) )
            // InternalRules.g:604:1: ( ( rule__Model__PolicyAssignment_1 ) )
            {
            // InternalRules.g:604:1: ( ( rule__Model__PolicyAssignment_1 ) )
            // InternalRules.g:605:2: ( rule__Model__PolicyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPolicyAssignment_1()); 
            // InternalRules.g:606:2: ( rule__Model__PolicyAssignment_1 )
            // InternalRules.g:606:3: rule__Model__PolicyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PolicyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPolicyAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalRules.g:615:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:619:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalRules.g:620:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

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
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalRules.g:627:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:631:1: ( ( 'policy' ) )
            // InternalRules.g:632:1: ( 'policy' )
            {
            // InternalRules.g:632:1: ( 'policy' )
            // InternalRules.g:633:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

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
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalRules.g:642:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:646:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalRules.g:647:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

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
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalRules.g:654:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:658:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalRules.g:659:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalRules.g:659:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalRules.g:660:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalRules.g:661:2: ( rule__Policy__NameAssignment_1 )
            // InternalRules.g:661:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalRules.g:669:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:673:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalRules.g:674:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

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
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalRules.g:681:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__AccessAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:685:1: ( ( ( rule__Policy__AccessAssignment_2 ) ) )
            // InternalRules.g:686:1: ( ( rule__Policy__AccessAssignment_2 ) )
            {
            // InternalRules.g:686:1: ( ( rule__Policy__AccessAssignment_2 ) )
            // InternalRules.g:687:2: ( rule__Policy__AccessAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 
            // InternalRules.g:688:2: ( rule__Policy__AccessAssignment_2 )
            // InternalRules.g:688:3: rule__Policy__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Policy__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 

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
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalRules.g:696:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:700:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalRules.g:701:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

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
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalRules.g:708:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__OperationAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:712:1: ( ( ( rule__Policy__OperationAssignment_3 ) ) )
            // InternalRules.g:713:1: ( ( rule__Policy__OperationAssignment_3 ) )
            {
            // InternalRules.g:713:1: ( ( rule__Policy__OperationAssignment_3 ) )
            // InternalRules.g:714:2: ( rule__Policy__OperationAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 
            // InternalRules.g:715:2: ( rule__Policy__OperationAssignment_3 )
            // InternalRules.g:715:3: rule__Policy__OperationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Policy__OperationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 

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
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalRules.g:723:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:727:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalRules.g:728:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__5();

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
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalRules.g:735:1: rule__Policy__Group__4__Impl : ( 'by' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:739:1: ( ( 'by' ) )
            // InternalRules.g:740:1: ( 'by' )
            {
            // InternalRules.g:740:1: ( 'by' )
            // InternalRules.g:741:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getByKeyword_4()); 

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
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // InternalRules.g:750:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:754:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalRules.g:755:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__6();

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
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // InternalRules.g:762:1: rule__Policy__Group__5__Impl : ( 'default' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:766:1: ( ( 'default' ) )
            // InternalRules.g:767:1: ( 'default' )
            {
            // InternalRules.g:767:1: ( 'default' )
            // InternalRules.g:768:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 

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
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // InternalRules.g:777:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:781:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalRules.g:782:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__7();

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
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // InternalRules.g:789:1: rule__Policy__Group__6__Impl : ( '{' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:793:1: ( ( '{' ) )
            // InternalRules.g:794:1: ( '{' )
            {
            // InternalRules.g:794:1: ( '{' )
            // InternalRules.g:795:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Policy__Group__7"
    // InternalRules.g:804:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:808:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalRules.g:809:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__8();

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
    // $ANTLR end "rule__Policy__Group__7"


    // $ANTLR start "rule__Policy__Group__7__Impl"
    // InternalRules.g:816:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__RulesAssignment_7 )* ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:820:1: ( ( ( rule__Policy__RulesAssignment_7 )* ) )
            // InternalRules.g:821:1: ( ( rule__Policy__RulesAssignment_7 )* )
            {
            // InternalRules.g:821:1: ( ( rule__Policy__RulesAssignment_7 )* )
            // InternalRules.g:822:2: ( rule__Policy__RulesAssignment_7 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 
            // InternalRules.g:823:2: ( rule__Policy__RulesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:823:3: rule__Policy__RulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Policy__RulesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 

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
    // $ANTLR end "rule__Policy__Group__7__Impl"


    // $ANTLR start "rule__Policy__Group__8"
    // InternalRules.g:831:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:835:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalRules.g:836:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__9();

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
    // $ANTLR end "rule__Policy__Group__8"


    // $ANTLR start "rule__Policy__Group__8__Impl"
    // InternalRules.g:843:1: rule__Policy__Group__8__Impl : ( '}' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:847:1: ( ( '}' ) )
            // InternalRules.g:848:1: ( '}' )
            {
            // InternalRules.g:848:1: ( '}' )
            // InternalRules.g:849:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Policy__Group__8__Impl"


    // $ANTLR start "rule__Policy__Group__9"
    // InternalRules.g:858:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:862:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalRules.g:863:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Policy__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__10();

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
    // $ANTLR end "rule__Policy__Group__9"


    // $ANTLR start "rule__Policy__Group__9__Impl"
    // InternalRules.g:870:1: rule__Policy__Group__9__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:874:1: ( ( 'with' ) )
            // InternalRules.g:875:1: ( 'with' )
            {
            // InternalRules.g:875:1: ( 'with' )
            // InternalRules.g:876:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWithKeyword_9()); 

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
    // $ANTLR end "rule__Policy__Group__9__Impl"


    // $ANTLR start "rule__Policy__Group__10"
    // InternalRules.g:885:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl rule__Policy__Group__11 ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:889:1: ( rule__Policy__Group__10__Impl rule__Policy__Group__11 )
            // InternalRules.g:890:2: rule__Policy__Group__10__Impl rule__Policy__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Policy__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__11();

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
    // $ANTLR end "rule__Policy__Group__10"


    // $ANTLR start "rule__Policy__Group__10__Impl"
    // InternalRules.g:897:1: rule__Policy__Group__10__Impl : ( ( rule__Policy__ResolutionAssignment_10 ) ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:901:1: ( ( ( rule__Policy__ResolutionAssignment_10 ) ) )
            // InternalRules.g:902:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            {
            // InternalRules.g:902:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            // InternalRules.g:903:2: ( rule__Policy__ResolutionAssignment_10 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 
            // InternalRules.g:904:2: ( rule__Policy__ResolutionAssignment_10 )
            // InternalRules.g:904:3: rule__Policy__ResolutionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ResolutionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 

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
    // $ANTLR end "rule__Policy__Group__10__Impl"


    // $ANTLR start "rule__Policy__Group__11"
    // InternalRules.g:912:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:916:1: ( rule__Policy__Group__11__Impl )
            // InternalRules.g:917:2: rule__Policy__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__11__Impl();

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
    // $ANTLR end "rule__Policy__Group__11"


    // $ANTLR start "rule__Policy__Group__11__Impl"
    // InternalRules.g:923:1: rule__Policy__Group__11__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:927:1: ( ( 'resolution' ) )
            // InternalRules.g:928:1: ( 'resolution' )
            {
            // InternalRules.g:928:1: ( 'resolution' )
            // InternalRules.g:929:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 

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
    // $ANTLR end "rule__Policy__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRules.g:939:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:943:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRules.g:944:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalRules.g:951:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:955:1: ( ( 'rule' ) )
            // InternalRules.g:956:1: ( 'rule' )
            {
            // InternalRules.g:956:1: ( 'rule' )
            // InternalRules.g:957:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalRules.g:966:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:970:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRules.g:971:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalRules.g:978:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:982:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalRules.g:983:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalRules.g:983:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalRules.g:984:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalRules.g:985:2: ( rule__Rule__NameAssignment_1 )
            // InternalRules.g:985:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalRules.g:993:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:997:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRules.g:998:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalRules.g:1005:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AccessAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1009:1: ( ( ( rule__Rule__AccessAssignment_2 ) ) )
            // InternalRules.g:1010:1: ( ( rule__Rule__AccessAssignment_2 ) )
            {
            // InternalRules.g:1010:1: ( ( rule__Rule__AccessAssignment_2 ) )
            // InternalRules.g:1011:2: ( rule__Rule__AccessAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAccessAssignment_2()); 
            // InternalRules.g:1012:2: ( rule__Rule__AccessAssignment_2 )
            // InternalRules.g:1012:3: rule__Rule__AccessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AccessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAccessAssignment_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalRules.g:1020:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1024:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRules.g:1025:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalRules.g:1032:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperationAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1036:1: ( ( ( rule__Rule__OperationAssignment_3 ) ) )
            // InternalRules.g:1037:1: ( ( rule__Rule__OperationAssignment_3 ) )
            {
            // InternalRules.g:1037:1: ( ( rule__Rule__OperationAssignment_3 ) )
            // InternalRules.g:1038:2: ( rule__Rule__OperationAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_3()); 
            // InternalRules.g:1039:2: ( rule__Rule__OperationAssignment_3 )
            // InternalRules.g:1039:3: rule__Rule__OperationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OperationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOperationAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalRules.g:1047:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1051:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRules.g:1052:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalRules.g:1059:1: rule__Rule__Group__4__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1063:1: ( ( 'to' ) )
            // InternalRules.g:1064:1: ( 'to' )
            {
            // InternalRules.g:1064:1: ( 'to' )
            // InternalRules.g:1065:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalRules.g:1074:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1078:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRules.g:1079:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalRules.g:1086:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__RolesAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1090:1: ( ( ( rule__Rule__RolesAssignment_5 ) ) )
            // InternalRules.g:1091:1: ( ( rule__Rule__RolesAssignment_5 ) )
            {
            // InternalRules.g:1091:1: ( ( rule__Rule__RolesAssignment_5 ) )
            // InternalRules.g:1092:2: ( rule__Rule__RolesAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5()); 
            // InternalRules.g:1093:2: ( rule__Rule__RolesAssignment_5 )
            // InternalRules.g:1093:3: rule__Rule__RolesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalRules.g:1101:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1105:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRules.g:1106:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

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
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalRules.g:1113:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1117:1: ( ( ( rule__Rule__Group_6__0 )* ) )
            // InternalRules.g:1118:1: ( ( rule__Rule__Group_6__0 )* )
            {
            // InternalRules.g:1118:1: ( ( rule__Rule__Group_6__0 )* )
            // InternalRules.g:1119:2: ( rule__Rule__Group_6__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalRules.g:1120:2: ( rule__Rule__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:1120:3: rule__Rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalRules.g:1128:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1132:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRules.g:1133:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalRules.g:1140:1: rule__Rule__Group__7__Impl : ( '{' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1144:1: ( ( '{' ) )
            // InternalRules.g:1145:1: ( '{' )
            {
            // InternalRules.g:1145:1: ( '{' )
            // InternalRules.g:1146:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalRules.g:1155:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1159:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalRules.g:1160:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

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
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalRules.g:1167:1: rule__Rule__Group__8__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1171:1: ( ( 'select' ) )
            // InternalRules.g:1172:1: ( 'select' )
            {
            // InternalRules.g:1172:1: ( 'select' )
            // InternalRules.g:1173:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_8()); 

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
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalRules.g:1182:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1186:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalRules.g:1187:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__10();

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
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalRules.g:1194:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__AssetAssignment_9 ) ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1198:1: ( ( ( rule__Rule__AssetAssignment_9 ) ) )
            // InternalRules.g:1199:1: ( ( rule__Rule__AssetAssignment_9 ) )
            {
            // InternalRules.g:1199:1: ( ( rule__Rule__AssetAssignment_9 ) )
            // InternalRules.g:1200:2: ( rule__Rule__AssetAssignment_9 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_9()); 
            // InternalRules.g:1201:2: ( rule__Rule__AssetAssignment_9 )
            // InternalRules.g:1201:3: rule__Rule__AssetAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_9()); 

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
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalRules.g:1209:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1213:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalRules.g:1214:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__11();

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
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalRules.g:1221:1: rule__Rule__Group__10__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1225:1: ( ( 'from' ) )
            // InternalRules.g:1226:1: ( 'from' )
            {
            // InternalRules.g:1226:1: ( 'from' )
            // InternalRules.g:1227:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_10()); 

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
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__11"
    // InternalRules.g:1236:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1240:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalRules.g:1241:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__12();

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
    // $ANTLR end "rule__Rule__Group__11"


    // $ANTLR start "rule__Rule__Group__11__Impl"
    // InternalRules.g:1248:1: rule__Rule__Group__11__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1252:1: ( ( 'query' ) )
            // InternalRules.g:1253:1: ( 'query' )
            {
            // InternalRules.g:1253:1: ( 'query' )
            // InternalRules.g:1254:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_11()); 

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
    // $ANTLR end "rule__Rule__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__12"
    // InternalRules.g:1263:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1267:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalRules.g:1268:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__13();

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
    // $ANTLR end "rule__Rule__Group__12"


    // $ANTLR start "rule__Rule__Group__12__Impl"
    // InternalRules.g:1275:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__QueryAssignment_12 ) ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1279:1: ( ( ( rule__Rule__QueryAssignment_12 ) ) )
            // InternalRules.g:1280:1: ( ( rule__Rule__QueryAssignment_12 ) )
            {
            // InternalRules.g:1280:1: ( ( rule__Rule__QueryAssignment_12 ) )
            // InternalRules.g:1281:2: ( rule__Rule__QueryAssignment_12 )
            {
             before(grammarAccess.getRuleAccess().getQueryAssignment_12()); 
            // InternalRules.g:1282:2: ( rule__Rule__QueryAssignment_12 )
            // InternalRules.g:1282:3: rule__Rule__QueryAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QueryAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQueryAssignment_12()); 

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
    // $ANTLR end "rule__Rule__Group__12__Impl"


    // $ANTLR start "rule__Rule__Group__13"
    // InternalRules.g:1290:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1294:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalRules.g:1295:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__14();

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
    // $ANTLR end "rule__Rule__Group__13"


    // $ANTLR start "rule__Rule__Group__13__Impl"
    // InternalRules.g:1302:1: rule__Rule__Group__13__Impl : ( ( rule__Rule__BindingsAssignment_13 )* ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1306:1: ( ( ( rule__Rule__BindingsAssignment_13 )* ) )
            // InternalRules.g:1307:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            {
            // InternalRules.g:1307:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            // InternalRules.g:1308:2: ( rule__Rule__BindingsAssignment_13 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 
            // InternalRules.g:1309:2: ( rule__Rule__BindingsAssignment_13 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRules.g:1309:3: rule__Rule__BindingsAssignment_13
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__BindingsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 

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
    // $ANTLR end "rule__Rule__Group__13__Impl"


    // $ANTLR start "rule__Rule__Group__14"
    // InternalRules.g:1317:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl rule__Rule__Group__15 ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1321:1: ( rule__Rule__Group__14__Impl rule__Rule__Group__15 )
            // InternalRules.g:1322:2: rule__Rule__Group__14__Impl rule__Rule__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__15();

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
    // $ANTLR end "rule__Rule__Group__14"


    // $ANTLR start "rule__Rule__Group__14__Impl"
    // InternalRules.g:1329:1: rule__Rule__Group__14__Impl : ( '}' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1333:1: ( ( '}' ) )
            // InternalRules.g:1334:1: ( '}' )
            {
            // InternalRules.g:1334:1: ( '}' )
            // InternalRules.g:1335:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Rule__Group__14__Impl"


    // $ANTLR start "rule__Rule__Group__15"
    // InternalRules.g:1344:1: rule__Rule__Group__15 : rule__Rule__Group__15__Impl ;
    public final void rule__Rule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1348:1: ( rule__Rule__Group__15__Impl )
            // InternalRules.g:1349:2: rule__Rule__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__15__Impl();

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
    // $ANTLR end "rule__Rule__Group__15"


    // $ANTLR start "rule__Rule__Group__15__Impl"
    // InternalRules.g:1355:1: rule__Rule__Group__15__Impl : ( ( rule__Rule__Group_15__0 )? ) ;
    public final void rule__Rule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1359:1: ( ( ( rule__Rule__Group_15__0 )? ) )
            // InternalRules.g:1360:1: ( ( rule__Rule__Group_15__0 )? )
            {
            // InternalRules.g:1360:1: ( ( rule__Rule__Group_15__0 )? )
            // InternalRules.g:1361:2: ( rule__Rule__Group_15__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_15()); 
            // InternalRules.g:1362:2: ( rule__Rule__Group_15__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:1362:3: rule__Rule__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_15()); 

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
    // $ANTLR end "rule__Rule__Group__15__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalRules.g:1371:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1375:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalRules.g:1376:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

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
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalRules.g:1383:1: rule__Rule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1387:1: ( ( ',' ) )
            // InternalRules.g:1388:1: ( ',' )
            {
            // InternalRules.g:1388:1: ( ',' )
            // InternalRules.g:1389:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalRules.g:1398:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1402:1: ( rule__Rule__Group_6__1__Impl )
            // InternalRules.g:1403:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalRules.g:1409:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__RolesAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1413:1: ( ( ( rule__Rule__RolesAssignment_6_1 ) ) )
            // InternalRules.g:1414:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            {
            // InternalRules.g:1414:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            // InternalRules.g:1415:2: ( rule__Rule__RolesAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 
            // InternalRules.g:1416:2: ( rule__Rule__RolesAssignment_6_1 )
            // InternalRules.g:1416:3: rule__Rule__RolesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__RolesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 

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
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Rule__Group_15__0"
    // InternalRules.g:1425:1: rule__Rule__Group_15__0 : rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 ;
    public final void rule__Rule__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1429:1: ( rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 )
            // InternalRules.g:1430:2: rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__1();

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
    // $ANTLR end "rule__Rule__Group_15__0"


    // $ANTLR start "rule__Rule__Group_15__0__Impl"
    // InternalRules.g:1437:1: rule__Rule__Group_15__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1441:1: ( ( 'with' ) )
            // InternalRules.g:1442:1: ( 'with' )
            {
            // InternalRules.g:1442:1: ( 'with' )
            // InternalRules.g:1443:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 

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
    // $ANTLR end "rule__Rule__Group_15__0__Impl"


    // $ANTLR start "rule__Rule__Group_15__1"
    // InternalRules.g:1452:1: rule__Rule__Group_15__1 : rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 ;
    public final void rule__Rule__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1456:1: ( rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 )
            // InternalRules.g:1457:2: rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__2();

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
    // $ANTLR end "rule__Rule__Group_15__1"


    // $ANTLR start "rule__Rule__Group_15__1__Impl"
    // InternalRules.g:1464:1: rule__Rule__Group_15__1__Impl : ( ( rule__Rule__PriorityAssignment_15_1 ) ) ;
    public final void rule__Rule__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1468:1: ( ( ( rule__Rule__PriorityAssignment_15_1 ) ) )
            // InternalRules.g:1469:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            {
            // InternalRules.g:1469:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            // InternalRules.g:1470:2: ( rule__Rule__PriorityAssignment_15_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 
            // InternalRules.g:1471:2: ( rule__Rule__PriorityAssignment_15_1 )
            // InternalRules.g:1471:3: rule__Rule__PriorityAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PriorityAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 

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
    // $ANTLR end "rule__Rule__Group_15__1__Impl"


    // $ANTLR start "rule__Rule__Group_15__2"
    // InternalRules.g:1479:1: rule__Rule__Group_15__2 : rule__Rule__Group_15__2__Impl ;
    public final void rule__Rule__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1483:1: ( rule__Rule__Group_15__2__Impl )
            // InternalRules.g:1484:2: rule__Rule__Group_15__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_15__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_15__2"


    // $ANTLR start "rule__Rule__Group_15__2__Impl"
    // InternalRules.g:1490:1: rule__Rule__Group_15__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1494:1: ( ( 'priority' ) )
            // InternalRules.g:1495:1: ( 'priority' )
            {
            // InternalRules.g:1495:1: ( 'priority' )
            // InternalRules.g:1496:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 

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
    // $ANTLR end "rule__Rule__Group_15__2__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalRules.g:1506:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1510:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalRules.g:1511:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

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
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalRules.g:1518:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1522:1: ( ( 'user' ) )
            // InternalRules.g:1523:1: ( 'user' )
            {
            // InternalRules.g:1523:1: ( 'user' )
            // InternalRules.g:1524:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

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
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalRules.g:1533:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1537:1: ( rule__User__Group__1__Impl )
            // InternalRules.g:1538:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__1__Impl();

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
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalRules.g:1544:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1548:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalRules.g:1549:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalRules.g:1549:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalRules.g:1550:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalRules.g:1551:2: ( rule__User__NameAssignment_1 )
            // InternalRules.g:1551:3: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalRules.g:1560:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1564:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalRules.g:1565:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

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
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalRules.g:1572:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1576:1: ( ( 'group' ) )
            // InternalRules.g:1577:1: ( 'group' )
            {
            // InternalRules.g:1577:1: ( 'group' )
            // InternalRules.g:1578:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

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
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalRules.g:1587:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1591:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalRules.g:1592:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

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
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalRules.g:1599:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1603:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalRules.g:1604:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalRules.g:1604:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalRules.g:1605:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalRules.g:1606:2: ( rule__Group__NameAssignment_1 )
            // InternalRules.g:1606:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalRules.g:1614:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1618:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalRules.g:1619:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

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
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalRules.g:1626:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1630:1: ( ( '{' ) )
            // InternalRules.g:1631:1: ( '{' )
            {
            // InternalRules.g:1631:1: ( '{' )
            // InternalRules.g:1632:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalRules.g:1641:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1645:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalRules.g:1646:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

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
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalRules.g:1653:1: rule__Group__Group__3__Impl : ( ( rule__Group__UsersAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1657:1: ( ( ( rule__Group__UsersAssignment_3 ) ) )
            // InternalRules.g:1658:1: ( ( rule__Group__UsersAssignment_3 ) )
            {
            // InternalRules.g:1658:1: ( ( rule__Group__UsersAssignment_3 ) )
            // InternalRules.g:1659:2: ( rule__Group__UsersAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_3()); 
            // InternalRules.g:1660:2: ( rule__Group__UsersAssignment_3 )
            // InternalRules.g:1660:3: rule__Group__UsersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Group__UsersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getUsersAssignment_3()); 

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
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalRules.g:1668:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1672:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalRules.g:1673:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

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
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalRules.g:1680:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1684:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalRules.g:1685:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalRules.g:1685:1: ( ( rule__Group__Group_4__0 )* )
            // InternalRules.g:1686:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalRules.g:1687:2: ( rule__Group__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRules.g:1687:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalRules.g:1695:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1699:1: ( rule__Group__Group__5__Impl )
            // InternalRules.g:1700:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__5__Impl();

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
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalRules.g:1706:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1710:1: ( ( '}' ) )
            // InternalRules.g:1711:1: ( '}' )
            {
            // InternalRules.g:1711:1: ( '}' )
            // InternalRules.g:1712:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // InternalRules.g:1722:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1726:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalRules.g:1727:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_4__1();

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
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // InternalRules.g:1734:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1738:1: ( ( ',' ) )
            // InternalRules.g:1739:1: ( ',' )
            {
            // InternalRules.g:1739:1: ( ',' )
            // InternalRules.g:1740:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // InternalRules.g:1749:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1753:1: ( rule__Group__Group_4__1__Impl )
            // InternalRules.g:1754:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_4__1__Impl();

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
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // InternalRules.g:1760:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__UsersAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1764:1: ( ( ( rule__Group__UsersAssignment_4_1 ) ) )
            // InternalRules.g:1765:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            {
            // InternalRules.g:1765:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            // InternalRules.g:1766:2: ( rule__Group__UsersAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 
            // InternalRules.g:1767:2: ( rule__Group__UsersAssignment_4_1 )
            // InternalRules.g:1767:3: rule__Group__UsersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__UsersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 

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
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__0"
    // InternalRules.g:1776:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1780:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalRules.g:1781:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__1();

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
    // $ANTLR end "rule__ObjectFact__Group__0"


    // $ANTLR start "rule__ObjectFact__Group__0__Impl"
    // InternalRules.g:1788:1: rule__ObjectFact__Group__0__Impl : ( 'obj(' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1792:1: ( ( 'obj(' ) )
            // InternalRules.g:1793:1: ( 'obj(' )
            {
            // InternalRules.g:1793:1: ( 'obj(' )
            // InternalRules.g:1794:2: 'obj('
            {
             before(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 

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
    // $ANTLR end "rule__ObjectFact__Group__0__Impl"


    // $ANTLR start "rule__ObjectFact__Group__1"
    // InternalRules.g:1803:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1807:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalRules.g:1808:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ObjectFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__2();

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
    // $ANTLR end "rule__ObjectFact__Group__1"


    // $ANTLR start "rule__ObjectFact__Group__1__Impl"
    // InternalRules.g:1815:1: rule__ObjectFact__Group__1__Impl : ( ( rule__ObjectFact__ParameterAssignment_1 ) ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1819:1: ( ( ( rule__ObjectFact__ParameterAssignment_1 ) ) )
            // InternalRules.g:1820:1: ( ( rule__ObjectFact__ParameterAssignment_1 ) )
            {
            // InternalRules.g:1820:1: ( ( rule__ObjectFact__ParameterAssignment_1 ) )
            // InternalRules.g:1821:2: ( rule__ObjectFact__ParameterAssignment_1 )
            {
             before(grammarAccess.getObjectFactAccess().getParameterAssignment_1()); 
            // InternalRules.g:1822:2: ( rule__ObjectFact__ParameterAssignment_1 )
            // InternalRules.g:1822:3: rule__ObjectFact__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getParameterAssignment_1()); 

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
    // $ANTLR end "rule__ObjectFact__Group__1__Impl"


    // $ANTLR start "rule__ObjectFact__Group__2"
    // InternalRules.g:1830:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1834:1: ( rule__ObjectFact__Group__2__Impl )
            // InternalRules.g:1835:2: rule__ObjectFact__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__2__Impl();

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
    // $ANTLR end "rule__ObjectFact__Group__2"


    // $ANTLR start "rule__ObjectFact__Group__2__Impl"
    // InternalRules.g:1841:1: rule__ObjectFact__Group__2__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1845:1: ( ( ')' ) )
            // InternalRules.g:1846:1: ( ')' )
            {
            // InternalRules.g:1846:1: ( ')' )
            // InternalRules.g:1847:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ObjectFact__Group__2__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__0"
    // InternalRules.g:1857:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1861:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalRules.g:1862:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__1();

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
    // $ANTLR end "rule__ReferenceFact__Group__0"


    // $ANTLR start "rule__ReferenceFact__Group__0__Impl"
    // InternalRules.g:1869:1: rule__ReferenceFact__Group__0__Impl : ( 'ref(' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1873:1: ( ( 'ref(' ) )
            // InternalRules.g:1874:1: ( 'ref(' )
            {
            // InternalRules.g:1874:1: ( 'ref(' )
            // InternalRules.g:1875:2: 'ref('
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__0__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__1"
    // InternalRules.g:1884:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1888:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalRules.g:1889:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__ReferenceFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__2();

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
    // $ANTLR end "rule__ReferenceFact__Group__1"


    // $ANTLR start "rule__ReferenceFact__Group__1__Impl"
    // InternalRules.g:1896:1: rule__ReferenceFact__Group__1__Impl : ( ( rule__ReferenceFact__SourceParamAssignment_1 ) ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1900:1: ( ( ( rule__ReferenceFact__SourceParamAssignment_1 ) ) )
            // InternalRules.g:1901:1: ( ( rule__ReferenceFact__SourceParamAssignment_1 ) )
            {
            // InternalRules.g:1901:1: ( ( rule__ReferenceFact__SourceParamAssignment_1 ) )
            // InternalRules.g:1902:2: ( rule__ReferenceFact__SourceParamAssignment_1 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceParamAssignment_1()); 
            // InternalRules.g:1903:2: ( rule__ReferenceFact__SourceParamAssignment_1 )
            // InternalRules.g:1903:3: rule__ReferenceFact__SourceParamAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__SourceParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getSourceParamAssignment_1()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__1__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__2"
    // InternalRules.g:1911:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1915:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalRules.g:1916:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ReferenceFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__3();

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
    // $ANTLR end "rule__ReferenceFact__Group__2"


    // $ANTLR start "rule__ReferenceFact__Group__2__Impl"
    // InternalRules.g:1923:1: rule__ReferenceFact__Group__2__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1927:1: ( ( '->' ) )
            // InternalRules.g:1928:1: ( '->' )
            {
            // InternalRules.g:1928:1: ( '->' )
            // InternalRules.g:1929:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__2__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__3"
    // InternalRules.g:1938:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1942:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalRules.g:1943:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__4();

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
    // $ANTLR end "rule__ReferenceFact__Group__3"


    // $ANTLR start "rule__ReferenceFact__Group__3__Impl"
    // InternalRules.g:1950:1: rule__ReferenceFact__Group__3__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1954:1: ( ( '->' ) )
            // InternalRules.g:1955:1: ( '->' )
            {
            // InternalRules.g:1955:1: ( '->' )
            // InternalRules.g:1956:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__4"
    // InternalRules.g:1965:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1969:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalRules.g:1970:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__ReferenceFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__5();

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
    // $ANTLR end "rule__ReferenceFact__Group__4"


    // $ANTLR start "rule__ReferenceFact__Group__4__Impl"
    // InternalRules.g:1977:1: rule__ReferenceFact__Group__4__Impl : ( ( rule__ReferenceFact__TargetParamAssignment_4 ) ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1981:1: ( ( ( rule__ReferenceFact__TargetParamAssignment_4 ) ) )
            // InternalRules.g:1982:1: ( ( rule__ReferenceFact__TargetParamAssignment_4 ) )
            {
            // InternalRules.g:1982:1: ( ( rule__ReferenceFact__TargetParamAssignment_4 ) )
            // InternalRules.g:1983:2: ( rule__ReferenceFact__TargetParamAssignment_4 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetParamAssignment_4()); 
            // InternalRules.g:1984:2: ( rule__ReferenceFact__TargetParamAssignment_4 )
            // InternalRules.g:1984:3: rule__ReferenceFact__TargetParamAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__TargetParamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getTargetParamAssignment_4()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__4__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__5"
    // InternalRules.g:1992:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1996:1: ( rule__ReferenceFact__Group__5__Impl )
            // InternalRules.g:1997:2: rule__ReferenceFact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__5__Impl();

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
    // $ANTLR end "rule__ReferenceFact__Group__5"


    // $ANTLR start "rule__ReferenceFact__Group__5__Impl"
    // InternalRules.g:2003:1: rule__ReferenceFact__Group__5__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2007:1: ( ( ')' ) )
            // InternalRules.g:2008:1: ( ')' )
            {
            // InternalRules.g:2008:1: ( ')' )
            // InternalRules.g:2009:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalRules.g:2019:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2023:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalRules.g:2024:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalRules.g:2031:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2035:1: ( ( 'where' ) )
            // InternalRules.g:2036:1: ( 'where' )
            {
            // InternalRules.g:2036:1: ( 'where' )
            // InternalRules.g:2037:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getWhereKeyword_0()); 

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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalRules.g:2046:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2050:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalRules.g:2051:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalRules.g:2058:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__ParameterAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2062:1: ( ( ( rule__Binding__ParameterAssignment_1 ) ) )
            // InternalRules.g:2063:1: ( ( rule__Binding__ParameterAssignment_1 ) )
            {
            // InternalRules.g:2063:1: ( ( rule__Binding__ParameterAssignment_1 ) )
            // InternalRules.g:2064:2: ( rule__Binding__ParameterAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getParameterAssignment_1()); 
            // InternalRules.g:2065:2: ( rule__Binding__ParameterAssignment_1 )
            // InternalRules.g:2065:3: rule__Binding__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getParameterAssignment_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalRules.g:2073:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2077:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalRules.g:2078:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalRules.g:2085:1: rule__Binding__Group__2__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2089:1: ( ( 'bound' ) )
            // InternalRules.g:2090:1: ( 'bound' )
            {
            // InternalRules.g:2090:1: ( 'bound' )
            // InternalRules.g:2091:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBoundKeyword_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalRules.g:2100:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2104:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalRules.g:2105:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

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
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalRules.g:2112:1: rule__Binding__Group__3__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2116:1: ( ( 'to' ) )
            // InternalRules.g:2117:1: ( 'to' )
            {
            // InternalRules.g:2117:1: ( 'to' )
            // InternalRules.g:2118:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getToKeyword_3()); 

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
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalRules.g:2127:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2131:1: ( rule__Binding__Group__4__Impl )
            // InternalRules.g:2132:2: rule__Binding__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__4__Impl();

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
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalRules.g:2138:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__BindAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2142:1: ( ( ( rule__Binding__BindAssignment_4 ) ) )
            // InternalRules.g:2143:1: ( ( rule__Binding__BindAssignment_4 ) )
            {
            // InternalRules.g:2143:1: ( ( rule__Binding__BindAssignment_4 ) )
            // InternalRules.g:2144:2: ( rule__Binding__BindAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_4()); 
            // InternalRules.g:2145:2: ( rule__Binding__BindAssignment_4 )
            // InternalRules.g:2145:3: rule__Binding__BindAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindAssignment_4()); 

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
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Model__RolesAssignment_0"
    // InternalRules.g:2154:1: rule__Model__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2158:1: ( ( ruleRole ) )
            // InternalRules.g:2159:2: ( ruleRole )
            {
            // InternalRules.g:2159:2: ( ruleRole )
            // InternalRules.g:2160:3: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__RolesAssignment_0"


    // $ANTLR start "rule__Model__PolicyAssignment_1"
    // InternalRules.g:2169:1: rule__Model__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__Model__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2173:1: ( ( rulePolicy ) )
            // InternalRules.g:2174:2: ( rulePolicy )
            {
            // InternalRules.g:2174:2: ( rulePolicy )
            // InternalRules.g:2175:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__PolicyAssignment_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalRules.g:2184:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2188:1: ( ( RULE_ID ) )
            // InternalRules.g:2189:2: ( RULE_ID )
            {
            // InternalRules.g:2189:2: ( RULE_ID )
            // InternalRules.g:2190:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__AccessAssignment_2"
    // InternalRules.g:2199:1: rule__Policy__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2203:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2204:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2204:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2205:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Policy__AccessAssignment_2"


    // $ANTLR start "rule__Policy__OperationAssignment_3"
    // InternalRules.g:2214:1: rule__Policy__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2218:1: ( ( ruleOperationType ) )
            // InternalRules.g:2219:2: ( ruleOperationType )
            {
            // InternalRules.g:2219:2: ( ruleOperationType )
            // InternalRules.g:2220:3: ruleOperationType
            {
             before(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Policy__OperationAssignment_3"


    // $ANTLR start "rule__Policy__RulesAssignment_7"
    // InternalRules.g:2229:1: rule__Policy__RulesAssignment_7 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2233:1: ( ( ruleRule ) )
            // InternalRules.g:2234:2: ( ruleRule )
            {
            // InternalRules.g:2234:2: ( ruleRule )
            // InternalRules.g:2235:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Policy__RulesAssignment_7"


    // $ANTLR start "rule__Policy__ResolutionAssignment_10"
    // InternalRules.g:2244:1: rule__Policy__ResolutionAssignment_10 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2248:1: ( ( ruleResolutionType ) )
            // InternalRules.g:2249:2: ( ruleResolutionType )
            {
            // InternalRules.g:2249:2: ( ruleResolutionType )
            // InternalRules.g:2250:3: ruleResolutionType
            {
             before(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleResolutionType();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__Policy__ResolutionAssignment_10"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalRules.g:2259:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2263:1: ( ( RULE_ID ) )
            // InternalRules.g:2264:2: ( RULE_ID )
            {
            // InternalRules.g:2264:2: ( RULE_ID )
            // InternalRules.g:2265:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__AccessAssignment_2"
    // InternalRules.g:2274:1: rule__Rule__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2278:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2279:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2279:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2280:3: ruleAccessibilityLevel
            {
             before(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessibilityLevel();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__AccessAssignment_2"


    // $ANTLR start "rule__Rule__OperationAssignment_3"
    // InternalRules.g:2289:1: rule__Rule__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2293:1: ( ( ruleOperationType ) )
            // InternalRules.g:2294:2: ( ruleOperationType )
            {
            // InternalRules.g:2294:2: ( ruleOperationType )
            // InternalRules.g:2295:3: ruleOperationType
            {
             before(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__OperationAssignment_3"


    // $ANTLR start "rule__Rule__RolesAssignment_5"
    // InternalRules.g:2304:1: rule__Rule__RolesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2308:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2309:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2309:2: ( ( RULE_ID ) )
            // InternalRules.g:2310:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 
            // InternalRules.g:2311:3: ( RULE_ID )
            // InternalRules.g:2312:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 

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
    // $ANTLR end "rule__Rule__RolesAssignment_5"


    // $ANTLR start "rule__Rule__RolesAssignment_6_1"
    // InternalRules.g:2323:1: rule__Rule__RolesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2327:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2328:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2328:2: ( ( RULE_ID ) )
            // InternalRules.g:2329:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 
            // InternalRules.g:2330:3: ( RULE_ID )
            // InternalRules.g:2331:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRolesRoleIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Rule__RolesAssignment_6_1"


    // $ANTLR start "rule__Rule__AssetAssignment_9"
    // InternalRules.g:2342:1: rule__Rule__AssetAssignment_9 : ( ruleAsset ) ;
    public final void rule__Rule__AssetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2346:1: ( ( ruleAsset ) )
            // InternalRules.g:2347:2: ( ruleAsset )
            {
            // InternalRules.g:2347:2: ( ruleAsset )
            // InternalRules.g:2348:3: ruleAsset
            {
             before(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Rule__AssetAssignment_9"


    // $ANTLR start "rule__Rule__QueryAssignment_12"
    // InternalRules.g:2357:1: rule__Rule__QueryAssignment_12 : ( ruleQuery ) ;
    public final void rule__Rule__QueryAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2361:1: ( ( ruleQuery ) )
            // InternalRules.g:2362:2: ( ruleQuery )
            {
            // InternalRules.g:2362:2: ( ruleQuery )
            // InternalRules.g:2363:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Rule__QueryAssignment_12"


    // $ANTLR start "rule__Rule__BindingsAssignment_13"
    // InternalRules.g:2372:1: rule__Rule__BindingsAssignment_13 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2376:1: ( ( ruleBinding ) )
            // InternalRules.g:2377:2: ( ruleBinding )
            {
            // InternalRules.g:2377:2: ( ruleBinding )
            // InternalRules.g:2378:3: ruleBinding
            {
             before(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBindingsBindingParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Rule__BindingsAssignment_13"


    // $ANTLR start "rule__Rule__PriorityAssignment_15_1"
    // InternalRules.g:2387:1: rule__Rule__PriorityAssignment_15_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2391:1: ( ( RULE_INT ) )
            // InternalRules.g:2392:2: ( RULE_INT )
            {
            // InternalRules.g:2392:2: ( RULE_INT )
            // InternalRules.g:2393:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_15_1_0()); 

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
    // $ANTLR end "rule__Rule__PriorityAssignment_15_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalRules.g:2402:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2406:1: ( ( RULE_ID ) )
            // InternalRules.g:2407:2: ( RULE_ID )
            {
            // InternalRules.g:2407:2: ( RULE_ID )
            // InternalRules.g:2408:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // InternalRules.g:2417:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2421:1: ( ( RULE_ID ) )
            // InternalRules.g:2422:2: ( RULE_ID )
            {
            // InternalRules.g:2422:2: ( RULE_ID )
            // InternalRules.g:2423:3: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__UsersAssignment_3"
    // InternalRules.g:2432:1: rule__Group__UsersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2436:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2437:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2437:2: ( ( RULE_ID ) )
            // InternalRules.g:2438:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            // InternalRules.g:2439:3: ( RULE_ID )
            // InternalRules.g:2440:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 

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
    // $ANTLR end "rule__Group__UsersAssignment_3"


    // $ANTLR start "rule__Group__UsersAssignment_4_1"
    // InternalRules.g:2451:1: rule__Group__UsersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2455:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2456:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2456:2: ( ( RULE_ID ) )
            // InternalRules.g:2457:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 
            // InternalRules.g:2458:3: ( RULE_ID )
            // InternalRules.g:2459:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getUsersUserIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Group__UsersAssignment_4_1"


    // $ANTLR start "rule__ObjectFact__ParameterAssignment_1"
    // InternalRules.g:2470:1: rule__ObjectFact__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ObjectFact__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2474:1: ( ( ruleParameter ) )
            // InternalRules.g:2475:2: ( ruleParameter )
            {
            // InternalRules.g:2475:2: ( ruleParameter )
            // InternalRules.g:2476:3: ruleParameter
            {
             before(grammarAccess.getObjectFactAccess().getParameterParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getObjectFactAccess().getParameterParameterParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectFact__ParameterAssignment_1"


    // $ANTLR start "rule__ReferenceFact__SourceParamAssignment_1"
    // InternalRules.g:2485:1: rule__ReferenceFact__SourceParamAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceFact__SourceParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2489:1: ( ( ruleParameter ) )
            // InternalRules.g:2490:2: ( ruleParameter )
            {
            // InternalRules.g:2490:2: ( ruleParameter )
            // InternalRules.g:2491:3: ruleParameter
            {
             before(grammarAccess.getReferenceFactAccess().getSourceParamParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getReferenceFactAccess().getSourceParamParameterParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReferenceFact__SourceParamAssignment_1"


    // $ANTLR start "rule__ReferenceFact__TargetParamAssignment_4"
    // InternalRules.g:2500:1: rule__ReferenceFact__TargetParamAssignment_4 : ( ruleParameter ) ;
    public final void rule__ReferenceFact__TargetParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2504:1: ( ( ruleParameter ) )
            // InternalRules.g:2505:2: ( ruleParameter )
            {
            // InternalRules.g:2505:2: ( ruleParameter )
            // InternalRules.g:2506:3: ruleParameter
            {
             before(grammarAccess.getReferenceFactAccess().getTargetParamParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getReferenceFactAccess().getTargetParamParameterParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ReferenceFact__TargetParamAssignment_4"


    // $ANTLR start "rule__Query__PatternAssignment"
    // InternalRules.g:2515:1: rule__Query__PatternAssignment : ( ( RULE_STRING ) ) ;
    public final void rule__Query__PatternAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2519:1: ( ( ( RULE_STRING ) ) )
            // InternalRules.g:2520:2: ( ( RULE_STRING ) )
            {
            // InternalRules.g:2520:2: ( ( RULE_STRING ) )
            // InternalRules.g:2521:3: ( RULE_STRING )
            {
             before(grammarAccess.getQueryAccess().getPatternPatternCrossReference_0()); 
            // InternalRules.g:2522:3: ( RULE_STRING )
            // InternalRules.g:2523:4: RULE_STRING
            {
             before(grammarAccess.getQueryAccess().getPatternPatternSTRINGTerminalRuleCall_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getPatternPatternSTRINGTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getQueryAccess().getPatternPatternCrossReference_0()); 

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
    // $ANTLR end "rule__Query__PatternAssignment"


    // $ANTLR start "rule__Binding__ParameterAssignment_1"
    // InternalRules.g:2534:1: rule__Binding__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__Binding__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2538:1: ( ( ruleParameter ) )
            // InternalRules.g:2539:2: ( ruleParameter )
            {
            // InternalRules.g:2539:2: ( ruleParameter )
            // InternalRules.g:2540:3: ruleParameter
            {
             before(grammarAccess.getBindingAccess().getParameterParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getParameterParameterParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Binding__ParameterAssignment_1"


    // $ANTLR start "rule__Binding__BindAssignment_4"
    // InternalRules.g:2549:1: rule__Binding__BindAssignment_4 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2553:1: ( ( ruleBind ) )
            // InternalRules.g:2554:2: ( ruleBind )
            {
            // InternalRules.g:2554:2: ( ruleBind )
            // InternalRules.g:2555:3: ruleBind
            {
             before(grammarAccess.getBindingAccess().getBindBindParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindBindParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Binding__BindAssignment_4"


    // $ANTLR start "rule__Parameter__VariableAssignment"
    // InternalRules.g:2564:1: rule__Parameter__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2568:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2569:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2569:2: ( ( RULE_ID ) )
            // InternalRules.g:2570:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getVariableVariableCrossReference_0()); 
            // InternalRules.g:2571:3: ( RULE_ID )
            // InternalRules.g:2572:4: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getVariableVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getVariableVariableCrossReference_0()); 

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
    // $ANTLR end "rule__Parameter__VariableAssignment"


    // $ANTLR start "rule__ObjectBind__ObjectAssignment"
    // InternalRules.g:2583:1: rule__ObjectBind__ObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ObjectBind__ObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2587:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2588:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2588:2: ( ( RULE_ID ) )
            // InternalRules.g:2589:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_0()); 
            // InternalRules.g:2590:3: ( RULE_ID )
            // InternalRules.g:2591:4: RULE_ID
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_0()); 

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
    // $ANTLR end "rule__ObjectBind__ObjectAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});

}