/*
* generated by Xtext
*/
package es.skyrim.alchemy.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.skyrim.alchemy.services.AlchemyLabGrammarAccess;

public class AlchemyLabParser extends AbstractContentAssistParser {
	
	@Inject
	private AlchemyLabGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.skyrim.alchemy.ui.contentassist.antlr.internal.InternalAlchemyLabParser createParser() {
		es.skyrim.alchemy.ui.contentassist.antlr.internal.InternalAlchemyLabParser result = new es.skyrim.alchemy.ui.contentassist.antlr.internal.InternalAlchemyLabParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEffectAccess().getAlternatives(), "rule__Effect__Alternatives");
					put(grammarAccess.getIngredientAccess().getAlternatives(), "rule__Ingredient__Alternatives");
					put(grammarAccess.getEffectTypeAccess().getAlternatives(), "rule__EffectType__Alternatives");
					put(grammarAccess.getToxicityAccess().getAlternatives(), "rule__Toxicity__Alternatives");
					put(grammarAccess.getAlchemyLabModelAccess().getGroup(), "rule__AlchemyLabModel__Group__0");
					put(grammarAccess.getEffectDefAccess().getGroup(), "rule__EffectDef__Group__0");
					put(grammarAccess.getEffectDefAccess().getGroup_5(), "rule__EffectDef__Group_5__0");
					put(grammarAccess.getEffectRefAccess().getGroup(), "rule__EffectRef__Group__0");
					put(grammarAccess.getEffectAliasAccess().getGroup(), "rule__EffectAlias__Group__0");
					put(grammarAccess.getIngredientDefAccess().getGroup(), "rule__IngredientDef__Group__0");
					put(grammarAccess.getIngredientDefAccess().getGroup_8(), "rule__IngredientDef__Group_8__0");
					put(grammarAccess.getIngredientAliasAccess().getGroup(), "rule__IngredientAlias__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup(), "rule__Recipe__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup_4(), "rule__Recipe__Group_4__0");
					put(grammarAccess.getRecipeAccess().getGroup_8(), "rule__Recipe__Group_8__0");
					put(grammarAccess.getAlchemyLabModelAccess().getEffectsAssignment_0(), "rule__AlchemyLabModel__EffectsAssignment_0");
					put(grammarAccess.getAlchemyLabModelAccess().getIngredientsAssignment_1(), "rule__AlchemyLabModel__IngredientsAssignment_1");
					put(grammarAccess.getAlchemyLabModelAccess().getRecipesAssignment_2(), "rule__AlchemyLabModel__RecipesAssignment_2");
					put(grammarAccess.getEffectDefAccess().getNameAssignment_1(), "rule__EffectDef__NameAssignment_1");
					put(grammarAccess.getEffectDefAccess().getTypeAssignment_3(), "rule__EffectDef__TypeAssignment_3");
					put(grammarAccess.getEffectDefAccess().getDescriptionAssignment_5_1(), "rule__EffectDef__DescriptionAssignment_5_1");
					put(grammarAccess.getEffectRefAccess().getEffectAssignment_1(), "rule__EffectRef__EffectAssignment_1");
					put(grammarAccess.getEffectAliasAccess().getAliasAssignment_1(), "rule__EffectAlias__AliasAssignment_1");
					put(grammarAccess.getEffectAliasAccess().getEffectAssignment_3(), "rule__EffectAlias__EffectAssignment_3");
					put(grammarAccess.getIngredientDefAccess().getNameAssignment_1(), "rule__IngredientDef__NameAssignment_1");
					put(grammarAccess.getIngredientDefAccess().getEffectsAssignment_3(), "rule__IngredientDef__EffectsAssignment_3");
					put(grammarAccess.getIngredientDefAccess().getPriceAssignment_5(), "rule__IngredientDef__PriceAssignment_5");
					put(grammarAccess.getIngredientDefAccess().getWeightAssignment_7(), "rule__IngredientDef__WeightAssignment_7");
					put(grammarAccess.getIngredientDefAccess().getSourceAssignment_8_1(), "rule__IngredientDef__SourceAssignment_8_1");
					put(grammarAccess.getIngredientRefAccess().getIngredientAssignment(), "rule__IngredientRef__IngredientAssignment");
					put(grammarAccess.getIngredientAliasAccess().getAliasAssignment_1(), "rule__IngredientAlias__AliasAssignment_1");
					put(grammarAccess.getIngredientAliasAccess().getIngredientAssignment_3(), "rule__IngredientAlias__IngredientAssignment_3");
					put(grammarAccess.getRecipeAccess().getToxicityAssignment_0(), "rule__Recipe__ToxicityAssignment_0");
					put(grammarAccess.getRecipeAccess().getNameAssignment_1(), "rule__Recipe__NameAssignment_1");
					put(grammarAccess.getRecipeAccess().getEffectsAssignment_3(), "rule__Recipe__EffectsAssignment_3");
					put(grammarAccess.getRecipeAccess().getPriceAssignment_4_1(), "rule__Recipe__PriceAssignment_4_1");
					put(grammarAccess.getRecipeAccess().getIngredientsAssignment_7(), "rule__Recipe__IngredientsAssignment_7");
					put(grammarAccess.getRecipeAccess().getIngredientsAssignment_8_1(), "rule__Recipe__IngredientsAssignment_8_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.skyrim.alchemy.ui.contentassist.antlr.internal.InternalAlchemyLabParser typedParser = (es.skyrim.alchemy.ui.contentassist.antlr.internal.InternalAlchemyLabParser) parser;
			typedParser.entryRuleAlchemyLabModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AlchemyLabGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AlchemyLabGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
