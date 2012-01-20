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
import es.skyrim.alchemy.alchemyLab.EffectType;
import es.skyrim.alchemy.alchemyLab.Ingredient;
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
  private EClass ingredientEClass = null;

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
  public EClass getIngredient()
  {
    return ingredientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Name()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIngredient_Effects()
  {
    return (EReference)ingredientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Price()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Weight()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Source()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getEffect_Name()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_Type()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_Description()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Effect()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(3);
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

    ingredientEClass = createEClass(INGREDIENT);
    createEAttribute(ingredientEClass, INGREDIENT__NAME);
    createEReference(ingredientEClass, INGREDIENT__EFFECTS);
    createEAttribute(ingredientEClass, INGREDIENT__PRICE);
    createEAttribute(ingredientEClass, INGREDIENT__WEIGHT);
    createEAttribute(ingredientEClass, INGREDIENT__SOURCE);

    effectEClass = createEClass(EFFECT);
    createEAttribute(effectEClass, EFFECT__NAME);
    createEAttribute(effectEClass, EFFECT__TYPE);
    createEAttribute(effectEClass, EFFECT__DESCRIPTION);
    createEReference(effectEClass, EFFECT__EFFECT);

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

    // Initialize classes and features; add operations and parameters
    initEClass(alchemyLabModelEClass, AlchemyLabModel.class, "AlchemyLabModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlchemyLabModel_Effects(), this.getEffect(), null, "effects", null, 0, -1, AlchemyLabModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlchemyLabModel_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, AlchemyLabModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlchemyLabModel_Recipes(), this.getRecipe(), null, "recipes", null, 0, -1, AlchemyLabModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIngredient_Effects(), this.getEffect(), null, "effects", null, 0, -1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Weight(), ecorePackage.getEFloat(), "weight", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Source(), ecorePackage.getEString(), "source", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffect_Name(), ecorePackage.getEString(), "name", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_Type(), this.getEffectType(), "type", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_Description(), ecorePackage.getEString(), "description", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Effect(), this.getEffect(), null, "effect", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipe_Toxicity(), this.getToxicity(), "toxicity", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Effects(), this.getEffect(), null, "effects", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(effectTypeEEnum, EffectType.class, "EffectType");
    addEEnumLiteral(effectTypeEEnum, EffectType.FORTIFY);
    addEEnumLiteral(effectTypeEEnum, EffectType.WEAKEN);

    initEEnum(toxicityEEnum, Toxicity.class, "Toxicity");
    addEEnumLiteral(toxicityEEnum, Toxicity.POTION);
    addEEnumLiteral(toxicityEEnum, Toxicity.POISON);

    // Create resource
    createResource(eNS_URI);
  }

} //AlchemyLabPackageImpl
