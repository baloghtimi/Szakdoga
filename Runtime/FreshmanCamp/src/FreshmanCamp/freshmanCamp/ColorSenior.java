/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Senior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.ColorSenior#getInferiors <em>Inferiors</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColorSenior()
 * @model
 * @generated
 */
public interface ColorSenior extends Senior {
	/**
	 * Returns the value of the '<em><b>Inferiors</b></em>' reference list.
	 * The list contents are of type {@link FreshmanCamp.freshmanCamp.CardSenior}.
	 * It is bidirectional and its opposite is '{@link FreshmanCamp.freshmanCamp.CardSenior#getSuperior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inferiors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inferiors</em>' reference list.
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColorSenior_Inferiors()
	 * @see FreshmanCamp.freshmanCamp.CardSenior#getSuperior
	 * @model type="FreshmanCamp.freshmanCamp.CardSenior" opposite="superior" lower="4" upper="4"
	 * @generated
	 */
	EList getInferiors();

} // ColorSenior
