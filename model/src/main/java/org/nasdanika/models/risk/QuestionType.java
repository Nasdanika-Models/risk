/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Question Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of a question in a risk assessment questionnaire.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getQuestionType()
 * @model
 * @generated
 */
public enum QuestionType implements Enumerator {
	/**
	 * The '<em><b>Yes No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_NO_VALUE
	 * @generated
	 * @ordered
	 */
	YES_NO(0, "YesNo", "YesNo"),

	/**
	 * The '<em><b>Multiple Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple options may be selected.
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE_CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_CHOICE(1, "MultipleChoice", "MultipleChoice"),

	/**
	 * The '<em><b>Single Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one option must be selected.
	 * <!-- end-model-doc -->
	 * @see #SINGLE_CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_CHOICE(2, "SingleChoice", "SingleChoice"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-form text answer.
	 * <!-- end-model-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(3, "Text", "Text"),

	/**
	 * The '<em><b>Rating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numeric rating on a defined scale.
	 * <!-- end-model-doc -->
	 * @see #RATING_VALUE
	 * @generated
	 * @ordered
	 */
	RATING(4, "Rating", "Rating"),

	/**
	 * The '<em><b>Scale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response on a sliding scale (e.g., 1-5 or 1-10).
	 * <!-- end-model-doc -->
	 * @see #SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	SCALE(5, "Scale", "Scale"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date answer (e.g., last penetration test date).
	 * <!-- end-model-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(6, "Date", "Date");

	/**
	 * The '<em><b>Yes No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_NO
	 * @model name="YesNo"
	 * @generated
	 * @ordered
	 */
	public static final int YES_NO_VALUE = 0;

	/**
	 * The '<em><b>Multiple Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple options may be selected.
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE_CHOICE
	 * @model name="MultipleChoice"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_CHOICE_VALUE = 1;

	/**
	 * The '<em><b>Single Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one option must be selected.
	 * <!-- end-model-doc -->
	 * @see #SINGLE_CHOICE
	 * @model name="SingleChoice"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_CHOICE_VALUE = 2;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-form text answer.
	 * <!-- end-model-doc -->
	 * @see #TEXT
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 3;

	/**
	 * The '<em><b>Rating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numeric rating on a defined scale.
	 * <!-- end-model-doc -->
	 * @see #RATING
	 * @model name="Rating"
	 * @generated
	 * @ordered
	 */
	public static final int RATING_VALUE = 4;

	/**
	 * The '<em><b>Scale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response on a sliding scale (e.g., 1-5 or 1-10).
	 * <!-- end-model-doc -->
	 * @see #SCALE
	 * @model name="Scale"
	 * @generated
	 * @ordered
	 */
	public static final int SCALE_VALUE = 5;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date answer (e.g., last penetration test date).
	 * <!-- end-model-doc -->
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Question Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionType[] VALUES_ARRAY =
		new QuestionType[] {
			YES_NO,
			MULTIPLE_CHOICE,
			SINGLE_CHOICE,
			TEXT,
			RATING,
			SCALE,
			DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Question Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuestionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionType get(int value) {
		switch (value) {
			case YES_NO_VALUE: return YES_NO;
			case MULTIPLE_CHOICE_VALUE: return MULTIPLE_CHOICE;
			case SINGLE_CHOICE_VALUE: return SINGLE_CHOICE;
			case TEXT_VALUE: return TEXT;
			case RATING_VALUE: return RATING;
			case SCALE_VALUE: return SCALE;
			case DATE_VALUE: return DATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QuestionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //QuestionType
