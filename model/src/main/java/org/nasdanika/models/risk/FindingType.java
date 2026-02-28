/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Finding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of a finding identified during a risk assessment.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getFindingType()
 * @model
 * @generated
 */
public enum FindingType implements Enumerator {
	/**
	 * The '<em><b>Gap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A missing control or capability required by policy or regulation.
	 * <!-- end-model-doc -->
	 * @see #GAP_VALUE
	 * @generated
	 * @ordered
	 */
	GAP(0, "Gap", "Gap"),

	/**
	 * The '<em><b>Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A control deficiency or active problem that increases risk.
	 * <!-- end-model-doc -->
	 * @see #ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUE(1, "Issue", "Issue"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A noteworthy situation that may develop into an issue.
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(2, "Observation", "Observation"),

	/**
	 * The '<em><b>Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suggested improvement to reduce risk further.
	 * <!-- end-model-doc -->
	 * @see #RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMENDATION(3, "Recommendation", "Recommendation");

	/**
	 * The '<em><b>Gap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A missing control or capability required by policy or regulation.
	 * <!-- end-model-doc -->
	 * @see #GAP
	 * @model name="Gap"
	 * @generated
	 * @ordered
	 */
	public static final int GAP_VALUE = 0;

	/**
	 * The '<em><b>Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A control deficiency or active problem that increases risk.
	 * <!-- end-model-doc -->
	 * @see #ISSUE
	 * @model name="Issue"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUE_VALUE = 1;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A noteworthy situation that may develop into an issue.
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION
	 * @model name="Observation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 2;

	/**
	 * The '<em><b>Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suggested improvement to reduce risk further.
	 * <!-- end-model-doc -->
	 * @see #RECOMMENDATION
	 * @model name="Recommendation"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Finding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FindingType[] VALUES_ARRAY =
		new FindingType[] {
			GAP,
			ISSUE,
			OBSERVATION,
			RECOMMENDATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Finding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FindingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Finding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FindingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FindingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FindingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FindingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FindingType get(int value) {
		switch (value) {
			case GAP_VALUE: return GAP;
			case ISSUE_VALUE: return ISSUE;
			case OBSERVATION_VALUE: return OBSERVATION;
			case RECOMMENDATION_VALUE: return RECOMMENDATION;
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
	private FindingType(int value, String name, String literal) {
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
	
} //FindingType
