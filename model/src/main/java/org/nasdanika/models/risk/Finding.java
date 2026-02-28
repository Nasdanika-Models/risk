/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An observation, gap, issue, or recommendation identified during a risk assessment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Finding#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Finding#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Finding#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Finding#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Finding#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Finding#getTicketUrl <em>Ticket Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getFinding()
 * @model
 * @generated
 */
public interface Finding extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The severity of this finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' reference.
	 * @see #setSeverity(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getFinding_Severity()
	 * @model
	 * @generated
	 */
	RiskLevel getSeverity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Finding#getSeverity <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.FindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of finding: Gap, Issue, Observation, or Recommendation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.FindingType
	 * @see #setType(FindingType)
	 * @see org.nasdanika.models.risk.RiskPackage#getFinding_Type()
	 * @model
	 * @generated
	 */
	FindingType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Finding#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.FindingType
	 * @see #getType()
	 * @generated
	 */
	void setType(FindingType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.FindingStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current lifecycle status of this finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.FindingStatus
	 * @see #setStatus(FindingStatus)
	 * @see org.nasdanika.models.risk.RiskPackage#getFinding_Status()
	 * @model
	 * @generated
	 */
	FindingStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Finding#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.FindingStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FindingStatus value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target date for resolving this finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getFinding_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Finding#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person or team assigned to address this finding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assignee</em>' attribute.
	 * @see #setAssignee(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getFinding_Assignee()
	 * @model
	 * @generated
	 */
	String getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Finding#getAssignee <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' attribute.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(String value);

	/**
	 * Returns the value of the '<em><b>Ticket Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to the work item tracking resolution of this finding (e.g., Jira ticket).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ticket Url</em>' attribute.
	 * @see #setTicketUrl(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getFinding_TicketUrl()
	 * @model
	 * @generated
	 */
	String getTicketUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Finding#getTicketUrl <em>Ticket Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Url</em>' attribute.
	 * @see #getTicketUrl()
	 * @generated
	 */
	void setTicketUrl(String value);

} // Finding
