package es.skyrim.alchemy.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Recipe extends BaseConcept {
  public static final String concept = "es.skyrim.alchemy.structure.Recipe";
  public static final String INGREDIENT = "ingredient";

  public Recipe(SNode node) {
    super(node);
  }

  public int getIngredientsCount() {
    return this.getChildCount(Recipe.INGREDIENT);
  }

  public Iterator<IngredientReference> ingredients() {
    return this.children(IngredientReference.class, Recipe.INGREDIENT);
  }

  public List<IngredientReference> getIngredients() {
    return this.getChildren(IngredientReference.class, Recipe.INGREDIENT);
  }

  public void addIngredient(IngredientReference node) {
    this.addChild(Recipe.INGREDIENT, node);
  }

  public void insertIngredient(IngredientReference prev, IngredientReference node) {
    this.insertChild(prev, Recipe.INGREDIENT, node);
  }

  public static Recipe newInstance(SModel sm, boolean init) {
    return (Recipe) SModelUtil_new.instantiateConceptDeclaration("es.skyrim.alchemy.structure.Recipe", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Recipe newInstance(SModel sm) {
    return Recipe.newInstance(sm, false);
  }
}
