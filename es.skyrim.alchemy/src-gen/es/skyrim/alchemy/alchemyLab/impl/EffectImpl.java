/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.AlchemyLabPackage;
import es.skyrim.alchemy.alchemyLab.Effect;
import es.skyrim.alchemy.alchemyLab.EffectType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.EffectImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final EffectType TYPE_EDEFAULT = EffectType.FORTIFY;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EffectType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected Effect effect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlchemyLabPackage.Literals.EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.EFFECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EffectType newType)
  {
    EffectType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.EFFECT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.EFFECT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect getEffect()
  {
    if (effect != null && effect.eIsProxy())
    {
      InternalEObject oldEffect = (InternalEObject)effect;
      effect = (Effect)eResolveProxy(oldEffect);
      if (effect != oldEffect)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlchemyLabPackage.EFFECT__EFFECT, oldEffect, effect));
      }
    }
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect basicGetEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(Effect newEffect)
  {
    Effect oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.EFFECT__EFFECT, oldEffect, effect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlchemyLabPackage.EFFECT__NAME:
        return getName();
      case AlchemyLabPackage.EFFECT__TYPE:
        return getType();
      case AlchemyLabPackage.EFFECT__DESCRIPTION:
        return getDescription();
      case AlchemyLabPackage.EFFECT__EFFECT:
        if (resolve) return getEffect();
        return basicGetEffect();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlchemyLabPackage.EFFECT__NAME:
        setName((String)newValue);
        return;
      case AlchemyLabPackage.EFFECT__TYPE:
        setType((EffectType)newValue);
        return;
      case AlchemyLabPackage.EFFECT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlchemyLabPackage.EFFECT__EFFECT:
        setEffect((Effect)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlchemyLabPackage.EFFECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlchemyLabPackage.EFFECT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AlchemyLabPackage.EFFECT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlchemyLabPackage.EFFECT__EFFECT:
        setEffect((Effect)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlchemyLabPackage.EFFECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlchemyLabPackage.EFFECT__TYPE:
        return type != TYPE_EDEFAULT;
      case AlchemyLabPackage.EFFECT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlchemyLabPackage.EFFECT__EFFECT:
        return effect != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EffectImpl
