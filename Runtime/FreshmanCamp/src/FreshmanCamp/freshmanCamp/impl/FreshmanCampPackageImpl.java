/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.Camp;
import FreshmanCamp.freshmanCamp.Card;
import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.CardType;
import FreshmanCamp.freshmanCamp.Color;
import FreshmanCamp.freshmanCamp.ColorSenior;
import FreshmanCamp.freshmanCamp.ColorType;
import FreshmanCamp.freshmanCamp.Freshman;
import FreshmanCamp.freshmanCamp.FreshmanCampFactory;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.Room;
import FreshmanCamp.freshmanCamp.RoomSenior;
import FreshmanCamp.freshmanCamp.Senior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreshmanCampPackageImpl extends EPackageImpl implements FreshmanCampPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freshmanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seniorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomSeniorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardSeniorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorSeniorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FreshmanCampPackageImpl() {
		super(eNS_URI, FreshmanCampFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FreshmanCampPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FreshmanCampPackage init() {
		if (isInited) return (FreshmanCampPackage)EPackage.Registry.INSTANCE.getEPackage(FreshmanCampPackage.eNS_URI);

		// Obtain or create and register package
		FreshmanCampPackageImpl theFreshmanCampPackage = (FreshmanCampPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FreshmanCampPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FreshmanCampPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFreshmanCampPackage.createPackageContents();

		// Initialize created meta-data
		theFreshmanCampPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFreshmanCampPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FreshmanCampPackage.eNS_URI, theFreshmanCampPackage);
		return theFreshmanCampPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCamp() {
		return campEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamp_Name() {
		return (EAttribute)campEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamp_Date() {
		return (EAttribute)campEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamp_Location() {
		return (EAttribute)campEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCamp_Colors() {
		return (EReference)campEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCamp_Seniors() {
		return (EReference)campEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCamp_Freshman() {
		return (EReference)campEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Type() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColor_Cards() {
		return (EReference)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColor_Colorsenior() {
		return (EReference)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Type() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Rooms() {
		return (EReference)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Cardsenior() {
		return (EReference)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Name() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Roomsenior() {
		return (EReference)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Freshmen() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreshman() {
		return freshmanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreshman_Neptun() {
		return (EAttribute)freshmanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreshman_Card() {
		return (EAttribute)freshmanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenior() {
		return seniorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenior_Name() {
		return (EAttribute)seniorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenior_School() {
		return (EAttribute)seniorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenior_Year() {
		return (EAttribute)seniorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenior_Color() {
		return (EAttribute)seniorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomSenior() {
		return roomSeniorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomSenior_Card() {
		return (EAttribute)roomSeniorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomSenior_Superior() {
		return (EReference)roomSeniorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardSenior() {
		return cardSeniorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardSenior_Card() {
		return (EAttribute)cardSeniorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardSenior_Inferiors() {
		return (EReference)cardSeniorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardSenior_Superior() {
		return (EReference)cardSeniorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorSenior() {
		return colorSeniorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorSenior_Inferiors() {
		return (EReference)colorSeniorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorType() {
		return colorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardType() {
		return cardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreshmanCampFactory getFreshmanCampFactory() {
		return (FreshmanCampFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		campEClass = createEClass(CAMP);
		createEAttribute(campEClass, CAMP__NAME);
		createEAttribute(campEClass, CAMP__DATE);
		createEAttribute(campEClass, CAMP__LOCATION);
		createEReference(campEClass, CAMP__COLORS);
		createEReference(campEClass, CAMP__SENIORS);
		createEReference(campEClass, CAMP__FRESHMAN);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__TYPE);
		createEReference(colorEClass, COLOR__CARDS);
		createEReference(colorEClass, COLOR__COLORSENIOR);

		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__TYPE);
		createEReference(cardEClass, CARD__ROOMS);
		createEReference(cardEClass, CARD__CARDSENIOR);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);
		createEReference(roomEClass, ROOM__ROOMSENIOR);
		createEReference(roomEClass, ROOM__FRESHMEN);

		freshmanEClass = createEClass(FRESHMAN);
		createEAttribute(freshmanEClass, FRESHMAN__NEPTUN);
		createEAttribute(freshmanEClass, FRESHMAN__CARD);

		seniorEClass = createEClass(SENIOR);
		createEAttribute(seniorEClass, SENIOR__NAME);
		createEAttribute(seniorEClass, SENIOR__COLOR);
		createEAttribute(seniorEClass, SENIOR__YEAR);
		createEAttribute(seniorEClass, SENIOR__SCHOOL);

		roomSeniorEClass = createEClass(ROOM_SENIOR);
		createEAttribute(roomSeniorEClass, ROOM_SENIOR__CARD);
		createEReference(roomSeniorEClass, ROOM_SENIOR__SUPERIOR);

		cardSeniorEClass = createEClass(CARD_SENIOR);
		createEAttribute(cardSeniorEClass, CARD_SENIOR__CARD);
		createEReference(cardSeniorEClass, CARD_SENIOR__INFERIORS);
		createEReference(cardSeniorEClass, CARD_SENIOR__SUPERIOR);

		colorSeniorEClass = createEClass(COLOR_SENIOR);
		createEReference(colorSeniorEClass, COLOR_SENIOR__INFERIORS);

		// Create enums
		colorTypeEEnum = createEEnum(COLOR_TYPE);
		cardTypeEEnum = createEEnum(CARD_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		roomSeniorEClass.getESuperTypes().add(this.getSenior());
		cardSeniorEClass.getESuperTypes().add(this.getSenior());
		colorSeniorEClass.getESuperTypes().add(this.getSenior());

		// Initialize classes and features; add operations and parameters
		initEClass(campEClass, Camp.class, "Camp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamp_Name(), ecorePackage.getEString(), "name", null, 0, 1, Camp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamp_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Camp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamp_Location(), ecorePackage.getEString(), "location", null, 0, 1, Camp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamp_Colors(), this.getColor(), null, "colors", null, 5, 5, Camp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamp_Seniors(), this.getSenior(), null, "seniors", null, 1, -1, Camp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamp_Freshman(), this.getFreshman(), null, "freshman", null, 0, -1, Camp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Type(), this.getColorType(), "type", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColor_Cards(), this.getCard(), null, "cards", null, 4, 4, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColor_Colorsenior(), this.getColorSenior(), null, "colorsenior", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_Type(), this.getCardType(), "type", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Rooms(), this.getRoom(), null, "rooms", null, 3, 3, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Cardsenior(), this.getCardSenior(), null, "cardsenior", null, 1, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Roomsenior(), this.getRoomSenior(), null, "roomsenior", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Freshmen(), this.getFreshman(), null, "freshmen", null, 1, 10, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freshmanEClass, Freshman.class, "Freshman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreshman_Neptun(), ecorePackage.getEString(), "neptun", null, 0, 1, Freshman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreshman_Card(), this.getCardType(), "card", null, 0, 1, Freshman.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seniorEClass, Senior.class, "Senior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenior_Name(), ecorePackage.getEString(), "name", null, 0, 1, Senior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSenior_Color(), this.getColorType(), "color", null, 0, 1, Senior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSenior_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Senior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSenior_School(), ecorePackage.getEString(), "school", null, 0, 1, Senior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomSeniorEClass, RoomSenior.class, "RoomSenior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomSenior_Card(), this.getCardType(), "card", null, 0, 1, RoomSenior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomSenior_Superior(), this.getCardSenior(), this.getCardSenior_Inferiors(), "superior", null, 1, 1, RoomSenior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardSeniorEClass, CardSenior.class, "CardSenior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardSenior_Card(), this.getCardType(), "card", null, 0, 1, CardSenior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardSenior_Inferiors(), this.getRoomSenior(), this.getRoomSenior_Superior(), "inferiors", null, 3, 3, CardSenior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardSenior_Superior(), this.getColorSenior(), this.getColorSenior_Inferiors(), "superior", null, 1, 1, CardSenior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorSeniorEClass, ColorSenior.class, "ColorSenior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColorSenior_Inferiors(), this.getCardSenior(), this.getCardSenior_Superior(), "inferiors", null, 4, 4, ColorSenior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorTypeEEnum, ColorType.class, "ColorType");
		addEEnumLiteral(colorTypeEEnum, ColorType.BLACK_COLOR_LITERAL);
		addEEnumLiteral(colorTypeEEnum, ColorType.BLUE_COLOR_LITERAL);
		addEEnumLiteral(colorTypeEEnum, ColorType.RED_COLOR_LITERAL);
		addEEnumLiteral(colorTypeEEnum, ColorType.WHITE_COLOR_LITERAL);
		addEEnumLiteral(colorTypeEEnum, ColorType.YELLOW_COLOR_LITERAL);

		initEEnum(cardTypeEEnum, CardType.class, "CardType");
		addEEnumLiteral(cardTypeEEnum, CardType.BLUE_CARD_LITERAL);
		addEEnumLiteral(cardTypeEEnum, CardType.GREEN_CARD_LITERAL);
		addEEnumLiteral(cardTypeEEnum, CardType.ORANGE_CARD_LITERAL);
		addEEnumLiteral(cardTypeEEnum, CardType.YELLOW_CARD_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //FreshmanCampPackageImpl
