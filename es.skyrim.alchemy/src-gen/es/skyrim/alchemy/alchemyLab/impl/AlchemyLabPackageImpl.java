/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.AlchemyLabFactory;
import es.skyrim.alchemy.alchemyLab.AlchemyLabModel;
import es.skyrim.alchemy.alchemyLab.AlchemyLabPackage;
import es.skyrim.alchemy.alchemyLab.Effect;
import es.skyrim.alchemy.alchemyLab.EffectAlias;
import es.skyrim.alchemy.alchemyLab.EffectDef;
import es.skyrim.alchemy.alchemyLab.EffectType;
import es.skyrim.alchemy.alchemyLab.Ingredient;
import es.skyrim.alchemy.alchemyLab.IngredientAlias;
import es.skyrim.alchemy.alchemyLab.IngredientDef;
import es.skyrim.alchemy.alchemyLab.Recipe;
import es.skyrim.alchemy.alchemyLab.Toxicity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlchemyLabPackageImpl extends EPackageImpl implements AlchemyLabPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alchemyLabModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ingredientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ingredientDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ingredientAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recipeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum effectTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum toxicityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AlchemyLabPackageImpl()
  {
    super(eNS_URI, AlchemyLabFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AlchemyLabPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AlchemyLabPackage init()
  {
    if (isInited) return (AlchemyLabPackage)EPackage.Registry.INSTANCE.getEPackage(AlchemyLabPackage.eNS_URI);

    // Obtain or create and register package
    AlchemyLabPackageImpl theAlchemyLabPackage = (AlchemyLabPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlchemyLabPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlchemyLabPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAlchemyLabPackage.createPackageContents();

    // Initialize created meta-data
    theAlchemyLabPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAlchemyLabPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AlchemyLabPackage.eNS_URI, theAlchemyLabPackage);
    return theAlchemyLabPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlchemyLabModel()
  {
    return alchemyLabModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlchemyLabModel_Effects()
  {
    return (EReference)alchemyLabModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlchemyLabModel_Ingredients()
  {
    return (EReference)alchemyLabModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlchemyLabModel_Recipes()
  {
    return (EReference)alchemyLabModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffect()
  {
    return effectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Effect()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectDef()
  {
    return effectDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectDef_Name()
  {
    return (EAttribute)effectDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectDef_Type()
  {
    return (EAttribute)effectDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectDef_Description()
  {
    return (EAttribute)effectDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectAlias()
  {
    return effectAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectAlias_Alias()
  {
    return (EAttribute)effectAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIngredient()
  {
    return ingredientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIngredient_Ingredient()
  {
    return (EReference)ingredientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIngredientDef()
  {
    return ingredientDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredientDef_Name()
  {
    return (EAttribute)ingredientDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIngredientDef_Effects()
  {
    return (EReference)ingredientDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredientDef_Price()
  {
    return (EAttribute)ingredientDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredientDef_Weight()
  {
    return (EAttribute)ingredientDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredientDef_Source()
  {
    return (EAttribute)ingredientDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIngredientAlias()
  {
    return ingredientAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredientAlias_Alias()
  {
    return (EAttribute)ingredientAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecipe()
  {
    return recipeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Toxicity()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Name()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Effects()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Price()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Ingredients()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEffectType()
  {
    return effectTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getToxicity()
  {
    return toxicityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlchemyLabFactory getAlchemyLabFactory()
  {
    return (AlchemyLabFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    alchemyLabModelEClass = createEClass(ALCHEMY_LAB_MODEL);
    createEReference(alchemyLabModelEClass, ALCHEMY_LAB_MODEL__EFFECTS);
    createEReference(alchemyLabModelEClass, ALCHEMY_LAB_MODEL__INGREDIENTS);
    createEReference(alchemyLabModelEClass, ALCHEMY_LAB_MODEL__RECIPES);

    effectEClass = createEClass(EFFECT);
    createEReference(effectEClass, EFFECT__EFFECT);

    effectDefEClass = createEClass(EFFECT_DEF);
    createEAttribute(effectDefEClass, EFFECT_DEF__NAME);
    createEAttribute(effectDefEClass, EFFECT_DEF__TYPE);
    createEAttribute(effectDefEClass, EFFECT_DEF__DESCRIPTION);

    effectAliasEClass = createEClass(EFFECT_ALIAS);
    createEAttribute(effectAliasEClass, EFFECT_ALIAS__ALIAS);

    ingredientEClass = createEClass(INGREDIENT);
    createEReference(ingredientEClass, INGREDIENT__INGREDIENT);

    ingredientDefEClass = createEClass(INGREDIENT_DEF);
    createEAttribute(ingredientDefEClass, INGREDIENT_DEF__NAME);
    createEReference(ingredientDefEClass, INGREDIENT_DEF__EFFECTS);
    createEAttribute(ingredientDefEClass, INGREDIENT_DEF__PRICE);
    createEAttribute(ingredientDefEClass, INGREDIENT_DEF__WEIGHT);
    createEAttribute(ingredientDefEClass, INGREDIENT_DEF__SOURCE);

    ingredientAliasEClass = createEClass(INGREDIENT_ALIAS);
    createEAttribute(ingredientAliasEClass, INGREDIENT_ALIAS__ALIAS);

    recipeEClass = createEClass(RECIPE);
    createEAttribute(recipeEClass, RECIPE__TOXICITY);
    createEAttribute(recipeEClass, RECIPE__NAME);
    createEReference(recipeEClass, RECIPE__EFFECTS);
    createEAttribute(recipeEClass, RECIPE__PRICE);
    createEReference(recipeEClass, RECIPE__INGREDIENTS);

    // Create enums
    effectTypeEEnum = createEEnum(EFFECT_TYPE);
    toxicityEEnum = createEEnum(TOXICITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    effectDefEClass.getESuperTypes().add(this.getEffect());
    effectAliasEClass.getESuperTypes().add(this.getEffect());
    ingredientDefEClass.getESuperTypes().add(this.getIngredient());
    ingredientAliasEClass.getESuperTypes().add(this.getIngredient());

    // Initialize classes and features; add operations and parameters
    initEClass(alchemyLabModelEClass, AlchemyLabModel.class, "AlchemyLabModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlchemyLabModel_Effects(), this.getEffect(), null, "effects", null, 0, -1, AlchemyLabModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlchemyLabModel_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, AlchemyLabModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlchemyLabModel_Recipes(), this.getRecipe(), null, "recipes", null, 0, -1, AlchemyLabModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffect_Effect(), this.getEffect(), null, "effect", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectDefEClass, EffectDef.class, "EffectDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffectDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, EffectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffectDef_Type(), this.getEffectType(), "type", null, 0, 1, EffectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffectDef_Description(), ecorePackage.getEString(), "description", null, 0, 1, EffectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectAliasEClass, EffectAlias.class, "EffectAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffectAlias_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, EffectAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIngredient_Ingredient(), this.getIngredient(), null, "ingredient", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ingredientDefEClass, IngredientDef.class, "IngredientDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIngredientDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, IngredientDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIngredientDef_Effects(), this.getEffect(), null, "effects", null, 0, -1, IngredientDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredientDef_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, IngredientDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredientDef_Weight(), ecorePackage.getEFloat(), "weight", null, 0, 1, IngredientDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredientDef_Source(), ecorePackage.getEString(), "source", null, 0, 1, IngredientDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ingredientAliasEClass, IngredientAlias.class, "IngredientAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIngredientAlias_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, IngredientAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipe_Toxicity(), this.getToxicity(), "toxicity", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Effects(), this.getEffect(), null, "effects", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(effectTypeEEnum, EffectType.class, "EffectType");
    addEEnumLiteral(effectTypeEEnum, EffectType.FORTIFY);
    addEEnumLiteral(effectTypeEEnum, EffectType.WEAKEN);

    initEEnum(toxicityEEnum, Toxicity.class, "Toxicity");
    addEEnumLiteral(toxicityEEnum, Toxicity.POTION);
    addEEnumLiteral(toxicityEEnum, Toxicity.POISON);
    addEEnumLiteral(toxicityEEnum, Toxicity.MIXTURE);

    // Create resource
    createResource(eNS_URI);
  }

} //AlchemyLabPackageImpl
