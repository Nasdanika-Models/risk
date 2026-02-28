/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.RiskTreatment;
import org.nasdanika.models.risk.TreatmentAction;
import org.nasdanika.models.risk.TreatmentStatus;
import org.nasdanika.models.risk.TreatmentStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl#getTargetDate <em>Target Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl#getApprover <em>Approver</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskTreatmentImpl extends RiskModelElementImpl implements RiskTreatment {
	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final TreatmentStrategy STRATEGY_EDEFAULT = TreatmentStrategy.ACCEPT;

	/**
	 * The default value of the '{@link #getTargetDate() <em>Target Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TARGET_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final TreatmentStatus STATUS_EDEFAULT = TreatmentStatus.PLANNED;

	/**
	 * The default value of the '{@link #getApprover() <em>Approver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprover()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskTreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_TREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreatmentStrategy getStrategy() {
		return (TreatmentStrategy)eDynamicGet(RiskPackage.RISK_TREATMENT__STRATEGY, RiskPackage.Literals.RISK_TREATMENT__STRATEGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(TreatmentStrategy newStrategy) {
		eDynamicSet(RiskPackage.RISK_TREATMENT__STRATEGY, RiskPackage.Literals.RISK_TREATMENT__STRATEGY, newStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTargetDate() {
		return (Date)eDynamicGet(RiskPackage.RISK_TREATMENT__TARGET_DATE, RiskPackage.Literals.RISK_TREATMENT__TARGET_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDate(Date newTargetDate) {
		eDynamicSet(RiskPackage.RISK_TREATMENT__TARGET_DATE, RiskPackage.Literals.RISK_TREATMENT__TARGET_DATE, newTargetDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreatmentStatus getStatus() {
		return (TreatmentStatus)eDynamicGet(RiskPackage.RISK_TREATMENT__STATUS, RiskPackage.Literals.RISK_TREATMENT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(TreatmentStatus newStatus) {
		eDynamicSet(RiskPackage.RISK_TREATMENT__STATUS, RiskPackage.Literals.RISK_TREATMENT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApprover() {
		return (String)eDynamicGet(RiskPackage.RISK_TREATMENT__APPROVER, RiskPackage.Literals.RISK_TREATMENT__APPROVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprover(String newApprover) {
		eDynamicSet(RiskPackage.RISK_TREATMENT__APPROVER, RiskPackage.Literals.RISK_TREATMENT__APPROVER, newApprover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TreatmentAction> getActions() {
		return (EList<TreatmentAction>)eDynamicGet(RiskPackage.RISK_TREATMENT__ACTIONS, RiskPackage.Literals.RISK_TREATMENT__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.RISK_TREATMENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.RISK_TREATMENT__STRATEGY:
				return getStrategy();
			case RiskPackage.RISK_TREATMENT__TARGET_DATE:
				return getTargetDate();
			case RiskPackage.RISK_TREATMENT__STATUS:
				return getStatus();
			case RiskPackage.RISK_TREATMENT__APPROVER:
				return getApprover();
			case RiskPackage.RISK_TREATMENT__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiskPackage.RISK_TREATMENT__STRATEGY:
				setStrategy((TreatmentStrategy)newValue);
				return;
			case RiskPackage.RISK_TREATMENT__TARGET_DATE:
				setTargetDate((Date)newValue);
				return;
			case RiskPackage.RISK_TREATMENT__STATUS:
				setStatus((TreatmentStatus)newValue);
				return;
			case RiskPackage.RISK_TREATMENT__APPROVER:
				setApprover((String)newValue);
				return;
			case RiskPackage.RISK_TREATMENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends TreatmentAction>)newValue);
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
			case RiskPackage.RISK_TREATMENT__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case RiskPackage.RISK_TREATMENT__TARGET_DATE:
				setTargetDate(TARGET_DATE_EDEFAULT);
				return;
			case RiskPackage.RISK_TREATMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RiskPackage.RISK_TREATMENT__APPROVER:
				setApprover(APPROVER_EDEFAULT);
				return;
			case RiskPackage.RISK_TREATMENT__ACTIONS:
				getActions().clear();
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
			case RiskPackage.RISK_TREATMENT__STRATEGY:
				return getStrategy() != STRATEGY_EDEFAULT;
			case RiskPackage.RISK_TREATMENT__TARGET_DATE:
				return TARGET_DATE_EDEFAULT == null ? getTargetDate() != null : !TARGET_DATE_EDEFAULT.equals(getTargetDate());
			case RiskPackage.RISK_TREATMENT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RiskPackage.RISK_TREATMENT__APPROVER:
				return APPROVER_EDEFAULT == null ? getApprover() != null : !APPROVER_EDEFAULT.equals(getApprover());
			case RiskPackage.RISK_TREATMENT__ACTIONS:
				return !getActions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskTreatmentImpl
