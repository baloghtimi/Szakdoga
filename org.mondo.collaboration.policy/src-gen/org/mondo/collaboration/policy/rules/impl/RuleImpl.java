/**
 * generated by Xtext 2.11.0
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

import org.mondo.collaboration.policy.rules.Asset;
import org.mondo.collaboration.policy.rules.Binding;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.policy.rules.RuleConstraint;
import org.mondo.collaboration.policy.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
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
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected RuleConstraint constraint;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern;

  /**
   * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsset()
   * @generated
   * @ordered
   */
  protected Asset asset;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<Binding> bindings;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return RulesPackage.Literals.RULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleConstraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(RuleConstraint newConstraint, NotificationChain msgs)
  {
    RuleConstraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(RuleConstraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULE__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULE__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectResolvingEList<Role>(Role.class, this, RulesPackage.RULE__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (Pattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.RULE__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asset getAsset()
  {
    return asset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs)
  {
    Asset oldAsset = asset;
    asset = newAsset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__ASSET, oldAsset, newAsset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsset(Asset newAsset)
  {
    if (newAsset != asset)
    {
      NotificationChain msgs = null;
      if (asset != null)
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.RULE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__ASSET, newAsset, newAsset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, RulesPackage.RULE__BINDINGS);
    }
    return bindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.RULE__PRIORITY, oldPriority, priority));
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
      case RulesPackage.RULE__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case RulesPackage.RULE__ASSET:
        return basicSetAsset(null, msgs);
      case RulesPackage.RULE__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case RulesPackage.RULE__NAME:
        return getName();
      case RulesPackage.RULE__CONSTRAINT:
        return getConstraint();
      case RulesPackage.RULE__ROLES:
        return getRoles();
      case RulesPackage.RULE__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case RulesPackage.RULE__ASSET:
        return getAsset();
      case RulesPackage.RULE__BINDINGS:
        return getBindings();
      case RulesPackage.RULE__PRIORITY:
        return getPriority();
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
      case RulesPackage.RULE__NAME:
        setName((String)newValue);
        return;
      case RulesPackage.RULE__CONSTRAINT:
        setConstraint((RuleConstraint)newValue);
        return;
      case RulesPackage.RULE__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case RulesPackage.RULE__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case RulesPackage.RULE__ASSET:
        setAsset((Asset)newValue);
        return;
      case RulesPackage.RULE__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
        return;
      case RulesPackage.RULE__PRIORITY:
        setPriority((Integer)newValue);
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
      case RulesPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RulesPackage.RULE__CONSTRAINT:
        setConstraint((RuleConstraint)null);
        return;
      case RulesPackage.RULE__ROLES:
        getRoles().clear();
        return;
      case RulesPackage.RULE__PATTERN:
        setPattern((Pattern)null);
        return;
      case RulesPackage.RULE__ASSET:
        setAsset((Asset)null);
        return;
      case RulesPackage.RULE__BINDINGS:
        getBindings().clear();
        return;
      case RulesPackage.RULE__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
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
      case RulesPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RulesPackage.RULE__CONSTRAINT:
        return constraint != null;
      case RulesPackage.RULE__ROLES:
        return roles != null && !roles.isEmpty();
      case RulesPackage.RULE__PATTERN:
        return pattern != null;
      case RulesPackage.RULE__ASSET:
        return asset != null;
      case RulesPackage.RULE__BINDINGS:
        return bindings != null && !bindings.isEmpty();
      case RulesPackage.RULE__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
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
    result.append(", priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
