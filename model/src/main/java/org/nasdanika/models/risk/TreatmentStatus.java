/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Treatment Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Current status of a risk treatment plan.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentStatus()
 * @model
 * @generated
 */
public enum TreatmentStatus implements Enumerator {
	/**
	 * The '<em><b>Planned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(0, "Planned", "Planned"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(1, "InProgress", "InProgress"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(2, "Completed", "Completed"),

	/**
	 * The '<em><b>Overdue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERDUE_VALUE
	 * @generated
	 * @ordered
	 */
	OVERDUE(3, "Overdue", "Overdue"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(4, "Cancelled", "Cancelled");

	/**
	 * The '<em><b>Planned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED
	 * @model name="Planned"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 0;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS
	 * @model name="InProgress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 1;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model name="Completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 2;

	/**
	 * The '<em><b>Overdue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERDUE
	 * @model name="Overdue"
	 * @generated
	 * @ordered
	 */
	public static final int OVERDUE_VALUE = 3;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model name="Cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Treatment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TreatmentStatus[] VALUES_ARRAY =
		new TreatmentStatus[] {
			PLANNED,
			IN_PROGRESS,
			COMPLETED,
			OVERDUE,
			CANCELLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Treatment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TreatmentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Treatment Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreatmentStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TreatmentStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Treatment Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreatmentStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TreatmentStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Treatment Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreatmentStatus get(int value) {
		switch (value) {
			case PLANNED_VALUE: return PLANNED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case COMPLETED_VALUE: return COMPLETED;
			case OVERDUE_VALUE: return OVERDUE;
			case CANCELLED_VALUE: return CANCELLED;
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
	private TreatmentStatus(int value, String name, String literal) {
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
	
} //TreatmentStatus
