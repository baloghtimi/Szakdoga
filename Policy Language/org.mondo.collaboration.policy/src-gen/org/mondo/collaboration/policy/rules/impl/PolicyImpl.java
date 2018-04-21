/**
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.rules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.Policy;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.policy.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.PolicyImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.PolicyImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.PolicyImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.PolicyImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessibilityLevel ACCESS_EDEFAULT = AccessibilityLevel.ALLOW;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessibilityLevel access = ACCESS_EDEFAULT;

  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final OperationType OPERATION_EDEFAULT = OperationType.UNSET;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected OperationType operation = OPERATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolution()
   * @generated
   * @ordered
   */
  protected static final ResolutionType RESOLUTION_EDEFAULT = ResolutionType.RESTRICTIVE;

  /**
   * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolution()
   * @generated
   * @ordered
   */
  protected ResolutionType resolution = RESOLUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolicyImpl()
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
    return RulesPackage.Literals.POLICY;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessibilityLevel getAccess()
  {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessibilityLevel newAccess)
  {
    AccessibilityLevel oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.POLICY__ACCESS, oldAccess, access));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(OperationType newOperation)
  {
    OperationType oldOperation = operation;
    operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.POLICY__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, RulesPackage.POLICY__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResolutionType getResolution()
  {
    return resolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolution(ResolutionType newResolution)
  {
    ResolutionType oldResolution = resolution;
    resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.POLICY__RESOLUTION, oldResolution, resolution));
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
      case RulesPackage.POLICY__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
      case RulesPackage.POLICY__NAME:
        return getName();
      case RulesPackage.POLICY__ACCESS:
        return getAccess();
      case RulesPackage.POLICY__OPERATION:
        return getOperation();
      case RulesPackage.POLICY__RULES:
        return getRules();
      case RulesPackage.POLICY__RESOLUTION:
        return getResolution();
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
      case RulesPackage.POLICY__NAME:
        setName((String)newValue);
        return;
      case RulesPackage.POLICY__ACCESS:
        setAccess((AccessibilityLevel)newValue);
        return;
      case RulesPackage.POLICY__OPERATION:
        setOperation((OperationType)newValue);
        return;
      case RulesPackage.POLICY__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case RulesPackage.POLICY__RESOLUTION:
        setResolution((ResolutionType)newValue);
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
      case RulesPackage.POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RulesPackage.POLICY__ACCESS:
        setAccess(ACCESS_EDEFAULT);
        return;
      case RulesPackage.POLICY__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case RulesPackage.POLICY__RULES:
        getRules().clear();
        return;
      case RulesPackage.POLICY__RESOLUTION:
        setResolution(RESOLUTION_EDEFAULT);
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
      case RulesPackage.POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RulesPackage.POLICY__ACCESS:
        return access != ACCESS_EDEFAULT;
      case RulesPackage.POLICY__OPERATION:
        return operation != OPERATION_EDEFAULT;
      case RulesPackage.POLICY__RULES:
        return rules != null && !rules.isEmpty();
      case RulesPackage.POLICY__RESOLUTION:
        return resolution != RESOLUTION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", access: ");
    result.append(access);
    result.append(", operation: ");
    result.append(operation);
    result.append(", resolution: ");
    result.append(resolution);
    result.append(')');
    return result.toString();
  }

} //PolicyImpl
