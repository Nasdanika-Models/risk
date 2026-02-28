/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An artifact in an external data source system (e.g., a Jira Epic, a GitHub repository, a CI/CD pipeline) that is relevant to risk assessment. Some artifacts are Risk Assessable Units (RAUs) themselves.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Artifact#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Artifact#getArtifactUrl <em>Artifact Url</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Artifact#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Artifact#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Artifact#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of this artifact in the source system (e.g., Jira issue key, GitHub repo name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getArtifact_ExternalId()
	 * @model
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Artifact#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to this artifact in the source system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Url</em>' attribute.
	 * @see #setArtifactUrl(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getArtifact_ArtifactUrl()
	 * @model
	 * @generated
	 */
	String getArtifactUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Artifact#getArtifactUrl <em>Artifact Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Url</em>' attribute.
	 * @see #getArtifactUrl()
	 * @generated
	 */
	void setArtifactUrl(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ArtifactType
	 * @see #setType(ArtifactType)
	 * @see org.nasdanika.models.risk.RiskPackage#getArtifact_Type()
	 * @model
	 * @generated
	 */
	ArtifactType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Artifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ArtifactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ArtifactType value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/time when this artifact was last updated in the source system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated</em>' attribute.
	 * @see #setLastUpdated(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getArtifact_LastUpdated()
	 * @model
	 * @generated
	 */
	Date getLastUpdated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Artifact#getLastUpdated <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' attribute.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Date value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional metadata from the source system stored as key-value pairs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getArtifact_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getMetadata();

} // Artifact
