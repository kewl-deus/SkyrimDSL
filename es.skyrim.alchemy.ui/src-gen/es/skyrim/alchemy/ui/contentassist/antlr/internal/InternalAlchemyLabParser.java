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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'potion'", "'poison'", "'ingredient'", "'{'", "'price:'", "'weight:'", "'source:'", "'}'", "'effect'", "'('", "')'", "':'", "'->'", "'='"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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


    // $ANTLR start "entryRuleIngredient"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:88:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:89:1: ( ruleIngredient EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:90:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_ruleIngredient_in_entryRuleIngredient121);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredient128); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:97:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:101:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:102:1: ( ( rule__Ingredient__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:102:1: ( ( rule__Ingredient__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:103:1: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:104:1: ( rule__Ingredient__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:104:2: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__0_in_ruleIngredient154);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEffect"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:116:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:117:1: ( ruleEffect EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:118:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect181);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect188); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:125:1: ruleEffect : ( ( rule__Effect__Group__0 ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:129:2: ( ( ( rule__Effect__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:130:1: ( ( rule__Effect__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:130:1: ( ( rule__Effect__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:131:1: ( rule__Effect__Group__0 )
            {
             before(grammarAccess.getEffectAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:132:1: ( rule__Effect__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:132:2: rule__Effect__Group__0
            {
            pushFollow(FOLLOW_rule__Effect__Group__0_in_ruleEffect214);
            rule__Effect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRecipe"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:172:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:173:1: ( ruleRecipe EOF )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:174:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_ruleRecipe_in_entryRuleRecipe301);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipe308); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:181:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:185:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:186:1: ( ( rule__Recipe__Group__0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:186:1: ( ( rule__Recipe__Group__0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:187:1: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:188:1: ( rule__Recipe__Group__0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:188:2: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_rule__Recipe__Group__0_in_ruleRecipe334);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:201:1: ruleEffectType : ( ( rule__EffectType__Alternatives ) ) ;
    public final void ruleEffectType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:205:1: ( ( ( rule__EffectType__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:206:1: ( ( rule__EffectType__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:206:1: ( ( rule__EffectType__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:207:1: ( rule__EffectType__Alternatives )
            {
             before(grammarAccess.getEffectTypeAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:208:1: ( rule__EffectType__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:208:2: rule__EffectType__Alternatives
            {
            pushFollow(FOLLOW_rule__EffectType__Alternatives_in_ruleEffectType371);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:220:1: ruleToxicity : ( ( rule__Toxicity__Alternatives ) ) ;
    public final void ruleToxicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:224:1: ( ( ( rule__Toxicity__Alternatives ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:225:1: ( ( rule__Toxicity__Alternatives ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:225:1: ( ( rule__Toxicity__Alternatives ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:226:1: ( rule__Toxicity__Alternatives )
            {
             before(grammarAccess.getToxicityAccess().getAlternatives()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:227:1: ( rule__Toxicity__Alternatives )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:227:2: rule__Toxicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Toxicity__Alternatives_in_ruleToxicity407);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:238:1: rule__EffectType__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__EffectType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:242:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:243:1: ( ( '+' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:243:1: ( ( '+' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:244:1: ( '+' )
                    {
                     before(grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:245:1: ( '+' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:245:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__EffectType__Alternatives443); 

                    }

                     after(grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:250:6: ( ( '-' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:250:6: ( ( '-' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:251:1: ( '-' )
                    {
                     before(grammarAccess.getEffectTypeAccess().getWEAKENEnumLiteralDeclaration_1()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:252:1: ( '-' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:252:3: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__EffectType__Alternatives464); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:262:1: rule__Toxicity__Alternatives : ( ( ( 'potion' ) ) | ( ( 'poison' ) ) );
    public final void rule__Toxicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:266:1: ( ( ( 'potion' ) ) | ( ( 'poison' ) ) )
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
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:267:1: ( ( 'potion' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:267:1: ( ( 'potion' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:268:1: ( 'potion' )
                    {
                     before(grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:269:1: ( 'potion' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:269:3: 'potion'
                    {
                    match(input,14,FOLLOW_14_in_rule__Toxicity__Alternatives500); 

                    }

                     after(grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:274:6: ( ( 'poison' ) )
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:274:6: ( ( 'poison' ) )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:275:1: ( 'poison' )
                    {
                     before(grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:276:1: ( 'poison' )
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:276:3: 'poison'
                    {
                    match(input,15,FOLLOW_15_in_rule__Toxicity__Alternatives521); 

                    }

                     after(grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 

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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:288:1: rule__AlchemyLabModel__Group__0 : rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1 ;
    public final void rule__AlchemyLabModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:292:1: ( rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:293:2: rule__AlchemyLabModel__Group__0__Impl rule__AlchemyLabModel__Group__1
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__0__Impl_in_rule__AlchemyLabModel__Group__0554);
            rule__AlchemyLabModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__1_in_rule__AlchemyLabModel__Group__0557);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:300:1: rule__AlchemyLabModel__Group__0__Impl : ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* ) ;
    public final void rule__AlchemyLabModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:304:1: ( ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:305:1: ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:305:1: ( ( rule__AlchemyLabModel__EffectsAssignment_0 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:306:1: ( rule__AlchemyLabModel__EffectsAssignment_0 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getEffectsAssignment_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:307:1: ( rule__AlchemyLabModel__EffectsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:307:2: rule__AlchemyLabModel__EffectsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__EffectsAssignment_0_in_rule__AlchemyLabModel__Group__0__Impl584);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:317:1: rule__AlchemyLabModel__Group__1 : rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2 ;
    public final void rule__AlchemyLabModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:321:1: ( rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:322:2: rule__AlchemyLabModel__Group__1__Impl rule__AlchemyLabModel__Group__2
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__1__Impl_in_rule__AlchemyLabModel__Group__1615);
            rule__AlchemyLabModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__2_in_rule__AlchemyLabModel__Group__1618);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:329:1: rule__AlchemyLabModel__Group__1__Impl : ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* ) ;
    public final void rule__AlchemyLabModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:333:1: ( ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:334:1: ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:334:1: ( ( rule__AlchemyLabModel__IngredientsAssignment_1 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:335:1: ( rule__AlchemyLabModel__IngredientsAssignment_1 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getIngredientsAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:336:1: ( rule__AlchemyLabModel__IngredientsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:336:2: rule__AlchemyLabModel__IngredientsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__IngredientsAssignment_1_in_rule__AlchemyLabModel__Group__1__Impl645);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:346:1: rule__AlchemyLabModel__Group__2 : rule__AlchemyLabModel__Group__2__Impl ;
    public final void rule__AlchemyLabModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:350:1: ( rule__AlchemyLabModel__Group__2__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:351:2: rule__AlchemyLabModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AlchemyLabModel__Group__2__Impl_in_rule__AlchemyLabModel__Group__2676);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:357:1: rule__AlchemyLabModel__Group__2__Impl : ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* ) ;
    public final void rule__AlchemyLabModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:361:1: ( ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:362:1: ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:362:1: ( ( rule__AlchemyLabModel__RecipesAssignment_2 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:363:1: ( rule__AlchemyLabModel__RecipesAssignment_2 )*
            {
             before(grammarAccess.getAlchemyLabModelAccess().getRecipesAssignment_2()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:364:1: ( rule__AlchemyLabModel__RecipesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=14 && LA5_0<=15)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:364:2: rule__AlchemyLabModel__RecipesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AlchemyLabModel__RecipesAssignment_2_in_rule__AlchemyLabModel__Group__2__Impl703);
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


    // $ANTLR start "rule__Ingredient__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:380:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:384:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:385:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__0740);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__0743);
            rule__Ingredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:392:1: rule__Ingredient__Group__0__Impl : ( 'ingredient' ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:396:1: ( ( 'ingredient' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:397:1: ( 'ingredient' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:397:1: ( 'ingredient' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:398:1: 'ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Ingredient__Group__0__Impl771); 
             after(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:411:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:415:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:416:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__1802);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__1805);
            rule__Ingredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:423:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__NameAssignment_1 ) ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:427:1: ( ( ( rule__Ingredient__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:428:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:428:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:429:1: ( rule__Ingredient__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:430:1: ( rule__Ingredient__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:430:2: rule__Ingredient__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Ingredient__NameAssignment_1_in_rule__Ingredient__Group__1__Impl832);
            rule__Ingredient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:440:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:444:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:445:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__2862);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__2865);
            rule__Ingredient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:452:1: rule__Ingredient__Group__2__Impl : ( '{' ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:456:1: ( ( '{' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:457:1: ( '{' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:457:1: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:458:1: '{'
            {
             before(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Ingredient__Group__2__Impl893); 
             after(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Ingredient__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:471:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:475:1: ( rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:476:2: rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__3924);
            rule__Ingredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__4_in_rule__Ingredient__Group__3927);
            rule__Ingredient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3"


    // $ANTLR start "rule__Ingredient__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:483:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__EffectsAssignment_3 )* ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:487:1: ( ( ( rule__Ingredient__EffectsAssignment_3 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:488:1: ( ( rule__Ingredient__EffectsAssignment_3 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:488:1: ( ( rule__Ingredient__EffectsAssignment_3 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:489:1: ( rule__Ingredient__EffectsAssignment_3 )*
            {
             before(grammarAccess.getIngredientAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:490:1: ( rule__Ingredient__EffectsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:490:2: rule__Ingredient__EffectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Ingredient__EffectsAssignment_3_in_rule__Ingredient__Group__3__Impl954);
            	    rule__Ingredient__EffectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getIngredientAccess().getEffectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3__Impl"


    // $ANTLR start "rule__Ingredient__Group__4"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:500:1: rule__Ingredient__Group__4 : rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 ;
    public final void rule__Ingredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:504:1: ( rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:505:2: rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__4__Impl_in_rule__Ingredient__Group__4985);
            rule__Ingredient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__5_in_rule__Ingredient__Group__4988);
            rule__Ingredient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__4"


    // $ANTLR start "rule__Ingredient__Group__4__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:512:1: rule__Ingredient__Group__4__Impl : ( 'price:' ) ;
    public final void rule__Ingredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:516:1: ( ( 'price:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:517:1: ( 'price:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:517:1: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:518:1: 'price:'
            {
             before(grammarAccess.getIngredientAccess().getPriceKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Ingredient__Group__4__Impl1016); 
             after(grammarAccess.getIngredientAccess().getPriceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__4__Impl"


    // $ANTLR start "rule__Ingredient__Group__5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:531:1: rule__Ingredient__Group__5 : rule__Ingredient__Group__5__Impl rule__Ingredient__Group__6 ;
    public final void rule__Ingredient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:535:1: ( rule__Ingredient__Group__5__Impl rule__Ingredient__Group__6 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:536:2: rule__Ingredient__Group__5__Impl rule__Ingredient__Group__6
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__5__Impl_in_rule__Ingredient__Group__51047);
            rule__Ingredient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__6_in_rule__Ingredient__Group__51050);
            rule__Ingredient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__5"


    // $ANTLR start "rule__Ingredient__Group__5__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:543:1: rule__Ingredient__Group__5__Impl : ( ( rule__Ingredient__PriceAssignment_5 ) ) ;
    public final void rule__Ingredient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:547:1: ( ( ( rule__Ingredient__PriceAssignment_5 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:548:1: ( ( rule__Ingredient__PriceAssignment_5 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:548:1: ( ( rule__Ingredient__PriceAssignment_5 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:549:1: ( rule__Ingredient__PriceAssignment_5 )
            {
             before(grammarAccess.getIngredientAccess().getPriceAssignment_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:550:1: ( rule__Ingredient__PriceAssignment_5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:550:2: rule__Ingredient__PriceAssignment_5
            {
            pushFollow(FOLLOW_rule__Ingredient__PriceAssignment_5_in_rule__Ingredient__Group__5__Impl1077);
            rule__Ingredient__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__5__Impl"


    // $ANTLR start "rule__Ingredient__Group__6"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:560:1: rule__Ingredient__Group__6 : rule__Ingredient__Group__6__Impl rule__Ingredient__Group__7 ;
    public final void rule__Ingredient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:564:1: ( rule__Ingredient__Group__6__Impl rule__Ingredient__Group__7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:565:2: rule__Ingredient__Group__6__Impl rule__Ingredient__Group__7
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__6__Impl_in_rule__Ingredient__Group__61107);
            rule__Ingredient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__7_in_rule__Ingredient__Group__61110);
            rule__Ingredient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__6"


    // $ANTLR start "rule__Ingredient__Group__6__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:572:1: rule__Ingredient__Group__6__Impl : ( 'weight:' ) ;
    public final void rule__Ingredient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:576:1: ( ( 'weight:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:577:1: ( 'weight:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:577:1: ( 'weight:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:578:1: 'weight:'
            {
             before(grammarAccess.getIngredientAccess().getWeightKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Ingredient__Group__6__Impl1138); 
             after(grammarAccess.getIngredientAccess().getWeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__6__Impl"


    // $ANTLR start "rule__Ingredient__Group__7"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:591:1: rule__Ingredient__Group__7 : rule__Ingredient__Group__7__Impl rule__Ingredient__Group__8 ;
    public final void rule__Ingredient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:595:1: ( rule__Ingredient__Group__7__Impl rule__Ingredient__Group__8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:596:2: rule__Ingredient__Group__7__Impl rule__Ingredient__Group__8
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__7__Impl_in_rule__Ingredient__Group__71169);
            rule__Ingredient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__8_in_rule__Ingredient__Group__71172);
            rule__Ingredient__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__7"


    // $ANTLR start "rule__Ingredient__Group__7__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:603:1: rule__Ingredient__Group__7__Impl : ( ( rule__Ingredient__WeightAssignment_7 ) ) ;
    public final void rule__Ingredient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:607:1: ( ( ( rule__Ingredient__WeightAssignment_7 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:608:1: ( ( rule__Ingredient__WeightAssignment_7 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:608:1: ( ( rule__Ingredient__WeightAssignment_7 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:609:1: ( rule__Ingredient__WeightAssignment_7 )
            {
             before(grammarAccess.getIngredientAccess().getWeightAssignment_7()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:610:1: ( rule__Ingredient__WeightAssignment_7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:610:2: rule__Ingredient__WeightAssignment_7
            {
            pushFollow(FOLLOW_rule__Ingredient__WeightAssignment_7_in_rule__Ingredient__Group__7__Impl1199);
            rule__Ingredient__WeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getWeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__7__Impl"


    // $ANTLR start "rule__Ingredient__Group__8"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:620:1: rule__Ingredient__Group__8 : rule__Ingredient__Group__8__Impl rule__Ingredient__Group__9 ;
    public final void rule__Ingredient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:624:1: ( rule__Ingredient__Group__8__Impl rule__Ingredient__Group__9 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:625:2: rule__Ingredient__Group__8__Impl rule__Ingredient__Group__9
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__8__Impl_in_rule__Ingredient__Group__81229);
            rule__Ingredient__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__9_in_rule__Ingredient__Group__81232);
            rule__Ingredient__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__8"


    // $ANTLR start "rule__Ingredient__Group__8__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:632:1: rule__Ingredient__Group__8__Impl : ( 'source:' ) ;
    public final void rule__Ingredient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:636:1: ( ( 'source:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:637:1: ( 'source:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:637:1: ( 'source:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:638:1: 'source:'
            {
             before(grammarAccess.getIngredientAccess().getSourceKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Ingredient__Group__8__Impl1260); 
             after(grammarAccess.getIngredientAccess().getSourceKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__8__Impl"


    // $ANTLR start "rule__Ingredient__Group__9"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:651:1: rule__Ingredient__Group__9 : rule__Ingredient__Group__9__Impl rule__Ingredient__Group__10 ;
    public final void rule__Ingredient__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:655:1: ( rule__Ingredient__Group__9__Impl rule__Ingredient__Group__10 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:656:2: rule__Ingredient__Group__9__Impl rule__Ingredient__Group__10
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__9__Impl_in_rule__Ingredient__Group__91291);
            rule__Ingredient__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ingredient__Group__10_in_rule__Ingredient__Group__91294);
            rule__Ingredient__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__9"


    // $ANTLR start "rule__Ingredient__Group__9__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:663:1: rule__Ingredient__Group__9__Impl : ( ( rule__Ingredient__SourceAssignment_9 ) ) ;
    public final void rule__Ingredient__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:667:1: ( ( ( rule__Ingredient__SourceAssignment_9 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:668:1: ( ( rule__Ingredient__SourceAssignment_9 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:668:1: ( ( rule__Ingredient__SourceAssignment_9 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:669:1: ( rule__Ingredient__SourceAssignment_9 )
            {
             before(grammarAccess.getIngredientAccess().getSourceAssignment_9()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:670:1: ( rule__Ingredient__SourceAssignment_9 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:670:2: rule__Ingredient__SourceAssignment_9
            {
            pushFollow(FOLLOW_rule__Ingredient__SourceAssignment_9_in_rule__Ingredient__Group__9__Impl1321);
            rule__Ingredient__SourceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getSourceAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__9__Impl"


    // $ANTLR start "rule__Ingredient__Group__10"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:680:1: rule__Ingredient__Group__10 : rule__Ingredient__Group__10__Impl ;
    public final void rule__Ingredient__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:684:1: ( rule__Ingredient__Group__10__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:685:2: rule__Ingredient__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Ingredient__Group__10__Impl_in_rule__Ingredient__Group__101351);
            rule__Ingredient__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__10"


    // $ANTLR start "rule__Ingredient__Group__10__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:691:1: rule__Ingredient__Group__10__Impl : ( '}' ) ;
    public final void rule__Ingredient__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:695:1: ( ( '}' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:696:1: ( '}' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:696:1: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:697:1: '}'
            {
             before(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_21_in_rule__Ingredient__Group__10__Impl1379); 
             after(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__10__Impl"


    // $ANTLR start "rule__Effect__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:732:1: rule__Effect__Group__0 : rule__Effect__Group__0__Impl rule__Effect__Group__1 ;
    public final void rule__Effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:736:1: ( rule__Effect__Group__0__Impl rule__Effect__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:737:2: rule__Effect__Group__0__Impl rule__Effect__Group__1
            {
            pushFollow(FOLLOW_rule__Effect__Group__0__Impl_in_rule__Effect__Group__01432);
            rule__Effect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Effect__Group__1_in_rule__Effect__Group__01435);
            rule__Effect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0"


    // $ANTLR start "rule__Effect__Group__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:744:1: rule__Effect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__Effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:748:1: ( ( 'effect' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:749:1: ( 'effect' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:749:1: ( 'effect' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:750:1: 'effect'
            {
             before(grammarAccess.getEffectAccess().getEffectKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Effect__Group__0__Impl1463); 
             after(grammarAccess.getEffectAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__0__Impl"


    // $ANTLR start "rule__Effect__Group__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:763:1: rule__Effect__Group__1 : rule__Effect__Group__1__Impl rule__Effect__Group__2 ;
    public final void rule__Effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:767:1: ( rule__Effect__Group__1__Impl rule__Effect__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:768:2: rule__Effect__Group__1__Impl rule__Effect__Group__2
            {
            pushFollow(FOLLOW_rule__Effect__Group__1__Impl_in_rule__Effect__Group__11494);
            rule__Effect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Effect__Group__2_in_rule__Effect__Group__11497);
            rule__Effect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1"


    // $ANTLR start "rule__Effect__Group__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:775:1: rule__Effect__Group__1__Impl : ( ( rule__Effect__NameAssignment_1 ) ) ;
    public final void rule__Effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:779:1: ( ( ( rule__Effect__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:780:1: ( ( rule__Effect__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:780:1: ( ( rule__Effect__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:781:1: ( rule__Effect__NameAssignment_1 )
            {
             before(grammarAccess.getEffectAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:782:1: ( rule__Effect__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:782:2: rule__Effect__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Effect__NameAssignment_1_in_rule__Effect__Group__1__Impl1524);
            rule__Effect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__1__Impl"


    // $ANTLR start "rule__Effect__Group__2"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:792:1: rule__Effect__Group__2 : rule__Effect__Group__2__Impl rule__Effect__Group__3 ;
    public final void rule__Effect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:796:1: ( rule__Effect__Group__2__Impl rule__Effect__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:797:2: rule__Effect__Group__2__Impl rule__Effect__Group__3
            {
            pushFollow(FOLLOW_rule__Effect__Group__2__Impl_in_rule__Effect__Group__21554);
            rule__Effect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Effect__Group__3_in_rule__Effect__Group__21557);
            rule__Effect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2"


    // $ANTLR start "rule__Effect__Group__2__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:804:1: rule__Effect__Group__2__Impl : ( '(' ) ;
    public final void rule__Effect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:808:1: ( ( '(' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:809:1: ( '(' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:809:1: ( '(' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:810:1: '('
            {
             before(grammarAccess.getEffectAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Effect__Group__2__Impl1585); 
             after(grammarAccess.getEffectAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2__Impl"


    // $ANTLR start "rule__Effect__Group__3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:823:1: rule__Effect__Group__3 : rule__Effect__Group__3__Impl rule__Effect__Group__4 ;
    public final void rule__Effect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:827:1: ( rule__Effect__Group__3__Impl rule__Effect__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:828:2: rule__Effect__Group__3__Impl rule__Effect__Group__4
            {
            pushFollow(FOLLOW_rule__Effect__Group__3__Impl_in_rule__Effect__Group__31616);
            rule__Effect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Effect__Group__4_in_rule__Effect__Group__31619);
            rule__Effect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__3"


    // $ANTLR start "rule__Effect__Group__3__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:835:1: rule__Effect__Group__3__Impl : ( ( rule__Effect__TypeAssignment_3 ) ) ;
    public final void rule__Effect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:839:1: ( ( ( rule__Effect__TypeAssignment_3 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:840:1: ( ( rule__Effect__TypeAssignment_3 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:840:1: ( ( rule__Effect__TypeAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:841:1: ( rule__Effect__TypeAssignment_3 )
            {
             before(grammarAccess.getEffectAccess().getTypeAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:842:1: ( rule__Effect__TypeAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:842:2: rule__Effect__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Effect__TypeAssignment_3_in_rule__Effect__Group__3__Impl1646);
            rule__Effect__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__3__Impl"


    // $ANTLR start "rule__Effect__Group__4"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:852:1: rule__Effect__Group__4 : rule__Effect__Group__4__Impl rule__Effect__Group__5 ;
    public final void rule__Effect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:856:1: ( rule__Effect__Group__4__Impl rule__Effect__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:857:2: rule__Effect__Group__4__Impl rule__Effect__Group__5
            {
            pushFollow(FOLLOW_rule__Effect__Group__4__Impl_in_rule__Effect__Group__41676);
            rule__Effect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Effect__Group__5_in_rule__Effect__Group__41679);
            rule__Effect__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__4"


    // $ANTLR start "rule__Effect__Group__4__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:864:1: rule__Effect__Group__4__Impl : ( ')' ) ;
    public final void rule__Effect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:868:1: ( ( ')' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:869:1: ( ')' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:869:1: ( ')' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:870:1: ')'
            {
             before(grammarAccess.getEffectAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Effect__Group__4__Impl1707); 
             after(grammarAccess.getEffectAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__4__Impl"


    // $ANTLR start "rule__Effect__Group__5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:883:1: rule__Effect__Group__5 : rule__Effect__Group__5__Impl ;
    public final void rule__Effect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:887:1: ( rule__Effect__Group__5__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:888:2: rule__Effect__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Effect__Group__5__Impl_in_rule__Effect__Group__51738);
            rule__Effect__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__5"


    // $ANTLR start "rule__Effect__Group__5__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:894:1: rule__Effect__Group__5__Impl : ( ( rule__Effect__Group_5__0 )? ) ;
    public final void rule__Effect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:898:1: ( ( ( rule__Effect__Group_5__0 )? ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:899:1: ( ( rule__Effect__Group_5__0 )? )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:899:1: ( ( rule__Effect__Group_5__0 )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:900:1: ( rule__Effect__Group_5__0 )?
            {
             before(grammarAccess.getEffectAccess().getGroup_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:901:1: ( rule__Effect__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:901:2: rule__Effect__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Effect__Group_5__0_in_rule__Effect__Group__5__Impl1765);
                    rule__Effect__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__5__Impl"


    // $ANTLR start "rule__Effect__Group_5__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:923:1: rule__Effect__Group_5__0 : rule__Effect__Group_5__0__Impl rule__Effect__Group_5__1 ;
    public final void rule__Effect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:927:1: ( rule__Effect__Group_5__0__Impl rule__Effect__Group_5__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:928:2: rule__Effect__Group_5__0__Impl rule__Effect__Group_5__1
            {
            pushFollow(FOLLOW_rule__Effect__Group_5__0__Impl_in_rule__Effect__Group_5__01808);
            rule__Effect__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Effect__Group_5__1_in_rule__Effect__Group_5__01811);
            rule__Effect__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_5__0"


    // $ANTLR start "rule__Effect__Group_5__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:935:1: rule__Effect__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Effect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:939:1: ( ( ':' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:940:1: ( ':' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:940:1: ( ':' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:941:1: ':'
            {
             before(grammarAccess.getEffectAccess().getColonKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__Effect__Group_5__0__Impl1839); 
             after(grammarAccess.getEffectAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_5__0__Impl"


    // $ANTLR start "rule__Effect__Group_5__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:954:1: rule__Effect__Group_5__1 : rule__Effect__Group_5__1__Impl ;
    public final void rule__Effect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:958:1: ( rule__Effect__Group_5__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:959:2: rule__Effect__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Effect__Group_5__1__Impl_in_rule__Effect__Group_5__11870);
            rule__Effect__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_5__1"


    // $ANTLR start "rule__Effect__Group_5__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:965:1: rule__Effect__Group_5__1__Impl : ( ( rule__Effect__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Effect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:969:1: ( ( ( rule__Effect__DescriptionAssignment_5_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:970:1: ( ( rule__Effect__DescriptionAssignment_5_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:970:1: ( ( rule__Effect__DescriptionAssignment_5_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:971:1: ( rule__Effect__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getEffectAccess().getDescriptionAssignment_5_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:972:1: ( rule__Effect__DescriptionAssignment_5_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:972:2: rule__Effect__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Effect__DescriptionAssignment_5_1_in_rule__Effect__Group_5__1__Impl1897);
            rule__Effect__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group_5__1__Impl"


    // $ANTLR start "rule__EffectRef__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:986:1: rule__EffectRef__Group__0 : rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1 ;
    public final void rule__EffectRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:990:1: ( rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:991:2: rule__EffectRef__Group__0__Impl rule__EffectRef__Group__1
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__0__Impl_in_rule__EffectRef__Group__01931);
            rule__EffectRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EffectRef__Group__1_in_rule__EffectRef__Group__01934);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:998:1: rule__EffectRef__Group__0__Impl : ( '->' ) ;
    public final void rule__EffectRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1002:1: ( ( '->' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1003:1: ( '->' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1003:1: ( '->' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1004:1: '->'
            {
             before(grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__EffectRef__Group__0__Impl1962); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1017:1: rule__EffectRef__Group__1 : rule__EffectRef__Group__1__Impl ;
    public final void rule__EffectRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1021:1: ( rule__EffectRef__Group__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1022:2: rule__EffectRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EffectRef__Group__1__Impl_in_rule__EffectRef__Group__11993);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1028:1: rule__EffectRef__Group__1__Impl : ( ( rule__EffectRef__EffectAssignment_1 ) ) ;
    public final void rule__EffectRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1032:1: ( ( ( rule__EffectRef__EffectAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1033:1: ( ( rule__EffectRef__EffectAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1033:1: ( ( rule__EffectRef__EffectAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1034:1: ( rule__EffectRef__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectRefAccess().getEffectAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1035:1: ( rule__EffectRef__EffectAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1035:2: rule__EffectRef__EffectAssignment_1
            {
            pushFollow(FOLLOW_rule__EffectRef__EffectAssignment_1_in_rule__EffectRef__Group__1__Impl2020);
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


    // $ANTLR start "rule__Recipe__Group__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1049:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1053:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1054:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02054);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02057);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1061:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__ToxicityAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1065:1: ( ( ( rule__Recipe__ToxicityAssignment_0 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1066:1: ( ( rule__Recipe__ToxicityAssignment_0 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1066:1: ( ( rule__Recipe__ToxicityAssignment_0 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1067:1: ( rule__Recipe__ToxicityAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getToxicityAssignment_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1068:1: ( rule__Recipe__ToxicityAssignment_0 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1068:2: rule__Recipe__ToxicityAssignment_0
            {
            pushFollow(FOLLOW_rule__Recipe__ToxicityAssignment_0_in_rule__Recipe__Group__0__Impl2084);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1078:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1082:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1083:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12114);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12117);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1090:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1094:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1095:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1095:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1096:1: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1097:1: ( rule__Recipe__NameAssignment_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1097:2: rule__Recipe__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Recipe__NameAssignment_1_in_rule__Recipe__Group__1__Impl2144);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1107:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1111:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1112:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22174);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22177);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1119:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1123:1: ( ( '{' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1124:1: ( '{' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1124:1: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1125:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Recipe__Group__2__Impl2205); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1138:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1142:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1143:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32236);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32239);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1150:1: rule__Recipe__Group__3__Impl : ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1154:1: ( ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1155:1: ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1155:1: ( ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1156:1: ( ( rule__Recipe__EffectsAssignment_3 ) ) ( ( rule__Recipe__EffectsAssignment_3 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1156:1: ( ( rule__Recipe__EffectsAssignment_3 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1157:1: ( rule__Recipe__EffectsAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1158:1: ( rule__Recipe__EffectsAssignment_3 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1158:2: rule__Recipe__EffectsAssignment_3
            {
            pushFollow(FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl2268);
            rule__Recipe__EffectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 

            }

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1161:1: ( ( rule__Recipe__EffectsAssignment_3 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1162:1: ( rule__Recipe__EffectsAssignment_3 )*
            {
             before(grammarAccess.getRecipeAccess().getEffectsAssignment_3()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1163:1: ( rule__Recipe__EffectsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1163:2: rule__Recipe__EffectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl2280);
            	    rule__Recipe__EffectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1174:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1178:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1179:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42313);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42316);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1186:1: rule__Recipe__Group__4__Impl : ( 'price:' ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1190:1: ( ( 'price:' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1191:1: ( 'price:' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1191:1: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1192:1: 'price:'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Recipe__Group__4__Impl2344); 
             after(grammarAccess.getRecipeAccess().getPriceKeyword_4()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1205:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1209:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1210:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52375);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__52378);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1217:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__PriceAssignment_5 ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1221:1: ( ( ( rule__Recipe__PriceAssignment_5 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1222:1: ( ( rule__Recipe__PriceAssignment_5 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1222:1: ( ( rule__Recipe__PriceAssignment_5 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1223:1: ( rule__Recipe__PriceAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_5()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1224:1: ( rule__Recipe__PriceAssignment_5 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1224:2: rule__Recipe__PriceAssignment_5
            {
            pushFollow(FOLLOW_rule__Recipe__PriceAssignment_5_in_rule__Recipe__Group__5__Impl2405);
            rule__Recipe__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getPriceAssignment_5()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1234:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1238:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1239:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__62435);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__62438);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1246:1: rule__Recipe__Group__6__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1250:1: ( ( '}' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1251:1: ( '}' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1251:1: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1252:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Recipe__Group__6__Impl2466); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1265:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1269:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1270:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__72497);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__72500);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1277:1: rule__Recipe__Group__7__Impl : ( '=' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1281:1: ( ( '=' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1282:1: ( '=' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1282:1: ( '=' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1283:1: '='
            {
             before(grammarAccess.getRecipeAccess().getEqualsSignKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__Recipe__Group__7__Impl2528); 
             after(grammarAccess.getRecipeAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1296:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1300:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1301:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__82559);
            rule__Recipe__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group__9_in_rule__Recipe__Group__82562);
            rule__Recipe__Group__9();

            state._fsp--;


            }

        }
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1308:1: rule__Recipe__Group__8__Impl : ( ( rule__Recipe__IngredientsAssignment_8 ) ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1312:1: ( ( ( rule__Recipe__IngredientsAssignment_8 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1313:1: ( ( rule__Recipe__IngredientsAssignment_8 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1313:1: ( ( rule__Recipe__IngredientsAssignment_8 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1314:1: ( rule__Recipe__IngredientsAssignment_8 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_8()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1315:1: ( rule__Recipe__IngredientsAssignment_8 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1315:2: rule__Recipe__IngredientsAssignment_8
            {
            pushFollow(FOLLOW_rule__Recipe__IngredientsAssignment_8_in_rule__Recipe__Group__8__Impl2589);
            rule__Recipe__IngredientsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recipe__Group__9"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1325:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1329:1: ( rule__Recipe__Group__9__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1330:2: rule__Recipe__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group__9__Impl_in_rule__Recipe__Group__92619);
            rule__Recipe__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__9"


    // $ANTLR start "rule__Recipe__Group__9__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1336:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__Group_9__0 )* ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1340:1: ( ( ( rule__Recipe__Group_9__0 )* ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1341:1: ( ( rule__Recipe__Group_9__0 )* )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1341:1: ( ( rule__Recipe__Group_9__0 )* )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1342:1: ( rule__Recipe__Group_9__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_9()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1343:1: ( rule__Recipe__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1343:2: rule__Recipe__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Recipe__Group_9__0_in_rule__Recipe__Group__9__Impl2646);
            	    rule__Recipe__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__9__Impl"


    // $ANTLR start "rule__Recipe__Group_9__0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1373:1: rule__Recipe__Group_9__0 : rule__Recipe__Group_9__0__Impl rule__Recipe__Group_9__1 ;
    public final void rule__Recipe__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1377:1: ( rule__Recipe__Group_9__0__Impl rule__Recipe__Group_9__1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1378:2: rule__Recipe__Group_9__0__Impl rule__Recipe__Group_9__1
            {
            pushFollow(FOLLOW_rule__Recipe__Group_9__0__Impl_in_rule__Recipe__Group_9__02697);
            rule__Recipe__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recipe__Group_9__1_in_rule__Recipe__Group_9__02700);
            rule__Recipe__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_9__0"


    // $ANTLR start "rule__Recipe__Group_9__0__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1385:1: rule__Recipe__Group_9__0__Impl : ( '+' ) ;
    public final void rule__Recipe__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1389:1: ( ( '+' ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1390:1: ( '+' )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1390:1: ( '+' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1391:1: '+'
            {
             before(grammarAccess.getRecipeAccess().getPlusSignKeyword_9_0()); 
            match(input,12,FOLLOW_12_in_rule__Recipe__Group_9__0__Impl2728); 
             after(grammarAccess.getRecipeAccess().getPlusSignKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_9__0__Impl"


    // $ANTLR start "rule__Recipe__Group_9__1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1404:1: rule__Recipe__Group_9__1 : rule__Recipe__Group_9__1__Impl ;
    public final void rule__Recipe__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1408:1: ( rule__Recipe__Group_9__1__Impl )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1409:2: rule__Recipe__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Recipe__Group_9__1__Impl_in_rule__Recipe__Group_9__12759);
            rule__Recipe__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_9__1"


    // $ANTLR start "rule__Recipe__Group_9__1__Impl"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1415:1: rule__Recipe__Group_9__1__Impl : ( ( rule__Recipe__IngredientsAssignment_9_1 ) ) ;
    public final void rule__Recipe__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1419:1: ( ( ( rule__Recipe__IngredientsAssignment_9_1 ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1420:1: ( ( rule__Recipe__IngredientsAssignment_9_1 ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1420:1: ( ( rule__Recipe__IngredientsAssignment_9_1 ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1421:1: ( rule__Recipe__IngredientsAssignment_9_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_9_1()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1422:1: ( rule__Recipe__IngredientsAssignment_9_1 )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1422:2: rule__Recipe__IngredientsAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Recipe__IngredientsAssignment_9_1_in_rule__Recipe__Group_9__1__Impl2786);
            rule__Recipe__IngredientsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_9__1__Impl"


    // $ANTLR start "rule__AlchemyLabModel__EffectsAssignment_0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1437:1: rule__AlchemyLabModel__EffectsAssignment_0 : ( ruleEffect ) ;
    public final void rule__AlchemyLabModel__EffectsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1441:1: ( ( ruleEffect ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1442:1: ( ruleEffect )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1442:1: ( ruleEffect )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1443:1: ruleEffect
            {
             before(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEffect_in_rule__AlchemyLabModel__EffectsAssignment_02825);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1452:1: rule__AlchemyLabModel__IngredientsAssignment_1 : ( ruleIngredient ) ;
    public final void rule__AlchemyLabModel__IngredientsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1456:1: ( ( ruleIngredient ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1457:1: ( ruleIngredient )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1457:1: ( ruleIngredient )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1458:1: ruleIngredient
            {
             before(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIngredient_in_rule__AlchemyLabModel__IngredientsAssignment_12856);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1467:1: rule__AlchemyLabModel__RecipesAssignment_2 : ( ruleRecipe ) ;
    public final void rule__AlchemyLabModel__RecipesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1471:1: ( ( ruleRecipe ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1472:1: ( ruleRecipe )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1472:1: ( ruleRecipe )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1473:1: ruleRecipe
            {
             before(grammarAccess.getAlchemyLabModelAccess().getRecipesRecipeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecipe_in_rule__AlchemyLabModel__RecipesAssignment_22887);
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


    // $ANTLR start "rule__Ingredient__NameAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1482:1: rule__Ingredient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1486:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1487:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1487:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1488:1: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ingredient__NameAssignment_12918); 
             after(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_1"


    // $ANTLR start "rule__Ingredient__EffectsAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1497:1: rule__Ingredient__EffectsAssignment_3 : ( ruleEffectRef ) ;
    public final void rule__Ingredient__EffectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1501:1: ( ( ruleEffectRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1502:1: ( ruleEffectRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1502:1: ( ruleEffectRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1503:1: ruleEffectRef
            {
             before(grammarAccess.getIngredientAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectRef_in_rule__Ingredient__EffectsAssignment_32949);
            ruleEffectRef();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getEffectsEffectRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__EffectsAssignment_3"


    // $ANTLR start "rule__Ingredient__PriceAssignment_5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1512:1: rule__Ingredient__PriceAssignment_5 : ( RULE_NUMBER ) ;
    public final void rule__Ingredient__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1516:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1517:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1517:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1518:1: RULE_NUMBER
            {
             before(grammarAccess.getIngredientAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Ingredient__PriceAssignment_52980); 
             after(grammarAccess.getIngredientAccess().getPriceNUMBERTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__PriceAssignment_5"


    // $ANTLR start "rule__Ingredient__WeightAssignment_7"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1527:1: rule__Ingredient__WeightAssignment_7 : ( RULE_NUMBER ) ;
    public final void rule__Ingredient__WeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1531:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1532:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1532:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1533:1: RULE_NUMBER
            {
             before(grammarAccess.getIngredientAccess().getWeightNUMBERTerminalRuleCall_7_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Ingredient__WeightAssignment_73011); 
             after(grammarAccess.getIngredientAccess().getWeightNUMBERTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__WeightAssignment_7"


    // $ANTLR start "rule__Ingredient__SourceAssignment_9"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1542:1: rule__Ingredient__SourceAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Ingredient__SourceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1546:1: ( ( RULE_STRING ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1547:1: ( RULE_STRING )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1547:1: ( RULE_STRING )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1548:1: RULE_STRING
            {
             before(grammarAccess.getIngredientAccess().getSourceSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ingredient__SourceAssignment_93042); 
             after(grammarAccess.getIngredientAccess().getSourceSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__SourceAssignment_9"


    // $ANTLR start "rule__Effect__NameAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1557:1: rule__Effect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Effect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1561:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1562:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1562:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1563:1: RULE_ID
            {
             before(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Effect__NameAssignment_13073); 
             after(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__NameAssignment_1"


    // $ANTLR start "rule__Effect__TypeAssignment_3"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1572:1: rule__Effect__TypeAssignment_3 : ( ruleEffectType ) ;
    public final void rule__Effect__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1576:1: ( ( ruleEffectType ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1577:1: ( ruleEffectType )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1577:1: ( ruleEffectType )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1578:1: ruleEffectType
            {
             before(grammarAccess.getEffectAccess().getTypeEffectTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectType_in_rule__Effect__TypeAssignment_33104);
            ruleEffectType();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getTypeEffectTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__TypeAssignment_3"


    // $ANTLR start "rule__Effect__DescriptionAssignment_5_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1587:1: rule__Effect__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Effect__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1591:1: ( ( RULE_STRING ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1592:1: ( RULE_STRING )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1592:1: ( RULE_STRING )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1593:1: RULE_STRING
            {
             before(grammarAccess.getEffectAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Effect__DescriptionAssignment_5_13135); 
             after(grammarAccess.getEffectAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__DescriptionAssignment_5_1"


    // $ANTLR start "rule__EffectRef__EffectAssignment_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1602:1: rule__EffectRef__EffectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EffectRef__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1606:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1607:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1607:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1608:1: ( RULE_ID )
            {
             before(grammarAccess.getEffectRefAccess().getEffectEffectCrossReference_1_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1609:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1610:1: RULE_ID
            {
             before(grammarAccess.getEffectRefAccess().getEffectEffectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EffectRef__EffectAssignment_13170); 
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


    // $ANTLR start "rule__Recipe__ToxicityAssignment_0"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1621:1: rule__Recipe__ToxicityAssignment_0 : ( ruleToxicity ) ;
    public final void rule__Recipe__ToxicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1625:1: ( ( ruleToxicity ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1626:1: ( ruleToxicity )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1626:1: ( ruleToxicity )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1627:1: ruleToxicity
            {
             before(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleToxicity_in_rule__Recipe__ToxicityAssignment_03205);
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1636:1: rule__Recipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1640:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1641:1: ( RULE_ID )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1641:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1642:1: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recipe__NameAssignment_13236); 
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
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1651:1: rule__Recipe__EffectsAssignment_3 : ( ruleEffectRef ) ;
    public final void rule__Recipe__EffectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1655:1: ( ( ruleEffectRef ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1656:1: ( ruleEffectRef )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1656:1: ( ruleEffectRef )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1657:1: ruleEffectRef
            {
             before(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEffectRef_in_rule__Recipe__EffectsAssignment_33267);
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


    // $ANTLR start "rule__Recipe__PriceAssignment_5"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1666:1: rule__Recipe__PriceAssignment_5 : ( RULE_NUMBER ) ;
    public final void rule__Recipe__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1670:1: ( ( RULE_NUMBER ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1671:1: ( RULE_NUMBER )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1671:1: ( RULE_NUMBER )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1672:1: RULE_NUMBER
            {
             before(grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Recipe__PriceAssignment_53298); 
             after(grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__PriceAssignment_5"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_8"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1681:1: rule__Recipe__IngredientsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__IngredientsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1685:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1686:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1686:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1687:1: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientCrossReference_8_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1688:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1689:1: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recipe__IngredientsAssignment_83333); 
             after(grammarAccess.getRecipeAccess().getIngredientsIngredientIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_8"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_9_1"
    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1700:1: rule__Recipe__IngredientsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__IngredientsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1704:1: ( ( ( RULE_ID ) ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1705:1: ( ( RULE_ID ) )
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1705:1: ( ( RULE_ID ) )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1706:1: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientCrossReference_9_1_0()); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1707:1: ( RULE_ID )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1708:1: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recipe__IngredientsAssignment_9_13372); 
             after(grammarAccess.getRecipeAccess().getIngredientsIngredientIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_9_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAlchemyLabModel_in_entryRuleAlchemyLabModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlchemyLabModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__0_in_ruleAlchemyLabModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredient128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__0_in_ruleIngredient154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__0_in_ruleEffect214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_entryRuleEffectRef241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRef248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__0_in_ruleEffectRef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipe308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__0_in_ruleRecipe334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectType__Alternatives_in_ruleEffectType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Toxicity__Alternatives_in_ruleToxicity407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EffectType__Alternatives443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EffectType__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Toxicity__Alternatives500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Toxicity__Alternatives521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__0__Impl_in_rule__AlchemyLabModel__Group__0554 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__1_in_rule__AlchemyLabModel__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__EffectsAssignment_0_in_rule__AlchemyLabModel__Group__0__Impl584 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__1__Impl_in_rule__AlchemyLabModel__Group__1615 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__2_in_rule__AlchemyLabModel__Group__1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__IngredientsAssignment_1_in_rule__AlchemyLabModel__Group__1__Impl645 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__Group__2__Impl_in_rule__AlchemyLabModel__Group__2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlchemyLabModel__RecipesAssignment_2_in_rule__AlchemyLabModel__Group__2__Impl703 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__0740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__0743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Ingredient__Group__0__Impl771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__1802 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__NameAssignment_1_in_rule__Ingredient__Group__1__Impl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__2862 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Ingredient__Group__2__Impl893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__3924 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__4_in_rule__Ingredient__Group__3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__EffectsAssignment_3_in_rule__Ingredient__Group__3__Impl954 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__4__Impl_in_rule__Ingredient__Group__4985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__5_in_rule__Ingredient__Group__4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Ingredient__Group__4__Impl1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__5__Impl_in_rule__Ingredient__Group__51047 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__6_in_rule__Ingredient__Group__51050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__PriceAssignment_5_in_rule__Ingredient__Group__5__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__6__Impl_in_rule__Ingredient__Group__61107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__7_in_rule__Ingredient__Group__61110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ingredient__Group__6__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__7__Impl_in_rule__Ingredient__Group__71169 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__8_in_rule__Ingredient__Group__71172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__WeightAssignment_7_in_rule__Ingredient__Group__7__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__8__Impl_in_rule__Ingredient__Group__81229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__9_in_rule__Ingredient__Group__81232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Ingredient__Group__8__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__9__Impl_in_rule__Ingredient__Group__91291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__10_in_rule__Ingredient__Group__91294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__SourceAssignment_9_in_rule__Ingredient__Group__9__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ingredient__Group__10__Impl_in_rule__Ingredient__Group__101351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Ingredient__Group__10__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__0__Impl_in_rule__Effect__Group__01432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Effect__Group__1_in_rule__Effect__Group__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Effect__Group__0__Impl1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__1__Impl_in_rule__Effect__Group__11494 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Effect__Group__2_in_rule__Effect__Group__11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__NameAssignment_1_in_rule__Effect__Group__1__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__2__Impl_in_rule__Effect__Group__21554 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Effect__Group__3_in_rule__Effect__Group__21557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Effect__Group__2__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__3__Impl_in_rule__Effect__Group__31616 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Effect__Group__4_in_rule__Effect__Group__31619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__TypeAssignment_3_in_rule__Effect__Group__3__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__4__Impl_in_rule__Effect__Group__41676 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Effect__Group__5_in_rule__Effect__Group__41679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Effect__Group__4__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group__5__Impl_in_rule__Effect__Group__51738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group_5__0_in_rule__Effect__Group__5__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group_5__0__Impl_in_rule__Effect__Group_5__01808 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Effect__Group_5__1_in_rule__Effect__Group_5__01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Effect__Group_5__0__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Group_5__1__Impl_in_rule__Effect__Group_5__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__DescriptionAssignment_5_1_in_rule__Effect__Group_5__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__0__Impl_in_rule__EffectRef__Group__01931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__1_in_rule__EffectRef__Group__01934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EffectRef__Group__0__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__Group__1__Impl_in_rule__EffectRef__Group__11993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EffectRef__EffectAssignment_1_in_rule__EffectRef__Group__1__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__ToxicityAssignment_0_in_rule__Recipe__Group__0__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12114 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__NameAssignment_1_in_rule__Recipe__Group__1__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Recipe__Group__2__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32236 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl2268 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Recipe__EffectsAssignment_3_in_rule__Recipe__Group__3__Impl2280 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Recipe__Group__4__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52375 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__52378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_5_in_rule__Recipe__Group__5__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__62435 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__62438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Recipe__Group__6__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__72497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__72500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Recipe__Group__7__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__82559 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Recipe__Group__9_in_rule__Recipe__Group__82562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_8_in_rule__Recipe__Group__8__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group__9__Impl_in_rule__Recipe__Group__92619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_9__0_in_rule__Recipe__Group__9__Impl2646 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_9__0__Impl_in_rule__Recipe__Group_9__02697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Recipe__Group_9__1_in_rule__Recipe__Group_9__02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Recipe__Group_9__0__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__Group_9__1__Impl_in_rule__Recipe__Group_9__12759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_9_1_in_rule__Recipe__Group_9__1__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__AlchemyLabModel__EffectsAssignment_02825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredient_in_rule__AlchemyLabModel__IngredientsAssignment_12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_rule__AlchemyLabModel__RecipesAssignment_22887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ingredient__NameAssignment_12918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_rule__Ingredient__EffectsAssignment_32949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Ingredient__PriceAssignment_52980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Ingredient__WeightAssignment_73011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ingredient__SourceAssignment_93042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Effect__NameAssignment_13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectType_in_rule__Effect__TypeAssignment_33104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Effect__DescriptionAssignment_5_13135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EffectRef__EffectAssignment_13170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToxicity_in_rule__Recipe__ToxicityAssignment_03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recipe__NameAssignment_13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_rule__Recipe__EffectsAssignment_33267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Recipe__PriceAssignment_53298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recipe__IngredientsAssignment_83333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recipe__IngredientsAssignment_9_13372 = new BitSet(new long[]{0x0000000000000002L});

}