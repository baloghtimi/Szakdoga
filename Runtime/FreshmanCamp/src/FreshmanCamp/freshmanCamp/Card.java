/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Card#getType <em>Type</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Card#getRooms <em>Rooms</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Card#getCardsenior <em>Cardsenior</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link FreshmanCamp.freshmanCamp.CardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see #setType(CardType)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCard_Type()
	 * @model
	 * @generated
	 */
	CardType getType();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Card#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see #getType()
	 * @generated
	 */
	void setType(CardType value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCard_Rooms()
	 * @model type="FreshmanCamp.freshmanCamp.Room" containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList getRooms();

	/**
	 * Returns the value of the '<em><b>Cardsenior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardsenior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardsenior</em>' reference.
	 * @see #setCardsenior(CardSenior)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCard_Cardsenior()
	 * @model required="true"
	 * @generated
	 */
	CardSenior getCardsenior();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Card#getCardsenior <em>Cardsenior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardsenior</em>' reference.
	 * @see #getCardsenior()
	 * @generated
	 */
	void setCardsenior(CardSenior value);

} // Card
