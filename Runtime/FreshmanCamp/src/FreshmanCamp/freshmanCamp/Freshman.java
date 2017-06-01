/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freshman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Freshman#getNeptun <em>Neptun</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Freshman#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getFreshman()
 * @model
 * @generated
 */
public interface Freshman extends EObject {
	/**
	 * Returns the value of the '<em><b>Neptun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neptun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neptun</em>' attribute.
	 * @see #setNeptun(String)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getFreshman_Neptun()
	 * @model
	 * @generated
	 */
	String getNeptun();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Freshman#getNeptun <em>Neptun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neptun</em>' attribute.
	 * @see #getNeptun()
	 * @generated
	 */
	void setNeptun(String value);

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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getFreshman_Card()
	 * @model
	 * @generated
	 */
	CardType getCard();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Freshman#getCard <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see #getCard()
	 * @generated
	 */
	void setCard(CardType value);

} // Freshman
