/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.Control;
import org.nasdanika.models.risk.ControlCategory;
import org.nasdanika.models.risk.ControlEffectiveness;
import org.nasdanika.models.risk.ControlType;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#getEffectiveness <em>Effectiveness</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#isAutomated <em>Automated</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ControlImpl#getEvidenceUrl <em>Evidence Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends RiskModelElementImpl implements Control {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ControlType TYPE_EDEFAULT = ControlType.PREVENTIVE;

	/**
	 * The default value of the '{@link #getEffectiveness() <em>Effectiveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveness()
	 * @generated
	 * @ordered
	 */
	protected static final ControlEffectiveness EFFECTIVENESS_EDEFAULT = ControlEffectiveness.HIGH;

	/**
	 * The default value of the '{@link #isAutomated() <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATED_EDEFAULT = false;

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
	 * The default value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVIEW_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEvidenceUrl() <em>Evidence Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String EVIDENCE_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlCategory getCategory() {
		return (ControlCategory)eDynamicGet(RiskPackage.CONTROL__CATEGORY, RiskPackage.Literals.CONTROL__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCategory basicGetCategory() {
		return (ControlCategory)eDynamicGet(RiskPackage.CONTROL__CATEGORY, RiskPackage.Literals.CONTROL__CATEGORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(ControlCategory newCategory) {
		eDynamicSet(RiskPackage.CONTROL__CATEGORY, RiskPackage.Literals.CONTROL__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlType getType() {
		return (ControlType)eDynamicGet(RiskPackage.CONTROL__TYPE, RiskPackage.Literals.CONTROL__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ControlType newType) {
		eDynamicSet(RiskPackage.CONTROL__TYPE, RiskPackage.Literals.CONTROL__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlEffectiveness getEffectiveness() {
		return (ControlEffectiveness)eDynamicGet(RiskPackage.CONTROL__EFFECTIVENESS, RiskPackage.Literals.CONTROL__EFFECTIVENESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveness(ControlEffectiveness newEffectiveness) {
		eDynamicSet(RiskPackage.CONTROL__EFFECTIVENESS, RiskPackage.Literals.CONTROL__EFFECTIVENESS, newEffectiveness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomated() {
		return (Boolean)eDynamicGet(RiskPackage.CONTROL__AUTOMATED, RiskPackage.Literals.CONTROL__AUTOMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomated(boolean newAutomated) {
		eDynamicSet(RiskPackage.CONTROL__AUTOMATED, RiskPackage.Literals.CONTROL__AUTOMATED, newAutomated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwner() {
		return (String)eDynamicGet(RiskPackage.CONTROL__OWNER, RiskPackage.Literals.CONTROL__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(String newOwner) {
		eDynamicSet(RiskPackage.CONTROL__OWNER, RiskPackage.Literals.CONTROL__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReviewDate() {
		return (Date)eDynamicGet(RiskPackage.CONTROL__REVIEW_DATE, RiskPackage.Literals.CONTROL__REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(Date newReviewDate) {
		eDynamicSet(RiskPackage.CONTROL__REVIEW_DATE, RiskPackage.Literals.CONTROL__REVIEW_DATE, newReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvidenceUrl() {
		return (String)eDynamicGet(RiskPackage.CONTROL__EVIDENCE_URL, RiskPackage.Literals.CONTROL__EVIDENCE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvidenceUrl(String newEvidenceUrl) {
		eDynamicSet(RiskPackage.CONTROL__EVIDENCE_URL, RiskPackage.Literals.CONTROL__EVIDENCE_URL, newEvidenceUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.CONTROL__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case RiskPackage.CONTROL__TYPE:
				return getType();
			case RiskPackage.CONTROL__EFFECTIVENESS:
				return getEffectiveness();
			case RiskPackage.CONTROL__AUTOMATED:
				return isAutomated();
			case RiskPackage.CONTROL__OWNER:
				return getOwner();
			case RiskPackage.CONTROL__REVIEW_DATE:
				return getReviewDate();
			case RiskPackage.CONTROL__EVIDENCE_URL:
				return getEvidenceUrl();
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
			case RiskPackage.CONTROL__CATEGORY:
				setCategory((ControlCategory)newValue);
				return;
			case RiskPackage.CONTROL__TYPE:
				setType((ControlType)newValue);
				return;
			case RiskPackage.CONTROL__EFFECTIVENESS:
				setEffectiveness((ControlEffectiveness)newValue);
				return;
			case RiskPackage.CONTROL__AUTOMATED:
				setAutomated((Boolean)newValue);
				return;
			case RiskPackage.CONTROL__OWNER:
				setOwner((String)newValue);
				return;
			case RiskPackage.CONTROL__REVIEW_DATE:
				setReviewDate((Date)newValue);
				return;
			case RiskPackage.CONTROL__EVIDENCE_URL:
				setEvidenceUrl((String)newValue);
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
			case RiskPackage.CONTROL__CATEGORY:
				setCategory((ControlCategory)null);
				return;
			case RiskPackage.CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RiskPackage.CONTROL__EFFECTIVENESS:
				setEffectiveness(EFFECTIVENESS_EDEFAULT);
				return;
			case RiskPackage.CONTROL__AUTOMATED:
				setAutomated(AUTOMATED_EDEFAULT);
				return;
			case RiskPackage.CONTROL__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case RiskPackage.CONTROL__REVIEW_DATE:
				setReviewDate(REVIEW_DATE_EDEFAULT);
				return;
			case RiskPackage.CONTROL__EVIDENCE_URL:
				setEvidenceUrl(EVIDENCE_URL_EDEFAULT);
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
			case RiskPackage.CONTROL__CATEGORY:
				return basicGetCategory() != null;
			case RiskPackage.CONTROL__TYPE:
				return getType() != TYPE_EDEFAULT;
			case RiskPackage.CONTROL__EFFECTIVENESS:
				return getEffectiveness() != EFFECTIVENESS_EDEFAULT;
			case RiskPackage.CONTROL__AUTOMATED:
				return isAutomated() != AUTOMATED_EDEFAULT;
			case RiskPackage.CONTROL__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case RiskPackage.CONTROL__REVIEW_DATE:
				return REVIEW_DATE_EDEFAULT == null ? getReviewDate() != null : !REVIEW_DATE_EDEFAULT.equals(getReviewDate());
			case RiskPackage.CONTROL__EVIDENCE_URL:
				return EVIDENCE_URL_EDEFAULT == null ? getEvidenceUrl() != null : !EVIDENCE_URL_EDEFAULT.equals(getEvidenceUrl());
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
