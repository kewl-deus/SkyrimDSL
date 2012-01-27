/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.AlchemyLabModel;
import es.skyrim.alchemy.alchemyLab.AlchemyLabPackage;
import es.skyrim.alchemy.alchemyLab.EffectDef;
import es.skyrim.alchemy.alchemyLab.IngredientDef;
import es.skyrim.alchemy.alchemyLab.Recipe;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link es.skyrim.alchemy.alchemyLab.impl.AlchemyLabModelImpl#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlchemyLabModelImpl extends MinimalEObjectImpl.Container implements AlchemyLabModel
{
  /**
   * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffects()
   * @generated
   * @ordered
   */
  protected EList<EffectDef> effects;

  /**
   * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredients()
   * @generated
   * @ordered
   */
  protected EList<IngredientDef> ingredients;

  /**
   * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipes()
   * @generated
   * @ordered
   */
  protected EList<Recipe> recipes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlchemyLabModelImpl()
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
    return AlchemyLabPackage.Literals.ALCHEMY_LAB_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EffectDef> getEffects()
  {
    if (effects == null)
    {
      effects = new EObjectContainmentEList<EffectDef>(EffectDef.class, this, AlchemyLabPackage.ALCHEMY_LAB_MODEL__EFFECTS);
    }
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IngredientDef> getIngredients()
  {
    if (ingredients == null)
    {
      ingredients = new EObjectContainmentEList<IngredientDef>(IngredientDef.class, this, AlchemyLabPackage.ALCHEMY_LAB_MODEL__INGREDIENTS);
    }
    return ingredients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recipe> getRecipes()
  {
    if (recipes == null)
    {
      recipes = new EObjectContainmentEList<Recipe>(Recipe.class, this, AlchemyLabPackage.ALCHEMY_LAB_MODEL__RECIPES);
    }
    return recipes;
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
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__EFFECTS:
        return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__INGREDIENTS:
        return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__RECIPES:
        return ((InternalEList<?>)getRecipes()).basicRemove(otherEnd, msgs);
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
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__EFFECTS:
        return getEffects();
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__INGREDIENTS:
        return getIngredients();
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__RECIPES:
        return getRecipes();
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
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends EffectDef>)newValue);
        return;
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__INGREDIENTS:
        getIngredients().clear();
        getIngredients().addAll((Collection<? extends IngredientDef>)newValue);
        return;
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__RECIPES:
        getRecipes().clear();
        getRecipes().addAll((Collection<? extends Recipe>)newValue);
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
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__EFFECTS:
        getEffects().clear();
        return;
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__INGREDIENTS:
        getIngredients().clear();
        return;
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__RECIPES:
        getRecipes().clear();
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
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__EFFECTS:
        return effects != null && !effects.isEmpty();
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__INGREDIENTS:
        return ingredients != null && !ingredients.isEmpty();
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL__RECIPES:
        return recipes != null && !recipes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AlchemyLabModelImpl
