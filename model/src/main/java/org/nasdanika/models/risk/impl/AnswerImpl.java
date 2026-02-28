/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.Answer;
import org.nasdanika.models.risk.Question;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.AnswerImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.AnswerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.AnswerImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.AnswerImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnswerImpl extends RiskModelElementImpl implements Answer {
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
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question getQuestion() {
		return (Question)eDynamicGet(RiskPackage.ANSWER__QUESTION, RiskPackage.Literals.ANSWER__QUESTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestion() {
		return (Question)eDynamicGet(RiskPackage.ANSWER__QUESTION, RiskPackage.Literals.ANSWER__QUESTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(Question newQuestion) {
		eDynamicSet(RiskPackage.ANSWER__QUESTION, RiskPackage.Literals.ANSWER__QUESTION, newQuestion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(RiskPackage.ANSWER__VALUE, RiskPackage.Literals.ANSWER__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(RiskPackage.ANSWER__VALUE, RiskPackage.Literals.ANSWER__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScore() {
		return (Double)eDynamicGet(RiskPackage.ANSWER__SCORE, RiskPackage.Literals.ANSWER__SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(double newScore) {
		eDynamicSet(RiskPackage.ANSWER__SCORE, RiskPackage.Literals.ANSWER__SCORE, newScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return (String)eDynamicGet(RiskPackage.ANSWER__NOTES, RiskPackage.Literals.ANSWER__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		eDynamicSet(RiskPackage.ANSWER__NOTES, RiskPackage.Literals.ANSWER__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.ANSWER__QUESTION:
				if (resolve) return getQuestion();
				return basicGetQuestion();
			case RiskPackage.ANSWER__VALUE:
				return getValue();
			case RiskPackage.ANSWER__SCORE:
				return getScore();
			case RiskPackage.ANSWER__NOTES:
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
			case RiskPackage.ANSWER__QUESTION:
				setQuestion((Question)newValue);
				return;
			case RiskPackage.ANSWER__VALUE:
				setValue((String)newValue);
				return;
			case RiskPackage.ANSWER__SCORE:
				setScore((Double)newValue);
				return;
			case RiskPackage.ANSWER__NOTES:
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
			case RiskPackage.ANSWER__QUESTION:
				setQuestion((Question)null);
				return;
			case RiskPackage.ANSWER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RiskPackage.ANSWER__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case RiskPackage.ANSWER__NOTES:
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
			case RiskPackage.ANSWER__QUESTION:
				return basicGetQuestion() != null;
			case RiskPackage.ANSWER__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case RiskPackage.ANSWER__SCORE:
				return getScore() != SCORE_EDEFAULT;
			case RiskPackage.ANSWER__NOTES:
				return NOTES_EDEFAULT == null ? getNotes() != null : !NOTES_EDEFAULT.equals(getNotes());
		}
		return super.eIsSet(featureID);
	}

} //AnswerImpl
