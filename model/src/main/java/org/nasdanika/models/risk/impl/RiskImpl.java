/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.Risk;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskImpl#getRegulatoryReferences <em>Regulatory References</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskImpl#getRelatedRisks <em>Related Risks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskImpl extends RiskModelElementImpl implements Risk {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getTriggers() {
		return (EList<String>)eDynamicGet(RiskPackage.RISK__TRIGGERS, RiskPackage.Literals.RISK__TRIGGERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getConsequences() {
		return (EList<String>)eDynamicGet(RiskPackage.RISK__CONSEQUENCES, RiskPackage.Literals.RISK__CONSEQUENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRegulatoryReferences() {
		return (EList<String>)eDynamicGet(RiskPackage.RISK__REGULATORY_REFERENCES, RiskPackage.Literals.RISK__REGULATORY_REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRelatedRisks() {
		return (EList<Risk>)eDynamicGet(RiskPackage.RISK__RELATED_RISKS, RiskPackage.Literals.RISK__RELATED_RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.RISK__TRIGGERS:
				return getTriggers();
			case RiskPackage.RISK__CONSEQUENCES:
				return getConsequences();
			case RiskPackage.RISK__REGULATORY_REFERENCES:
				return getRegulatoryReferences();
			case RiskPackage.RISK__RELATED_RISKS:
				return getRelatedRisks();
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
			case RiskPackage.RISK__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends String>)newValue);
				return;
			case RiskPackage.RISK__CONSEQUENCES:
				getConsequences().clear();
				getConsequences().addAll((Collection<? extends String>)newValue);
				return;
			case RiskPackage.RISK__REGULATORY_REFERENCES:
				getRegulatoryReferences().clear();
				getRegulatoryReferences().addAll((Collection<? extends String>)newValue);
				return;
			case RiskPackage.RISK__RELATED_RISKS:
				getRelatedRisks().clear();
				getRelatedRisks().addAll((Collection<? extends Risk>)newValue);
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
			case RiskPackage.RISK__TRIGGERS:
				getTriggers().clear();
				return;
			case RiskPackage.RISK__CONSEQUENCES:
				getConsequences().clear();
				return;
			case RiskPackage.RISK__REGULATORY_REFERENCES:
				getRegulatoryReferences().clear();
				return;
			case RiskPackage.RISK__RELATED_RISKS:
				getRelatedRisks().clear();
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
			case RiskPackage.RISK__TRIGGERS:
				return !getTriggers().isEmpty();
			case RiskPackage.RISK__CONSEQUENCES:
				return !getConsequences().isEmpty();
			case RiskPackage.RISK__REGULATORY_REFERENCES:
				return !getRegulatoryReferences().isEmpty();
			case RiskPackage.RISK__RELATED_RISKS:
				return !getRelatedRisks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskImpl
