/**
 */
package FreshmanCamp.freshmanCamp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FreshmanCamp.freshmanCamp.FreshmanCampFactory
 * @model kind="package"
 * @generated
 */
public interface FreshmanCampPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "freshmanCamp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/freshmanCamp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "freshmanCamp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreshmanCampPackage eINSTANCE = FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl.init();

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.CampImpl <em>Camp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.CampImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCamp()
	 * @generated
	 */
	int CAMP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP__DATE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP__COLORS = 3;

	/**
	 * The feature id for the '<em><b>Seniors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP__SENIORS = 4;

	/**
	 * The feature id for the '<em><b>Freshman</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP__FRESHMAN = 5;

	/**
	 * The number of structural features of the '<em>Camp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.ColorImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__CARDS = 1;

	/**
	 * The feature id for the '<em><b>Colorsenior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__COLORSENIOR = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.CardImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Cardsenior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARDSENIOR = 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.RoomImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roomsenior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMSENIOR = 1;

	/**
	 * The feature id for the '<em><b>Freshmen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__FRESHMEN = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.FreshmanImpl <em>Freshman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getFreshman()
	 * @generated
	 */
	int FRESHMAN = 4;

	/**
	 * The feature id for the '<em><b>Neptun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHMAN__NEPTUN = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHMAN__CARD = 1;

	/**
	 * The number of structural features of the '<em>Freshman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRESHMAN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.SeniorImpl <em>Senior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.SeniorImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getSenior()
	 * @generated
	 */
	int SENIOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENIOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENIOR__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENIOR__YEAR = 2;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENIOR__SCHOOL = 3;

	/**
	 * The number of structural features of the '<em>Senior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENIOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.RoomSeniorImpl <em>Room Senior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.RoomSeniorImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getRoomSenior()
	 * @generated
	 */
	int ROOM_SENIOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR__NAME = SENIOR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR__COLOR = SENIOR__COLOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR__YEAR = SENIOR__YEAR;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR__SCHOOL = SENIOR__SCHOOL;

	/**
	 * The feature id for the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR__CARD = SENIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Superior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR__SUPERIOR = SENIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room Senior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SENIOR_FEATURE_COUNT = SENIOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.CardSeniorImpl <em>Card Senior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.CardSeniorImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCardSenior()
	 * @generated
	 */
	int CARD_SENIOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__NAME = SENIOR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__COLOR = SENIOR__COLOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__YEAR = SENIOR__YEAR;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__SCHOOL = SENIOR__SCHOOL;

	/**
	 * The feature id for the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__CARD = SENIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inferiors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__INFERIORS = SENIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Superior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR__SUPERIOR = SENIOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Card Senior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_SENIOR_FEATURE_COUNT = SENIOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.impl.ColorSeniorImpl <em>Color Senior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.impl.ColorSeniorImpl
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getColorSenior()
	 * @generated
	 */
	int COLOR_SENIOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENIOR__NAME = SENIOR__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENIOR__COLOR = SENIOR__COLOR;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENIOR__YEAR = SENIOR__YEAR;

	/**
	 * The feature id for the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENIOR__SCHOOL = SENIOR__SCHOOL;

	/**
	 * The feature id for the '<em><b>Inferiors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENIOR__INFERIORS = SENIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Senior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENIOR_FEATURE_COUNT = SENIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.ColorType <em>Color Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 9;

	/**
	 * The meta object id for the '{@link FreshmanCamp.freshmanCamp.CardType <em>Card Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCardType()
	 * @generated
	 */
	int CARD_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.Camp <em>Camp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camp</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp
	 * @generated
	 */
	EClass getCamp();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Camp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp#getName()
	 * @see #getCamp()
	 * @generated
	 */
	EAttribute getCamp_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Camp#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp#getDate()
	 * @see #getCamp()
	 * @generated
	 */
	EAttribute getCamp_Date();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Camp#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp#getLocation()
	 * @see #getCamp()
	 * @generated
	 */
	EAttribute getCamp_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link FreshmanCamp.freshmanCamp.Camp#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colors</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp#getColors()
	 * @see #getCamp()
	 * @generated
	 */
	EReference getCamp_Colors();

	/**
	 * Returns the meta object for the containment reference list '{@link FreshmanCamp.freshmanCamp.Camp#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seniors</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp#getSeniors()
	 * @see #getCamp()
	 * @generated
	 */
	EReference getCamp_Seniors();

	/**
	 * Returns the meta object for the containment reference list '{@link FreshmanCamp.freshmanCamp.Camp#getFreshman <em>Freshman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Freshman</em>'.
	 * @see FreshmanCamp.freshmanCamp.Camp#getFreshman()
	 * @see #getCamp()
	 * @generated
	 */
	EReference getCamp_Freshman();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see FreshmanCamp.freshmanCamp.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Color#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see FreshmanCamp.freshmanCamp.Color#getType()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link FreshmanCamp.freshmanCamp.Color#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards</em>'.
	 * @see FreshmanCamp.freshmanCamp.Color#getCards()
	 * @see #getColor()
	 * @generated
	 */
	EReference getColor_Cards();

	/**
	 * Returns the meta object for the reference '{@link FreshmanCamp.freshmanCamp.Color#getColorsenior <em>Colorsenior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colorsenior</em>'.
	 * @see FreshmanCamp.freshmanCamp.Color#getColorsenior()
	 * @see #getColor()
	 * @generated
	 */
	EReference getColor_Colorsenior();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see FreshmanCamp.freshmanCamp.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Card#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see FreshmanCamp.freshmanCamp.Card#getType()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link FreshmanCamp.freshmanCamp.Card#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see FreshmanCamp.freshmanCamp.Card#getRooms()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Rooms();

	/**
	 * Returns the meta object for the reference '{@link FreshmanCamp.freshmanCamp.Card#getCardsenior <em>Cardsenior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cardsenior</em>'.
	 * @see FreshmanCamp.freshmanCamp.Card#getCardsenior()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Cardsenior();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see FreshmanCamp.freshmanCamp.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreshmanCamp.freshmanCamp.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the reference '{@link FreshmanCamp.freshmanCamp.Room#getRoomsenior <em>Roomsenior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomsenior</em>'.
	 * @see FreshmanCamp.freshmanCamp.Room#getRoomsenior()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomsenior();

	/**
	 * Returns the meta object for the reference list '{@link FreshmanCamp.freshmanCamp.Room#getFreshmen <em>Freshmen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Freshmen</em>'.
	 * @see FreshmanCamp.freshmanCamp.Room#getFreshmen()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Freshmen();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.Freshman <em>Freshman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freshman</em>'.
	 * @see FreshmanCamp.freshmanCamp.Freshman
	 * @generated
	 */
	EClass getFreshman();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Freshman#getNeptun <em>Neptun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neptun</em>'.
	 * @see FreshmanCamp.freshmanCamp.Freshman#getNeptun()
	 * @see #getFreshman()
	 * @generated
	 */
	EAttribute getFreshman_Neptun();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Freshman#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card</em>'.
	 * @see FreshmanCamp.freshmanCamp.Freshman#getCard()
	 * @see #getFreshman()
	 * @generated
	 */
	EAttribute getFreshman_Card();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.Senior <em>Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Senior</em>'.
	 * @see FreshmanCamp.freshmanCamp.Senior
	 * @generated
	 */
	EClass getSenior();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Senior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FreshmanCamp.freshmanCamp.Senior#getName()
	 * @see #getSenior()
	 * @generated
	 */
	EAttribute getSenior_Name();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Senior#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School</em>'.
	 * @see FreshmanCamp.freshmanCamp.Senior#getSchool()
	 * @see #getSenior()
	 * @generated
	 */
	EAttribute getSenior_School();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Senior#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see FreshmanCamp.freshmanCamp.Senior#getYear()
	 * @see #getSenior()
	 * @generated
	 */
	EAttribute getSenior_Year();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.Senior#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see FreshmanCamp.freshmanCamp.Senior#getColor()
	 * @see #getSenior()
	 * @generated
	 */
	EAttribute getSenior_Color();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.RoomSenior <em>Room Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Senior</em>'.
	 * @see FreshmanCamp.freshmanCamp.RoomSenior
	 * @generated
	 */
	EClass getRoomSenior();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.RoomSenior#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card</em>'.
	 * @see FreshmanCamp.freshmanCamp.RoomSenior#getCard()
	 * @see #getRoomSenior()
	 * @generated
	 */
	EAttribute getRoomSenior_Card();

	/**
	 * Returns the meta object for the reference '{@link FreshmanCamp.freshmanCamp.RoomSenior#getSuperior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superior</em>'.
	 * @see FreshmanCamp.freshmanCamp.RoomSenior#getSuperior()
	 * @see #getRoomSenior()
	 * @generated
	 */
	EReference getRoomSenior_Superior();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.CardSenior <em>Card Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Senior</em>'.
	 * @see FreshmanCamp.freshmanCamp.CardSenior
	 * @generated
	 */
	EClass getCardSenior();

	/**
	 * Returns the meta object for the attribute '{@link FreshmanCamp.freshmanCamp.CardSenior#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card</em>'.
	 * @see FreshmanCamp.freshmanCamp.CardSenior#getCard()
	 * @see #getCardSenior()
	 * @generated
	 */
	EAttribute getCardSenior_Card();

	/**
	 * Returns the meta object for the reference list '{@link FreshmanCamp.freshmanCamp.CardSenior#getInferiors <em>Inferiors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inferiors</em>'.
	 * @see FreshmanCamp.freshmanCamp.CardSenior#getInferiors()
	 * @see #getCardSenior()
	 * @generated
	 */
	EReference getCardSenior_Inferiors();

	/**
	 * Returns the meta object for the reference '{@link FreshmanCamp.freshmanCamp.CardSenior#getSuperior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superior</em>'.
	 * @see FreshmanCamp.freshmanCamp.CardSenior#getSuperior()
	 * @see #getCardSenior()
	 * @generated
	 */
	EReference getCardSenior_Superior();

	/**
	 * Returns the meta object for class '{@link FreshmanCamp.freshmanCamp.ColorSenior <em>Color Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Senior</em>'.
	 * @see FreshmanCamp.freshmanCamp.ColorSenior
	 * @generated
	 */
	EClass getColorSenior();

	/**
	 * Returns the meta object for the reference list '{@link FreshmanCamp.freshmanCamp.ColorSenior#getInferiors <em>Inferiors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inferiors</em>'.
	 * @see FreshmanCamp.freshmanCamp.ColorSenior#getInferiors()
	 * @see #getColorSenior()
	 * @generated
	 */
	EReference getColorSenior_Inferiors();

	/**
	 * Returns the meta object for enum '{@link FreshmanCamp.freshmanCamp.ColorType <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Type</em>'.
	 * @see FreshmanCamp.freshmanCamp.ColorType
	 * @generated
	 */
	EEnum getColorType();

	/**
	 * Returns the meta object for enum '{@link FreshmanCamp.freshmanCamp.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Type</em>'.
	 * @see FreshmanCamp.freshmanCamp.CardType
	 * @generated
	 */
	EEnum getCardType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FreshmanCampFactory getFreshmanCampFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.CampImpl <em>Camp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.CampImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCamp()
		 * @generated
		 */
		EClass CAMP = eINSTANCE.getCamp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMP__NAME = eINSTANCE.getCamp_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMP__DATE = eINSTANCE.getCamp_Date();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMP__LOCATION = eINSTANCE.getCamp_Location();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMP__COLORS = eINSTANCE.getCamp_Colors();

		/**
		 * The meta object literal for the '<em><b>Seniors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMP__SENIORS = eINSTANCE.getCamp_Seniors();

		/**
		 * The meta object literal for the '<em><b>Freshman</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMP__FRESHMAN = eINSTANCE.getCamp_Freshman();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.ColorImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__TYPE = eINSTANCE.getColor_Type();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR__CARDS = eINSTANCE.getColor_Cards();

		/**
		 * The meta object literal for the '<em><b>Colorsenior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR__COLORSENIOR = eINSTANCE.getColor_Colorsenior();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.CardImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TYPE = eINSTANCE.getCard_Type();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__ROOMS = eINSTANCE.getCard_Rooms();

		/**
		 * The meta object literal for the '<em><b>Cardsenior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__CARDSENIOR = eINSTANCE.getCard_Cardsenior();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.RoomImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Roomsenior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMSENIOR = eINSTANCE.getRoom_Roomsenior();

		/**
		 * The meta object literal for the '<em><b>Freshmen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__FRESHMEN = eINSTANCE.getRoom_Freshmen();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.FreshmanImpl <em>Freshman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getFreshman()
		 * @generated
		 */
		EClass FRESHMAN = eINSTANCE.getFreshman();

		/**
		 * The meta object literal for the '<em><b>Neptun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRESHMAN__NEPTUN = eINSTANCE.getFreshman_Neptun();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRESHMAN__CARD = eINSTANCE.getFreshman_Card();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.SeniorImpl <em>Senior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.SeniorImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getSenior()
		 * @generated
		 */
		EClass SENIOR = eINSTANCE.getSenior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENIOR__NAME = eINSTANCE.getSenior_Name();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENIOR__SCHOOL = eINSTANCE.getSenior_School();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENIOR__YEAR = eINSTANCE.getSenior_Year();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENIOR__COLOR = eINSTANCE.getSenior_Color();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.RoomSeniorImpl <em>Room Senior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.RoomSeniorImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getRoomSenior()
		 * @generated
		 */
		EClass ROOM_SENIOR = eINSTANCE.getRoomSenior();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SENIOR__CARD = eINSTANCE.getRoomSenior_Card();

		/**
		 * The meta object literal for the '<em><b>Superior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_SENIOR__SUPERIOR = eINSTANCE.getRoomSenior_Superior();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.CardSeniorImpl <em>Card Senior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.CardSeniorImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCardSenior()
		 * @generated
		 */
		EClass CARD_SENIOR = eINSTANCE.getCardSenior();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_SENIOR__CARD = eINSTANCE.getCardSenior_Card();

		/**
		 * The meta object literal for the '<em><b>Inferiors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_SENIOR__INFERIORS = eINSTANCE.getCardSenior_Inferiors();

		/**
		 * The meta object literal for the '<em><b>Superior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_SENIOR__SUPERIOR = eINSTANCE.getCardSenior_Superior();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.impl.ColorSeniorImpl <em>Color Senior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.impl.ColorSeniorImpl
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getColorSenior()
		 * @generated
		 */
		EClass COLOR_SENIOR = eINSTANCE.getColorSenior();

		/**
		 * The meta object literal for the '<em><b>Inferiors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_SENIOR__INFERIORS = eINSTANCE.getColorSenior_Inferiors();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.ColorType <em>Color Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.ColorType
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getColorType()
		 * @generated
		 */
		EEnum COLOR_TYPE = eINSTANCE.getColorType();

		/**
		 * The meta object literal for the '{@link FreshmanCamp.freshmanCamp.CardType <em>Card Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FreshmanCamp.freshmanCamp.CardType
		 * @see FreshmanCamp.freshmanCamp.impl.FreshmanCampPackageImpl#getCardType()
		 * @generated
		 */
		EEnum CARD_TYPE = eINSTANCE.getCardType();

	}

} //FreshmanCampPackage
