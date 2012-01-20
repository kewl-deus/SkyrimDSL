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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_STRONGID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'potion'", "'poison'", "'mixture'", "'effect'", "'('", "')'", "':'", "'->'", "'ealias'", "'for'", "'ingredient'", "'{'", "'price:'", "'weight:'", "'}'", "'source:'", "'ialias'", "'='"
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int RULE_STRONGID=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=10;

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


    // $ANTLR start "entryRuleEffect"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:88:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:89:1: ( ruleEffect EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:90:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect121);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect128); 

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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:97:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:101:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:102:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:102:1: ( ( rule__Effect__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:103:1: ( rule__Effect__Alternatives )
            {
             before(grammarAccess.getEffectAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:104:1: ( rule__Effect__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:104:2: rule__Effect__Alternatives
            {
            pushFollow(FOLLOW_rule__Effect__Alternatives_in_ruleEffect154);
            rule__Effect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEffectDef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:116:1: entryRuleEffectDef : ruleEffectDef EOF ;
    public final void entryRuleEffectDef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:117:1: ( ruleEffectDef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:118:1: ruleEffectDef EOF
            {
             before(grammarAccess.getEffectDefRule()); 
            pushFollow(FOLLOW_ruleEffectDef_in_entryRuleEffectDef181);
            ruleEffectDef();

            state._fsp--;

             after(grammarAccess.getEffectDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectDef188); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:125:1: ruleEffectDef : ( ( rule__EffectDef__Group__0 ) ) ;
    public final void ruleEffectDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:129:2: ( ( ( rule__EffectDef__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:130:1: ( ( rule__EffectDef__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:130:1: ( ( rule__EffectDef__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:131:1: ( rule__EffectDef__Group__0 )
            {
             before(grammarAccess.getEffectDefAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:132:1: ( rule__EffectDef__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:132:2: rule__EffectDef__Group__0
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__0_in_ruleEffectDef214);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:144:1: entryRuleEffectRef : ruleEffectRef EOF ;
    public final void entryRuleEffectRef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:145:1: ( ruleEffectRef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:146:1: ruleEffectRef EOF
            {
             before(grammarAccess.getEffectRefRule()); 
            pushFollow(FOLLOW_ruleEffectRef_in_entryRuleEffectRef241);
            ruleEffectRef();

            state._fsp--;

             after(grammarAccess.getEffectRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRef248); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:153:1: ruleEffectRef : ( ( rule__EffectRef__Group__0 ) ) ;
    public final void ruleEffectRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:157:2: ( ( ( rule__EffectRef__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:158:1: ( ( rule__EffectRef__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:158:1: ( ( rule__EffectRef__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:159:1: ( rule__EffectRef__Group__0 )
            {
             before(grammarAccess.getEffectRefAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:160:1: ( rule__EffectRef__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:160:2: rule__EffectRef__Group__0
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__0_in_ruleEffectRef274);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:172:1: entryRuleEffectAlias : ruleEffectAlias EOF ;
    public final void entryRuleEffectAlias() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:173:1: ( ruleEffectAlias EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:174:1: ruleEffectAlias EOF
            {
             before(grammarAccess.getEffectAliasRule()); 
            pushFollow(FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias301);
            ruleEffectAlias();

            state._fsp--;

             after(grammarAccess.getEffectAliasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectAlias308); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:181:1: ruleEffectAlias : ( ( rule__EffectAlias__Group__0 ) ) ;
    public final void ruleEffectAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:185:2: ( ( ( rule__EffectAlias__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:186:1: ( ( rule__EffectAlias__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:186:1: ( ( rule__EffectAlias__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:187:1: ( rule__EffectAlias__Group__0 )
            {
             before(grammarAccess.getEffectAliasAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:188:1: ( rule__EffectAlias__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:188:2: rule__EffectAlias__Group__0
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__0_in_ruleEffectAlias334);
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


    // $ANTLR start "entryRuleIngredient"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:200:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:201:1: ( ruleIngredient EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:202:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_ruleIngredient_in_entryRuleIngredient361);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredient368); 

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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:209:1: ruleIngredient : ( ( rule__Ingredient__Alternatives ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:213:2: ( ( ( rule__Ingredient__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:214:1: ( ( rule__Ingredient__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:214:1: ( ( rule__Ingredient__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:215:1: ( rule__Ingredient__Alternatives )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:216:1: ( rule__Ingredient__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:216:2: rule__Ingredient__Alternatives
            {
            pushFollow(FOLLOW_rule__Ingredient__Alternatives_in_ruleIngredient394);
            rule__Ingredient__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleIngredientDef"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:228:1: entryRuleIngredientDef : ruleIngredientDef EOF ;
    public final void entryRuleIngredientDef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:229:1: ( ruleIngredientDef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:230:1: ruleIngredientDef EOF
            {
             before(grammarAccess.getIngredientDefRule()); 
            pushFollow(FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef421);
            ruleIngredientDef();

            state._fsp--;

             after(grammarAccess.getIngredientDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientDef428); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:237:1: ruleIngredientDef : ( ( rule__IngredientDef__Group__0 ) ) ;
    public final void ruleIngredientDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:241:2: ( ( ( rule__IngredientDef__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:242:1: ( ( rule__IngredientDef__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:242:1: ( ( rule__IngredientDef__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:243:1: ( rule__IngredientDef__Group__0 )
            {
             before(grammarAccess.getIngredientDefAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:244:1: ( rule__IngredientDef__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:244:2: rule__IngredientDef__Group__0
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__0_in_ruleIngredientDef454);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:256:1: entryRuleIngredientRef : ruleIngredientRef EOF ;
    public final void entryRuleIngredientRef() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:257:1: ( ruleIngredientRef EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:258:1: ruleIngredientRef EOF
            {
             before(grammarAccess.getIngredientRefRule()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef481);
            ruleIngredientRef();

            state._fsp--;

             after(grammarAccess.getIngredientRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientRef488); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:265:1: ruleIngredientRef : ( ( rule__IngredientRef__IngredientAssignment ) ) ;
    public final void ruleIngredientRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:269:2: ( ( ( rule__IngredientRef__IngredientAssignment ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:270:1: ( ( rule__IngredientRef__IngredientAssignment ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:270:1: ( ( rule__IngredientRef__IngredientAssignment ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:271:1: ( rule__IngredientRef__IngredientAssignment )
            {
             before(grammarAccess.getIngredientRefAccess().getIngredientAssignment()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:272:1: ( rule__IngredientRef__IngredientAssignment )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:272:2: rule__IngredientRef__IngredientAssignment
            {
            pushFollow(FOLLOW_rule__IngredientRef__IngredientAssignment_in_ruleIngredientRef514);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:284:1: entryRuleIngredientAlias : ruleIngredientAlias EOF ;
    public final void entryRuleIngredientAlias() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:285:1: ( ruleIngredientAlias EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:286:1: ruleIngredientAlias EOF
            {
             before(grammarAccess.getIngredientAliasRule()); 
            pushFollow(FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias541);
            ruleIngredientAlias();

            state._fsp--;

             after(grammarAccess.getIngredientAliasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientAlias548); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:293:1: ruleIngredientAlias : ( ( rule__IngredientAlias__Group__0 ) ) ;
    public final void ruleIngredientAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:297:2: ( ( ( rule__IngredientAlias__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:298:1: ( ( rule__IngredientAlias__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:298:1: ( ( rule__IngredientAlias__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:299:1: ( rule__IngredientAlias__Group__0 )
            {
             before(grammarAccess.getIngredientAliasAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:300:1: ( rule__IngredientAlias__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:300:2: rule__IngredientAlias__Group__0
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__0_in_ruleIngredientAlias574);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:312:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:313:1: ( ruleRecipe EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:314:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_ruleRecipe_in_entryRuleRecipe601);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipe608); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:321:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:325:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:326:1: ( ( rule__Recipe__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:326:1: ( ( rule__Recipe__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:327:1: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:328:1: ( rule__Recipe__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:328:2: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_rule__Recipe__Group__0_in_ruleRecipe634);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:341:1: ruleEffectType : ( ( rule__EffectType__Alternatives ) ) ;
    public final void ruleEffectType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:345:1: ( ( ( rule__EffectType__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:346:1: ( ( rule__EffectType__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:346:1: ( ( rule__EffectType__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:347:1: ( rule__EffectType__Alternatives )
            {
             before(grammarAccess.getEffectTypeAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:348:1: ( rule__EffectType__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:348:2: rule__EffectType__Alternatives
            {
            pushFollow(FOLLOW_rule__EffectType__Alternatives_in_ruleEffectType671);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:360:1: ruleToxicity : ( ( rule__Toxicity__Alternatives ) ) ;
    public final void ruleToxicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:364:1: ( ( ( rule__Toxicity__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:365:1: ( ( rule__Toxicity__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:365:1: ( ( rule__Toxicity__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:366:1: ( rule__Toxicity__Alternatives )
            {
             before(grammarAccess.getToxicityAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:367:1: ( rule__Toxicity__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:367:2: rule__Toxicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Toxicity__Alternatives_in_ruleToxicity707);
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


    // $ANTLR start "rule__Effect__Alternatives"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:378:1: rule__Effect__Alternatives : ( ( ruleEffectDef ) | ( ruleEffectAlias ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:382:1: ( ( ruleEffectDef ) | ( ruleEffectAlias ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:383:1: ( ruleEffectDef )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:383:1: ( ruleEffectDef )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:384:1: ruleEffectDef
                    {
                     before(grammarAccess.getEffectAccess().getEffectDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEffectDef_in_rule__Effect__Alternatives742);
                    ruleEffectDef();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getEffectDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:389:6: ( ruleEffectAlias )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:389:6: ( ruleEffectAlias )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:390:1: ruleEffectAlias
                    {
                     before(grammarAccess.getEffectAccess().getEffectAliasParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEffectAlias_in_rule__Effect__Alternatives759);
                    ruleEffectAlias();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getEffectAliasParserRuleCall_1()); 

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
    // $ANTLR end "rule__Effect__Alternatives"


    // $ANTLR start "rule__Ingredient__Alternatives"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:400:1: rule__Ingredient__Alternatives : ( ( ruleIngredientDef ) | ( ruleIngredientAlias ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:404:1: ( ( ruleIngredientDef ) | ( ruleIngredientAlias ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:405:1: ( ruleIngredientDef )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:405:1: ( ruleIngredientDef )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:406:1: ruleIngredientDef
                    {
                     before(grammarAccess.getIngredientAccess().getIngredientDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIngredientDef_in_rule__Ingredient__Alternatives791);
                    ruleIngredientDef();

                    state._fsp--;

                     after(grammarAccess.getIngredientAccess().getIngredientDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:411:6: ( ruleIngredientAlias )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:411:6: ( ruleIngredientAlias )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:412:1: ruleIngredientAlias
                    {
                     before(grammarAccess.getIngredientAccess().getIngredientAliasParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIngredientAlias_in_rule__Ingredient__Alternatives808);
                    ruleIngredientAlias();

                    state._fsp--;

                     after(grammarAccess.getIngredientAccess().getIngredientAliasParserRuleCall_1()); 

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
    // $ANTLR end "rule__Ingredient__Alternatives"


    // $ANTLR start "rule__EffectType__Alternatives"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:422:1: rule__EffectType__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__EffectType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:426:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:427:1: ( ( '+' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:427:1: ( ( '+' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:428:1: ( '+' )
                    {
                     before(grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:429:1: ( '+' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:429:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__EffectType__Alternatives841); 

                    }

                     after(grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:434:6: ( ( '-' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:434:6: ( ( '-' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:435:1: ( '-' )
                    {
                     before(grammarAccess.getEffectTypeAccess().getWEAKENEnumLiteralDeclaration_1()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:436:1: ( '-' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:436:3: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__EffectType__Alternatives862); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:446:1: rule__Toxicity__Alternatives : ( ( ( 'potion' ) ) | ( ( 'poison' ) ) | ( ( 'mixture' ) ) );
    public final void rule__Toxicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:450:1: ( ( ( 'potion' ) ) | ( ( 'poison' ) ) | ( ( 'mixture' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
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
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:451:1: ( ( 'potion' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:451:1: ( ( 'potion' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:452:1: ( 'potion' )
                    {
                     before(grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:453:1: ( 'potion' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:453:3: 'potion'
                    {
                    match(input,14,FOLLOW_14_in_rule__Toxicity__Alternatives898); 

                    }

                     after(grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:458:6: ( ( 'poison' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:458:6: ( ( 'poison' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:459:1: ( 'poison' )
                    {
                     before(grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:460:1: ( 'poison' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:460:3: 'poison'
                    {
                    match(input,15,FOLLOW_15_in_rule__Toxicity__Alternatives919); 

                    }

                     after(grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:465:6: ( ( 'mixture' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:465:6: ( ( 'mixture' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:466:1: ( 'mixture' )
                    {
                     before(grammarAccess.getToxicityAccess().getMIXTUREEnumLiteralDeclaration_2()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:467:1: ( 'mixture' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:467:3: 'mixture'
                    {
                    match(input,16,FOLLOW_16_in_rule__Toxicity__Alternatives940); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:479:1: rule__AlchemyLabModel__Group__0 : rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1 ;
    public final void rule__AlchemyLabModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:483:1: ( rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:484:2: rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__0__Impl_in_rule__AlchemyLabModel__Group__0973);
            rule__AlchemyLabModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__1_in_rule__AlchemyLabModel__Group__0976);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:491:1: rule__AlchemyLabModel__Group__0__Impl : ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* ) ;
    public final void rule__AlchemyLabModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:495:1: ( ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:496:1: ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:496:1: ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:497:1: ( rule__AlchemyLabModel__EffectsAssignment_0 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getEffectsAssignment_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:498:1: ( rule__AlchemyLabModel__EffectsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:498:2: rule__AlchemyLabModel__EffectsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__EffectsAssignment_0_in_rule__AlchemyLabModel__Group__0__Impl1003);
            	    rule__AlchemyLabModel__EffectsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:508:1: rule__AlchemyLabModel__Group__1 : rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2 ;
    public final void rule__AlchemyLabModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:512:1: ( rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:513:2: rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__1__Impl_in_rule__AlchemyLabModel__Group__11034);
            rule__AlchemyLabModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__2_in_rule__AlchemyLabModel__Group__11037);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:520:1: rule__AlchemyLabModel__Group__1__Impl : ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* ) ;
    public final void rule__AlchemyLabModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:524:1: ( ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:525:1: ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:525:1: ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:526:1: ( rule__AlchemyLabModel__IngredientsAssignment_1 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getIngredientsAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:527:1: ( rule__AlchemyLabModel__IngredientsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:527:2: rule__AlchemyLabModel__IngredientsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__IngredientsAssignment_1_in_rule__AlchemyLabModel__Group__1__Impl1064);
            	    rule__AlchemyLabModel__IngredientsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:537:1: rule__AlchemyLabModel__Group__2 : rule__AlchemyLabModel__Group__2__Impl ;
    public final void rule__AlchemyLabModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:541:1: ( rule__AlchemyLabModel__Group__2__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:542:2: rule__AlchemyLabModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__2__Impl_in_rule__AlchemyLabModel__Group__21095);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:548:1: rule__AlchemyLabModel__Group__2__Impl : ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* ) ;
    public final void rule__AlchemyLabModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:552:1: ( ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:553:1: ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:553:1: ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:554:1: ( rule__AlchemyLabModel__RecipesAssignment_2 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getRecipesAssignment_2()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:555:1: ( rule__AlchemyLabModel__RecipesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:555:2: rule__AlchemyLabModel__RecipesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__RecipesAssignment_2_in_rule__AlchemyLabModel__Group__2__Impl1122);
            	    rule__AlchemyLabModel__RecipesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:571:1: rule__EffectDef__Group__0 : rule__EffectDef__Group__0__Impl rule__EffectDef__Group__1 ;
    public final void rule__EffectDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:575:1: ( rule__EffectDef__Group__0__Impl rule__EffectDef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:576:2: rule__EffectDef__Group__0__Impl rule__EffectDef__Group__1
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__0__Impl_in_rule__EffectDef__Group__01159);
            rule__EffectDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__1_in_rule__EffectDef__Group__01162);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:583:1: rule__EffectDef__Group__0__Impl : ( 'effect' ) ;
    public final void rule__EffectDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:587:1: ( ( 'effect' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:588:1: ( 'effect' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:588:1: ( 'effect' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:589:1: 'effect'
            {
             before(grammarAccess.getEffectDefAccess().getEffectKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__EffectDef__Group__0__Impl1190); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:602:1: rule__EffectDef__Group__1 : rule__EffectDef__Group__1__Impl rule__EffectDef__Group__2 ;
    public final void rule__EffectDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:606:1: ( rule__EffectDef__Group__1__Impl rule__EffectDef__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:607:2: rule__EffectDef__Group__1__Impl rule__EffectDef__Group__2
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__1__Impl_in_rule__EffectDef__Group__11221);
            rule__EffectDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__2_in_rule__EffectDef__Group__11224);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:614:1: rule__EffectDef__Group__1__Impl : ( ( rule__EffectDef__NameAssignment_1 ) ) ;
    public final void rule__EffectDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:618:1: ( ( ( rule__EffectDef__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:619:1: ( ( rule__EffectDef__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:619:1: ( ( rule__EffectDef__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:620:1: ( rule__EffectDef__NameAssignment_1 )
            {
             before(grammarAccess.getEffectDefAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:621:1: ( rule__EffectDef__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:621:2: rule__EffectDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectDef__NameAssignment_1_in_rule__EffectDef__Group__1__Impl1251);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:631:1: rule__EffectDef__Group__2 : rule__EffectDef__Group__2__Impl rule__EffectDef__Group__3 ;
    public final void rule__EffectDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:635:1: ( rule__EffectDef__Group__2__Impl rule__EffectDef__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:636:2: rule__EffectDef__Group__2__Impl rule__EffectDef__Group__3
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__2__Impl_in_rule__EffectDef__Group__21281);
            rule__EffectDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__3_in_rule__EffectDef__Group__21284);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:643:1: rule__EffectDef__Group__2__Impl : ( '(' ) ;
    public final void rule__EffectDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:647:1: ( ( '(' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:648:1: ( '(' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:648:1: ( '(' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:649:1: '('
            {
             before(grammarAccess.getEffectDefAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__EffectDef__Group__2__Impl1312); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:662:1: rule__EffectDef__Group__3 : rule__EffectDef__Group__3__Impl rule__EffectDef__Group__4 ;
    public final void rule__EffectDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:666:1: ( rule__EffectDef__Group__3__Impl rule__EffectDef__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:667:2: rule__EffectDef__Group__3__Impl rule__EffectDef__Group__4
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__3__Impl_in_rule__EffectDef__Group__31343);
            rule__EffectDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__4_in_rule__EffectDef__Group__31346);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:674:1: rule__EffectDef__Group__3__Impl : ( ( rule__EffectDef__TypeAssignment_3 ) ) ;
    public final void rule__EffectDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:678:1: ( ( ( rule__EffectDef__TypeAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:679:1: ( ( rule__EffectDef__TypeAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:679:1: ( ( rule__EffectDef__TypeAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:680:1: ( rule__EffectDef__TypeAssignment_3 )
            {
             before(grammarAccess.getEffectDefAccess().getTypeAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:681:1: ( rule__EffectDef__TypeAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:681:2: rule__EffectDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__EffectDef__TypeAssignment_3_in_rule__EffectDef__Group__3__Impl1373);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:691:1: rule__EffectDef__Group__4 : rule__EffectDef__Group__4__Impl rule__EffectDef__Group__5 ;
    public final void rule__EffectDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:695:1: ( rule__EffectDef__Group__4__Impl rule__EffectDef__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:696:2: rule__EffectDef__Group__4__Impl rule__EffectDef__Group__5
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__4__Impl_in_rule__EffectDef__Group__41403);
            rule__EffectDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group__5_in_rule__EffectDef__Group__41406);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:703:1: rule__EffectDef__Group__4__Impl : ( ')' ) ;
    public final void rule__EffectDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:707:1: ( ( ')' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:708:1: ( ')' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:708:1: ( ')' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:709:1: ')'
            {
             before(grammarAccess.getEffectDefAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__EffectDef__Group__4__Impl1434); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:722:1: rule__EffectDef__Group__5 : rule__EffectDef__Group__5__Impl ;
    public final void rule__EffectDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:726:1: ( rule__EffectDef__Group__5__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:727:2: rule__EffectDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EffectDef__Group__5__Impl_in_rule__EffectDef__Group__51465);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:733:1: rule__EffectDef__Group__5__Impl : ( ( rule__EffectDef__Group_5__0 )? ) ;
    public final void rule__EffectDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:737:1: ( ( ( rule__EffectDef__Group_5__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:738:1: ( ( rule__EffectDef__Group_5__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:738:1: ( ( rule__EffectDef__Group_5__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:739:1: ( rule__EffectDef__Group_5__0 )?
            {
             before(grammarAccess.getEffectDefAccess().getGroup_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:740:1: ( rule__EffectDef__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:740:2: rule__EffectDef__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__EffectDef__Group_5__0_in_rule__EffectDef__Group__5__Impl1492);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:762:1: rule__EffectDef__Group_5__0 : rule__EffectDef__Group_5__0__Impl rule__EffectDef__Group_5__1 ;
    public final void rule__EffectDef__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:766:1: ( rule__EffectDef__Group_5__0__Impl rule__EffectDef__Group_5__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:767:2: rule__EffectDef__Group_5__0__Impl rule__EffectDef__Group_5__1
            {
            pushFollow(FOLLOW_rule__EffectDef__Group_5__0__Impl_in_rule__EffectDef__Group_5__01535);
            rule__EffectDef__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectDef__Group_5__1_in_rule__EffectDef__Group_5__01538);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:774:1: rule__EffectDef__Group_5__0__Impl : ( ':' ) ;
    public final void rule__EffectDef__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:778:1: ( ( ':' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:779:1: ( ':' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:779:1: ( ':' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:780:1: ':'
            {
             before(grammarAccess.getEffectDefAccess().getColonKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__EffectDef__Group_5__0__Impl1566); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:793:1: rule__EffectDef__Group_5__1 : rule__EffectDef__Group_5__1__Impl ;
    public final void rule__EffectDef__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:797:1: ( rule__EffectDef__Group_5__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:798:2: rule__EffectDef__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__EffectDef__Group_5__1__Impl_in_rule__EffectDef__Group_5__11597);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:804:1: rule__EffectDef__Group_5__1__Impl : ( ( rule__EffectDef__DescriptionAssignment_5_1 ) ) ;
    public final void rule__EffectDef__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:808:1: ( ( ( rule__EffectDef__DescriptionAssignment_5_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:809:1: ( ( rule__EffectDef__DescriptionAssignment_5_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:809:1: ( ( rule__EffectDef__DescriptionAssignment_5_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:810:1: ( rule__EffectDef__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getEffectDefAccess().getDescriptionAssignment_5_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:811:1: ( rule__EffectDef__DescriptionAssignment_5_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:811:2: rule__EffectDef__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__EffectDef__DescriptionAssignment_5_1_in_rule__EffectDef__Group_5__1__Impl1624);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:825:1: rule__EffectRef__Group__0 : rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1 ;
    public final void rule__EffectRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:829:1: ( rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:830:2: rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__0__Impl_in_rule__EffectRef__Group__01658);
            rule__EffectRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectRef__Group__1_in_rule__EffectRef__Group__01661);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:837:1: rule__EffectRef__Group__0__Impl : ( '->' ) ;
    public final void rule__EffectRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:841:1: ( ( '->' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:842:1: ( '->' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:842:1: ( '->' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:843:1: '->'
            {
             before(grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__EffectRef__Group__0__Impl1689); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:856:1: rule__EffectRef__Group__1 : rule__EffectRef__Group__1__Impl ;
    public final void rule__EffectRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:860:1: ( rule__EffectRef__Group__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:861:2: rule__EffectRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__1__Impl_in_rule__EffectRef__Group__11720);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:867:1: rule__EffectRef__Group__1__Impl : ( ( rule__EffectRef__EffectAssignment_1 ) ) ;
    public final void rule__EffectRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:871:1: ( ( ( rule__EffectRef__EffectAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:872:1: ( ( rule__EffectRef__EffectAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:872:1: ( ( rule__EffectRef__EffectAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:873:1: ( rule__EffectRef__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectRefAccess().getEffectAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:874:1: ( rule__EffectRef__EffectAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:874:2: rule__EffectRef__EffectAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectRef__EffectAssignment_1_in_rule__EffectRef__Group__1__Impl1747);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:888:1: rule__EffectAlias__Group__0 : rule__EffectAlias__Group__0__Impl rule__EffectAlias__Group__1 ;
    public final void rule__EffectAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:892:1: ( rule__EffectAlias__Group__0__Impl rule__EffectAlias__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:893:2: rule__EffectAlias__Group__0__Impl rule__EffectAlias__Group__1
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__0__Impl_in_rule__EffectAlias__Group__01781);
            rule__EffectAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectAlias__Group__1_in_rule__EffectAlias__Group__01784);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:900:1: rule__EffectAlias__Group__0__Impl : ( 'ealias' ) ;
    public final void rule__EffectAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:904:1: ( ( 'ealias' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:905:1: ( 'ealias' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:905:1: ( 'ealias' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:906:1: 'ealias'
            {
             before(grammarAccess.getEffectAliasAccess().getEaliasKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__EffectAlias__Group__0__Impl1812); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:919:1: rule__EffectAlias__Group__1 : rule__EffectAlias__Group__1__Impl rule__EffectAlias__Group__2 ;
    public final void rule__EffectAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:923:1: ( rule__EffectAlias__Group__1__Impl rule__EffectAlias__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:924:2: rule__EffectAlias__Group__1__Impl rule__EffectAlias__Group__2
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__1__Impl_in_rule__EffectAlias__Group__11843);
            rule__EffectAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectAlias__Group__2_in_rule__EffectAlias__Group__11846);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:931:1: rule__EffectAlias__Group__1__Impl : ( ( rule__EffectAlias__AliasAssignment_1 ) ) ;
    public final void rule__EffectAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:935:1: ( ( ( rule__EffectAlias__AliasAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:936:1: ( ( rule__EffectAlias__AliasAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:936:1: ( ( rule__EffectAlias__AliasAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:937:1: ( rule__EffectAlias__AliasAssignment_1 )
            {
             before(grammarAccess.getEffectAliasAccess().getAliasAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:938:1: ( rule__EffectAlias__AliasAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:938:2: rule__EffectAlias__AliasAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectAlias__AliasAssignment_1_in_rule__EffectAlias__Group__1__Impl1873);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:948:1: rule__EffectAlias__Group__2 : rule__EffectAlias__Group__2__Impl rule__EffectAlias__Group__3 ;
    public final void rule__EffectAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:952:1: ( rule__EffectAlias__Group__2__Impl rule__EffectAlias__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:953:2: rule__EffectAlias__Group__2__Impl rule__EffectAlias__Group__3
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__2__Impl_in_rule__EffectAlias__Group__21903);
            rule__EffectAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectAlias__Group__3_in_rule__EffectAlias__Group__21906);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:960:1: rule__EffectAlias__Group__2__Impl : ( 'for' ) ;
    public final void rule__EffectAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:964:1: ( ( 'for' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:965:1: ( 'for' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:965:1: ( 'for' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:966:1: 'for'
            {
             before(grammarAccess.getEffectAliasAccess().getForKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__EffectAlias__Group__2__Impl1934); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:979:1: rule__EffectAlias__Group__3 : rule__EffectAlias__Group__3__Impl ;
    public final void rule__EffectAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:983:1: ( rule__EffectAlias__Group__3__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:984:2: rule__EffectAlias__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EffectAlias__Group__3__Impl_in_rule__EffectAlias__Group__31965);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:990:1: rule__EffectAlias__Group__3__Impl : ( ( rule__EffectAlias__EffectAssignment_3 ) ) ;
    public final void rule__EffectAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:994:1: ( ( ( rule__EffectAlias__EffectAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:995:1: ( ( rule__EffectAlias__EffectAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:995:1: ( ( rule__EffectAlias__EffectAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:996:1: ( rule__EffectAlias__EffectAssignment_3 )
            {
             before(grammarAccess.getEffectAliasAccess().getEffectAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:997:1: ( rule__EffectAlias__EffectAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:997:2: rule__EffectAlias__EffectAssignment_3
            {
            pushFollow(FOLLOW_rule__EffectAlias__EffectAssignment_3_in_rule__EffectAlias__Group__3__Impl1992);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1015:1: rule__IngredientDef__Group__0 : rule__IngredientDef__Group__0__Impl rule__IngredientDef__Group__1 ;
    public final void rule__IngredientDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1019:1: ( rule__IngredientDef__Group__0__Impl rule__IngredientDef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1020:2: rule__IngredientDef__Group__0__Impl rule__IngredientDef__Group__1
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__0__Impl_in_rule__IngredientDef__Group__02030);
            rule__IngredientDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__1_in_rule__IngredientDef__Group__02033);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1027:1: rule__IngredientDef__Group__0__Impl : ( 'ingredient' ) ;
    public final void rule__IngredientDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1031:1: ( ( 'ingredient' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1032:1: ( 'ingredient' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1032:1: ( 'ingredient' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1033:1: 'ingredient'
            {
             before(grammarAccess.getIngredientDefAccess().getIngredientKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__IngredientDef__Group__0__Impl2061); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1046:1: rule__IngredientDef__Group__1 : rule__IngredientDef__Group__1__Impl rule__IngredientDef__Group__2 ;
    public final void rule__IngredientDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1050:1: ( rule__IngredientDef__Group__1__Impl rule__IngredientDef__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1051:2: rule__IngredientDef__Group__1__Impl rule__IngredientDef__Group__2
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__1__Impl_in_rule__IngredientDef__Group__12092);
            rule__IngredientDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__2_in_rule__IngredientDef__Group__12095);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1058:1: rule__IngredientDef__Group__1__Impl : ( ( rule__IngredientDef__NameAssignment_1 ) ) ;
    public final void rule__IngredientDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1062:1: ( ( ( rule__IngredientDef__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1063:1: ( ( rule__IngredientDef__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1063:1: ( ( rule__IngredientDef__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1064:1: ( rule__IngredientDef__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientDefAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1065:1: ( rule__IngredientDef__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1065:2: rule__IngredientDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IngredientDef__NameAssignment_1_in_rule__IngredientDef__Group__1__Impl2122);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1075:1: rule__IngredientDef__Group__2 : rule__IngredientDef__Group__2__Impl rule__IngredientDef__Group__3 ;
    public final void rule__IngredientDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1079:1: ( rule__IngredientDef__Group__2__Impl rule__IngredientDef__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1080:2: rule__IngredientDef__Group__2__Impl rule__IngredientDef__Group__3
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__2__Impl_in_rule__IngredientDef__Group__22152);
            rule__IngredientDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__3_in_rule__IngredientDef__Group__22155);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1087:1: rule__IngredientDef__Group__2__Impl : ( '{' ) ;
    public final void rule__IngredientDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1091:1: ( ( '{' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1092:1: ( '{' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1092:1: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1093:1: '{'
            {
             before(grammarAccess.getIngredientDefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__IngredientDef__Group__2__Impl2183); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1106:1: rule__IngredientDef__Group__3 : rule__IngredientDef__Group__3__Impl rule__IngredientDef__Group__4 ;
    public final void rule__IngredientDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1110:1: ( rule__IngredientDef__Group__3__Impl rule__IngredientDef__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1111:2: rule__IngredientDef__Group__3__Impl rule__IngredientDef__Group__4
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__3__Impl_in_rule__IngredientDef__Group__32214);
            rule__IngredientDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__4_in_rule__IngredientDef__Group__32217);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1118:1: rule__IngredientDef__Group__3__Impl : ( ( rule__IngredientDef__EffectsAssignment_3 )* ) ;
    public final void rule__IngredientDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1122:1: ( ( ( rule__IngredientDef__EffectsAssignment_3 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1123:1: ( ( rule__IngredientDef__EffectsAssignment_3 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1123:1: ( ( rule__IngredientDef__EffectsAssignment_3 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1124:1: ( rule__IngredientDef__EffectsAssignment_3 )*
            {
             before(grammarAccess.getIngredientDefAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1125:1: ( rule__IngredientDef__EffectsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1125:2: rule__IngredientDef__EffectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__IngredientDef__EffectsAssignment_3_in_rule__IngredientDef__Group__3__Impl2244);
            	    rule__IngredientDef__EffectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1135:1: rule__IngredientDef__Group__4 : rule__IngredientDef__Group__4__Impl rule__IngredientDef__Group__5 ;
    public final void rule__IngredientDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1139:1: ( rule__IngredientDef__Group__4__Impl rule__IngredientDef__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1140:2: rule__IngredientDef__Group__4__Impl rule__IngredientDef__Group__5
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__4__Impl_in_rule__IngredientDef__Group__42275);
            rule__IngredientDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__5_in_rule__IngredientDef__Group__42278);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1147:1: rule__IngredientDef__Group__4__Impl : ( 'price:' ) ;
    public final void rule__IngredientDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1151:1: ( ( 'price:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1152:1: ( 'price:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1152:1: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1153:1: 'price:'
            {
             before(grammarAccess.getIngredientDefAccess().getPriceKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__IngredientDef__Group__4__Impl2306); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1166:1: rule__IngredientDef__Group__5 : rule__IngredientDef__Group__5__Impl rule__IngredientDef__Group__6 ;
    public final void rule__IngredientDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1170:1: ( rule__IngredientDef__Group__5__Impl rule__IngredientDef__Group__6 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1171:2: rule__IngredientDef__Group__5__Impl rule__IngredientDef__Group__6
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__5__Impl_in_rule__IngredientDef__Group__52337);
            rule__IngredientDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__6_in_rule__IngredientDef__Group__52340);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1178:1: rule__IngredientDef__Group__5__Impl : ( ( rule__IngredientDef__PriceAssignment_5 ) ) ;
    public final void rule__IngredientDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1182:1: ( ( ( rule__IngredientDef__PriceAssignment_5 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1183:1: ( ( rule__IngredientDef__PriceAssignment_5 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1183:1: ( ( rule__IngredientDef__PriceAssignment_5 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1184:1: ( rule__IngredientDef__PriceAssignment_5 )
            {
             before(grammarAccess.getIngredientDefAccess().getPriceAssignment_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1185:1: ( rule__IngredientDef__PriceAssignment_5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1185:2: rule__IngredientDef__PriceAssignment_5
            {
            pushFollow(FOLLOW_rule__IngredientDef__PriceAssignment_5_in_rule__IngredientDef__Group__5__Impl2367);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1195:1: rule__IngredientDef__Group__6 : rule__IngredientDef__Group__6__Impl rule__IngredientDef__Group__7 ;
    public final void rule__IngredientDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1199:1: ( rule__IngredientDef__Group__6__Impl rule__IngredientDef__Group__7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1200:2: rule__IngredientDef__Group__6__Impl rule__IngredientDef__Group__7
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__6__Impl_in_rule__IngredientDef__Group__62397);
            rule__IngredientDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__7_in_rule__IngredientDef__Group__62400);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1207:1: rule__IngredientDef__Group__6__Impl : ( 'weight:' ) ;
    public final void rule__IngredientDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1211:1: ( ( 'weight:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1212:1: ( 'weight:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1212:1: ( 'weight:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1213:1: 'weight:'
            {
             before(grammarAccess.getIngredientDefAccess().getWeightKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__IngredientDef__Group__6__Impl2428); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1226:1: rule__IngredientDef__Group__7 : rule__IngredientDef__Group__7__Impl rule__IngredientDef__Group__8 ;
    public final void rule__IngredientDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1230:1: ( rule__IngredientDef__Group__7__Impl rule__IngredientDef__Group__8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1231:2: rule__IngredientDef__Group__7__Impl rule__IngredientDef__Group__8
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__7__Impl_in_rule__IngredientDef__Group__72459);
            rule__IngredientDef__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__8_in_rule__IngredientDef__Group__72462);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1238:1: rule__IngredientDef__Group__7__Impl : ( ( rule__IngredientDef__WeightAssignment_7 ) ) ;
    public final void rule__IngredientDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1242:1: ( ( ( rule__IngredientDef__WeightAssignment_7 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1243:1: ( ( rule__IngredientDef__WeightAssignment_7 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1243:1: ( ( rule__IngredientDef__WeightAssignment_7 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1244:1: ( rule__IngredientDef__WeightAssignment_7 )
            {
             before(grammarAccess.getIngredientDefAccess().getWeightAssignment_7()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1245:1: ( rule__IngredientDef__WeightAssignment_7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1245:2: rule__IngredientDef__WeightAssignment_7
            {
            pushFollow(FOLLOW_rule__IngredientDef__WeightAssignment_7_in_rule__IngredientDef__Group__7__Impl2489);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1255:1: rule__IngredientDef__Group__8 : rule__IngredientDef__Group__8__Impl rule__IngredientDef__Group__9 ;
    public final void rule__IngredientDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1259:1: ( rule__IngredientDef__Group__8__Impl rule__IngredientDef__Group__9 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1260:2: rule__IngredientDef__Group__8__Impl rule__IngredientDef__Group__9
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__8__Impl_in_rule__IngredientDef__Group__82519);
            rule__IngredientDef__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group__9_in_rule__IngredientDef__Group__82522);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1267:1: rule__IngredientDef__Group__8__Impl : ( ( rule__IngredientDef__Group_8__0 )? ) ;
    public final void rule__IngredientDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1271:1: ( ( ( rule__IngredientDef__Group_8__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1272:1: ( ( rule__IngredientDef__Group_8__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1272:1: ( ( rule__IngredientDef__Group_8__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1273:1: ( rule__IngredientDef__Group_8__0 )?
            {
             before(grammarAccess.getIngredientDefAccess().getGroup_8()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1274:1: ( rule__IngredientDef__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1274:2: rule__IngredientDef__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__IngredientDef__Group_8__0_in_rule__IngredientDef__Group__8__Impl2549);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1284:1: rule__IngredientDef__Group__9 : rule__IngredientDef__Group__9__Impl ;
    public final void rule__IngredientDef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1288:1: ( rule__IngredientDef__Group__9__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1289:2: rule__IngredientDef__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group__9__Impl_in_rule__IngredientDef__Group__92580);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1295:1: rule__IngredientDef__Group__9__Impl : ( '}' ) ;
    public final void rule__IngredientDef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1299:1: ( ( '}' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1300:1: ( '}' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1300:1: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1301:1: '}'
            {
             before(grammarAccess.getIngredientDefAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_28_in_rule__IngredientDef__Group__9__Impl2608); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1334:1: rule__IngredientDef__Group_8__0 : rule__IngredientDef__Group_8__0__Impl rule__IngredientDef__Group_8__1 ;
    public final void rule__IngredientDef__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1338:1: ( rule__IngredientDef__Group_8__0__Impl rule__IngredientDef__Group_8__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1339:2: rule__IngredientDef__Group_8__0__Impl rule__IngredientDef__Group_8__1
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group_8__0__Impl_in_rule__IngredientDef__Group_8__02659);
            rule__IngredientDef__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientDef__Group_8__1_in_rule__IngredientDef__Group_8__02662);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1346:1: rule__IngredientDef__Group_8__0__Impl : ( 'source:' ) ;
    public final void rule__IngredientDef__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1350:1: ( ( 'source:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1351:1: ( 'source:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1351:1: ( 'source:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1352:1: 'source:'
            {
             before(grammarAccess.getIngredientDefAccess().getSourceKeyword_8_0()); 
            match(input,29,FOLLOW_29_in_rule__IngredientDef__Group_8__0__Impl2690); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1365:1: rule__IngredientDef__Group_8__1 : rule__IngredientDef__Group_8__1__Impl ;
    public final void rule__IngredientDef__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1369:1: ( rule__IngredientDef__Group_8__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1370:2: rule__IngredientDef__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__IngredientDef__Group_8__1__Impl_in_rule__IngredientDef__Group_8__12721);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1376:1: rule__IngredientDef__Group_8__1__Impl : ( ( rule__IngredientDef__SourceAssignment_8_1 ) ) ;
    public final void rule__IngredientDef__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1380:1: ( ( ( rule__IngredientDef__SourceAssignment_8_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1381:1: ( ( rule__IngredientDef__SourceAssignment_8_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1381:1: ( ( rule__IngredientDef__SourceAssignment_8_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1382:1: ( rule__IngredientDef__SourceAssignment_8_1 )
            {
             before(grammarAccess.getIngredientDefAccess().getSourceAssignment_8_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1383:1: ( rule__IngredientDef__SourceAssignment_8_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1383:2: rule__IngredientDef__SourceAssignment_8_1
            {
            pushFollow(FOLLOW_rule__IngredientDef__SourceAssignment_8_1_in_rule__IngredientDef__Group_8__1__Impl2748);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1397:1: rule__IngredientAlias__Group__0 : rule__IngredientAlias__Group__0__Impl rule__IngredientAlias__Group__1 ;
    public final void rule__IngredientAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1401:1: ( rule__IngredientAlias__Group__0__Impl rule__IngredientAlias__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1402:2: rule__IngredientAlias__Group__0__Impl rule__IngredientAlias__Group__1
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__0__Impl_in_rule__IngredientAlias__Group__02782);
            rule__IngredientAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientAlias__Group__1_in_rule__IngredientAlias__Group__02785);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1409:1: rule__IngredientAlias__Group__0__Impl : ( 'ialias' ) ;
    public final void rule__IngredientAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1413:1: ( ( 'ialias' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1414:1: ( 'ialias' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1414:1: ( 'ialias' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1415:1: 'ialias'
            {
             before(grammarAccess.getIngredientAliasAccess().getIaliasKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__IngredientAlias__Group__0__Impl2813); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1428:1: rule__IngredientAlias__Group__1 : rule__IngredientAlias__Group__1__Impl rule__IngredientAlias__Group__2 ;
    public final void rule__IngredientAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1432:1: ( rule__IngredientAlias__Group__1__Impl rule__IngredientAlias__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1433:2: rule__IngredientAlias__Group__1__Impl rule__IngredientAlias__Group__2
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__1__Impl_in_rule__IngredientAlias__Group__12844);
            rule__IngredientAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientAlias__Group__2_in_rule__IngredientAlias__Group__12847);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1440:1: rule__IngredientAlias__Group__1__Impl : ( ( rule__IngredientAlias__AliasAssignment_1 ) ) ;
    public final void rule__IngredientAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1444:1: ( ( ( rule__IngredientAlias__AliasAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1445:1: ( ( rule__IngredientAlias__AliasAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1445:1: ( ( rule__IngredientAlias__AliasAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1446:1: ( rule__IngredientAlias__AliasAssignment_1 )
            {
             before(grammarAccess.getIngredientAliasAccess().getAliasAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1447:1: ( rule__IngredientAlias__AliasAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1447:2: rule__IngredientAlias__AliasAssignment_1
            {
            pushFollow(FOLLOW_rule__IngredientAlias__AliasAssignment_1_in_rule__IngredientAlias__Group__1__Impl2874);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1457:1: rule__IngredientAlias__Group__2 : rule__IngredientAlias__Group__2__Impl rule__IngredientAlias__Group__3 ;
    public final void rule__IngredientAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1461:1: ( rule__IngredientAlias__Group__2__Impl rule__IngredientAlias__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1462:2: rule__IngredientAlias__Group__2__Impl rule__IngredientAlias__Group__3
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__2__Impl_in_rule__IngredientAlias__Group__22904);
            rule__IngredientAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IngredientAlias__Group__3_in_rule__IngredientAlias__Group__22907);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1469:1: rule__IngredientAlias__Group__2__Impl : ( 'for' ) ;
    public final void rule__IngredientAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1473:1: ( ( 'for' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1474:1: ( 'for' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1474:1: ( 'for' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1475:1: 'for'
            {
             before(grammarAccess.getIngredientAliasAccess().getForKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__IngredientAlias__Group__2__Impl2935); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1488:1: rule__IngredientAlias__Group__3 : rule__IngredientAlias__Group__3__Impl ;
    public final void rule__IngredientAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1492:1: ( rule__IngredientAlias__Group__3__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1493:2: rule__IngredientAlias__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IngredientAlias__Group__3__Impl_in_rule__IngredientAlias__Group__32966);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1499:1: rule__IngredientAlias__Group__3__Impl : ( ( rule__IngredientAlias__IngredientAssignment_3 ) ) ;
    public final void rule__IngredientAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1503:1: ( ( ( rule__IngredientAlias__IngredientAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1504:1: ( ( rule__IngredientAlias__IngredientAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1504:1: ( ( rule__IngredientAlias__IngredientAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1505:1: ( rule__IngredientAlias__IngredientAssignment_3 )
            {
             before(grammarAccess.getIngredientAliasAccess().getIngredientAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1506:1: ( rule__IngredientAlias__IngredientAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1506:2: rule__IngredientAlias__IngredientAssignment_3
            {
            pushFollow(FOLLOW_rule__IngredientAlias__IngredientAssignment_3_in_rule__IngredientAlias__Group__3__Impl2993);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1524:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1528:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1529:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__03031);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__03034);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1536:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__ToxicityAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1540:1: ( ( ( rule__Recipe__ToxicityAssignment_0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1541:1: ( ( rule__Recipe__ToxicityAssignment_0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1541:1: ( ( rule__Recipe__ToxicityAssignment_0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1542:1: ( rule__Recipe__ToxicityAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getToxicityAssignment_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1543:1: ( rule__Recipe__ToxicityAssignment_0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1543:2: rule__Recipe__ToxicityAssignment_0
            {
            pushFollow(FOLLOW_rule__Recipe__ToxicityAssignment_0_in_rule__Recipe__Group__0__Impl3061);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1553:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1557:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1558:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__13091);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__13094);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1565:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1569:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1570:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1570:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1571:1: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1572:1: ( rule__Recipe__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1572:2: rule__Recipe__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Recipe__NameAssignment_1_in_rule__Recipe__Group__1__Impl3121);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1582:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1586:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1587:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__23151);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__23154);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1594:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1598:1: ( ( '{' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1599:1: ( '{' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1599:1: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1600:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Recipe__Group__2__Impl3182); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1613:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1617:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1618:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__33213);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__33216);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1625:1: rule__Recipe__Group__3__Impl : ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1629:1: ( ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1630:1: ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1630:1: ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1631:1: ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1631:1: ( ( rule__Recipe__EffectsAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1632:1: ( rule__Recipe__EffectsAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1633:1: ( rule__Recipe__EffectsAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1633:2: rule__Recipe__EffectsAssignment_3
            {
            pushFollow(FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3245);
            rule__Recipe__EffectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 

            }

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1636:1: ( ( rule__Recipe__EffectsAssignment_3 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1637:1: ( rule__Recipe__EffectsAssignment_3 )*
            {
             before(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1638:1: ( rule__Recipe__EffectsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1638:2: rule__Recipe__EffectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3257);
            	    rule__Recipe__EffectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1649:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1653:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1654:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__43290);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__43293);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1661:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__Group_4__0 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1665:1: ( ( ( rule__Recipe__Group_4__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1666:1: ( ( rule__Recipe__Group_4__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1666:1: ( ( rule__Recipe__Group_4__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1667:1: ( rule__Recipe__Group_4__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_4()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1668:1: ( rule__Recipe__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1668:2: rule__Recipe__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl3320);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1678:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1682:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1683:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__53351);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__53354);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1690:1: rule__Recipe__Group__5__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1694:1: ( ( '}' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1695:1: ( '}' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1695:1: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1696:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Recipe__Group__5__Impl3382); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1709:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1713:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1714:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__63413);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__63416);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1721:1: rule__Recipe__Group__6__Impl : ( '=' ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1725:1: ( ( '=' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1726:1: ( '=' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1726:1: ( '=' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1727:1: '='
            {
             before(grammarAccess.getRecipeAccess().getEqualsSignKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__Recipe__Group__6__Impl3444); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1740:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1744:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1745:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__73475);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__73478);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1752:1: rule__Recipe__Group__7__Impl : ( ( rule__Recipe__IngredientsAssignment_7 ) ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1756:1: ( ( ( rule__Recipe__IngredientsAssignment_7 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1757:1: ( ( rule__Recipe__IngredientsAssignment_7 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1757:1: ( ( rule__Recipe__IngredientsAssignment_7 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1758:1: ( rule__Recipe__IngredientsAssignment_7 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_7()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1759:1: ( rule__Recipe__IngredientsAssignment_7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1759:2: rule__Recipe__IngredientsAssignment_7
            {
            pushFollow(FOLLOW_rule__Recipe__IngredientsAssignment_7_in_rule__Recipe__Group__7__Impl3505);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1769:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1773:1: ( rule__Recipe__Group__8__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1774:2: rule__Recipe__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__83535);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1780:1: rule__Recipe__Group__8__Impl : ( ( rule__Recipe__Group_8__0 )* ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1784:1: ( ( ( rule__Recipe__Group_8__0 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1785:1: ( ( rule__Recipe__Group_8__0 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1785:1: ( ( rule__Recipe__Group_8__0 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1786:1: ( rule__Recipe__Group_8__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_8()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1787:1: ( rule__Recipe__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1787:2: rule__Recipe__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Recipe__Group_8__0_in_rule__Recipe__Group__8__Impl3562);
            	    rule__Recipe__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1815:1: rule__Recipe__Group_4__0 : rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 ;
    public final void rule__Recipe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1819:1: ( rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1820:2: rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__03611);
            rule__Recipe__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__03614);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1827:1: rule__Recipe__Group_4__0__Impl : ( 'price:' ) ;
    public final void rule__Recipe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1831:1: ( ( 'price:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1832:1: ( 'price:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1832:1: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1833:1: 'price:'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Recipe__Group_4__0__Impl3642); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1846:1: rule__Recipe__Group_4__1 : rule__Recipe__Group_4__1__Impl ;
    public final void rule__Recipe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1850:1: ( rule__Recipe__Group_4__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1851:2: rule__Recipe__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__13673);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1857:1: rule__Recipe__Group_4__1__Impl : ( ( rule__Recipe__PriceAssignment_4_1 ) ) ;
    public final void rule__Recipe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1861:1: ( ( ( rule__Recipe__PriceAssignment_4_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1862:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1862:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1863:1: ( rule__Recipe__PriceAssignment_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_4_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1864:1: ( rule__Recipe__PriceAssignment_4_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1864:2: rule__Recipe__PriceAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl3700);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1878:1: rule__Recipe__Group_8__0 : rule__Recipe__Group_8__0__Impl rule__Recipe__Group_8__1 ;
    public final void rule__Recipe__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1882:1: ( rule__Recipe__Group_8__0__Impl rule__Recipe__Group_8__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1883:2: rule__Recipe__Group_8__0__Impl rule__Recipe__Group_8__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group_8__0__Impl_in_rule__Recipe__Group_8__03734);
            rule__Recipe__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group_8__1_in_rule__Recipe__Group_8__03737);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1890:1: rule__Recipe__Group_8__0__Impl : ( '+' ) ;
    public final void rule__Recipe__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1894:1: ( ( '+' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1895:1: ( '+' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1895:1: ( '+' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1896:1: '+'
            {
             before(grammarAccess.getRecipeAccess().getPlusSignKeyword_8_0()); 
            match(input,12,FOLLOW_12_in_rule__Recipe__Group_8__0__Impl3765); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1909:1: rule__Recipe__Group_8__1 : rule__Recipe__Group_8__1__Impl ;
    public final void rule__Recipe__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1913:1: ( rule__Recipe__Group_8__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1914:2: rule__Recipe__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group_8__1__Impl_in_rule__Recipe__Group_8__13796);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1920:1: rule__Recipe__Group_8__1__Impl : ( ( rule__Recipe__IngredientsAssignment_8_1 ) ) ;
    public final void rule__Recipe__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1924:1: ( ( ( rule__Recipe__IngredientsAssignment_8_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1925:1: ( ( rule__Recipe__IngredientsAssignment_8_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1925:1: ( ( rule__Recipe__IngredientsAssignment_8_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1926:1: ( rule__Recipe__IngredientsAssignment_8_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_8_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1927:1: ( rule__Recipe__IngredientsAssignment_8_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1927:2: rule__Recipe__IngredientsAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Recipe__IngredientsAssignment_8_1_in_rule__Recipe__Group_8__1__Impl3823);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1942:1: rule__AlchemyLabModel__EffectsAssignment_0 : ( ruleEffect ) ;
    public final void rule__AlchemyLabModel__EffectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1946:1: ( ( ruleEffect ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1947:1: ( ruleEffect )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1947:1: ( ruleEffect )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1948:1: ruleEffect
            {
             before(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEffect_in_rule__AlchemyLabModel__EffectsAssignment_03862);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1957:1: rule__AlchemyLabModel__IngredientsAssignment_1 : ( ruleIngredient ) ;
    public final void rule__AlchemyLabModel__IngredientsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1961:1: ( ( ruleIngredient ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1962:1: ( ruleIngredient )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1962:1: ( ruleIngredient )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1963:1: ruleIngredient
            {
             before(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIngredient_in_rule__AlchemyLabModel__IngredientsAssignment_13893);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1972:1: rule__AlchemyLabModel__RecipesAssignment_2 : ( ruleRecipe ) ;
    public final void rule__AlchemyLabModel__RecipesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1976:1: ( ( ruleRecipe ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1977:1: ( ruleRecipe )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1977:1: ( ruleRecipe )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1978:1: ruleRecipe
            {
             before(grammarAccess.getAlchemyLabModelAccess().getRecipesRecipeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecipe_in_rule__AlchemyLabModel__RecipesAssignment_23924);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1987:1: rule__EffectDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1991:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1992:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1992:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1993:1: RULE_ID
            {
             before(grammarAccess.getEffectDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectDef__NameAssignment_13955); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2002:1: rule__EffectDef__TypeAssignment_3 : ( ruleEffectType ) ;
    public final void rule__EffectDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2006:1: ( ( ruleEffectType ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2007:1: ( ruleEffectType )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2007:1: ( ruleEffectType )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2008:1: ruleEffectType
            {
             before(grammarAccess.getEffectDefAccess().getTypeEffectTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectType_in_rule__EffectDef__TypeAssignment_33986);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2017:1: rule__EffectDef__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__EffectDef__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2021:1: ( ( RULE_STRING ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2022:1: ( RULE_STRING )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2022:1: ( RULE_STRING )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2023:1: RULE_STRING
            {
             before(grammarAccess.getEffectDefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EffectDef__DescriptionAssignment_5_14017); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2032:1: rule__EffectRef__EffectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectRef__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2036:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2037:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2037:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2038:1: ( RULE_ID )
            {
             before(grammarAccess.getEffectRefAccess().getEffectEffectCrossReference_1_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2039:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2040:1: RULE_ID
            {
             before(grammarAccess.getEffectRefAccess().getEffectEffectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectRef__EffectAssignment_14052); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2051:1: rule__EffectAlias__AliasAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectAlias__AliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2055:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2056:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2056:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2057:1: RULE_ID
            {
             before(grammarAccess.getEffectAliasAccess().getAliasIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectAlias__AliasAssignment_14087); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2066:1: rule__EffectAlias__EffectAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__EffectAlias__EffectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2070:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2071:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2071:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2072:1: ( RULE_ID )
            {
             before(grammarAccess.getEffectAliasAccess().getEffectEffectCrossReference_3_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2073:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2074:1: RULE_ID
            {
             before(grammarAccess.getEffectAliasAccess().getEffectEffectIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectAlias__EffectAssignment_34122); 
             after(grammarAccess.getEffectAliasAccess().getEffectEffectIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEffectAliasAccess().getEffectEffectCrossReference_3_0()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2085:1: rule__IngredientDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IngredientDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2089:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2090:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2090:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2091:1: RULE_ID
            {
             before(grammarAccess.getIngredientDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientDef__NameAssignment_14157); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2100:1: rule__IngredientDef__EffectsAssignment_3 : ( ruleEffectRef ) ;
    public final void rule__IngredientDef__EffectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2104:1: ( ( ruleEffectRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2105:1: ( ruleEffectRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2105:1: ( ruleEffectRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2106:1: ruleEffectRef
            {
             before(grammarAccess.getIngredientDefAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectRef_in_rule__IngredientDef__EffectsAssignment_34188);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2115:1: rule__IngredientDef__PriceAssignment_5 : ( RULE_NUMBER ) ;
    public final void rule__IngredientDef__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2119:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2120:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2120:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2121:1: RULE_NUMBER
            {
             before(grammarAccess.getIngredientDefAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__IngredientDef__PriceAssignment_54219); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2130:1: rule__IngredientDef__WeightAssignment_7 : ( RULE_NUMBER ) ;
    public final void rule__IngredientDef__WeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2134:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2135:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2135:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2136:1: RULE_NUMBER
            {
             before(grammarAccess.getIngredientDefAccess().getWeightNUMBERTerminalRuleCall_7_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__IngredientDef__WeightAssignment_74250); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2145:1: rule__IngredientDef__SourceAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__IngredientDef__SourceAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2149:1: ( ( RULE_STRING ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2150:1: ( RULE_STRING )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2150:1: ( RULE_STRING )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2151:1: RULE_STRING
            {
             before(grammarAccess.getIngredientDefAccess().getSourceSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IngredientDef__SourceAssignment_8_14281); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2160:1: rule__IngredientRef__IngredientAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IngredientRef__IngredientAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2164:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2165:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2165:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2166:1: ( RULE_ID )
            {
             before(grammarAccess.getIngredientRefAccess().getIngredientIngredientCrossReference_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2167:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2168:1: RULE_ID
            {
             before(grammarAccess.getIngredientRefAccess().getIngredientIngredientIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientRef__IngredientAssignment4316); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2179:1: rule__IngredientAlias__AliasAssignment_1 : ( RULE_ID ) ;
    public final void rule__IngredientAlias__AliasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2183:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2184:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2184:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2185:1: RULE_ID
            {
             before(grammarAccess.getIngredientAliasAccess().getAliasIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientAlias__AliasAssignment_14351); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2194:1: rule__IngredientAlias__IngredientAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__IngredientAlias__IngredientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2198:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2199:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2199:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2200:1: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAliasAccess().getIngredientIngredientCrossReference_3_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2201:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2202:1: RULE_ID
            {
             before(grammarAccess.getIngredientAliasAccess().getIngredientIngredientIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IngredientAlias__IngredientAssignment_34386); 
             after(grammarAccess.getIngredientAliasAccess().getIngredientIngredientIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIngredientAliasAccess().getIngredientIngredientCrossReference_3_0()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2213:1: rule__Recipe__ToxicityAssignment_0 : ( ruleToxicity ) ;
    public final void rule__Recipe__ToxicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2217:1: ( ( ruleToxicity ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2218:1: ( ruleToxicity )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2218:1: ( ruleToxicity )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2219:1: ruleToxicity
            {
             before(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleToxicity_in_rule__Recipe__ToxicityAssignment_04421);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2228:1: rule__Recipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2232:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2233:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2233:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2234:1: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recipe__NameAssignment_14452); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2243:1: rule__Recipe__EffectsAssignment_3 : ( ruleEffectRef ) ;
    public final void rule__Recipe__EffectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2247:1: ( ( ruleEffectRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2248:1: ( ruleEffectRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2248:1: ( ruleEffectRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2249:1: ruleEffectRef
            {
             before(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectRef_in_rule__Recipe__EffectsAssignment_34483);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2258:1: rule__Recipe__PriceAssignment_4_1 : ( RULE_NUMBER ) ;
    public final void rule__Recipe__PriceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2262:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2263:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2263:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2264:1: RULE_NUMBER
            {
             before(grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_4_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Recipe__PriceAssignment_4_14514); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2273:1: rule__Recipe__IngredientsAssignment_7 : ( ruleIngredientRef ) ;
    public final void rule__Recipe__IngredientsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2277:1: ( ( ruleIngredientRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2278:1: ( ruleIngredientRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2278:1: ( ruleIngredientRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2279:1: ruleIngredientRef
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_74545);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2288:1: rule__Recipe__IngredientsAssignment_8_1 : ( ruleIngredientRef ) ;
    public final void rule__Recipe__IngredientsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2292:1: ( ( ruleIngredientRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2293:1: ( ruleIngredientRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2293:1: ( ruleIngredientRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2294:1: ruleIngredientRef
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_8_14576);
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
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Alternatives_in_ruleEffect154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_entryRuleEffectDef181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectDef188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__0_in_ruleEffectDef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_entryRuleEffectRef241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRef248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__0_in_ruleEffectRef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectAlias308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__0_in_ruleEffectAlias334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredient368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Alternatives_in_ruleIngredient394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientDef428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__0_in_ruleIngredientDef454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientRef488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientRef__IngredientAssignment_in_ruleIngredientRef514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientAlias548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__0_in_ruleIngredientAlias574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipe608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__0_in_ruleRecipe634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectType__Alternatives_in_ruleEffectType671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Toxicity__Alternatives_in_ruleToxicity707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_rule__Effect__Alternatives742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectAlias_in_rule__Effect__Alternatives759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_rule__Ingredient__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientAlias_in_rule__Ingredient__Alternatives808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EffectType__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EffectType__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Toxicity__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Toxicity__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Toxicity__Alternatives940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__0__Impl_in_rule__AlchemyLabModel__Group__0973 = new BitSet(new long[]{0x000000004101C000L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__1_in_rule__AlchemyLabModel__Group__0976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__EffectsAssignment_0_in_rule__AlchemyLabModel__Group__0__Impl1003 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__1__Impl_in_rule__AlchemyLabModel__Group__11034 = new BitSet(new long[]{0x000000004101C000L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__2_in_rule__AlchemyLabModel__Group__11037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__IngredientsAssignment_1_in_rule__AlchemyLabModel__Group__1__Impl1064 = new BitSet(new long[]{0x0000000041000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__2__Impl_in_rule__AlchemyLabModel__Group__21095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__RecipesAssignment_2_in_rule__AlchemyLabModel__Group__2__Impl1122 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__0__Impl_in_rule__EffectDef__Group__01159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__1_in_rule__EffectDef__Group__01162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EffectDef__Group__0__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__1__Impl_in_rule__EffectDef__Group__11221 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__2_in_rule__EffectDef__Group__11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__NameAssignment_1_in_rule__EffectDef__Group__1__Impl1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__2__Impl_in_rule__EffectDef__Group__21281 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__3_in_rule__EffectDef__Group__21284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EffectDef__Group__2__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__3__Impl_in_rule__EffectDef__Group__31343 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__4_in_rule__EffectDef__Group__31346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__TypeAssignment_3_in_rule__EffectDef__Group__3__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__4__Impl_in_rule__EffectDef__Group__41403 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__5_in_rule__EffectDef__Group__41406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EffectDef__Group__4__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group__5__Impl_in_rule__EffectDef__Group__51465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__0_in_rule__EffectDef__Group__5__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__0__Impl_in_rule__EffectDef__Group_5__01535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__1_in_rule__EffectDef__Group_5__01538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EffectDef__Group_5__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__Group_5__1__Impl_in_rule__EffectDef__Group_5__11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectDef__DescriptionAssignment_5_1_in_rule__EffectDef__Group_5__1__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__0__Impl_in_rule__EffectRef__Group__01658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__1_in_rule__EffectRef__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EffectRef__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__1__Impl_in_rule__EffectRef__Group__11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__EffectAssignment_1_in_rule__EffectRef__Group__1__Impl1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__0__Impl_in_rule__EffectAlias__Group__01781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__1_in_rule__EffectAlias__Group__01784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EffectAlias__Group__0__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__1__Impl_in_rule__EffectAlias__Group__11843 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__2_in_rule__EffectAlias__Group__11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__AliasAssignment_1_in_rule__EffectAlias__Group__1__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__2__Impl_in_rule__EffectAlias__Group__21903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__3_in_rule__EffectAlias__Group__21906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EffectAlias__Group__2__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__Group__3__Impl_in_rule__EffectAlias__Group__31965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectAlias__EffectAssignment_3_in_rule__EffectAlias__Group__3__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__0__Impl_in_rule__IngredientDef__Group__02030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__1_in_rule__IngredientDef__Group__02033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IngredientDef__Group__0__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__1__Impl_in_rule__IngredientDef__Group__12092 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__2_in_rule__IngredientDef__Group__12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__NameAssignment_1_in_rule__IngredientDef__Group__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__2__Impl_in_rule__IngredientDef__Group__22152 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__3_in_rule__IngredientDef__Group__22155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IngredientDef__Group__2__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__3__Impl_in_rule__IngredientDef__Group__32214 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__4_in_rule__IngredientDef__Group__32217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__EffectsAssignment_3_in_rule__IngredientDef__Group__3__Impl2244 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__4__Impl_in_rule__IngredientDef__Group__42275 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__5_in_rule__IngredientDef__Group__42278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IngredientDef__Group__4__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__5__Impl_in_rule__IngredientDef__Group__52337 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__6_in_rule__IngredientDef__Group__52340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__PriceAssignment_5_in_rule__IngredientDef__Group__5__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__6__Impl_in_rule__IngredientDef__Group__62397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__7_in_rule__IngredientDef__Group__62400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IngredientDef__Group__6__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__7__Impl_in_rule__IngredientDef__Group__72459 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__8_in_rule__IngredientDef__Group__72462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__WeightAssignment_7_in_rule__IngredientDef__Group__7__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__8__Impl_in_rule__IngredientDef__Group__82519 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__9_in_rule__IngredientDef__Group__82522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__0_in_rule__IngredientDef__Group__8__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group__9__Impl_in_rule__IngredientDef__Group__92580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IngredientDef__Group__9__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__0__Impl_in_rule__IngredientDef__Group_8__02659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__1_in_rule__IngredientDef__Group_8__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__IngredientDef__Group_8__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__Group_8__1__Impl_in_rule__IngredientDef__Group_8__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientDef__SourceAssignment_8_1_in_rule__IngredientDef__Group_8__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__0__Impl_in_rule__IngredientAlias__Group__02782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__1_in_rule__IngredientAlias__Group__02785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IngredientAlias__Group__0__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__1__Impl_in_rule__IngredientAlias__Group__12844 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__2_in_rule__IngredientAlias__Group__12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__AliasAssignment_1_in_rule__IngredientAlias__Group__1__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__2__Impl_in_rule__IngredientAlias__Group__22904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__3_in_rule__IngredientAlias__Group__22907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IngredientAlias__Group__2__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__Group__3__Impl_in_rule__IngredientAlias__Group__32966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IngredientAlias__IngredientAssignment_3_in_rule__IngredientAlias__Group__3__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__03031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__03034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__ToxicityAssignment_0_in_rule__Recipe__Group__0__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__13091 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__NameAssignment_1_in_rule__Recipe__Group__1__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__23151 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__23154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Recipe__Group__2__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__33213 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__33216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3245 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl3257 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__43290 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__43293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__53351 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__53354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Recipe__Group__5__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__63413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__63416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Recipe__Group__6__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__73475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__73478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_7_in_rule__Recipe__Group__7__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__83535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__0_in_rule__Recipe__Group__8__Impl3562 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__03611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__03614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Recipe__Group_4__0__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__13673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__0__Impl_in_rule__Recipe__Group_8__03734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__1_in_rule__Recipe__Group_8__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Recipe__Group_8__0__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_8__1__Impl_in_rule__Recipe__Group_8__13796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_8_1_in_rule__Recipe__Group_8__1__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__AlchemyLabModel__EffectsAssignment_03862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredient_in_rule__AlchemyLabModel__IngredientsAssignment_13893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_rule__AlchemyLabModel__RecipesAssignment_23924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectDef__NameAssignment_13955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectType_in_rule__EffectDef__TypeAssignment_33986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EffectDef__DescriptionAssignment_5_14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectRef__EffectAssignment_14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectAlias__AliasAssignment_14087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectAlias__EffectAssignment_34122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientDef__NameAssignment_14157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_rule__IngredientDef__EffectsAssignment_34188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__IngredientDef__PriceAssignment_54219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__IngredientDef__WeightAssignment_74250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IngredientDef__SourceAssignment_8_14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientRef__IngredientAssignment4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientAlias__AliasAssignment_14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IngredientAlias__IngredientAssignment_34386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToxicity_in_rule__Recipe__ToxicityAssignment_04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recipe__NameAssignment_14452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_rule__Recipe__EffectsAssignment_34483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Recipe__PriceAssignment_4_14514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_74545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_rule__Recipe__IngredientsAssignment_8_14576 = new BitSet(new long[]{0x0000000000000002L});

}