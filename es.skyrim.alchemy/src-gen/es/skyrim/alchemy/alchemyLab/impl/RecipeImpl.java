/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.AlchemyLabPackage;
import es.skyrim.alchemy.alchemyLab.Effect;
import es.skyrim.alchemy.alchemyLab.Ingredient;
import es.skyrim.alchemy.alchemyLab.Recipe;
import es.skyrim.alchemy.alchemyLab.Toxicity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl#getToxicity <em>Toxicity</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.RecipeImpl#getIngredients <em>Ingredients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe
{
  /**
   * The default value of the '{@link #getToxicity() <em>Toxicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToxicity()
   * @generated
   * @ordered
   */
  protected static final Toxicity TOXICITY_EDEFAULT = Toxicity.POTION;

  /**
   * The cached value of the '{@link #getToxicity() <em>Toxicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToxicity()
   * @generated
   * @ordered
   */
  protected Toxicity toxicity = TOXICITY_EDEFAULT;

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
   * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredients()
   * @generated
   * @ordered
   */
  protected EList<Ingredient> ingredients;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecipeImpl()
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
    return AlchemyLabPackage.Literals.RECIPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Toxicity getToxicity()
  {
    return toxicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToxicity(Toxicity newToxicity)
  {
    Toxicity oldToxicity = toxicity;
    toxicity = newToxicity == null ? TOXICITY_EDEFAULT : newToxicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.RECIPE__TOXICITY, oldToxicity, toxicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.RECIPE__NAME, oldName, name));
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
      effects = new EObjectContainmentEList<Effect>(Effect.class, this, AlchemyLabPackage.RECIPE__EFFECTS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.RECIPE__PRICE, oldPrice, price));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ingredient> getIngredients()
  {
    if (ingredients == null)
    {
      ingredients = new EObjectResolvingEList<Ingredient>(Ingredient.class, this, AlchemyLabPackage.RECIPE__INGREDIENTS);
    }
    return ingredients;
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
      case AlchemyLabPackage.RECIPE__EFFECTS:
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
      case AlchemyLabPackage.RECIPE__TOXICITY:
        return getToxicity();
      case AlchemyLabPackage.RECIPE__NAME:
        return getName();
      case AlchemyLabPackage.RECIPE__EFFECTS:
        return getEffects();
      case AlchemyLabPackage.RECIPE__PRICE:
        return getPrice();
      case AlchemyLabPackage.RECIPE__INGREDIENTS:
        return getIngredients();
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
      case AlchemyLabPackage.RECIPE__TOXICITY:
        setToxicity((Toxicity)newValue);
        return;
      case AlchemyLabPackage.RECIPE__NAME:
        setName((String)newValue);
        return;
      case AlchemyLabPackage.RECIPE__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case AlchemyLabPackage.RECIPE__PRICE:
        setPrice((Float)newValue);
        return;
      case AlchemyLabPackage.RECIPE__INGREDIENTS:
        getIngredients().clear();
        getIngredients().addAll((Collection<? extends Ingredient>)newValue);
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
      case AlchemyLabPackage.RECIPE__TOXICITY:
        setToxicity(TOXICITY_EDEFAULT);
        return;
      case AlchemyLabPackage.RECIPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlchemyLabPackage.RECIPE__EFFECTS:
        getEffects().clear();
        return;
      case AlchemyLabPackage.RECIPE__PRICE:
        setPrice(PRICE_EDEFAULT);
        return;
      case AlchemyLabPackage.RECIPE__INGREDIENTS:
        getIngredients().clear();
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
      case AlchemyLabPackage.RECIPE__TOXICITY:
        return toxicity != TOXICITY_EDEFAULT;
      case AlchemyLabPackage.RECIPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlchemyLabPackage.RECIPE__EFFECTS:
        return effects != null && !effects.isEmpty();
      case AlchemyLabPackage.RECIPE__PRICE:
        return price != PRICE_EDEFAULT;
      case AlchemyLabPackage.RECIPE__INGREDIENTS:
        return ingredients != null && !ingredients.isEmpty();
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
    result.append(" (toxicity: ");
    result.append(toxicity);
    result.append(", name: ");
    result.append(name);
    result.append(", price: ");
    result.append(price);
    result.append(')');
    return result.toString();
  }

} //RecipeImpl
