/**
 */
package org.nasdanika.models.risk.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.risk.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.risk.RiskPackage
 * @generated
 */
public class RiskSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RiskPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskSwitch() {
		if (modelPackage == null) {
			modelPackage = RiskPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RiskPackage.RISK_MODEL_ELEMENT: {
				RiskModelElement riskModelElement = (RiskModelElement)theEObject;
				T result = caseRiskModelElement(riskModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_LEVEL: {
				RiskLevel riskLevel = (RiskLevel)theEObject;
				T result = caseRiskLevel(riskLevel);
				if (result == null) result = caseRiskModelElement(riskLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.CONTROL_CATEGORY: {
				ControlCategory controlCategory = (ControlCategory)theEObject;
				T result = caseControlCategory(controlCategory);
				if (result == null) result = caseRiskModelElement(controlCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_CATEGORY: {
				RiskCategory riskCategory = (RiskCategory)theEObject;
				T result = caseRiskCategory(riskCategory);
				if (result == null) result = caseRiskModelElement(riskCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK: {
				Risk risk = (Risk)theEObject;
				T result = caseRisk(risk);
				if (result == null) result = caseRiskModelElement(risk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseRiskModelElement(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.QUESTION_OPTION: {
				QuestionOption questionOption = (QuestionOption)theEObject;
				T result = caseQuestionOption(questionOption);
				if (result == null) result = caseRiskModelElement(questionOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseRiskModelElement(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseRiskModelElement(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.ANSWER: {
				Answer answer = (Answer)theEObject;
				T result = caseAnswer(answer);
				if (result == null) result = caseRiskModelElement(answer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.QUESTIONNAIRE_RESPONSE: {
				QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse)theEObject;
				T result = caseQuestionnaireResponse(questionnaireResponse);
				if (result == null) result = caseRiskModelElement(questionnaireResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.SCORE_COMPONENT: {
				ScoreComponent scoreComponent = (ScoreComponent)theEObject;
				T result = caseScoreComponent(scoreComponent);
				if (result == null) result = caseRiskModelElement(scoreComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.FINDING: {
				Finding finding = (Finding)theEObject;
				T result = caseFinding(finding);
				if (result == null) result = caseRiskModelElement(finding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.TREATMENT_ACTION: {
				TreatmentAction treatmentAction = (TreatmentAction)theEObject;
				T result = caseTreatmentAction(treatmentAction);
				if (result == null) result = caseRiskModelElement(treatmentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_TREATMENT: {
				RiskTreatment riskTreatment = (RiskTreatment)theEObject;
				T result = caseRiskTreatment(riskTreatment);
				if (result == null) result = caseRiskModelElement(riskTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.IDENTIFIED_RISK: {
				IdentifiedRisk identifiedRisk = (IdentifiedRisk)theEObject;
				T result = caseIdentifiedRisk(identifiedRisk);
				if (result == null) result = caseRiskModelElement(identifiedRisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseRiskModelElement(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.KEY_VALUE_PAIR: {
				KeyValuePair keyValuePair = (KeyValuePair)theEObject;
				T result = caseKeyValuePair(keyValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseRiskModelElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = caseRiskModelElement(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.CHANGE_EVENT: {
				ChangeEvent changeEvent = (ChangeEvent)theEObject;
				T result = caseChangeEvent(changeEvent);
				if (result == null) result = caseRiskModelElement(changeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_ASSESSABLE_UNIT: {
				RiskAssessableUnit riskAssessableUnit = (RiskAssessableUnit)theEObject;
				T result = caseRiskAssessableUnit(riskAssessableUnit);
				if (result == null) result = caseRiskModelElement(riskAssessableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseRiskAssessableUnit(product);
				if (result == null) result = caseRiskModelElement(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.PRODUCT_COMPONENT: {
				ProductComponent productComponent = (ProductComponent)theEObject;
				T result = caseProductComponent(productComponent);
				if (result == null) result = caseRiskAssessableUnit(productComponent);
				if (result == null) result = caseRiskModelElement(productComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_REGISTER: {
				RiskRegister riskRegister = (RiskRegister)theEObject;
				T result = caseRiskRegister(riskRegister);
				if (result == null) result = caseRiskModelElement(riskRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_REGISTER_ENTRY: {
				RiskRegisterEntry riskRegisterEntry = (RiskRegisterEntry)theEObject;
				T result = caseRiskRegisterEntry(riskRegisterEntry);
				if (result == null) result = caseRiskModelElement(riskRegisterEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RiskPackage.RISK_NAMESPACE: {
				RiskNamespace riskNamespace = (RiskNamespace)theEObject;
				T result = caseRiskNamespace(riskNamespace);
				if (result == null) result = caseRiskModelElement(riskNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskModelElement(RiskModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskLevel(RiskLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlCategory(ControlCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskCategory(RiskCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisk(Risk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionOption(QuestionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponse(QuestionnaireResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScoreComponent(ScoreComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinding(Finding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatmentAction(TreatmentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskTreatment(RiskTreatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedRisk(IdentifiedRisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessment(RiskAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValuePair(KeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeEvent(ChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessableUnit(RiskAssessableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductComponent(ProductComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskRegister(RiskRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskRegisterEntry(RiskRegisterEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskNamespace(RiskNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RiskSwitch
