/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskLevelImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskLevelImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskLevelImpl extends RiskModelElementImpl implements RiskLevel {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScore() {
		return (Double)eDynamicGet(RiskPackage.RISK_LEVEL__SCORE, RiskPackage.Literals.RISK_LEVEL__SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(double newScore) {
		eDynamicSet(RiskPackage.RISK_LEVEL__SCORE, RiskPackage.Literals.RISK_LEVEL__SCORE, newScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return (String)eDynamicGet(RiskPackage.RISK_LEVEL__COLOR, RiskPackage.Literals.RISK_LEVEL__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(RiskPackage.RISK_LEVEL__COLOR, RiskPackage.Literals.RISK_LEVEL__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.RISK_LEVEL__SCORE:
				return getScore();
			case RiskPackage.RISK_LEVEL__COLOR:
				return getColor();
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
			case RiskPackage.RISK_LEVEL__SCORE:
				setScore((Double)newValue);
				return;
			case RiskPackage.RISK_LEVEL__COLOR:
				setColor((String)newValue);
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
			case RiskPackage.RISK_LEVEL__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case RiskPackage.RISK_LEVEL__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case RiskPackage.RISK_LEVEL__SCORE:
				return getScore() != SCORE_EDEFAULT;
			case RiskPackage.RISK_LEVEL__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
		}
		return super.eIsSet(featureID);
	}

} //RiskLevelImpl
