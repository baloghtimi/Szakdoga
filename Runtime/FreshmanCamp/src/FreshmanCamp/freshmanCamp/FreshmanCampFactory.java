/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage
 * @generated
 */
public interface FreshmanCampFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreshmanCampFactory eINSTANCE = FreshmanCamp.freshmanCamp.impl.FreshmanCampFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Camp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camp</em>'.
	 * @generated
	 */
	Camp createCamp();

	/**
	 * Returns a new object of class '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color</em>'.
	 * @generated
	 */
	Color createColor();

	/**
	 * Returns a new object of class '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card</em>'.
	 * @generated
	 */
	Card createCard();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Freshman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Freshman</em>'.
	 * @generated
	 */
	Freshman createFreshman();

	/**
	 * Returns a new object of class '<em>Senior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Senior</em>'.
	 * @generated
	 */
	Senior createSenior();

	/**
	 * Returns a new object of class '<em>Room Senior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Senior</em>'.
	 * @generated
	 */
	RoomSenior createRoomSenior();

	/**
	 * Returns a new object of class '<em>Card Senior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Senior</em>'.
	 * @generated
	 */
	CardSenior createCardSenior();

	/**
	 * Returns a new object of class '<em>Color Senior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Senior</em>'.
	 * @generated
	 */
	ColorSenior createColorSenior();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FreshmanCampPackage getFreshmanCampPackage();

} //FreshmanCampFactory
