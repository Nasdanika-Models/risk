/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Treatment Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Strategy for treating (responding to) an identified risk.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentStrategy()
 * @model
 * @generated
 */
public enum TreatmentStrategy implements Enumerator {
	/**
	 * The '<em><b>Accept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accept the risk without additional controls; typically used for low-impact or low-likelihood risks.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(0, "Accept", "Accept"),

	/**
	 * The '<em><b>Avoid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eliminate the risk by not engaging in the activity that creates it.
	 * <!-- end-model-doc -->
	 * @see #AVOID_VALUE
	 * @generated
	 * @ordered
	 */
	AVOID(1, "Avoid", "Avoid"),

	/**
	 * The '<em><b>Mitigate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reduce the likelihood or impact of the risk through controls.
	 * <!-- end-model-doc -->
	 * @see #MITIGATE_VALUE
	 * @generated
	 * @ordered
	 */
	MITIGATE(2, "Mitigate", "Mitigate"),

	/**
	 * The '<em><b>Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transfer the risk to a third party (e.g., insurance, outsourcing, contracts).
	 * <!-- end-model-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(3, "Transfer", "Transfer");

	/**
	 * The '<em><b>Accept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accept the risk without additional controls; typically used for low-impact or low-likelihood risks.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT
	 * @model name="Accept"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 0;

	/**
	 * The '<em><b>Avoid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eliminate the risk by not engaging in the activity that creates it.
	 * <!-- end-model-doc -->
	 * @see #AVOID
	 * @model name="Avoid"
	 * @generated
	 * @ordered
	 */
	public static final int AVOID_VALUE = 1;

	/**
	 * The '<em><b>Mitigate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reduce the likelihood or impact of the risk through controls.
	 * <!-- end-model-doc -->
	 * @see #MITIGATE
	 * @model name="Mitigate"
	 * @generated
	 * @ordered
	 */
	public static final int MITIGATE_VALUE = 2;

	/**
	 * The '<em><b>Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transfer the risk to a third party (e.g., insurance, outsourcing, contracts).
	 * <!-- end-model-doc -->
	 * @see #TRANSFER
	 * @model name="Transfer"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Treatment Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TreatmentStrategy[] VALUES_ARRAY =
		new TreatmentStrategy[] {
			ACCEPT,
			AVOID,
			MITIGATE,
			TRANSFER,
		};

	/**
	 * A public read-only list of all the '<em><b>Treatment Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TreatmentStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Treatment Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreatmentStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TreatmentStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Treatment Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreatmentStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TreatmentStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Treatment Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TreatmentStrategy get(int value) {
		switch (value) {
			case ACCEPT_VALUE: return ACCEPT;
			case AVOID_VALUE: return AVOID;
			case MITIGATE_VALUE: return MITIGATE;
			case TRANSFER_VALUE: return TRANSFER;
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
	private TreatmentStrategy(int value, String name, String literal) {
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
	
} //TreatmentStrategy
