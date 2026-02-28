/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A completed response to a questionnaire for a specific Risk Assessable Unit. The response is linked back to the questionnaire used and contains answers to all applicable questions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionnaireResponse#getResponseDate <em>Response Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionnaireResponse#getRespondent <em>Respondent</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionnaireResponse#getAnswers <em>Answers</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionnaireResponse#getTotalScore <em>Total Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionnaireResponse#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse()
 * @model
 * @generated
 */
public interface QuestionnaireResponse extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The questionnaire that was completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse_Questionnaire()
	 * @model required="true"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this questionnaire was completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Date</em>' attribute.
	 * @see #setResponseDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse_ResponseDate()
	 * @model
	 * @generated
	 */
	Date getResponseDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionnaireResponse#getResponseDate <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Date</em>' attribute.
	 * @see #getResponseDate()
	 * @generated
	 */
	void setResponseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Respondent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name or identifier of the person who completed this questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Respondent</em>' attribute.
	 * @see #setRespondent(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse_Respondent()
	 * @model
	 * @generated
	 */
	String getRespondent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionnaireResponse#getRespondent <em>Respondent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Respondent</em>' attribute.
	 * @see #getRespondent()
	 * @generated
	 */
	void setRespondent(String value);

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Answers to individual questions in the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

	/**
	 * Returns the value of the '<em><b>Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aggregated risk score computed from all weighted answers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Score</em>' attribute.
	 * @see #setTotalScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse_TotalScore()
	 * @model
	 * @generated
	 */
	double getTotalScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionnaireResponse#getTotalScore <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Score</em>' attribute.
	 * @see #getTotalScore()
	 * @generated
	 */
	void setTotalScore(double value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall risk level derived from the questionnaire total score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaireResponse_Level()
	 * @model
	 * @generated
	 */
	RiskLevel getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionnaireResponse#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(RiskLevel value);

} // QuestionnaireResponse
