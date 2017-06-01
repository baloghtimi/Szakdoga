/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.CardType;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.RoomSenior;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Senior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.RoomSeniorImpl#getCard <em>Card</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.RoomSeniorImpl#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomSeniorImpl extends SeniorImpl implements RoomSenior {
	/**
	 * The default value of the '{@link #getCard() <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected static final CardType CARD_EDEFAULT = CardType.BLUE_CARD_LITERAL;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected CardType card = CARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperior() <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperior()
	 * @generated
	 * @ordered
	 */
	protected CardSenior superior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomSeniorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.ROOM_SENIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardType getCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(CardType newCard) {
		CardType oldCard = card;
		card = newCard == null ? CARD_EDEFAULT : newCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.ROOM_SENIOR__CARD, oldCard, card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSenior getSuperior() {
		if (superior != null && superior.eIsProxy()) {
			InternalEObject oldSuperior = (InternalEObject)superior;
			superior = (CardSenior)eResolveProxy(oldSuperior);
			if (superior != oldSuperior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreshmanCampPackage.ROOM_SENIOR__SUPERIOR, oldSuperior, superior));
			}
		}
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSenior basicGetSuperior() {
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperior(CardSenior newSuperior, NotificationChain msgs) {
		CardSenior oldSuperior = superior;
		superior = newSuperior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.ROOM_SENIOR__SUPERIOR, oldSuperior, newSuperior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperior(CardSenior newSuperior) {
		if (newSuperior != superior) {
			NotificationChain msgs = null;
			if (superior != null)
				msgs = ((InternalEObject)superior).eInverseRemove(this, FreshmanCampPackage.CARD_SENIOR__INFERIORS, CardSenior.class, msgs);
			if (newSuperior != null)
				msgs = ((InternalEObject)newSuperior).eInverseAdd(this, FreshmanCampPackage.CARD_SENIOR__INFERIORS, CardSenior.class, msgs);
			msgs = basicSetSuperior(newSuperior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.ROOM_SENIOR__SUPERIOR, newSuperior, newSuperior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.ROOM_SENIOR__SUPERIOR:
				if (superior != null)
					msgs = ((InternalEObject)superior).eInverseRemove(this, FreshmanCampPackage.CARD_SENIOR__INFERIORS, CardSenior.class, msgs);
				return basicSetSuperior((CardSenior)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.ROOM_SENIOR__SUPERIOR:
				return basicSetSuperior(null, msgs);
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
			case FreshmanCampPackage.ROOM_SENIOR__CARD:
				return getCard();
			case FreshmanCampPackage.ROOM_SENIOR__SUPERIOR:
				if (resolve) return getSuperior();
				return basicGetSuperior();
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
			case FreshmanCampPackage.ROOM_SENIOR__CARD:
				setCard((CardType)newValue);
				return;
			case FreshmanCampPackage.ROOM_SENIOR__SUPERIOR:
				setSuperior((CardSenior)newValue);
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
			case FreshmanCampPackage.ROOM_SENIOR__CARD:
				setCard(CARD_EDEFAULT);
				return;
			case FreshmanCampPackage.ROOM_SENIOR__SUPERIOR:
				setSuperior((CardSenior)null);
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
			case FreshmanCampPackage.ROOM_SENIOR__CARD:
				return card != CARD_EDEFAULT;
			case FreshmanCampPackage.ROOM_SENIOR__SUPERIOR:
				return superior != null;
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
		result.append(" (card: ");
		result.append(card);
		result.append(')');
		return result.toString();
	}

} //RoomSeniorImpl
