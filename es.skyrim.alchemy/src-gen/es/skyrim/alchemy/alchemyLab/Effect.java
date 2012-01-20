/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Effect#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Effect#getType <em>Type</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Effect#getDescription <em>Description</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.Effect#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffect_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Effect#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link es.skyrim.alchemy.alchemyLab.EffectType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see es.skyrim.alchemy.alchemyLab.EffectType
   * @see #setType(EffectType)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffect_Type()
   * @model
   * @generated
   */
  EffectType getType();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Effect#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see es.skyrim.alchemy.alchemyLab.EffectType
   * @see #getType()
   * @generated
   */
  void setType(EffectType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffect_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Effect#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Effect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' reference.
   * @see #setEffect(Effect)
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffect_Effect()
   * @model
   * @generated
   */
  Effect getEffect();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.Effect#getEffect <em>Effect</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(Effect value);

} // Effect
