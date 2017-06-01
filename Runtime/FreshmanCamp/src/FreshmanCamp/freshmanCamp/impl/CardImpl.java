/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.Card;
import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.CardType;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.Room;

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
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CardImpl#getType <em>Type</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CardImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CardImpl#getCardsenior <em>Cardsenior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CardType TYPE_EDEFAULT = CardType.BLUE_CARD_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CardType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList rooms;

	/**
	 * The cached value of the '{@link #getCardsenior() <em>Cardsenior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardsenior()
	 * @generated
	 * @ordered
	 */
	protected CardSenior cardsenior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CardType newType) {
		CardType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CARD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList(Room.class, this, FreshmanCampPackage.CARD__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSenior getCardsenior() {
		if (cardsenior != null && cardsenior.eIsProxy()) {
			InternalEObject oldCardsenior = (InternalEObject)cardsenior;
			cardsenior = (CardSenior)eResolveProxy(oldCardsenior);
			if (cardsenior != oldCardsenior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreshmanCampPackage.CARD__CARDSENIOR, oldCardsenior, cardsenior));
			}
		}
		return cardsenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSenior basicGetCardsenior() {
		return cardsenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardsenior(CardSenior newCardsenior) {
		CardSenior oldCardsenior = cardsenior;
		cardsenior = newCardsenior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CARD__CARDSENIOR, oldCardsenior, cardsenior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.CARD__ROOMS:
				return ((InternalEList)getRooms()).basicRemove(otherEnd, msgs);
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
			case FreshmanCampPackage.CARD__TYPE:
				return getType();
			case FreshmanCampPackage.CARD__ROOMS:
				return getRooms();
			case FreshmanCampPackage.CARD__CARDSENIOR:
				if (resolve) return getCardsenior();
				return basicGetCardsenior();
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
			case FreshmanCampPackage.CARD__TYPE:
				setType((CardType)newValue);
				return;
			case FreshmanCampPackage.CARD__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection)newValue);
				return;
			case FreshmanCampPackage.CARD__CARDSENIOR:
				setCardsenior((CardSenior)newValue);
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
			case FreshmanCampPackage.CARD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FreshmanCampPackage.CARD__ROOMS:
				getRooms().clear();
				return;
			case FreshmanCampPackage.CARD__CARDSENIOR:
				setCardsenior((CardSenior)null);
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
			case FreshmanCampPackage.CARD__TYPE:
				return type != TYPE_EDEFAULT;
			case FreshmanCampPackage.CARD__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case FreshmanCampPackage.CARD__CARDSENIOR:
				return cardsenior != null;
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

} //CardImpl
