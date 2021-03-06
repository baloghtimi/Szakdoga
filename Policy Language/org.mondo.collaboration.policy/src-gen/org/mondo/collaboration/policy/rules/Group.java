/**
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.rules;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.Group#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Role
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' reference list.
   * The list contents are of type {@link org.mondo.collaboration.policy.rules.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' reference list.
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getGroup_Roles()
   * @model
   * @generated
   */
  EList<Role> getRoles();

} // Group
