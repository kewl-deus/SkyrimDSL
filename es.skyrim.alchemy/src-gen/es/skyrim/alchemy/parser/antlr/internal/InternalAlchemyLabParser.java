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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'effect'", "'('", "')'", "':'", "'->'", "'ealias'", "'for'", "'ingredient'", "'{'", "'price:'", "'weight:'", "'source:'", "'}'", "'ialias'", "'='", "'+'", "'-'", "'potion'", "'poison'", "'mixture'"
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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:77:1: ruleAlchemyLabModel returns [EObject current=null] : ( ( (lv_effects_0_0= ruleEffectDef ) )* ( (lv_ingredients_1_0= ruleIngredientDef ) )* ( (lv_recipes_2_0= ruleRecipe ) )* ) ;
    public final EObject ruleAlchemyLabModel() throws RecognitionException {
        EObject current = null;

        EObject lv_effects_0_0 = null;

        EObject lv_ingredients_1_0 = null;

        EObject lv_recipes_2_0 = null;


         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:80:28: ( ( ( (lv_effects_0_0= ruleEffectDef ) )* ( (lv_ingredients_1_0= ruleIngredientDef ) )* ( (lv_recipes_2_0= ruleRecipe ) )* ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:1: ( ( (lv_effects_0_0= ruleEffectDef ) )* ( (lv_ingredients_1_0= ruleIngredientDef ) )* ( (lv_recipes_2_0= ruleRecipe ) )* )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:1: ( ( (lv_effects_0_0= ruleEffectDef ) )* ( (lv_ingredients_1_0= ruleIngredientDef ) )* ( (lv_recipes_2_0= ruleRecipe ) )* )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:2: ( (lv_effects_0_0= ruleEffectDef ) )* ( (lv_ingredients_1_0= ruleIngredientDef ) )* ( (lv_recipes_2_0= ruleRecipe ) )*
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:81:2: ( (lv_effects_0_0= ruleEffectDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:82:1: (lv_effects_0_0= ruleEffectDef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:82:1: (lv_effects_0_0= ruleEffectDef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:83:3: lv_effects_0_0= ruleEffectDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlchemyLabModelAccess().getEffectsEffectDefParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectDef_in_ruleAlchemyLabModel131);
            	    lv_effects_0_0=ruleEffectDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlchemyLabModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"effects",
            	            		lv_effects_0_0, 
            	            		"EffectDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:99:3: ( (lv_ingredients_1_0= ruleIngredientDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:100:1: (lv_ingredients_1_0= ruleIngredientDef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:100:1: (lv_ingredients_1_0= ruleIngredientDef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:101:3: lv_ingredients_1_0= ruleIngredientDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlchemyLabModelAccess().getIngredientsIngredientDefParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIngredientDef_in_ruleAlchemyLabModel153);
            	    lv_ingredients_1_0=ruleIngredientDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlchemyLabModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ingredients",
            	            		lv_ingredients_1_0, 
            	            		"IngredientDef");
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

                if ( ((LA3_0>=28 && LA3_0<=30)) ) {
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


    // $ANTLR start "entryRuleEffectDef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:145:1: entryRuleEffectDef returns [EObject current=null] : iv_ruleEffectDef= ruleEffectDef EOF ;
    public final EObject entryRuleEffectDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectDef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:146:2: (iv_ruleEffectDef= ruleEffectDef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:147:2: iv_ruleEffectDef= ruleEffectDef EOF
            {
             newCompositeNode(grammarAccess.getEffectDefRule()); 
            pushFollow(FOLLOW_ruleEffectDef_in_entryRuleEffectDef214);
            iv_ruleEffectDef=ruleEffectDef();

            state._fsp--;

             current =iv_ruleEffectDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectDef224); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:154:1: ruleEffectDef returns [EObject current=null] : (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? ) ;
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
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:157:28: ( (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:158:1: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:158:1: (otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )? )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:158:3: otherlv_0= 'effect' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleEffectType ) ) otherlv_4= ')' (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEffectDef261); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectDefAccess().getEffectKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:162:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:163:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:163:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:164:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectDef278); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEffectDef295); 

                	newLeafNode(otherlv_2, grammarAccess.getEffectDefAccess().getLeftParenthesisKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:184:1: ( (lv_type_3_0= ruleEffectType ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:185:1: (lv_type_3_0= ruleEffectType )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:185:1: (lv_type_3_0= ruleEffectType )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:186:3: lv_type_3_0= ruleEffectType
            {
             
            	        newCompositeNode(grammarAccess.getEffectDefAccess().getTypeEffectTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEffectType_in_ruleEffectDef316);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEffectDef328); 

                	newLeafNode(otherlv_4, grammarAccess.getEffectDefAccess().getRightParenthesisKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:206:1: (otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:206:3: otherlv_5= ':' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEffectDef341); 

                        	newLeafNode(otherlv_5, grammarAccess.getEffectDefAccess().getColonKeyword_5_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:210:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:211:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:211:1: (lv_description_6_0= RULE_STRING )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:212:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEffectDef358); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:236:1: entryRuleEffectRef returns [EObject current=null] : iv_ruleEffectRef= ruleEffectRef EOF ;
    public final EObject entryRuleEffectRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectRef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:237:2: (iv_ruleEffectRef= ruleEffectRef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:238:2: iv_ruleEffectRef= ruleEffectRef EOF
            {
             newCompositeNode(grammarAccess.getEffectRefRule()); 
            pushFollow(FOLLOW_ruleEffectRef_in_entryRuleEffectRef401);
            iv_ruleEffectRef=ruleEffectRef();

            state._fsp--;

             current =iv_ruleEffectRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectRef411); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:245:1: ruleEffectRef returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEffectRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:248:28: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:1: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:249:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEffectRef448); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectRefAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:253:1: ( (otherlv_1= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:254:1: (otherlv_1= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:254:1: (otherlv_1= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:255:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectRef468); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:274:1: entryRuleEffectAlias returns [EObject current=null] : iv_ruleEffectAlias= ruleEffectAlias EOF ;
    public final EObject entryRuleEffectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectAlias = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:275:2: (iv_ruleEffectAlias= ruleEffectAlias EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:276:2: iv_ruleEffectAlias= ruleEffectAlias EOF
            {
             newCompositeNode(grammarAccess.getEffectAliasRule()); 
            pushFollow(FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias504);
            iv_ruleEffectAlias=ruleEffectAlias();

            state._fsp--;

             current =iv_ruleEffectAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffectAlias514); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:283:1: ruleEffectAlias returns [EObject current=null] : (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleEffectAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_alias_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:286:28: ( (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:1: (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:1: (otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:287:3: otherlv_0= 'ealias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEffectAlias551); 

                	newLeafNode(otherlv_0, grammarAccess.getEffectAliasAccess().getEaliasKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:291:1: ( (lv_alias_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:292:1: (lv_alias_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:292:1: (lv_alias_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:293:3: lv_alias_1_0= RULE_ID
            {
            lv_alias_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectAlias568); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEffectAlias585); 

                	newLeafNode(otherlv_2, grammarAccess.getEffectAliasAccess().getForKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:313:1: ( (otherlv_3= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:314:1: (otherlv_3= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:314:1: (otherlv_3= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:315:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEffectAliasRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEffectAlias605); 

            		newLeafNode(otherlv_3, grammarAccess.getEffectAliasAccess().getEffectEffectDefCrossReference_3_0()); 
            	

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


    // $ANTLR start "entryRuleIngredientDef"
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:336:1: entryRuleIngredientDef returns [EObject current=null] : iv_ruleIngredientDef= ruleIngredientDef EOF ;
    public final EObject entryRuleIngredientDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientDef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:337:2: (iv_ruleIngredientDef= ruleIngredientDef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:338:2: iv_ruleIngredientDef= ruleIngredientDef EOF
            {
             newCompositeNode(grammarAccess.getIngredientDefRule()); 
            pushFollow(FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef643);
            iv_ruleIngredientDef=ruleIngredientDef();

            state._fsp--;

             current =iv_ruleIngredientDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientDef653); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:345:1: ruleIngredientDef returns [EObject current=null] : (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:348:28: ( (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:349:1: (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:349:1: (otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:349:3: otherlv_0= 'ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )* otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) otherlv_6= 'weight:' ( (lv_weight_7_0= RULE_NUMBER ) ) (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIngredientDef690); 

                	newLeafNode(otherlv_0, grammarAccess.getIngredientDefAccess().getIngredientKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:353:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:354:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:354:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientDef707); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleIngredientDef724); 

                	newLeafNode(otherlv_2, grammarAccess.getIngredientDefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:375:1: ( (lv_effects_3_0= ruleEffectRef ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:376:1: (lv_effects_3_0= ruleEffectRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:376:1: (lv_effects_3_0= ruleEffectRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:377:3: lv_effects_3_0= ruleEffectRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIngredientDefAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectRef_in_ruleIngredientDef745);
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleIngredientDef758); 

                	newLeafNode(otherlv_4, grammarAccess.getIngredientDefAccess().getPriceKeyword_4());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:397:1: ( (lv_price_5_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:398:1: (lv_price_5_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:398:1: (lv_price_5_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:399:3: lv_price_5_0= RULE_NUMBER
            {
            lv_price_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIngredientDef775); 

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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleIngredientDef792); 

                	newLeafNode(otherlv_6, grammarAccess.getIngredientDefAccess().getWeightKeyword_6());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:419:1: ( (lv_weight_7_0= RULE_NUMBER ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:420:1: (lv_weight_7_0= RULE_NUMBER )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:420:1: (lv_weight_7_0= RULE_NUMBER )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:421:3: lv_weight_7_0= RULE_NUMBER
            {
            lv_weight_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIngredientDef809); 

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

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:437:2: (otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:437:4: otherlv_8= 'source:' ( (lv_source_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleIngredientDef827); 

                        	newLeafNode(otherlv_8, grammarAccess.getIngredientDefAccess().getSourceKeyword_8_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:441:1: ( (lv_source_9_0= RULE_STRING ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:442:1: (lv_source_9_0= RULE_STRING )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:442:1: (lv_source_9_0= RULE_STRING )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:443:3: lv_source_9_0= RULE_STRING
                    {
                    lv_source_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIngredientDef844); 

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

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleIngredientDef863); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:471:1: entryRuleIngredientRef returns [EObject current=null] : iv_ruleIngredientRef= ruleIngredientRef EOF ;
    public final EObject entryRuleIngredientRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientRef = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:472:2: (iv_ruleIngredientRef= ruleIngredientRef EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:473:2: iv_ruleIngredientRef= ruleIngredientRef EOF
            {
             newCompositeNode(grammarAccess.getIngredientRefRule()); 
            pushFollow(FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef899);
            iv_ruleIngredientRef=ruleIngredientRef();

            state._fsp--;

             current =iv_ruleIngredientRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientRef909); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:480:1: ruleIngredientRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIngredientRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:483:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:484:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:484:1: ( (otherlv_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:485:1: (otherlv_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:485:1: (otherlv_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:486:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientRef953); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:505:1: entryRuleIngredientAlias returns [EObject current=null] : iv_ruleIngredientAlias= ruleIngredientAlias EOF ;
    public final EObject entryRuleIngredientAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredientAlias = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:506:2: (iv_ruleIngredientAlias= ruleIngredientAlias EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:507:2: iv_ruleIngredientAlias= ruleIngredientAlias EOF
            {
             newCompositeNode(grammarAccess.getIngredientAliasRule()); 
            pushFollow(FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias988);
            iv_ruleIngredientAlias=ruleIngredientAlias();

            state._fsp--;

             current =iv_ruleIngredientAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIngredientAlias998); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:514:1: ruleIngredientAlias returns [EObject current=null] : (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleIngredientAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_alias_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:517:28: ( (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:518:1: (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:518:1: (otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:518:3: otherlv_0= 'ialias' ( (lv_alias_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleIngredientAlias1035); 

                	newLeafNode(otherlv_0, grammarAccess.getIngredientAliasAccess().getIaliasKeyword_0());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:522:1: ( (lv_alias_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:523:1: (lv_alias_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:523:1: (lv_alias_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:524:3: lv_alias_1_0= RULE_ID
            {
            lv_alias_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientAlias1052); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIngredientAlias1069); 

                	newLeafNode(otherlv_2, grammarAccess.getIngredientAliasAccess().getForKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:544:1: ( (otherlv_3= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:545:1: (otherlv_3= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:545:1: (otherlv_3= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:546:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIngredientAliasRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIngredientAlias1089); 

            		newLeafNode(otherlv_3, grammarAccess.getIngredientAliasAccess().getIngredientIngredientDefCrossReference_3_0()); 
            	

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:565:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:566:2: (iv_ruleRecipe= ruleRecipe EOF )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:567:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_ruleRecipe_in_entryRuleRecipe1125);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipe1135); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:574:1: ruleRecipe returns [EObject current=null] : ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* ) ;
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
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:577:28: ( ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:578:1: ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:578:1: ( ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )* )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:578:2: ( (lv_toxicity_0_0= ruleToxicity ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffectRef ) )+ (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )? otherlv_6= '}' otherlv_7= '=' ( (lv_ingredients_8_0= ruleIngredientRef ) ) (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )*
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:578:2: ( (lv_toxicity_0_0= ruleToxicity ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:579:1: (lv_toxicity_0_0= ruleToxicity )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:579:1: (lv_toxicity_0_0= ruleToxicity )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:580:3: lv_toxicity_0_0= ruleToxicity
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getToxicityToxicityEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleToxicity_in_ruleRecipe1181);
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

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:596:2: ( (lv_name_1_0= RULE_ID ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:597:1: (lv_name_1_0= RULE_ID )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipe1198); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRecipe1215); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:618:1: ( (lv_effects_3_0= ruleEffectRef ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:619:1: (lv_effects_3_0= ruleEffectRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:619:1: (lv_effects_3_0= ruleEffectRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:620:3: lv_effects_3_0= ruleEffectRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecipeAccess().getEffectsEffectRefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEffectRef_in_ruleRecipe1236);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:636:3: (otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:636:5: otherlv_4= 'price:' ( (lv_price_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleRecipe1250); 

                        	newLeafNode(otherlv_4, grammarAccess.getRecipeAccess().getPriceKeyword_4_0());
                        
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:640:1: ( (lv_price_5_0= RULE_NUMBER ) )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:641:1: (lv_price_5_0= RULE_NUMBER )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:641:1: (lv_price_5_0= RULE_NUMBER )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:642:3: lv_price_5_0= RULE_NUMBER
                    {
                    lv_price_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleRecipe1267); 

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRecipe1286); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleRecipe1298); 

                	newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getEqualsSignKeyword_6());
                
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:666:1: ( (lv_ingredients_8_0= ruleIngredientRef ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:667:1: (lv_ingredients_8_0= ruleIngredientRef )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:667:1: (lv_ingredients_8_0= ruleIngredientRef )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:668:3: lv_ingredients_8_0= ruleIngredientRef
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleIngredientRef_in_ruleRecipe1319);
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

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:684:2: (otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:684:4: otherlv_9= '+' ( (lv_ingredients_10_0= ruleIngredientRef ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleRecipe1332); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getPlusSignKeyword_8_0());
            	        
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:688:1: ( (lv_ingredients_10_0= ruleIngredientRef ) )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:689:1: (lv_ingredients_10_0= ruleIngredientRef )
            	    {
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:689:1: (lv_ingredients_10_0= ruleIngredientRef )
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:690:3: lv_ingredients_10_0= ruleIngredientRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientRefParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIngredientRef_in_ruleRecipe1353);
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
            	    break loop9;
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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:714:1: ruleEffectType returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleEffectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:716:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:2: (enumLiteral_0= '+' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:2: (enumLiteral_0= '+' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:717:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleEffectType1405); 

                            current = grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEffectTypeAccess().getFORTIFYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:723:6: (enumLiteral_1= '-' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:723:6: (enumLiteral_1= '-' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:723:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleEffectType1422); 

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
    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:733:1: ruleToxicity returns [Enumerator current=null] : ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) ) ;
    public final Enumerator ruleToxicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:735:28: ( ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) ) )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:736:1: ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) )
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:736:1: ( (enumLiteral_0= 'potion' ) | (enumLiteral_1= 'poison' ) | (enumLiteral_2= 'mixture' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:736:2: (enumLiteral_0= 'potion' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:736:2: (enumLiteral_0= 'potion' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:736:4: enumLiteral_0= 'potion'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleToxicity1467); 

                            current = grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getToxicityAccess().getPOTIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:742:6: (enumLiteral_1= 'poison' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:742:6: (enumLiteral_1= 'poison' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:742:8: enumLiteral_1= 'poison'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleToxicity1484); 

                            current = grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getToxicityAccess().getPOISONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:748:6: (enumLiteral_2= 'mixture' )
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:748:6: (enumLiteral_2= 'mixture' )
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:748:8: enumLiteral_2= 'mixture'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleToxicity1501); 

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
    public static final BitSet FOLLOW_ruleEffectDef_in_ruleAlchemyLabModel131 = new BitSet(new long[]{0x0000000070040802L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_ruleAlchemyLabModel153 = new BitSet(new long[]{0x0000000070040002L});
    public static final BitSet FOLLOW_ruleRecipe_in_ruleAlchemyLabModel175 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_ruleEffectDef_in_entryRuleEffectDef214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectDef224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEffectDef261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectDef278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEffectDef295 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleEffectType_in_ruleEffectDef316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEffectDef328 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleEffectDef341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEffectDef358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectRef_in_entryRuleEffectRef401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectRef411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEffectRef448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectRef468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffectAlias_in_entryRuleEffectAlias504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffectAlias514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEffectAlias551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectAlias568 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEffectAlias585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEffectAlias605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientDef_in_entryRuleIngredientDef643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientDef653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIngredientDef690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientDef707 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIngredientDef724 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_ruleEffectRef_in_ruleIngredientDef745 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleIngredientDef758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIngredientDef775 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIngredientDef792 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIngredientDef809 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleIngredientDef827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIngredientDef844 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIngredientDef863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_entryRuleIngredientRef899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientRef909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientRef953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIngredientAlias_in_entryRuleIngredientAlias988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIngredientAlias998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIngredientAlias1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientAlias1052 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIngredientAlias1069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIngredientAlias1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipe1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToxicity_in_ruleRecipe1181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipe1198 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipe1215 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleEffectRef_in_ruleRecipe1236 = new BitSet(new long[]{0x0000000000908000L});
    public static final BitSet FOLLOW_20_in_ruleRecipe1250 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleRecipe1267 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRecipe1286 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRecipe1298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_ruleRecipe1319 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRecipe1332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIngredientRef_in_ruleRecipe1353 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEffectType1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEffectType1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleToxicity1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleToxicity1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleToxicity1501 = new BitSet(new long[]{0x0000000000000002L});

}