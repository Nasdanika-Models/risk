/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.QuestionOption;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionOptionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionOptionImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionOptionImpl#getRiskLevel <em>Risk Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionOptionImpl extends RiskModelElementImpl implements QuestionOption {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final double SCORE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.QUESTION_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(RiskPackage.QUESTION_OPTION__VALUE, RiskPackage.Literals.QUESTION_OPTION__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(RiskPackage.QUESTION_OPTION__VALUE, RiskPackage.Literals.QUESTION_OPTION__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScore() {
		return (Double)eDynamicGet(RiskPackage.QUESTION_OPTION__SCORE, RiskPackage.Literals.QUESTION_OPTION__SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(double newScore) {
		eDynamicSet(RiskPackage.QUESTION_OPTION__SCORE, RiskPackage.Literals.QUESTION_OPTION__SCORE, newScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getRiskLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.QUESTION_OPTION__RISK_LEVEL, RiskPackage.Literals.QUESTION_OPTION__RISK_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetRiskLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.QUESTION_OPTION__RISK_LEVEL, RiskPackage.Literals.QUESTION_OPTION__RISK_LEVEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskLevel(RiskLevel newRiskLevel) {
		eDynamicSet(RiskPackage.QUESTION_OPTION__RISK_LEVEL, RiskPackage.Literals.QUESTION_OPTION__RISK_LEVEL, newRiskLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.QUESTION_OPTION__VALUE:
				return getValue();
			case RiskPackage.QUESTION_OPTION__SCORE:
				return getScore();
			case RiskPackage.QUESTION_OPTION__RISK_LEVEL:
				if (resolve) return getRiskLevel();
				return basicGetRiskLevel();
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
			case RiskPackage.QUESTION_OPTION__VALUE:
				setValue((String)newValue);
				return;
			case RiskPackage.QUESTION_OPTION__SCORE:
				setScore((Double)newValue);
				return;
			case RiskPackage.QUESTION_OPTION__RISK_LEVEL:
				setRiskLevel((RiskLevel)newValue);
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
			case RiskPackage.QUESTION_OPTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RiskPackage.QUESTION_OPTION__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case RiskPackage.QUESTION_OPTION__RISK_LEVEL:
				setRiskLevel((RiskLevel)null);
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
			case RiskPackage.QUESTION_OPTION__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case RiskPackage.QUESTION_OPTION__SCORE:
				return getScore() != SCORE_EDEFAULT;
			case RiskPackage.QUESTION_OPTION__RISK_LEVEL:
				return basicGetRiskLevel() != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionOptionImpl
