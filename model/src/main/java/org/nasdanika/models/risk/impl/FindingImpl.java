/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.Finding;
import org.nasdanika.models.risk.FindingStatus;
import org.nasdanika.models.risk.FindingType;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.FindingImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.FindingImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.FindingImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.FindingImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.FindingImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.FindingImpl#getTicketUrl <em>Ticket Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends RiskModelElementImpl implements Finding {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FindingType TYPE_EDEFAULT = FindingType.GAP;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final FindingStatus STATUS_EDEFAULT = FindingStatus.OPEN;

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
	 * The default value of the '{@link #getAssignee() <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNEE_EDEFAULT = null;

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
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getSeverity() {
		return (RiskLevel)eDynamicGet(RiskPackage.FINDING__SEVERITY, RiskPackage.Literals.FINDING__SEVERITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetSeverity() {
		return (RiskLevel)eDynamicGet(RiskPackage.FINDING__SEVERITY, RiskPackage.Literals.FINDING__SEVERITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(RiskLevel newSeverity) {
		eDynamicSet(RiskPackage.FINDING__SEVERITY, RiskPackage.Literals.FINDING__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingType getType() {
		return (FindingType)eDynamicGet(RiskPackage.FINDING__TYPE, RiskPackage.Literals.FINDING__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(FindingType newType) {
		eDynamicSet(RiskPackage.FINDING__TYPE, RiskPackage.Literals.FINDING__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingStatus getStatus() {
		return (FindingStatus)eDynamicGet(RiskPackage.FINDING__STATUS, RiskPackage.Literals.FINDING__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(FindingStatus newStatus) {
		eDynamicSet(RiskPackage.FINDING__STATUS, RiskPackage.Literals.FINDING__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eDynamicGet(RiskPackage.FINDING__DUE_DATE, RiskPackage.Literals.FINDING__DUE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eDynamicSet(RiskPackage.FINDING__DUE_DATE, RiskPackage.Literals.FINDING__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignee() {
		return (String)eDynamicGet(RiskPackage.FINDING__ASSIGNEE, RiskPackage.Literals.FINDING__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(String newAssignee) {
		eDynamicSet(RiskPackage.FINDING__ASSIGNEE, RiskPackage.Literals.FINDING__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTicketUrl() {
		return (String)eDynamicGet(RiskPackage.FINDING__TICKET_URL, RiskPackage.Literals.FINDING__TICKET_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicketUrl(String newTicketUrl) {
		eDynamicSet(RiskPackage.FINDING__TICKET_URL, RiskPackage.Literals.FINDING__TICKET_URL, newTicketUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.FINDING__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case RiskPackage.FINDING__TYPE:
				return getType();
			case RiskPackage.FINDING__STATUS:
				return getStatus();
			case RiskPackage.FINDING__DUE_DATE:
				return getDueDate();
			case RiskPackage.FINDING__ASSIGNEE:
				return getAssignee();
			case RiskPackage.FINDING__TICKET_URL:
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
			case RiskPackage.FINDING__SEVERITY:
				setSeverity((RiskLevel)newValue);
				return;
			case RiskPackage.FINDING__TYPE:
				setType((FindingType)newValue);
				return;
			case RiskPackage.FINDING__STATUS:
				setStatus((FindingStatus)newValue);
				return;
			case RiskPackage.FINDING__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case RiskPackage.FINDING__ASSIGNEE:
				setAssignee((String)newValue);
				return;
			case RiskPackage.FINDING__TICKET_URL:
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
			case RiskPackage.FINDING__SEVERITY:
				setSeverity((RiskLevel)null);
				return;
			case RiskPackage.FINDING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RiskPackage.FINDING__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RiskPackage.FINDING__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case RiskPackage.FINDING__ASSIGNEE:
				setAssignee(ASSIGNEE_EDEFAULT);
				return;
			case RiskPackage.FINDING__TICKET_URL:
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
			case RiskPackage.FINDING__SEVERITY:
				return basicGetSeverity() != null;
			case RiskPackage.FINDING__TYPE:
				return getType() != TYPE_EDEFAULT;
			case RiskPackage.FINDING__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RiskPackage.FINDING__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case RiskPackage.FINDING__ASSIGNEE:
				return ASSIGNEE_EDEFAULT == null ? getAssignee() != null : !ASSIGNEE_EDEFAULT.equals(getAssignee());
			case RiskPackage.FINDING__TICKET_URL:
				return TICKET_URL_EDEFAULT == null ? getTicketUrl() != null : !TICKET_URL_EDEFAULT.equals(getTicketUrl());
		}
		return super.eIsSet(featureID);
	}

} //FindingImpl
