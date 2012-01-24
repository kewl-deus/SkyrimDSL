package es.skyrim.alchemy.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"es.skyrim.alchemy.structure.Effect", "es.skyrim.alchemy.structure.EffectAlias", "es.skyrim.alchemy.structure.EffectReference", "es.skyrim.alchemy.structure.EffectTome", "es.skyrim.alchemy.structure.IEffect", "es.skyrim.alchemy.structure.IIngredient", "es.skyrim.alchemy.structure.Ingredient", "es.skyrim.alchemy.structure.IngredientAlias", "es.skyrim.alchemy.structure.IngredientReference", "es.skyrim.alchemy.structure.Mixture", "es.skyrim.alchemy.structure.MixtureList", "es.skyrim.alchemy.structure.Poison", "es.skyrim.alchemy.structure.Potion", "es.skyrim.alchemy.structure.Recipe", "es.skyrim.alchemy.structure.Satchel"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Effect", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "es.skyrim.alchemy.structure.IEffect"}, new String[]{"nature", "description"}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.EffectAlias", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "es.skyrim.alchemy.structure.IEffect"}, new String[]{}, new String[]{"effect"});
      case 2:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.EffectReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"effect"});
      case 3:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.EffectTome", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IContainer", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.IEffect", null, true, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.IIngredient", null, true, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Ingredient", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "es.skyrim.alchemy.structure.IIngredient"}, new String[]{"price", "weight", "source"}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.IngredientAlias", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "es.skyrim.alchemy.structure.IIngredient"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.IngredientReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"ingredient"});
      case 9:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Mixture", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"price"}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.MixtureList", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IContainer", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 11:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Poison", "es.skyrim.alchemy.structure.Mixture", false, new String[]{"es.skyrim.alchemy.structure.Mixture"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Potion", "es.skyrim.alchemy.structure.Mixture", false, new String[]{"es.skyrim.alchemy.structure.Mixture"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Recipe", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("es.skyrim.alchemy.structure.Satchel", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IContainer", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}