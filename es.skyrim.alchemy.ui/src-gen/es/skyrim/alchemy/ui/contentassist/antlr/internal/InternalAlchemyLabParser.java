package es.skyrim.alchemy.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import es.skyrim.alchemy.services.AlchemyLabGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlchemyLabParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'potion'", "'poison'", "'mixture'", "'effect'", "'('", "')'", "':'", "'->'", "'ealias'", "'for'", "'ingredient'", "'{'", "'price:'", "'weight:'", "'}'", "'source:'", "'ialias'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAlchemyLabParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlchemyLabParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlchemyLabParser.tokenNames; }
    public String getGrammarFileName() { return "../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g"; }


     
     	private AlchemyLabGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AlchemyLabGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAlchemyLabModel"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:60:1: entryRuleAlchemyLabModel : ruleAlchemyLabModel EOF ;
    public final void entryRuleAlchemyLabModel() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:61:1: ( ruleAlchemyLabModel EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:62:1: ruleAlchemyLabModel EOF
            {
             before(grammarAccess.getAlchemyLabModelRule()); 
            pushFollow(FOLLOW_ruleAlchemyLabModel_in_entryRuleAlchemyLabModel61);
            ruleAlchemyLabModel();

            state._fsp--;

             after(grammarAccess.getAlchemyLabModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlchemyLabModel68); 

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
    // $ANTLR end "entryRuleAlchemyLabModel"


    // $ANTLR start "ruleAlchemyLabModel"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:69:1: ruleAlchemyLabModel : ( ( rule__AlchemyLabModel__Group__0 ) ) ;
    public final void ruleAlchemyLabModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:73:2: ( ( ( rule__AlchemyLabModel__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:74:1: ( ( rule__AlchemyLabModel__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:74:1: ( ( rule__AlchemyLabModel__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:75:1: ( rule__AlchemyLabModel__Group__0 )
            {
             before(grammarAccess.getAlchemyLabModelAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:76:1: ( rule__AlchemyLabModel__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:76:2: rule__AlchemyLabModel__Group__0
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__0_in_ruleAlchemyLabModel94);
            rule__AlchemyLabModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlchemyLabModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlchemyLabModel"


    // $ANTLR start "entryRuleEffectDef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:90:1: entryRuleEffectDef : ruleEffectDef EOF ;
    public final void entryRuleEffectDef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:91:1: ( ruleEffectDef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:92:1: ruleEffectDef EOF
            {
             before(grammarAccess.getEffectDefRule()); 
            pushFollow(FOLLOW_ruleEffectDef_in_entryRuleEffectDef123);
            ruleEffectDef();

            state._fsp--;

             after(grammarAccess.getEffectDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectDef130); 

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
    // $ANTLR end "entryRuleEffectDef"


    // $ANTLR start "ruleEffectDef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:99:1: ruleEffectDef : ( ( rule__EffectDef__Group__0 ) ) ;
    public final void ruleEffectDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:103:2: ( ( ( rule__EffectDef__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:104:1: ( ( rule__EffectDef__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:104:1: ( ( rule__EffectDef__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:105:1: ( rule__EffectDef__Group__0 )
            {
             before(grammarAccess.getEffectDefAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:106:1: ( rule__EffectDef__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:106:2: rule__EffectDef__Group__0
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__0_in_ruleEffectDef156);
            rule__EffectDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectDef"


    // $ANTLR start "entryRuleEffectRef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:118:1: entryRuleEffectRef : ruleEffectRef EOF ;
    public final void entryRuleEffectRef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:119:1: ( ruleEffectRef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:120:1: ruleEffectRef EOF
            {
             before(grammarAccess.getEffectRefRule()); 
            pushFollow(FOLLOW_ruleEffectRef_in_entryRuleEffectRef183);
            ruleEffectRef();

            state._fsp--;

             after(grammarAccess.getEffectRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRef190); 

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
    // $ANTLR end "entryRuleEffectRef"


    // $ANTLR start "ruleEffectRef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:127:1: ruleEffectRef : ( ( rule__EffectRef__Group__0 ) ) ;
    public final void ruleEffectRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:131:2: ( ( ( rule__EffectRef__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:132:1: ( ( rule__EffectRef__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:132:1: ( ( rule__EffectRef__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:133:1: ( rule__EffectRef__Group__0 )
            {
             before(grammarAccess.getEffectRefAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:134:1: ( rule__EffectRef__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:134:2: rule__EffectRef__Group__0
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__0_in_ruleEffectRef216);
            rule__EffectRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectRef"


    // $ANTLR start "entryRuleEffectAlias"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:146:1: entryRuleEffectAlias : ruleEffectAlias EOF ;
    public final void entryRuleEffectAlias() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:147:1: ( ruleEffectAlias EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:148:1: ruleEffectAlias EOF
            {
             before(grammarAccess.getEffectAliasRule()); 
            pushFollow(FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias243);
            ruleEffectAlias();

            state._fsp--;

             after(grammarAccess.getEffectAliasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectAlias250); 

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
    // $ANTLR end "entryRuleEffectAlias"


    // $ANTLR start "ruleEffectAlias"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:155:1: ruleEffectAlias : ( ( rule__EffectAlias__Group__0 ) ) ;
    public final void ruleEffectAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:159:2: ( ( ( rule__EffectAlias__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:160:1: ( ( rule__EffectAlias__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:160:1: ( ( rule__EffectAlias__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:161:1: ( rule__EffectAlias__Group__0 )
            {
             before(grammarAccess.getEffectAliasAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:162:1: ( rule__EffectAlias__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:162:2: rule__EffectAlias__Group__0
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__0_in_ruleEffectAlias276);
            rule__EffectAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectAlias"


    // $ANTLR start "entryRuleIngredientDef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:176:1: entryRuleIngredientDef : ruleIngredientDef EOF ;
    public final void entryRuleIngredientDef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:177:1: ( ruleIngredientDef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:178:1: ruleIngredientDef EOF
            {
             before(grammarAccess.getIngredientDefRule()); 
            pushFollow(FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef305);
            ruleIngredientDef();

            state._fsp--;

             after(grammarAccess.getIngredientDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientDef312); 

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
    // $ANTLR end "entryRuleIngredientDef"


    // $ANTLR start "ruleIngredientDef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:185:1: ruleIngredientDef : ( ( rule__IngredientDef__Group__0 ) ) ;
    public final void ruleIngredientDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:189:2: ( ( ( rule__IngredientDef__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:190:1: ( ( rule__IngredientDef__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:190:1: ( ( rule__IngredientDef__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:191:1: ( rule__IngredientDef__Group__0 )
            {
             before(grammarAccess.getIngredientDefAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:192:1: ( rule__IngredientDef__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:192:2: rule__IngredientDef__Group__0
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__0_in_ruleIngredientDef338);
            rule__IngredientDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredientDef"


    // $ANTLR start "entryRuleIngredientRef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:204:1: entryRuleIngredientRef : ruleIngredientRef EOF ;
    public final void entryRuleIngredientRef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:205:1: ( ruleIngredientRef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:206:1: ruleIngredientRef EOF
            {
             before(grammarAccess.getIngredientRefRule()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef365);
            ruleIngredientRef();

            state._fsp--;

             after(grammarAccess.getIngredientRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientRef372); 

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
    // $ANTLR end "entryRuleIngredientRef"


    // $ANTLR start "ruleIngredientRef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:213:1: ruleIngredientRef : ( ( rule__IngredientRef__IngredientAssignment ) ) ;
    public final void ruleIngredientRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:217:2: ( ( ( rule__IngredientRef__IngredientAssignment ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:218:1: ( ( rule__IngredientRef__IngredientAssignment ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:218:1: ( ( rule__IngredientRef__IngredientAssignment ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:219:1: ( rule__IngredientRef__IngredientAssignment )
            {
             before(grammarAccess.getIngredientRefAccess().getIngredientAssignment()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:220:1: ( rule__IngredientRef__IngredientAssignment )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:220:2: rule__IngredientRef__IngredientAssignment
            {
            pushFollow(FOLLOW_rule__IngredientRef__IngredientAssignment_in_ruleIngredientRef398);
            rule__IngredientRef__IngredientAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIngredientRefAccess().getIngredientAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredientRef"


    // $ANTLR start "entryRuleIngredientAlias"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:232:1: entryRuleIngredientAlias : ruleIngredientAlias EOF ;
    public final void entryRuleIngredientAlias() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:233:1: ( ruleIngredientAlias EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:234:1: ruleIngredientAlias EOF
            {
             before(grammarAccess.getIngredientAliasRule()); 
            pushFollow(FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias425);
            ruleIngredientAlias();

            state._fsp--;

             after(grammarAccess.getIngredientAliasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientAlias432); 

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
    // $ANTLR end "entryRuleIngredientAlias"


    // $ANTLR start "ruleIngredientAlias"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:241:1: ruleIngredientAlias : ( ( rule__IngredientAlias__Group__0 ) ) ;
    public final void ruleIngredientAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:245:2: ( ( ( rule__IngredientAlias__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:246:1: ( ( rule__IngredientAlias__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:246:1: ( ( rule__IngredientAlias__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:247:1: ( rule__IngredientAlias__Group__0 )
            {
             before(grammarAccess.getIngredientAliasAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:248:1: ( rule__IngredientAlias__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:248:2: rule__IngredientAlias__Group__0
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__0_in_ruleIngredientAlias458);
            rule__IngredientAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredientAlias"


    // $ANTLR start "entryRuleRecipe"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:260:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:261:1: ( ruleRecipe EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:262:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_ruleRecipe_in_entryRuleRecipe485);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipe492); 

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
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:269:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:273:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:274:1: ( ( rule__Recipe__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:274:1: ( ( rule__Recipe__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:275:1: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:276:1: ( rule__Recipe__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:276:2: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_rule__Recipe__Group__0_in_ruleRecipe518);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "ruleEffectType"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:289:1: ruleEffectType : ( ( rule__EffectType__Alternatives ) ) ;
    public final void ruleEffectType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:293:1: ( ( ( rule__EffectType__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:294:1: ( ( rule__EffectType__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:294:1: ( ( rule__EffectType__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:295:1: ( rule__EffectType__Alternatives )
            {
             before(grammarAccess.getEffectTypeAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:296:1: ( rule__EffectType__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:296:2: rule__EffectType__Alternatives
            {
            pushFollow(FOLLOW_rule__EffectType__Alternatives_in_ruleEffectType555);
            rule__EffectType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectType"


    // $ANTLR start "ruleToxicity"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:308:1: ruleToxicity : ( ( rule__Toxicity__Alternatives ) ) ;
    public final void ruleToxicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:312:1: ( ( ( rule__Toxicity__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:313:1: ( ( rule__Toxicity__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:313:1: ( ( rule__Toxicity__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:314:1: ( rule__Toxicity__Alternatives )
            {
             before(grammarAccess.getToxicityAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:315:1: ( rule__Toxicity__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:315:2: rule__Toxicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Toxicity__Alternatives_in_ruleToxicity591);
            rule__Toxicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getToxicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToxicity"


    // $ANTLR start "rule__EffectType__Alternatives"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:328:1: rule__EffectType__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__EffectType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:332:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:333:1: ( ( '+' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:333:1: ( ( '+' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:334:1: ( '+' )
                    {
                     before(grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:335:1: ( '+' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:335:3: '+'
                    {
                    match(input,11,FOLLOW_11_in_rule__EffectType__Alternatives629); 

                    }

                     after(grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:340:6: ( ( '-' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:340:6: ( ( '-' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:341:1: ( '-' )
                    {
                     before(grammarAccess.getEffectTypeAccess().getWEAKENEnumLiteralDeclaration_1()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:342:1: ( '-' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:342:3: '-'
                    {
                    match(input,12,FOLLOW_12_in_rule__EffectType__Alternatives650); 

                    }

                     after(grammarAccess.getEffectTypeAccess().getWEAKENEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EffectType__Alternatives"


    // $ANTLR start "rule__Toxicity__Alternatives"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:352:1: rule__Toxicity__Alternatives : ( ( ( 'potion' ) ) | ( ( 'poison' ) ) | ( ( 'mixture' ) ) );
    public final void rule__Toxicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:356:1: ( ( ( 'potion' ) ) | ( ( 'poison' ) ) | ( ( 'mixture' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
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
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:357:1: ( ( 'potion' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:357:1: ( ( 'potion' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:358:1: ( 'potion' )
                    {
                     before(grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:359:1: ( 'potion' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:359:3: 'potion'
                    {
                    match(input,13,FOLLOW_13_in_rule__Toxicity__Alternatives686); 

                    }

                     after(grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:364:6: ( ( 'poison' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:364:6: ( ( 'poison' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:365:1: ( 'poison' )
                    {
                     before(grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:366:1: ( 'poison' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:366:3: 'poison'
                    {
                    match(input,14,FOLLOW_14_in_rule__Toxicity__Alternatives707); 

                    }

                     after(grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:371:6: ( ( 'mixture' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:371:6: ( ( 'mixture' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:372:1: ( 'mixture' )
                    {
                     before(grammarAccess.getToxicityAccess().getMIXTUREEnumLiteralDeclaration_2()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:373:1: ( 'mixture' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:373:3: 'mixture'
                    {
                    match(input,15,FOLLOW_15_in_rule__Toxicity__Alternatives728); 

                    }

                     after(grammarAccess.getToxicityAccess().getMIXTUREEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Toxicity__Alternatives"


    // $ANTLR start "rule__AlchemyLabModel__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:385:1: rule__AlchemyLabModel__Group__0 : rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1 ;
    public final void rule__AlchemyLabModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:389:1: ( rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:390:2: rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__0__Impl_in_rule__AlchemyLabModel__Group__0761);
            rule__AlchemyLabModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__1_in_rule__AlchemyLabModel__Group__0764);
            rule__AlchemyLabModel__Group__1();

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
    // $ANTLR end "rule__AlchemyLabModel__Group__0"


    // $ANTLR start "rule__AlchemyLabModel__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:397:1: rule__AlchemyLabModel__Group__0__Impl : ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* ) ;
    public final void rule__AlchemyLabModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:401:1: ( ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:402:1: ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:402:1: ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:403:1: ( rule__AlchemyLabModel__EffectsAssignment_0 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getEffectsAssignment_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:404:1: ( rule__AlchemyLabModel__EffectsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:404:2: rule__AlchemyLabModel__EffectsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__EffectsAssignment_0_in_rule__AlchemyLabModel__Group__0__Impl791);
            	    rule__AlchemyLabModel__EffectsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAlchemyLabModelAccess().getEffectsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlchemyLabModel__Group__0__Impl"


    // $ANTLR start "rule__AlchemyLabModel__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:414:1: rule__AlchemyLabModel__Group__1 : rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2 ;
    public final void rule__AlchemyLabModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:418:1: ( rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:419:2: rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__1__Impl_in_rule__AlchemyLabModel__Group__1822);
            rule__AlchemyLabModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__2_in_rule__AlchemyLabModel__Group__1825);
            rule__AlchemyLabModel__Group__2();

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
    // $ANTLR end "rule__AlchemyLabModel__Group__1"


    // $ANTLR start "rule__AlchemyLabModel__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:426:1: rule__AlchemyLabModel__Group__1__Impl : ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* ) ;
    public final void rule__AlchemyLabModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:430:1: ( ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:431:1: ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:431:1: ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:432:1: ( rule__AlchemyLabModel__IngredientsAssignment_1 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getIngredientsAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:433:1: ( rule__AlchemyLabModel__IngredientsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:433:2: rule__AlchemyLabModel__IngredientsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__IngredientsAssignment_1_in_rule__AlchemyLabModel__Group__1__Impl852);
            	    rule__AlchemyLabModel__IngredientsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAlchemyLabModelAccess().getIngredientsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlchemyLabModel__Group__1__Impl"


    // $ANTLR start "rule__AlchemyLabModel__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:443:1: rule__AlchemyLabModel__Group__2 : rule__AlchemyLabModel__Group__2__Impl ;
    public final void rule__AlchemyLabModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:447:1: ( rule__AlchemyLabModel__Group__2__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:448:2: rule__AlchemyLabModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__2__Impl_in_rule__AlchemyLabModel__Group__2883);
            rule__AlchemyLabModel__Group__2__Impl();

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
    // $ANTLR end "rule__AlchemyLabModel__Group__2"


    // $ANTLR start "rule__AlchemyLabModel__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:454:1: rule__AlchemyLabModel__Group__2__Impl : ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* ) ;
    public final void rule__AlchemyLabModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:458:1: ( ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:459:1: ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:459:1: ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:460:1: ( rule__AlchemyLabModel__RecipesAssignment_2 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getRecipesAssignment_2()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:461:1: ( rule__AlchemyLabModel__RecipesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=15)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:461:2: rule__AlchemyLabModel__RecipesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__RecipesAssignment_2_in_rule__AlchemyLabModel__Group__2__Impl910);
            	    rule__AlchemyLabModel__RecipesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAlchemyLabModelAccess().getRecipesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlchemyLabModel__Group__2__Impl"


    // $ANTLR start "rule__EffectDef__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:477:1: rule__EffectDef__Group__0 : rule__EffectDef__Group__0__Impl rule__EffectDef__Group__1 ;
    public final void rule__EffectDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:481:1: ( rule__EffectDef__Group__0__Impl rule__EffectDef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:482:2: rule__EffectDef__Group__0__Impl rule__EffectDef__Group__1
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__0__Impl_in_rule__EffectDef__Group__0947);
            rule__EffectDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__1_in_rule__EffectDef__Group__0950);
            rule__EffectDef__Group__1();

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
    // $ANTLR end "rule__EffectDef__Group__0"


    // $ANTLR start "rule__EffectDef__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:489:1: rule__EffectDef__Group__0__Impl : ( 'effect' ) ;
    public final void rule__EffectDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:493:1: ( ( 'effect' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:494:1: ( 'effect' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:494:1: ( 'effect' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:495:1: 'effect'
            {
             before(grammarAccess.getEffectDefAccess().getEffectKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__EffectDef__Group__0__Impl978); 
             after(grammarAccess.getEffectDefAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group__0__Impl"


    // $ANTLR start "rule__EffectDef__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:508:1: rule__EffectDef__Group__1 : rule__EffectDef__Group__1__Impl rule__EffectDef__Group__2 ;
    public final void rule__EffectDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:512:1: ( rule__EffectDef__Group__1__Impl rule__EffectDef__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:513:2: rule__EffectDef__Group__1__Impl rule__EffectDef__Group__2
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__1__Impl_in_rule__EffectDef__Group__11009);
            rule__EffectDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__2_in_rule__EffectDef__Group__11012);
            rule__EffectDef__Group__2();

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
    // $ANTLR end "rule__EffectDef__Group__1"


    // $ANTLR start "rule__EffectDef__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:520:1: rule__EffectDef__Group__1__Impl : ( ( rule__EffectDef__NameAssignment_1 ) ) ;
    public final void rule__EffectDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:524:1: ( ( ( rule__EffectDef__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:525:1: ( ( rule__EffectDef__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:525:1: ( ( rule__EffectDef__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:526:1: ( rule__EffectDef__NameAssignment_1 )
            {
             before(grammarAccess.getEffectDefAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:527:1: ( rule__EffectDef__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:527:2: rule__EffectDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectDef__NameAssignment_1_in_rule__EffectDef__Group__1__Impl1039);
            rule__EffectDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group__1__Impl"


    // $ANTLR start "rule__EffectDef__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:537:1: rule__EffectDef__Group__2 : rule__EffectDef__Group__2__Impl rule__EffectDef__Group__3 ;
    public final void rule__EffectDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:541:1: ( rule__EffectDef__Group__2__Impl rule__EffectDef__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:542:2: rule__EffectDef__Group__2__Impl rule__EffectDef__Group__3
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__2__Impl_in_rule__EffectDef__Group__21069);
            rule__EffectDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__3_in_rule__EffectDef__Group__21072);
            rule__EffectDef__Group__3();

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
    // $ANTLR end "rule__EffectDef__Group__2"


    // $ANTLR start "rule__EffectDef__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:549:1: rule__EffectDef__Group__2__Impl : ( '(' ) ;
    public final void rule__EffectDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:553:1: ( ( '(' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:554:1: ( '(' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:554:1: ( '(' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:555:1: '('
            {
             before(grammarAccess.getEffectDefAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__EffectDef__Group__2__Impl1100); 
             after(grammarAccess.getEffectDefAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group__2__Impl"


    // $ANTLR start "rule__EffectDef__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:568:1: rule__EffectDef__Group__3 : rule__EffectDef__Group__3__Impl rule__EffectDef__Group__4 ;
    public final void rule__EffectDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:572:1: ( rule__EffectDef__Group__3__Impl rule__EffectDef__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:573:2: rule__EffectDef__Group__3__Impl rule__EffectDef__Group__4
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__3__Impl_in_rule__EffectDef__Group__31131);
            rule__EffectDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__4_in_rule__EffectDef__Group__31134);
            rule__EffectDef__Group__4();

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
    // $ANTLR end "rule__EffectDef__Group__3"


    // $ANTLR start "rule__EffectDef__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:580:1: rule__EffectDef__Group__3__Impl : ( ( rule__EffectDef__TypeAssignment_3 ) ) ;
    public final void rule__EffectDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:584:1: ( ( ( rule__EffectDef__TypeAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:585:1: ( ( rule__EffectDef__TypeAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:585:1: ( ( rule__EffectDef__TypeAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:586:1: ( rule__EffectDef__TypeAssignment_3 )
            {
             before(grammarAccess.getEffectDefAccess().getTypeAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:587:1: ( rule__EffectDef__TypeAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:587:2: rule__EffectDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__EffectDef__TypeAssignment_3_in_rule__EffectDef__Group__3__Impl1161);
            rule__EffectDef__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectDefAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group__3__Impl"


    // $ANTLR start "rule__EffectDef__Group__4"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:597:1: rule__EffectDef__Group__4 : rule__EffectDef__Group__4__Impl rule__EffectDef__Group__5 ;
    public final void rule__EffectDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:601:1: ( rule__EffectDef__Group__4__Impl rule__EffectDef__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:602:2: rule__EffectDef__Group__4__Impl rule__EffectDef__Group__5
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__4__Impl_in_rule__EffectDef__Group__41191);
            rule__EffectDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__5_in_rule__EffectDef__Group__41194);
            rule__EffectDef__Group__5();

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
    // $ANTLR end "rule__EffectDef__Group__4"


    // $ANTLR start "rule__EffectDef__Group__4__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:609:1: rule__EffectDef__Group__4__Impl : ( ')' ) ;
    public final void rule__EffectDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:613:1: ( ( ')' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:614:1: ( ')' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:614:1: ( ')' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:615:1: ')'
            {
             before(grammarAccess.getEffectDefAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__EffectDef__Group__4__Impl1222); 
             after(grammarAccess.getEffectDefAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group__4__Impl"


    // $ANTLR start "rule__EffectDef__Group__5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:628:1: rule__EffectDef__Group__5 : rule__EffectDef__Group__5__Impl ;
    public final void rule__EffectDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:632:1: ( rule__EffectDef__Group__5__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:633:2: rule__EffectDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__5__Impl_in_rule__EffectDef__Group__51253);
            rule__EffectDef__Group__5__Impl();

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
    // $ANTLR end "rule__EffectDef__Group__5"


    // $ANTLR start "rule__EffectDef__Group__5__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:639:1: rule__EffectDef__Group__5__Impl : ( ( rule__EffectDef__Group_5__0 )? ) ;
    public final void rule__EffectDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:643:1: ( ( ( rule__EffectDef__Group_5__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:644:1: ( ( rule__EffectDef__Group_5__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:644:1: ( ( rule__EffectDef__Group_5__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:645:1: ( rule__EffectDef__Group_5__0 )?
            {
             before(grammarAccess.getEffectDefAccess().getGroup_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:646:1: ( rule__EffectDef__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:646:2: rule__EffectDef__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__EffectDef__Group_5__0_in_rule__EffectDef__Group__5__Impl1280);
                    rule__EffectDef__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffectDefAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group__5__Impl"


    // $ANTLR start "rule__EffectDef__Group_5__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:668:1: rule__EffectDef__Group_5__0 : rule__EffectDef__Group_5__0__Impl rule__EffectDef__Group_5__1 ;
    public final void rule__EffectDef__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:672:1: ( rule__EffectDef__Group_5__0__Impl rule__EffectDef__Group_5__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:673:2: rule__EffectDef__Group_5__0__Impl rule__EffectDef__Group_5__1
            {
            pushFollow(FOLLOW_rule__EffectDef__Group_5__0__Impl_in_rule__EffectDef__Group_5__01323);
            rule__EffectDef__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group_5__1_in_rule__EffectDef__Group_5__01326);
            rule__EffectDef__Group_5__1();

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
    // $ANTLR end "rule__EffectDef__Group_5__0"


    // $ANTLR start "rule__EffectDef__Group_5__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:680:1: rule__EffectDef__Group_5__0__Impl : ( ':' ) ;
    public final void rule__EffectDef__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:684:1: ( ( ':' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:685:1: ( ':' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:685:1: ( ':' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:686:1: ':'
            {
             before(grammarAccess.getEffectDefAccess().getColonKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__EffectDef__Group_5__0__Impl1354); 
             after(grammarAccess.getEffectDefAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group_5__0__Impl"


    // $ANTLR start "rule__EffectDef__Group_5__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:699:1: rule__EffectDef__Group_5__1 : rule__EffectDef__Group_5__1__Impl ;
    public final void rule__EffectDef__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:703:1: ( rule__EffectDef__Group_5__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:704:2: rule__EffectDef__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EffectDef__Group_5__1__Impl_in_rule__EffectDef__Group_5__11385);
            rule__EffectDef__Group_5__1__Impl();

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
    // $ANTLR end "rule__EffectDef__Group_5__1"


    // $ANTLR start "rule__EffectDef__Group_5__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:710:1: rule__EffectDef__Group_5__1__Impl : ( ( rule__EffectDef__DescriptionAssignment_5_1 ) ) ;
    public final void rule__EffectDef__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:714:1: ( ( ( rule__EffectDef__DescriptionAssignment_5_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:715:1: ( ( rule__EffectDef__DescriptionAssignment_5_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:715:1: ( ( rule__EffectDef__DescriptionAssignment_5_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:716:1: ( rule__EffectDef__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getEffectDefAccess().getDescriptionAssignment_5_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:717:1: ( rule__EffectDef__DescriptionAssignment_5_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:717:2: rule__EffectDef__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EffectDef__DescriptionAssignment_5_1_in_rule__EffectDef__Group_5__1__Impl1412);
            rule__EffectDef__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectDefAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__Group_5__1__Impl"


    // $ANTLR start "rule__EffectRef__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:731:1: rule__EffectRef__Group__0 : rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1 ;
    public final void rule__EffectRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:735:1: ( rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:736:2: rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__0__Impl_in_rule__EffectRef__Group__01446);
            rule__EffectRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectRef__Group__1_in_rule__EffectRef__Group__01449);
            rule__EffectRef__Group__1();

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
    // $ANTLR end "rule__EffectRef__Group__0"


    // $ANTLR start "rule__EffectRef__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:743:1: rule__EffectRef__Group__0__Impl : ( '->' ) ;
    public final void rule__EffectRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:747:1: ( ( '->' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:748:1: ( '->' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:748:1: ( '->' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:749:1: '->'
            {
             before(grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__EffectRef__Group__0__Impl1477); 
             after(grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRef__Group__0__Impl"


    // $ANTLR start "rule__EffectRef__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:762:1: rule__EffectRef__Group__1 : rule__EffectRef__Group__1__Impl ;
    public final void rule__EffectRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:766:1: ( rule__EffectRef__Group__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:767:2: rule__EffectRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__1__Impl_in_rule__EffectRef__Group__11508);
            rule__EffectRef__Group__1__Impl();

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
    // $ANTLR end "rule__EffectRef__Group__1"


    // $ANTLR start "rule__EffectRef__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:773:1: rule__EffectRef__Group__1__Impl : ( ( rule__EffectRef__EffectAssignment_1 ) ) ;
    public final void rule__EffectRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:777:1: ( ( ( rule__EffectRef__EffectAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:778:1: ( ( rule__EffectRef__EffectAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:778:1: ( ( rule__EffectRef__EffectAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:779:1: ( rule__EffectRef__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectRefAccess().getEffectAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:780:1: ( rule__EffectRef__EffectAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:780:2: rule__EffectRef__EffectAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectRef__EffectAssignment_1_in_rule__EffectRef__Group__1__Impl1535);
            rule__EffectRef__EffectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectRefAccess().getEffectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRef__Group__1__Impl"


    // $ANTLR start "rule__EffectAlias__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:794:1: rule__EffectAlias__Group__0 : rule__EffectAlias__Group__0__Impl rule__EffectAlias__Group__1 ;
    public final void rule__EffectAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:798:1: ( rule__EffectAlias__Group__0__Impl rule__EffectAlias__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:799:2: rule__EffectAlias__Group__0__Impl rule__EffectAlias__Group__1
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__0__Impl_in_rule__EffectAlias__Group__01569);
            rule__EffectAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectAlias__Group__1_in_rule__EffectAlias__Group__01572);
            rule__EffectAlias__Group__1();

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
    // $ANTLR end "rule__EffectAlias__Group__0"


    // $ANTLR start "rule__EffectAlias__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:806:1: rule__EffectAlias__Group__0__Impl : ( 'ealias' ) ;
    public final void rule__EffectAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:810:1: ( ( 'ealias' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:811:1: ( 'ealias' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:811:1: ( 'ealias' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:812:1: 'ealias'
            {
             before(grammarAccess.getEffectAliasAccess().getEaliasKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__EffectAlias__Group__0__Impl1600); 
             after(grammarAccess.getEffectAliasAccess().getEaliasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectAlias__Group__0__Impl"


    // $ANTLR start "rule__EffectAlias__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:825:1: rule__EffectAlias__Group__1 : rule__EffectAlias__Group__1__Impl rule__EffectAlias__Group__2 ;
    public final void rule__EffectAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:829:1: ( rule__EffectAlias__Group__1__Impl rule__EffectAlias__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:830:2: rule__EffectAlias__Group__1__Impl rule__EffectAlias__Group__2
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__1__Impl_in_rule__EffectAlias__Group__11631);
            rule__EffectAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectAlias__Group__2_in_rule__EffectAlias__Group__11634);
            rule__EffectAlias__Group__2();

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
    // $ANTLR end "rule__EffectAlias__Group__1"


    // $ANTLR start "rule__EffectAlias__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:837:1: rule__EffectAlias__Group__1__Impl : ( ( rule__EffectAlias__AliasAssignment_1 ) ) ;
    public final void rule__EffectAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:841:1: ( ( ( rule__EffectAlias__AliasAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:842:1: ( ( rule__EffectAlias__AliasAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:842:1: ( ( rule__EffectAlias__AliasAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:843:1: ( rule__EffectAlias__AliasAssignment_1 )
            {
             before(grammarAccess.getEffectAliasAccess().getAliasAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:844:1: ( rule__EffectAlias__AliasAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:844:2: rule__EffectAlias__AliasAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectAlias__AliasAssignment_1_in_rule__EffectAlias__Group__1__Impl1661);
            rule__EffectAlias__AliasAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAliasAccess().getAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectAlias__Group__1__Impl"


    // $ANTLR start "rule__EffectAlias__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:854:1: rule__EffectAlias__Group__2 : rule__EffectAlias__Group__2__Impl rule__EffectAlias__Group__3 ;
    public final void rule__EffectAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:858:1: ( rule__EffectAlias__Group__2__Impl rule__EffectAlias__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:859:2: rule__EffectAlias__Group__2__Impl rule__EffectAlias__Group__3
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__2__Impl_in_rule__EffectAlias__Group__21691);
            rule__EffectAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectAlias__Group__3_in_rule__EffectAlias__Group__21694);
            rule__EffectAlias__Group__3();

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
    // $ANTLR end "rule__EffectAlias__Group__2"


    // $ANTLR start "rule__EffectAlias__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:866:1: rule__EffectAlias__Group__2__Impl : ( 'for' ) ;
    public final void rule__EffectAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:870:1: ( ( 'for' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:871:1: ( 'for' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:871:1: ( 'for' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:872:1: 'for'
            {
             before(grammarAccess.getEffectAliasAccess().getForKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__EffectAlias__Group__2__Impl1722); 
             after(grammarAccess.getEffectAliasAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectAlias__Group__2__Impl"


    // $ANTLR start "rule__EffectAlias__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:885:1: rule__EffectAlias__Group__3 : rule__EffectAlias__Group__3__Impl ;
    public final void rule__EffectAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:889:1: ( rule__EffectAlias__Group__3__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:890:2: rule__EffectAlias__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__3__Impl_in_rule__EffectAlias__Group__31753);
            rule__EffectAlias__Group__3__Impl();

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
    // $ANTLR end "rule__EffectAlias__Group__3"


    // $ANTLR start "rule__EffectAlias__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:896:1: rule__EffectAlias__Group__3__Impl : ( ( rule__EffectAlias__EffectAssignment_3 ) ) ;
    public final void rule__EffectAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:900:1: ( ( ( rule__EffectAlias__EffectAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:901:1: ( ( rule__EffectAlias__EffectAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:901:1: ( ( rule__EffectAlias__EffectAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:902:1: ( rule__EffectAlias__EffectAssignment_3 )
            {
             before(grammarAccess.getEffectAliasAccess().getEffectAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:903:1: ( rule__EffectAlias__EffectAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:903:2: rule__EffectAlias__EffectAssignment_3
            {
            pushFollow(FOLLOW_rule__EffectAlias__EffectAssignment_3_in_rule__EffectAlias__Group__3__Impl1780);
            rule__EffectAlias__EffectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectAliasAccess().getEffectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectAlias__Group__3__Impl"


    // $ANTLR start "rule__IngredientDef__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:921:1: rule__IngredientDef__Group__0 : rule__IngredientDef__Group__0__Impl rule__IngredientDef__Group__1 ;
    public final void rule__IngredientDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:925:1: ( rule__IngredientDef__Group__0__Impl rule__IngredientDef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:926:2: rule__IngredientDef__Group__0__Impl rule__IngredientDef__Group__1
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__0__Impl_in_rule__IngredientDef__Group__01818);
            rule__IngredientDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__1_in_rule__IngredientDef__Group__01821);
            rule__IngredientDef__Group__1();

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
    // $ANTLR end "rule__IngredientDef__Group__0"


    // $ANTLR start "rule__IngredientDef__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:933:1: rule__IngredientDef__Group__0__Impl : ( 'ingredient' ) ;
    public final void rule__IngredientDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:937:1: ( ( 'ingredient' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:938:1: ( 'ingredient' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:938:1: ( 'ingredient' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:939:1: 'ingredient'
            {
             before(grammarAccess.getIngredientDefAccess().getIngredientKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__IngredientDef__Group__0__Impl1849); 
             after(grammarAccess.getIngredientDefAccess().getIngredientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__0__Impl"


    // $ANTLR start "rule__IngredientDef__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:952:1: rule__IngredientDef__Group__1 : rule__IngredientDef__Group__1__Impl rule__IngredientDef__Group__2 ;
    public final void rule__IngredientDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:956:1: ( rule__IngredientDef__Group__1__Impl rule__IngredientDef__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:957:2: rule__IngredientDef__Group__1__Impl rule__IngredientDef__Group__2
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__1__Impl_in_rule__IngredientDef__Group__11880);
            rule__IngredientDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__2_in_rule__IngredientDef__Group__11883);
            rule__IngredientDef__Group__2();

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
    // $ANTLR end "rule__IngredientDef__Group__1"


    // $ANTLR start "rule__IngredientDef__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:964:1: rule__IngredientDef__Group__1__Impl : ( ( rule__IngredientDef__NameAssignment_1 ) ) ;
    public final void rule__IngredientDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:968:1: ( ( ( rule__IngredientDef__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:969:1: ( ( rule__IngredientDef__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:969:1: ( ( rule__IngredientDef__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:970:1: ( rule__IngredientDef__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientDefAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:971:1: ( rule__IngredientDef__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:971:2: rule__IngredientDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IngredientDef__NameAssignment_1_in_rule__IngredientDef__Group__1__Impl1910);
            rule__IngredientDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__1__Impl"


    // $ANTLR start "rule__IngredientDef__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:981:1: rule__IngredientDef__Group__2 : rule__IngredientDef__Group__2__Impl rule__IngredientDef__Group__3 ;
    public final void rule__IngredientDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:985:1: ( rule__IngredientDef__Group__2__Impl rule__IngredientDef__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:986:2: rule__IngredientDef__Group__2__Impl rule__IngredientDef__Group__3
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__2__Impl_in_rule__IngredientDef__Group__21940);
            rule__IngredientDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__3_in_rule__IngredientDef__Group__21943);
            rule__IngredientDef__Group__3();

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
    // $ANTLR end "rule__IngredientDef__Group__2"


    // $ANTLR start "rule__IngredientDef__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:993:1: rule__IngredientDef__Group__2__Impl : ( '{' ) ;
    public final void rule__IngredientDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:997:1: ( ( '{' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:998:1: ( '{' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:998:1: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:999:1: '{'
            {
             before(grammarAccess.getIngredientDefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__IngredientDef__Group__2__Impl1971); 
             after(grammarAccess.getIngredientDefAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__2__Impl"


    // $ANTLR start "rule__IngredientDef__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1012:1: rule__IngredientDef__Group__3 : rule__IngredientDef__Group__3__Impl rule__IngredientDef__Group__4 ;
    public final void rule__IngredientDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1016:1: ( rule__IngredientDef__Group__3__Impl rule__IngredientDef__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1017:2: rule__IngredientDef__Group__3__Impl rule__IngredientDef__Group__4
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__3__Impl_in_rule__IngredientDef__Group__32002);
            rule__IngredientDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__4_in_rule__IngredientDef__Group__32005);
            rule__IngredientDef__Group__4();

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
    // $ANTLR end "rule__IngredientDef__Group__3"


    // $ANTLR start "rule__IngredientDef__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1024:1: rule__IngredientDef__Group__3__Impl : ( ( rule__IngredientDef__EffectsAssignment_3 )* ) ;
    public final void rule__IngredientDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1028:1: ( ( ( rule__IngredientDef__EffectsAssignment_3 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1029:1: ( ( rule__IngredientDef__EffectsAssignment_3 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1029:1: ( ( rule__IngredientDef__EffectsAssignment_3 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1030:1: ( rule__IngredientDef__EffectsAssignment_3 )*
            {
             before(grammarAccess.getIngredientDefAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1031:1: ( rule__IngredientDef__EffectsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1031:2: rule__IngredientDef__EffectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__IngredientDef__EffectsAssignment_3_in_rule__IngredientDef__Group__3__Impl2032);
            	    rule__IngredientDef__EffectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getIngredientDefAccess().getEffectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__3__Impl"


    // $ANTLR start "rule__IngredientDef__Group__4"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1041:1: rule__IngredientDef__Group__4 : rule__IngredientDef__Group__4__Impl rule__IngredientDef__Group__5 ;
    public final void rule__IngredientDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1045:1: ( rule__IngredientDef__Group__4__Impl rule__IngredientDef__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1046:2: rule__IngredientDef__Group__4__Impl rule__IngredientDef__Group__5
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__4__Impl_in_rule__IngredientDef__Group__42063);
            rule__IngredientDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__5_in_rule__IngredientDef__Group__42066);
            rule__IngredientDef__Group__5();

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
    // $ANTLR end "rule__IngredientDef__Group__4"


    // $ANTLR start "rule__IngredientDef__Group__4__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1053:1: rule__IngredientDef__Group__4__Impl : ( 'price:' ) ;
    public final void rule__IngredientDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1057:1: ( ( 'price:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1058:1: ( 'price:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1058:1: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1059:1: 'price:'
            {
             before(grammarAccess.getIngredientDefAccess().getPriceKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__IngredientDef__Group__4__Impl2094); 
             after(grammarAccess.getIngredientDefAccess().getPriceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__4__Impl"


    // $ANTLR start "rule__IngredientDef__Group__5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1072:1: rule__IngredientDef__Group__5 : rule__IngredientDef__Group__5__Impl rule__IngredientDef__Group__6 ;
    public final void rule__IngredientDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1076:1: ( rule__IngredientDef__Group__5__Impl rule__IngredientDef__Group__6 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1077:2: rule__IngredientDef__Group__5__Impl rule__IngredientDef__Group__6
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__5__Impl_in_rule__IngredientDef__Group__52125);
            rule__IngredientDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__6_in_rule__IngredientDef__Group__52128);
            rule__IngredientDef__Group__6();

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
    // $ANTLR end "rule__IngredientDef__Group__5"


    // $ANTLR start "rule__IngredientDef__Group__5__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1084:1: rule__IngredientDef__Group__5__Impl : ( ( rule__IngredientDef__PriceAssignment_5 ) ) ;
    public final void rule__IngredientDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1088:1: ( ( ( rule__IngredientDef__PriceAssignment_5 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1089:1: ( ( rule__IngredientDef__PriceAssignment_5 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1089:1: ( ( rule__IngredientDef__PriceAssignment_5 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1090:1: ( rule__IngredientDef__PriceAssignment_5 )
            {
             before(grammarAccess.getIngredientDefAccess().getPriceAssignment_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1091:1: ( rule__IngredientDef__PriceAssignment_5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1091:2: rule__IngredientDef__PriceAssignment_5
            {
            pushFollow(FOLLOW_rule__IngredientDef__PriceAssignment_5_in_rule__IngredientDef__Group__5__Impl2155);
            rule__IngredientDef__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIngredientDefAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__5__Impl"


    // $ANTLR start "rule__IngredientDef__Group__6"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1101:1: rule__IngredientDef__Group__6 : rule__IngredientDef__Group__6__Impl rule__IngredientDef__Group__7 ;
    public final void rule__IngredientDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1105:1: ( rule__IngredientDef__Group__6__Impl rule__IngredientDef__Group__7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1106:2: rule__IngredientDef__Group__6__Impl rule__IngredientDef__Group__7
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__6__Impl_in_rule__IngredientDef__Group__62185);
            rule__IngredientDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__7_in_rule__IngredientDef__Group__62188);
            rule__IngredientDef__Group__7();

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
    // $ANTLR end "rule__IngredientDef__Group__6"


    // $ANTLR start "rule__IngredientDef__Group__6__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1113:1: rule__IngredientDef__Group__6__Impl : ( 'weight:' ) ;
    public final void rule__IngredientDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1117:1: ( ( 'weight:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1118:1: ( 'weight:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1118:1: ( 'weight:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1119:1: 'weight:'
            {
             before(grammarAccess.getIngredientDefAccess().getWeightKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__IngredientDef__Group__6__Impl2216); 
             after(grammarAccess.getIngredientDefAccess().getWeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__6__Impl"


    // $ANTLR start "rule__IngredientDef__Group__7"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1132:1: rule__IngredientDef__Group__7 : rule__IngredientDef__Group__7__Impl rule__IngredientDef__Group__8 ;
    public final void rule__IngredientDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1136:1: ( rule__IngredientDef__Group__7__Impl rule__IngredientDef__Group__8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1137:2: rule__IngredientDef__Group__7__Impl rule__IngredientDef__Group__8
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__7__Impl_in_rule__IngredientDef__Group__72247);
            rule__IngredientDef__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__8_in_rule__IngredientDef__Group__72250);
            rule__IngredientDef__Group__8();

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
    // $ANTLR end "rule__IngredientDef__Group__7"


    // $ANTLR start "rule__IngredientDef__Group__7__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1144:1: rule__IngredientDef__Group__7__Impl : ( ( rule__IngredientDef__WeightAssignment_7 ) ) ;
    public final void rule__IngredientDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1148:1: ( ( ( rule__IngredientDef__WeightAssignment_7 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1149:1: ( ( rule__IngredientDef__WeightAssignment_7 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1149:1: ( ( rule__IngredientDef__WeightAssignment_7 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1150:1: ( rule__IngredientDef__WeightAssignment_7 )
            {
             before(grammarAccess.getIngredientDefAccess().getWeightAssignment_7()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1151:1: ( rule__IngredientDef__WeightAssignment_7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1151:2: rule__IngredientDef__WeightAssignment_7
            {
            pushFollow(FOLLOW_rule__IngredientDef__WeightAssignment_7_in_rule__IngredientDef__Group__7__Impl2277);
            rule__IngredientDef__WeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIngredientDefAccess().getWeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__7__Impl"


    // $ANTLR start "rule__IngredientDef__Group__8"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1161:1: rule__IngredientDef__Group__8 : rule__IngredientDef__Group__8__Impl rule__IngredientDef__Group__9 ;
    public final void rule__IngredientDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1165:1: ( rule__IngredientDef__Group__8__Impl rule__IngredientDef__Group__9 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1166:2: rule__IngredientDef__Group__8__Impl rule__IngredientDef__Group__9
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__8__Impl_in_rule__IngredientDef__Group__82307);
            rule__IngredientDef__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__9_in_rule__IngredientDef__Group__82310);
            rule__IngredientDef__Group__9();

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
    // $ANTLR end "rule__IngredientDef__Group__8"


    // $ANTLR start "rule__IngredientDef__Group__8__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1173:1: rule__IngredientDef__Group__8__Impl : ( ( rule__IngredientDef__Group_8__0 )? ) ;
    public final void rule__IngredientDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1177:1: ( ( ( rule__IngredientDef__Group_8__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1178:1: ( ( rule__IngredientDef__Group_8__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1178:1: ( ( rule__IngredientDef__Group_8__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1179:1: ( rule__IngredientDef__Group_8__0 )?
            {
             before(grammarAccess.getIngredientDefAccess().getGroup_8()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1180:1: ( rule__IngredientDef__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1180:2: rule__IngredientDef__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__IngredientDef__Group_8__0_in_rule__IngredientDef__Group__8__Impl2337);
                    rule__IngredientDef__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientDefAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__8__Impl"


    // $ANTLR start "rule__IngredientDef__Group__9"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1190:1: rule__IngredientDef__Group__9 : rule__IngredientDef__Group__9__Impl ;
    public final void rule__IngredientDef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1194:1: ( rule__IngredientDef__Group__9__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1195:2: rule__IngredientDef__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__9__Impl_in_rule__IngredientDef__Group__92368);
            rule__IngredientDef__Group__9__Impl();

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
    // $ANTLR end "rule__IngredientDef__Group__9"


    // $ANTLR start "rule__IngredientDef__Group__9__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1201:1: rule__IngredientDef__Group__9__Impl : ( '}' ) ;
    public final void rule__IngredientDef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1205:1: ( ( '}' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1206:1: ( '}' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1206:1: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1207:1: '}'
            {
             before(grammarAccess.getIngredientDefAccess().getRightCurlyBracketKeyword_9()); 
            match(input,27,FOLLOW_27_in_rule__IngredientDef__Group__9__Impl2396); 
             after(grammarAccess.getIngredientDefAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group__9__Impl"


    // $ANTLR start "rule__IngredientDef__Group_8__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1240:1: rule__IngredientDef__Group_8__0 : rule__IngredientDef__Group_8__0__Impl rule__IngredientDef__Group_8__1 ;
    public final void rule__IngredientDef__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1244:1: ( rule__IngredientDef__Group_8__0__Impl rule__IngredientDef__Group_8__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1245:2: rule__IngredientDef__Group_8__0__Impl rule__IngredientDef__Group_8__1
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group_8__0__Impl_in_rule__IngredientDef__Group_8__02447);
            rule__IngredientDef__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group_8__1_in_rule__IngredientDef__Group_8__02450);
            rule__IngredientDef__Group_8__1();

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
    // $ANTLR end "rule__IngredientDef__Group_8__0"


    // $ANTLR start "rule__IngredientDef__Group_8__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1252:1: rule__IngredientDef__Group_8__0__Impl : ( 'source:' ) ;
    public final void rule__IngredientDef__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1256:1: ( ( 'source:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1257:1: ( 'source:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1257:1: ( 'source:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1258:1: 'source:'
            {
             before(grammarAccess.getIngredientDefAccess().getSourceKeyword_8_0()); 
            match(input,28,FOLLOW_28_in_rule__IngredientDef__Group_8__0__Impl2478); 
             after(grammarAccess.getIngredientDefAccess().getSourceKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group_8__0__Impl"


    // $ANTLR start "rule__IngredientDef__Group_8__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1271:1: rule__IngredientDef__Group_8__1 : rule__IngredientDef__Group_8__1__Impl ;
    public final void rule__IngredientDef__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1275:1: ( rule__IngredientDef__Group_8__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1276:2: rule__IngredientDef__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group_8__1__Impl_in_rule__IngredientDef__Group_8__12509);
            rule__IngredientDef__Group_8__1__Impl();

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
    // $ANTLR end "rule__IngredientDef__Group_8__1"


    // $ANTLR start "rule__IngredientDef__Group_8__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1282:1: rule__IngredientDef__Group_8__1__Impl : ( ( rule__IngredientDef__SourceAssignment_8_1 ) ) ;
    public final void rule__IngredientDef__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1286:1: ( ( ( rule__IngredientDef__SourceAssignment_8_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1287:1: ( ( rule__IngredientDef__SourceAssignment_8_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1287:1: ( ( rule__IngredientDef__SourceAssignment_8_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1288:1: ( rule__IngredientDef__SourceAssignment_8_1 )
            {
             before(grammarAccess.getIngredientDefAccess().getSourceAssignment_8_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1289:1: ( rule__IngredientDef__SourceAssignment_8_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1289:2: rule__IngredientDef__SourceAssignment_8_1
            {
            pushFollow(FOLLOW_rule__IngredientDef__SourceAssignment_8_1_in_rule__IngredientDef__Group_8__1__Impl2536);
            rule__IngredientDef__SourceAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientDefAccess().getSourceAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__Group_8__1__Impl"


    // $ANTLR start "rule__IngredientAlias__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1303:1: rule__IngredientAlias__Group__0 : rule__IngredientAlias__Group__0__Impl rule__IngredientAlias__Group__1 ;
    public final void rule__IngredientAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1307:1: ( rule__IngredientAlias__Group__0__Impl rule__IngredientAlias__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1308:2: rule__IngredientAlias__Group__0__Impl rule__IngredientAlias__Group__1
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__0__Impl_in_rule__IngredientAlias__Group__02570);
            rule__IngredientAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientAlias__Group__1_in_rule__IngredientAlias__Group__02573);
            rule__IngredientAlias__Group__1();

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
    // $ANTLR end "rule__IngredientAlias__Group__0"


    // $ANTLR start "rule__IngredientAlias__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1315:1: rule__IngredientAlias__Group__0__Impl : ( 'ialias' ) ;
    public final void rule__IngredientAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1319:1: ( ( 'ialias' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1320:1: ( 'ialias' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1320:1: ( 'ialias' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1321:1: 'ialias'
            {
             before(grammarAccess.getIngredientAliasAccess().getIaliasKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__IngredientAlias__Group__0__Impl2601); 
             after(grammarAccess.getIngredientAliasAccess().getIaliasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientAlias__Group__0__Impl"


    // $ANTLR start "rule__IngredientAlias__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1334:1: rule__IngredientAlias__Group__1 : rule__IngredientAlias__Group__1__Impl rule__IngredientAlias__Group__2 ;
    public final void rule__IngredientAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1338:1: ( rule__IngredientAlias__Group__1__Impl rule__IngredientAlias__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1339:2: rule__IngredientAlias__Group__1__Impl rule__IngredientAlias__Group__2
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__1__Impl_in_rule__IngredientAlias__Group__12632);
            rule__IngredientAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientAlias__Group__2_in_rule__IngredientAlias__Group__12635);
            rule__IngredientAlias__Group__2();

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
    // $ANTLR end "rule__IngredientAlias__Group__1"


    // $ANTLR start "rule__IngredientAlias__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1346:1: rule__IngredientAlias__Group__1__Impl : ( ( rule__IngredientAlias__AliasAssignment_1 ) ) ;
    public final void rule__IngredientAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1350:1: ( ( ( rule__IngredientAlias__AliasAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1351:1: ( ( rule__IngredientAlias__AliasAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1351:1: ( ( rule__IngredientAlias__AliasAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1352:1: ( rule__IngredientAlias__AliasAssignment_1 )
            {
             before(grammarAccess.getIngredientAliasAccess().getAliasAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1353:1: ( rule__IngredientAlias__AliasAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1353:2: rule__IngredientAlias__AliasAssignment_1
            {
            pushFollow(FOLLOW_rule__IngredientAlias__AliasAssignment_1_in_rule__IngredientAlias__Group__1__Impl2662);
            rule__IngredientAlias__AliasAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAliasAccess().getAliasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientAlias__Group__1__Impl"


    // $ANTLR start "rule__IngredientAlias__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1363:1: rule__IngredientAlias__Group__2 : rule__IngredientAlias__Group__2__Impl rule__IngredientAlias__Group__3 ;
    public final void rule__IngredientAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1367:1: ( rule__IngredientAlias__Group__2__Impl rule__IngredientAlias__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1368:2: rule__IngredientAlias__Group__2__Impl rule__IngredientAlias__Group__3
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__2__Impl_in_rule__IngredientAlias__Group__22692);
            rule__IngredientAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientAlias__Group__3_in_rule__IngredientAlias__Group__22695);
            rule__IngredientAlias__Group__3();

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
    // $ANTLR end "rule__IngredientAlias__Group__2"


    // $ANTLR start "rule__IngredientAlias__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1375:1: rule__IngredientAlias__Group__2__Impl : ( 'for' ) ;
    public final void rule__IngredientAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1379:1: ( ( 'for' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1380:1: ( 'for' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1380:1: ( 'for' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1381:1: 'for'
            {
             before(grammarAccess.getIngredientAliasAccess().getForKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__IngredientAlias__Group__2__Impl2723); 
             after(grammarAccess.getIngredientAliasAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientAlias__Group__2__Impl"


    // $ANTLR start "rule__IngredientAlias__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1394:1: rule__IngredientAlias__Group__3 : rule__IngredientAlias__Group__3__Impl ;
    public final void rule__IngredientAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1398:1: ( rule__IngredientAlias__Group__3__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1399:2: rule__IngredientAlias__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__3__Impl_in_rule__IngredientAlias__Group__32754);
            rule__IngredientAlias__Group__3__Impl();

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
    // $ANTLR end "rule__IngredientAlias__Group__3"


    // $ANTLR start "rule__IngredientAlias__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1405:1: rule__IngredientAlias__Group__3__Impl : ( ( rule__IngredientAlias__IngredientAssignment_3 ) ) ;
    public final void rule__IngredientAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1409:1: ( ( ( rule__IngredientAlias__IngredientAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1410:1: ( ( rule__IngredientAlias__IngredientAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1410:1: ( ( rule__IngredientAlias__IngredientAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1411:1: ( rule__IngredientAlias__IngredientAssignment_3 )
            {
             before(grammarAccess.getIngredientAliasAccess().getIngredientAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1412:1: ( rule__IngredientAlias__IngredientAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1412:2: rule__IngredientAlias__IngredientAssignment_3
            {
            pushFollow(FOLLOW_rule__IngredientAlias__IngredientAssignment_3_in_rule__IngredientAlias__Group__3__Impl2781);
            rule__IngredientAlias__IngredientAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAliasAccess().getIngredientAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientAlias__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1430:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1434:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1435:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02819);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02822);
            rule__Recipe__Group__1();

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
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1442:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__ToxicityAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1446:1: ( ( ( rule__Recipe__ToxicityAssignment_0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1447:1: ( ( rule__Recipe__ToxicityAssignment_0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1447:1: ( ( rule__Recipe__ToxicityAssignment_0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1448:1: ( rule__Recipe__ToxicityAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getToxicityAssignment_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1449:1: ( rule__Recipe__ToxicityAssignment_0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1449:2: rule__Recipe__ToxicityAssignment_0
            {
            pushFollow(FOLLOW_rule__Recipe__ToxicityAssignment_0_in_rule__Recipe__Group__0__Impl2849);
            rule__Recipe__ToxicityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getToxicityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1459:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1463:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1464:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12879);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12882);
            rule__Recipe__Group__2();

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
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1471:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1475:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1476:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1476:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1477:1: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1478:1: ( rule__Recipe__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1478:2: rule__Recipe__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Recipe__NameAssignment_1_in_rule__Recipe__Group__1__Impl2909);
            rule__Recipe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1488:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1492:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1493:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22939);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22942);
            rule__Recipe__Group__3();

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
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1500:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1504:1: ( ( '{' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1505:1: ( '{' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1505:1: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1506:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Recipe__Group__2__Impl2970); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1519:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1523:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1524:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__33001);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__33004);
            rule__Recipe__Group__4();

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
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1531:1: rule__Recipe__Group__3__Impl : ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1535:1: ( ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1536:1: ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1536:1: ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1537:1: ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1537:1: ( ( rule__Recipe__EffectsAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1538:1: ( rule__Recipe__EffectsAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1539:1: ( rule__Recipe__EffectsAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1539:2: rule__Recipe__EffectsAssignment_3
            {
            pushFollow(FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3033);
            rule__Recipe__EffectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 

            }

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1542:1: ( ( rule__Recipe__EffectsAssignment_3 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1543:1: ( rule__Recipe__EffectsAssignment_3 )*
            {
             before(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1544:1: ( rule__Recipe__EffectsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1544:2: rule__Recipe__EffectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3045);
            	    rule__Recipe__EffectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1555:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1559:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1560:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__43078);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__43081);
            rule__Recipe__Group__5();

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
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1567:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__Group_4__0 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1571:1: ( ( ( rule__Recipe__Group_4__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1572:1: ( ( rule__Recipe__Group_4__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1572:1: ( ( rule__Recipe__Group_4__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1573:1: ( rule__Recipe__Group_4__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_4()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1574:1: ( rule__Recipe__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1574:2: rule__Recipe__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl3108);
                    rule__Recipe__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1584:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1588:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1589:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__53139);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__53142);
            rule__Recipe__Group__6();

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
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1596:1: rule__Recipe__Group__5__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1600:1: ( ( '}' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1601:1: ( '}' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1601:1: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1602:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Recipe__Group__5__Impl3170); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Recipe__Group__6"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1615:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1619:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1620:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__63201);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__63204);
            rule__Recipe__Group__7();

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
    // $ANTLR end "rule__Recipe__Group__6"


    // $ANTLR start "rule__Recipe__Group__6__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1627:1: rule__Recipe__Group__6__Impl : ( '=' ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1631:1: ( ( '=' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1632:1: ( '=' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1632:1: ( '=' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1633:1: '='
            {
             before(grammarAccess.getRecipeAccess().getEqualsSignKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Recipe__Group__6__Impl3232); 
             after(grammarAccess.getRecipeAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6__Impl"


    // $ANTLR start "rule__Recipe__Group__7"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1646:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1650:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1651:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__73263);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__73266);
            rule__Recipe__Group__8();

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
    // $ANTLR end "rule__Recipe__Group__7"


    // $ANTLR start "rule__Recipe__Group__7__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1658:1: rule__Recipe__Group__7__Impl : ( ( rule__Recipe__IngredientsAssignment_7 ) ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1662:1: ( ( ( rule__Recipe__IngredientsAssignment_7 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1663:1: ( ( rule__Recipe__IngredientsAssignment_7 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1663:1: ( ( rule__Recipe__IngredientsAssignment_7 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1664:1: ( rule__Recipe__IngredientsAssignment_7 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_7()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1665:1: ( rule__Recipe__IngredientsAssignment_7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1665:2: rule__Recipe__IngredientsAssignment_7
            {
            pushFollow(FOLLOW_rule__Recipe__IngredientsAssignment_7_in_rule__Recipe__Group__7__Impl3293);
            rule__Recipe__IngredientsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7__Impl"


    // $ANTLR start "rule__Recipe__Group__8"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1675:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1679:1: ( rule__Recipe__Group__8__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1680:2: rule__Recipe__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__83323);
            rule__Recipe__Group__8__Impl();

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
    // $ANTLR end "rule__Recipe__Group__8"


    // $ANTLR start "rule__Recipe__Group__8__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1686:1: rule__Recipe__Group__8__Impl : ( ( rule__Recipe__Group_8__0 )* ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1690:1: ( ( ( rule__Recipe__Group_8__0 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1691:1: ( ( rule__Recipe__Group_8__0 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1691:1: ( ( rule__Recipe__Group_8__0 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1692:1: ( rule__Recipe__Group_8__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_8()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1693:1: ( rule__Recipe__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1693:2: rule__Recipe__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Recipe__Group_8__0_in_rule__Recipe__Group__8__Impl3350);
            	    rule__Recipe__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8__Impl"


    // $ANTLR start "rule__Recipe__Group_4__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1721:1: rule__Recipe__Group_4__0 : rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 ;
    public final void rule__Recipe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1725:1: ( rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1726:2: rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__03399);
            rule__Recipe__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__03402);
            rule__Recipe__Group_4__1();

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
    // $ANTLR end "rule__Recipe__Group_4__0"


    // $ANTLR start "rule__Recipe__Group_4__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1733:1: rule__Recipe__Group_4__0__Impl : ( 'price:' ) ;
    public final void rule__Recipe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1737:1: ( ( 'price:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1738:1: ( 'price:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1738:1: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1739:1: 'price:'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Recipe__Group_4__0__Impl3430); 
             after(grammarAccess.getRecipeAccess().getPriceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_4__0__Impl"


    // $ANTLR start "rule__Recipe__Group_4__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1752:1: rule__Recipe__Group_4__1 : rule__Recipe__Group_4__1__Impl ;
    public final void rule__Recipe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1756:1: ( rule__Recipe__Group_4__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1757:2: rule__Recipe__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__13461);
            rule__Recipe__Group_4__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_4__1"


    // $ANTLR start "rule__Recipe__Group_4__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1763:1: rule__Recipe__Group_4__1__Impl : ( ( rule__Recipe__PriceAssignment_4_1 ) ) ;
    public final void rule__Recipe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1767:1: ( ( ( rule__Recipe__PriceAssignment_4_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1768:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1768:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1769:1: ( rule__Recipe__PriceAssignment_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_4_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1770:1: ( rule__Recipe__PriceAssignment_4_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1770:2: rule__Recipe__PriceAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl3488);
            rule__Recipe__PriceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getPriceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_4__1__Impl"


    // $ANTLR start "rule__Recipe__Group_8__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1784:1: rule__Recipe__Group_8__0 : rule__Recipe__Group_8__0__Impl rule__Recipe__Group_8__1 ;
    public final void rule__Recipe__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1788:1: ( rule__Recipe__Group_8__0__Impl rule__Recipe__Group_8__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1789:2: rule__Recipe__Group_8__0__Impl rule__Recipe__Group_8__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group_8__0__Impl_in_rule__Recipe__Group_8__03522);
            rule__Recipe__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group_8__1_in_rule__Recipe__Group_8__03525);
            rule__Recipe__Group_8__1();

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
    // $ANTLR end "rule__Recipe__Group_8__0"


    // $ANTLR start "rule__Recipe__Group_8__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1796:1: rule__Recipe__Group_8__0__Impl : ( '+' ) ;
    public final void rule__Recipe__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1800:1: ( ( '+' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1801:1: ( '+' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1801:1: ( '+' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1802:1: '+'
            {
             before(grammarAccess.getRecipeAccess().getPlusSignKeyword_8_0()); 
            match(input,11,FOLLOW_11_in_rule__Recipe__Group_8__0__Impl3553); 
             after(grammarAccess.getRecipeAccess().getPlusSignKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_8__0__Impl"


    // $ANTLR start "rule__Recipe__Group_8__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1815:1: rule__Recipe__Group_8__1 : rule__Recipe__Group_8__1__Impl ;
    public final void rule__Recipe__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1819:1: ( rule__Recipe__Group_8__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1820:2: rule__Recipe__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group_8__1__Impl_in_rule__Recipe__Group_8__13584);
            rule__Recipe__Group_8__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_8__1"


    // $ANTLR start "rule__Recipe__Group_8__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1826:1: rule__Recipe__Group_8__1__Impl : ( ( rule__Recipe__IngredientsAssignment_8_1 ) ) ;
    public final void rule__Recipe__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1830:1: ( ( ( rule__Recipe__IngredientsAssignment_8_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1831:1: ( ( rule__Recipe__IngredientsAssignment_8_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1831:1: ( ( rule__Recipe__IngredientsAssignment_8_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1832:1: ( rule__Recipe__IngredientsAssignment_8_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_8_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1833:1: ( rule__Recipe__IngredientsAssignment_8_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1833:2: rule__Recipe__IngredientsAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Recipe__IngredientsAssignment_8_1_in_rule__Recipe__Group_8__1__Impl3611);
            rule__Recipe__IngredientsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_8__1__Impl"


    // $ANTLR start "rule__AlchemyLabModel__EffectsAssignment_0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1848:1: rule__AlchemyLabModel__EffectsAssignment_0 : ( ruleEffectDef ) ;
    public final void rule__AlchemyLabModel__EffectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1852:1: ( ( ruleEffectDef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1853:1: ( ruleEffectDef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1853:1: ( ruleEffectDef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1854:1: ruleEffectDef
            {
             before(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectDefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEffectDef_in_rule__AlchemyLabModel__EffectsAssignment_03650);
            ruleEffectDef();

            state._fsp--;

             after(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectDefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlchemyLabModel__EffectsAssignment_0"


    // $ANTLR start "rule__AlchemyLabModel__IngredientsAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1863:1: rule__AlchemyLabModel__IngredientsAssignment_1 : ( ruleIngredientDef ) ;
    public final void rule__AlchemyLabModel__IngredientsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1867:1: ( ( ruleIngredientDef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1868:1: ( ruleIngredientDef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1868:1: ( ruleIngredientDef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1869:1: ruleIngredientDef
            {
             before(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIngredientDef_in_rule__AlchemyLabModel__IngredientsAssignment_13681);
            ruleIngredientDef();

            state._fsp--;

             after(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlchemyLabModel__IngredientsAssignment_1"


    // $ANTLR start "rule__AlchemyLabModel__RecipesAssignment_2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1878:1: rule__AlchemyLabModel__RecipesAssignment_2 : ( ruleRecipe ) ;
    public final void rule__AlchemyLabModel__RecipesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1882:1: ( ( ruleRecipe ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1883:1: ( ruleRecipe )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1883:1: ( ruleRecipe )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1884:1: ruleRecipe
            {
             before(grammarAccess.getAlchemyLabModelAccess().getRecipesRecipeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecipe_in_rule__AlchemyLabModel__RecipesAssignment_23712);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getAlchemyLabModelAccess().getRecipesRecipeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlchemyLabModel__RecipesAssignment_2"


    // $ANTLR start "rule__EffectDef__NameAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1893:1: rule__EffectDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1897:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1898:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1898:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1899:1: RULE_ID
            {
             before(grammarAccess.getEffectDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectDef__NameAssignment_13743); 
             after(grammarAccess.getEffectDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__NameAssignment_1"


    // $ANTLR start "rule__EffectDef__TypeAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1908:1: rule__EffectDef__TypeAssignment_3 : ( ruleEffectType ) ;
    public final void rule__EffectDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1912:1: ( ( ruleEffectType ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1913:1: ( ruleEffectType )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1913:1: ( ruleEffectType )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1914:1: ruleEffectType
            {
             before(grammarAccess.getEffectDefAccess().getTypeEffectTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectType_in_rule__EffectDef__TypeAssignment_33774);
            ruleEffectType();

            state._fsp--;

             after(grammarAccess.getEffectDefAccess().getTypeEffectTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__TypeAssignment_3"


    // $ANTLR start "rule__EffectDef__DescriptionAssignment_5_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1923:1: rule__EffectDef__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__EffectDef__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1927:1: ( ( RULE_STRING ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1928:1: ( RULE_STRING )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1928:1: ( RULE_STRING )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1929:1: RULE_STRING
            {
             before(grammarAccess.getEffectDefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EffectDef__DescriptionAssignment_5_13805); 
             after(grammarAccess.getEffectDefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectDef__DescriptionAssignment_5_1"


    // $ANTLR start "rule__EffectRef__EffectAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1938:1: rule__EffectRef__EffectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectRef__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1942:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1943:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1943:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1944:1: ( RULE_ID )
            {
             before(grammarAccess.getEffectRefAccess().getEffectEffectCrossReference_1_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1945:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1946:1: RULE_ID
            {
             before(grammarAccess.getEffectRefAccess().getEffectEffectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectRef__EffectAssignment_13840); 
             after(grammarAccess.getEffectRefAccess().getEffectEffectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEffectRefAccess().getEffectEffectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectRef__EffectAssignment_1"


    // $ANTLR start "rule__EffectAlias__AliasAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1957:1: rule__EffectAlias__AliasAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectAlias__AliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1961:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1962:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1962:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1963:1: RULE_ID
            {
             before(grammarAccess.getEffectAliasAccess().getAliasIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectAlias__AliasAssignment_13875); 
             after(grammarAccess.getEffectAliasAccess().getAliasIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectAlias__AliasAssignment_1"


    // $ANTLR start "rule__EffectAlias__EffectAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1972:1: rule__EffectAlias__EffectAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__EffectAlias__EffectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1976:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1977:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1977:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1978:1: ( RULE_ID )
            {
             before(grammarAccess.getEffectAliasAccess().getEffectEffectDefCrossReference_3_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1979:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1980:1: RULE_ID
            {
             before(grammarAccess.getEffectAliasAccess().getEffectEffectDefIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectAlias__EffectAssignment_33910); 
             after(grammarAccess.getEffectAliasAccess().getEffectEffectDefIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEffectAliasAccess().getEffectEffectDefCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectAlias__EffectAssignment_3"


    // $ANTLR start "rule__IngredientDef__NameAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1991:1: rule__IngredientDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IngredientDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1995:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1996:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1996:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1997:1: RULE_ID
            {
             before(grammarAccess.getIngredientDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientDef__NameAssignment_13945); 
             after(grammarAccess.getIngredientDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__NameAssignment_1"


    // $ANTLR start "rule__IngredientDef__EffectsAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2006:1: rule__IngredientDef__EffectsAssignment_3 : ( ruleEffectRef ) ;
    public final void rule__IngredientDef__EffectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2010:1: ( ( ruleEffectRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2011:1: ( ruleEffectRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2011:1: ( ruleEffectRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2012:1: ruleEffectRef
            {
             before(grammarAccess.getIngredientDefAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectRef_in_rule__IngredientDef__EffectsAssignment_33976);
            ruleEffectRef();

            state._fsp--;

             after(grammarAccess.getIngredientDefAccess().getEffectsEffectRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__EffectsAssignment_3"


    // $ANTLR start "rule__IngredientDef__PriceAssignment_5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2021:1: rule__IngredientDef__PriceAssignment_5 : ( RULE_NUMBER ) ;
    public final void rule__IngredientDef__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2025:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2026:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2026:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2027:1: RULE_NUMBER
            {
             before(grammarAccess.getIngredientDefAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__IngredientDef__PriceAssignment_54007); 
             after(grammarAccess.getIngredientDefAccess().getPriceNUMBERTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__PriceAssignment_5"


    // $ANTLR start "rule__IngredientDef__WeightAssignment_7"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2036:1: rule__IngredientDef__WeightAssignment_7 : ( RULE_NUMBER ) ;
    public final void rule__IngredientDef__WeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2040:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2041:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2041:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2042:1: RULE_NUMBER
            {
             before(grammarAccess.getIngredientDefAccess().getWeightNUMBERTerminalRuleCall_7_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__IngredientDef__WeightAssignment_74038); 
             after(grammarAccess.getIngredientDefAccess().getWeightNUMBERTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__WeightAssignment_7"


    // $ANTLR start "rule__IngredientDef__SourceAssignment_8_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2051:1: rule__IngredientDef__SourceAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__IngredientDef__SourceAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2055:1: ( ( RULE_STRING ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2056:1: ( RULE_STRING )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2056:1: ( RULE_STRING )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2057:1: RULE_STRING
            {
             before(grammarAccess.getIngredientDefAccess().getSourceSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IngredientDef__SourceAssignment_8_14069); 
             after(grammarAccess.getIngredientDefAccess().getSourceSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientDef__SourceAssignment_8_1"


    // $ANTLR start "rule__IngredientRef__IngredientAssignment"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2066:1: rule__IngredientRef__IngredientAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IngredientRef__IngredientAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2070:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2071:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2071:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2072:1: ( RULE_ID )
            {
             before(grammarAccess.getIngredientRefAccess().getIngredientIngredientCrossReference_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2073:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2074:1: RULE_ID
            {
             before(grammarAccess.getIngredientRefAccess().getIngredientIngredientIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientRef__IngredientAssignment4104); 
             after(grammarAccess.getIngredientRefAccess().getIngredientIngredientIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIngredientRefAccess().getIngredientIngredientCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientRef__IngredientAssignment"


    // $ANTLR start "rule__IngredientAlias__AliasAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2085:1: rule__IngredientAlias__AliasAssignment_1 : ( RULE_ID ) ;
    public final void rule__IngredientAlias__AliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2089:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2090:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2090:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2091:1: RULE_ID
            {
             before(grammarAccess.getIngredientAliasAccess().getAliasIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientAlias__AliasAssignment_14139); 
             after(grammarAccess.getIngredientAliasAccess().getAliasIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientAlias__AliasAssignment_1"


    // $ANTLR start "rule__IngredientAlias__IngredientAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2100:1: rule__IngredientAlias__IngredientAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__IngredientAlias__IngredientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2104:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2105:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2105:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2106:1: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAliasAccess().getIngredientIngredientDefCrossReference_3_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2107:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2108:1: RULE_ID
            {
             before(grammarAccess.getIngredientAliasAccess().getIngredientIngredientDefIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientAlias__IngredientAssignment_34174); 
             after(grammarAccess.getIngredientAliasAccess().getIngredientIngredientDefIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIngredientAliasAccess().getIngredientIngredientDefCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngredientAlias__IngredientAssignment_3"


    // $ANTLR start "rule__Recipe__ToxicityAssignment_0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2119:1: rule__Recipe__ToxicityAssignment_0 : ( ruleToxicity ) ;
    public final void rule__Recipe__ToxicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2123:1: ( ( ruleToxicity ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2124:1: ( ruleToxicity )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2124:1: ( ruleToxicity )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2125:1: ruleToxicity
            {
             before(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleToxicity_in_rule__Recipe__ToxicityAssignment_04209);
            ruleToxicity();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__ToxicityAssignment_0"


    // $ANTLR start "rule__Recipe__NameAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2134:1: rule__Recipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2138:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2139:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2139:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2140:1: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recipe__NameAssignment_14240); 
             after(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NameAssignment_1"


    // $ANTLR start "rule__Recipe__EffectsAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2149:1: rule__Recipe__EffectsAssignment_3 : ( ruleEffectRef ) ;
    public final void rule__Recipe__EffectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2153:1: ( ( ruleEffectRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2154:1: ( ruleEffectRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2154:1: ( ruleEffectRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2155:1: ruleEffectRef
            {
             before(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectRef_in_rule__Recipe__EffectsAssignment_34271);
            ruleEffectRef();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__EffectsAssignment_3"


    // $ANTLR start "rule__Recipe__PriceAssignment_4_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2164:1: rule__Recipe__PriceAssignment_4_1 : ( RULE_NUMBER ) ;
    public final void rule__Recipe__PriceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2168:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2169:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2169:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2170:1: RULE_NUMBER
            {
             before(grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_4_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Recipe__PriceAssignment_4_14302); 
             after(grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__PriceAssignment_4_1"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_7"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2179:1: rule__Recipe__IngredientsAssignment_7 : ( ruleIngredientRef ) ;
    public final void rule__Recipe__IngredientsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2183:1: ( ( ruleIngredientRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2184:1: ( ruleIngredientRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2184:1: ( ruleIngredientRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2185:1: ruleIngredientRef
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_74333);
            ruleIngredientRef();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_7"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_8_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2194:1: rule__Recipe__IngredientsAssignment_8_1 : ( ruleIngredientRef ) ;
    public final void rule__Recipe__IngredientsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2198:1: ( ( ruleIngredientRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2199:1: ( ruleIngredientRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2199:1: ( ruleIngredientRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2200:1: ruleIngredientRef
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_8_14364);
            ruleIngredientRef();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_8_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAlchemyLabModel_in_entryRuleAlchemyLabModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlchemyLabModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__0_in_ruleAlchemyLabModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_entryRuleEffectDef123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectDef130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__0_in_ruleEffectDef156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_entryRuleEffectRef183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRef190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__0_in_ruleEffectRef216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectAlias250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__0_in_ruleEffectAlias276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientDef312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__0_in_ruleIngredientDef338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientRef372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientRef__IngredientAssignment_in_ruleIngredientRef398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientAlias432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__0_in_ruleIngredientAlias458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipe492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__0_in_ruleRecipe518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectType__Alternatives_in_ruleEffectType555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Toxicity__Alternatives_in_ruleToxicity591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EffectType__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EffectType__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Toxicity__Alternatives686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Toxicity__Alternatives707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Toxicity__Alternatives728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__0__Impl_in_rule__AlchemyLabModel__Group__0761 = new BitSet(new long[]{0x000000000080E000L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__1_in_rule__AlchemyLabModel__Group__0764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__EffectsAssignment_0_in_rule__AlchemyLabModel__Group__0__Impl791 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__1__Impl_in_rule__AlchemyLabModel__Group__1822 = new BitSet(new long[]{0x000000000080E000L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__2_in_rule__AlchemyLabModel__Group__1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__IngredientsAssignment_1_in_rule__AlchemyLabModel__Group__1__Impl852 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__2__Impl_in_rule__AlchemyLabModel__Group__2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__RecipesAssignment_2_in_rule__AlchemyLabModel__Group__2__Impl910 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__0__Impl_in_rule__EffectDef__Group__0947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__1_in_rule__EffectDef__Group__0950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EffectDef__Group__0__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__1__Impl_in_rule__EffectDef__Group__11009 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__2_in_rule__EffectDef__Group__11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__NameAssignment_1_in_rule__EffectDef__Group__1__Impl1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__2__Impl_in_rule__EffectDef__Group__21069 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__3_in_rule__EffectDef__Group__21072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EffectDef__Group__2__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__3__Impl_in_rule__EffectDef__Group__31131 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__4_in_rule__EffectDef__Group__31134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__TypeAssignment_3_in_rule__EffectDef__Group__3__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__4__Impl_in_rule__EffectDef__Group__41191 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__5_in_rule__EffectDef__Group__41194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EffectDef__Group__4__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__5__Impl_in_rule__EffectDef__Group__51253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__0_in_rule__EffectDef__Group__5__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__0__Impl_in_rule__EffectDef__Group_5__01323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__1_in_rule__EffectDef__Group_5__01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EffectDef__Group_5__0__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__1__Impl_in_rule__EffectDef__Group_5__11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__DescriptionAssignment_5_1_in_rule__EffectDef__Group_5__1__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__0__Impl_in_rule__EffectRef__Group__01446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__1_in_rule__EffectRef__Group__01449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EffectRef__Group__0__Impl1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__1__Impl_in_rule__EffectRef__Group__11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__EffectAssignment_1_in_rule__EffectRef__Group__1__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__0__Impl_in_rule__EffectAlias__Group__01569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__1_in_rule__EffectAlias__Group__01572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EffectAlias__Group__0__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__1__Impl_in_rule__EffectAlias__Group__11631 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__2_in_rule__EffectAlias__Group__11634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__AliasAssignment_1_in_rule__EffectAlias__Group__1__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__2__Impl_in_rule__EffectAlias__Group__21691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__3_in_rule__EffectAlias__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EffectAlias__Group__2__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__3__Impl_in_rule__EffectAlias__Group__31753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__EffectAssignment_3_in_rule__EffectAlias__Group__3__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__0__Impl_in_rule__IngredientDef__Group__01818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__1_in_rule__IngredientDef__Group__01821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IngredientDef__Group__0__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__1__Impl_in_rule__IngredientDef__Group__11880 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__2_in_rule__IngredientDef__Group__11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__NameAssignment_1_in_rule__IngredientDef__Group__1__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__2__Impl_in_rule__IngredientDef__Group__21940 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__3_in_rule__IngredientDef__Group__21943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IngredientDef__Group__2__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__3__Impl_in_rule__IngredientDef__Group__32002 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__4_in_rule__IngredientDef__Group__32005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__EffectsAssignment_3_in_rule__IngredientDef__Group__3__Impl2032 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__4__Impl_in_rule__IngredientDef__Group__42063 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__5_in_rule__IngredientDef__Group__42066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IngredientDef__Group__4__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__5__Impl_in_rule__IngredientDef__Group__52125 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__6_in_rule__IngredientDef__Group__52128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__PriceAssignment_5_in_rule__IngredientDef__Group__5__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__6__Impl_in_rule__IngredientDef__Group__62185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__7_in_rule__IngredientDef__Group__62188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IngredientDef__Group__6__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__7__Impl_in_rule__IngredientDef__Group__72247 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__8_in_rule__IngredientDef__Group__72250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__WeightAssignment_7_in_rule__IngredientDef__Group__7__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__8__Impl_in_rule__IngredientDef__Group__82307 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__9_in_rule__IngredientDef__Group__82310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__0_in_rule__IngredientDef__Group__8__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__9__Impl_in_rule__IngredientDef__Group__92368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IngredientDef__Group__9__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__0__Impl_in_rule__IngredientDef__Group_8__02447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__1_in_rule__IngredientDef__Group_8__02450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IngredientDef__Group_8__0__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__1__Impl_in_rule__IngredientDef__Group_8__12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__SourceAssignment_8_1_in_rule__IngredientDef__Group_8__1__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__0__Impl_in_rule__IngredientAlias__Group__02570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__1_in_rule__IngredientAlias__Group__02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__IngredientAlias__Group__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__1__Impl_in_rule__IngredientAlias__Group__12632 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__2_in_rule__IngredientAlias__Group__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__AliasAssignment_1_in_rule__IngredientAlias__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__2__Impl_in_rule__IngredientAlias__Group__22692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__3_in_rule__IngredientAlias__Group__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IngredientAlias__Group__2__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__3__Impl_in_rule__IngredientAlias__Group__32754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__IngredientAssignment_3_in_rule__IngredientAlias__Group__3__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__ToxicityAssignment_0_in_rule__Recipe__Group__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12879 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__NameAssignment_1_in_rule__Recipe__Group__1__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22939 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Recipe__Group__2__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__33001 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__33004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3033 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3045 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__43078 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__43081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__53139 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__53142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Recipe__Group__5__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__63201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__63204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Recipe__Group__6__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__73263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__73266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_7_in_rule__Recipe__Group__7__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__83323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__0_in_rule__Recipe__Group__8__Impl3350 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__03399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__03402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Recipe__Group_4__0__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__0__Impl_in_rule__Recipe__Group_8__03522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__1_in_rule__Recipe__Group_8__03525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Recipe__Group_8__0__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__1__Impl_in_rule__Recipe__Group_8__13584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_8_1_in_rule__Recipe__Group_8__1__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_rule__AlchemyLabModel__EffectsAssignment_03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_rule__AlchemyLabModel__IngredientsAssignment_13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_rule__AlchemyLabModel__RecipesAssignment_23712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectDef__NameAssignment_13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectType_in_rule__EffectDef__TypeAssignment_33774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EffectDef__DescriptionAssignment_5_13805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectRef__EffectAssignment_13840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectAlias__AliasAssignment_13875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectAlias__EffectAssignment_33910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientDef__NameAssignment_13945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_rule__IngredientDef__EffectsAssignment_33976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__IngredientDef__PriceAssignment_54007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__IngredientDef__WeightAssignment_74038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IngredientDef__SourceAssignment_8_14069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientRef__IngredientAssignment4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientAlias__AliasAssignment_14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientAlias__IngredientAssignment_34174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToxicity_in_rule__Recipe__ToxicityAssignment_04209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recipe__NameAssignment_14240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_rule__Recipe__EffectsAssignment_34271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Recipe__PriceAssignment_4_14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_74333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_8_14364 = new BitSet(new long[]{0x0000000000000002L});

}