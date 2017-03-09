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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'INT'", "'allow'", "'deny'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "'from'", "'query'", "'select'", "','", "'priority'", "'user'", "'group'", "'obj('", "')'", "'ref('", "'->'", "':'", "'attr('", "'where'", "'bound'", "'object'", "'value'"
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


    // $ANTLR start "entryRuleAttributeFact"
    // InternalRules.g:278:1: entryRuleAttributeFact : ruleAttributeFact EOF ;
    public final void entryRuleAttributeFact() throws RecognitionException {
        try {
            // InternalRules.g:279:1: ( ruleAttributeFact EOF )
            // InternalRules.g:280:1: ruleAttributeFact EOF
            {
             before(grammarAccess.getAttributeFactRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeFact();

            state._fsp--;

             after(grammarAccess.getAttributeFactRule()); 
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
    // $ANTLR end "entryRuleAttributeFact"


    // $ANTLR start "ruleAttributeFact"
    // InternalRules.g:287:1: ruleAttributeFact : ( ( rule__AttributeFact__Group__0 ) ) ;
    public final void ruleAttributeFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:291:2: ( ( ( rule__AttributeFact__Group__0 ) ) )
            // InternalRules.g:292:2: ( ( rule__AttributeFact__Group__0 ) )
            {
            // InternalRules.g:292:2: ( ( rule__AttributeFact__Group__0 ) )
            // InternalRules.g:293:3: ( rule__AttributeFact__Group__0 )
            {
             before(grammarAccess.getAttributeFactAccess().getGroup()); 
            // InternalRules.g:294:3: ( rule__AttributeFact__Group__0 )
            // InternalRules.g:294:4: rule__AttributeFact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeFact"


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


    // $ANTLR start "entryRuleBind"
    // InternalRules.g:328:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalRules.g:329:1: ( ruleBind EOF )
            // InternalRules.g:330:1: ruleBind EOF
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
    // InternalRules.g:337:1: ruleBind : ( ( rule__Bind__Alternatives ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:341:2: ( ( ( rule__Bind__Alternatives ) ) )
            // InternalRules.g:342:2: ( ( rule__Bind__Alternatives ) )
            {
            // InternalRules.g:342:2: ( ( rule__Bind__Alternatives ) )
            // InternalRules.g:343:3: ( rule__Bind__Alternatives )
            {
             before(grammarAccess.getBindAccess().getAlternatives()); 
            // InternalRules.g:344:3: ( rule__Bind__Alternatives )
            // InternalRules.g:344:4: rule__Bind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getAlternatives()); 

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
    // InternalRules.g:353:1: entryRuleObjectBind : ruleObjectBind EOF ;
    public final void entryRuleObjectBind() throws RecognitionException {
        try {
            // InternalRules.g:354:1: ( ruleObjectBind EOF )
            // InternalRules.g:355:1: ruleObjectBind EOF
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
    // InternalRules.g:362:1: ruleObjectBind : ( ( rule__ObjectBind__Group__0 ) ) ;
    public final void ruleObjectBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:366:2: ( ( ( rule__ObjectBind__Group__0 ) ) )
            // InternalRules.g:367:2: ( ( rule__ObjectBind__Group__0 ) )
            {
            // InternalRules.g:367:2: ( ( rule__ObjectBind__Group__0 ) )
            // InternalRules.g:368:3: ( rule__ObjectBind__Group__0 )
            {
             before(grammarAccess.getObjectBindAccess().getGroup()); 
            // InternalRules.g:369:3: ( rule__ObjectBind__Group__0 )
            // InternalRules.g:369:4: rule__ObjectBind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectBind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectBindAccess().getGroup()); 

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


    // $ANTLR start "entryRuleValueBind"
    // InternalRules.g:378:1: entryRuleValueBind : ruleValueBind EOF ;
    public final void entryRuleValueBind() throws RecognitionException {
        try {
            // InternalRules.g:379:1: ( ruleValueBind EOF )
            // InternalRules.g:380:1: ruleValueBind EOF
            {
             before(grammarAccess.getValueBindRule()); 
            pushFollow(FOLLOW_1);
            ruleValueBind();

            state._fsp--;

             after(grammarAccess.getValueBindRule()); 
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
    // $ANTLR end "entryRuleValueBind"


    // $ANTLR start "ruleValueBind"
    // InternalRules.g:387:1: ruleValueBind : ( ( rule__ValueBind__Group__0 ) ) ;
    public final void ruleValueBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:391:2: ( ( ( rule__ValueBind__Group__0 ) ) )
            // InternalRules.g:392:2: ( ( rule__ValueBind__Group__0 ) )
            {
            // InternalRules.g:392:2: ( ( rule__ValueBind__Group__0 ) )
            // InternalRules.g:393:3: ( rule__ValueBind__Group__0 )
            {
             before(grammarAccess.getValueBindAccess().getGroup()); 
            // InternalRules.g:394:3: ( rule__ValueBind__Group__0 )
            // InternalRules.g:394:4: rule__ValueBind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueBind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueBindAccess().getGroup()); 

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
    // $ANTLR end "ruleValueBind"


    // $ANTLR start "ruleValueType"
    // InternalRules.g:403:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:407:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalRules.g:408:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalRules.g:408:2: ( ( rule__ValueType__Alternatives ) )
            // InternalRules.g:409:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalRules.g:410:3: ( rule__ValueType__Alternatives )
            // InternalRules.g:410:4: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:419:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:423:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:424:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:424:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:425:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:426:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:426:4: rule__AccessibilityLevel__Alternatives
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
    // InternalRules.g:435:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:439:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:440:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:440:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:441:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:442:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:442:4: rule__OperationType__Alternatives
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
    // InternalRules.g:451:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:455:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:456:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:456:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:457:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:458:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:458:4: rule__ResolutionType__Alternatives
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
    // InternalRules.g:466:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:470:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:471:2: ( ruleUser )
                    {
                    // InternalRules.g:471:2: ( ruleUser )
                    // InternalRules.g:472:3: ruleUser
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
                    // InternalRules.g:477:2: ( ruleGroup )
                    {
                    // InternalRules.g:477:2: ( ruleGroup )
                    // InternalRules.g:478:3: ruleGroup
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
    // InternalRules.g:487:1: rule__Asset__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) );
    public final void rule__Asset__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:491:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 41:
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
                    // InternalRules.g:492:2: ( ruleObjectFact )
                    {
                    // InternalRules.g:492:2: ( ruleObjectFact )
                    // InternalRules.g:493:3: ruleObjectFact
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
                    // InternalRules.g:498:2: ( ruleReferenceFact )
                    {
                    // InternalRules.g:498:2: ( ruleReferenceFact )
                    // InternalRules.g:499:3: ruleReferenceFact
                    {
                     before(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getReferenceFactParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:504:2: ( ruleAttributeFact )
                    {
                    // InternalRules.g:504:2: ( ruleAttributeFact )
                    // InternalRules.g:505:3: ruleAttributeFact
                    {
                     before(grammarAccess.getAssetAccess().getAttributeFactParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFact();

                    state._fsp--;

                     after(grammarAccess.getAssetAccess().getAttributeFactParserRuleCall_2()); 

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


    // $ANTLR start "rule__Bind__Alternatives"
    // InternalRules.g:514:1: rule__Bind__Alternatives : ( ( ruleObjectBind ) | ( ruleValueBind ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:518:1: ( ( ruleObjectBind ) | ( ruleValueBind ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            else if ( (LA3_0==45) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRules.g:519:2: ( ruleObjectBind )
                    {
                    // InternalRules.g:519:2: ( ruleObjectBind )
                    // InternalRules.g:520:3: ruleObjectBind
                    {
                     before(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getObjectBindParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:525:2: ( ruleValueBind )
                    {
                    // InternalRules.g:525:2: ( ruleValueBind )
                    // InternalRules.g:526:3: ruleValueBind
                    {
                     before(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValueBind();

                    state._fsp--;

                     after(grammarAccess.getBindAccess().getValueBindParserRuleCall_1()); 

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
    // $ANTLR end "rule__Bind__Alternatives"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalRules.g:535:1: rule__ValueType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'INT' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:539:1: ( ( ( 'STRING' ) ) | ( ( 'INT' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRules.g:540:2: ( ( 'STRING' ) )
                    {
                    // InternalRules.g:540:2: ( ( 'STRING' ) )
                    // InternalRules.g:541:3: ( 'STRING' )
                    {
                     before(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalRules.g:542:3: ( 'STRING' )
                    // InternalRules.g:542:4: 'STRING'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:546:2: ( ( 'INT' ) )
                    {
                    // InternalRules.g:546:2: ( ( 'INT' ) )
                    // InternalRules.g:547:3: ( 'INT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalRules.g:548:3: ( 'INT' )
                    // InternalRules.g:548:4: 'INT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalRules.g:556:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'deny' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:560:1: ( ( ( 'allow' ) ) | ( ( 'deny' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRules.g:561:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:561:2: ( ( 'allow' ) )
                    // InternalRules.g:562:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:563:3: ( 'allow' )
                    // InternalRules.g:563:4: 'allow'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:567:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:567:2: ( ( 'deny' ) )
                    // InternalRules.g:568:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 
                    // InternalRules.g:569:3: ( 'deny' )
                    // InternalRules.g:569:4: 'deny'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalRules.g:577:1: rule__OperationType__Alternatives : ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:581:1: ( ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRules.g:582:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:582:2: ( ( 'R' ) )
                    // InternalRules.g:583:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 
                    // InternalRules.g:584:3: ( 'R' )
                    // InternalRules.g:584:4: 'R'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:588:2: ( ( 'W' ) )
                    {
                    // InternalRules.g:588:2: ( ( 'W' ) )
                    // InternalRules.g:589:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:590:3: ( 'W' )
                    // InternalRules.g:590:4: 'W'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:594:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:594:2: ( ( 'RW' ) )
                    // InternalRules.g:595:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:596:3: ( 'RW' )
                    // InternalRules.g:596:4: 'RW'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalRules.g:604:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:608:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRules.g:609:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:609:2: ( ( 'restrictive' ) )
                    // InternalRules.g:610:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:611:3: ( 'restrictive' )
                    // InternalRules.g:611:4: 'restrictive'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:615:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:615:2: ( ( 'permissive' ) )
                    // InternalRules.g:616:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:617:3: ( 'permissive' )
                    // InternalRules.g:617:4: 'permissive'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalRules.g:625:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:629:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRules.g:630:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalRules.g:637:1: rule__Model__Group__0__Impl : ( ( rule__Model__RolesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:641:1: ( ( ( rule__Model__RolesAssignment_0 )* ) )
            // InternalRules.g:642:1: ( ( rule__Model__RolesAssignment_0 )* )
            {
            // InternalRules.g:642:1: ( ( rule__Model__RolesAssignment_0 )* )
            // InternalRules.g:643:2: ( rule__Model__RolesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_0()); 
            // InternalRules.g:644:2: ( rule__Model__RolesAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=34 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:644:3: rule__Model__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRules.g:652:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:656:1: ( rule__Model__Group__1__Impl )
            // InternalRules.g:657:2: rule__Model__Group__1__Impl
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
    // InternalRules.g:663:1: rule__Model__Group__1__Impl : ( ( rule__Model__PolicyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:667:1: ( ( ( rule__Model__PolicyAssignment_1 ) ) )
            // InternalRules.g:668:1: ( ( rule__Model__PolicyAssignment_1 ) )
            {
            // InternalRules.g:668:1: ( ( rule__Model__PolicyAssignment_1 ) )
            // InternalRules.g:669:2: ( rule__Model__PolicyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPolicyAssignment_1()); 
            // InternalRules.g:670:2: ( rule__Model__PolicyAssignment_1 )
            // InternalRules.g:670:3: rule__Model__PolicyAssignment_1
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
    // InternalRules.g:679:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:683:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalRules.g:684:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalRules.g:691:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:695:1: ( ( 'policy' ) )
            // InternalRules.g:696:1: ( 'policy' )
            {
            // InternalRules.g:696:1: ( 'policy' )
            // InternalRules.g:697:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRules.g:706:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:710:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalRules.g:711:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
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
    // InternalRules.g:718:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:722:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalRules.g:723:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalRules.g:723:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalRules.g:724:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalRules.g:725:2: ( rule__Policy__NameAssignment_1 )
            // InternalRules.g:725:3: rule__Policy__NameAssignment_1
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
    // InternalRules.g:733:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:737:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalRules.g:738:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
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
    // InternalRules.g:745:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__AccessAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:749:1: ( ( ( rule__Policy__AccessAssignment_2 ) ) )
            // InternalRules.g:750:1: ( ( rule__Policy__AccessAssignment_2 ) )
            {
            // InternalRules.g:750:1: ( ( rule__Policy__AccessAssignment_2 ) )
            // InternalRules.g:751:2: ( rule__Policy__AccessAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 
            // InternalRules.g:752:2: ( rule__Policy__AccessAssignment_2 )
            // InternalRules.g:752:3: rule__Policy__AccessAssignment_2
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
    // InternalRules.g:760:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:764:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalRules.g:765:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
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
    // InternalRules.g:772:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__OperationAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:776:1: ( ( ( rule__Policy__OperationAssignment_3 ) ) )
            // InternalRules.g:777:1: ( ( rule__Policy__OperationAssignment_3 ) )
            {
            // InternalRules.g:777:1: ( ( rule__Policy__OperationAssignment_3 ) )
            // InternalRules.g:778:2: ( rule__Policy__OperationAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 
            // InternalRules.g:779:2: ( rule__Policy__OperationAssignment_3 )
            // InternalRules.g:779:3: rule__Policy__OperationAssignment_3
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
    // InternalRules.g:787:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:791:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalRules.g:792:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
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
    // InternalRules.g:799:1: rule__Policy__Group__4__Impl : ( 'by' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:803:1: ( ( 'by' ) )
            // InternalRules.g:804:1: ( 'by' )
            {
            // InternalRules.g:804:1: ( 'by' )
            // InternalRules.g:805:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRules.g:814:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:818:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalRules.g:819:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
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
    // InternalRules.g:826:1: rule__Policy__Group__5__Impl : ( 'default' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:830:1: ( ( 'default' ) )
            // InternalRules.g:831:1: ( 'default' )
            {
            // InternalRules.g:831:1: ( 'default' )
            // InternalRules.g:832:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:841:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:845:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalRules.g:846:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
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
    // InternalRules.g:853:1: rule__Policy__Group__6__Impl : ( '{' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:857:1: ( ( '{' ) )
            // InternalRules.g:858:1: ( '{' )
            {
            // InternalRules.g:858:1: ( '{' )
            // InternalRules.g:859:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:868:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:872:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalRules.g:873:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
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
    // InternalRules.g:880:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__RulesAssignment_7 )* ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:884:1: ( ( ( rule__Policy__RulesAssignment_7 )* ) )
            // InternalRules.g:885:1: ( ( rule__Policy__RulesAssignment_7 )* )
            {
            // InternalRules.g:885:1: ( ( rule__Policy__RulesAssignment_7 )* )
            // InternalRules.g:886:2: ( rule__Policy__RulesAssignment_7 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 
            // InternalRules.g:887:2: ( rule__Policy__RulesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRules.g:887:3: rule__Policy__RulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Policy__RulesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRules.g:895:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:899:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalRules.g:900:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
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
    // InternalRules.g:907:1: rule__Policy__Group__8__Impl : ( '}' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:911:1: ( ( '}' ) )
            // InternalRules.g:912:1: ( '}' )
            {
            // InternalRules.g:912:1: ( '}' )
            // InternalRules.g:913:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:922:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:926:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalRules.g:927:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
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
    // InternalRules.g:934:1: rule__Policy__Group__9__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:938:1: ( ( 'with' ) )
            // InternalRules.g:939:1: ( 'with' )
            {
            // InternalRules.g:939:1: ( 'with' )
            // InternalRules.g:940:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_9()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRules.g:949:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl rule__Policy__Group__11 ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:953:1: ( rule__Policy__Group__10__Impl rule__Policy__Group__11 )
            // InternalRules.g:954:2: rule__Policy__Group__10__Impl rule__Policy__Group__11
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
    // InternalRules.g:961:1: rule__Policy__Group__10__Impl : ( ( rule__Policy__ResolutionAssignment_10 ) ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:965:1: ( ( ( rule__Policy__ResolutionAssignment_10 ) ) )
            // InternalRules.g:966:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            {
            // InternalRules.g:966:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            // InternalRules.g:967:2: ( rule__Policy__ResolutionAssignment_10 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 
            // InternalRules.g:968:2: ( rule__Policy__ResolutionAssignment_10 )
            // InternalRules.g:968:3: rule__Policy__ResolutionAssignment_10
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
    // InternalRules.g:976:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:980:1: ( rule__Policy__Group__11__Impl )
            // InternalRules.g:981:2: rule__Policy__Group__11__Impl
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
    // InternalRules.g:987:1: rule__Policy__Group__11__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:991:1: ( ( 'resolution' ) )
            // InternalRules.g:992:1: ( 'resolution' )
            {
            // InternalRules.g:992:1: ( 'resolution' )
            // InternalRules.g:993:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRules.g:1003:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1007:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRules.g:1008:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalRules.g:1015:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1019:1: ( ( 'rule' ) )
            // InternalRules.g:1020:1: ( 'rule' )
            {
            // InternalRules.g:1020:1: ( 'rule' )
            // InternalRules.g:1021:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRules.g:1030:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1034:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRules.g:1035:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalRules.g:1042:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1046:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalRules.g:1047:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalRules.g:1047:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalRules.g:1048:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalRules.g:1049:2: ( rule__Rule__NameAssignment_1 )
            // InternalRules.g:1049:3: rule__Rule__NameAssignment_1
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
    // InternalRules.g:1057:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1061:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRules.g:1062:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalRules.g:1069:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AccessAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1073:1: ( ( ( rule__Rule__AccessAssignment_2 ) ) )
            // InternalRules.g:1074:1: ( ( rule__Rule__AccessAssignment_2 ) )
            {
            // InternalRules.g:1074:1: ( ( rule__Rule__AccessAssignment_2 ) )
            // InternalRules.g:1075:2: ( rule__Rule__AccessAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAccessAssignment_2()); 
            // InternalRules.g:1076:2: ( rule__Rule__AccessAssignment_2 )
            // InternalRules.g:1076:3: rule__Rule__AccessAssignment_2
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
    // InternalRules.g:1084:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1088:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRules.g:1089:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalRules.g:1096:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperationAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1100:1: ( ( ( rule__Rule__OperationAssignment_3 ) ) )
            // InternalRules.g:1101:1: ( ( rule__Rule__OperationAssignment_3 ) )
            {
            // InternalRules.g:1101:1: ( ( rule__Rule__OperationAssignment_3 ) )
            // InternalRules.g:1102:2: ( rule__Rule__OperationAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_3()); 
            // InternalRules.g:1103:2: ( rule__Rule__OperationAssignment_3 )
            // InternalRules.g:1103:3: rule__Rule__OperationAssignment_3
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
    // InternalRules.g:1111:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1115:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRules.g:1116:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalRules.g:1123:1: rule__Rule__Group__4__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1127:1: ( ( 'to' ) )
            // InternalRules.g:1128:1: ( 'to' )
            {
            // InternalRules.g:1128:1: ( 'to' )
            // InternalRules.g:1129:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRules.g:1138:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1142:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRules.g:1143:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalRules.g:1150:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__RolesAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1154:1: ( ( ( rule__Rule__RolesAssignment_5 ) ) )
            // InternalRules.g:1155:1: ( ( rule__Rule__RolesAssignment_5 ) )
            {
            // InternalRules.g:1155:1: ( ( rule__Rule__RolesAssignment_5 ) )
            // InternalRules.g:1156:2: ( rule__Rule__RolesAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5()); 
            // InternalRules.g:1157:2: ( rule__Rule__RolesAssignment_5 )
            // InternalRules.g:1157:3: rule__Rule__RolesAssignment_5
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
    // InternalRules.g:1165:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1169:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRules.g:1170:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
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
    // InternalRules.g:1177:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1181:1: ( ( ( rule__Rule__Group_6__0 )* ) )
            // InternalRules.g:1182:1: ( ( rule__Rule__Group_6__0 )* )
            {
            // InternalRules.g:1182:1: ( ( rule__Rule__Group_6__0 )* )
            // InternalRules.g:1183:2: ( rule__Rule__Group_6__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalRules.g:1184:2: ( rule__Rule__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRules.g:1184:3: rule__Rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalRules.g:1192:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1196:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRules.g:1197:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
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
    // InternalRules.g:1204:1: rule__Rule__Group__7__Impl : ( '{' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1208:1: ( ( '{' ) )
            // InternalRules.g:1209:1: ( '{' )
            {
            // InternalRules.g:1209:1: ( '{' )
            // InternalRules.g:1210:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:1219:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1223:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalRules.g:1224:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
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
    // InternalRules.g:1231:1: rule__Rule__Group__8__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1235:1: ( ( 'from' ) )
            // InternalRules.g:1236:1: ( 'from' )
            {
            // InternalRules.g:1236:1: ( 'from' )
            // InternalRules.g:1237:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_8()); 

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
    // InternalRules.g:1246:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1250:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalRules.g:1251:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
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
    // InternalRules.g:1258:1: rule__Rule__Group__9__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1262:1: ( ( 'query' ) )
            // InternalRules.g:1263:1: ( 'query' )
            {
            // InternalRules.g:1263:1: ( 'query' )
            // InternalRules.g:1264:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQueryKeyword_9()); 

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
    // InternalRules.g:1273:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1277:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalRules.g:1278:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
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
    // InternalRules.g:1285:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__PatternAssignment_10 ) ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1289:1: ( ( ( rule__Rule__PatternAssignment_10 ) ) )
            // InternalRules.g:1290:1: ( ( rule__Rule__PatternAssignment_10 ) )
            {
            // InternalRules.g:1290:1: ( ( rule__Rule__PatternAssignment_10 ) )
            // InternalRules.g:1291:2: ( rule__Rule__PatternAssignment_10 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_10()); 
            // InternalRules.g:1292:2: ( rule__Rule__PatternAssignment_10 )
            // InternalRules.g:1292:3: rule__Rule__PatternAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PatternAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternAssignment_10()); 

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
    // InternalRules.g:1300:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1304:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalRules.g:1305:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
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
    // InternalRules.g:1312:1: rule__Rule__Group__11__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1316:1: ( ( 'select' ) )
            // InternalRules.g:1317:1: ( 'select' )
            {
            // InternalRules.g:1317:1: ( 'select' )
            // InternalRules.g:1318:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectKeyword_11()); 

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
    // InternalRules.g:1327:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1331:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalRules.g:1332:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
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
    // InternalRules.g:1339:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__AssetAssignment_12 ) ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1343:1: ( ( ( rule__Rule__AssetAssignment_12 ) ) )
            // InternalRules.g:1344:1: ( ( rule__Rule__AssetAssignment_12 ) )
            {
            // InternalRules.g:1344:1: ( ( rule__Rule__AssetAssignment_12 ) )
            // InternalRules.g:1345:2: ( rule__Rule__AssetAssignment_12 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_12()); 
            // InternalRules.g:1346:2: ( rule__Rule__AssetAssignment_12 )
            // InternalRules.g:1346:3: rule__Rule__AssetAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AssetAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAssetAssignment_12()); 

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
    // InternalRules.g:1354:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1358:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalRules.g:1359:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
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
    // InternalRules.g:1366:1: rule__Rule__Group__13__Impl : ( ( rule__Rule__BindingsAssignment_13 )* ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1370:1: ( ( ( rule__Rule__BindingsAssignment_13 )* ) )
            // InternalRules.g:1371:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            {
            // InternalRules.g:1371:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            // InternalRules.g:1372:2: ( rule__Rule__BindingsAssignment_13 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 
            // InternalRules.g:1373:2: ( rule__Rule__BindingsAssignment_13 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRules.g:1373:3: rule__Rule__BindingsAssignment_13
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__BindingsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRules.g:1381:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl rule__Rule__Group__15 ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1385:1: ( rule__Rule__Group__14__Impl rule__Rule__Group__15 )
            // InternalRules.g:1386:2: rule__Rule__Group__14__Impl rule__Rule__Group__15
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
    // InternalRules.g:1393:1: rule__Rule__Group__14__Impl : ( '}' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1397:1: ( ( '}' ) )
            // InternalRules.g:1398:1: ( '}' )
            {
            // InternalRules.g:1398:1: ( '}' )
            // InternalRules.g:1399:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:1408:1: rule__Rule__Group__15 : rule__Rule__Group__15__Impl ;
    public final void rule__Rule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1412:1: ( rule__Rule__Group__15__Impl )
            // InternalRules.g:1413:2: rule__Rule__Group__15__Impl
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
    // InternalRules.g:1419:1: rule__Rule__Group__15__Impl : ( ( rule__Rule__Group_15__0 )? ) ;
    public final void rule__Rule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1423:1: ( ( ( rule__Rule__Group_15__0 )? ) )
            // InternalRules.g:1424:1: ( ( rule__Rule__Group_15__0 )? )
            {
            // InternalRules.g:1424:1: ( ( rule__Rule__Group_15__0 )? )
            // InternalRules.g:1425:2: ( rule__Rule__Group_15__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_15()); 
            // InternalRules.g:1426:2: ( rule__Rule__Group_15__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRules.g:1426:3: rule__Rule__Group_15__0
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
    // InternalRules.g:1435:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1439:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalRules.g:1440:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
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
    // InternalRules.g:1447:1: rule__Rule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1451:1: ( ( ',' ) )
            // InternalRules.g:1452:1: ( ',' )
            {
            // InternalRules.g:1452:1: ( ',' )
            // InternalRules.g:1453:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRules.g:1462:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1466:1: ( rule__Rule__Group_6__1__Impl )
            // InternalRules.g:1467:2: rule__Rule__Group_6__1__Impl
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
    // InternalRules.g:1473:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__RolesAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1477:1: ( ( ( rule__Rule__RolesAssignment_6_1 ) ) )
            // InternalRules.g:1478:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            {
            // InternalRules.g:1478:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            // InternalRules.g:1479:2: ( rule__Rule__RolesAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 
            // InternalRules.g:1480:2: ( rule__Rule__RolesAssignment_6_1 )
            // InternalRules.g:1480:3: rule__Rule__RolesAssignment_6_1
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
    // InternalRules.g:1489:1: rule__Rule__Group_15__0 : rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 ;
    public final void rule__Rule__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1493:1: ( rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 )
            // InternalRules.g:1494:2: rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1
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
    // InternalRules.g:1501:1: rule__Rule__Group_15__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1505:1: ( ( 'with' ) )
            // InternalRules.g:1506:1: ( 'with' )
            {
            // InternalRules.g:1506:1: ( 'with' )
            // InternalRules.g:1507:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRules.g:1516:1: rule__Rule__Group_15__1 : rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 ;
    public final void rule__Rule__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1520:1: ( rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 )
            // InternalRules.g:1521:2: rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2
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
    // InternalRules.g:1528:1: rule__Rule__Group_15__1__Impl : ( ( rule__Rule__PriorityAssignment_15_1 ) ) ;
    public final void rule__Rule__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1532:1: ( ( ( rule__Rule__PriorityAssignment_15_1 ) ) )
            // InternalRules.g:1533:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            {
            // InternalRules.g:1533:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            // InternalRules.g:1534:2: ( rule__Rule__PriorityAssignment_15_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 
            // InternalRules.g:1535:2: ( rule__Rule__PriorityAssignment_15_1 )
            // InternalRules.g:1535:3: rule__Rule__PriorityAssignment_15_1
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
    // InternalRules.g:1543:1: rule__Rule__Group_15__2 : rule__Rule__Group_15__2__Impl ;
    public final void rule__Rule__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1547:1: ( rule__Rule__Group_15__2__Impl )
            // InternalRules.g:1548:2: rule__Rule__Group_15__2__Impl
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
    // InternalRules.g:1554:1: rule__Rule__Group_15__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1558:1: ( ( 'priority' ) )
            // InternalRules.g:1559:1: ( 'priority' )
            {
            // InternalRules.g:1559:1: ( 'priority' )
            // InternalRules.g:1560:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRules.g:1570:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1574:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalRules.g:1575:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalRules.g:1582:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1586:1: ( ( 'user' ) )
            // InternalRules.g:1587:1: ( 'user' )
            {
            // InternalRules.g:1587:1: ( 'user' )
            // InternalRules.g:1588:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRules.g:1597:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1601:1: ( rule__User__Group__1__Impl )
            // InternalRules.g:1602:2: rule__User__Group__1__Impl
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
    // InternalRules.g:1608:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1612:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalRules.g:1613:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalRules.g:1613:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalRules.g:1614:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalRules.g:1615:2: ( rule__User__NameAssignment_1 )
            // InternalRules.g:1615:3: rule__User__NameAssignment_1
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
    // InternalRules.g:1624:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1628:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalRules.g:1629:2: rule__Group__Group__0__Impl rule__Group__Group__1
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
    // InternalRules.g:1636:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1640:1: ( ( 'group' ) )
            // InternalRules.g:1641:1: ( 'group' )
            {
            // InternalRules.g:1641:1: ( 'group' )
            // InternalRules.g:1642:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRules.g:1651:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1655:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalRules.g:1656:2: rule__Group__Group__1__Impl rule__Group__Group__2
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
    // InternalRules.g:1663:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1667:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalRules.g:1668:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalRules.g:1668:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalRules.g:1669:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalRules.g:1670:2: ( rule__Group__NameAssignment_1 )
            // InternalRules.g:1670:3: rule__Group__NameAssignment_1
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
    // InternalRules.g:1678:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1682:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalRules.g:1683:2: rule__Group__Group__2__Impl rule__Group__Group__3
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
    // InternalRules.g:1690:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1694:1: ( ( '{' ) )
            // InternalRules.g:1695:1: ( '{' )
            {
            // InternalRules.g:1695:1: ( '{' )
            // InternalRules.g:1696:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:1705:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1709:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalRules.g:1710:2: rule__Group__Group__3__Impl rule__Group__Group__4
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
    // InternalRules.g:1717:1: rule__Group__Group__3__Impl : ( ( rule__Group__UsersAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1721:1: ( ( ( rule__Group__UsersAssignment_3 ) ) )
            // InternalRules.g:1722:1: ( ( rule__Group__UsersAssignment_3 ) )
            {
            // InternalRules.g:1722:1: ( ( rule__Group__UsersAssignment_3 ) )
            // InternalRules.g:1723:2: ( rule__Group__UsersAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_3()); 
            // InternalRules.g:1724:2: ( rule__Group__UsersAssignment_3 )
            // InternalRules.g:1724:3: rule__Group__UsersAssignment_3
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
    // InternalRules.g:1732:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1736:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalRules.g:1737:2: rule__Group__Group__4__Impl rule__Group__Group__5
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
    // InternalRules.g:1744:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1748:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalRules.g:1749:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalRules.g:1749:1: ( ( rule__Group__Group_4__0 )* )
            // InternalRules.g:1750:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalRules.g:1751:2: ( rule__Group__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRules.g:1751:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRules.g:1759:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1763:1: ( rule__Group__Group__5__Impl )
            // InternalRules.g:1764:2: rule__Group__Group__5__Impl
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
    // InternalRules.g:1770:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1774:1: ( ( '}' ) )
            // InternalRules.g:1775:1: ( '}' )
            {
            // InternalRules.g:1775:1: ( '}' )
            // InternalRules.g:1776:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:1786:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1790:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalRules.g:1791:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
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
    // InternalRules.g:1798:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1802:1: ( ( ',' ) )
            // InternalRules.g:1803:1: ( ',' )
            {
            // InternalRules.g:1803:1: ( ',' )
            // InternalRules.g:1804:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRules.g:1813:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1817:1: ( rule__Group__Group_4__1__Impl )
            // InternalRules.g:1818:2: rule__Group__Group_4__1__Impl
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
    // InternalRules.g:1824:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__UsersAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1828:1: ( ( ( rule__Group__UsersAssignment_4_1 ) ) )
            // InternalRules.g:1829:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            {
            // InternalRules.g:1829:1: ( ( rule__Group__UsersAssignment_4_1 ) )
            // InternalRules.g:1830:2: ( rule__Group__UsersAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getUsersAssignment_4_1()); 
            // InternalRules.g:1831:2: ( rule__Group__UsersAssignment_4_1 )
            // InternalRules.g:1831:3: rule__Group__UsersAssignment_4_1
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
    // InternalRules.g:1840:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1844:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalRules.g:1845:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
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
    // InternalRules.g:1852:1: rule__ObjectFact__Group__0__Impl : ( 'obj(' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1856:1: ( ( 'obj(' ) )
            // InternalRules.g:1857:1: ( 'obj(' )
            {
            // InternalRules.g:1857:1: ( 'obj(' )
            // InternalRules.g:1858:2: 'obj('
            {
             before(grammarAccess.getObjectFactAccess().getObjKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRules.g:1867:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1871:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalRules.g:1872:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
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
    // InternalRules.g:1879:1: rule__ObjectFact__Group__1__Impl : ( ( rule__ObjectFact__VariableAssignment_1 ) ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1883:1: ( ( ( rule__ObjectFact__VariableAssignment_1 ) ) )
            // InternalRules.g:1884:1: ( ( rule__ObjectFact__VariableAssignment_1 ) )
            {
            // InternalRules.g:1884:1: ( ( rule__ObjectFact__VariableAssignment_1 ) )
            // InternalRules.g:1885:2: ( rule__ObjectFact__VariableAssignment_1 )
            {
             before(grammarAccess.getObjectFactAccess().getVariableAssignment_1()); 
            // InternalRules.g:1886:2: ( rule__ObjectFact__VariableAssignment_1 )
            // InternalRules.g:1886:3: rule__ObjectFact__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getVariableAssignment_1()); 

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
    // InternalRules.g:1894:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1898:1: ( rule__ObjectFact__Group__2__Impl )
            // InternalRules.g:1899:2: rule__ObjectFact__Group__2__Impl
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
    // InternalRules.g:1905:1: rule__ObjectFact__Group__2__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1909:1: ( ( ')' ) )
            // InternalRules.g:1910:1: ( ')' )
            {
            // InternalRules.g:1910:1: ( ')' )
            // InternalRules.g:1911:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRules.g:1921:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1925:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalRules.g:1926:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
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
    // InternalRules.g:1933:1: rule__ReferenceFact__Group__0__Impl : ( 'ref(' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1937:1: ( ( 'ref(' ) )
            // InternalRules.g:1938:1: ( 'ref(' )
            {
            // InternalRules.g:1938:1: ( 'ref(' )
            // InternalRules.g:1939:2: 'ref('
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRules.g:1948:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1952:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalRules.g:1953:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
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
    // InternalRules.g:1960:1: rule__ReferenceFact__Group__1__Impl : ( ( rule__ReferenceFact__SourceVarAssignment_1 ) ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1964:1: ( ( ( rule__ReferenceFact__SourceVarAssignment_1 ) ) )
            // InternalRules.g:1965:1: ( ( rule__ReferenceFact__SourceVarAssignment_1 ) )
            {
            // InternalRules.g:1965:1: ( ( rule__ReferenceFact__SourceVarAssignment_1 ) )
            // InternalRules.g:1966:2: ( rule__ReferenceFact__SourceVarAssignment_1 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_1()); 
            // InternalRules.g:1967:2: ( rule__ReferenceFact__SourceVarAssignment_1 )
            // InternalRules.g:1967:3: rule__ReferenceFact__SourceVarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__SourceVarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_1()); 

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
    // InternalRules.g:1975:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1979:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalRules.g:1980:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalRules.g:1987:1: rule__ReferenceFact__Group__2__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1991:1: ( ( '->' ) )
            // InternalRules.g:1992:1: ( '->' )
            {
            // InternalRules.g:1992:1: ( '->' )
            // InternalRules.g:1993:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRules.g:2002:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2006:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalRules.g:2007:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalRules.g:2014:1: rule__ReferenceFact__Group__3__Impl : ( ( rule__ReferenceFact__TargetVarAssignment_3 ) ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2018:1: ( ( ( rule__ReferenceFact__TargetVarAssignment_3 ) ) )
            // InternalRules.g:2019:1: ( ( rule__ReferenceFact__TargetVarAssignment_3 ) )
            {
            // InternalRules.g:2019:1: ( ( rule__ReferenceFact__TargetVarAssignment_3 ) )
            // InternalRules.g:2020:2: ( rule__ReferenceFact__TargetVarAssignment_3 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_3()); 
            // InternalRules.g:2021:2: ( rule__ReferenceFact__TargetVarAssignment_3 )
            // InternalRules.g:2021:3: rule__ReferenceFact__TargetVarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__TargetVarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_3()); 

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
    // InternalRules.g:2029:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2033:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalRules.g:2034:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalRules.g:2041:1: rule__ReferenceFact__Group__4__Impl : ( ':' ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2045:1: ( ( ':' ) )
            // InternalRules.g:2046:1: ( ':' )
            {
            // InternalRules.g:2046:1: ( ':' )
            // InternalRules.g:2047:2: ':'
            {
             before(grammarAccess.getReferenceFactAccess().getColonKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getColonKeyword_4()); 

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
    // InternalRules.g:2056:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2060:1: ( rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 )
            // InternalRules.g:2061:2: rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__ReferenceFact__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__6();

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
    // InternalRules.g:2068:1: rule__ReferenceFact__Group__5__Impl : ( ( rule__ReferenceFact__ReferenceAssignment_5 ) ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2072:1: ( ( ( rule__ReferenceFact__ReferenceAssignment_5 ) ) )
            // InternalRules.g:2073:1: ( ( rule__ReferenceFact__ReferenceAssignment_5 ) )
            {
            // InternalRules.g:2073:1: ( ( rule__ReferenceFact__ReferenceAssignment_5 ) )
            // InternalRules.g:2074:2: ( rule__ReferenceFact__ReferenceAssignment_5 )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceAssignment_5()); 
            // InternalRules.g:2075:2: ( rule__ReferenceFact__ReferenceAssignment_5 )
            // InternalRules.g:2075:3: rule__ReferenceFact__ReferenceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__ReferenceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getReferenceAssignment_5()); 

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


    // $ANTLR start "rule__ReferenceFact__Group__6"
    // InternalRules.g:2083:1: rule__ReferenceFact__Group__6 : rule__ReferenceFact__Group__6__Impl ;
    public final void rule__ReferenceFact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2087:1: ( rule__ReferenceFact__Group__6__Impl )
            // InternalRules.g:2088:2: rule__ReferenceFact__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__6__Impl();

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
    // $ANTLR end "rule__ReferenceFact__Group__6"


    // $ANTLR start "rule__ReferenceFact__Group__6__Impl"
    // InternalRules.g:2094:1: rule__ReferenceFact__Group__6__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2098:1: ( ( ')' ) )
            // InternalRules.g:2099:1: ( ')' )
            {
            // InternalRules.g:2099:1: ( ')' )
            // InternalRules.g:2100:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__ReferenceFact__Group__6__Impl"


    // $ANTLR start "rule__AttributeFact__Group__0"
    // InternalRules.g:2110:1: rule__AttributeFact__Group__0 : rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 ;
    public final void rule__AttributeFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2114:1: ( rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 )
            // InternalRules.g:2115:2: rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__1();

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
    // $ANTLR end "rule__AttributeFact__Group__0"


    // $ANTLR start "rule__AttributeFact__Group__0__Impl"
    // InternalRules.g:2122:1: rule__AttributeFact__Group__0__Impl : ( 'attr(' ) ;
    public final void rule__AttributeFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2126:1: ( ( 'attr(' ) )
            // InternalRules.g:2127:1: ( 'attr(' )
            {
            // InternalRules.g:2127:1: ( 'attr(' )
            // InternalRules.g:2128:2: 'attr('
            {
             before(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 

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
    // $ANTLR end "rule__AttributeFact__Group__0__Impl"


    // $ANTLR start "rule__AttributeFact__Group__1"
    // InternalRules.g:2137:1: rule__AttributeFact__Group__1 : rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 ;
    public final void rule__AttributeFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2141:1: ( rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 )
            // InternalRules.g:2142:2: rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__AttributeFact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__2();

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
    // $ANTLR end "rule__AttributeFact__Group__1"


    // $ANTLR start "rule__AttributeFact__Group__1__Impl"
    // InternalRules.g:2149:1: rule__AttributeFact__Group__1__Impl : ( ( rule__AttributeFact__VariableAssignment_1 ) ) ;
    public final void rule__AttributeFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2153:1: ( ( ( rule__AttributeFact__VariableAssignment_1 ) ) )
            // InternalRules.g:2154:1: ( ( rule__AttributeFact__VariableAssignment_1 ) )
            {
            // InternalRules.g:2154:1: ( ( rule__AttributeFact__VariableAssignment_1 ) )
            // InternalRules.g:2155:2: ( rule__AttributeFact__VariableAssignment_1 )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableAssignment_1()); 
            // InternalRules.g:2156:2: ( rule__AttributeFact__VariableAssignment_1 )
            // InternalRules.g:2156:3: rule__AttributeFact__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getVariableAssignment_1()); 

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
    // $ANTLR end "rule__AttributeFact__Group__1__Impl"


    // $ANTLR start "rule__AttributeFact__Group__2"
    // InternalRules.g:2164:1: rule__AttributeFact__Group__2 : rule__AttributeFact__Group__2__Impl ;
    public final void rule__AttributeFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2168:1: ( rule__AttributeFact__Group__2__Impl )
            // InternalRules.g:2169:2: rule__AttributeFact__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeFact__Group__2"


    // $ANTLR start "rule__AttributeFact__Group__2__Impl"
    // InternalRules.g:2175:1: rule__AttributeFact__Group__2__Impl : ( ')' ) ;
    public final void rule__AttributeFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2179:1: ( ( ')' ) )
            // InternalRules.g:2180:1: ( ')' )
            {
            // InternalRules.g:2180:1: ( ')' )
            // InternalRules.g:2181:2: ')'
            {
             before(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AttributeFact__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalRules.g:2191:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2195:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalRules.g:2196:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalRules.g:2203:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2207:1: ( ( 'where' ) )
            // InternalRules.g:2208:1: ( 'where' )
            {
            // InternalRules.g:2208:1: ( 'where' )
            // InternalRules.g:2209:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRules.g:2218:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2222:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalRules.g:2223:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalRules.g:2230:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__VariableAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2234:1: ( ( ( rule__Binding__VariableAssignment_1 ) ) )
            // InternalRules.g:2235:1: ( ( rule__Binding__VariableAssignment_1 ) )
            {
            // InternalRules.g:2235:1: ( ( rule__Binding__VariableAssignment_1 ) )
            // InternalRules.g:2236:2: ( rule__Binding__VariableAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getVariableAssignment_1()); 
            // InternalRules.g:2237:2: ( rule__Binding__VariableAssignment_1 )
            // InternalRules.g:2237:3: rule__Binding__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getVariableAssignment_1()); 

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
    // InternalRules.g:2245:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2249:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalRules.g:2250:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
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
    // InternalRules.g:2257:1: rule__Binding__Group__2__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2261:1: ( ( 'bound' ) )
            // InternalRules.g:2262:1: ( 'bound' )
            {
            // InternalRules.g:2262:1: ( 'bound' )
            // InternalRules.g:2263:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRules.g:2272:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2276:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalRules.g:2277:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalRules.g:2284:1: rule__Binding__Group__3__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2288:1: ( ( 'to' ) )
            // InternalRules.g:2289:1: ( 'to' )
            {
            // InternalRules.g:2289:1: ( 'to' )
            // InternalRules.g:2290:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRules.g:2299:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2303:1: ( rule__Binding__Group__4__Impl )
            // InternalRules.g:2304:2: rule__Binding__Group__4__Impl
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
    // InternalRules.g:2310:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__BindAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2314:1: ( ( ( rule__Binding__BindAssignment_4 ) ) )
            // InternalRules.g:2315:1: ( ( rule__Binding__BindAssignment_4 ) )
            {
            // InternalRules.g:2315:1: ( ( rule__Binding__BindAssignment_4 ) )
            // InternalRules.g:2316:2: ( rule__Binding__BindAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_4()); 
            // InternalRules.g:2317:2: ( rule__Binding__BindAssignment_4 )
            // InternalRules.g:2317:3: rule__Binding__BindAssignment_4
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


    // $ANTLR start "rule__ObjectBind__Group__0"
    // InternalRules.g:2326:1: rule__ObjectBind__Group__0 : rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 ;
    public final void rule__ObjectBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2330:1: ( rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1 )
            // InternalRules.g:2331:2: rule__ObjectBind__Group__0__Impl rule__ObjectBind__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectBind__Group__1();

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
    // $ANTLR end "rule__ObjectBind__Group__0"


    // $ANTLR start "rule__ObjectBind__Group__0__Impl"
    // InternalRules.g:2338:1: rule__ObjectBind__Group__0__Impl : ( 'object' ) ;
    public final void rule__ObjectBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2342:1: ( ( 'object' ) )
            // InternalRules.g:2343:1: ( 'object' )
            {
            // InternalRules.g:2343:1: ( 'object' )
            // InternalRules.g:2344:2: 'object'
            {
             before(grammarAccess.getObjectBindAccess().getObjectKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getObjectBindAccess().getObjectKeyword_0()); 

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
    // $ANTLR end "rule__ObjectBind__Group__0__Impl"


    // $ANTLR start "rule__ObjectBind__Group__1"
    // InternalRules.g:2353:1: rule__ObjectBind__Group__1 : rule__ObjectBind__Group__1__Impl ;
    public final void rule__ObjectBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2357:1: ( rule__ObjectBind__Group__1__Impl )
            // InternalRules.g:2358:2: rule__ObjectBind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectBind__Group__1__Impl();

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
    // $ANTLR end "rule__ObjectBind__Group__1"


    // $ANTLR start "rule__ObjectBind__Group__1__Impl"
    // InternalRules.g:2364:1: rule__ObjectBind__Group__1__Impl : ( ( rule__ObjectBind__ObjectAssignment_1 ) ) ;
    public final void rule__ObjectBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2368:1: ( ( ( rule__ObjectBind__ObjectAssignment_1 ) ) )
            // InternalRules.g:2369:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            {
            // InternalRules.g:2369:1: ( ( rule__ObjectBind__ObjectAssignment_1 ) )
            // InternalRules.g:2370:2: ( rule__ObjectBind__ObjectAssignment_1 )
            {
             before(grammarAccess.getObjectBindAccess().getObjectAssignment_1()); 
            // InternalRules.g:2371:2: ( rule__ObjectBind__ObjectAssignment_1 )
            // InternalRules.g:2371:3: rule__ObjectBind__ObjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectBind__ObjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectBindAccess().getObjectAssignment_1()); 

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
    // $ANTLR end "rule__ObjectBind__Group__1__Impl"


    // $ANTLR start "rule__ValueBind__Group__0"
    // InternalRules.g:2380:1: rule__ValueBind__Group__0 : rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 ;
    public final void rule__ValueBind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2384:1: ( rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1 )
            // InternalRules.g:2385:2: rule__ValueBind__Group__0__Impl rule__ValueBind__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ValueBind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueBind__Group__1();

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
    // $ANTLR end "rule__ValueBind__Group__0"


    // $ANTLR start "rule__ValueBind__Group__0__Impl"
    // InternalRules.g:2392:1: rule__ValueBind__Group__0__Impl : ( 'value' ) ;
    public final void rule__ValueBind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2396:1: ( ( 'value' ) )
            // InternalRules.g:2397:1: ( 'value' )
            {
            // InternalRules.g:2397:1: ( 'value' )
            // InternalRules.g:2398:2: 'value'
            {
             before(grammarAccess.getValueBindAccess().getValueKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getValueBindAccess().getValueKeyword_0()); 

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
    // $ANTLR end "rule__ValueBind__Group__0__Impl"


    // $ANTLR start "rule__ValueBind__Group__1"
    // InternalRules.g:2407:1: rule__ValueBind__Group__1 : rule__ValueBind__Group__1__Impl ;
    public final void rule__ValueBind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2411:1: ( rule__ValueBind__Group__1__Impl )
            // InternalRules.g:2412:2: rule__ValueBind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueBind__Group__1__Impl();

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
    // $ANTLR end "rule__ValueBind__Group__1"


    // $ANTLR start "rule__ValueBind__Group__1__Impl"
    // InternalRules.g:2418:1: rule__ValueBind__Group__1__Impl : ( ( rule__ValueBind__ValueAssignment_1 ) ) ;
    public final void rule__ValueBind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2422:1: ( ( ( rule__ValueBind__ValueAssignment_1 ) ) )
            // InternalRules.g:2423:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            {
            // InternalRules.g:2423:1: ( ( rule__ValueBind__ValueAssignment_1 ) )
            // InternalRules.g:2424:2: ( rule__ValueBind__ValueAssignment_1 )
            {
             before(grammarAccess.getValueBindAccess().getValueAssignment_1()); 
            // InternalRules.g:2425:2: ( rule__ValueBind__ValueAssignment_1 )
            // InternalRules.g:2425:3: rule__ValueBind__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueBind__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueBindAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ValueBind__Group__1__Impl"


    // $ANTLR start "rule__Model__RolesAssignment_0"
    // InternalRules.g:2434:1: rule__Model__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2438:1: ( ( ruleRole ) )
            // InternalRules.g:2439:2: ( ruleRole )
            {
            // InternalRules.g:2439:2: ( ruleRole )
            // InternalRules.g:2440:3: ruleRole
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
    // InternalRules.g:2449:1: rule__Model__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__Model__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2453:1: ( ( rulePolicy ) )
            // InternalRules.g:2454:2: ( rulePolicy )
            {
            // InternalRules.g:2454:2: ( rulePolicy )
            // InternalRules.g:2455:3: rulePolicy
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
    // InternalRules.g:2464:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2468:1: ( ( RULE_ID ) )
            // InternalRules.g:2469:2: ( RULE_ID )
            {
            // InternalRules.g:2469:2: ( RULE_ID )
            // InternalRules.g:2470:3: RULE_ID
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
    // InternalRules.g:2479:1: rule__Policy__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2483:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2484:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2484:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2485:3: ruleAccessibilityLevel
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
    // InternalRules.g:2494:1: rule__Policy__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2498:1: ( ( ruleOperationType ) )
            // InternalRules.g:2499:2: ( ruleOperationType )
            {
            // InternalRules.g:2499:2: ( ruleOperationType )
            // InternalRules.g:2500:3: ruleOperationType
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
    // InternalRules.g:2509:1: rule__Policy__RulesAssignment_7 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2513:1: ( ( ruleRule ) )
            // InternalRules.g:2514:2: ( ruleRule )
            {
            // InternalRules.g:2514:2: ( ruleRule )
            // InternalRules.g:2515:3: ruleRule
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
    // InternalRules.g:2524:1: rule__Policy__ResolutionAssignment_10 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2528:1: ( ( ruleResolutionType ) )
            // InternalRules.g:2529:2: ( ruleResolutionType )
            {
            // InternalRules.g:2529:2: ( ruleResolutionType )
            // InternalRules.g:2530:3: ruleResolutionType
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
    // InternalRules.g:2539:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2543:1: ( ( RULE_ID ) )
            // InternalRules.g:2544:2: ( RULE_ID )
            {
            // InternalRules.g:2544:2: ( RULE_ID )
            // InternalRules.g:2545:3: RULE_ID
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
    // InternalRules.g:2554:1: rule__Rule__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2558:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2559:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2559:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2560:3: ruleAccessibilityLevel
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
    // InternalRules.g:2569:1: rule__Rule__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2573:1: ( ( ruleOperationType ) )
            // InternalRules.g:2574:2: ( ruleOperationType )
            {
            // InternalRules.g:2574:2: ( ruleOperationType )
            // InternalRules.g:2575:3: ruleOperationType
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
    // InternalRules.g:2584:1: rule__Rule__RolesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2588:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2589:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2589:2: ( ( RULE_ID ) )
            // InternalRules.g:2590:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 
            // InternalRules.g:2591:3: ( RULE_ID )
            // InternalRules.g:2592:4: RULE_ID
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
    // InternalRules.g:2603:1: rule__Rule__RolesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2607:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2608:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2608:2: ( ( RULE_ID ) )
            // InternalRules.g:2609:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 
            // InternalRules.g:2610:3: ( RULE_ID )
            // InternalRules.g:2611:4: RULE_ID
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


    // $ANTLR start "rule__Rule__PatternAssignment_10"
    // InternalRules.g:2622:1: rule__Rule__PatternAssignment_10 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2626:1: ( ( ( RULE_STRING ) ) )
            // InternalRules.g:2627:2: ( ( RULE_STRING ) )
            {
            // InternalRules.g:2627:2: ( ( RULE_STRING ) )
            // InternalRules.g:2628:3: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 
            // InternalRules.g:2629:3: ( RULE_STRING )
            // InternalRules.g:2630:4: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_10_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPatternPatternSTRINGTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 

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
    // $ANTLR end "rule__Rule__PatternAssignment_10"


    // $ANTLR start "rule__Rule__AssetAssignment_12"
    // InternalRules.g:2641:1: rule__Rule__AssetAssignment_12 : ( ruleAsset ) ;
    public final void rule__Rule__AssetAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2645:1: ( ( ruleAsset ) )
            // InternalRules.g:2646:2: ( ruleAsset )
            {
            // InternalRules.g:2646:2: ( ruleAsset )
            // InternalRules.g:2647:3: ruleAsset
            {
             before(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetAssetParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Rule__AssetAssignment_12"


    // $ANTLR start "rule__Rule__BindingsAssignment_13"
    // InternalRules.g:2656:1: rule__Rule__BindingsAssignment_13 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2660:1: ( ( ruleBinding ) )
            // InternalRules.g:2661:2: ( ruleBinding )
            {
            // InternalRules.g:2661:2: ( ruleBinding )
            // InternalRules.g:2662:3: ruleBinding
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
    // InternalRules.g:2671:1: rule__Rule__PriorityAssignment_15_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2675:1: ( ( RULE_INT ) )
            // InternalRules.g:2676:2: ( RULE_INT )
            {
            // InternalRules.g:2676:2: ( RULE_INT )
            // InternalRules.g:2677:3: RULE_INT
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
    // InternalRules.g:2686:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2690:1: ( ( RULE_ID ) )
            // InternalRules.g:2691:2: ( RULE_ID )
            {
            // InternalRules.g:2691:2: ( RULE_ID )
            // InternalRules.g:2692:3: RULE_ID
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
    // InternalRules.g:2701:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2705:1: ( ( RULE_ID ) )
            // InternalRules.g:2706:2: ( RULE_ID )
            {
            // InternalRules.g:2706:2: ( RULE_ID )
            // InternalRules.g:2707:3: RULE_ID
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
    // InternalRules.g:2716:1: rule__Group__UsersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2720:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2721:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2721:2: ( ( RULE_ID ) )
            // InternalRules.g:2722:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_3_0()); 
            // InternalRules.g:2723:3: ( RULE_ID )
            // InternalRules.g:2724:4: RULE_ID
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
    // InternalRules.g:2735:1: rule__Group__UsersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__UsersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2739:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2740:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2740:2: ( ( RULE_ID ) )
            // InternalRules.g:2741:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getUsersUserCrossReference_4_1_0()); 
            // InternalRules.g:2742:3: ( RULE_ID )
            // InternalRules.g:2743:4: RULE_ID
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


    // $ANTLR start "rule__ObjectFact__VariableAssignment_1"
    // InternalRules.g:2754:1: rule__ObjectFact__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectFact__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2758:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2759:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2759:2: ( ( RULE_ID ) )
            // InternalRules.g:2760:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_1_0()); 
            // InternalRules.g:2761:3: ( RULE_ID )
            // InternalRules.g:2762:4: RULE_ID
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__ObjectFact__VariableAssignment_1"


    // $ANTLR start "rule__ReferenceFact__SourceVarAssignment_1"
    // InternalRules.g:2773:1: rule__ReferenceFact__SourceVarAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__SourceVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2777:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2778:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2778:2: ( ( RULE_ID ) )
            // InternalRules.g:2779:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_1_0()); 
            // InternalRules.g:2780:3: ( RULE_ID )
            // InternalRules.g:2781:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__ReferenceFact__SourceVarAssignment_1"


    // $ANTLR start "rule__ReferenceFact__TargetVarAssignment_3"
    // InternalRules.g:2792:1: rule__ReferenceFact__TargetVarAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__TargetVarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2796:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2797:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2797:2: ( ( RULE_ID ) )
            // InternalRules.g:2798:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_3_0()); 
            // InternalRules.g:2799:3: ( RULE_ID )
            // InternalRules.g:2800:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_3_0()); 

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
    // $ANTLR end "rule__ReferenceFact__TargetVarAssignment_3"


    // $ANTLR start "rule__ReferenceFact__ReferenceAssignment_5"
    // InternalRules.g:2811:1: rule__ReferenceFact__ReferenceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__ReferenceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2815:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2816:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2816:2: ( ( RULE_ID ) )
            // InternalRules.g:2817:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_5_0()); 
            // InternalRules.g:2818:3: ( RULE_ID )
            // InternalRules.g:2819:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_5_0()); 

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
    // $ANTLR end "rule__ReferenceFact__ReferenceAssignment_5"


    // $ANTLR start "rule__AttributeFact__VariableAssignment_1"
    // InternalRules.g:2830:1: rule__AttributeFact__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2834:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2835:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2835:2: ( ( RULE_ID ) )
            // InternalRules.g:2836:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_1_0()); 
            // InternalRules.g:2837:3: ( RULE_ID )
            // InternalRules.g:2838:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__AttributeFact__VariableAssignment_1"


    // $ANTLR start "rule__Binding__VariableAssignment_1"
    // InternalRules.g:2849:1: rule__Binding__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2853:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2854:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2854:2: ( ( RULE_ID ) )
            // InternalRules.g:2855:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 
            // InternalRules.g:2856:3: ( RULE_ID )
            // InternalRules.g:2857:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__Binding__VariableAssignment_1"


    // $ANTLR start "rule__Binding__BindAssignment_4"
    // InternalRules.g:2868:1: rule__Binding__BindAssignment_4 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2872:1: ( ( ruleBind ) )
            // InternalRules.g:2873:2: ( ruleBind )
            {
            // InternalRules.g:2873:2: ( ruleBind )
            // InternalRules.g:2874:3: ruleBind
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


    // $ANTLR start "rule__ObjectBind__ObjectAssignment_1"
    // InternalRules.g:2883:1: rule__ObjectBind__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectBind__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2887:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2888:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2888:2: ( ( RULE_ID ) )
            // InternalRules.g:2889:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 
            // InternalRules.g:2890:3: ( RULE_ID )
            // InternalRules.g:2891:4: RULE_ID
            {
             before(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectBindAccess().getObjectEObjectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getObjectBindAccess().getObjectEObjectCrossReference_1_0()); 

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
    // $ANTLR end "rule__ObjectBind__ObjectAssignment_1"


    // $ANTLR start "rule__ValueBind__ValueAssignment_1"
    // InternalRules.g:2902:1: rule__ValueBind__ValueAssignment_1 : ( ruleValueType ) ;
    public final void rule__ValueBind__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2906:1: ( ( ruleValueType ) )
            // InternalRules.g:2907:2: ( ruleValueType )
            {
            // InternalRules.g:2907:2: ( ruleValueType )
            // InternalRules.g:2908:3: ruleValueType
            {
             before(grammarAccess.getValueBindAccess().getValueValueTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueBindAccess().getValueValueTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__ValueBind__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000025000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});

}