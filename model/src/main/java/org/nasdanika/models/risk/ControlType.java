/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The nature of a risk control.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getControlType()
 * @model
 * @generated
 */
public enum ControlType implements Enumerator {
	/**
	 * The '<em><b>Preventive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prevents a risk event from occurring (e.g., access controls, encryption).
	 * <!-- end-model-doc -->
	 * @see #PREVENTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PREVENTIVE(0, "Preventive", "Preventive"),

	/**
	 * The '<em><b>Detective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detects when a risk event has occurred (e.g., monitoring, audits, alerts).
	 * <!-- end-model-doc -->
	 * @see #DETECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTIVE(1, "Detective", "Detective"),

	/**
	 * The '<em><b>Corrective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrects the situation after a risk event (e.g., incident response, backups).
	 * <!-- end-model-doc -->
	 * @see #CORRECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTIVE(2, "Corrective", "Corrective"),

	/**
	 * The '<em><b>Compensating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an alternative control when a primary control cannot be implemented.
	 * <!-- end-model-doc -->
	 * @see #COMPENSATING_VALUE
	 * @generated
	 * @ordered
	 */
	COMPENSATING(3, "Compensating", "Compensating");

	/**
	 * The '<em><b>Preventive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prevents a risk event from occurring (e.g., access controls, encryption).
	 * <!-- end-model-doc -->
	 * @see #PREVENTIVE
	 * @model name="Preventive"
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTIVE_VALUE = 0;

	/**
	 * The '<em><b>Detective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detects when a risk event has occurred (e.g., monitoring, audits, alerts).
	 * <!-- end-model-doc -->
	 * @see #DETECTIVE
	 * @model name="Detective"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTIVE_VALUE = 1;

	/**
	 * The '<em><b>Corrective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrects the situation after a risk event (e.g., incident response, backups).
	 * <!-- end-model-doc -->
	 * @see #CORRECTIVE
	 * @model name="Corrective"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTIVE_VALUE = 2;

	/**
	 * The '<em><b>Compensating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an alternative control when a primary control cannot be implemented.
	 * <!-- end-model-doc -->
	 * @see #COMPENSATING
	 * @model name="Compensating"
	 * @generated
	 * @ordered
	 */
	public static final int COMPENSATING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlType[] VALUES_ARRAY =
		new ControlType[] {
			PREVENTIVE,
			DETECTIVE,
			CORRECTIVE,
			COMPENSATING,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType get(int value) {
		switch (value) {
			case PREVENTIVE_VALUE: return PREVENTIVE;
			case DETECTIVE_VALUE: return DETECTIVE;
			case CORRECTIVE_VALUE: return CORRECTIVE;
			case COMPENSATING_VALUE: return COMPENSATING;
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
	private ControlType(int value, String name, String literal) {
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
	
} //ControlType
