/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.util;

import es.skyrim.alchemy.alchemyLab.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage
 * @generated
 */
public class AlchemyLabAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlchemyLabPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlchemyLabAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlchemyLabPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlchemyLabSwitch<Adapter> modelSwitch =
    new AlchemyLabSwitch<Adapter>()
    {
      @Override
      public Adapter caseAlchemyLabModel(AlchemyLabModel object)
      {
        return createAlchemyLabModelAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseEffectDef(EffectDef object)
      {
        return createEffectDefAdapter();
      }
      @Override
      public Adapter caseEffectAlias(EffectAlias object)
      {
        return createEffectAliasAdapter();
      }
      @Override
      public Adapter caseIngredient(Ingredient object)
      {
        return createIngredientAdapter();
      }
      @Override
      public Adapter caseIngredientDef(IngredientDef object)
      {
        return createIngredientDefAdapter();
      }
      @Override
      public Adapter caseIngredientAlias(IngredientAlias object)
      {
        return createIngredientAliasAdapter();
      }
      @Override
      public Adapter caseRecipe(Recipe object)
      {
        return createRecipeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.AlchemyLabModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.AlchemyLabModel
   * @generated
   */
  public Adapter createAlchemyLabModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.EffectDef <em>Effect Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.EffectDef
   * @generated
   */
  public Adapter createEffectDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.EffectAlias <em>Effect Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.EffectAlias
   * @generated
   */
  public Adapter createEffectAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.Ingredient <em>Ingredient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.Ingredient
   * @generated
   */
  public Adapter createIngredientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.IngredientDef <em>Ingredient Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.IngredientDef
   * @generated
   */
  public Adapter createIngredientDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.IngredientAlias <em>Ingredient Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.IngredientAlias
   * @generated
   */
  public Adapter createIngredientAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.skyrim.alchemy.alchemyLab.Recipe <em>Recipe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.skyrim.alchemy.alchemyLab.Recipe
   * @generated
   */
  public Adapter createRecipeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AlchemyLabAdapterFactory
