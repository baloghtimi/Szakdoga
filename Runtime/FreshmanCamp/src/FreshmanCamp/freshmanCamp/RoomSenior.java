/**
 */
package FreshmanCamp.freshmanCamp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Senior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.RoomSenior#getCard <em>Card</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.RoomSenior#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoomSenior()
 * @model
 * @generated
 */
public interface RoomSenior extends Senior {
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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoomSenior_Card()
	 * @model
	 * @generated
	 */
	CardType getCard();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.RoomSenior#getCard <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see #getCard()
	 * @generated
	 */
	void setCard(CardType value);

	/**
	 * Returns the value of the '<em><b>Superior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link FreshmanCamp.freshmanCamp.CardSenior#getInferiors <em>Inferiors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superior</em>' reference.
	 * @see #setSuperior(CardSenior)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoomSenior_Superior()
	 * @see FreshmanCamp.freshmanCamp.CardSenior#getInferiors
	 * @model opposite="inferiors" required="true"
	 * @generated
	 */
	CardSenior getSuperior();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.RoomSenior#getSuperior <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superior</em>' reference.
	 * @see #getSuperior()
	 * @generated
	 */
	void setSuperior(CardSenior value);

} // RoomSenior
