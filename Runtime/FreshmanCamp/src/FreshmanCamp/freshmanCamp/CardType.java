/**
 */
package FreshmanCamp.freshmanCamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Card Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getCardType()
 * @model
 * @generated
 */
public final class CardType extends AbstractEnumerator {
	/**
	 * The '<em><b>Blue Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue Card</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE_CARD_LITERAL
	 * @model name="BlueCard"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_CARD = 0;

	/**
	 * The '<em><b>Green Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Green Card</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN_CARD_LITERAL
	 * @model name="GreenCard"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_CARD = 1;

	/**
	 * The '<em><b>Orange Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orange Card</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORANGE_CARD_LITERAL
	 * @model name="OrangeCard"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_CARD = 2;

	/**
	 * The '<em><b>Yellow Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yellow Card</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YELLOW_CARD_LITERAL
	 * @model name="YellowCard"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_CARD = 3;

	/**
	 * The '<em><b>Blue Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_CARD
	 * @generated
	 * @ordered
	 */
	public static final CardType BLUE_CARD_LITERAL = new CardType(BLUE_CARD, "BlueCard", "BlueCard");

	/**
	 * The '<em><b>Green Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_CARD
	 * @generated
	 * @ordered
	 */
	public static final CardType GREEN_CARD_LITERAL = new CardType(GREEN_CARD, "GreenCard", "GreenCard");

	/**
	 * The '<em><b>Orange Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_CARD
	 * @generated
	 * @ordered
	 */
	public static final CardType ORANGE_CARD_LITERAL = new CardType(ORANGE_CARD, "OrangeCard", "OrangeCard");

	/**
	 * The '<em><b>Yellow Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_CARD
	 * @generated
	 * @ordered
	 */
	public static final CardType YELLOW_CARD_LITERAL = new CardType(YELLOW_CARD, "YellowCard", "YellowCard");

	/**
	 * An array of all the '<em><b>Card Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CardType[] VALUES_ARRAY =
		new CardType[] {
			BLUE_CARD_LITERAL,
			GREEN_CARD_LITERAL,
			ORANGE_CARD_LITERAL,
			YELLOW_CARD_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Card Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Card Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardType get(int value) {
		switch (value) {
			case BLUE_CARD: return BLUE_CARD_LITERAL;
			case GREEN_CARD: return GREEN_CARD_LITERAL;
			case ORANGE_CARD: return ORANGE_CARD_LITERAL;
			case YELLOW_CARD: return YELLOW_CARD_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CardType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CardType
