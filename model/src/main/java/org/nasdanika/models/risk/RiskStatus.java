/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Lifecycle status of an identified risk.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getRiskStatus()
 * @model
 * @generated
 */
public enum RiskStatus implements Enumerator {
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
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(1, "Accepted", "Accepted"),

	/**
	 * The '<em><b>Mitigated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITIGATED_VALUE
	 * @generated
	 * @ordered
	 */
	MITIGATED(2, "Mitigated", "Mitigated"),

	/**
	 * The '<em><b>Transferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFERRED(3, "Transferred", "Transferred"),

	/**
	 * The '<em><b>Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(4, "Closed", "Closed");

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
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model name="Accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 1;

	/**
	 * The '<em><b>Mitigated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITIGATED
	 * @model name="Mitigated"
	 * @generated
	 * @ordered
	 */
	public static final int MITIGATED_VALUE = 2;

	/**
	 * The '<em><b>Transferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED
	 * @model name="Transferred"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFERRED_VALUE = 3;

	/**
	 * The '<em><b>Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model name="Closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RiskStatus[] VALUES_ARRAY =
		new RiskStatus[] {
			OPEN,
			ACCEPTED,
			MITIGATED,
			TRANSFERRED,
			CLOSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RiskStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskStatus get(int value) {
		switch (value) {
			case OPEN_VALUE: return OPEN;
			case ACCEPTED_VALUE: return ACCEPTED;
			case MITIGATED_VALUE: return MITIGATED;
			case TRANSFERRED_VALUE: return TRANSFERRED;
			case CLOSED_VALUE: return CLOSED;
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
	private RiskStatus(int value, String name, String literal) {
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
	
} //RiskStatus
