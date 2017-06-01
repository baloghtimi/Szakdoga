/**
 * generated by Xtext 2.11.0
 */
package org.mondo.collaboration.policy.rules;

import org.eclipse.emf.ecore.EReference;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.ReferenceFact#getSourceVar <em>Source Var</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.ReferenceFact#getTargetVar <em>Target Var</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.ReferenceFact#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getReferenceFact()
 * @model
 * @generated
 */
public interface ReferenceFact extends Asset
{
  /**
   * Returns the value of the '<em><b>Source Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Var</em>' reference.
   * @see #setSourceVar(Variable)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getReferenceFact_SourceVar()
   * @model
   * @generated
   */
  Variable getSourceVar();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.ReferenceFact#getSourceVar <em>Source Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Var</em>' reference.
   * @see #getSourceVar()
   * @generated
   */
  void setSourceVar(Variable value);

  /**
   * Returns the value of the '<em><b>Target Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Var</em>' reference.
   * @see #setTargetVar(Variable)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getReferenceFact_TargetVar()
   * @model
   * @generated
   */
  Variable getTargetVar();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.ReferenceFact#getTargetVar <em>Target Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Var</em>' reference.
   * @see #getTargetVar()
   * @generated
   */
  void setTargetVar(Variable value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(EReference)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getReferenceFact_Reference()
   * @model
   * @generated
   */
  EReference getReference();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.ReferenceFact#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(EReference value);

} // ReferenceFact
