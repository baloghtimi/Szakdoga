/**
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.rules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Accessibility Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getAccessibilityLevel()
 * @model
 * @generated
 */
public enum AccessibilityLevel implements Enumerator
{
  /**
   * The '<em><b>ALLOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALLOW_VALUE
   * @generated
   * @ordered
   */
  ALLOW(0, "ALLOW", "allow"),

  /**
   * The '<em><b>DENY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DENY_VALUE
   * @generated
   * @ordered
   */
  DENY(1, "DENY", "deny"),

  /**
   * The '<em><b>OBFUSCATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBFUSCATE_VALUE
   * @generated
   * @ordered
   */
  OBFUSCATE(2, "OBFUSCATE", "obfuscate");

  /**
   * The '<em><b>ALLOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALLOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALLOW
   * @model literal="allow"
   * @generated
   * @ordered
   */
  public static final int ALLOW_VALUE = 0;

  /**
   * The '<em><b>DENY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DENY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DENY
   * @model literal="deny"
   * @generated
   * @ordered
   */
  public static final int DENY_VALUE = 1;

  /**
   * The '<em><b>OBFUSCATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OBFUSCATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBFUSCATE
   * @model literal="obfuscate"
   * @generated
   * @ordered
   */
  public static final int OBFUSCATE_VALUE = 2;

  /**
   * An array of all the '<em><b>Accessibility Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AccessibilityLevel[] VALUES_ARRAY =
    new AccessibilityLevel[]
    {
      ALLOW,
      DENY,
      OBFUSCATE,
    };

  /**
   * A public read-only list of all the '<em><b>Accessibility Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AccessibilityLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Accessibility Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AccessibilityLevel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AccessibilityLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Accessibility Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AccessibilityLevel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AccessibilityLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Accessibility Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AccessibilityLevel get(int value)
  {
    switch (value)
    {
      case ALLOW_VALUE: return ALLOW;
      case DENY_VALUE: return DENY;
      case OBFUSCATE_VALUE: return OBFUSCATE;
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
  private AccessibilityLevel(int value, String name, String literal)
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
  
} //AccessibilityLevel
