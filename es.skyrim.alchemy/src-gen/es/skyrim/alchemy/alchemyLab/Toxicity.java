/**
 * <copyright>
 * </copyright>
 *

 */
package es.skyrim.alchemy.alchemyLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Toxicity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.skyrim.alchemy.alchemyLab.AlchemyLabPackage#getToxicity()
 * @model
 * @generated
 */
public enum Toxicity implements Enumerator
{
  /**
   * The '<em><b>POTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POTION_VALUE
   * @generated
   * @ordered
   */
  POTION(0, "POTION", "potion"),

  /**
   * The '<em><b>POISON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POISON_VALUE
   * @generated
   * @ordered
   */
  POISON(1, "POISON", "poison"),

  /**
   * The '<em><b>MIXTURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIXTURE_VALUE
   * @generated
   * @ordered
   */
  MIXTURE(2, "MIXTURE", "mixture");

  /**
   * The '<em><b>POTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POTION
   * @model literal="potion"
   * @generated
   * @ordered
   */
  public static final int POTION_VALUE = 0;

  /**
   * The '<em><b>POISON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POISON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POISON
   * @model literal="poison"
   * @generated
   * @ordered
   */
  public static final int POISON_VALUE = 1;

  /**
   * The '<em><b>MIXTURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MIXTURE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIXTURE
   * @model literal="mixture"
   * @generated
   * @ordered
   */
  public static final int MIXTURE_VALUE = 2;

  /**
   * An array of all the '<em><b>Toxicity</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Toxicity[] VALUES_ARRAY =
    new Toxicity[]
    {
      POTION,
      POISON,
      MIXTURE,
    };

  /**
   * A public read-only list of all the '<em><b>Toxicity</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Toxicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Toxicity</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Toxicity get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Toxicity result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Toxicity</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Toxicity getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Toxicity result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Toxicity</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Toxicity get(int value)
  {
    switch (value)
    {
      case POTION_VALUE: return POTION;
      case POISON_VALUE: return POISON;
      case MIXTURE_VALUE: return MIXTURE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Toxicity(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Toxicity
