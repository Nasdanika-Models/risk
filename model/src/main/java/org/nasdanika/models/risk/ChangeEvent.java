/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event representing a change detected in a data source that may require risk re-assessment. Change events are the mechanism by which the risk model is kept current with the state of the products being assessed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.ChangeEvent#getEventDate <em>Event Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ChangeEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ChangeEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ChangeEvent#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ChangeEvent#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and time when this change occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Date</em>' attribute.
	 * @see #setEventDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getChangeEvent_EventDate()
	 * @model
	 * @generated
	 */
	Date getEventDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ChangeEvent#getEventDate <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Date</em>' attribute.
	 * @see #getEventDate()
	 * @generated
	 */
	void setEventDate(Date value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.ChangeEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of change that occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ChangeEventType
	 * @see #setType(ChangeEventType)
	 * @see org.nasdanika.models.risk.RiskPackage#getChangeEvent_Type()
	 * @model
	 * @generated
	 */
	ChangeEventType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ChangeEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ChangeEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChangeEventType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data source in which this change was detected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DataSource)
	 * @see org.nasdanika.models.risk.RiskPackage#getChangeEvent_Source()
	 * @model
	 * @generated
	 */
	DataSource getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ChangeEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific artifact that changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' reference.
	 * @see #setArtifact(Artifact)
	 * @see org.nasdanika.models.risk.RiskPackage#getChangeEvent_Artifact()
	 * @model
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ChangeEvent#getArtifact <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional details about what changed (e.g., CVE ID for a vulnerability, regulation name for a policy change).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getChangeEvent_Details()
	 * @model
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ChangeEvent#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

} // ChangeEvent
