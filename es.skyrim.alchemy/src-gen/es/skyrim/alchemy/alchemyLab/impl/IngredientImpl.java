/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.AlchemyLabPackage;
import es.skyrim.alchemy.alchemyLab.Ingredient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.IngredientImpl#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IngredientImpl extends MinimalEObjectImpl.Container implements Ingredient
{
  /**
   * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredient()
   * @generated
   * @ordered
   */
  protected Ingredient ingredient;

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
  public Ingredient getIngredient()
  {
    if (ingredient != null && ingredient.eIsProxy())
    {
      InternalEObject oldIngredient = (InternalEObject)ingredient;
      ingredient = (Ingredient)eResolveProxy(oldIngredient);
      if (ingredient != oldIngredient)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlchemyLabPackage.INGREDIENT__INGREDIENT, oldIngredient, ingredient));
      }
    }
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ingredient basicGetIngredient()
  {
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIngredient(Ingredient newIngredient)
  {
    Ingredient oldIngredient = ingredient;
    ingredient = newIngredient;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlchemyLabPackage.INGREDIENT__INGREDIENT, oldIngredient, ingredient));
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
      case AlchemyLabPackage.INGREDIENT__INGREDIENT:
        if (resolve) return getIngredient();
        return basicGetIngredient();
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
      case AlchemyLabPackage.INGREDIENT__INGREDIENT:
        setIngredient((Ingredient)newValue);
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
      case AlchemyLabPackage.INGREDIENT__INGREDIENT:
        setIngredient((Ingredient)null);
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
      case AlchemyLabPackage.INGREDIENT__INGREDIENT:
        return ingredient != null;
    }
    return super.eIsSet(featureID);
  }

} //IngredientImpl
