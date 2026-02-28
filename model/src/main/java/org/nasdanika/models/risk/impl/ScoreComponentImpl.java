/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.ScoreComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.ScoreComponentImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ScoreComponentImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ScoreComponentImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ScoreComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ScoreComponentImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreComponentImpl extends RiskModelElementImpl implements ScoreComponent {
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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

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
	protected ScoreComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.SCORE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScore() {
		return (Double)eDynamicGet(RiskPackage.SCORE_COMPONENT__SCORE, RiskPackage.Literals.SCORE_COMPONENT__SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(double newScore) {
		eDynamicSet(RiskPackage.SCORE_COMPONENT__SCORE, RiskPackage.Literals.SCORE_COMPONENT__SCORE, newScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eDynamicGet(RiskPackage.SCORE_COMPONENT__WEIGHT, RiskPackage.Literals.SCORE_COMPONENT__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(RiskPackage.SCORE_COMPONENT__WEIGHT, RiskPackage.Literals.SCORE_COMPONENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.SCORE_COMPONENT__LEVEL, RiskPackage.Literals.SCORE_COMPONENT__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.SCORE_COMPONENT__LEVEL, RiskPackage.Literals.SCORE_COMPONENT__LEVEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(RiskLevel newLevel) {
		eDynamicSet(RiskPackage.SCORE_COMPONENT__LEVEL, RiskPackage.Literals.SCORE_COMPONENT__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(RiskPackage.SCORE_COMPONENT__SOURCE, RiskPackage.Literals.SCORE_COMPONENT__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(RiskPackage.SCORE_COMPONENT__SOURCE, RiskPackage.Literals.SCORE_COMPONENT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return (String)eDynamicGet(RiskPackage.SCORE_COMPONENT__NOTES, RiskPackage.Literals.SCORE_COMPONENT__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		eDynamicSet(RiskPackage.SCORE_COMPONENT__NOTES, RiskPackage.Literals.SCORE_COMPONENT__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.SCORE_COMPONENT__SCORE:
				return getScore();
			case RiskPackage.SCORE_COMPONENT__WEIGHT:
				return getWeight();
			case RiskPackage.SCORE_COMPONENT__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
			case RiskPackage.SCORE_COMPONENT__SOURCE:
				return getSource();
			case RiskPackage.SCORE_COMPONENT__NOTES:
				return getNotes();
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
			case RiskPackage.SCORE_COMPONENT__SCORE:
				setScore((Double)newValue);
				return;
			case RiskPackage.SCORE_COMPONENT__WEIGHT:
				setWeight((Double)newValue);
				return;
			case RiskPackage.SCORE_COMPONENT__LEVEL:
				setLevel((RiskLevel)newValue);
				return;
			case RiskPackage.SCORE_COMPONENT__SOURCE:
				setSource((String)newValue);
				return;
			case RiskPackage.SCORE_COMPONENT__NOTES:
				setNotes((String)newValue);
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
			case RiskPackage.SCORE_COMPONENT__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case RiskPackage.SCORE_COMPONENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case RiskPackage.SCORE_COMPONENT__LEVEL:
				setLevel((RiskLevel)null);
				return;
			case RiskPackage.SCORE_COMPONENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case RiskPackage.SCORE_COMPONENT__NOTES:
				setNotes(NOTES_EDEFAULT);
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
			case RiskPackage.SCORE_COMPONENT__SCORE:
				return getScore() != SCORE_EDEFAULT;
			case RiskPackage.SCORE_COMPONENT__WEIGHT:
				return getWeight() != WEIGHT_EDEFAULT;
			case RiskPackage.SCORE_COMPONENT__LEVEL:
				return basicGetLevel() != null;
			case RiskPackage.SCORE_COMPONENT__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case RiskPackage.SCORE_COMPONENT__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
		}
		return super.eIsSet(featureID);
	}

} //ScoreComponentImpl
