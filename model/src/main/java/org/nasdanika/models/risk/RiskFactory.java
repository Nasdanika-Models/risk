/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.risk.RiskPackage
 * @generated
 */
public interface RiskFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiskFactory eINSTANCE = org.nasdanika.models.risk.impl.RiskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level</em>'.
	 * @generated
	 */
	RiskLevel createRiskLevel();

	/**
	 * Returns a new object of class '<em>Control Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Category</em>'.
	 * @generated
	 */
	ControlCategory createControlCategory();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	RiskCategory createRiskCategory();

	/**
	 * Returns a new object of class '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk</em>'.
	 * @generated
	 */
	Risk createRisk();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	Control createControl();

	/**
	 * Returns a new object of class '<em>Question Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Option</em>'.
	 * @generated
	 */
	QuestionOption createQuestionOption();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns a new object of class '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response</em>'.
	 * @generated
	 */
	QuestionnaireResponse createQuestionnaireResponse();

	/**
	 * Returns a new object of class '<em>Score Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score Component</em>'.
	 * @generated
	 */
	ScoreComponent createScoreComponent();

	/**
	 * Returns a new object of class '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding</em>'.
	 * @generated
	 */
	Finding createFinding();

	/**
	 * Returns a new object of class '<em>Treatment Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treatment Action</em>'.
	 * @generated
	 */
	TreatmentAction createTreatmentAction();

	/**
	 * Returns a new object of class '<em>Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treatment</em>'.
	 * @generated
	 */
	RiskTreatment createRiskTreatment();

	/**
	 * Returns a new object of class '<em>Identified Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identified Risk</em>'.
	 * @generated
	 */
	IdentifiedRisk createIdentifiedRisk();

	/**
	 * Returns a new object of class '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment</em>'.
	 * @generated
	 */
	RiskAssessment createRiskAssessment();

	/**
	 * Returns a new object of class '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Pair</em>'.
	 * @generated
	 */
	KeyValuePair createKeyValuePair();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Event</em>'.
	 * @generated
	 */
	ChangeEvent createChangeEvent();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Product Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Component</em>'.
	 * @generated
	 */
	ProductComponent createProductComponent();

	/**
	 * Returns a new object of class '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register</em>'.
	 * @generated
	 */
	RiskRegister createRiskRegister();

	/**
	 * Returns a new object of class '<em>Register Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register Entry</em>'.
	 * @generated
	 */
	RiskRegisterEntry createRiskRegisterEntry();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	RiskNamespace createRiskNamespace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RiskPackage getRiskPackage();

} //RiskFactory
