/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Finding Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Lifecycle status of a finding.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getFindingStatus()
 * @model
 * @generated
 */
public enum FindingStatus implements Enumerator {
	/**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(0, "Open", "Open"),

	/**
	 * The '<em><b>Resolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED(1, "Resolved", "Resolved"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(2, "Accepted", "Accepted"),

	/**
	 * The '<em><b>Deferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	DEFERRED(3, "Deferred", "Deferred");

	/**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="Open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 0;

	/**
	 * The '<em><b>Resolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVED
	 * @model name="Resolved"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_VALUE = 1;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model name="Accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 2;

	/**
	 * The '<em><b>Deferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFERRED
	 * @model name="Deferred"
	 * @generated
	 * @ordered
	 */
	public static final int DEFERRED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Finding Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FindingStatus[] VALUES_ARRAY =
		new FindingStatus[] {
			OPEN,
			RESOLVED,
			ACCEPTED,
			DEFERRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Finding Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FindingStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Finding Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FindingStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FindingStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finding Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FindingStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FindingStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finding Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FindingStatus get(int value) {
		switch (value) {
			case OPEN_VALUE: return OPEN;
			case RESOLVED_VALUE: return RESOLVED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case DEFERRED_VALUE: return DEFERRED;
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
	private FindingStatus(int value, String name, String literal) {
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
	
} //FindingStatus
