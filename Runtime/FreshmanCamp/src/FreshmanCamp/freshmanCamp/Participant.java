/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Participant#getName <em>Name</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Participant#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getParticipant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link FreshmanCamp.freshmanCamp.ColorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @see #setColor(ColorType)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getParticipant_Color()
	 * @model
	 * @generated
	 */
	ColorType getColor();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Participant#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorType value);

} // Participant
