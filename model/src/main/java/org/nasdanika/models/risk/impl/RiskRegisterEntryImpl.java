/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.IdentifiedRisk;
import org.nasdanika.models.risk.RiskAssessableUnit;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.RiskRegisterEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskRegisterEntryImpl#getRiskAssessableUnit <em>Risk Assessable Unit</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskRegisterEntryImpl#getIdentifiedRisk <em>Identified Risk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskRegisterEntryImpl extends RiskModelElementImpl implements RiskRegisterEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskRegisterEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_REGISTER_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessableUnit getRiskAssessableUnit() {
		return (RiskAssessableUnit)eDynamicGet(RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT, RiskPackage.Literals.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessableUnit basicGetRiskAssessableUnit() {
		return (RiskAssessableUnit)eDynamicGet(RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT, RiskPackage.Literals.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskAssessableUnit(RiskAssessableUnit newRiskAssessableUnit) {
		eDynamicSet(RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT, RiskPackage.Literals.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT, newRiskAssessableUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiedRisk getIdentifiedRisk() {
		return (IdentifiedRisk)eDynamicGet(RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK, RiskPackage.Literals.RISK_REGISTER_ENTRY__IDENTIFIED_RISK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedRisk basicGetIdentifiedRisk() {
		return (IdentifiedRisk)eDynamicGet(RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK, RiskPackage.Literals.RISK_REGISTER_ENTRY__IDENTIFIED_RISK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiedRisk(IdentifiedRisk newIdentifiedRisk) {
		eDynamicSet(RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK, RiskPackage.Literals.RISK_REGISTER_ENTRY__IDENTIFIED_RISK, newIdentifiedRisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT:
				if (resolve) return getRiskAssessableUnit();
				return basicGetRiskAssessableUnit();
			case RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK:
				if (resolve) return getIdentifiedRisk();
				return basicGetIdentifiedRisk();
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
			case RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT:
				setRiskAssessableUnit((RiskAssessableUnit)newValue);
				return;
			case RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK:
				setIdentifiedRisk((IdentifiedRisk)newValue);
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
			case RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT:
				setRiskAssessableUnit((RiskAssessableUnit)null);
				return;
			case RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK:
				setIdentifiedRisk((IdentifiedRisk)null);
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
			case RiskPackage.RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT:
				return basicGetRiskAssessableUnit() != null;
			case RiskPackage.RISK_REGISTER_ENTRY__IDENTIFIED_RISK:
				return basicGetIdentifiedRisk() != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskRegisterEntryImpl
