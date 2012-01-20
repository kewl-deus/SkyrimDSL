/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getEffects <em>Effects</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getAlchemyLabModel()
 * @model
 * @generated
 */
public interface AlchemyLabModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
   * The list contents are of type {@link es.skyrim.alchemy.alchemyLab.Effect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effects</em>' containment reference list.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getAlchemyLabModel_Effects()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffects();

  /**
   * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
   * The list contents are of type {@link es.skyrim.alchemy.alchemyLab.Ingredient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ingredients</em>' containment reference list.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getAlchemyLabModel_Ingredients()
   * @model containment="true"
   * @generated
   */
  EList<Ingredient> getIngredients();

  /**
   * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
   * The list contents are of type {@link es.skyrim.alchemy.alchemyLab.Recipe}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipes</em>' containment reference list.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getAlchemyLabModel_Recipes()
   * @model containment="true"
   * @generated
   */
  EList<Recipe> getRecipes();

} // AlchemyLabModel
