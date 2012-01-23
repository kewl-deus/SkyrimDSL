package es.skyrim.alchemy.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.IContainer;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AlchemyLab extends BaseConcept implements IContainer, INamedConcept {
  public static final String concept = "es.skyrim.alchemy.structure.AlchemyLab";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String EFFECTS = "effects";
  public static final String INGREDIENTS = "ingredients";
  public static final String MIXTURES = "mixtures";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public AlchemyLab(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AlchemyLab.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AlchemyLab.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AlchemyLab.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AlchemyLab.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AlchemyLab.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AlchemyLab.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(AlchemyLab.NAME);
  }

  public void setName(String value) {
    this.setProperty(AlchemyLab.NAME, value);
  }

  public int getEffectsesCount() {
    return this.getChildCount(AlchemyLab.EFFECTS);
  }

  public Iterator<IEffect> effectses() {
    return this.children(IEffect.class, AlchemyLab.EFFECTS);
  }

  public List<IEffect> getEffectses() {
    return this.getChildren(IEffect.class, AlchemyLab.EFFECTS);
  }

  public void addEffects(IEffect node) {
    this.addChild(AlchemyLab.EFFECTS, node);
  }

  public void insertEffects(IEffect prev, IEffect node) {
    this.insertChild(prev, AlchemyLab.EFFECTS, node);
  }

  public int getIngredientsesCount() {
    return this.getChildCount(AlchemyLab.INGREDIENTS);
  }

  public Iterator<Ingredient> ingredientses() {
    return this.children(Ingredient.class, AlchemyLab.INGREDIENTS);
  }

  public List<Ingredient> getIngredientses() {
    return this.getChildren(Ingredient.class, AlchemyLab.INGREDIENTS);
  }

  public void addIngredients(Ingredient node) {
    this.addChild(AlchemyLab.INGREDIENTS, node);
  }

  public void insertIngredients(Ingredient prev, Ingredient node) {
    this.insertChild(prev, AlchemyLab.INGREDIENTS, node);
  }

  public int getMixturesesCount() {
    return this.getChildCount(AlchemyLab.MIXTURES);
  }

  public Iterator<Mixture> mixtureses() {
    return this.children(Mixture.class, AlchemyLab.MIXTURES);
  }

  public List<Mixture> getMixtureses() {
    return this.getChildren(Mixture.class, AlchemyLab.MIXTURES);
  }

  public void addMixtures(Mixture node) {
    this.addChild(AlchemyLab.MIXTURES, node);
  }

  public void insertMixtures(Mixture prev, Mixture node) {
    this.insertChild(prev, AlchemyLab.MIXTURES, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(AlchemyLab.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, AlchemyLab.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, AlchemyLab.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(AlchemyLab.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, AlchemyLab.SMODEL_ATTRIBUTE, node);
  }

  public static AlchemyLab newInstance(SModel sm, boolean init) {
    return (AlchemyLab) SModelUtil_new.instantiateConceptDeclaration("es.skyrim.alchemy.structure.AlchemyLab", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AlchemyLab newInstance(SModel sm) {
    return AlchemyLab.newInstance(sm, false);
  }
}
