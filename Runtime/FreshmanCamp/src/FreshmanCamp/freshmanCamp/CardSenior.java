/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Senior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.CardSenior#getCard <em>Card</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.CardSenior#getInferiors <em>Inferiors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.CardSenior#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCardSenior()
 * @model
 * @generated
 */
public interface CardSenior extends Senior {
	/**
	 * Returns the value of the '<em><b>Card</b></em>' attribute.
	 * The literals are from the enumeration {@link FreshmanCamp.freshmanCamp.CardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see #setCard(CardType)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCardSenior_Card()
	 * @model
	 * @generated
	 */
	CardType getCard();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.CardSenior#getCard <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see #getCard()
	 * @generated
	 */
	void setCard(CardType value);

	/**
	 * Returns the value of the '<em><b>Inferiors</b></em>' reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.RoomSenior}.
	 * It is bidirectional and its opposite is '{@link FreshmanCamp.freshmanCamp.RoomSenior#getSuperior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inferiors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inferiors</em>' reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCardSenior_Inferiors()
	 * @see FreshmanCamp.freshmanCamp.RoomSenior#getSuperior
	 * @model type="FreshmanCamp.freshmanCamp.RoomSenior" opposite="superior" lower="3" upper="3"
	 * @generated
	 */
	EList getInferiors();

	/**
	 * Returns the value of the '<em><b>Superior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link FreshmanCamp.freshmanCamp.ColorSenior#getInferiors <em>Inferiors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superior</em>' reference.
	 * @see #setSuperior(ColorSenior)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCardSenior_Superior()
	 * @see FreshmanCamp.freshmanCamp.ColorSenior#getInferiors
	 * @model opposite="inferiors" required="true"
	 * @generated
	 */
	ColorSenior getSuperior();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.CardSenior#getSuperior <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superior</em>' reference.
	 * @see #getSuperior()
	 * @generated
	 */
	void setSuperior(ColorSenior value);

} // CardSenior
