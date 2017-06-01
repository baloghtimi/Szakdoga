/**
 */
package FreshmanCamp.freshmanCamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getColorType()
 * @model
 * @generated
 */
public final class ColorType extends AbstractEnumerator {
	/**
	 * The '<em><b>Black Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Black Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK_COLOR_LITERAL
	 * @model name="BlackColor"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_COLOR = 0;

	/**
	 * The '<em><b>Blue Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blue Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE_COLOR_LITERAL
	 * @model name="BlueColor"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_COLOR = 1;

	/**
	 * The '<em><b>Red Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Red Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED_COLOR_LITERAL
	 * @model name="RedColor"
	 * @generated
	 * @ordered
	 */
	public static final int RED_COLOR = 2;

	/**
	 * The '<em><b>White Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>White Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE_COLOR_LITERAL
	 * @model name="WhiteColor"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_COLOR = 3;

	/**
	 * The '<em><b>Yellow Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yellow Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YELLOW_COLOR_LITERAL
	 * @model name="YellowColor"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_COLOR = 4;

	/**
	 * The '<em><b>Black Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_COLOR
	 * @generated
	 * @ordered
	 */
	public static final ColorType BLACK_COLOR_LITERAL = new ColorType(BLACK_COLOR, "BlackColor", "BlackColor");

	/**
	 * The '<em><b>Blue Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_COLOR
	 * @generated
	 * @ordered
	 */
	public static final ColorType BLUE_COLOR_LITERAL = new ColorType(BLUE_COLOR, "BlueColor", "BlueColor");

	/**
	 * The '<em><b>Red Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_COLOR
	 * @generated
	 * @ordered
	 */
	public static final ColorType RED_COLOR_LITERAL = new ColorType(RED_COLOR, "RedColor", "RedColor");

	/**
	 * The '<em><b>White Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_COLOR
	 * @generated
	 * @ordered
	 */
	public static final ColorType WHITE_COLOR_LITERAL = new ColorType(WHITE_COLOR, "WhiteColor", "WhiteColor");

	/**
	 * The '<em><b>Yellow Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_COLOR
	 * @generated
	 * @ordered
	 */
	public static final ColorType YELLOW_COLOR_LITERAL = new ColorType(YELLOW_COLOR, "YellowColor", "YellowColor");

	/**
	 * An array of all the '<em><b>Color Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColorType[] VALUES_ARRAY =
		new ColorType[] {
			BLACK_COLOR_LITERAL,
			BLUE_COLOR_LITERAL,
			RED_COLOR_LITERAL,
			WHITE_COLOR_LITERAL,
			YELLOW_COLOR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Color Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ColorType get(int value) {
		switch (value) {
			case BLACK_COLOR: return BLACK_COLOR_LITERAL;
			case BLUE_COLOR: return BLUE_COLOR_LITERAL;
			case RED_COLOR: return RED_COLOR_LITERAL;
			case WHITE_COLOR: return WHITE_COLOR_LITERAL;
			case YELLOW_COLOR: return YELLOW_COLOR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ColorType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ColorType
