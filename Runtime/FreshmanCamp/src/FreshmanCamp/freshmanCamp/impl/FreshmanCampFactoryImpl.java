/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreshmanCampFactoryImpl extends EFactoryImpl implements FreshmanCampFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FreshmanCampFactory init() {
		try {
			FreshmanCampFactory theFreshmanCampFactory = (FreshmanCampFactory)EPackage.Registry.INSTANCE.getEFactory(FreshmanCampPackage.eNS_URI);
			if (theFreshmanCampFactory != null) {
				return theFreshmanCampFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FreshmanCampFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreshmanCampFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FreshmanCampPackage.CAMP: return createCamp();
			case FreshmanCampPackage.COLOR: return createColor();
			case FreshmanCampPackage.CARD: return createCard();
			case FreshmanCampPackage.ROOM: return createRoom();
			case FreshmanCampPackage.FRESHMAN: return createFreshman();
			case FreshmanCampPackage.SENIOR: return createSenior();
			case FreshmanCampPackage.ROOM_SENIOR: return createRoomSenior();
			case FreshmanCampPackage.CARD_SENIOR: return createCardSenior();
			case FreshmanCampPackage.COLOR_SENIOR: return createColorSenior();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FreshmanCampPackage.COLOR_TYPE:
				return createColorTypeFromString(eDataType, initialValue);
			case FreshmanCampPackage.CARD_TYPE:
				return createCardTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FreshmanCampPackage.COLOR_TYPE:
				return convertColorTypeToString(eDataType, instanceValue);
			case FreshmanCampPackage.CARD_TYPE:
				return convertCardTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camp createCamp() {
		CampImpl camp = new CampImpl();
		return camp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Freshman createFreshman() {
		FreshmanImpl freshman = new FreshmanImpl();
		return freshman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Senior createSenior() {
		SeniorImpl senior = new SeniorImpl();
		return senior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomSenior createRoomSenior() {
		RoomSeniorImpl roomSenior = new RoomSeniorImpl();
		return roomSenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardSenior createCardSenior() {
		CardSeniorImpl cardSenior = new CardSeniorImpl();
		return cardSenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSenior createColorSenior() {
		ColorSeniorImpl colorSenior = new ColorSeniorImpl();
		return colorSenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorType createColorTypeFromString(EDataType eDataType, String initialValue) {
		ColorType result = ColorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardType createCardTypeFromString(EDataType eDataType, String initialValue) {
		CardType result = CardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreshmanCampPackage getFreshmanCampPackage() {
		return (FreshmanCampPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static FreshmanCampPackage getPackage() {
		return FreshmanCampPackage.eINSTANCE;
	}

} //FreshmanCampFactoryImpl
