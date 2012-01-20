/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.EffectDef#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.EffectDef#getType <em>Type</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.EffectDef#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffectDef()
 * @model
 * @generated
 */
public interface EffectDef extends Effect
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffectDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.EffectDef#getName <em>Name</em>}' attribute.
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffectDef_Type()
   * @model
   * @generated
   */
  EffectType getType();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.EffectDef#getType <em>Type</em>}' attribute.
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
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getEffectDef_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link es.skyrim.alchemy.alchemyLab.EffectDef#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // EffectDef
