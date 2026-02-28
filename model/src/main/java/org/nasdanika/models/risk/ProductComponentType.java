/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of a product component representing an independently assessable unit (RAU) below the product level.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getProductComponentType()
 * @model
 * @generated
 */
public enum ProductComponentType implements Enumerator {
	/**
	 * The '<em><b>Repository</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A source code repository (e.g., a GitHub/GitLab repo).
	 * <!-- end-model-doc -->
	 * @see #REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY(0, "Repository", "Repository"),

	/**
	 * The '<em><b>Deployable Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A deployable artifact such as a microservice, container image, or binary.
	 * <!-- end-model-doc -->
	 * @see #DEPLOYABLE_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYABLE_UNIT(1, "DeployableUnit", "DeployableUnit"),

	/**
	 * The '<em><b>Epic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Jira Epic or equivalent large work item representing a significant feature or initiative.
	 * <!-- end-model-doc -->
	 * @see #EPIC_VALUE
	 * @generated
	 * @ordered
	 */
	EPIC(2, "Epic", "Epic"),

	/**
	 * The '<em><b>Database</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A database or data store.
	 * <!-- end-model-doc -->
	 * @see #DATABASE_VALUE
	 * @generated
	 * @ordered
	 */
	DATABASE(3, "Database", "Database"),

	/**
	 * The '<em><b>API</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An API or service endpoint.
	 * <!-- end-model-doc -->
	 * @see #API_VALUE
	 * @generated
	 * @ordered
	 */
	API(4, "API", "API"),

	/**
	 * The '<em><b>Third Party Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A third-party service or vendor dependency.
	 * <!-- end-model-doc -->
	 * @see #THIRD_PARTY_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_PARTY_SERVICE(5, "ThirdPartyService", "ThirdPartyService"),

	/**
	 * The '<em><b>Cloud Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A public or private cloud service (e.g., AWS S3, Azure Blob).
	 * <!-- end-model-doc -->
	 * @see #CLOUD_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_SERVICE(6, "CloudService", "CloudService"),

	/**
	 * The '<em><b>AI Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AI/ML model used as part of the product.
	 * <!-- end-model-doc -->
	 * @see #AI_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	AI_MODEL(7, "AIModel", "AIModel"),

	/**
	 * The '<em><b>Integration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integration point with another system.
	 * <!-- end-model-doc -->
	 * @see #INTEGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATION(8, "Integration", "Integration");

	/**
	 * The '<em><b>Repository</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A source code repository (e.g., a GitHub/GitLab repo).
	 * <!-- end-model-doc -->
	 * @see #REPOSITORY
	 * @model name="Repository"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_VALUE = 0;

	/**
	 * The '<em><b>Deployable Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A deployable artifact such as a microservice, container image, or binary.
	 * <!-- end-model-doc -->
	 * @see #DEPLOYABLE_UNIT
	 * @model name="DeployableUnit"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYABLE_UNIT_VALUE = 1;

	/**
	 * The '<em><b>Epic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Jira Epic or equivalent large work item representing a significant feature or initiative.
	 * <!-- end-model-doc -->
	 * @see #EPIC
	 * @model name="Epic"
	 * @generated
	 * @ordered
	 */
	public static final int EPIC_VALUE = 2;

	/**
	 * The '<em><b>Database</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A database or data store.
	 * <!-- end-model-doc -->
	 * @see #DATABASE
	 * @model name="Database"
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_VALUE = 3;

	/**
	 * The '<em><b>API</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An API or service endpoint.
	 * <!-- end-model-doc -->
	 * @see #API
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int API_VALUE = 4;

	/**
	 * The '<em><b>Third Party Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A third-party service or vendor dependency.
	 * <!-- end-model-doc -->
	 * @see #THIRD_PARTY_SERVICE
	 * @model name="ThirdPartyService"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_PARTY_SERVICE_VALUE = 5;

	/**
	 * The '<em><b>Cloud Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A public or private cloud service (e.g., AWS S3, Azure Blob).
	 * <!-- end-model-doc -->
	 * @see #CLOUD_SERVICE
	 * @model name="CloudService"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_SERVICE_VALUE = 6;

	/**
	 * The '<em><b>AI Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AI/ML model used as part of the product.
	 * <!-- end-model-doc -->
	 * @see #AI_MODEL
	 * @model name="AIModel"
	 * @generated
	 * @ordered
	 */
	public static final int AI_MODEL_VALUE = 7;

	/**
	 * The '<em><b>Integration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integration point with another system.
	 * <!-- end-model-doc -->
	 * @see #INTEGRATION
	 * @model name="Integration"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATION_VALUE = 8;

	/**
	 * An array of all the '<em><b>Product Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductComponentType[] VALUES_ARRAY =
		new ProductComponentType[] {
			REPOSITORY,
			DEPLOYABLE_UNIT,
			EPIC,
			DATABASE,
			API,
			THIRD_PARTY_SERVICE,
			CLOUD_SERVICE,
			AI_MODEL,
			INTEGRATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Product Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductComponentType get(int value) {
		switch (value) {
			case REPOSITORY_VALUE: return REPOSITORY;
			case DEPLOYABLE_UNIT_VALUE: return DEPLOYABLE_UNIT;
			case EPIC_VALUE: return EPIC;
			case DATABASE_VALUE: return DATABASE;
			case API_VALUE: return API;
			case THIRD_PARTY_SERVICE_VALUE: return THIRD_PARTY_SERVICE;
			case CLOUD_SERVICE_VALUE: return CLOUD_SERVICE;
			case AI_MODEL_VALUE: return AI_MODEL;
			case INTEGRATION_VALUE: return INTEGRATION;
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
	private ProductComponentType(int value, String name, String literal) {
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
	
} //ProductComponentType
