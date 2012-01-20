/*
* generated by Xtext
*/

package es.skyrim.alchemy.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class AlchemyLabGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AlchemyLabModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AlchemyLabModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEffectsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEffectsEffectParserRuleCall_0_0 = (RuleCall)cEffectsAssignment_0.eContents().get(0);
		private final Assignment cIngredientsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIngredientsIngredientParserRuleCall_1_0 = (RuleCall)cIngredientsAssignment_1.eContents().get(0);
		private final Assignment cRecipesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRecipesRecipeParserRuleCall_2_0 = (RuleCall)cRecipesAssignment_2.eContents().get(0);
		
		//AlchemyLabModel:
		//	effects+=Effect* ingredients+=Ingredient* recipes+=Recipe*;
		public ParserRule getRule() { return rule; }

		//effects+=Effect* ingredients+=Ingredient* recipes+=Recipe*
		public Group getGroup() { return cGroup; }

		//effects+=Effect*
		public Assignment getEffectsAssignment_0() { return cEffectsAssignment_0; }

		//Effect
		public RuleCall getEffectsEffectParserRuleCall_0_0() { return cEffectsEffectParserRuleCall_0_0; }

		//ingredients+=Ingredient*
		public Assignment getIngredientsAssignment_1() { return cIngredientsAssignment_1; }

		//Ingredient
		public RuleCall getIngredientsIngredientParserRuleCall_1_0() { return cIngredientsIngredientParserRuleCall_1_0; }

		//recipes+=Recipe*
		public Assignment getRecipesAssignment_2() { return cRecipesAssignment_2; }

		//Recipe
		public RuleCall getRecipesRecipeParserRuleCall_2_0() { return cRecipesRecipeParserRuleCall_2_0; }
	}

	public class EffectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Effect");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEffectDefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEffectAliasParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Effect:
		//	EffectDef | EffectAlias;
		public ParserRule getRule() { return rule; }

		//EffectDef | EffectAlias
		public Alternatives getAlternatives() { return cAlternatives; }

		//EffectDef
		public RuleCall getEffectDefParserRuleCall_0() { return cEffectDefParserRuleCall_0; }

		//EffectAlias
		public RuleCall getEffectAliasParserRuleCall_1() { return cEffectAliasParserRuleCall_1; }
	}

	public class EffectDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EffectDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEffectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeEffectTypeEnumRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDescriptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cDescriptionAssignment_5_1.eContents().get(0);
		
		//EffectDef:
		//	"effect" name=ID "(" type=EffectType ")" (":" description=STRING)?;
		public ParserRule getRule() { return rule; }

		//"effect" name=ID "(" type=EffectType ")" (":" description=STRING)?
		public Group getGroup() { return cGroup; }

		//"effect"
		public Keyword getEffectKeyword_0() { return cEffectKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//type=EffectType
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//EffectType
		public RuleCall getTypeEffectTypeEnumRuleCall_3_0() { return cTypeEffectTypeEnumRuleCall_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//(":" description=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//":"
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_5_1() { return cDescriptionAssignment_5_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_5_1_0() { return cDescriptionSTRINGTerminalRuleCall_5_1_0; }
	}

	public class EffectRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EffectRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEffectAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEffectEffectCrossReference_1_0 = (CrossReference)cEffectAssignment_1.eContents().get(0);
		private final RuleCall cEffectEffectIDTerminalRuleCall_1_0_1 = (RuleCall)cEffectEffectCrossReference_1_0.eContents().get(1);
		
		//EffectRef returns Effect:
		//	"->" effect=[Effect];
		public ParserRule getRule() { return rule; }

		//"->" effect=[Effect]
		public Group getGroup() { return cGroup; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }

		//effect=[Effect]
		public Assignment getEffectAssignment_1() { return cEffectAssignment_1; }

		//[Effect]
		public CrossReference getEffectEffectCrossReference_1_0() { return cEffectEffectCrossReference_1_0; }

		//ID
		public RuleCall getEffectEffectIDTerminalRuleCall_1_0_1() { return cEffectEffectIDTerminalRuleCall_1_0_1; }
	}

	public class EffectAliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EffectAlias");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEaliasKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAliasAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_1_0 = (RuleCall)cAliasAssignment_1.eContents().get(0);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEffectAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cEffectEffectCrossReference_3_0 = (CrossReference)cEffectAssignment_3.eContents().get(0);
		private final RuleCall cEffectEffectIDTerminalRuleCall_3_0_1 = (RuleCall)cEffectEffectCrossReference_3_0.eContents().get(1);
		
		//EffectAlias:
		//	"ealias" alias=ID "for" effect=[Effect];
		public ParserRule getRule() { return rule; }

		//"ealias" alias=ID "for" effect=[Effect]
		public Group getGroup() { return cGroup; }

		//"ealias"
		public Keyword getEaliasKeyword_0() { return cEaliasKeyword_0; }

		//alias=ID
		public Assignment getAliasAssignment_1() { return cAliasAssignment_1; }

		//ID
		public RuleCall getAliasIDTerminalRuleCall_1_0() { return cAliasIDTerminalRuleCall_1_0; }

		//"for"
		public Keyword getForKeyword_2() { return cForKeyword_2; }

		//effect=[Effect]
		public Assignment getEffectAssignment_3() { return cEffectAssignment_3; }

		//[Effect]
		public CrossReference getEffectEffectCrossReference_3_0() { return cEffectEffectCrossReference_3_0; }

		//ID
		public RuleCall getEffectEffectIDTerminalRuleCall_3_0_1() { return cEffectEffectIDTerminalRuleCall_3_0_1; }
	}

	public class IngredientElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Ingredient");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIngredientDefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIngredientAliasParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Ingredient:
		//	IngredientDef | IngredientAlias;
		public ParserRule getRule() { return rule; }

		//IngredientDef | IngredientAlias
		public Alternatives getAlternatives() { return cAlternatives; }

		//IngredientDef
		public RuleCall getIngredientDefParserRuleCall_0() { return cIngredientDefParserRuleCall_0; }

		//IngredientAlias
		public RuleCall getIngredientAliasParserRuleCall_1() { return cIngredientAliasParserRuleCall_1; }
	}

	public class IngredientDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IngredientDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIngredientKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEffectsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEffectsEffectRefParserRuleCall_3_0 = (RuleCall)cEffectsAssignment_3.eContents().get(0);
		private final Keyword cPriceKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPriceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPriceNUMBERTerminalRuleCall_5_0 = (RuleCall)cPriceAssignment_5.eContents().get(0);
		private final Keyword cWeightKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cWeightAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cWeightNUMBERTerminalRuleCall_7_0 = (RuleCall)cWeightAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cSourceKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cSourceAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cSourceSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cSourceAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//IngredientDef:
		//	"ingredient" name=ID "{" effects+=EffectRef* "price:" price=NUMBER "weight:" weight=NUMBER ("source:" source=STRING)?
		//	"}";
		public ParserRule getRule() { return rule; }

		//"ingredient" name=ID "{" effects+=EffectRef* "price:" price=NUMBER "weight:" weight=NUMBER ("source:" source=STRING)?
		//"}"
		public Group getGroup() { return cGroup; }

		//"ingredient"
		public Keyword getIngredientKeyword_0() { return cIngredientKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//effects+=EffectRef*
		public Assignment getEffectsAssignment_3() { return cEffectsAssignment_3; }

		//EffectRef
		public RuleCall getEffectsEffectRefParserRuleCall_3_0() { return cEffectsEffectRefParserRuleCall_3_0; }

		//"price:"
		public Keyword getPriceKeyword_4() { return cPriceKeyword_4; }

		//price=NUMBER
		public Assignment getPriceAssignment_5() { return cPriceAssignment_5; }

		//NUMBER
		public RuleCall getPriceNUMBERTerminalRuleCall_5_0() { return cPriceNUMBERTerminalRuleCall_5_0; }

		//"weight:"
		public Keyword getWeightKeyword_6() { return cWeightKeyword_6; }

		//weight=NUMBER
		public Assignment getWeightAssignment_7() { return cWeightAssignment_7; }

		//NUMBER
		public RuleCall getWeightNUMBERTerminalRuleCall_7_0() { return cWeightNUMBERTerminalRuleCall_7_0; }

		//("source:" source=STRING)?
		public Group getGroup_8() { return cGroup_8; }

		//"source:"
		public Keyword getSourceKeyword_8_0() { return cSourceKeyword_8_0; }

		//source=STRING
		public Assignment getSourceAssignment_8_1() { return cSourceAssignment_8_1; }

		//STRING
		public RuleCall getSourceSTRINGTerminalRuleCall_8_1_0() { return cSourceSTRINGTerminalRuleCall_8_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class IngredientRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IngredientRef");
		private final Assignment cIngredientAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cIngredientIngredientCrossReference_0 = (CrossReference)cIngredientAssignment.eContents().get(0);
		private final RuleCall cIngredientIngredientIDTerminalRuleCall_0_1 = (RuleCall)cIngredientIngredientCrossReference_0.eContents().get(1);
		
		//IngredientRef returns Ingredient:
		//	ingredient=[Ingredient];
		public ParserRule getRule() { return rule; }

		//ingredient=[Ingredient]
		public Assignment getIngredientAssignment() { return cIngredientAssignment; }

		//[Ingredient]
		public CrossReference getIngredientIngredientCrossReference_0() { return cIngredientIngredientCrossReference_0; }

		//ID
		public RuleCall getIngredientIngredientIDTerminalRuleCall_0_1() { return cIngredientIngredientIDTerminalRuleCall_0_1; }
	}

	public class IngredientAliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IngredientAlias");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIaliasKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAliasAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_1_0 = (RuleCall)cAliasAssignment_1.eContents().get(0);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIngredientAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cIngredientIngredientCrossReference_3_0 = (CrossReference)cIngredientAssignment_3.eContents().get(0);
		private final RuleCall cIngredientIngredientIDTerminalRuleCall_3_0_1 = (RuleCall)cIngredientIngredientCrossReference_3_0.eContents().get(1);
		
		//IngredientAlias:
		//	"ialias" alias=ID "for" ingredient=[Ingredient];
		public ParserRule getRule() { return rule; }

		//"ialias" alias=ID "for" ingredient=[Ingredient]
		public Group getGroup() { return cGroup; }

		//"ialias"
		public Keyword getIaliasKeyword_0() { return cIaliasKeyword_0; }

		//alias=ID
		public Assignment getAliasAssignment_1() { return cAliasAssignment_1; }

		//ID
		public RuleCall getAliasIDTerminalRuleCall_1_0() { return cAliasIDTerminalRuleCall_1_0; }

		//"for"
		public Keyword getForKeyword_2() { return cForKeyword_2; }

		//ingredient=[Ingredient]
		public Assignment getIngredientAssignment_3() { return cIngredientAssignment_3; }

		//[Ingredient]
		public CrossReference getIngredientIngredientCrossReference_3_0() { return cIngredientIngredientCrossReference_3_0; }

		//ID
		public RuleCall getIngredientIngredientIDTerminalRuleCall_3_0_1() { return cIngredientIngredientIDTerminalRuleCall_3_0_1; }
	}

	public class RecipeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Recipe");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cToxicityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cToxicityToxicityEnumRuleCall_0_0 = (RuleCall)cToxicityAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEffectsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEffectsEffectRefParserRuleCall_3_0 = (RuleCall)cEffectsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPriceKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPriceAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPriceNUMBERTerminalRuleCall_4_1_0 = (RuleCall)cPriceAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cIngredientsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cIngredientsIngredientRefParserRuleCall_7_0 = (RuleCall)cIngredientsAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cPlusSignKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cIngredientsAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cIngredientsIngredientRefParserRuleCall_8_1_0 = (RuleCall)cIngredientsAssignment_8_1.eContents().get(0);
		
		//Recipe:
		//	toxicity=Toxicity name=ID "{" effects+=EffectRef+ ("price:" price=NUMBER)? "}" "=" ingredients+=IngredientRef ("+"
		//	ingredients+=IngredientRef)*;
		public ParserRule getRule() { return rule; }

		//toxicity=Toxicity name=ID "{" effects+=EffectRef+ ("price:" price=NUMBER)? "}" "=" ingredients+=IngredientRef ("+"
		//ingredients+=IngredientRef)*
		public Group getGroup() { return cGroup; }

		//toxicity=Toxicity
		public Assignment getToxicityAssignment_0() { return cToxicityAssignment_0; }

		//Toxicity
		public RuleCall getToxicityToxicityEnumRuleCall_0_0() { return cToxicityToxicityEnumRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//effects+=EffectRef+
		public Assignment getEffectsAssignment_3() { return cEffectsAssignment_3; }

		//EffectRef
		public RuleCall getEffectsEffectRefParserRuleCall_3_0() { return cEffectsEffectRefParserRuleCall_3_0; }

		//("price:" price=NUMBER)?
		public Group getGroup_4() { return cGroup_4; }

		//"price:"
		public Keyword getPriceKeyword_4_0() { return cPriceKeyword_4_0; }

		//price=NUMBER
		public Assignment getPriceAssignment_4_1() { return cPriceAssignment_4_1; }

		//NUMBER
		public RuleCall getPriceNUMBERTerminalRuleCall_4_1_0() { return cPriceNUMBERTerminalRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//"="
		public Keyword getEqualsSignKeyword_6() { return cEqualsSignKeyword_6; }

		//ingredients+=IngredientRef
		public Assignment getIngredientsAssignment_7() { return cIngredientsAssignment_7; }

		//IngredientRef
		public RuleCall getIngredientsIngredientRefParserRuleCall_7_0() { return cIngredientsIngredientRefParserRuleCall_7_0; }

		//("+" ingredients+=IngredientRef)*
		public Group getGroup_8() { return cGroup_8; }

		//"+"
		public Keyword getPlusSignKeyword_8_0() { return cPlusSignKeyword_8_0; }

		//ingredients+=IngredientRef
		public Assignment getIngredientsAssignment_8_1() { return cIngredientsAssignment_8_1; }

		//IngredientRef
		public RuleCall getIngredientsIngredientRefParserRuleCall_8_1_0() { return cIngredientsIngredientRefParserRuleCall_8_1_0; }
	}
	
	
	public class EffectTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "EffectType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFORTIFYEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFORTIFYPlusSignKeyword_0_0 = (Keyword)cFORTIFYEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cWEAKENEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cWEAKENHyphenMinusKeyword_1_0 = (Keyword)cWEAKENEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum EffectType:
		//	FORTIFY="+" | WEAKEN="-";
		public EnumRule getRule() { return rule; }

		//FORTIFY="+" | WEAKEN="-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//FORTIFY="+"
		public EnumLiteralDeclaration getFORTIFYEnumLiteralDeclaration_0() { return cFORTIFYEnumLiteralDeclaration_0; }

		//"+"
		public Keyword getFORTIFYPlusSignKeyword_0_0() { return cFORTIFYPlusSignKeyword_0_0; }

		//WEAKEN="-"
		public EnumLiteralDeclaration getWEAKENEnumLiteralDeclaration_1() { return cWEAKENEnumLiteralDeclaration_1; }

		//"-"
		public Keyword getWEAKENHyphenMinusKeyword_1_0() { return cWEAKENHyphenMinusKeyword_1_0; }
	}

	public class ToxicityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Toxicity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPOTIONEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPOTIONPotionKeyword_0_0 = (Keyword)cPOTIONEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPOISONEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPOISONPoisonKeyword_1_0 = (Keyword)cPOISONEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cMIXTUREEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cMIXTUREMixtureKeyword_2_0 = (Keyword)cMIXTUREEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Toxicity:
		//	POTION="potion" | POISON="poison" | MIXTURE="mixture";
		public EnumRule getRule() { return rule; }

		//POTION="potion" | POISON="poison" | MIXTURE="mixture"
		public Alternatives getAlternatives() { return cAlternatives; }

		//POTION="potion"
		public EnumLiteralDeclaration getPOTIONEnumLiteralDeclaration_0() { return cPOTIONEnumLiteralDeclaration_0; }

		//"potion"
		public Keyword getPOTIONPotionKeyword_0_0() { return cPOTIONPotionKeyword_0_0; }

		//POISON="poison"
		public EnumLiteralDeclaration getPOISONEnumLiteralDeclaration_1() { return cPOISONEnumLiteralDeclaration_1; }

		//"poison"
		public Keyword getPOISONPoisonKeyword_1_0() { return cPOISONPoisonKeyword_1_0; }

		//MIXTURE="mixture"
		public EnumLiteralDeclaration getMIXTUREEnumLiteralDeclaration_2() { return cMIXTUREEnumLiteralDeclaration_2; }

		//"mixture"
		public Keyword getMIXTUREMixtureKeyword_2_0() { return cMIXTUREMixtureKeyword_2_0; }
	}
	
	private AlchemyLabModelElements pAlchemyLabModel;
	private EffectElements pEffect;
	private EffectDefElements pEffectDef;
	private EffectTypeElements unknownRuleEffectType;
	private EffectRefElements pEffectRef;
	private EffectAliasElements pEffectAlias;
	private IngredientElements pIngredient;
	private IngredientDefElements pIngredientDef;
	private IngredientRefElements pIngredientRef;
	private IngredientAliasElements pIngredientAlias;
	private RecipeElements pRecipe;
	private ToxicityElements unknownRuleToxicity;
	private TerminalRule tID;
	private TerminalRule tStrongID;
	private TerminalRule tSTRING;
	private TerminalRule tNUMBER;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	private TerminalRule tANY_OTHER;
	
	private final GrammarProvider grammarProvider;

	@Inject
	public AlchemyLabGrammarAccess(GrammarProvider grammarProvider) {
		this.grammarProvider = grammarProvider;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	
	//AlchemyLabModel:
	//	effects+=Effect* ingredients+=Ingredient* recipes+=Recipe*;
	public AlchemyLabModelElements getAlchemyLabModelAccess() {
		return (pAlchemyLabModel != null) ? pAlchemyLabModel : (pAlchemyLabModel = new AlchemyLabModelElements());
	}
	
	public ParserRule getAlchemyLabModelRule() {
		return getAlchemyLabModelAccess().getRule();
	}

	//Effect:
	//	EffectDef | EffectAlias;
	public EffectElements getEffectAccess() {
		return (pEffect != null) ? pEffect : (pEffect = new EffectElements());
	}
	
	public ParserRule getEffectRule() {
		return getEffectAccess().getRule();
	}

	//EffectDef:
	//	"effect" name=ID "(" type=EffectType ")" (":" description=STRING)?;
	public EffectDefElements getEffectDefAccess() {
		return (pEffectDef != null) ? pEffectDef : (pEffectDef = new EffectDefElements());
	}
	
	public ParserRule getEffectDefRule() {
		return getEffectDefAccess().getRule();
	}

	//enum EffectType:
	//	FORTIFY="+" | WEAKEN="-";
	public EffectTypeElements getEffectTypeAccess() {
		return (unknownRuleEffectType != null) ? unknownRuleEffectType : (unknownRuleEffectType = new EffectTypeElements());
	}
	
	public EnumRule getEffectTypeRule() {
		return getEffectTypeAccess().getRule();
	}

	//EffectRef returns Effect:
	//	"->" effect=[Effect];
	public EffectRefElements getEffectRefAccess() {
		return (pEffectRef != null) ? pEffectRef : (pEffectRef = new EffectRefElements());
	}
	
	public ParserRule getEffectRefRule() {
		return getEffectRefAccess().getRule();
	}

	//EffectAlias:
	//	"ealias" alias=ID "for" effect=[Effect];
	public EffectAliasElements getEffectAliasAccess() {
		return (pEffectAlias != null) ? pEffectAlias : (pEffectAlias = new EffectAliasElements());
	}
	
	public ParserRule getEffectAliasRule() {
		return getEffectAliasAccess().getRule();
	}

	//Ingredient:
	//	IngredientDef | IngredientAlias;
	public IngredientElements getIngredientAccess() {
		return (pIngredient != null) ? pIngredient : (pIngredient = new IngredientElements());
	}
	
	public ParserRule getIngredientRule() {
		return getIngredientAccess().getRule();
	}

	//IngredientDef:
	//	"ingredient" name=ID "{" effects+=EffectRef* "price:" price=NUMBER "weight:" weight=NUMBER ("source:" source=STRING)?
	//	"}";
	public IngredientDefElements getIngredientDefAccess() {
		return (pIngredientDef != null) ? pIngredientDef : (pIngredientDef = new IngredientDefElements());
	}
	
	public ParserRule getIngredientDefRule() {
		return getIngredientDefAccess().getRule();
	}

	//IngredientRef returns Ingredient:
	//	ingredient=[Ingredient];
	public IngredientRefElements getIngredientRefAccess() {
		return (pIngredientRef != null) ? pIngredientRef : (pIngredientRef = new IngredientRefElements());
	}
	
	public ParserRule getIngredientRefRule() {
		return getIngredientRefAccess().getRule();
	}

	//IngredientAlias:
	//	"ialias" alias=ID "for" ingredient=[Ingredient];
	public IngredientAliasElements getIngredientAliasAccess() {
		return (pIngredientAlias != null) ? pIngredientAlias : (pIngredientAlias = new IngredientAliasElements());
	}
	
	public ParserRule getIngredientAliasRule() {
		return getIngredientAliasAccess().getRule();
	}

	//Recipe:
	//	toxicity=Toxicity name=ID "{" effects+=EffectRef+ ("price:" price=NUMBER)? "}" "=" ingredients+=IngredientRef ("+"
	//	ingredients+=IngredientRef)*;
	public RecipeElements getRecipeAccess() {
		return (pRecipe != null) ? pRecipe : (pRecipe = new RecipeElements());
	}
	
	public ParserRule getRecipeRule() {
		return getRecipeAccess().getRule();
	}

	//enum Toxicity:
	//	POTION="potion" | POISON="poison" | MIXTURE="mixture";
	public ToxicityElements getToxicityAccess() {
		return (unknownRuleToxicity != null) ? unknownRuleToxicity : (unknownRuleToxicity = new ToxicityElements());
	}
	
	public EnumRule getToxicityRule() {
		return getToxicityAccess().getRule();
	}

	//terminal ID:
	//	"\"" "^"? ("a".."z" | "A".."Z" | " " | "�" | "�" | "�" | "�" | "�" | "�" | "�" | "\'")+ "\"";
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal strongID:
	//	"^"? ("a".."z" | "A".."Z" | "_")+;
	public TerminalRule getStrongIDRule() {
		return (tStrongID != null) ? tStrongID : (tStrongID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "strongID"));
	} 

	//terminal STRING:
	//	"\'" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	//terminal NUMBER returns ecore::EFloat:
	//	"0".."9"+ ("." "0".."9"+)?;
	public TerminalRule getNUMBERRule() {
		return (tNUMBER != null) ? tNUMBER : (tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NUMBER"));
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 
}