/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getEffects <em>Effects</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getPrice <em>Price</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getWeight <em>Weight</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getIngredientDef()
 * @model
 * @generated
 */
public interface IngredientDef extends Ingredient
{
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getIngredientDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getName <em>Name</em>}' attribute.
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getIngredientDef_Effects()
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getIngredientDef_Price()
   * @model
   * @generated
   */
  float getPrice();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(float value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(float)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getIngredientDef_Weight()
   * @model
   * @generated
   */
  float getWeight();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(float value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getIngredientDef_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.IngredientDef#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

} // IngredientDef