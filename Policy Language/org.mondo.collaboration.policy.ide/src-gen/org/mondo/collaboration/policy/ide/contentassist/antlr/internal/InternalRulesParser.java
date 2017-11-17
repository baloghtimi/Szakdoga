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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'obfuscate'", "'unset'", "'R'", "'W'", "'RW'", "'restrictive'", "'permissive'", "'user'", "'group'", "'{'", "'}'", "','", "'policy'", "'by'", "'default'", "'with'", "'resolution'", "'rule'", "'to'", "'from'", "'query'", "'select'", "'priority'", "'obj'", "'('", "')'", "'ref'", "'->'", "':'", "'attr'", "'where'", "'is'", "'bound'"
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


    // $ANTLR start "entryRuleRole"
    // InternalRules.g:78:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalRules.g:79:1: ( ruleRole EOF )
            // InternalRules.g:80:1: ruleRole EOF
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
    // InternalRules.g:87:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:91:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalRules.g:92:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalRules.g:92:2: ( ( rule__Role__Alternatives ) )
            // InternalRules.g:93:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalRules.g:94:3: ( rule__Role__Alternatives )
            // InternalRules.g:94:4: rule__Role__Alternatives
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
    // InternalRules.g:103:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalRules.g:104:1: ( ruleUser EOF )
            // InternalRules.g:105:1: ruleUser EOF
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
    // InternalRules.g:112:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:116:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalRules.g:117:2: ( ( rule__User__Group__0 ) )
            {
            // InternalRules.g:117:2: ( ( rule__User__Group__0 ) )
            // InternalRules.g:118:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalRules.g:119:3: ( rule__User__Group__0 )
            // InternalRules.g:119:4: rule__User__Group__0
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
    // InternalRules.g:128:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalRules.g:129:1: ( ruleGroup EOF )
            // InternalRules.g:130:1: ruleGroup EOF
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
    // InternalRules.g:137:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:141:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalRules.g:142:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalRules.g:142:2: ( ( rule__Group__Group__0 ) )
            // InternalRules.g:143:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalRules.g:144:3: ( rule__Group__Group__0 )
            // InternalRules.g:144:4: rule__Group__Group__0
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


    // $ANTLR start "entryRulePolicy"
    // InternalRules.g:153:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalRules.g:154:1: ( rulePolicy EOF )
            // InternalRules.g:155:1: rulePolicy EOF
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
    // InternalRules.g:162:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:166:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalRules.g:167:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalRules.g:167:2: ( ( rule__Policy__Group__0 ) )
            // InternalRules.g:168:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalRules.g:169:3: ( rule__Policy__Group__0 )
            // InternalRules.g:169:4: rule__Policy__Group__0
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
    // InternalRules.g:178:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRules.g:179:1: ( ruleRule EOF )
            // InternalRules.g:180:1: ruleRule EOF
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
    // InternalRules.g:187:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:191:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRules.g:192:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRules.g:192:2: ( ( rule__Rule__Group__0 ) )
            // InternalRules.g:193:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRules.g:194:3: ( rule__Rule__Group__0 )
            // InternalRules.g:194:4: rule__Rule__Group__0
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


    // $ANTLR start "entryRuleModelFact"
    // InternalRules.g:203:1: entryRuleModelFact : ruleModelFact EOF ;
    public final void entryRuleModelFact() throws RecognitionException {
        try {
            // InternalRules.g:204:1: ( ruleModelFact EOF )
            // InternalRules.g:205:1: ruleModelFact EOF
            {
             before(grammarAccess.getModelFactRule()); 
            pushFollow(FOLLOW_1);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getModelFactRule()); 
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
    // $ANTLR end "entryRuleModelFact"


    // $ANTLR start "ruleModelFact"
    // InternalRules.g:212:1: ruleModelFact : ( ( rule__ModelFact__Alternatives ) ) ;
    public final void ruleModelFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:216:2: ( ( ( rule__ModelFact__Alternatives ) ) )
            // InternalRules.g:217:2: ( ( rule__ModelFact__Alternatives ) )
            {
            // InternalRules.g:217:2: ( ( rule__ModelFact__Alternatives ) )
            // InternalRules.g:218:3: ( rule__ModelFact__Alternatives )
            {
             before(grammarAccess.getModelFactAccess().getAlternatives()); 
            // InternalRules.g:219:3: ( rule__ModelFact__Alternatives )
            // InternalRules.g:219:4: rule__ModelFact__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelFact__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelFactAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelFact"


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


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:353:1: ruleAccessibilityLevel : ( ( rule__AccessibilityLevel__Alternatives ) ) ;
    public final void ruleAccessibilityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:357:1: ( ( ( rule__AccessibilityLevel__Alternatives ) ) )
            // InternalRules.g:358:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            {
            // InternalRules.g:358:2: ( ( rule__AccessibilityLevel__Alternatives ) )
            // InternalRules.g:359:3: ( rule__AccessibilityLevel__Alternatives )
            {
             before(grammarAccess.getAccessibilityLevelAccess().getAlternatives()); 
            // InternalRules.g:360:3: ( rule__AccessibilityLevel__Alternatives )
            // InternalRules.g:360:4: rule__AccessibilityLevel__Alternatives
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
    // InternalRules.g:369:1: ruleOperationType : ( ( rule__OperationType__Alternatives ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:373:1: ( ( ( rule__OperationType__Alternatives ) ) )
            // InternalRules.g:374:2: ( ( rule__OperationType__Alternatives ) )
            {
            // InternalRules.g:374:2: ( ( rule__OperationType__Alternatives ) )
            // InternalRules.g:375:3: ( rule__OperationType__Alternatives )
            {
             before(grammarAccess.getOperationTypeAccess().getAlternatives()); 
            // InternalRules.g:376:3: ( rule__OperationType__Alternatives )
            // InternalRules.g:376:4: rule__OperationType__Alternatives
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
    // InternalRules.g:385:1: ruleResolutionType : ( ( rule__ResolutionType__Alternatives ) ) ;
    public final void ruleResolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:389:1: ( ( ( rule__ResolutionType__Alternatives ) ) )
            // InternalRules.g:390:2: ( ( rule__ResolutionType__Alternatives ) )
            {
            // InternalRules.g:390:2: ( ( rule__ResolutionType__Alternatives ) )
            // InternalRules.g:391:3: ( rule__ResolutionType__Alternatives )
            {
             before(grammarAccess.getResolutionTypeAccess().getAlternatives()); 
            // InternalRules.g:392:3: ( rule__ResolutionType__Alternatives )
            // InternalRules.g:392:4: rule__ResolutionType__Alternatives
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
    // InternalRules.g:400:1: rule__Role__Alternatives : ( ( ruleUser ) | ( ruleGroup ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:404:1: ( ( ruleUser ) | ( ruleGroup ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRules.g:405:2: ( ruleUser )
                    {
                    // InternalRules.g:405:2: ( ruleUser )
                    // InternalRules.g:406:3: ruleUser
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
                    // InternalRules.g:411:2: ( ruleGroup )
                    {
                    // InternalRules.g:411:2: ( ruleGroup )
                    // InternalRules.g:412:3: ruleGroup
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


    // $ANTLR start "rule__ModelFact__Alternatives"
    // InternalRules.g:421:1: rule__ModelFact__Alternatives : ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) );
    public final void rule__ModelFact__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:425:1: ( ( ruleObjectFact ) | ( ruleReferenceFact ) | ( ruleAttributeFact ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 42:
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
                    // InternalRules.g:426:2: ( ruleObjectFact )
                    {
                    // InternalRules.g:426:2: ( ruleObjectFact )
                    // InternalRules.g:427:3: ruleObjectFact
                    {
                     before(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getObjectFactParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:432:2: ( ruleReferenceFact )
                    {
                    // InternalRules.g:432:2: ( ruleReferenceFact )
                    // InternalRules.g:433:3: ruleReferenceFact
                    {
                     before(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getReferenceFactParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:438:2: ( ruleAttributeFact )
                    {
                    // InternalRules.g:438:2: ( ruleAttributeFact )
                    // InternalRules.g:439:3: ruleAttributeFact
                    {
                     before(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFact();

                    state._fsp--;

                     after(grammarAccess.getModelFactAccess().getAttributeFactParserRuleCall_2()); 

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
    // $ANTLR end "rule__ModelFact__Alternatives"


    // $ANTLR start "rule__Bind__Alternatives"
    // InternalRules.g:448:1: rule__Bind__Alternatives : ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) );
    public final void rule__Bind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:452:1: ( ( ( rule__Bind__ValueStringAssignment_0 ) ) | ( ( rule__Bind__ValueIntegerAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRules.g:453:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    {
                    // InternalRules.g:453:2: ( ( rule__Bind__ValueStringAssignment_0 ) )
                    // InternalRules.g:454:3: ( rule__Bind__ValueStringAssignment_0 )
                    {
                     before(grammarAccess.getBindAccess().getValueStringAssignment_0()); 
                    // InternalRules.g:455:3: ( rule__Bind__ValueStringAssignment_0 )
                    // InternalRules.g:455:4: rule__Bind__ValueStringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueStringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:459:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    {
                    // InternalRules.g:459:2: ( ( rule__Bind__ValueIntegerAssignment_1 ) )
                    // InternalRules.g:460:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    {
                     before(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 
                    // InternalRules.g:461:3: ( rule__Bind__ValueIntegerAssignment_1 )
                    // InternalRules.g:461:4: rule__Bind__ValueIntegerAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__ValueIntegerAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBindAccess().getValueIntegerAssignment_1()); 

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


    // $ANTLR start "rule__AccessibilityLevel__Alternatives"
    // InternalRules.g:469:1: rule__AccessibilityLevel__Alternatives : ( ( ( 'allow' ) ) | ( ( 'deny' ) ) | ( ( 'obfuscate' ) ) );
    public final void rule__AccessibilityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:473:1: ( ( ( 'allow' ) ) | ( ( 'deny' ) ) | ( ( 'obfuscate' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
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
                    // InternalRules.g:474:2: ( ( 'allow' ) )
                    {
                    // InternalRules.g:474:2: ( ( 'allow' ) )
                    // InternalRules.g:475:3: ( 'allow' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 
                    // InternalRules.g:476:3: ( 'allow' )
                    // InternalRules.g:476:4: 'allow'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:480:2: ( ( 'deny' ) )
                    {
                    // InternalRules.g:480:2: ( ( 'deny' ) )
                    // InternalRules.g:481:3: ( 'deny' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 
                    // InternalRules.g:482:3: ( 'deny' )
                    // InternalRules.g:482:4: 'deny'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:486:2: ( ( 'obfuscate' ) )
                    {
                    // InternalRules.g:486:2: ( ( 'obfuscate' ) )
                    // InternalRules.g:487:3: ( 'obfuscate' )
                    {
                     before(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:488:3: ( 'obfuscate' )
                    // InternalRules.g:488:4: 'obfuscate'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_2()); 

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
    // InternalRules.g:496:1: rule__OperationType__Alternatives : ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) );
    public final void rule__OperationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:500:1: ( ( ( 'unset' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'RW' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRules.g:501:2: ( ( 'unset' ) )
                    {
                    // InternalRules.g:501:2: ( ( 'unset' ) )
                    // InternalRules.g:502:3: ( 'unset' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 
                    // InternalRules.g:503:3: ( 'unset' )
                    // InternalRules.g:503:4: 'unset'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getUNSETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:507:2: ( ( 'R' ) )
                    {
                    // InternalRules.g:507:2: ( ( 'R' ) )
                    // InternalRules.g:508:3: ( 'R' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 
                    // InternalRules.g:509:3: ( 'R' )
                    // InternalRules.g:509:4: 'R'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:513:2: ( ( 'W' ) )
                    {
                    // InternalRules.g:513:2: ( ( 'W' ) )
                    // InternalRules.g:514:3: ( 'W' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 
                    // InternalRules.g:515:3: ( 'W' )
                    // InternalRules.g:515:4: 'W'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getWRITEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRules.g:519:2: ( ( 'RW' ) )
                    {
                    // InternalRules.g:519:2: ( ( 'RW' ) )
                    // InternalRules.g:520:3: ( 'RW' )
                    {
                     before(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 
                    // InternalRules.g:521:3: ( 'RW' )
                    // InternalRules.g:521:4: 'RW'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_3()); 

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
    // InternalRules.g:529:1: rule__ResolutionType__Alternatives : ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) );
    public final void rule__ResolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:533:1: ( ( ( 'restrictive' ) ) | ( ( 'permissive' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRules.g:534:2: ( ( 'restrictive' ) )
                    {
                    // InternalRules.g:534:2: ( ( 'restrictive' ) )
                    // InternalRules.g:535:3: ( 'restrictive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 
                    // InternalRules.g:536:3: ( 'restrictive' )
                    // InternalRules.g:536:4: 'restrictive'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:540:2: ( ( 'permissive' ) )
                    {
                    // InternalRules.g:540:2: ( ( 'permissive' ) )
                    // InternalRules.g:541:3: ( 'permissive' )
                    {
                     before(grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1()); 
                    // InternalRules.g:542:3: ( 'permissive' )
                    // InternalRules.g:542:4: 'permissive'
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
    // InternalRules.g:550:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:554:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRules.g:555:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalRules.g:562:1: rule__Model__Group__0__Impl : ( ( rule__Model__RolesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:566:1: ( ( ( rule__Model__RolesAssignment_0 )* ) )
            // InternalRules.g:567:1: ( ( rule__Model__RolesAssignment_0 )* )
            {
            // InternalRules.g:567:1: ( ( rule__Model__RolesAssignment_0 )* )
            // InternalRules.g:568:2: ( rule__Model__RolesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_0()); 
            // InternalRules.g:569:2: ( rule__Model__RolesAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRules.g:569:3: rule__Model__RolesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RolesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRules.g:577:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:581:1: ( rule__Model__Group__1__Impl )
            // InternalRules.g:582:2: rule__Model__Group__1__Impl
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
    // InternalRules.g:588:1: rule__Model__Group__1__Impl : ( ( rule__Model__PolicyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:592:1: ( ( ( rule__Model__PolicyAssignment_1 ) ) )
            // InternalRules.g:593:1: ( ( rule__Model__PolicyAssignment_1 ) )
            {
            // InternalRules.g:593:1: ( ( rule__Model__PolicyAssignment_1 ) )
            // InternalRules.g:594:2: ( rule__Model__PolicyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPolicyAssignment_1()); 
            // InternalRules.g:595:2: ( rule__Model__PolicyAssignment_1 )
            // InternalRules.g:595:3: rule__Model__PolicyAssignment_1
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


    // $ANTLR start "rule__User__Group__0"
    // InternalRules.g:604:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:608:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalRules.g:609:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalRules.g:616:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:620:1: ( ( 'user' ) )
            // InternalRules.g:621:1: ( 'user' )
            {
            // InternalRules.g:621:1: ( 'user' )
            // InternalRules.g:622:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRules.g:631:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:635:1: ( rule__User__Group__1__Impl )
            // InternalRules.g:636:2: rule__User__Group__1__Impl
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
    // InternalRules.g:642:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:646:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalRules.g:647:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalRules.g:647:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalRules.g:648:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalRules.g:649:2: ( rule__User__NameAssignment_1 )
            // InternalRules.g:649:3: rule__User__NameAssignment_1
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
    // InternalRules.g:658:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:662:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalRules.g:663:2: rule__Group__Group__0__Impl rule__Group__Group__1
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
    // InternalRules.g:670:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:674:1: ( ( 'group' ) )
            // InternalRules.g:675:1: ( 'group' )
            {
            // InternalRules.g:675:1: ( 'group' )
            // InternalRules.g:676:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRules.g:685:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:689:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalRules.g:690:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRules.g:697:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:701:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalRules.g:702:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalRules.g:702:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalRules.g:703:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalRules.g:704:2: ( rule__Group__NameAssignment_1 )
            // InternalRules.g:704:3: rule__Group__NameAssignment_1
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
    // InternalRules.g:712:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:716:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalRules.g:717:2: rule__Group__Group__2__Impl rule__Group__Group__3
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
    // InternalRules.g:724:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:728:1: ( ( '{' ) )
            // InternalRules.g:729:1: ( '{' )
            {
            // InternalRules.g:729:1: ( '{' )
            // InternalRules.g:730:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:739:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:743:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalRules.g:744:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:751:1: rule__Group__Group__3__Impl : ( ( rule__Group__RolesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:755:1: ( ( ( rule__Group__RolesAssignment_3 ) ) )
            // InternalRules.g:756:1: ( ( rule__Group__RolesAssignment_3 ) )
            {
            // InternalRules.g:756:1: ( ( rule__Group__RolesAssignment_3 ) )
            // InternalRules.g:757:2: ( rule__Group__RolesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_3()); 
            // InternalRules.g:758:2: ( rule__Group__RolesAssignment_3 )
            // InternalRules.g:758:3: rule__Group__RolesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Group__RolesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRolesAssignment_3()); 

            }


            }

        }
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
    // InternalRules.g:766:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:770:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalRules.g:771:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalRules.g:778:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:782:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // InternalRules.g:783:1: ( ( rule__Group__Group_4__0 )* )
            {
            // InternalRules.g:783:1: ( ( rule__Group__Group_4__0 )* )
            // InternalRules.g:784:2: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // InternalRules.g:785:2: ( rule__Group__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRules.g:785:3: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRules.g:793:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:797:1: ( rule__Group__Group__5__Impl )
            // InternalRules.g:798:2: rule__Group__Group__5__Impl
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
    // InternalRules.g:804:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:808:1: ( ( '}' ) )
            // InternalRules.g:809:1: ( '}' )
            {
            // InternalRules.g:809:1: ( '}' )
            // InternalRules.g:810:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:820:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:824:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // InternalRules.g:825:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
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
    // InternalRules.g:832:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:836:1: ( ( ',' ) )
            // InternalRules.g:837:1: ( ',' )
            {
            // InternalRules.g:837:1: ( ',' )
            // InternalRules.g:838:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:847:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:851:1: ( rule__Group__Group_4__1__Impl )
            // InternalRules.g:852:2: rule__Group__Group_4__1__Impl
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
    // InternalRules.g:858:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__RolesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:862:1: ( ( ( rule__Group__RolesAssignment_4_1 ) ) )
            // InternalRules.g:863:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            {
            // InternalRules.g:863:1: ( ( rule__Group__RolesAssignment_4_1 ) )
            // InternalRules.g:864:2: ( rule__Group__RolesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 
            // InternalRules.g:865:2: ( rule__Group__RolesAssignment_4_1 )
            // InternalRules.g:865:3: rule__Group__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRolesAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Policy__Group__0"
    // InternalRules.g:874:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:878:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalRules.g:879:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalRules.g:886:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:890:1: ( ( 'policy' ) )
            // InternalRules.g:891:1: ( 'policy' )
            {
            // InternalRules.g:891:1: ( 'policy' )
            // InternalRules.g:892:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRules.g:901:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:905:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalRules.g:906:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRules.g:913:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:917:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalRules.g:918:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalRules.g:918:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalRules.g:919:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalRules.g:920:2: ( rule__Policy__NameAssignment_1 )
            // InternalRules.g:920:3: rule__Policy__NameAssignment_1
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
    // InternalRules.g:928:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:932:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalRules.g:933:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRules.g:940:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__AccessAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:944:1: ( ( ( rule__Policy__AccessAssignment_2 ) ) )
            // InternalRules.g:945:1: ( ( rule__Policy__AccessAssignment_2 ) )
            {
            // InternalRules.g:945:1: ( ( rule__Policy__AccessAssignment_2 ) )
            // InternalRules.g:946:2: ( rule__Policy__AccessAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getAccessAssignment_2()); 
            // InternalRules.g:947:2: ( rule__Policy__AccessAssignment_2 )
            // InternalRules.g:947:3: rule__Policy__AccessAssignment_2
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
    // InternalRules.g:955:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:959:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalRules.g:960:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRules.g:967:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__OperationAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:971:1: ( ( ( rule__Policy__OperationAssignment_3 ) ) )
            // InternalRules.g:972:1: ( ( rule__Policy__OperationAssignment_3 ) )
            {
            // InternalRules.g:972:1: ( ( rule__Policy__OperationAssignment_3 ) )
            // InternalRules.g:973:2: ( rule__Policy__OperationAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getOperationAssignment_3()); 
            // InternalRules.g:974:2: ( rule__Policy__OperationAssignment_3 )
            // InternalRules.g:974:3: rule__Policy__OperationAssignment_3
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
    // InternalRules.g:982:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:986:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalRules.g:987:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalRules.g:994:1: rule__Policy__Group__4__Impl : ( 'by' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:998:1: ( ( 'by' ) )
            // InternalRules.g:999:1: ( 'by' )
            {
            // InternalRules.g:999:1: ( 'by' )
            // InternalRules.g:1000:2: 'by'
            {
             before(grammarAccess.getPolicyAccess().getByKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRules.g:1009:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1013:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalRules.g:1014:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalRules.g:1021:1: rule__Policy__Group__5__Impl : ( 'default' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1025:1: ( ( 'default' ) )
            // InternalRules.g:1026:1: ( 'default' )
            {
            // InternalRules.g:1026:1: ( 'default' )
            // InternalRules.g:1027:2: 'default'
            {
             before(grammarAccess.getPolicyAccess().getDefaultKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRules.g:1036:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1040:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalRules.g:1041:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalRules.g:1048:1: rule__Policy__Group__6__Impl : ( '{' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1052:1: ( ( '{' ) )
            // InternalRules.g:1053:1: ( '{' )
            {
            // InternalRules.g:1053:1: ( '{' )
            // InternalRules.g:1054:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:1063:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1067:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalRules.g:1068:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalRules.g:1075:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__RulesAssignment_7 )* ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1079:1: ( ( ( rule__Policy__RulesAssignment_7 )* ) )
            // InternalRules.g:1080:1: ( ( rule__Policy__RulesAssignment_7 )* )
            {
            // InternalRules.g:1080:1: ( ( rule__Policy__RulesAssignment_7 )* )
            // InternalRules.g:1081:2: ( rule__Policy__RulesAssignment_7 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_7()); 
            // InternalRules.g:1082:2: ( rule__Policy__RulesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRules.g:1082:3: rule__Policy__RulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalRules.g:1090:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1094:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalRules.g:1095:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalRules.g:1102:1: rule__Policy__Group__8__Impl : ( '}' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1106:1: ( ( '}' ) )
            // InternalRules.g:1107:1: ( '}' )
            {
            // InternalRules.g:1107:1: ( '}' )
            // InternalRules.g:1108:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:1117:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1121:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalRules.g:1122:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalRules.g:1129:1: rule__Policy__Group__9__Impl : ( 'with' ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1133:1: ( ( 'with' ) )
            // InternalRules.g:1134:1: ( 'with' )
            {
            // InternalRules.g:1134:1: ( 'with' )
            // InternalRules.g:1135:2: 'with'
            {
             before(grammarAccess.getPolicyAccess().getWithKeyword_9()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRules.g:1144:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl rule__Policy__Group__11 ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1148:1: ( rule__Policy__Group__10__Impl rule__Policy__Group__11 )
            // InternalRules.g:1149:2: rule__Policy__Group__10__Impl rule__Policy__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalRules.g:1156:1: rule__Policy__Group__10__Impl : ( ( rule__Policy__ResolutionAssignment_10 ) ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1160:1: ( ( ( rule__Policy__ResolutionAssignment_10 ) ) )
            // InternalRules.g:1161:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            {
            // InternalRules.g:1161:1: ( ( rule__Policy__ResolutionAssignment_10 ) )
            // InternalRules.g:1162:2: ( rule__Policy__ResolutionAssignment_10 )
            {
             before(grammarAccess.getPolicyAccess().getResolutionAssignment_10()); 
            // InternalRules.g:1163:2: ( rule__Policy__ResolutionAssignment_10 )
            // InternalRules.g:1163:3: rule__Policy__ResolutionAssignment_10
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
    // InternalRules.g:1171:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1175:1: ( rule__Policy__Group__11__Impl )
            // InternalRules.g:1176:2: rule__Policy__Group__11__Impl
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
    // InternalRules.g:1182:1: rule__Policy__Group__11__Impl : ( 'resolution' ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1186:1: ( ( 'resolution' ) )
            // InternalRules.g:1187:1: ( 'resolution' )
            {
            // InternalRules.g:1187:1: ( 'resolution' )
            // InternalRules.g:1188:2: 'resolution'
            {
             before(grammarAccess.getPolicyAccess().getResolutionKeyword_11()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRules.g:1198:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1202:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRules.g:1203:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalRules.g:1210:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1214:1: ( ( 'rule' ) )
            // InternalRules.g:1215:1: ( 'rule' )
            {
            // InternalRules.g:1215:1: ( 'rule' )
            // InternalRules.g:1216:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRules.g:1225:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1229:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRules.g:1230:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRules.g:1237:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1241:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalRules.g:1242:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalRules.g:1242:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalRules.g:1243:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalRules.g:1244:2: ( rule__Rule__NameAssignment_1 )
            // InternalRules.g:1244:3: rule__Rule__NameAssignment_1
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
    // InternalRules.g:1252:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1256:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRules.g:1257:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRules.g:1264:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AccessAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1268:1: ( ( ( rule__Rule__AccessAssignment_2 ) ) )
            // InternalRules.g:1269:1: ( ( rule__Rule__AccessAssignment_2 ) )
            {
            // InternalRules.g:1269:1: ( ( rule__Rule__AccessAssignment_2 ) )
            // InternalRules.g:1270:2: ( rule__Rule__AccessAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAccessAssignment_2()); 
            // InternalRules.g:1271:2: ( rule__Rule__AccessAssignment_2 )
            // InternalRules.g:1271:3: rule__Rule__AccessAssignment_2
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
    // InternalRules.g:1279:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1283:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRules.g:1284:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRules.g:1291:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperationAssignment_3 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1295:1: ( ( ( rule__Rule__OperationAssignment_3 )? ) )
            // InternalRules.g:1296:1: ( ( rule__Rule__OperationAssignment_3 )? )
            {
            // InternalRules.g:1296:1: ( ( rule__Rule__OperationAssignment_3 )? )
            // InternalRules.g:1297:2: ( rule__Rule__OperationAssignment_3 )?
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_3()); 
            // InternalRules.g:1298:2: ( rule__Rule__OperationAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=14 && LA10_0<=17)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:1298:3: rule__Rule__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__OperationAssignment_3();

                    state._fsp--;


                    }
                    break;

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
    // InternalRules.g:1306:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1310:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRules.g:1311:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalRules.g:1318:1: rule__Rule__Group__4__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1322:1: ( ( 'to' ) )
            // InternalRules.g:1323:1: ( 'to' )
            {
            // InternalRules.g:1323:1: ( 'to' )
            // InternalRules.g:1324:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRules.g:1333:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1337:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRules.g:1338:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalRules.g:1345:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__RolesAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1349:1: ( ( ( rule__Rule__RolesAssignment_5 ) ) )
            // InternalRules.g:1350:1: ( ( rule__Rule__RolesAssignment_5 ) )
            {
            // InternalRules.g:1350:1: ( ( rule__Rule__RolesAssignment_5 ) )
            // InternalRules.g:1351:2: ( rule__Rule__RolesAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_5()); 
            // InternalRules.g:1352:2: ( rule__Rule__RolesAssignment_5 )
            // InternalRules.g:1352:3: rule__Rule__RolesAssignment_5
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
    // InternalRules.g:1360:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1364:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRules.g:1365:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalRules.g:1372:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1376:1: ( ( ( rule__Rule__Group_6__0 )* ) )
            // InternalRules.g:1377:1: ( ( rule__Rule__Group_6__0 )* )
            {
            // InternalRules.g:1377:1: ( ( rule__Rule__Group_6__0 )* )
            // InternalRules.g:1378:2: ( rule__Rule__Group_6__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalRules.g:1379:2: ( rule__Rule__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRules.g:1379:3: rule__Rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRules.g:1387:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1391:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRules.g:1392:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalRules.g:1399:1: rule__Rule__Group__7__Impl : ( '{' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1403:1: ( ( '{' ) )
            // InternalRules.g:1404:1: ( '{' )
            {
            // InternalRules.g:1404:1: ( '{' )
            // InternalRules.g:1405:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRules.g:1414:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1418:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalRules.g:1419:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalRules.g:1426:1: rule__Rule__Group__8__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1430:1: ( ( 'from' ) )
            // InternalRules.g:1431:1: ( 'from' )
            {
            // InternalRules.g:1431:1: ( 'from' )
            // InternalRules.g:1432:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_8()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRules.g:1441:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1445:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalRules.g:1446:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalRules.g:1453:1: rule__Rule__Group__9__Impl : ( 'query' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1457:1: ( ( 'query' ) )
            // InternalRules.g:1458:1: ( 'query' )
            {
            // InternalRules.g:1458:1: ( 'query' )
            // InternalRules.g:1459:2: 'query'
            {
             before(grammarAccess.getRuleAccess().getQueryKeyword_9()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRules.g:1468:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1472:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalRules.g:1473:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_23);
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
    // InternalRules.g:1480:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__PatternAssignment_10 ) ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1484:1: ( ( ( rule__Rule__PatternAssignment_10 ) ) )
            // InternalRules.g:1485:1: ( ( rule__Rule__PatternAssignment_10 ) )
            {
            // InternalRules.g:1485:1: ( ( rule__Rule__PatternAssignment_10 ) )
            // InternalRules.g:1486:2: ( rule__Rule__PatternAssignment_10 )
            {
             before(grammarAccess.getRuleAccess().getPatternAssignment_10()); 
            // InternalRules.g:1487:2: ( rule__Rule__PatternAssignment_10 )
            // InternalRules.g:1487:3: rule__Rule__PatternAssignment_10
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
    // InternalRules.g:1495:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1499:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalRules.g:1500:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_24);
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
    // InternalRules.g:1507:1: rule__Rule__Group__11__Impl : ( 'select' ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1511:1: ( ( 'select' ) )
            // InternalRules.g:1512:1: ( 'select' )
            {
            // InternalRules.g:1512:1: ( 'select' )
            // InternalRules.g:1513:2: 'select'
            {
             before(grammarAccess.getRuleAccess().getSelectKeyword_11()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRules.g:1522:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl rule__Rule__Group__13 ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1526:1: ( rule__Rule__Group__12__Impl rule__Rule__Group__13 )
            // InternalRules.g:1527:2: rule__Rule__Group__12__Impl rule__Rule__Group__13
            {
            pushFollow(FOLLOW_25);
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
    // InternalRules.g:1534:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__AssetAssignment_12 ) ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1538:1: ( ( ( rule__Rule__AssetAssignment_12 ) ) )
            // InternalRules.g:1539:1: ( ( rule__Rule__AssetAssignment_12 ) )
            {
            // InternalRules.g:1539:1: ( ( rule__Rule__AssetAssignment_12 ) )
            // InternalRules.g:1540:2: ( rule__Rule__AssetAssignment_12 )
            {
             before(grammarAccess.getRuleAccess().getAssetAssignment_12()); 
            // InternalRules.g:1541:2: ( rule__Rule__AssetAssignment_12 )
            // InternalRules.g:1541:3: rule__Rule__AssetAssignment_12
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
    // InternalRules.g:1549:1: rule__Rule__Group__13 : rule__Rule__Group__13__Impl rule__Rule__Group__14 ;
    public final void rule__Rule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1553:1: ( rule__Rule__Group__13__Impl rule__Rule__Group__14 )
            // InternalRules.g:1554:2: rule__Rule__Group__13__Impl rule__Rule__Group__14
            {
            pushFollow(FOLLOW_25);
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
    // InternalRules.g:1561:1: rule__Rule__Group__13__Impl : ( ( rule__Rule__BindingsAssignment_13 )* ) ;
    public final void rule__Rule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1565:1: ( ( ( rule__Rule__BindingsAssignment_13 )* ) )
            // InternalRules.g:1566:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            {
            // InternalRules.g:1566:1: ( ( rule__Rule__BindingsAssignment_13 )* )
            // InternalRules.g:1567:2: ( rule__Rule__BindingsAssignment_13 )*
            {
             before(grammarAccess.getRuleAccess().getBindingsAssignment_13()); 
            // InternalRules.g:1568:2: ( rule__Rule__BindingsAssignment_13 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRules.g:1568:3: rule__Rule__BindingsAssignment_13
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Rule__BindingsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRules.g:1576:1: rule__Rule__Group__14 : rule__Rule__Group__14__Impl rule__Rule__Group__15 ;
    public final void rule__Rule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1580:1: ( rule__Rule__Group__14__Impl rule__Rule__Group__15 )
            // InternalRules.g:1581:2: rule__Rule__Group__14__Impl rule__Rule__Group__15
            {
            pushFollow(FOLLOW_15);
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
    // InternalRules.g:1588:1: rule__Rule__Group__14__Impl : ( '}' ) ;
    public final void rule__Rule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1592:1: ( ( '}' ) )
            // InternalRules.g:1593:1: ( '}' )
            {
            // InternalRules.g:1593:1: ( '}' )
            // InternalRules.g:1594:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRules.g:1603:1: rule__Rule__Group__15 : rule__Rule__Group__15__Impl ;
    public final void rule__Rule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1607:1: ( rule__Rule__Group__15__Impl )
            // InternalRules.g:1608:2: rule__Rule__Group__15__Impl
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
    // InternalRules.g:1614:1: rule__Rule__Group__15__Impl : ( ( rule__Rule__Group_15__0 )? ) ;
    public final void rule__Rule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1618:1: ( ( ( rule__Rule__Group_15__0 )? ) )
            // InternalRules.g:1619:1: ( ( rule__Rule__Group_15__0 )? )
            {
            // InternalRules.g:1619:1: ( ( rule__Rule__Group_15__0 )? )
            // InternalRules.g:1620:2: ( rule__Rule__Group_15__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_15()); 
            // InternalRules.g:1621:2: ( rule__Rule__Group_15__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRules.g:1621:3: rule__Rule__Group_15__0
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
    // InternalRules.g:1630:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1634:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalRules.g:1635:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
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
    // InternalRules.g:1642:1: rule__Rule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1646:1: ( ( ',' ) )
            // InternalRules.g:1647:1: ( ',' )
            {
            // InternalRules.g:1647:1: ( ',' )
            // InternalRules.g:1648:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRules.g:1657:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1661:1: ( rule__Rule__Group_6__1__Impl )
            // InternalRules.g:1662:2: rule__Rule__Group_6__1__Impl
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
    // InternalRules.g:1668:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__RolesAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1672:1: ( ( ( rule__Rule__RolesAssignment_6_1 ) ) )
            // InternalRules.g:1673:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            {
            // InternalRules.g:1673:1: ( ( rule__Rule__RolesAssignment_6_1 ) )
            // InternalRules.g:1674:2: ( rule__Rule__RolesAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getRolesAssignment_6_1()); 
            // InternalRules.g:1675:2: ( rule__Rule__RolesAssignment_6_1 )
            // InternalRules.g:1675:3: rule__Rule__RolesAssignment_6_1
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
    // InternalRules.g:1684:1: rule__Rule__Group_15__0 : rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 ;
    public final void rule__Rule__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1688:1: ( rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1 )
            // InternalRules.g:1689:2: rule__Rule__Group_15__0__Impl rule__Rule__Group_15__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRules.g:1696:1: rule__Rule__Group_15__0__Impl : ( 'with' ) ;
    public final void rule__Rule__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1700:1: ( ( 'with' ) )
            // InternalRules.g:1701:1: ( 'with' )
            {
            // InternalRules.g:1701:1: ( 'with' )
            // InternalRules.g:1702:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_15_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRules.g:1711:1: rule__Rule__Group_15__1 : rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 ;
    public final void rule__Rule__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1715:1: ( rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2 )
            // InternalRules.g:1716:2: rule__Rule__Group_15__1__Impl rule__Rule__Group_15__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalRules.g:1723:1: rule__Rule__Group_15__1__Impl : ( ( rule__Rule__PriorityAssignment_15_1 ) ) ;
    public final void rule__Rule__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1727:1: ( ( ( rule__Rule__PriorityAssignment_15_1 ) ) )
            // InternalRules.g:1728:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            {
            // InternalRules.g:1728:1: ( ( rule__Rule__PriorityAssignment_15_1 ) )
            // InternalRules.g:1729:2: ( rule__Rule__PriorityAssignment_15_1 )
            {
             before(grammarAccess.getRuleAccess().getPriorityAssignment_15_1()); 
            // InternalRules.g:1730:2: ( rule__Rule__PriorityAssignment_15_1 )
            // InternalRules.g:1730:3: rule__Rule__PriorityAssignment_15_1
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
    // InternalRules.g:1738:1: rule__Rule__Group_15__2 : rule__Rule__Group_15__2__Impl ;
    public final void rule__Rule__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1742:1: ( rule__Rule__Group_15__2__Impl )
            // InternalRules.g:1743:2: rule__Rule__Group_15__2__Impl
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
    // InternalRules.g:1749:1: rule__Rule__Group_15__2__Impl : ( 'priority' ) ;
    public final void rule__Rule__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1753:1: ( ( 'priority' ) )
            // InternalRules.g:1754:1: ( 'priority' )
            {
            // InternalRules.g:1754:1: ( 'priority' )
            // InternalRules.g:1755:2: 'priority'
            {
             before(grammarAccess.getRuleAccess().getPriorityKeyword_15_2()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__ObjectFact__Group__0"
    // InternalRules.g:1765:1: rule__ObjectFact__Group__0 : rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 ;
    public final void rule__ObjectFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1769:1: ( rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1 )
            // InternalRules.g:1770:2: rule__ObjectFact__Group__0__Impl rule__ObjectFact__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRules.g:1777:1: rule__ObjectFact__Group__0__Impl : ( 'obj' ) ;
    public final void rule__ObjectFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1781:1: ( ( 'obj' ) )
            // InternalRules.g:1782:1: ( 'obj' )
            {
            // InternalRules.g:1782:1: ( 'obj' )
            // InternalRules.g:1783:2: 'obj'
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
    // InternalRules.g:1792:1: rule__ObjectFact__Group__1 : rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 ;
    public final void rule__ObjectFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1796:1: ( rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2 )
            // InternalRules.g:1797:2: rule__ObjectFact__Group__1__Impl rule__ObjectFact__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRules.g:1804:1: rule__ObjectFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ObjectFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1808:1: ( ( '(' ) )
            // InternalRules.g:1809:1: ( '(' )
            {
            // InternalRules.g:1809:1: ( '(' )
            // InternalRules.g:1810:2: '('
            {
             before(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalRules.g:1819:1: rule__ObjectFact__Group__2 : rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 ;
    public final void rule__ObjectFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1823:1: ( rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3 )
            // InternalRules.g:1824:2: rule__ObjectFact__Group__2__Impl rule__ObjectFact__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ObjectFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3();

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
    // InternalRules.g:1831:1: rule__ObjectFact__Group__2__Impl : ( ( rule__ObjectFact__VariableAssignment_2 ) ) ;
    public final void rule__ObjectFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1835:1: ( ( ( rule__ObjectFact__VariableAssignment_2 ) ) )
            // InternalRules.g:1836:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            {
            // InternalRules.g:1836:1: ( ( rule__ObjectFact__VariableAssignment_2 ) )
            // InternalRules.g:1837:2: ( rule__ObjectFact__VariableAssignment_2 )
            {
             before(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 
            // InternalRules.g:1838:2: ( rule__ObjectFact__VariableAssignment_2 )
            // InternalRules.g:1838:3: rule__ObjectFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectFactAccess().getVariableAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjectFact__Group__3"
    // InternalRules.g:1846:1: rule__ObjectFact__Group__3 : rule__ObjectFact__Group__3__Impl ;
    public final void rule__ObjectFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1850:1: ( rule__ObjectFact__Group__3__Impl )
            // InternalRules.g:1851:2: rule__ObjectFact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectFact__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectFact__Group__3"


    // $ANTLR start "rule__ObjectFact__Group__3__Impl"
    // InternalRules.g:1857:1: rule__ObjectFact__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1861:1: ( ( ')' ) )
            // InternalRules.g:1862:1: ( ')' )
            {
            // InternalRules.g:1862:1: ( ')' )
            // InternalRules.g:1863:2: ')'
            {
             before(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__Group__3__Impl"


    // $ANTLR start "rule__ReferenceFact__Group__0"
    // InternalRules.g:1873:1: rule__ReferenceFact__Group__0 : rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 ;
    public final void rule__ReferenceFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1877:1: ( rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1 )
            // InternalRules.g:1878:2: rule__ReferenceFact__Group__0__Impl rule__ReferenceFact__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRules.g:1885:1: rule__ReferenceFact__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1889:1: ( ( 'ref' ) )
            // InternalRules.g:1890:1: ( 'ref' )
            {
            // InternalRules.g:1890:1: ( 'ref' )
            // InternalRules.g:1891:2: 'ref'
            {
             before(grammarAccess.getReferenceFactAccess().getRefKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRules.g:1900:1: rule__ReferenceFact__Group__1 : rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 ;
    public final void rule__ReferenceFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1904:1: ( rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2 )
            // InternalRules.g:1905:2: rule__ReferenceFact__Group__1__Impl rule__ReferenceFact__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRules.g:1912:1: rule__ReferenceFact__Group__1__Impl : ( '(' ) ;
    public final void rule__ReferenceFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1916:1: ( ( '(' ) )
            // InternalRules.g:1917:1: ( '(' )
            {
            // InternalRules.g:1917:1: ( '(' )
            // InternalRules.g:1918:2: '('
            {
             before(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalRules.g:1927:1: rule__ReferenceFact__Group__2 : rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 ;
    public final void rule__ReferenceFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1931:1: ( rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3 )
            // InternalRules.g:1932:2: rule__ReferenceFact__Group__2__Impl rule__ReferenceFact__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalRules.g:1939:1: rule__ReferenceFact__Group__2__Impl : ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) ;
    public final void rule__ReferenceFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1943:1: ( ( ( rule__ReferenceFact__SourceVarAssignment_2 ) ) )
            // InternalRules.g:1944:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            {
            // InternalRules.g:1944:1: ( ( rule__ReferenceFact__SourceVarAssignment_2 ) )
            // InternalRules.g:1945:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 
            // InternalRules.g:1946:2: ( rule__ReferenceFact__SourceVarAssignment_2 )
            // InternalRules.g:1946:3: rule__ReferenceFact__SourceVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__SourceVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarAssignment_2()); 

            }


            }

        }
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
    // InternalRules.g:1954:1: rule__ReferenceFact__Group__3 : rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 ;
    public final void rule__ReferenceFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1958:1: ( rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4 )
            // InternalRules.g:1959:2: rule__ReferenceFact__Group__3__Impl rule__ReferenceFact__Group__4
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
    // InternalRules.g:1966:1: rule__ReferenceFact__Group__3__Impl : ( '->' ) ;
    public final void rule__ReferenceFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1970:1: ( ( '->' ) )
            // InternalRules.g:1971:1: ( '->' )
            {
            // InternalRules.g:1971:1: ( '->' )
            // InternalRules.g:1972:2: '->'
            {
             before(grammarAccess.getReferenceFactAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRules.g:1981:1: rule__ReferenceFact__Group__4 : rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 ;
    public final void rule__ReferenceFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1985:1: ( rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5 )
            // InternalRules.g:1986:2: rule__ReferenceFact__Group__4__Impl rule__ReferenceFact__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalRules.g:1993:1: rule__ReferenceFact__Group__4__Impl : ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) ;
    public final void rule__ReferenceFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:1997:1: ( ( ( rule__ReferenceFact__TargetVarAssignment_4 ) ) )
            // InternalRules.g:1998:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            {
            // InternalRules.g:1998:1: ( ( rule__ReferenceFact__TargetVarAssignment_4 ) )
            // InternalRules.g:1999:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 
            // InternalRules.g:2000:2: ( rule__ReferenceFact__TargetVarAssignment_4 )
            // InternalRules.g:2000:3: rule__ReferenceFact__TargetVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__TargetVarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarAssignment_4()); 

            }


            }

        }
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
    // InternalRules.g:2008:1: rule__ReferenceFact__Group__5 : rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 ;
    public final void rule__ReferenceFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2012:1: ( rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6 )
            // InternalRules.g:2013:2: rule__ReferenceFact__Group__5__Impl rule__ReferenceFact__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalRules.g:2020:1: rule__ReferenceFact__Group__5__Impl : ( ':' ) ;
    public final void rule__ReferenceFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2024:1: ( ( ':' ) )
            // InternalRules.g:2025:1: ( ':' )
            {
            // InternalRules.g:2025:1: ( ':' )
            // InternalRules.g:2026:2: ':'
            {
             before(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getColonKeyword_5()); 

            }


            }

        }
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
    // InternalRules.g:2035:1: rule__ReferenceFact__Group__6 : rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 ;
    public final void rule__ReferenceFact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2039:1: ( rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7 )
            // InternalRules.g:2040:2: rule__ReferenceFact__Group__6__Impl rule__ReferenceFact__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__ReferenceFact__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7();

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
    // InternalRules.g:2047:1: rule__ReferenceFact__Group__6__Impl : ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) ;
    public final void rule__ReferenceFact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2051:1: ( ( ( rule__ReferenceFact__ReferenceAssignment_6 ) ) )
            // InternalRules.g:2052:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            {
            // InternalRules.g:2052:1: ( ( rule__ReferenceFact__ReferenceAssignment_6 ) )
            // InternalRules.g:2053:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 
            // InternalRules.g:2054:2: ( rule__ReferenceFact__ReferenceAssignment_6 )
            // InternalRules.g:2054:3: rule__ReferenceFact__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__ReferenceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReferenceFactAccess().getReferenceAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReferenceFact__Group__7"
    // InternalRules.g:2062:1: rule__ReferenceFact__Group__7 : rule__ReferenceFact__Group__7__Impl ;
    public final void rule__ReferenceFact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2066:1: ( rule__ReferenceFact__Group__7__Impl )
            // InternalRules.g:2067:2: rule__ReferenceFact__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceFact__Group__7__Impl();

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
    // $ANTLR end "rule__ReferenceFact__Group__7"


    // $ANTLR start "rule__ReferenceFact__Group__7__Impl"
    // InternalRules.g:2073:1: rule__ReferenceFact__Group__7__Impl : ( ')' ) ;
    public final void rule__ReferenceFact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2077:1: ( ( ')' ) )
            // InternalRules.g:2078:1: ( ')' )
            {
            // InternalRules.g:2078:1: ( ')' )
            // InternalRules.g:2079:2: ')'
            {
             before(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__Group__7__Impl"


    // $ANTLR start "rule__AttributeFact__Group__0"
    // InternalRules.g:2089:1: rule__AttributeFact__Group__0 : rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 ;
    public final void rule__AttributeFact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2093:1: ( rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1 )
            // InternalRules.g:2094:2: rule__AttributeFact__Group__0__Impl rule__AttributeFact__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRules.g:2101:1: rule__AttributeFact__Group__0__Impl : ( 'attr' ) ;
    public final void rule__AttributeFact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2105:1: ( ( 'attr' ) )
            // InternalRules.g:2106:1: ( 'attr' )
            {
            // InternalRules.g:2106:1: ( 'attr' )
            // InternalRules.g:2107:2: 'attr'
            {
             before(grammarAccess.getAttributeFactAccess().getAttrKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRules.g:2116:1: rule__AttributeFact__Group__1 : rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 ;
    public final void rule__AttributeFact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2120:1: ( rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2 )
            // InternalRules.g:2121:2: rule__AttributeFact__Group__1__Impl rule__AttributeFact__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRules.g:2128:1: rule__AttributeFact__Group__1__Impl : ( '(' ) ;
    public final void rule__AttributeFact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2132:1: ( ( '(' ) )
            // InternalRules.g:2133:1: ( '(' )
            {
            // InternalRules.g:2133:1: ( '(' )
            // InternalRules.g:2134:2: '('
            {
             before(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalRules.g:2143:1: rule__AttributeFact__Group__2 : rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 ;
    public final void rule__AttributeFact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2147:1: ( rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3 )
            // InternalRules.g:2148:2: rule__AttributeFact__Group__2__Impl rule__AttributeFact__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__AttributeFact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__3();

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
    // InternalRules.g:2155:1: rule__AttributeFact__Group__2__Impl : ( ( rule__AttributeFact__VariableAssignment_2 ) ) ;
    public final void rule__AttributeFact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2159:1: ( ( ( rule__AttributeFact__VariableAssignment_2 ) ) )
            // InternalRules.g:2160:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            {
            // InternalRules.g:2160:1: ( ( rule__AttributeFact__VariableAssignment_2 ) )
            // InternalRules.g:2161:2: ( rule__AttributeFact__VariableAssignment_2 )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 
            // InternalRules.g:2162:2: ( rule__AttributeFact__VariableAssignment_2 )
            // InternalRules.g:2162:3: rule__AttributeFact__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getVariableAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeFact__Group__3"
    // InternalRules.g:2170:1: rule__AttributeFact__Group__3 : rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 ;
    public final void rule__AttributeFact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2174:1: ( rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4 )
            // InternalRules.g:2175:2: rule__AttributeFact__Group__3__Impl rule__AttributeFact__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AttributeFact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__4();

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
    // $ANTLR end "rule__AttributeFact__Group__3"


    // $ANTLR start "rule__AttributeFact__Group__3__Impl"
    // InternalRules.g:2182:1: rule__AttributeFact__Group__3__Impl : ( ':' ) ;
    public final void rule__AttributeFact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2186:1: ( ( ':' ) )
            // InternalRules.g:2187:1: ( ':' )
            {
            // InternalRules.g:2187:1: ( ':' )
            // InternalRules.g:2188:2: ':'
            {
             before(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__3__Impl"


    // $ANTLR start "rule__AttributeFact__Group__4"
    // InternalRules.g:2197:1: rule__AttributeFact__Group__4 : rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 ;
    public final void rule__AttributeFact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2201:1: ( rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5 )
            // InternalRules.g:2202:2: rule__AttributeFact__Group__4__Impl rule__AttributeFact__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__AttributeFact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5();

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
    // $ANTLR end "rule__AttributeFact__Group__4"


    // $ANTLR start "rule__AttributeFact__Group__4__Impl"
    // InternalRules.g:2209:1: rule__AttributeFact__Group__4__Impl : ( ( rule__AttributeFact__AttributeAssignment_4 ) ) ;
    public final void rule__AttributeFact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2213:1: ( ( ( rule__AttributeFact__AttributeAssignment_4 ) ) )
            // InternalRules.g:2214:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            {
            // InternalRules.g:2214:1: ( ( rule__AttributeFact__AttributeAssignment_4 ) )
            // InternalRules.g:2215:2: ( rule__AttributeFact__AttributeAssignment_4 )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 
            // InternalRules.g:2216:2: ( rule__AttributeFact__AttributeAssignment_4 )
            // InternalRules.g:2216:3: rule__AttributeFact__AttributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__AttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFactAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__4__Impl"


    // $ANTLR start "rule__AttributeFact__Group__5"
    // InternalRules.g:2224:1: rule__AttributeFact__Group__5 : rule__AttributeFact__Group__5__Impl ;
    public final void rule__AttributeFact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2228:1: ( rule__AttributeFact__Group__5__Impl )
            // InternalRules.g:2229:2: rule__AttributeFact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFact__Group__5__Impl();

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
    // $ANTLR end "rule__AttributeFact__Group__5"


    // $ANTLR start "rule__AttributeFact__Group__5__Impl"
    // InternalRules.g:2235:1: rule__AttributeFact__Group__5__Impl : ( ')' ) ;
    public final void rule__AttributeFact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2239:1: ( ( ')' ) )
            // InternalRules.g:2240:1: ( ')' )
            {
            // InternalRules.g:2240:1: ( ')' )
            // InternalRules.g:2241:2: ')'
            {
             before(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__Group__5__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalRules.g:2251:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2255:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalRules.g:2256:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalRules.g:2263:1: rule__Binding__Group__0__Impl : ( 'where' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2267:1: ( ( 'where' ) )
            // InternalRules.g:2268:1: ( 'where' )
            {
            // InternalRules.g:2268:1: ( 'where' )
            // InternalRules.g:2269:2: 'where'
            {
             before(grammarAccess.getBindingAccess().getWhereKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRules.g:2278:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2282:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalRules.g:2283:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRules.g:2290:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__VariableAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2294:1: ( ( ( rule__Binding__VariableAssignment_1 ) ) )
            // InternalRules.g:2295:1: ( ( rule__Binding__VariableAssignment_1 ) )
            {
            // InternalRules.g:2295:1: ( ( rule__Binding__VariableAssignment_1 ) )
            // InternalRules.g:2296:2: ( rule__Binding__VariableAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getVariableAssignment_1()); 
            // InternalRules.g:2297:2: ( rule__Binding__VariableAssignment_1 )
            // InternalRules.g:2297:3: rule__Binding__VariableAssignment_1
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
    // InternalRules.g:2305:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2309:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalRules.g:2310:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalRules.g:2317:1: rule__Binding__Group__2__Impl : ( 'is' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2321:1: ( ( 'is' ) )
            // InternalRules.g:2322:1: ( 'is' )
            {
            // InternalRules.g:2322:1: ( 'is' )
            // InternalRules.g:2323:2: 'is'
            {
             before(grammarAccess.getBindingAccess().getIsKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getIsKeyword_2()); 

            }


            }

        }
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
    // InternalRules.g:2332:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2336:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalRules.g:2337:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalRules.g:2344:1: rule__Binding__Group__3__Impl : ( 'bound' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2348:1: ( ( 'bound' ) )
            // InternalRules.g:2349:1: ( 'bound' )
            {
            // InternalRules.g:2349:1: ( 'bound' )
            // InternalRules.g:2350:2: 'bound'
            {
             before(grammarAccess.getBindingAccess().getBoundKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getBoundKeyword_3()); 

            }


            }

        }
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
    // InternalRules.g:2359:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2363:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalRules.g:2364:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Binding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

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
    // InternalRules.g:2371:1: rule__Binding__Group__4__Impl : ( 'to' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2375:1: ( ( 'to' ) )
            // InternalRules.g:2376:1: ( 'to' )
            {
            // InternalRules.g:2376:1: ( 'to' )
            // InternalRules.g:2377:2: 'to'
            {
             before(grammarAccess.getBindingAccess().getToKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getToKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Binding__Group__5"
    // InternalRules.g:2386:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2390:1: ( rule__Binding__Group__5__Impl )
            // InternalRules.g:2391:2: rule__Binding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__5__Impl();

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
    // $ANTLR end "rule__Binding__Group__5"


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalRules.g:2397:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__BindAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2401:1: ( ( ( rule__Binding__BindAssignment_5 ) ) )
            // InternalRules.g:2402:1: ( ( rule__Binding__BindAssignment_5 ) )
            {
            // InternalRules.g:2402:1: ( ( rule__Binding__BindAssignment_5 ) )
            // InternalRules.g:2403:2: ( rule__Binding__BindAssignment_5 )
            {
             before(grammarAccess.getBindingAccess().getBindAssignment_5()); 
            // InternalRules.g:2404:2: ( rule__Binding__BindAssignment_5 )
            // InternalRules.g:2404:3: rule__Binding__BindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Binding__BindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getBindAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5__Impl"


    // $ANTLR start "rule__Model__RolesAssignment_0"
    // InternalRules.g:2413:1: rule__Model__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2417:1: ( ( ruleRole ) )
            // InternalRules.g:2418:2: ( ruleRole )
            {
            // InternalRules.g:2418:2: ( ruleRole )
            // InternalRules.g:2419:3: ruleRole
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
    // InternalRules.g:2428:1: rule__Model__PolicyAssignment_1 : ( rulePolicy ) ;
    public final void rule__Model__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2432:1: ( ( rulePolicy ) )
            // InternalRules.g:2433:2: ( rulePolicy )
            {
            // InternalRules.g:2433:2: ( rulePolicy )
            // InternalRules.g:2434:3: rulePolicy
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


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalRules.g:2443:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2447:1: ( ( RULE_ID ) )
            // InternalRules.g:2448:2: ( RULE_ID )
            {
            // InternalRules.g:2448:2: ( RULE_ID )
            // InternalRules.g:2449:3: RULE_ID
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
    // InternalRules.g:2458:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2462:1: ( ( RULE_ID ) )
            // InternalRules.g:2463:2: ( RULE_ID )
            {
            // InternalRules.g:2463:2: ( RULE_ID )
            // InternalRules.g:2464:3: RULE_ID
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


    // $ANTLR start "rule__Group__RolesAssignment_3"
    // InternalRules.g:2473:1: rule__Group__RolesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2477:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2478:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2478:2: ( ( RULE_ID ) )
            // InternalRules.g:2479:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 
            // InternalRules.g:2480:3: ( RULE_ID )
            // InternalRules.g:2481:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getRolesRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RolesAssignment_3"


    // $ANTLR start "rule__Group__RolesAssignment_4_1"
    // InternalRules.g:2492:1: rule__Group__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Group__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2496:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2497:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2497:2: ( ( RULE_ID ) )
            // InternalRules.g:2498:3: ( RULE_ID )
            {
             before(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalRules.g:2499:3: ( RULE_ID )
            // InternalRules.g:2500:4: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getRolesRoleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RolesAssignment_4_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalRules.g:2511:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2515:1: ( ( RULE_ID ) )
            // InternalRules.g:2516:2: ( RULE_ID )
            {
            // InternalRules.g:2516:2: ( RULE_ID )
            // InternalRules.g:2517:3: RULE_ID
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
    // InternalRules.g:2526:1: rule__Policy__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Policy__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2530:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2531:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2531:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2532:3: ruleAccessibilityLevel
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
    // InternalRules.g:2541:1: rule__Policy__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Policy__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2545:1: ( ( ruleOperationType ) )
            // InternalRules.g:2546:2: ( ruleOperationType )
            {
            // InternalRules.g:2546:2: ( ruleOperationType )
            // InternalRules.g:2547:3: ruleOperationType
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
    // InternalRules.g:2556:1: rule__Policy__RulesAssignment_7 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2560:1: ( ( ruleRule ) )
            // InternalRules.g:2561:2: ( ruleRule )
            {
            // InternalRules.g:2561:2: ( ruleRule )
            // InternalRules.g:2562:3: ruleRule
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
    // InternalRules.g:2571:1: rule__Policy__ResolutionAssignment_10 : ( ruleResolutionType ) ;
    public final void rule__Policy__ResolutionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2575:1: ( ( ruleResolutionType ) )
            // InternalRules.g:2576:2: ( ruleResolutionType )
            {
            // InternalRules.g:2576:2: ( ruleResolutionType )
            // InternalRules.g:2577:3: ruleResolutionType
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
    // InternalRules.g:2586:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2590:1: ( ( RULE_ID ) )
            // InternalRules.g:2591:2: ( RULE_ID )
            {
            // InternalRules.g:2591:2: ( RULE_ID )
            // InternalRules.g:2592:3: RULE_ID
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
    // InternalRules.g:2601:1: rule__Rule__AccessAssignment_2 : ( ruleAccessibilityLevel ) ;
    public final void rule__Rule__AccessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2605:1: ( ( ruleAccessibilityLevel ) )
            // InternalRules.g:2606:2: ( ruleAccessibilityLevel )
            {
            // InternalRules.g:2606:2: ( ruleAccessibilityLevel )
            // InternalRules.g:2607:3: ruleAccessibilityLevel
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
    // InternalRules.g:2616:1: rule__Rule__OperationAssignment_3 : ( ruleOperationType ) ;
    public final void rule__Rule__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2620:1: ( ( ruleOperationType ) )
            // InternalRules.g:2621:2: ( ruleOperationType )
            {
            // InternalRules.g:2621:2: ( ruleOperationType )
            // InternalRules.g:2622:3: ruleOperationType
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
    // InternalRules.g:2631:1: rule__Rule__RolesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2635:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2636:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2636:2: ( ( RULE_ID ) )
            // InternalRules.g:2637:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_5_0()); 
            // InternalRules.g:2638:3: ( RULE_ID )
            // InternalRules.g:2639:4: RULE_ID
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
    // InternalRules.g:2650:1: rule__Rule__RolesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2654:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2655:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2655:2: ( ( RULE_ID ) )
            // InternalRules.g:2656:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getRolesRoleCrossReference_6_1_0()); 
            // InternalRules.g:2657:3: ( RULE_ID )
            // InternalRules.g:2658:4: RULE_ID
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
    // InternalRules.g:2669:1: rule__Rule__PatternAssignment_10 : ( ( RULE_STRING ) ) ;
    public final void rule__Rule__PatternAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2673:1: ( ( ( RULE_STRING ) ) )
            // InternalRules.g:2674:2: ( ( RULE_STRING ) )
            {
            // InternalRules.g:2674:2: ( ( RULE_STRING ) )
            // InternalRules.g:2675:3: ( RULE_STRING )
            {
             before(grammarAccess.getRuleAccess().getPatternPatternCrossReference_10_0()); 
            // InternalRules.g:2676:3: ( RULE_STRING )
            // InternalRules.g:2677:4: RULE_STRING
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
    // InternalRules.g:2688:1: rule__Rule__AssetAssignment_12 : ( ruleModelFact ) ;
    public final void rule__Rule__AssetAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2692:1: ( ( ruleModelFact ) )
            // InternalRules.g:2693:2: ( ruleModelFact )
            {
            // InternalRules.g:2693:2: ( ruleModelFact )
            // InternalRules.g:2694:3: ruleModelFact
            {
             before(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleModelFact();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAssetModelFactParserRuleCall_12_0()); 

            }


            }

        }
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
    // InternalRules.g:2703:1: rule__Rule__BindingsAssignment_13 : ( ruleBinding ) ;
    public final void rule__Rule__BindingsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2707:1: ( ( ruleBinding ) )
            // InternalRules.g:2708:2: ( ruleBinding )
            {
            // InternalRules.g:2708:2: ( ruleBinding )
            // InternalRules.g:2709:3: ruleBinding
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
    // InternalRules.g:2718:1: rule__Rule__PriorityAssignment_15_1 : ( RULE_INT ) ;
    public final void rule__Rule__PriorityAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2722:1: ( ( RULE_INT ) )
            // InternalRules.g:2723:2: ( RULE_INT )
            {
            // InternalRules.g:2723:2: ( RULE_INT )
            // InternalRules.g:2724:3: RULE_INT
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


    // $ANTLR start "rule__ObjectFact__VariableAssignment_2"
    // InternalRules.g:2733:1: rule__ObjectFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2737:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2738:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2738:2: ( ( RULE_ID ) )
            // InternalRules.g:2739:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalRules.g:2740:3: ( RULE_ID )
            // InternalRules.g:2741:4: RULE_ID
            {
             before(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectFactAccess().getVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectFact__VariableAssignment_2"


    // $ANTLR start "rule__ReferenceFact__SourceVarAssignment_2"
    // InternalRules.g:2752:1: rule__ReferenceFact__SourceVarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__SourceVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2756:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2757:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2757:2: ( ( RULE_ID ) )
            // InternalRules.g:2758:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 
            // InternalRules.g:2759:3: ( RULE_ID )
            // InternalRules.g:2760:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getSourceVarVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__SourceVarAssignment_2"


    // $ANTLR start "rule__ReferenceFact__TargetVarAssignment_4"
    // InternalRules.g:2771:1: rule__ReferenceFact__TargetVarAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__TargetVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2775:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2776:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2776:2: ( ( RULE_ID ) )
            // InternalRules.g:2777:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 
            // InternalRules.g:2778:3: ( RULE_ID )
            // InternalRules.g:2779:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getTargetVarVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__TargetVarAssignment_4"


    // $ANTLR start "rule__ReferenceFact__ReferenceAssignment_6"
    // InternalRules.g:2790:1: rule__ReferenceFact__ReferenceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceFact__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2794:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2795:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2795:2: ( ( RULE_ID ) )
            // InternalRules.g:2796:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 
            // InternalRules.g:2797:3: ( RULE_ID )
            // InternalRules.g:2798:4: RULE_ID
            {
             before(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getReferenceFactAccess().getReferenceEReferenceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceFact__ReferenceAssignment_6"


    // $ANTLR start "rule__AttributeFact__VariableAssignment_2"
    // InternalRules.g:2809:1: rule__AttributeFact__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2813:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2814:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2814:2: ( ( RULE_ID ) )
            // InternalRules.g:2815:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 
            // InternalRules.g:2816:3: ( RULE_ID )
            // InternalRules.g:2817:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getVariableVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getVariableVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__VariableAssignment_2"


    // $ANTLR start "rule__AttributeFact__AttributeAssignment_4"
    // InternalRules.g:2828:1: rule__AttributeFact__AttributeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFact__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2832:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2833:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2833:2: ( ( RULE_ID ) )
            // InternalRules.g:2834:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 
            // InternalRules.g:2835:3: ( RULE_ID )
            // InternalRules.g:2836:4: RULE_ID
            {
             before(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeFactAccess().getAttributeEAttributeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFact__AttributeAssignment_4"


    // $ANTLR start "rule__Binding__VariableAssignment_1"
    // InternalRules.g:2847:1: rule__Binding__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2851:1: ( ( ( RULE_ID ) ) )
            // InternalRules.g:2852:2: ( ( RULE_ID ) )
            {
            // InternalRules.g:2852:2: ( ( RULE_ID ) )
            // InternalRules.g:2853:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getVariableVariableCrossReference_1_0()); 
            // InternalRules.g:2854:3: ( RULE_ID )
            // InternalRules.g:2855:4: RULE_ID
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


    // $ANTLR start "rule__Binding__BindAssignment_5"
    // InternalRules.g:2866:1: rule__Binding__BindAssignment_5 : ( ruleBind ) ;
    public final void rule__Binding__BindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2870:1: ( ( ruleBind ) )
            // InternalRules.g:2871:2: ( ruleBind )
            {
            // InternalRules.g:2871:2: ( ruleBind )
            // InternalRules.g:2872:3: ruleBind
            {
             before(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getBindBindParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__BindAssignment_5"


    // $ANTLR start "rule__Bind__ValueStringAssignment_0"
    // InternalRules.g:2881:1: rule__Bind__ValueStringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Bind__ValueStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2885:1: ( ( RULE_STRING ) )
            // InternalRules.g:2886:2: ( RULE_STRING )
            {
            // InternalRules.g:2886:2: ( RULE_STRING )
            // InternalRules.g:2887:3: RULE_STRING
            {
             before(grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getValueStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueStringAssignment_0"


    // $ANTLR start "rule__Bind__ValueIntegerAssignment_1"
    // InternalRules.g:2896:1: rule__Bind__ValueIntegerAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bind__ValueIntegerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRules.g:2900:1: ( ( RULE_INT ) )
            // InternalRules.g:2901:2: ( RULE_INT )
            {
            // InternalRules.g:2901:2: ( RULE_INT )
            // InternalRules.g:2902:3: RULE_INT
            {
             before(grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getValueIntegerINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ValueIntegerAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000008003C000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000049000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000060L});

}