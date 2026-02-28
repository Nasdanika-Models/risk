/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A source system from which risk-relevant data is collected (e.g., Jira, GitHub, GitLab, SonarQube, Veracode, ServiceNow, AWS Security Hub). Data sources are polled or receive events to detect changes that may trigger risk re-assessments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.DataSource#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.DataSource#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.DataSource#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type/system name of this data source (e.g., Jira, GitHub, SonarQube, ServiceNow).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getDataSource_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.DataSource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base URL of this data source system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #setBaseUrl(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getDataSource_BaseUrl()
	 * @model
	 * @generated
	 */
	String getBaseUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.DataSource#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts (tracked items) in this data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getDataSource_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // DataSource
