/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions used to gather information for a risk assessment. Questionnaires may contain hundreds of questions covering topics like public cloud use, AI adoption, data classification, third-party dependencies, and security controls. Different questionnaires may apply to different types of products or change triggers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Questionnaire#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Questionnaire#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Questionnaire#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version identifier for this questionnaire (e.g., 2.1, 2024-Q1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaire_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Questionnaire#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of when/where this questionnaire applies (e.g., all new products, products using public cloud, AI-enabled features).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' attribute.
	 * @see #setApplicability(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaire_Applicability()
	 * @model
	 * @generated
	 */
	String getApplicability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Questionnaire#getApplicability <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' attribute.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(String value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of questions in this questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getQuestionnaire_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

} // Questionnaire
