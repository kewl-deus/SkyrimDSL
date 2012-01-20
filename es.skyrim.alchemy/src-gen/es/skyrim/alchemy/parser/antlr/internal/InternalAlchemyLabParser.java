package es.skyrim.alchemy.parser.antlr.internal; 

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
import es.skyrim.alchemy.services.AlchemyLabGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlchemyLabParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_STRONGID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'effect'", "'('", "')'", "':'", "'->'", "'ealias'", "'for'", "'ingredient'", "'{'", "'price:'", "'weight:'", "'source:'", "'}'", "'ialias'", "'='", "'+'", "'-'", "'potion'", "'poison'", "'mixture'"
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
    public String getGrammarFileName() { return "../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g"; }



     	private AlchemyLabGrammarAccess grammarAccess;
     	
        public InternalAlchemyLabParser(TokenStream input, AlchemyLabGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AlchemyLabModel";	
       	}
       	
       	@Override
       	protected AlchemyLabGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAlchemyLabModel"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:68:1: entryRuleAlchemyLabModel returns [EObject current=null] : iv_ruleAlchemyLabModel= ruleAlchemyLabModel EOF ;
    public final EObject entryRuleAlchemyLabModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlchemyLabModel = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:69:2: (iv_ruleAlchemyLabModel= ruleAlchemyLabModel EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:70:2: iv_ruleAlchemyLabModel= ruleAlchemyLabModel EOF
            {
             newCompositeNode(grammarAccess.getAlchemyLabModelRule()); 
            pushFollow(FOLLOW_ruleAlchemyLabModel_in_entryRuleAlchemyLabModel75);
            iv_ruleAlchemyLabModel=ruleAlchemyLabModel();

            state._fsp--;

             current =iv_ruleAlchemyLabModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlchemyLabModel85); 

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
    // $ANTLR end "entryRuleAlchemyLabModel"


    // $ANTLR start "ruleAlchemyLabModel"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:77:1: ruleAlchemyLabModel returns [EObject current=null] : ( ( (lv_effects_0_0= ruleEffect ) )* ( (lv_ingredients_1_0= ruleIngredient ) )* ( (lv_recipes_2_0= ruleRecipe ) )* ) ;
    public final EObject ruleAlchemyLabModel() throws RecognitionException {
        EObject current = null;

        EObject lv_effects_0_0 = null;

        EObject lv_ingredients_1_0 = null;

        EObject lv_recipes_2_0 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:80:28: ( ( ( (lv_effects_0_0= ruleEffect ) )* ( (lv_ingredients_1_0= ruleIngredient ) )* ( (lv_recipes_2_0= ruleRecipe ) )* ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:1: ( ( (lv_effects_0_0= ruleEffect ) )* ( (lv_ingredients_1_0= ruleIngredient ) )* ( (lv_recipes_2_0= ruleRecipe ) )* )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:1: ( ( (lv_effects_0_0= ruleEffect ) )* ( (lv_ingredients_1_0= ruleIngredient ) )* ( (lv_recipes_2_0= ruleRecipe ) )* )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:2: ( (lv_effects_0_0= ruleEffect ) )* ( (lv_ingredients_1_0= ruleIngredient ) )* ( (lv_recipes_2_0= ruleRecipe ) )*
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:2: ( (lv_effects_0_0= ruleEffect ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:82:1: (lv_effects_0_0= ruleEffect )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:82:1: (lv_effects_0_0= ruleEffect )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:83:3: lv_effects_0_0= ruleEffect
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffect_in_ruleAlchemyLabModel131);
            	    lv_effects_0_0=ruleEffect();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlchemyLabModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"effects",
            	            		lv_effects_0_0, 
            	            		"Effect");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:99:3: ( (lv_ingredients_1_0= ruleIngredient ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:100:1: (lv_ingredients_1_0= ruleIngredient )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:100:1: (lv_ingredients_1_0= ruleIngredient )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:101:3: lv_ingredients_1_0= ruleIngredient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIngredient_in_ruleAlchemyLabModel153);
            	    lv_ingredients_1_0=ruleIngredient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlchemyLabModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ingredients",
            	            		lv_ingredients_1_0, 
            	            		"Ingredient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:117:3: ( (lv_recipes_2_0= ruleRecipe ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=29 && LA3_0<=31)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:118:1: (lv_recipes_2_0= ruleRecipe )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:118:1: (lv_recipes_2_0= ruleRecipe )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:119:3: lv_recipes_2_0= ruleRecipe
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlchemyLabModelAccess().getRecipesRecipeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecipe_in_ruleAlchemyLabModel175);
            	    lv_recipes_2_0=ruleRecipe();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlchemyLabModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"recipes",
            	            		lv_recipes_2_0, 
            	            		"Recipe");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleAlchemyLabModel"


    // $ANTLR start "entryRuleEffect"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:143:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:144:2: (iv_ruleEffect= ruleEffect EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:145:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect212);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect222); 

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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:152:1: ruleEffect returns [EObject current=null] : (this_EffectDef_0= ruleEffectDef | this_EffectAlias_1= ruleEffectAlias ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_EffectDef_0 = null;

        EObject this_EffectAlias_1 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:155:28: ( (this_EffectDef_0= ruleEffectDef | this_EffectAlias_1= ruleEffectAlias ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:156:1: (this_EffectDef_0= ruleEffectDef | this_EffectAlias_1= ruleEffectAlias )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:156:1: (this_EffectDef_0= ruleEffectDef | this_EffectAlias_1= ruleEffectAlias )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:157:5: this_EffectDef_0= ruleEffectDef
                    {
                     
                            newCompositeNode(grammarAccess.getEffectAccess().getEffectDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEffectDef_in_ruleEffect269);
                    this_EffectDef_0=ruleEffectDef();

                    state._fsp--;

                     
                            current = this_EffectDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:167:5: this_EffectAlias_1= ruleEffectAlias
                    {
                     
                            newCompositeNode(grammarAccess.getEffectAccess().getEffectAliasParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEffectAlias_in_ruleEffect296);
                    this_EffectAlias_1=ruleEffectAlias();

                    state._fsp--;

                     
                            current = this_EffectAlias_1; 
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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEffectDef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:183:1: entryRuleEffectDef returns [EObject current=null] : iv_ruleEffectDef= ruleEffectDef EOF ;
    public final EObject entryRuleEffectDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectDef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:184:2: (iv_ruleEffectDef= ruleEffectDef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:185:2: iv_ruleEffectDef= ruleEffectDef EOF
            {
             newCompositeNode(grammarAccess.getEffectDefRule()); 
            pushFollow(FOLLOW_ruleEffectDef_in_entryRuleEffectDef331);
            iv_ruleEffectDef=ruleEffectDef();

            state._fsp--;

             current =iv_ruleEffectDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectDef341); 

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
    // $ANTLR end "entryRuleEffectDef"


    // $ANTLR start "ruleEffectDef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:192:1: ruleEffectDef returns [EObject current=null] : (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEffectDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:195:28: ( (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:196:1: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:196:1: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:196:3: otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEffectDef378); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectDefAccess().getEffectKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:200:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:201:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:201:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:202:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectDef395); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEffectDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEffectDef412); 

                	newLeafNode(otherlv_2, grammarAccess.getEffectDefAccess().getLeftParenthesisKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:222:1: ( (lv_type_3_0= ruleEffectType ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:223:1: (lv_type_3_0= ruleEffectType )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:223:1: (lv_type_3_0= ruleEffectType )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:224:3: lv_type_3_0= ruleEffectType
            {
             
            	        newCompositeNode(grammarAccess.getEffectDefAccess().getTypeEffectTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEffectType_in_ruleEffectDef433);
            lv_type_3_0=ruleEffectType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEffectDefRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"EffectType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEffectDef445); 

                	newLeafNode(otherlv_4, grammarAccess.getEffectDefAccess().getRightParenthesisKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:244:1: (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:244:3: otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEffectDef458); 

                        	newLeafNode(otherlv_5, grammarAccess.getEffectDefAccess().getColonKeyword_5_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:248:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:1: (lv_description_6_0= RULE_STRING )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:250:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEffectDef475); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getEffectDefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEffectDefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleEffectDef"


    // $ANTLR start "entryRuleEffectRef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:274:1: entryRuleEffectRef returns [EObject current=null] : iv_ruleEffectRef= ruleEffectRef EOF ;
    public final EObject entryRuleEffectRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectRef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:275:2: (iv_ruleEffectRef= ruleEffectRef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:276:2: iv_ruleEffectRef= ruleEffectRef EOF
            {
             newCompositeNode(grammarAccess.getEffectRefRule()); 
            pushFollow(FOLLOW_ruleEffectRef_in_entryRuleEffectRef518);
            iv_ruleEffectRef=ruleEffectRef();

            state._fsp--;

             current =iv_ruleEffectRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRef528); 

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
    // $ANTLR end "entryRuleEffectRef"


    // $ANTLR start "ruleEffectRef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:283:1: ruleEffectRef returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEffectRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:286:28: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEffectRef565); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:291:1: ( (otherlv_1= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:292:1: (otherlv_1= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:292:1: (otherlv_1= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:293:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectRef585); 

            		newLeafNode(otherlv_1, grammarAccess.getEffectRefAccess().getEffectEffectCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleEffectRef"


    // $ANTLR start "entryRuleEffectAlias"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:312:1: entryRuleEffectAlias returns [EObject current=null] : iv_ruleEffectAlias= ruleEffectAlias EOF ;
    public final EObject entryRuleEffectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectAlias = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:313:2: (iv_ruleEffectAlias= ruleEffectAlias EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:314:2: iv_ruleEffectAlias= ruleEffectAlias EOF
            {
             newCompositeNode(grammarAccess.getEffectAliasRule()); 
            pushFollow(FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias621);
            iv_ruleEffectAlias=ruleEffectAlias();

            state._fsp--;

             current =iv_ruleEffectAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectAlias631); 

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
    // $ANTLR end "entryRuleEffectAlias"


    // $ANTLR start "ruleEffectAlias"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:321:1: ruleEffectAlias returns [EObject current=null] : (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleEffectAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_alias_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:324:28: ( (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:325:1: (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:325:1: (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:325:3: otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEffectAlias668); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectAliasAccess().getEaliasKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:329:1: ( (lv_alias_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:330:1: (lv_alias_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:330:1: (lv_alias_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:331:3: lv_alias_1_0= RULE_ID
            {
            lv_alias_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectAlias685); 

            			newLeafNode(lv_alias_1_0, grammarAccess.getEffectAliasAccess().getAliasIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectAliasRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alias",
                    		lv_alias_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEffectAlias702); 

                	newLeafNode(otherlv_2, grammarAccess.getEffectAliasAccess().getForKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:351:1: ( (otherlv_3= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:352:1: (otherlv_3= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:352:1: (otherlv_3= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:353:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectAliasRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectAlias722); 

            		newLeafNode(otherlv_3, grammarAccess.getEffectAliasAccess().getEffectEffectCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleEffectAlias"


    // $ANTLR start "entryRuleIngredient"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:372:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:373:2: (iv_ruleIngredient= ruleIngredient EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:374:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_ruleIngredient_in_entryRuleIngredient758);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredient768); 

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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:381:1: ruleIngredient returns [EObject current=null] : (this_IngredientDef_0= ruleIngredientDef | this_IngredientAlias_1= ruleIngredientAlias ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        EObject this_IngredientDef_0 = null;

        EObject this_IngredientAlias_1 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:384:28: ( (this_IngredientDef_0= ruleIngredientDef | this_IngredientAlias_1= ruleIngredientAlias ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:385:1: (this_IngredientDef_0= ruleIngredientDef | this_IngredientAlias_1= ruleIngredientAlias )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:385:1: (this_IngredientDef_0= ruleIngredientDef | this_IngredientAlias_1= ruleIngredientAlias )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:386:5: this_IngredientDef_0= ruleIngredientDef
                    {
                     
                            newCompositeNode(grammarAccess.getIngredientAccess().getIngredientDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIngredientDef_in_ruleIngredient815);
                    this_IngredientDef_0=ruleIngredientDef();

                    state._fsp--;

                     
                            current = this_IngredientDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:396:5: this_IngredientAlias_1= ruleIngredientAlias
                    {
                     
                            newCompositeNode(grammarAccess.getIngredientAccess().getIngredientAliasParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIngredientAlias_in_ruleIngredient842);
                    this_IngredientAlias_1=ruleIngredientAlias();

                    state._fsp--;

                     
                            current = this_IngredientAlias_1; 
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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleIngredientDef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:412:1: entryRuleIngredientDef returns [EObject current=null] : iv_ruleIngredientDef= ruleIngredientDef EOF ;
    public final EObject entryRuleIngredientDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientDef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:413:2: (iv_ruleIngredientDef= ruleIngredientDef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:414:2: iv_ruleIngredientDef= ruleIngredientDef EOF
            {
             newCompositeNode(grammarAccess.getIngredientDefRule()); 
            pushFollow(FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef877);
            iv_ruleIngredientDef=ruleIngredientDef();

            state._fsp--;

             current =iv_ruleIngredientDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientDef887); 

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
    // $ANTLR end "entryRuleIngredientDef"


    // $ANTLR start "ruleIngredientDef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:421:1: ruleIngredientDef returns [EObject current=null] : (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleIngredientDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_price_5_0=null;
        Token otherlv_6=null;
        Token lv_weight_7_0=null;
        Token otherlv_8=null;
        Token lv_source_9_0=null;
        Token otherlv_10=null;
        EObject lv_effects_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:424:28: ( (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:425:1: (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:425:1: (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:425:3: otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleIngredientDef924); 

                	newLeafNode(otherlv_0, grammarAccess.getIngredientDefAccess().getIngredientKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:429:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:430:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:430:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:431:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientDef941); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIngredientDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleIngredientDef958); 

                	newLeafNode(otherlv_2, grammarAccess.getIngredientDefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:451:1: ( (lv_effects_3_0= ruleEffectRef ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:452:1: (lv_effects_3_0= ruleEffectRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:452:1: (lv_effects_3_0= ruleEffectRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:453:3: lv_effects_3_0= ruleEffectRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIngredientDefAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectRef_in_ruleIngredientDef979);
            	    lv_effects_3_0=ruleEffectRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIngredientDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"effects",
            	            		lv_effects_3_0, 
            	            		"EffectRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleIngredientDef992); 

                	newLeafNode(otherlv_4, grammarAccess.getIngredientDefAccess().getPriceKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:473:1: ( (lv_price_5_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:474:1: (lv_price_5_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:474:1: (lv_price_5_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:475:3: lv_price_5_0= RULE_NUMBER
            {
            lv_price_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIngredientDef1009); 

            			newLeafNode(lv_price_5_0, grammarAccess.getIngredientDefAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"price",
                    		lv_price_5_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleIngredientDef1026); 

                	newLeafNode(otherlv_6, grammarAccess.getIngredientDefAccess().getWeightKeyword_6());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:495:1: ( (lv_weight_7_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:496:1: (lv_weight_7_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:496:1: (lv_weight_7_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:497:3: lv_weight_7_0= RULE_NUMBER
            {
            lv_weight_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIngredientDef1043); 

            			newLeafNode(lv_weight_7_0, grammarAccess.getIngredientDefAccess().getWeightNUMBERTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weight",
                    		lv_weight_7_0, 
                    		"NUMBER");
            	    

            }


            }

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:513:2: (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:513:4: otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleIngredientDef1061); 

                        	newLeafNode(otherlv_8, grammarAccess.getIngredientDefAccess().getSourceKeyword_8_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:517:1: ( (lv_source_9_0= RULE_STRING ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:518:1: (lv_source_9_0= RULE_STRING )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:518:1: (lv_source_9_0= RULE_STRING )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:519:3: lv_source_9_0= RULE_STRING
                    {
                    lv_source_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIngredientDef1078); 

                    			newLeafNode(lv_source_9_0, grammarAccess.getIngredientDefAccess().getSourceSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIngredientDefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"source",
                            		lv_source_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleIngredientDef1097); 

                	newLeafNode(otherlv_10, grammarAccess.getIngredientDefAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleIngredientDef"


    // $ANTLR start "entryRuleIngredientRef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:547:1: entryRuleIngredientRef returns [EObject current=null] : iv_ruleIngredientRef= ruleIngredientRef EOF ;
    public final EObject entryRuleIngredientRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientRef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:548:2: (iv_ruleIngredientRef= ruleIngredientRef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:549:2: iv_ruleIngredientRef= ruleIngredientRef EOF
            {
             newCompositeNode(grammarAccess.getIngredientRefRule()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef1133);
            iv_ruleIngredientRef=ruleIngredientRef();

            state._fsp--;

             current =iv_ruleIngredientRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientRef1143); 

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
    // $ANTLR end "entryRuleIngredientRef"


    // $ANTLR start "ruleIngredientRef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:556:1: ruleIngredientRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIngredientRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:559:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:560:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:560:1: ( (otherlv_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:561:1: (otherlv_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:561:1: (otherlv_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:562:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientRef1187); 

            		newLeafNode(otherlv_0, grammarAccess.getIngredientRefAccess().getIngredientIngredientCrossReference_0()); 
            	

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
    // $ANTLR end "ruleIngredientRef"


    // $ANTLR start "entryRuleIngredientAlias"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:581:1: entryRuleIngredientAlias returns [EObject current=null] : iv_ruleIngredientAlias= ruleIngredientAlias EOF ;
    public final EObject entryRuleIngredientAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientAlias = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:582:2: (iv_ruleIngredientAlias= ruleIngredientAlias EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:583:2: iv_ruleIngredientAlias= ruleIngredientAlias EOF
            {
             newCompositeNode(grammarAccess.getIngredientAliasRule()); 
            pushFollow(FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias1222);
            iv_ruleIngredientAlias=ruleIngredientAlias();

            state._fsp--;

             current =iv_ruleIngredientAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientAlias1232); 

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
    // $ANTLR end "entryRuleIngredientAlias"


    // $ANTLR start "ruleIngredientAlias"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:590:1: ruleIngredientAlias returns [EObject current=null] : (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleIngredientAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_alias_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:28: ( (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:594:1: (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:594:1: (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:594:3: otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleIngredientAlias1269); 

                	newLeafNode(otherlv_0, grammarAccess.getIngredientAliasAccess().getIaliasKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:598:1: ( (lv_alias_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:599:1: (lv_alias_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:599:1: (lv_alias_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:600:3: lv_alias_1_0= RULE_ID
            {
            lv_alias_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientAlias1286); 

            			newLeafNode(lv_alias_1_0, grammarAccess.getIngredientAliasAccess().getAliasIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientAliasRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alias",
                    		lv_alias_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleIngredientAlias1303); 

                	newLeafNode(otherlv_2, grammarAccess.getIngredientAliasAccess().getForKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:620:1: ( (otherlv_3= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:621:1: (otherlv_3= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:621:1: (otherlv_3= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:622:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientAliasRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientAlias1323); 

            		newLeafNode(otherlv_3, grammarAccess.getIngredientAliasAccess().getIngredientIngredientCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleIngredientAlias"


    // $ANTLR start "entryRuleRecipe"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:641:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:642:2: (iv_ruleRecipe= ruleRecipe EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:643:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_ruleRecipe_in_entryRuleRecipe1359);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipe1369); 

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
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:650:1: ruleRecipe returns [EObject current=null] : ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_price_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_toxicity_0_0 = null;

        EObject lv_effects_3_0 = null;

        EObject lv_ingredients_8_0 = null;

        EObject lv_ingredients_10_0 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:653:28: ( ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:654:1: ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:654:1: ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:654:2: ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )*
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:654:2: ( (lv_toxicity_0_0= ruleToxicity ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:655:1: (lv_toxicity_0_0= ruleToxicity )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:655:1: (lv_toxicity_0_0= ruleToxicity )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:656:3: lv_toxicity_0_0= ruleToxicity
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleToxicity_in_ruleRecipe1415);
            lv_toxicity_0_0=ruleToxicity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecipeRule());
            	        }
                   		set(
                   			current, 
                   			"toxicity",
                    		lv_toxicity_0_0, 
                    		"Toxicity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:672:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:673:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:673:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:674:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipe1432); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleRecipe1449); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:694:1: ( (lv_effects_3_0= ruleEffectRef ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:695:1: (lv_effects_3_0= ruleEffectRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:695:1: (lv_effects_3_0= ruleEffectRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:696:3: lv_effects_3_0= ruleEffectRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectRef_in_ruleRecipe1470);
            	    lv_effects_3_0=ruleEffectRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"effects",
            	            		lv_effects_3_0, 
            	            		"EffectRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:712:3: (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:712:5: otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRecipe1484); 

                        	newLeafNode(otherlv_4, grammarAccess.getRecipeAccess().getPriceKeyword_4_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:716:1: ( (lv_price_5_0= RULE_NUMBER ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:1: (lv_price_5_0= RULE_NUMBER )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:1: (lv_price_5_0= RULE_NUMBER )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:718:3: lv_price_5_0= RULE_NUMBER
                    {
                    lv_price_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleRecipe1501); 

                    			newLeafNode(lv_price_5_0, grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"price",
                            		lv_price_5_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleRecipe1520); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleRecipe1532); 

                	newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getEqualsSignKeyword_6());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:742:1: ( (lv_ingredients_8_0= ruleIngredientRef ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:743:1: (lv_ingredients_8_0= ruleIngredientRef )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:743:1: (lv_ingredients_8_0= ruleIngredientRef )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:744:3: lv_ingredients_8_0= ruleIngredientRef
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleIngredientRef_in_ruleRecipe1553);
            lv_ingredients_8_0=ruleIngredientRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecipeRule());
            	        }
                   		add(
                   			current, 
                   			"ingredients",
                    		lv_ingredients_8_0, 
                    		"IngredientRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:760:2: (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:760:4: otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleRecipe1566); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getPlusSignKeyword_8_0());
            	        
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:764:1: ( (lv_ingredients_10_0= ruleIngredientRef ) )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:765:1: (lv_ingredients_10_0= ruleIngredientRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:765:1: (lv_ingredients_10_0= ruleIngredientRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:766:3: lv_ingredients_10_0= ruleIngredientRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIngredientRef_in_ruleRecipe1587);
            	    lv_ingredients_10_0=ruleIngredientRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ingredients",
            	            		lv_ingredients_10_0, 
            	            		"IngredientRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "ruleEffectType"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:790:1: ruleEffectType returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleEffectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:792:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:793:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:793:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:793:2: (enumLiteral_0= '+' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:793:2: (enumLiteral_0= '+' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:793:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleEffectType1639); 

                            current = grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:799:6: (enumLiteral_1= '-' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:799:6: (enumLiteral_1= '-' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:799:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleEffectType1656); 

                            current = grammarAccess.getEffectTypeAccess().getWEAKENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEffectTypeAccess().getWEAKENEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleEffectType"


    // $ANTLR start "ruleToxicity"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:809:1: ruleToxicity returns [Enumerator current=null] : ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) ) ;
    public final Enumerator ruleToxicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:811:28: ( ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:812:1: ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:812:1: ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:812:2: (enumLiteral_0= 'potion' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:812:2: (enumLiteral_0= 'potion' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:812:4: enumLiteral_0= 'potion'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleToxicity1701); 

                            current = grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:818:6: (enumLiteral_1= 'poison' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:818:6: (enumLiteral_1= 'poison' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:818:8: enumLiteral_1= 'poison'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleToxicity1718); 

                            current = grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:824:6: (enumLiteral_2= 'mixture' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:824:6: (enumLiteral_2= 'mixture' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:824:8: enumLiteral_2= 'mixture'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleToxicity1735); 

                            current = grammarAccess.getToxicityAccess().getMIXTUREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getToxicityAccess().getMIXTUREEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleToxicity"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAlchemyLabModel_in_entryRuleAlchemyLabModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlchemyLabModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAlchemyLabModel131 = new BitSet(new long[]{0x00000000E20A1002L});
    public static final BitSet FOLLOW_ruleIngredient_in_ruleAlchemyLabModel153 = new BitSet(new long[]{0x00000000E2080002L});
    public static final BitSet FOLLOW_ruleRecipe_in_ruleAlchemyLabModel175 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_ruleEffect269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectAlias_in_ruleEffect296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_entryRuleEffectDef331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectDef341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEffectDef378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectDef395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEffectDef412 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEffectType_in_ruleEffectDef433 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEffectDef445 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEffectDef458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEffectDef475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_entryRuleEffectRef518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRef528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEffectRef565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectRef585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectAlias631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEffectAlias668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectAlias685 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEffectAlias702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectAlias722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredient768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_ruleIngredient815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientAlias_in_ruleIngredient842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientDef887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleIngredientDef924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientDef941 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIngredientDef958 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_ruleEffectRef_in_ruleIngredientDef979 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleIngredientDef992 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIngredientDef1009 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIngredientDef1026 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIngredientDef1043 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleIngredientDef1061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIngredientDef1078 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIngredientDef1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientRef1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientRef1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientAlias1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIngredientAlias1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientAlias1286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIngredientAlias1303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientAlias1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe1359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipe1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToxicity_in_ruleRecipe1415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipe1432 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecipe1449 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEffectRef_in_ruleRecipe1470 = new BitSet(new long[]{0x0000000001210000L});
    public static final BitSet FOLLOW_21_in_ruleRecipe1484 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleRecipe1501 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRecipe1520 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRecipe1532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_ruleRecipe1553 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleRecipe1566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_ruleRecipe1587 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleEffectType1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEffectType1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleToxicity1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleToxicity1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleToxicity1735 = new BitSet(new long[]{0x0000000000000002L});

}