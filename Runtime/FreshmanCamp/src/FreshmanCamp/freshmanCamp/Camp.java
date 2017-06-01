/**
 */
package FreshmanCamp.freshmanCamp;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Camp#getName <em>Name</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Camp#getDate <em>Date</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Camp#getLocation <em>Location</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Camp#getColors <em>Colors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Camp#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Camp#getFreshman <em>Freshman</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp()
 * @model
 * @generated
 */
public interface Camp extends EObject {
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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Camp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Camp#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Camp#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Colors</b></em>' containment reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colors</em>' containment reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp_Colors()
	 * @model type="FreshmanCamp.freshmanCamp.Color" containment="true" lower="5" upper="5"
	 * @generated
	 */
	EList getColors();

	/**
	 * Returns the value of the '<em><b>Seniors</b></em>' containment reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.Senior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seniors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seniors</em>' containment reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp_Seniors()
	 * @model type="FreshmanCamp.freshmanCamp.Senior" containment="true" required="true"
	 * @generated
	 */
	EList getSeniors();

	/**
	 * Returns the value of the '<em><b>Freshman</b></em>' containment reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.Freshman}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freshman</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freshman</em>' containment reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCamp_Freshman()
	 * @model type="FreshmanCamp.freshmanCamp.Freshman" containment="true"
	 * @generated
	 */
	EList getFreshman();

} // Camp
