/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assessment Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Current lifecycle status of a risk assessment.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getAssessmentStatus()
 * @model
 * @generated
 */
public enum AssessmentStatus implements Enumerator {
	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment is being authored; not yet submitted for review.
	 * <!-- end-model-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(0, "Draft", "Draft"),

	/**
	 * The '<em><b>Under Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment has been submitted and is awaiting approval.
	 * <!-- end-model-doc -->
	 * @see #UNDER_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	UNDER_REVIEW(1, "UnderReview", "UnderReview"),

	/**
	 * The '<em><b>Approved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment has been reviewed and approved by the designated approver.
	 * <!-- end-model-doc -->
	 * @see #APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED(2, "Approved", "Approved"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment was reviewed but rejected; must be revised.
	 * <!-- end-model-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(3, "Rejected", "Rejected"),

	/**
	 * The '<em><b>Outdated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment was approved but is now past its review date or superseded by a change.
	 * <!-- end-model-doc -->
	 * @see #OUTDATED_VALUE
	 * @generated
	 * @ordered
	 */
	OUTDATED(4, "Outdated", "Outdated");

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment is being authored; not yet submitted for review.
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model name="Draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 0;

	/**
	 * The '<em><b>Under Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment has been submitted and is awaiting approval.
	 * <!-- end-model-doc -->
	 * @see #UNDER_REVIEW
	 * @model name="UnderReview"
	 * @generated
	 * @ordered
	 */
	public static final int UNDER_REVIEW_VALUE = 1;

	/**
	 * The '<em><b>Approved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment has been reviewed and approved by the designated approver.
	 * <!-- end-model-doc -->
	 * @see #APPROVED
	 * @model name="Approved"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_VALUE = 2;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment was reviewed but rejected; must be revised.
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model name="Rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 3;

	/**
	 * The '<em><b>Outdated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment was approved but is now past its review date or superseded by a change.
	 * <!-- end-model-doc -->
	 * @see #OUTDATED
	 * @model name="Outdated"
	 * @generated
	 * @ordered
	 */
	public static final int OUTDATED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Assessment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssessmentStatus[] VALUES_ARRAY =
		new AssessmentStatus[] {
			DRAFT,
			UNDER_REVIEW,
			APPROVED,
			REJECTED,
			OUTDATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Assessment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssessmentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assessment Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssessmentStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssessmentStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assessment Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssessmentStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssessmentStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assessment Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssessmentStatus get(int value) {
		switch (value) {
			case DRAFT_VALUE: return DRAFT;
			case UNDER_REVIEW_VALUE: return UNDER_REVIEW;
			case APPROVED_VALUE: return APPROVED;
			case REJECTED_VALUE: return REJECTED;
			case OUTDATED_VALUE: return OUTDATED;
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
	private AssessmentStatus(int value, String name, String literal) {
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
	
} //AssessmentStatus
