/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Artifact Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of artifact in a data source system.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getArtifactType()
 * @model
 * @generated
 */
public enum ArtifactType implements Enumerator {
	/**
	 * The '<em><b>Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An issue, ticket, or work item (e.g., Jira issue).
	 * <!-- end-model-doc -->
	 * @see #ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUE(0, "Issue", "Issue"),

	/**
	 * The '<em><b>Epic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A large work item such as a Jira Epic.
	 * <!-- end-model-doc -->
	 * @see #EPIC_VALUE
	 * @generated
	 * @ordered
	 */
	EPIC(1, "Epic", "Epic"),

	/**
	 * The '<em><b>Repository</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A source code repository.
	 * <!-- end-model-doc -->
	 * @see #REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY(2, "Repository", "Repository"),

	/**
	 * The '<em><b>Pipeline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CI/CD pipeline.
	 * <!-- end-model-doc -->
	 * @see #PIPELINE_VALUE
	 * @generated
	 * @ordered
	 */
	PIPELINE(3, "Pipeline", "Pipeline"),

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A deployment to an environment.
	 * <!-- end-model-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(4, "Deployment", "Deployment"),

	/**
	 * The '<em><b>Scan Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security or code quality scan report.
	 * <!-- end-model-doc -->
	 * @see #SCAN_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SCAN_REPORT(5, "ScanReport", "ScanReport"),

	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A document such as an architecture decision record, design document, or policy.
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(6, "Document", "Document");

	/**
	 * The '<em><b>Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An issue, ticket, or work item (e.g., Jira issue).
	 * <!-- end-model-doc -->
	 * @see #ISSUE
	 * @model name="Issue"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUE_VALUE = 0;

	/**
	 * The '<em><b>Epic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A large work item such as a Jira Epic.
	 * <!-- end-model-doc -->
	 * @see #EPIC
	 * @model name="Epic"
	 * @generated
	 * @ordered
	 */
	public static final int EPIC_VALUE = 1;

	/**
	 * The '<em><b>Repository</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A source code repository.
	 * <!-- end-model-doc -->
	 * @see #REPOSITORY
	 * @model name="Repository"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_VALUE = 2;

	/**
	 * The '<em><b>Pipeline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CI/CD pipeline.
	 * <!-- end-model-doc -->
	 * @see #PIPELINE
	 * @model name="Pipeline"
	 * @generated
	 * @ordered
	 */
	public static final int PIPELINE_VALUE = 3;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A deployment to an environment.
	 * <!-- end-model-doc -->
	 * @see #DEPLOYMENT
	 * @model name="Deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 4;

	/**
	 * The '<em><b>Scan Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security or code quality scan report.
	 * <!-- end-model-doc -->
	 * @see #SCAN_REPORT
	 * @model name="ScanReport"
	 * @generated
	 * @ordered
	 */
	public static final int SCAN_REPORT_VALUE = 5;

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A document such as an architecture decision record, design document, or policy.
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT
	 * @model name="Document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Artifact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactType[] VALUES_ARRAY =
		new ArtifactType[] {
			ISSUE,
			EPIC,
			REPOSITORY,
			PIPELINE,
			DEPLOYMENT,
			SCAN_REPORT,
			DOCUMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType get(int value) {
		switch (value) {
			case ISSUE_VALUE: return ISSUE;
			case EPIC_VALUE: return EPIC;
			case REPOSITORY_VALUE: return REPOSITORY;
			case PIPELINE_VALUE: return PIPELINE;
			case DEPLOYMENT_VALUE: return DEPLOYMENT;
			case SCAN_REPORT_VALUE: return SCAN_REPORT;
			case DOCUMENT_VALUE: return DOCUMENT;
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
	private ArtifactType(int value, String name, String literal) {
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
	
} //ArtifactType
