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
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Recipe#getToxicity <em>Toxicity</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Recipe#getEffects <em>Effects</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Recipe#getPrice <em>Price</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Recipe#getIngredients <em>Ingredients</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject
{
  /**
   * Returns the value of the '<em><b>Toxicity</b></em>' attribute.
   * The literals are from the enumeration {@link es.skyrim.alchemy.alchemyLab.Toxicity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Toxicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Toxicity</em>' attribute.
   * @see es.skyrim.alchemy.alchemyLab.Toxicity
   * @see #setToxicity(Toxicity)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getRecipe_Toxicity()
   * @model
   * @generated
   */
  Toxicity getToxicity();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Recipe#getToxicity <em>Toxicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Toxicity</em>' attribute.
   * @see es.skyrim.alchemy.alchemyLab.Toxicity
   * @see #getToxicity()
   * @generated
   */
  void setToxicity(Toxicity value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getRecipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Recipe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getRecipe_Effects()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffects();

  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(float)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getRecipe_Price()
   * @model
   * @generated
   */
  float getPrice();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Recipe#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(float value);

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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getRecipe_Ingredients()
   * @model containment="true"
   * @generated
   */
  EList<Ingredient> getIngredients();

} // Recipe
