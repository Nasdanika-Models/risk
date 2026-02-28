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

import org.nasdanika.models.risk.Answer;
import org.nasdanika.models.risk.Questionnaire;
import org.nasdanika.models.risk.QuestionnaireResponse;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl#getResponseDate <em>Response Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl#getRespondent <em>Respondent</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl#getTotalScore <em>Total Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseImpl extends RiskModelElementImpl implements QuestionnaireResponse {
	/**
	 * The default value of the '{@link #getResponseDate() <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESPONSE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRespondent() <em>Respondent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondent()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONDENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTotalScore() <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalScore()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_SCORE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.QUESTIONNAIRE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire getQuestionnaire() {
		return (Questionnaire)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire basicGetQuestionnaire() {
		return (Questionnaire)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, newQuestionnaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResponseDate() {
		return (Date)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseDate(Date newResponseDate) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE, newResponseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRespondent() {
		return (String)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONDENT, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__RESPONDENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRespondent(String newRespondent) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONDENT, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__RESPONDENT, newRespondent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Answer> getAnswers() {
		return (EList<Answer>)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__ANSWERS, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__ANSWERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalScore() {
		return (Double)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalScore(double newTotalScore) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE, newTotalScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetLevel() {
		return (RiskLevel)eDynamicGet(RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__LEVEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(RiskLevel newLevel) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL, RiskPackage.Literals.QUESTIONNAIRE_RESPONSE__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.QUESTIONNAIRE_RESPONSE__ANSWERS:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				if (resolve) return getQuestionnaire();
				return basicGetQuestionnaire();
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE:
				return getResponseDate();
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONDENT:
				return getRespondent();
			case RiskPackage.QUESTIONNAIRE_RESPONSE__ANSWERS:
				return getAnswers();
			case RiskPackage.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE:
				return getTotalScore();
			case RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
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
			case RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE:
				setResponseDate((Date)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONDENT:
				setRespondent((String)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends Answer>)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE:
				setTotalScore((Double)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL:
				setLevel((RiskLevel)newValue);
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
			case RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE:
				setResponseDate(RESPONSE_DATE_EDEFAULT);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONDENT:
				setRespondent(RESPONDENT_EDEFAULT);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__ANSWERS:
				getAnswers().clear();
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE:
				setTotalScore(TOTAL_SCORE_EDEFAULT);
				return;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL:
				setLevel((RiskLevel)null);
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
			case RiskPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return basicGetQuestionnaire() != null;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONSE_DATE:
				return RESPONSE_DATE_EDEFAULT == null ? getResponseDate() != null : !RESPONSE_DATE_EDEFAULT.equals(getResponseDate());
			case RiskPackage.QUESTIONNAIRE_RESPONSE__RESPONDENT:
				return RESPONDENT_EDEFAULT == null ? getRespondent() != null : !RESPONDENT_EDEFAULT.equals(getRespondent());
			case RiskPackage.QUESTIONNAIRE_RESPONSE__ANSWERS:
				return !getAnswers().isEmpty();
			case RiskPackage.QUESTIONNAIRE_RESPONSE__TOTAL_SCORE:
				return getTotalScore() != TOTAL_SCORE_EDEFAULT;
			case RiskPackage.QUESTIONNAIRE_RESPONSE__LEVEL:
				return basicGetLevel() != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseImpl
