package es.skyrim.alchemy.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"es.skyrim.alchemy.structure.Effect", "es.skyrim.alchemy.structure.EffectAlias", "es.skyrim.alchemy.structure.EffectReference", "es.skyrim.alchemy.structure.EffectTome", "es.skyrim.alchemy.structure.Ingredient", "es.skyrim.alchemy.structure.IngredientAlias", "es.skyrim.alchemy.structure.IngredientReference", "es.skyrim.alchemy.structure.Mixture", "es.skyrim.alchemy.structure.MixtureList", "es.skyrim.alchemy.structure.Poison", "es.skyrim.alchemy.structure.Potion", "es.skyrim.alchemy.structure.Recipe", "es.skyrim.alchemy.structure.Satchel"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 0:
        return new Effect_BehaviorDescriptor();
      case 1:
        return new EffectAlias_BehaviorDescriptor();
      case 8:
        return new MixtureList_BehaviorDescriptor();
      case 4:
        return new Ingredient_BehaviorDescriptor();
      case 2:
        return new EffectReference_BehaviorDescriptor();
      case 7:
        return new Mixture_BehaviorDescriptor();
      case 6:
        return new IngredientReference_BehaviorDescriptor();
      case 11:
        return new Recipe_BehaviorDescriptor();
      case 12:
        return new Satchel_BehaviorDescriptor();
      case 5:
        return new IngredientAlias_BehaviorDescriptor();
      case 3:
        return new EffectTome_BehaviorDescriptor();
      case 10:
        return new Potion_BehaviorDescriptor();
      case 9:
        return new Poison_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
