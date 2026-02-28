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

import org.nasdanika.models.risk.Control;
import org.nasdanika.models.risk.Finding;
import org.nasdanika.models.risk.IdentifiedRisk;
import org.nasdanika.models.risk.Risk;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.RiskStatus;
import org.nasdanika.models.risk.RiskTreatment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getInherentScore <em>Inherent Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getResidualScore <em>Residual Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getResidualLevel <em>Residual Level</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedRiskImpl extends RiskModelElementImpl implements IdentifiedRisk {
	/**
	 * The default value of the '{@link #getInherentScore() <em>Inherent Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherentScore()
	 * @generated
	 * @ordered
	 */
	protected static final double INHERENT_SCORE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getResidualScore() <em>Residual Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidualScore()
	 * @generated
	 * @ordered
	 */
	protected static final double RESIDUAL_SCORE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RiskStatus STATUS_EDEFAULT = RiskStatus.OPEN;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

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
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiedRiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.IDENTIFIED_RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Risk getRisk() {
		return (Risk)eDynamicGet(RiskPackage.IDENTIFIED_RISK__RISK, RiskPackage.Literals.IDENTIFIED_RISK__RISK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk basicGetRisk() {
		return (Risk)eDynamicGet(RiskPackage.IDENTIFIED_RISK__RISK, RiskPackage.Literals.IDENTIFIED_RISK__RISK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRisk(Risk newRisk) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__RISK, RiskPackage.Literals.IDENTIFIED_RISK__RISK, newRisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getLikelihood() {
		return (RiskLevel)eDynamicGet(RiskPackage.IDENTIFIED_RISK__LIKELIHOOD, RiskPackage.Literals.IDENTIFIED_RISK__LIKELIHOOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetLikelihood() {
		return (RiskLevel)eDynamicGet(RiskPackage.IDENTIFIED_RISK__LIKELIHOOD, RiskPackage.Literals.IDENTIFIED_RISK__LIKELIHOOD, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(RiskLevel newLikelihood) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__LIKELIHOOD, RiskPackage.Literals.IDENTIFIED_RISK__LIKELIHOOD, newLikelihood);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getImpact() {
		return (RiskLevel)eDynamicGet(RiskPackage.IDENTIFIED_RISK__IMPACT, RiskPackage.Literals.IDENTIFIED_RISK__IMPACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetImpact() {
		return (RiskLevel)eDynamicGet(RiskPackage.IDENTIFIED_RISK__IMPACT, RiskPackage.Literals.IDENTIFIED_RISK__IMPACT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpact(RiskLevel newImpact) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__IMPACT, RiskPackage.Literals.IDENTIFIED_RISK__IMPACT, newImpact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInherentScore() {
		return (Double)eDynamicGet(RiskPackage.IDENTIFIED_RISK__INHERENT_SCORE, RiskPackage.Literals.IDENTIFIED_RISK__INHERENT_SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInherentScore(double newInherentScore) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__INHERENT_SCORE, RiskPackage.Literals.IDENTIFIED_RISK__INHERENT_SCORE, newInherentScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getResidualScore() {
		return (Double)eDynamicGet(RiskPackage.IDENTIFIED_RISK__RESIDUAL_SCORE, RiskPackage.Literals.IDENTIFIED_RISK__RESIDUAL_SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidualScore(double newResidualScore) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__RESIDUAL_SCORE, RiskPackage.Literals.IDENTIFIED_RISK__RESIDUAL_SCORE, newResidualScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getResidualLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL, RiskPackage.Literals.IDENTIFIED_RISK__RESIDUAL_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetResidualLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL, RiskPackage.Literals.IDENTIFIED_RISK__RESIDUAL_LEVEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidualLevel(RiskLevel newResidualLevel) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL, RiskPackage.Literals.IDENTIFIED_RISK__RESIDUAL_LEVEL, newResidualLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskStatus getStatus() {
		return (RiskStatus)eDynamicGet(RiskPackage.IDENTIFIED_RISK__STATUS, RiskPackage.Literals.IDENTIFIED_RISK__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(RiskStatus newStatus) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__STATUS, RiskPackage.Literals.IDENTIFIED_RISK__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwner() {
		return (String)eDynamicGet(RiskPackage.IDENTIFIED_RISK__OWNER, RiskPackage.Literals.IDENTIFIED_RISK__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(String newOwner) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__OWNER, RiskPackage.Literals.IDENTIFIED_RISK__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eDynamicGet(RiskPackage.IDENTIFIED_RISK__DUE_DATE, RiskPackage.Literals.IDENTIFIED_RISK__DUE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__DUE_DATE, RiskPackage.Literals.IDENTIFIED_RISK__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return (String)eDynamicGet(RiskPackage.IDENTIFIED_RISK__NOTES, RiskPackage.Literals.IDENTIFIED_RISK__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__NOTES, RiskPackage.Literals.IDENTIFIED_RISK__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskTreatment getTreatment() {
		return (RiskTreatment)eDynamicGet(RiskPackage.IDENTIFIED_RISK__TREATMENT, RiskPackage.Literals.IDENTIFIED_RISK__TREATMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreatment(RiskTreatment newTreatment, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTreatment, RiskPackage.IDENTIFIED_RISK__TREATMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreatment(RiskTreatment newTreatment) {
		eDynamicSet(RiskPackage.IDENTIFIED_RISK__TREATMENT, RiskPackage.Literals.IDENTIFIED_RISK__TREATMENT, newTreatment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Control> getControls() {
		return (EList<Control>)eDynamicGet(RiskPackage.IDENTIFIED_RISK__CONTROLS, RiskPackage.Literals.IDENTIFIED_RISK__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Finding> getFindings() {
		return (EList<Finding>)eDynamicGet(RiskPackage.IDENTIFIED_RISK__FINDINGS, RiskPackage.Literals.IDENTIFIED_RISK__FINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.IDENTIFIED_RISK__TREATMENT:
				return basicSetTreatment(null, msgs);
			case RiskPackage.IDENTIFIED_RISK__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.IDENTIFIED_RISK__RISK:
				if (resolve) return getRisk();
				return basicGetRisk();
			case RiskPackage.IDENTIFIED_RISK__LIKELIHOOD:
				if (resolve) return getLikelihood();
				return basicGetLikelihood();
			case RiskPackage.IDENTIFIED_RISK__IMPACT:
				if (resolve) return getImpact();
				return basicGetImpact();
			case RiskPackage.IDENTIFIED_RISK__INHERENT_SCORE:
				return getInherentScore();
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_SCORE:
				return getResidualScore();
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL:
				if (resolve) return getResidualLevel();
				return basicGetResidualLevel();
			case RiskPackage.IDENTIFIED_RISK__STATUS:
				return getStatus();
			case RiskPackage.IDENTIFIED_RISK__OWNER:
				return getOwner();
			case RiskPackage.IDENTIFIED_RISK__DUE_DATE:
				return getDueDate();
			case RiskPackage.IDENTIFIED_RISK__NOTES:
				return getNotes();
			case RiskPackage.IDENTIFIED_RISK__TREATMENT:
				return getTreatment();
			case RiskPackage.IDENTIFIED_RISK__CONTROLS:
				return getControls();
			case RiskPackage.IDENTIFIED_RISK__FINDINGS:
				return getFindings();
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
			case RiskPackage.IDENTIFIED_RISK__RISK:
				setRisk((Risk)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__LIKELIHOOD:
				setLikelihood((RiskLevel)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__IMPACT:
				setImpact((RiskLevel)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__INHERENT_SCORE:
				setInherentScore((Double)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_SCORE:
				setResidualScore((Double)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL:
				setResidualLevel((RiskLevel)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__STATUS:
				setStatus((RiskStatus)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__OWNER:
				setOwner((String)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__NOTES:
				setNotes((String)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__TREATMENT:
				setTreatment((RiskTreatment)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case RiskPackage.IDENTIFIED_RISK__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Finding>)newValue);
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
			case RiskPackage.IDENTIFIED_RISK__RISK:
				setRisk((Risk)null);
				return;
			case RiskPackage.IDENTIFIED_RISK__LIKELIHOOD:
				setLikelihood((RiskLevel)null);
				return;
			case RiskPackage.IDENTIFIED_RISK__IMPACT:
				setImpact((RiskLevel)null);
				return;
			case RiskPackage.IDENTIFIED_RISK__INHERENT_SCORE:
				setInherentScore(INHERENT_SCORE_EDEFAULT);
				return;
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_SCORE:
				setResidualScore(RESIDUAL_SCORE_EDEFAULT);
				return;
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL:
				setResidualLevel((RiskLevel)null);
				return;
			case RiskPackage.IDENTIFIED_RISK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RiskPackage.IDENTIFIED_RISK__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case RiskPackage.IDENTIFIED_RISK__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case RiskPackage.IDENTIFIED_RISK__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case RiskPackage.IDENTIFIED_RISK__TREATMENT:
				setTreatment((RiskTreatment)null);
				return;
			case RiskPackage.IDENTIFIED_RISK__CONTROLS:
				getControls().clear();
				return;
			case RiskPackage.IDENTIFIED_RISK__FINDINGS:
				getFindings().clear();
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
			case RiskPackage.IDENTIFIED_RISK__RISK:
				return basicGetRisk() != null;
			case RiskPackage.IDENTIFIED_RISK__LIKELIHOOD:
				return basicGetLikelihood() != null;
			case RiskPackage.IDENTIFIED_RISK__IMPACT:
				return basicGetImpact() != null;
			case RiskPackage.IDENTIFIED_RISK__INHERENT_SCORE:
				return getInherentScore() != INHERENT_SCORE_EDEFAULT;
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_SCORE:
				return getResidualScore() != RESIDUAL_SCORE_EDEFAULT;
			case RiskPackage.IDENTIFIED_RISK__RESIDUAL_LEVEL:
				return basicGetResidualLevel() != null;
			case RiskPackage.IDENTIFIED_RISK__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RiskPackage.IDENTIFIED_RISK__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case RiskPackage.IDENTIFIED_RISK__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case RiskPackage.IDENTIFIED_RISK__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
			case RiskPackage.IDENTIFIED_RISK__TREATMENT:
				return getTreatment() != null;
			case RiskPackage.IDENTIFIED_RISK__CONTROLS:
				return !getControls().isEmpty();
			case RiskPackage.IDENTIFIED_RISK__FINDINGS:
				return !getFindings().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IdentifiedRiskImpl
