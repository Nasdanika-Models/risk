/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.risk.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskFactoryImpl extends EFactoryImpl implements RiskFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskFactory init() {
		try {
			RiskFactory theRiskFactory = (RiskFactory)EPackage.Registry.INSTANCE.getEFactory(RiskPackage.eNS_URI);
			if (theRiskFactory != null) {
				return theRiskFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RiskFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RiskPackage.RISK_LEVEL: return createRiskLevel();
			case RiskPackage.CONTROL_CATEGORY: return createControlCategory();
			case RiskPackage.RISK_CATEGORY: return createRiskCategory();
			case RiskPackage.RISK: return createRisk();
			case RiskPackage.CONTROL: return createControl();
			case RiskPackage.QUESTION_OPTION: return createQuestionOption();
			case RiskPackage.QUESTION: return createQuestion();
			case RiskPackage.QUESTIONNAIRE: return createQuestionnaire();
			case RiskPackage.ANSWER: return createAnswer();
			case RiskPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case RiskPackage.SCORE_COMPONENT: return createScoreComponent();
			case RiskPackage.FINDING: return createFinding();
			case RiskPackage.TREATMENT_ACTION: return createTreatmentAction();
			case RiskPackage.RISK_TREATMENT: return createRiskTreatment();
			case RiskPackage.IDENTIFIED_RISK: return createIdentifiedRisk();
			case RiskPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case RiskPackage.KEY_VALUE_PAIR: return createKeyValuePair();
			case RiskPackage.ARTIFACT: return createArtifact();
			case RiskPackage.DATA_SOURCE: return createDataSource();
			case RiskPackage.CHANGE_EVENT: return createChangeEvent();
			case RiskPackage.PRODUCT: return createProduct();
			case RiskPackage.PRODUCT_COMPONENT: return createProductComponent();
			case RiskPackage.RISK_REGISTER: return createRiskRegister();
			case RiskPackage.RISK_REGISTER_ENTRY: return createRiskRegisterEntry();
			case RiskPackage.RISK_NAMESPACE: return createRiskNamespace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RiskPackage.DATA_CLASSIFICATION:
				return createDataClassificationFromString(eDataType, initialValue);
			case RiskPackage.TREATMENT_STRATEGY:
				return createTreatmentStrategyFromString(eDataType, initialValue);
			case RiskPackage.TREATMENT_STATUS:
				return createTreatmentStatusFromString(eDataType, initialValue);
			case RiskPackage.ACTION_STATUS:
				return createActionStatusFromString(eDataType, initialValue);
			case RiskPackage.ASSESSMENT_STATUS:
				return createAssessmentStatusFromString(eDataType, initialValue);
			case RiskPackage.RISK_STATUS:
				return createRiskStatusFromString(eDataType, initialValue);
			case RiskPackage.CONTROL_TYPE:
				return createControlTypeFromString(eDataType, initialValue);
			case RiskPackage.CONTROL_EFFECTIVENESS:
				return createControlEffectivenessFromString(eDataType, initialValue);
			case RiskPackage.FINDING_TYPE:
				return createFindingTypeFromString(eDataType, initialValue);
			case RiskPackage.FINDING_STATUS:
				return createFindingStatusFromString(eDataType, initialValue);
			case RiskPackage.QUESTION_TYPE:
				return createQuestionTypeFromString(eDataType, initialValue);
			case RiskPackage.PRODUCT_COMPONENT_TYPE:
				return createProductComponentTypeFromString(eDataType, initialValue);
			case RiskPackage.CHANGE_EVENT_TYPE:
				return createChangeEventTypeFromString(eDataType, initialValue);
			case RiskPackage.ARTIFACT_TYPE:
				return createArtifactTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RiskPackage.DATA_CLASSIFICATION:
				return convertDataClassificationToString(eDataType, instanceValue);
			case RiskPackage.TREATMENT_STRATEGY:
				return convertTreatmentStrategyToString(eDataType, instanceValue);
			case RiskPackage.TREATMENT_STATUS:
				return convertTreatmentStatusToString(eDataType, instanceValue);
			case RiskPackage.ACTION_STATUS:
				return convertActionStatusToString(eDataType, instanceValue);
			case RiskPackage.ASSESSMENT_STATUS:
				return convertAssessmentStatusToString(eDataType, instanceValue);
			case RiskPackage.RISK_STATUS:
				return convertRiskStatusToString(eDataType, instanceValue);
			case RiskPackage.CONTROL_TYPE:
				return convertControlTypeToString(eDataType, instanceValue);
			case RiskPackage.CONTROL_EFFECTIVENESS:
				return convertControlEffectivenessToString(eDataType, instanceValue);
			case RiskPackage.FINDING_TYPE:
				return convertFindingTypeToString(eDataType, instanceValue);
			case RiskPackage.FINDING_STATUS:
				return convertFindingStatusToString(eDataType, instanceValue);
			case RiskPackage.QUESTION_TYPE:
				return convertQuestionTypeToString(eDataType, instanceValue);
			case RiskPackage.PRODUCT_COMPONENT_TYPE:
				return convertProductComponentTypeToString(eDataType, instanceValue);
			case RiskPackage.CHANGE_EVENT_TYPE:
				return convertChangeEventTypeToString(eDataType, instanceValue);
			case RiskPackage.ARTIFACT_TYPE:
				return convertArtifactTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel createRiskLevel() {
		RiskLevelImpl riskLevel = new RiskLevelImpl();
		return riskLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlCategory createControlCategory() {
		ControlCategoryImpl controlCategory = new ControlCategoryImpl();
		return controlCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskCategory createRiskCategory() {
		RiskCategoryImpl riskCategory = new RiskCategoryImpl();
		return riskCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Risk createRisk() {
		RiskImpl risk = new RiskImpl();
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionOption createQuestionOption() {
		QuestionOptionImpl questionOption = new QuestionOptionImpl();
		return questionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreComponent createScoreComponent() {
		ScoreComponentImpl scoreComponent = new ScoreComponentImpl();
		return scoreComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finding createFinding() {
		FindingImpl finding = new FindingImpl();
		return finding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreatmentAction createTreatmentAction() {
		TreatmentActionImpl treatmentAction = new TreatmentActionImpl();
		return treatmentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskTreatment createRiskTreatment() {
		RiskTreatmentImpl riskTreatment = new RiskTreatmentImpl();
		return riskTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiedRisk createIdentifiedRisk() {
		IdentifiedRiskImpl identifiedRisk = new IdentifiedRiskImpl();
		return identifiedRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductComponent createProductComponent() {
		ProductComponentImpl productComponent = new ProductComponentImpl();
		return productComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskRegister createRiskRegister() {
		RiskRegisterImpl riskRegister = new RiskRegisterImpl();
		return riskRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskRegisterEntry createRiskRegisterEntry() {
		RiskRegisterEntryImpl riskRegisterEntry = new RiskRegisterEntryImpl();
		return riskRegisterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskNamespace createRiskNamespace() {
		RiskNamespaceImpl riskNamespace = new RiskNamespaceImpl();
		return riskNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClassification createDataClassificationFromString(EDataType eDataType, String initialValue) {
		DataClassification result = DataClassification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentStrategy createTreatmentStrategyFromString(EDataType eDataType, String initialValue) {
		TreatmentStrategy result = TreatmentStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTreatmentStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentStatus createTreatmentStatusFromString(EDataType eDataType, String initialValue) {
		TreatmentStatus result = TreatmentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTreatmentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatus createActionStatusFromString(EDataType eDataType, String initialValue) {
		ActionStatus result = ActionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentStatus createAssessmentStatusFromString(EDataType eDataType, String initialValue) {
		AssessmentStatus result = AssessmentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssessmentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskStatus createRiskStatusFromString(EDataType eDataType, String initialValue) {
		RiskStatus result = RiskStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlTypeFromString(EDataType eDataType, String initialValue) {
		ControlType result = ControlType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlEffectiveness createControlEffectivenessFromString(EDataType eDataType, String initialValue) {
		ControlEffectiveness result = ControlEffectiveness.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlEffectivenessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindingType createFindingTypeFromString(EDataType eDataType, String initialValue) {
		FindingType result = FindingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindingStatus createFindingStatusFromString(EDataType eDataType, String initialValue) {
		FindingStatus result = FindingStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFindingStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionType createQuestionTypeFromString(EDataType eDataType, String initialValue) {
		QuestionType result = QuestionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductComponentType createProductComponentTypeFromString(EDataType eDataType, String initialValue) {
		ProductComponentType result = ProductComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEventType createChangeEventTypeFromString(EDataType eDataType, String initialValue) {
		ChangeEventType result = ChangeEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType createArtifactTypeFromString(EDataType eDataType, String initialValue) {
		ArtifactType result = ArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskPackage getRiskPackage() {
		return (RiskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RiskPackage getPackage() {
		return RiskPackage.eINSTANCE;
	}

} //RiskFactoryImpl
