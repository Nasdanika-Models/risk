/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A plan for treating (responding to) an identified risk, including the chosen strategy and specific actions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskTreatment#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskTreatment#getTargetDate <em>Target Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskTreatment#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskTreatment#getApprover <em>Approver</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskTreatment#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskTreatment()
 * @model
 * @generated
 */
public interface RiskTreatment extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.TreatmentStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The treatment strategy: Accept, Avoid, Mitigate, or Transfer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see org.nasdanika.models.risk.TreatmentStrategy
	 * @see #setStrategy(TreatmentStrategy)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskTreatment_Strategy()
	 * @model
	 * @generated
	 */
	TreatmentStrategy getStrategy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskTreatment#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see org.nasdanika.models.risk.TreatmentStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(TreatmentStrategy value);

	/**
	 * Returns the value of the '<em><b>Target Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target date for completing the treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Date</em>' attribute.
	 * @see #setTargetDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskTreatment_TargetDate()
	 * @model
	 * @generated
	 */
	Date getTargetDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskTreatment#getTargetDate <em>Target Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Date</em>' attribute.
	 * @see #getTargetDate()
	 * @generated
	 */
	void setTargetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.TreatmentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the treatment plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.TreatmentStatus
	 * @see #setStatus(TreatmentStatus)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskTreatment_Status()
	 * @model
	 * @generated
	 */
	TreatmentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskTreatment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.TreatmentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TreatmentStatus value);

	/**
	 * Returns the value of the '<em><b>Approver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who approved this treatment strategy (required for Accept strategy in some governance frameworks).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approver</em>' attribute.
	 * @see #setApprover(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskTreatment_Approver()
	 * @model
	 * @generated
	 */
	String getApprover();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskTreatment#getApprover <em>Approver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver</em>' attribute.
	 * @see #getApprover()
	 * @generated
	 */
	void setApprover(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.TreatmentAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific actions to be taken as part of this treatment plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskTreatment_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TreatmentAction> getActions();

} // RiskTreatment
