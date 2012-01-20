/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabFactory
 * @model kind="package"
 * @generated
 */
public interface AlchemyLabPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alchemyLab";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.skyrim.es/alchemy/AlchemyLab";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alchemyLab";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlchemyLabPackage eINSTANCE = es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl.init();

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getAlchemyLabModel()
   * @generated
   */
  int ALCHEMY_LAB_MODEL = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALCHEMY_LAB_MODEL__EFFECTS = 0;

  /**
   * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALCHEMY_LAB_MODEL__INGREDIENTS = 1;

  /**
   * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALCHEMY_LAB_MODEL__RECIPES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALCHEMY_LAB_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl <em>Ingredient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.IngredientImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredient()
   * @generated
   */
  int INGREDIENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__EFFECTS = 1;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__PRICE = 2;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__WEIGHT = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__SOURCE = 4;

  /**
   * The number of structural features of the '<em>Ingredient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.EffectImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Effect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__EFFECT = 3;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl <em>Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.RecipeImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getRecipe()
   * @generated
   */
  int RECIPE = 3;

  /**
   * The feature id for the '<em><b>Toxicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__TOXICITY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__EFFECTS = 2;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__PRICE = 3;

  /**
   * The feature id for the '<em><b>Ingredients</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE__INGREDIENTS = 4;

  /**
   * The number of structural features of the '<em>Recipe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.EffectType <em>Effect Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.EffectType
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffectType()
   * @generated
   */
  int EFFECT_TYPE = 4;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.Toxicity <em>Toxicity</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.Toxicity
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getToxicity()
   * @generated
   */
  int TOXICITY = 5;


  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabModel
   * @generated
   */
  EClass getAlchemyLabModel();

  /**
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getEffects()
   * @see #getAlchemyLabModel()
   * @generated
   */
  EReference getAlchemyLabModel_Effects();

  /**
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getIngredients <em>Ingredients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ingredients</em>'.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getIngredients()
   * @see #getAlchemyLabModel()
   * @generated
   */
  EReference getAlchemyLabModel_Ingredients();

  /**
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getRecipes <em>Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipes</em>'.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getRecipes()
   * @see #getAlchemyLabModel()
   * @generated
   */
  EReference getAlchemyLabModel_Recipes();

  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.Ingredient <em>Ingredient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ingredient</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient
   * @generated
   */
  EClass getIngredient();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Ingredient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient#getName()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Name();

  /**
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.Ingredient#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient#getEffects()
   * @see #getIngredient()
   * @generated
   */
  EReference getIngredient_Effects();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Ingredient#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient#getPrice()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Price();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Ingredient#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient#getWeight()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Weight();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Ingredient#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient#getSource()
   * @see #getIngredient()
   * @generated
   */
  EAttribute getIngredient_Source();

  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Effect#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Effect#getName()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Name();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Effect#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Effect#getType()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Type();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Effect#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Effect#getDescription()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Description();

  /**
   * Returns the meta object for the reference '{@link es.skyrim.alchemy.alchemyLab.Effect#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Effect</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Effect#getEffect()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Effect();

  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.Recipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipe</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Recipe
   * @generated
   */
  EClass getRecipe();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Recipe#getToxicity <em>Toxicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Toxicity</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Recipe#getToxicity()
   * @see #getRecipe()
   * @generated
   */
  EAttribute getRecipe_Toxicity();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Recipe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Recipe#getName()
   * @see #getRecipe()
   * @generated
   */
  EAttribute getRecipe_Name();

  /**
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.Recipe#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Recipe#getEffects()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Effects();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.Recipe#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Recipe#getPrice()
   * @see #getRecipe()
   * @generated
   */
  EAttribute getRecipe_Price();

  /**
   * Returns the meta object for the reference list '{@link es.skyrim.alchemy.alchemyLab.Recipe#getIngredients <em>Ingredients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ingredients</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Recipe#getIngredients()
   * @see #getRecipe()
   * @generated
   */
  EReference getRecipe_Ingredients();

  /**
   * Returns the meta object for enum '{@link es.skyrim.alchemy.alchemyLab.EffectType <em>Effect Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Effect Type</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectType
   * @generated
   */
  EEnum getEffectType();

  /**
   * Returns the meta object for enum '{@link es.skyrim.alchemy.alchemyLab.Toxicity <em>Toxicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Toxicity</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Toxicity
   * @generated
   */
  EEnum getToxicity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlchemyLabFactory getAlchemyLabFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getAlchemyLabModel()
     * @generated
     */
    EClass ALCHEMY_LAB_MODEL = eINSTANCE.getAlchemyLabModel();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALCHEMY_LAB_MODEL__EFFECTS = eINSTANCE.getAlchemyLabModel_Effects();

    /**
     * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALCHEMY_LAB_MODEL__INGREDIENTS = eINSTANCE.getAlchemyLabModel_Ingredients();

    /**
     * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALCHEMY_LAB_MODEL__RECIPES = eINSTANCE.getAlchemyLabModel_Recipes();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl <em>Ingredient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.IngredientImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredient()
     * @generated
     */
    EClass INGREDIENT = eINSTANCE.getIngredient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INGREDIENT__EFFECTS = eINSTANCE.getIngredient_Effects();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__PRICE = eINSTANCE.getIngredient_Price();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__WEIGHT = eINSTANCE.getIngredient_Weight();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT__SOURCE = eINSTANCE.getIngredient_Source();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.EffectImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__NAME = eINSTANCE.getEffect_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__TYPE = eINSTANCE.getEffect_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__DESCRIPTION = eINSTANCE.getEffect_Description();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__EFFECT = eINSTANCE.getEffect_Effect();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl <em>Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.RecipeImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getRecipe()
     * @generated
     */
    EClass RECIPE = eINSTANCE.getRecipe();

    /**
     * The meta object literal for the '<em><b>Toxicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPE__TOXICITY = eINSTANCE.getRecipe_Toxicity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__EFFECTS = eINSTANCE.getRecipe_Effects();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPE__PRICE = eINSTANCE.getRecipe_Price();

    /**
     * The meta object literal for the '<em><b>Ingredients</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPE__INGREDIENTS = eINSTANCE.getRecipe_Ingredients();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.EffectType <em>Effect Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.EffectType
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffectType()
     * @generated
     */
    EEnum EFFECT_TYPE = eINSTANCE.getEffectType();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.Toxicity <em>Toxicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.Toxicity
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getToxicity()
     * @generated
     */
    EEnum TOXICITY = eINSTANCE.getToxicity();

  }

} //AlchemyLabPackage
