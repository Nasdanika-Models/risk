/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific actionable step within a risk treatment plan.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.TreatmentAction#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.TreatmentAction#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.TreatmentAction#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.TreatmentAction#getTicketUrl <em>Ticket Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentAction()
 * @model
 * @generated
 */
public interface TreatmentAction extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person or team responsible for executing this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assignee</em>' attribute.
	 * @see #setAssignee(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentAction_Assignee()
	 * @model
	 * @generated
	 */
	String getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.TreatmentAction#getAssignee <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' attribute.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target completion date for this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentAction_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.TreatmentAction#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.ActionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.ActionStatus
	 * @see #setStatus(ActionStatus)
	 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentAction_Status()
	 * @model
	 * @generated
	 */
	ActionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.TreatmentAction#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.ActionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ActionStatus value);

	/**
	 * Returns the value of the '<em><b>Ticket Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to the work item or task tracking this action (e.g., Jira ticket, GitHub issue).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ticket Url</em>' attribute.
	 * @see #setTicketUrl(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getTreatmentAction_TicketUrl()
	 * @model
	 * @generated
	 */
	String getTicketUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.TreatmentAction#getTicketUrl <em>Ticket Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Url</em>' attribute.
	 * @see #getTicketUrl()
	 * @generated
	 */
	void setTicketUrl(String value);

} // TreatmentAction
