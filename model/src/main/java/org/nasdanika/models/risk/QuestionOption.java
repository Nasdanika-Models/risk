/**
 */
package org.nasdanika.models.risk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A selectable option for a choice-type question in a risk assessment questionnaire.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.QuestionOption#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionOption#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.QuestionOption#getRiskLevel <em>Risk Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getQuestionOption()
 * @model
 * @generated
 */
public interface QuestionOption extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The machine-readable value stored when this option is selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionOption_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionOption#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numeric score contribution when this option is selected, used for risk scoring aggregation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionOption_Score()
	 * @model
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionOption#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk level implied by selecting this option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Level</em>' reference.
	 * @see #setRiskLevel(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionOption_RiskLevel()
	 * @model
	 * @generated
	 */
	RiskLevel getRiskLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.QuestionOption#getRiskLevel <em>Risk Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' reference.
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(RiskLevel value);

} // QuestionOption
