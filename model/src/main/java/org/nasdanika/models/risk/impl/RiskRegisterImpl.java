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
import org.nasdanika.models.risk.RiskRegister;
import org.nasdanika.models.risk.RiskRegisterEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskRegisterImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskRegisterImpl#getReportDate <em>Report Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskRegisterImpl extends RiskModelElementImpl implements RiskRegister {
	/**
	 * The default value of the '{@link #getReportDate() <em>Report Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REPORT_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RiskRegisterEntry> getEntries() {
		return (EList<RiskRegisterEntry>)eDynamicGet(RiskPackage.RISK_REGISTER__ENTRIES, RiskPackage.Literals.RISK_REGISTER__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReportDate() {
		return (Date)eDynamicGet(RiskPackage.RISK_REGISTER__REPORT_DATE, RiskPackage.Literals.RISK_REGISTER__REPORT_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportDate(Date newReportDate) {
		eDynamicSet(RiskPackage.RISK_REGISTER__REPORT_DATE, RiskPackage.Literals.RISK_REGISTER__REPORT_DATE, newReportDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.RISK_REGISTER__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.RISK_REGISTER__ENTRIES:
				return getEntries();
			case RiskPackage.RISK_REGISTER__REPORT_DATE:
				return getReportDate();
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
			case RiskPackage.RISK_REGISTER__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends RiskRegisterEntry>)newValue);
				return;
			case RiskPackage.RISK_REGISTER__REPORT_DATE:
				setReportDate((Date)newValue);
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
			case RiskPackage.RISK_REGISTER__ENTRIES:
				getEntries().clear();
				return;
			case RiskPackage.RISK_REGISTER__REPORT_DATE:
				setReportDate(REPORT_DATE_EDEFAULT);
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
			case RiskPackage.RISK_REGISTER__ENTRIES:
				return !getEntries().isEmpty();
			case RiskPackage.RISK_REGISTER__REPORT_DATE:
				return REPORT_DATE_EDEFAULT == null ? getReportDate() != null : !REPORT_DATE_EDEFAULT.equals(getReportDate());
		}
		return super.eIsSet(featureID);
	}

} //RiskRegisterImpl
