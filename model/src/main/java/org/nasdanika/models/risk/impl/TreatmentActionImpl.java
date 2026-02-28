/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.ActionStatus;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.TreatmentAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.TreatmentActionImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.TreatmentActionImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.TreatmentActionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.TreatmentActionImpl#getTicketUrl <em>Ticket Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreatmentActionImpl extends RiskModelElementImpl implements TreatmentAction {
	/**
	 * The default value of the '{@link #getAssignee() <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNEE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ActionStatus STATUS_EDEFAULT = ActionStatus.PENDING;

	/**
	 * The default value of the '{@link #getTicketUrl() <em>Ticket Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TICKET_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.TREATMENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignee() {
		return (String)eDynamicGet(RiskPackage.TREATMENT_ACTION__ASSIGNEE, RiskPackage.Literals.TREATMENT_ACTION__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(String newAssignee) {
		eDynamicSet(RiskPackage.TREATMENT_ACTION__ASSIGNEE, RiskPackage.Literals.TREATMENT_ACTION__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eDynamicGet(RiskPackage.TREATMENT_ACTION__DUE_DATE, RiskPackage.Literals.TREATMENT_ACTION__DUE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eDynamicSet(RiskPackage.TREATMENT_ACTION__DUE_DATE, RiskPackage.Literals.TREATMENT_ACTION__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionStatus getStatus() {
		return (ActionStatus)eDynamicGet(RiskPackage.TREATMENT_ACTION__STATUS, RiskPackage.Literals.TREATMENT_ACTION__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ActionStatus newStatus) {
		eDynamicSet(RiskPackage.TREATMENT_ACTION__STATUS, RiskPackage.Literals.TREATMENT_ACTION__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTicketUrl() {
		return (String)eDynamicGet(RiskPackage.TREATMENT_ACTION__TICKET_URL, RiskPackage.Literals.TREATMENT_ACTION__TICKET_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicketUrl(String newTicketUrl) {
		eDynamicSet(RiskPackage.TREATMENT_ACTION__TICKET_URL, RiskPackage.Literals.TREATMENT_ACTION__TICKET_URL, newTicketUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.TREATMENT_ACTION__ASSIGNEE:
				return getAssignee();
			case RiskPackage.TREATMENT_ACTION__DUE_DATE:
				return getDueDate();
			case RiskPackage.TREATMENT_ACTION__STATUS:
				return getStatus();
			case RiskPackage.TREATMENT_ACTION__TICKET_URL:
				return getTicketUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiskPackage.TREATMENT_ACTION__ASSIGNEE:
				setAssignee((String)newValue);
				return;
			case RiskPackage.TREATMENT_ACTION__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case RiskPackage.TREATMENT_ACTION__STATUS:
				setStatus((ActionStatus)newValue);
				return;
			case RiskPackage.TREATMENT_ACTION__TICKET_URL:
				setTicketUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RiskPackage.TREATMENT_ACTION__ASSIGNEE:
				setAssignee(ASSIGNEE_EDEFAULT);
				return;
			case RiskPackage.TREATMENT_ACTION__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case RiskPackage.TREATMENT_ACTION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RiskPackage.TREATMENT_ACTION__TICKET_URL:
				setTicketUrl(TICKET_URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RiskPackage.TREATMENT_ACTION__ASSIGNEE:
				return ASSIGNEE_EDEFAULT == null ? getAssignee() != null : !ASSIGNEE_EDEFAULT.equals(getAssignee());
			case RiskPackage.TREATMENT_ACTION__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case RiskPackage.TREATMENT_ACTION__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RiskPackage.TREATMENT_ACTION__TICKET_URL:
				return TICKET_URL_EDEFAULT == null ? getTicketUrl() != null : !TICKET_URL_EDEFAULT.equals(getTicketUrl());
		}
		return super.eIsSet(featureID);
	}

} //TreatmentActionImpl
