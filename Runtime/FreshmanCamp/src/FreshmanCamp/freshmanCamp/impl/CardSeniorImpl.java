/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.CardType;
import FreshmanCamp.freshmanCamp.ColorSenior;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.RoomSenior;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Senior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CardSeniorImpl#getCard <em>Card</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CardSeniorImpl#getInferiors <em>Inferiors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CardSeniorImpl#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardSeniorImpl extends SeniorImpl implements CardSenior {
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
	 * The cached value of the '{@link #getInferiors() <em>Inferiors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferiors()
	 * @generated
	 * @ordered
	 */
	protected EList inferiors;

	/**
	 * The cached value of the '{@link #getSuperior() <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperior()
	 * @generated
	 * @ordered
	 */
	protected ColorSenior superior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardSeniorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.CARD_SENIOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CARD_SENIOR__CARD, oldCard, card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInferiors() {
		if (inferiors == null) {
			inferiors = new EObjectWithInverseResolvingEList(RoomSenior.class, this, FreshmanCampPackage.CARD_SENIOR__INFERIORS, FreshmanCampPackage.ROOM_SENIOR__SUPERIOR);
		}
		return inferiors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSenior getSuperior() {
		if (superior != null && superior.eIsProxy()) {
			InternalEObject oldSuperior = (InternalEObject)superior;
			superior = (ColorSenior)eResolveProxy(oldSuperior);
			if (superior != oldSuperior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreshmanCampPackage.CARD_SENIOR__SUPERIOR, oldSuperior, superior));
			}
		}
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSenior basicGetSuperior() {
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperior(ColorSenior newSuperior, NotificationChain msgs) {
		ColorSenior oldSuperior = superior;
		superior = newSuperior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CARD_SENIOR__SUPERIOR, oldSuperior, newSuperior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperior(ColorSenior newSuperior) {
		if (newSuperior != superior) {
			NotificationChain msgs = null;
			if (superior != null)
				msgs = ((InternalEObject)superior).eInverseRemove(this, FreshmanCampPackage.COLOR_SENIOR__INFERIORS, ColorSenior.class, msgs);
			if (newSuperior != null)
				msgs = ((InternalEObject)newSuperior).eInverseAdd(this, FreshmanCampPackage.COLOR_SENIOR__INFERIORS, ColorSenior.class, msgs);
			msgs = basicSetSuperior(newSuperior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CARD_SENIOR__SUPERIOR, newSuperior, newSuperior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.CARD_SENIOR__INFERIORS:
				return ((InternalEList)getInferiors()).basicAdd(otherEnd, msgs);
			case FreshmanCampPackage.CARD_SENIOR__SUPERIOR:
				if (superior != null)
					msgs = ((InternalEObject)superior).eInverseRemove(this, FreshmanCampPackage.COLOR_SENIOR__INFERIORS, ColorSenior.class, msgs);
				return basicSetSuperior((ColorSenior)otherEnd, msgs);
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
			case FreshmanCampPackage.CARD_SENIOR__INFERIORS:
				return ((InternalEList)getInferiors()).basicRemove(otherEnd, msgs);
			case FreshmanCampPackage.CARD_SENIOR__SUPERIOR:
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
			case FreshmanCampPackage.CARD_SENIOR__CARD:
				return getCard();
			case FreshmanCampPackage.CARD_SENIOR__INFERIORS:
				return getInferiors();
			case FreshmanCampPackage.CARD_SENIOR__SUPERIOR:
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
			case FreshmanCampPackage.CARD_SENIOR__CARD:
				setCard((CardType)newValue);
				return;
			case FreshmanCampPackage.CARD_SENIOR__INFERIORS:
				getInferiors().clear();
				getInferiors().addAll((Collection)newValue);
				return;
			case FreshmanCampPackage.CARD_SENIOR__SUPERIOR:
				setSuperior((ColorSenior)newValue);
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
			case FreshmanCampPackage.CARD_SENIOR__CARD:
				setCard(CARD_EDEFAULT);
				return;
			case FreshmanCampPackage.CARD_SENIOR__INFERIORS:
				getInferiors().clear();
				return;
			case FreshmanCampPackage.CARD_SENIOR__SUPERIOR:
				setSuperior((ColorSenior)null);
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
			case FreshmanCampPackage.CARD_SENIOR__CARD:
				return card != CARD_EDEFAULT;
			case FreshmanCampPackage.CARD_SENIOR__INFERIORS:
				return inferiors != null && !inferiors.isEmpty();
			case FreshmanCampPackage.CARD_SENIOR__SUPERIOR:
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

} //CardSeniorImpl
