/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab.impl;

import es.skyrim.alchemy.alchemyLab.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlchemyLabFactoryImpl extends EFactoryImpl implements AlchemyLabFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlchemyLabFactory init()
  {
    try
    {
      AlchemyLabFactory theAlchemyLabFactory = (AlchemyLabFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.skyrim.es/alchemy/AlchemyLab"); 
      if (theAlchemyLabFactory != null)
      {
        return theAlchemyLabFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AlchemyLabFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlchemyLabFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AlchemyLabPackage.ALCHEMY_LAB_MODEL: return createAlchemyLabModel();
      case AlchemyLabPackage.INGREDIENT: return createIngredient();
      case AlchemyLabPackage.EFFECT: return createEffect();
      case AlchemyLabPackage.RECIPE: return createRecipe();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AlchemyLabPackage.EFFECT_TYPE:
        return createEffectTypeFromString(eDataType, initialValue);
      case AlchemyLabPackage.TOXICITY:
        return createToxicityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AlchemyLabPackage.EFFECT_TYPE:
        return convertEffectTypeToString(eDataType, instanceValue);
      case AlchemyLabPackage.TOXICITY:
        return convertToxicityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlchemyLabModel createAlchemyLabModel()
  {
    AlchemyLabModelImpl alchemyLabModel = new AlchemyLabModelImpl();
    return alchemyLabModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ingredient createIngredient()
  {
    IngredientImpl ingredient = new IngredientImpl();
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipe createRecipe()
  {
    RecipeImpl recipe = new RecipeImpl();
    return recipe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectType createEffectTypeFromString(EDataType eDataType, String initialValue)
  {
    EffectType result = EffectType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEffectTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Toxicity createToxicityFromString(EDataType eDataType, String initialValue)
  {
    Toxicity result = Toxicity.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertToxicityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlchemyLabPackage getAlchemyLabPackage()
  {
    return (AlchemyLabPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AlchemyLabPackage getPackage()
  {
    return AlchemyLabPackage.eINSTANCE;
  }

} //AlchemyLabFactoryImpl
