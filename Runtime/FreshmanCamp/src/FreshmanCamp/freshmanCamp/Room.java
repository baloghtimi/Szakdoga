/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Room#getName <em>Name</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Room#getRoomsenior <em>Roomsenior</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Room#getFreshmen <em>Freshmen</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roomsenior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomsenior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomsenior</em>' reference.
	 * @see #setRoomsenior(RoomSenior)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoom_Roomsenior()
	 * @model required="true"
	 * @generated
	 */
	RoomSenior getRoomsenior();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Room#getRoomsenior <em>Roomsenior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomsenior</em>' reference.
	 * @see #getRoomsenior()
	 * @generated
	 */
	void setRoomsenior(RoomSenior value);

	/**
	 * Returns the value of the '<em><b>Freshmen</b></em>' reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.Freshman}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freshmen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freshmen</em>' reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getRoom_Freshmen()
	 * @model type="FreshmanCamp.freshmanCamp.Freshman" required="true" upper="10"
	 * @generated
	 */
	EList getFreshmen();

} // Room
