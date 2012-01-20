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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ingredient'", "'{'", "'price:'", "'weight:'", "'source:'", "'}'", "'effect'", "'('", "')'", "':'", "'->'", "'='", "'+'", "'-'", "'potion'", "'poison'"
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

                if ( (LA1_0==18) ) {
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

                if ( (LA2_0==12) ) {
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

                if ( ((LA3_0>=26 && LA3_0<=27)) ) {
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


    // $ANTLR start "entryRuleIngredient"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:143:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:144:2: (iv_ruleIngredient= ruleIngredient EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:145:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_ruleIngredient_in_entryRuleIngredient212);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredient222); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:152:1: ruleIngredient returns [EObject current=null] : (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruleIngredient() throws RecognitionException {
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
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:155:28: ( (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:156:1: (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:156:1: (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:156:3: otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleIngredient259); 

                	newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getIngredientKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:160:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:161:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:161:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:162:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredient276); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleIngredient293); 

                	newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:182:1: ( (lv_effects_3_0= ruleEffectRef ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:183:1: (lv_effects_3_0= ruleEffectRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:183:1: (lv_effects_3_0= ruleEffectRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:184:3: lv_effects_3_0= ruleEffectRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIngredientAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectRef_in_ruleIngredient314);
            	    lv_effects_3_0=ruleEffectRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIngredientRule());
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleIngredient327); 

                	newLeafNode(otherlv_4, grammarAccess.getIngredientAccess().getPriceKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:204:1: ( (lv_price_5_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:205:1: (lv_price_5_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:205:1: (lv_price_5_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:206:3: lv_price_5_0= RULE_NUMBER
            {
            lv_price_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIngredient344); 

            			newLeafNode(lv_price_5_0, grammarAccess.getIngredientAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"price",
                    		lv_price_5_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleIngredient361); 

                	newLeafNode(otherlv_6, grammarAccess.getIngredientAccess().getWeightKeyword_6());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:226:1: ( (lv_weight_7_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:227:1: (lv_weight_7_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:227:1: (lv_weight_7_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:228:3: lv_weight_7_0= RULE_NUMBER
            {
            lv_weight_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIngredient378); 

            			newLeafNode(lv_weight_7_0, grammarAccess.getIngredientAccess().getWeightNUMBERTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weight",
                    		lv_weight_7_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleIngredient395); 

                	newLeafNode(otherlv_8, grammarAccess.getIngredientAccess().getSourceKeyword_8());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:248:1: ( (lv_source_9_0= RULE_STRING ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:1: (lv_source_9_0= RULE_STRING )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:1: (lv_source_9_0= RULE_STRING )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:250:3: lv_source_9_0= RULE_STRING
            {
            lv_source_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIngredient412); 

            			newLeafNode(lv_source_9_0, grammarAccess.getIngredientAccess().getSourceSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"source",
                    		lv_source_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleIngredient429); 

                	newLeafNode(otherlv_10, grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleEffect"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:278:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:279:2: (iv_ruleEffect= ruleEffect EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:280:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect465);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect475); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEffect() throws RecognitionException {
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
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:290:28: ( (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:291:1: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:291:1: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:291:3: otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEffect512); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:295:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:296:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:296:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:297:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffect529); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEffect546); 

                	newLeafNode(otherlv_2, grammarAccess.getEffectAccess().getLeftParenthesisKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:317:1: ( (lv_type_3_0= ruleEffectType ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:318:1: (lv_type_3_0= ruleEffectType )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:318:1: (lv_type_3_0= ruleEffectType )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:319:3: lv_type_3_0= ruleEffectType
            {
             
            	        newCompositeNode(grammarAccess.getEffectAccess().getTypeEffectTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEffectType_in_ruleEffect567);
            lv_type_3_0=ruleEffectType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEffectRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"EffectType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleEffect579); 

                	newLeafNode(otherlv_4, grammarAccess.getEffectAccess().getRightParenthesisKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:339:1: (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:339:3: otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleEffect592); 

                        	newLeafNode(otherlv_5, grammarAccess.getEffectAccess().getColonKeyword_5_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:343:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:344:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:344:1: (lv_description_6_0= RULE_STRING )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:345:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEffect609); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getEffectAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEffectRule());
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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEffectRef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:369:1: entryRuleEffectRef returns [EObject current=null] : iv_ruleEffectRef= ruleEffectRef EOF ;
    public final EObject entryRuleEffectRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectRef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:370:2: (iv_ruleEffectRef= ruleEffectRef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:371:2: iv_ruleEffectRef= ruleEffectRef EOF
            {
             newCompositeNode(grammarAccess.getEffectRefRule()); 
            pushFollow(FOLLOW_ruleEffectRef_in_entryRuleEffectRef652);
            iv_ruleEffectRef=ruleEffectRef();

            state._fsp--;

             current =iv_ruleEffectRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRef662); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:378:1: ruleEffectRef returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEffectRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:381:28: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:382:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:382:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:382:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEffectRef699); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:386:1: ( (otherlv_1= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:387:1: (otherlv_1= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:387:1: (otherlv_1= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:388:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectRef719); 

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


    // $ANTLR start "entryRuleRecipe"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:407:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:408:2: (iv_ruleRecipe= ruleRecipe EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:409:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_ruleRecipe_in_entryRuleRecipe755);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipe765); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:416:1: ruleRecipe returns [EObject current=null] : ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= '}' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '+' ( (otherlv_10= RULE_ID ) ) )* ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_price_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_toxicity_0_0 = null;

        EObject lv_effects_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:419:28: ( ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= '}' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '+' ( (otherlv_10= RULE_ID ) ) )* ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:420:1: ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= '}' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '+' ( (otherlv_10= RULE_ID ) ) )* )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:420:1: ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= '}' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '+' ( (otherlv_10= RULE_ID ) ) )* )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:420:2: ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= '}' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '+' ( (otherlv_10= RULE_ID ) ) )*
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:420:2: ( (lv_toxicity_0_0= ruleToxicity ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:421:1: (lv_toxicity_0_0= ruleToxicity )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:421:1: (lv_toxicity_0_0= ruleToxicity )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:422:3: lv_toxicity_0_0= ruleToxicity
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleToxicity_in_ruleRecipe811);
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

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:438:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:439:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipe828); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRecipe845); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:460:1: ( (lv_effects_3_0= ruleEffectRef ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:461:1: (lv_effects_3_0= ruleEffectRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:461:1: (lv_effects_3_0= ruleEffectRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:462:3: lv_effects_3_0= ruleEffectRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectRef_in_ruleRecipe866);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRecipe879); 

                	newLeafNode(otherlv_4, grammarAccess.getRecipeAccess().getPriceKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:482:1: ( (lv_price_5_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:483:1: (lv_price_5_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:483:1: (lv_price_5_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:484:3: lv_price_5_0= RULE_NUMBER
            {
            lv_price_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleRecipe896); 

            			newLeafNode(lv_price_5_0, grammarAccess.getRecipeAccess().getPriceNUMBERTerminalRuleCall_5_0()); 
            		

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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleRecipe913); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleRecipe925); 

                	newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getEqualsSignKeyword_7());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:508:1: ( (otherlv_8= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:509:1: (otherlv_8= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:509:1: (otherlv_8= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:510:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipeRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipe945); 

            		newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getIngredientsIngredientCrossReference_8_0()); 
            	

            }


            }

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:521:2: (otherlv_9= '+' ( (otherlv_10= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:521:4: otherlv_9= '+' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleRecipe958); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getPlusSignKeyword_9_0());
            	        
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:525:1: ( (otherlv_10= RULE_ID ) )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:526:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:526:1: (otherlv_10= RULE_ID )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:527:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRecipeRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipe978); 

            	    		newLeafNode(otherlv_10, grammarAccess.getRecipeAccess().getIngredientsIngredientCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:546:1: ruleEffectType returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleEffectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:548:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:549:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:549:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:549:2: (enumLiteral_0= '+' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:549:2: (enumLiteral_0= '+' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:549:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleEffectType1030); 

                            current = grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:555:6: (enumLiteral_1= '-' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:555:6: (enumLiteral_1= '-' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:555:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleEffectType1047); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:565:1: ruleToxicity returns [Enumerator current=null] : ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) ) ;
    public final Enumerator ruleToxicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:567:28: ( ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:568:1: ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:568:1: ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:568:2: (enumLiteral_0= 'potion' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:568:2: (enumLiteral_0= 'potion' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:568:4: enumLiteral_0= 'potion'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleToxicity1092); 

                            current = grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:574:6: (enumLiteral_1= 'poison' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:574:6: (enumLiteral_1= 'poison' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:574:8: enumLiteral_1= 'poison'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleToxicity1109); 

                            current = grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 
                        

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
    public static final BitSet FOLLOW_ruleEffect_in_ruleAlchemyLabModel131 = new BitSet(new long[]{0x000000000C041002L});
    public static final BitSet FOLLOW_ruleIngredient_in_ruleAlchemyLabModel153 = new BitSet(new long[]{0x000000000C001002L});
    public static final BitSet FOLLOW_ruleRecipe_in_ruleAlchemyLabModel175 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredient222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleIngredient259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredient276 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIngredient293 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_ruleEffectRef_in_ruleIngredient314 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleIngredient327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIngredient344 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIngredient361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIngredient378 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIngredient395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIngredient412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIngredient429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEffect512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffect529 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEffect546 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleEffectType_in_ruleEffect567 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEffect579 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleEffect592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEffect609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_entryRuleEffectRef652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRef662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEffectRef699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectRef719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipe765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToxicity_in_ruleRecipe811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipe828 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipe845 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleEffectRef_in_ruleRecipe866 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleRecipe879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleRecipe896 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRecipe913 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRecipe925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipe945 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRecipe958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipe978 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleEffectType1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEffectType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleToxicity1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleToxicity1109 = new BitSet(new long[]{0x0000000000000002L});

}