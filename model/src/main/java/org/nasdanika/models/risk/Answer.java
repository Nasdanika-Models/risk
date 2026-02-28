/**
 */
package org.nasdanika.models.risk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An answer to a single question within a questionnaire response.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Answer#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Answer#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Answer#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Answer#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getAnswer()
 * @model
 * @generated
 */
public interface Answer extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The question being answered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(Question)
	 * @see org.nasdanika.models.risk.RiskPackage#getAnswer_Question()
	 * @model required="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Answer#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The answer value (text, selected option value, or numeric score as string).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getAnswer_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Answer#getValue <em>Value</em>}' attribute.
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
	 * Computed risk score contribution from this answer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getAnswer_Score()
	 * @model
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Answer#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional notes or justification provided by the respondent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getAnswer_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Answer#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

} // Answer
