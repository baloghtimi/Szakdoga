/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Color#getType <em>Type</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Color#getCards <em>Cards</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Color#getColorsenior <em>Colorsenior</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link FreshmanCamp.freshmanCamp.ColorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @see #setType(ColorType)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColor_Type()
	 * @model
	 * @generated
	 */
	ColorType getType();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Color#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColorType value);

	/**
	 * Returns the value of the '<em><b>Cards</b></em>' containment reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' containment reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColor_Cards()
	 * @model type="FreshmanCamp.freshmanCamp.Card" containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList getCards();

	/**
	 * Returns the value of the '<em><b>Colorsenior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colorsenior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorsenior</em>' reference.
	 * @see #setColorsenior(ColorSenior)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColor_Colorsenior()
	 * @model required="true"
	 * @generated
	 */
	ColorSenior getColorsenior();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Color#getColorsenior <em>Colorsenior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorsenior</em>' reference.
	 * @see #getColorsenior()
	 * @generated
	 */
	void setColorsenior(ColorSenior value);

} // Color
