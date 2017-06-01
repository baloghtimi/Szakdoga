/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.Card;
import FreshmanCamp.freshmanCamp.Color;
import FreshmanCamp.freshmanCamp.ColorSenior;
import FreshmanCamp.freshmanCamp.ColorType;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.ColorImpl#getType <em>Type</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.ColorImpl#getCards <em>Cards</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.ColorImpl#getColorsenior <em>Colorsenior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ColorType TYPE_EDEFAULT = ColorType.BLACK_COLOR_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ColorType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCards() <em>Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCards()
	 * @generated
	 * @ordered
	 */
	protected EList cards;

	/**
	 * The cached value of the '{@link #getColorsenior() <em>Colorsenior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorsenior()
	 * @generated
	 * @ordered
	 */
	protected ColorSenior colorsenior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ColorType newType) {
		ColorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.COLOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCards() {
		if (cards == null) {
			cards = new EObjectContainmentEList(Card.class, this, FreshmanCampPackage.COLOR__CARDS);
		}
		return cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSenior getColorsenior() {
		if (colorsenior != null && colorsenior.eIsProxy()) {
			InternalEObject oldColorsenior = (InternalEObject)colorsenior;
			colorsenior = (ColorSenior)eResolveProxy(oldColorsenior);
			if (colorsenior != oldColorsenior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreshmanCampPackage.COLOR__COLORSENIOR, oldColorsenior, colorsenior));
			}
		}
		return colorsenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSenior basicGetColorsenior() {
		return colorsenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorsenior(ColorSenior newColorsenior) {
		ColorSenior oldColorsenior = colorsenior;
		colorsenior = newColorsenior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.COLOR__COLORSENIOR, oldColorsenior, colorsenior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.COLOR__CARDS:
				return ((InternalEList)getCards()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreshmanCampPackage.COLOR__TYPE:
				return getType();
			case FreshmanCampPackage.COLOR__CARDS:
				return getCards();
			case FreshmanCampPackage.COLOR__COLORSENIOR:
				if (resolve) return getColorsenior();
				return basicGetColorsenior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FreshmanCampPackage.COLOR__TYPE:
				setType((ColorType)newValue);
				return;
			case FreshmanCampPackage.COLOR__CARDS:
				getCards().clear();
				getCards().addAll((Collection)newValue);
				return;
			case FreshmanCampPackage.COLOR__COLORSENIOR:
				setColorsenior((ColorSenior)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case FreshmanCampPackage.COLOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FreshmanCampPackage.COLOR__CARDS:
				getCards().clear();
				return;
			case FreshmanCampPackage.COLOR__COLORSENIOR:
				setColorsenior((ColorSenior)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FreshmanCampPackage.COLOR__TYPE:
				return type != TYPE_EDEFAULT;
			case FreshmanCampPackage.COLOR__CARDS:
				return cards != null && !cards.isEmpty();
			case FreshmanCampPackage.COLOR__COLORSENIOR:
				return colorsenior != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ColorImpl
