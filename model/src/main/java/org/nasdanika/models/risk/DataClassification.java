/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Classification of data handled by a product or component, determining the sensitivity level and applicable controls.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getDataClassification()
 * @model
 * @generated
 */
public enum DataClassification implements Enumerator {
	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publicly available data with no restrictions.
	 * <!-- end-model-doc -->
	 * @see #PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC(0, "Public", "Public"),

	/**
	 * The '<em><b>Internal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal use only; not for public disclosure.
	 * <!-- end-model-doc -->
	 * @see #INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL(1, "Internal", "Internal"),

	/**
	 * The '<em><b>Confidential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sensitive data requiring restricted access (e.g., customer PII, financial data).
	 * <!-- end-model-doc -->
	 * @see #CONFIDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIAL(2, "Confidential", "Confidential"),

	/**
	 * The '<em><b>Restricted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Highly sensitive data with strict access controls (e.g., payment card data, regulated data).
	 * <!-- end-model-doc -->
	 * @see #RESTRICTED_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICTED(3, "Restricted", "Restricted"),

	/**
	 * The '<em><b>Top Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Most sensitive classification requiring maximum security controls.
	 * <!-- end-model-doc -->
	 * @see #TOP_SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_SECRET(4, "TopSecret", "TopSecret");

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Publicly available data with no restrictions.
	 * <!-- end-model-doc -->
	 * @see #PUBLIC
	 * @model name="Public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_VALUE = 0;

	/**
	 * The '<em><b>Internal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal use only; not for public disclosure.
	 * <!-- end-model-doc -->
	 * @see #INTERNAL
	 * @model name="Internal"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VALUE = 1;

	/**
	 * The '<em><b>Confidential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sensitive data requiring restricted access (e.g., customer PII, financial data).
	 * <!-- end-model-doc -->
	 * @see #CONFIDENTIAL
	 * @model name="Confidential"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIAL_VALUE = 2;

	/**
	 * The '<em><b>Restricted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Highly sensitive data with strict access controls (e.g., payment card data, regulated data).
	 * <!-- end-model-doc -->
	 * @see #RESTRICTED
	 * @model name="Restricted"
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICTED_VALUE = 3;

	/**
	 * The '<em><b>Top Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Most sensitive classification requiring maximum security controls.
	 * <!-- end-model-doc -->
	 * @see #TOP_SECRET
	 * @model name="TopSecret"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_SECRET_VALUE = 4;

	/**
	 * An array of all the '<em><b>Data Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataClassification[] VALUES_ARRAY =
		new DataClassification[] {
			PUBLIC,
			INTERNAL,
			CONFIDENTIAL,
			RESTRICTED,
			TOP_SECRET,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataClassification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataClassification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataClassification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataClassification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataClassification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataClassification get(int value) {
		switch (value) {
			case PUBLIC_VALUE: return PUBLIC;
			case INTERNAL_VALUE: return INTERNAL;
			case CONFIDENTIAL_VALUE: return CONFIDENTIAL;
			case RESTRICTED_VALUE: return RESTRICTED;
			case TOP_SECRET_VALUE: return TOP_SECRET;
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
	private DataClassification(int value, String name, String literal) {
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
	
} //DataClassification
