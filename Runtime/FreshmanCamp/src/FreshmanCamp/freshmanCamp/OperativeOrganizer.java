/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operative Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.OperativeOrganizer#getInferiors <em>Inferiors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.OperativeOrganizer#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getOperativeOrganizer()
 * @model
 * @generated
 */
public interface OperativeOrganizer extends Senior {
	/**
	 * Returns the value of the '<em><b>Inferiors</b></em>' reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.OperativeOrganizer}.
	 * It is bidirectional and its opposite is '{@link FreshmanCamp.freshmanCamp.OperativeOrganizer#getSuperior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inferiors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inferiors</em>' reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getOperativeOrganizer_Inferiors()
	 * @see FreshmanCamp.freshmanCamp.OperativeOrganizer#getSuperior
	 * @model type="FreshmanCamp.freshmanCamp.OperativeOrganizer" opposite="superior" required="true"
	 * @generated
	 */
	EList getInferiors();

	/**
	 * Returns the value of the '<em><b>Superior</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link FreshmanCamp.freshmanCamp.OperativeOrganizer#getInferiors <em>Inferiors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superior</em>' reference.
	 * @see #setSuperior(OperativeOrganizer)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getOperativeOrganizer_Superior()
	 * @see FreshmanCamp.freshmanCamp.OperativeOrganizer#getInferiors
	 * @model opposite="inferiors" required="true"
	 * @generated
	 */
	OperativeOrganizer getSuperior();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.OperativeOrganizer#getSuperior <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superior</em>' reference.
	 * @see #getSuperior()
	 * @generated
	 */
	void setSuperior(OperativeOrganizer value);

} // OperativeOrganizer
