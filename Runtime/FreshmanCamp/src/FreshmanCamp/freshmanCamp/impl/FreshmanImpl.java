/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.CardType;
import FreshmanCamp.freshmanCamp.Freshman;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freshman</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.FreshmanImpl#getNeptun <em>Neptun</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.FreshmanImpl#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreshmanImpl extends MinimalEObjectImpl.Container implements Freshman {
	/**
	 * The default value of the '{@link #getNeptun() <em>Neptun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeptun()
	 * @generated
	 * @ordered
	 */
	protected static final String NEPTUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeptun() <em>Neptun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeptun()
	 * @generated
	 * @ordered
	 */
	protected String neptun = NEPTUN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreshmanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.FRESHMAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeptun() {
		return neptun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeptun(String newNeptun) {
		String oldNeptun = neptun;
		neptun = newNeptun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.FRESHMAN__NEPTUN, oldNeptun, neptun));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.FRESHMAN__CARD, oldCard, card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreshmanCampPackage.FRESHMAN__NEPTUN:
				return getNeptun();
			case FreshmanCampPackage.FRESHMAN__CARD:
				return getCard();
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
			case FreshmanCampPackage.FRESHMAN__NEPTUN:
				setNeptun((String)newValue);
				return;
			case FreshmanCampPackage.FRESHMAN__CARD:
				setCard((CardType)newValue);
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
			case FreshmanCampPackage.FRESHMAN__NEPTUN:
				setNeptun(NEPTUN_EDEFAULT);
				return;
			case FreshmanCampPackage.FRESHMAN__CARD:
				setCard(CARD_EDEFAULT);
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
			case FreshmanCampPackage.FRESHMAN__NEPTUN:
				return NEPTUN_EDEFAULT == null ? neptun != null : !NEPTUN_EDEFAULT.equals(neptun);
			case FreshmanCampPackage.FRESHMAN__CARD:
				return card != CARD_EDEFAULT;
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
		result.append(" (neptun: ");
		result.append(neptun);
		result.append(", card: ");
		result.append(card);
		result.append(')');
		return result.toString();
	}

} //FreshmanImpl
