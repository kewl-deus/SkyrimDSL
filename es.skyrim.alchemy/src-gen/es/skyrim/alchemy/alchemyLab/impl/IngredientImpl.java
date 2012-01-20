/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.AlchemyLabPackage;
import es.skyrim.alchemy.alchemyLab.Effect;
import es.skyrim.alchemy.alchemyLab.Ingredient;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IngredientImpl extends MinimalEObjectImpl.Container implements Ingredient
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
   * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffects()
   * @generated
   * @ordered
   */
  protected EList<Effect> effects;

  /**
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected static final float PRICE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected float price = PRICE_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final float WEIGHT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected float weight = WEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IngredientImpl()
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
    return AlchemyLabPackage.Literals.INGREDIENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.INGREDIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Effect> getEffects()
  {
    if (effects == null)
    {
      effects = new EObjectContainmentEList<Effect>(Effect.class, this, AlchemyLabPackage.INGREDIENT__EFFECTS);
    }
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getPrice()
  {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(float newPrice)
  {
    float oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.INGREDIENT__PRICE, oldPrice, price));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(float newWeight)
  {
    float oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.INGREDIENT__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.INGREDIENT__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlchemyLabPackage.INGREDIENT__EFFECTS:
        return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AlchemyLabPackage.INGREDIENT__NAME:
        return getName();
      case AlchemyLabPackage.INGREDIENT__EFFECTS:
        return getEffects();
      case AlchemyLabPackage.INGREDIENT__PRICE:
        return getPrice();
      case AlchemyLabPackage.INGREDIENT__WEIGHT:
        return getWeight();
      case AlchemyLabPackage.INGREDIENT__SOURCE:
        return getSource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlchemyLabPackage.INGREDIENT__NAME:
        setName((String)newValue);
        return;
      case AlchemyLabPackage.INGREDIENT__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case AlchemyLabPackage.INGREDIENT__PRICE:
        setPrice((Float)newValue);
        return;
      case AlchemyLabPackage.INGREDIENT__WEIGHT:
        setWeight((Float)newValue);
        return;
      case AlchemyLabPackage.INGREDIENT__SOURCE:
        setSource((String)newValue);
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
      case AlchemyLabPackage.INGREDIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlchemyLabPackage.INGREDIENT__EFFECTS:
        getEffects().clear();
        return;
      case AlchemyLabPackage.INGREDIENT__PRICE:
        setPrice(PRICE_EDEFAULT);
        return;
      case AlchemyLabPackage.INGREDIENT__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case AlchemyLabPackage.INGREDIENT__SOURCE:
        setSource(SOURCE_EDEFAULT);
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
      case AlchemyLabPackage.INGREDIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlchemyLabPackage.INGREDIENT__EFFECTS:
        return effects != null && !effects.isEmpty();
      case AlchemyLabPackage.INGREDIENT__PRICE:
        return price != PRICE_EDEFAULT;
      case AlchemyLabPackage.INGREDIENT__WEIGHT:
        return weight != WEIGHT_EDEFAULT;
      case AlchemyLabPackage.INGREDIENT__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
    result.append(", price: ");
    result.append(price);
    result.append(", weight: ");
    result.append(weight);
    result.append(", source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //IngredientImpl
