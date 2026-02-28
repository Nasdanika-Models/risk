/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.Question;
import org.nasdanika.models.risk.QuestionOption;
import org.nasdanika.models.risk.QuestionType;
import org.nasdanika.models.risk.RiskCategory;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#getRiskCategory <em>Risk Category</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends RiskModelElementImpl implements Question {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QuestionType TYPE_EDEFAULT = QuestionType.YES_NO;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGuidance() <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected static final String GUIDANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionType getType() {
		return (QuestionType)eDynamicGet(RiskPackage.QUESTION__TYPE, RiskPackage.Literals.QUESTION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(QuestionType newType) {
		eDynamicSet(RiskPackage.QUESTION__TYPE, RiskPackage.Literals.QUESTION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return (Boolean)eDynamicGet(RiskPackage.QUESTION__REQUIRED, RiskPackage.Literals.QUESTION__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		eDynamicSet(RiskPackage.QUESTION__REQUIRED, RiskPackage.Literals.QUESTION__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return (String)eDynamicGet(RiskPackage.QUESTION__CATEGORY, RiskPackage.Literals.QUESTION__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		eDynamicSet(RiskPackage.QUESTION__CATEGORY, RiskPackage.Literals.QUESTION__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuidance() {
		return (String)eDynamicGet(RiskPackage.QUESTION__GUIDANCE, RiskPackage.Literals.QUESTION__GUIDANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuidance(String newGuidance) {
		eDynamicSet(RiskPackage.QUESTION__GUIDANCE, RiskPackage.Literals.QUESTION__GUIDANCE, newGuidance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eDynamicGet(RiskPackage.QUESTION__WEIGHT, RiskPackage.Literals.QUESTION__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(RiskPackage.QUESTION__WEIGHT, RiskPackage.Literals.QUESTION__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskCategory getRiskCategory() {
		return (RiskCategory)eDynamicGet(RiskPackage.QUESTION__RISK_CATEGORY, RiskPackage.Literals.QUESTION__RISK_CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskCategory basicGetRiskCategory() {
		return (RiskCategory)eDynamicGet(RiskPackage.QUESTION__RISK_CATEGORY, RiskPackage.Literals.QUESTION__RISK_CATEGORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskCategory(RiskCategory newRiskCategory) {
		eDynamicSet(RiskPackage.QUESTION__RISK_CATEGORY, RiskPackage.Literals.QUESTION__RISK_CATEGORY, newRiskCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<QuestionOption> getOptions() {
		return (EList<QuestionOption>)eDynamicGet(RiskPackage.QUESTION__OPTIONS, RiskPackage.Literals.QUESTION__OPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.QUESTION__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.QUESTION__TYPE:
				return getType();
			case RiskPackage.QUESTION__REQUIRED:
				return isRequired();
			case RiskPackage.QUESTION__CATEGORY:
				return getCategory();
			case RiskPackage.QUESTION__GUIDANCE:
				return getGuidance();
			case RiskPackage.QUESTION__WEIGHT:
				return getWeight();
			case RiskPackage.QUESTION__RISK_CATEGORY:
				if (resolve) return getRiskCategory();
				return basicGetRiskCategory();
			case RiskPackage.QUESTION__OPTIONS:
				return getOptions();
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
			case RiskPackage.QUESTION__TYPE:
				setType((QuestionType)newValue);
				return;
			case RiskPackage.QUESTION__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case RiskPackage.QUESTION__CATEGORY:
				setCategory((String)newValue);
				return;
			case RiskPackage.QUESTION__GUIDANCE:
				setGuidance((String)newValue);
				return;
			case RiskPackage.QUESTION__WEIGHT:
				setWeight((Double)newValue);
				return;
			case RiskPackage.QUESTION__RISK_CATEGORY:
				setRiskCategory((RiskCategory)newValue);
				return;
			case RiskPackage.QUESTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends QuestionOption>)newValue);
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
			case RiskPackage.QUESTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RiskPackage.QUESTION__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case RiskPackage.QUESTION__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case RiskPackage.QUESTION__GUIDANCE:
				setGuidance(GUIDANCE_EDEFAULT);
				return;
			case RiskPackage.QUESTION__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case RiskPackage.QUESTION__RISK_CATEGORY:
				setRiskCategory((RiskCategory)null);
				return;
			case RiskPackage.QUESTION__OPTIONS:
				getOptions().clear();
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
			case RiskPackage.QUESTION__TYPE:
				return getType() != TYPE_EDEFAULT;
			case RiskPackage.QUESTION__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case RiskPackage.QUESTION__CATEGORY:
				return CATEGORY_EDEFAULT == null ? getCategory() != null : !CATEGORY_EDEFAULT.equals(getCategory());
			case RiskPackage.QUESTION__GUIDANCE:
				return GUIDANCE_EDEFAULT == null ? getGuidance() != null : !GUIDANCE_EDEFAULT.equals(getGuidance());
			case RiskPackage.QUESTION__WEIGHT:
				return getWeight() != WEIGHT_EDEFAULT;
			case RiskPackage.QUESTION__RISK_CATEGORY:
				return basicGetRiskCategory() != null;
			case RiskPackage.QUESTION__OPTIONS:
				return !getOptions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionImpl
