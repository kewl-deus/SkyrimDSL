/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage
 * @generated
 */
public interface AlchemyLabFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlchemyLabFactory eINSTANCE = es.skyrim.alchemy.alchemyLab.impl.AlchemyLabFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  AlchemyLabModel createAlchemyLabModel();

  /**
   * Returns a new object of class '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effect</em>'.
   * @generated
   */
  Effect createEffect();

  /**
   * Returns a new object of class '<em>Effect Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effect Def</em>'.
   * @generated
   */
  EffectDef createEffectDef();

  /**
   * Returns a new object of class '<em>Effect Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effect Alias</em>'.
   * @generated
   */
  EffectAlias createEffectAlias();

  /**
   * Returns a new object of class '<em>Ingredient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingredient</em>'.
   * @generated
   */
  Ingredient createIngredient();

  /**
   * Returns a new object of class '<em>Ingredient Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingredient Def</em>'.
   * @generated
   */
  IngredientDef createIngredientDef();

  /**
   * Returns a new object of class '<em>Ingredient Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingredient Alias</em>'.
   * @generated
   */
  IngredientAlias createIngredientAlias();

  /**
   * Returns a new object of class '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipe</em>'.
   * @generated
   */
  Recipe createRecipe();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AlchemyLabPackage getAlchemyLabPackage();

} //AlchemyLabFactory
