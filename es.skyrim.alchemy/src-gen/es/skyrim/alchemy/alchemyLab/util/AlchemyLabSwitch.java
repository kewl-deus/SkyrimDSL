/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.util;

import es.skyrim.alchemy.alchemyLab.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage
 * @generated
 */
public class AlchemyLabSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlchemyLabPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlchemyLabSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AlchemyLabPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL:
      {
        AlchemyLabModel alchemyLabModel = (AlchemyLabModel)theEObject;
        T result = caseAlchemyLabModel(alchemyLabModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.EFFECT:
      {
        Effect effect = (Effect)theEObject;
        T result = caseEffect(effect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.EFFECT_DEF:
      {
        EffectDef effectDef = (EffectDef)theEObject;
        T result = caseEffectDef(effectDef);
        if (result == null) result = caseEffect(effectDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.EFFECT_ALIAS:
      {
        EffectAlias effectAlias = (EffectAlias)theEObject;
        T result = caseEffectAlias(effectAlias);
        if (result == null) result = caseEffect(effectAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.INGREDIENT:
      {
        Ingredient ingredient = (Ingredient)theEObject;
        T result = caseIngredient(ingredient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.INGREDIENT_DEF:
      {
        IngredientDef ingredientDef = (IngredientDef)theEObject;
        T result = caseIngredientDef(ingredientDef);
        if (result == null) result = caseIngredient(ingredientDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.INGREDIENT_ALIAS:
      {
        IngredientAlias ingredientAlias = (IngredientAlias)theEObject;
        T result = caseIngredientAlias(ingredientAlias);
        if (result == null) result = caseIngredient(ingredientAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlchemyLabPackage.RECIPE:
      {
        Recipe recipe = (Recipe)theEObject;
        T result = caseRecipe(recipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlchemyLabModel(AlchemyLabModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffect(Effect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectDef(EffectDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectAlias(EffectAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIngredient(Ingredient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ingredient Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ingredient Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIngredientDef(IngredientDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ingredient Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ingredient Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIngredientAlias(IngredientAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipe(Recipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AlchemyLabSwitch
