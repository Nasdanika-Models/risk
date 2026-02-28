/**
 */
package org.nasdanika.models.risk.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.risk.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.risk.RiskPackage
 * @generated
 */
public class RiskAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RiskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RiskPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskSwitch<Adapter> modelSwitch =
		new RiskSwitch<Adapter>() {
			@Override
			public Adapter caseRiskModelElement(RiskModelElement object) {
				return createRiskModelElementAdapter();
			}
			@Override
			public Adapter caseRiskLevel(RiskLevel object) {
				return createRiskLevelAdapter();
			}
			@Override
			public Adapter caseControlCategory(ControlCategory object) {
				return createControlCategoryAdapter();
			}
			@Override
			public Adapter caseRiskCategory(RiskCategory object) {
				return createRiskCategoryAdapter();
			}
			@Override
			public Adapter caseRisk(Risk object) {
				return createRiskAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseQuestionOption(QuestionOption object) {
				return createQuestionOptionAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponse(QuestionnaireResponse object) {
				return createQuestionnaireResponseAdapter();
			}
			@Override
			public Adapter caseScoreComponent(ScoreComponent object) {
				return createScoreComponentAdapter();
			}
			@Override
			public Adapter caseFinding(Finding object) {
				return createFindingAdapter();
			}
			@Override
			public Adapter caseTreatmentAction(TreatmentAction object) {
				return createTreatmentActionAdapter();
			}
			@Override
			public Adapter caseRiskTreatment(RiskTreatment object) {
				return createRiskTreatmentAdapter();
			}
			@Override
			public Adapter caseIdentifiedRisk(IdentifiedRisk object) {
				return createIdentifiedRiskAdapter();
			}
			@Override
			public Adapter caseRiskAssessment(RiskAssessment object) {
				return createRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseKeyValuePair(KeyValuePair object) {
				return createKeyValuePairAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseChangeEvent(ChangeEvent object) {
				return createChangeEventAdapter();
			}
			@Override
			public Adapter caseRiskAssessableUnit(RiskAssessableUnit object) {
				return createRiskAssessableUnitAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseProductComponent(ProductComponent object) {
				return createProductComponentAdapter();
			}
			@Override
			public Adapter caseRiskRegister(RiskRegister object) {
				return createRiskRegisterAdapter();
			}
			@Override
			public Adapter caseRiskRegisterEntry(RiskRegisterEntry object) {
				return createRiskRegisterEntryAdapter();
			}
			@Override
			public Adapter caseRiskNamespace(RiskNamespace object) {
				return createRiskNamespaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskModelElement
	 * @generated
	 */
	public Adapter createRiskModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskLevel
	 * @generated
	 */
	public Adapter createRiskLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.ControlCategory <em>Control Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.ControlCategory
	 * @generated
	 */
	public Adapter createControlCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskCategory
	 * @generated
	 */
	public Adapter createRiskCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Risk
	 * @generated
	 */
	public Adapter createRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.QuestionOption <em>Question Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.QuestionOption
	 * @generated
	 */
	public Adapter createQuestionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.QuestionnaireResponse <em>Questionnaire Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse
	 * @generated
	 */
	public Adapter createQuestionnaireResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.ScoreComponent <em>Score Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.ScoreComponent
	 * @generated
	 */
	public Adapter createScoreComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Finding
	 * @generated
	 */
	public Adapter createFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.TreatmentAction <em>Treatment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.TreatmentAction
	 * @generated
	 */
	public Adapter createTreatmentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskTreatment
	 * @generated
	 */
	public Adapter createRiskTreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.IdentifiedRisk <em>Identified Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.IdentifiedRisk
	 * @generated
	 */
	public Adapter createIdentifiedRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskAssessment
	 * @generated
	 */
	public Adapter createRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.KeyValuePair
	 * @generated
	 */
	public Adapter createKeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.ChangeEvent
	 * @generated
	 */
	public Adapter createChangeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskAssessableUnit <em>Assessable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit
	 * @generated
	 */
	public Adapter createRiskAssessableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.ProductComponent <em>Product Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.ProductComponent
	 * @generated
	 */
	public Adapter createProductComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskRegister
	 * @generated
	 */
	public Adapter createRiskRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskRegisterEntry <em>Register Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskRegisterEntry
	 * @generated
	 */
	public Adapter createRiskRegisterEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.risk.RiskNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.risk.RiskNamespace
	 * @generated
	 */
	public Adapter createRiskNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RiskAdapterFactory
