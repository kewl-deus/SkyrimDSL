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
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.EffectImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 1;

  /**
   * The feature id for the '<em><b>Effect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__EFFECT = 0;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectDefImpl <em>Effect Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.EffectDefImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffectDef()
   * @generated
   */
  int EFFECT_DEF = 2;

  /**
   * The feature id for the '<em><b>Effect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DEF__EFFECT = EFFECT__EFFECT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DEF__NAME = EFFECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DEF__TYPE = EFFECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DEF__DESCRIPTION = EFFECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Effect Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DEF_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectAliasImpl <em>Effect Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.EffectAliasImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffectAlias()
   * @generated
   */
  int EFFECT_ALIAS = 3;

  /**
   * The feature id for the '<em><b>Effect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_ALIAS__EFFECT = EFFECT__EFFECT;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_ALIAS__ALIAS = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_ALIAS_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl <em>Ingredient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.IngredientImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredient()
   * @generated
   */
  int INGREDIENT = 4;

  /**
   * The feature id for the '<em><b>Ingredient</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT__INGREDIENT = 0;

  /**
   * The number of structural features of the '<em>Ingredient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientDefImpl <em>Ingredient Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.IngredientDefImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredientDef()
   * @generated
   */
  int INGREDIENT_DEF = 5;

  /**
   * The feature id for the '<em><b>Ingredient</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF__INGREDIENT = INGREDIENT__INGREDIENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF__NAME = INGREDIENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF__EFFECTS = INGREDIENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF__PRICE = INGREDIENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF__WEIGHT = INGREDIENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF__SOURCE = INGREDIENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Ingredient Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_DEF_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientAliasImpl <em>Ingredient Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.IngredientAliasImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredientAlias()
   * @generated
   */
  int INGREDIENT_ALIAS = 6;

  /**
   * The feature id for the '<em><b>Ingredient</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_ALIAS__INGREDIENT = INGREDIENT__INGREDIENT;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_ALIAS__ALIAS = INGREDIENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ingredient Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INGREDIENT_ALIAS_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl <em>Recipe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.impl.RecipeImpl
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getRecipe()
   * @generated
   */
  int RECIPE = 7;

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
   * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
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
  int EFFECT_TYPE = 8;

  /**
   * The meta object id for the '{@link es.skyrim.alchemy.alchemyLab.Toxicity <em>Toxicity</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.skyrim.alchemy.alchemyLab.Toxicity
   * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getToxicity()
   * @generated
   */
  int TOXICITY = 9;


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
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Effect
   * @generated
   */
  EClass getEffect();

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
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.EffectDef <em>Effect Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Def</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectDef
   * @generated
   */
  EClass getEffectDef();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.EffectDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectDef#getName()
   * @see #getEffectDef()
   * @generated
   */
  EAttribute getEffectDef_Name();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.EffectDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectDef#getType()
   * @see #getEffectDef()
   * @generated
   */
  EAttribute getEffectDef_Type();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.EffectDef#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectDef#getDescription()
   * @see #getEffectDef()
   * @generated
   */
  EAttribute getEffectDef_Description();

  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.EffectAlias <em>Effect Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Alias</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectAlias
   * @generated
   */
  EClass getEffectAlias();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.EffectAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see es.skyrim.alchemy.alchemyLab.EffectAlias#getAlias()
   * @see #getEffectAlias()
   * @generated
   */
  EAttribute getEffectAlias_Alias();

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
   * Returns the meta object for the reference '{@link es.skyrim.alchemy.alchemyLab.Ingredient#getIngredient <em>Ingredient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ingredient</em>'.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient#getIngredient()
   * @see #getIngredient()
   * @generated
   */
  EReference getIngredient_Ingredient();

  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.IngredientDef <em>Ingredient Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ingredient Def</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef
   * @generated
   */
  EClass getIngredientDef();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef#getName()
   * @see #getIngredientDef()
   * @generated
   */
  EAttribute getIngredientDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef#getEffects()
   * @see #getIngredientDef()
   * @generated
   */
  EReference getIngredientDef_Effects();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef#getPrice()
   * @see #getIngredientDef()
   * @generated
   */
  EAttribute getIngredientDef_Price();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef#getWeight()
   * @see #getIngredientDef()
   * @generated
   */
  EAttribute getIngredientDef_Weight();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef#getSource()
   * @see #getIngredientDef()
   * @generated
   */
  EAttribute getIngredientDef_Source();

  /**
   * Returns the meta object for class '{@link es.skyrim.alchemy.alchemyLab.IngredientAlias <em>Ingredient Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ingredient Alias</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientAlias
   * @generated
   */
  EClass getIngredientAlias();

  /**
   * Returns the meta object for the attribute '{@link es.skyrim.alchemy.alchemyLab.IngredientAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see es.skyrim.alchemy.alchemyLab.IngredientAlias#getAlias()
   * @see #getIngredientAlias()
   * @generated
   */
  EAttribute getIngredientAlias_Alias();

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
   * Returns the meta object for the containment reference list '{@link es.skyrim.alchemy.alchemyLab.Recipe#getIngredients <em>Ingredients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ingredients</em>'.
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
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.EffectImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__EFFECT = eINSTANCE.getEffect_Effect();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectDefImpl <em>Effect Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.EffectDefImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffectDef()
     * @generated
     */
    EClass EFFECT_DEF = eINSTANCE.getEffectDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_DEF__NAME = eINSTANCE.getEffectDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_DEF__TYPE = eINSTANCE.getEffectDef_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_DEF__DESCRIPTION = eINSTANCE.getEffectDef_Description();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.EffectAliasImpl <em>Effect Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.EffectAliasImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getEffectAlias()
     * @generated
     */
    EClass EFFECT_ALIAS = eINSTANCE.getEffectAlias();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_ALIAS__ALIAS = eINSTANCE.getEffectAlias_Alias();

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
     * The meta object literal for the '<em><b>Ingredient</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INGREDIENT__INGREDIENT = eINSTANCE.getIngredient_Ingredient();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientDefImpl <em>Ingredient Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.IngredientDefImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredientDef()
     * @generated
     */
    EClass INGREDIENT_DEF = eINSTANCE.getIngredientDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT_DEF__NAME = eINSTANCE.getIngredientDef_Name();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INGREDIENT_DEF__EFFECTS = eINSTANCE.getIngredientDef_Effects();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT_DEF__PRICE = eINSTANCE.getIngredientDef_Price();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT_DEF__WEIGHT = eINSTANCE.getIngredientDef_Weight();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT_DEF__SOURCE = eINSTANCE.getIngredientDef_Source();

    /**
     * The meta object literal for the '{@link es.skyrim.alchemy.alchemyLab.impl.IngredientAliasImpl <em>Ingredient Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.skyrim.alchemy.alchemyLab.impl.IngredientAliasImpl
     * @see es.skyrim.alchemy.alchemyLab.impl.AlchemyLabPackageImpl#getIngredientAlias()
     * @generated
     */
    EClass INGREDIENT_ALIAS = eINSTANCE.getIngredientAlias();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INGREDIENT_ALIAS__ALIAS = eINSTANCE.getIngredientAlias_Alias();

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
     * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
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
