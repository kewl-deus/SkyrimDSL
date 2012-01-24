package es.skyrim.alchemy.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Ingredient extends BaseConcept implements IIngredient {
  public static final String concept = "es.skyrim.alchemy.structure.Ingredient";
  public static final String PRICE = "price";
  public static final String WEIGHT = "weight";
  public static final String SOURCE = "source";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EFFECT = "effect";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public Ingredient(SNode node) {
    super(node);
  }

  public String getPrice() {
    return this.getProperty(Ingredient.PRICE);
  }

  public void setPrice(String value) {
    this.setProperty(Ingredient.PRICE, value);
  }

  public String getWeight() {
    return this.getProperty(Ingredient.WEIGHT);
  }

  public void setWeight(String value) {
    this.setProperty(Ingredient.WEIGHT, value);
  }

  public String getSource() {
    return this.getProperty(Ingredient.SOURCE);
  }

  public void setSource(String value) {
    this.setProperty(Ingredient.SOURCE, value);
  }

  public String getName() {
    return this.getProperty(Ingredient.NAME);
  }

  public void setName(String value) {
    this.setProperty(Ingredient.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Ingredient.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Ingredient.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Ingredient.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Ingredient.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Ingredient.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Ingredient.VIRTUAL_PACKAGE, value);
  }

  public int getEffectsCount() {
    return this.getChildCount(Ingredient.EFFECT);
  }

  public Iterator<EffectReference> effects() {
    return this.children(EffectReference.class, Ingredient.EFFECT);
  }

  public List<EffectReference> getEffects() {
    return this.getChildren(EffectReference.class, Ingredient.EFFECT);
  }

  public void addEffect(EffectReference node) {
    this.addChild(Ingredient.EFFECT, node);
  }

  public void insertEffect(EffectReference prev, EffectReference node) {
    this.insertChild(prev, Ingredient.EFFECT, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(Ingredient.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, Ingredient.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, Ingredient.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(Ingredient.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Ingredient.SMODEL_ATTRIBUTE, node);
  }

  public static Ingredient newInstance(SModel sm, boolean init) {
    return (Ingredient) SModelUtil_new.instantiateConceptDeclaration("es.skyrim.alchemy.structure.Ingredient", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Ingredient newInstance(SModel sm) {
    return Ingredient.newInstance(sm, false);
  }
}
