/**
 * generated by Xtext 2.10.0
 */
package org.mondo.collaboration.policy.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.ValueBind#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getValueBind()
 * @model
 * @generated
 */
public interface ValueBind extends Bind
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.mondo.collaboration.policy.rules.ValueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.mondo.collaboration.policy.rules.ValueType
   * @see #setValue(ValueType)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getValueBind_Value()
   * @model
   * @generated
   */
  ValueType getValue();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.ValueBind#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.mondo.collaboration.policy.rules.ValueType
   * @see #getValue()
   * @generated
   */
  void setValue(ValueType value);

} // ValueBind
