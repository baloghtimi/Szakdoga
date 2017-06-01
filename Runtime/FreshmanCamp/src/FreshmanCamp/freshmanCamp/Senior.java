/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Senior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Senior#getName <em>Name</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Senior#getColor <em>Color</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Senior#getYear <em>Year</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Senior#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior()
 * @model
 * @generated
 */
public interface Senior extends EObject {
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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Senior#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' attribute.
	 * @see #setSchool(String)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior_School()
	 * @model
	 * @generated
	 */
	String getSchool();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Senior#getSchool <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' attribute.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Senior#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior_Color()
	 * @model
	 * @generated
	 */
	ColorType getColor();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Senior#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ColorType value);

} // Senior
