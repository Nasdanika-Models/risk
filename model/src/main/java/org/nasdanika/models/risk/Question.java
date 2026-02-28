/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A question in a risk assessment questionnaire. Questions can address topics such as cloud usage, AI adoption, data classification, third-party dependencies, and security controls.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Question#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Question#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Question#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Question#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Question#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Question#getRiskCategory <em>Risk Category</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Question#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.QuestionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of question (determines the expected answer format).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.QuestionType
	 * @see #setType(QuestionType)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_Type()
	 * @model
	 * @generated
	 */
	QuestionType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Question#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.QuestionType
	 * @see #getType()
	 * @generated
	 */
	void setType(QuestionType value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this question must be answered for a questionnaire response to be complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Question#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grouping category within the questionnaire (e.g., Cloud, AI, Data, Third-Party, Security).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Question#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidance text to help respondents understand what is being asked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guidance</em>' attribute.
	 * @see #setGuidance(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_Guidance()
	 * @model
	 * @generated
	 */
	String getGuidance();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Question#getGuidance <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance</em>' attribute.
	 * @see #getGuidance()
	 * @generated
	 */
	void setGuidance(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weight of this question in the overall questionnaire score calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Question#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Risk Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk category this question primarily addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Category</em>' reference.
	 * @see #setRiskCategory(RiskCategory)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_RiskCategory()
	 * @model
	 * @generated
	 */
	RiskCategory getRiskCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Question#getRiskCategory <em>Risk Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Category</em>' reference.
	 * @see #getRiskCategory()
	 * @generated
	 */
	void setRiskCategory(RiskCategory value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.QuestionOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selectable options for choice-type questions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestion_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionOption> getOptions();

} // Question
