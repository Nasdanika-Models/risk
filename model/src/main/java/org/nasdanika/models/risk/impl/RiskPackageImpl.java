/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.risk.ActionStatus;
import org.nasdanika.models.risk.Answer;
import org.nasdanika.models.risk.Artifact;
import org.nasdanika.models.risk.ArtifactType;
import org.nasdanika.models.risk.AssessmentStatus;
import org.nasdanika.models.risk.ChangeEvent;
import org.nasdanika.models.risk.ChangeEventType;
import org.nasdanika.models.risk.Control;
import org.nasdanika.models.risk.ControlCategory;
import org.nasdanika.models.risk.ControlEffectiveness;
import org.nasdanika.models.risk.ControlType;
import org.nasdanika.models.risk.DataClassification;
import org.nasdanika.models.risk.DataSource;
import org.nasdanika.models.risk.Finding;
import org.nasdanika.models.risk.FindingStatus;
import org.nasdanika.models.risk.FindingType;
import org.nasdanika.models.risk.IdentifiedRisk;
import org.nasdanika.models.risk.KeyValuePair;
import org.nasdanika.models.risk.Product;
import org.nasdanika.models.risk.ProductComponent;
import org.nasdanika.models.risk.ProductComponentType;
import org.nasdanika.models.risk.Question;
import org.nasdanika.models.risk.QuestionOption;
import org.nasdanika.models.risk.QuestionType;
import org.nasdanika.models.risk.Questionnaire;
import org.nasdanika.models.risk.QuestionnaireResponse;
import org.nasdanika.models.risk.Risk;
import org.nasdanika.models.risk.RiskAssessableUnit;
import org.nasdanika.models.risk.RiskAssessment;
import org.nasdanika.models.risk.RiskCategory;
import org.nasdanika.models.risk.RiskFactory;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskModelElement;
import org.nasdanika.models.risk.RiskNamespace;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.RiskRegister;
import org.nasdanika.models.risk.RiskRegisterEntry;
import org.nasdanika.models.risk.RiskStatus;
import org.nasdanika.models.risk.RiskTreatment;
import org.nasdanika.models.risk.ScoreComponent;
import org.nasdanika.models.risk.TreatmentAction;
import org.nasdanika.models.risk.TreatmentStatus;
import org.nasdanika.models.risk.TreatmentStrategy;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskPackageImpl extends EPackageImpl implements RiskPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treatmentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskTreatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedRiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskRegisterEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataClassificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum treatmentStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum treatmentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assessmentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlEffectivenessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum findingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum findingStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productComponentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.risk.RiskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RiskPackageImpl() {
		super(eNS_URI, RiskFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RiskPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RiskPackage init() {
		if (isInited) return (RiskPackage)EPackage.Registry.INSTANCE.getEPackage(RiskPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRiskPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RiskPackageImpl theRiskPackage = registeredRiskPackage instanceof RiskPackageImpl ? (RiskPackageImpl)registeredRiskPackage : new RiskPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRiskPackage.createPackageContents();

		// Initialize created meta-data
		theRiskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRiskPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RiskPackage.eNS_URI, theRiskPackage);
		return theRiskPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskModelElement() {
		return riskModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskModelElement_Id() {
		return (EAttribute)riskModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskModelElement_Name() {
		return (EAttribute)riskModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskModelElement_Description() {
		return (EAttribute)riskModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskModelElement_Uri() {
		return (EAttribute)riskModelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskLevel() {
		return riskLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLevel_Score() {
		return (EAttribute)riskLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLevel_Color() {
		return (EAttribute)riskLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlCategory() {
		return controlCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskCategory() {
		return riskCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskCategory_SubCategories() {
		return (EReference)riskCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskCategory_Risks() {
		return (EReference)riskCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRisk() {
		return riskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Triggers() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_Consequences() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRisk_RegulatoryReferences() {
		return (EAttribute)riskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRisk_RelatedRisks() {
		return (EReference)riskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Category() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Type() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Effectiveness() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Automated() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Owner() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_ReviewDate() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_EvidenceUrl() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionOption() {
		return questionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionOption_Value() {
		return (EAttribute)questionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionOption_Score() {
		return (EAttribute)questionOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionOption_RiskLevel() {
		return (EReference)questionOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Type() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Required() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Category() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Guidance() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Weight() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestion_RiskCategory() {
		return (EReference)questionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestion_Options() {
		return (EReference)questionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaire_Version() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaire_Applicability() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnaire_Questions() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnswer_Question() {
		return (EReference)answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswer_Value() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswer_Score() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswer_Notes() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionnaireResponse() {
		return questionnaireResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnaireResponse_Questionnaire() {
		return (EReference)questionnaireResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaireResponse_ResponseDate() {
		return (EAttribute)questionnaireResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaireResponse_Respondent() {
		return (EAttribute)questionnaireResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnaireResponse_Answers() {
		return (EReference)questionnaireResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnaireResponse_TotalScore() {
		return (EAttribute)questionnaireResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnaireResponse_Level() {
		return (EReference)questionnaireResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScoreComponent() {
		return scoreComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScoreComponent_Score() {
		return (EAttribute)scoreComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScoreComponent_Weight() {
		return (EAttribute)scoreComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScoreComponent_Level() {
		return (EReference)scoreComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScoreComponent_Source() {
		return (EAttribute)scoreComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScoreComponent_Notes() {
		return (EAttribute)scoreComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinding() {
		return findingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinding_Severity() {
		return (EReference)findingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Type() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Status() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_DueDate() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_Assignee() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFinding_TicketUrl() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreatmentAction() {
		return treatmentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreatmentAction_Assignee() {
		return (EAttribute)treatmentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreatmentAction_DueDate() {
		return (EAttribute)treatmentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreatmentAction_Status() {
		return (EAttribute)treatmentActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreatmentAction_TicketUrl() {
		return (EAttribute)treatmentActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskTreatment() {
		return riskTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskTreatment_Strategy() {
		return (EAttribute)riskTreatmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskTreatment_TargetDate() {
		return (EAttribute)riskTreatmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskTreatment_Status() {
		return (EAttribute)riskTreatmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskTreatment_Approver() {
		return (EAttribute)riskTreatmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskTreatment_Actions() {
		return (EReference)riskTreatmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiedRisk() {
		return identifiedRiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_Risk() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_Likelihood() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_Impact() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedRisk_InherentScore() {
		return (EAttribute)identifiedRiskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedRisk_ResidualScore() {
		return (EAttribute)identifiedRiskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_ResidualLevel() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedRisk_Status() {
		return (EAttribute)identifiedRiskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedRisk_Owner() {
		return (EAttribute)identifiedRiskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedRisk_DueDate() {
		return (EAttribute)identifiedRiskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedRisk_Notes() {
		return (EAttribute)identifiedRiskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_Treatment() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_Controls() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifiedRisk_Findings() {
		return (EReference)identifiedRiskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskAssessment() {
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_AssessmentDate() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_Assessor() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_Approver() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_ReviewDate() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_NextReviewDate() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_Status() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessment_Trigger() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessment_Scores() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessment_CompositeScore() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessment_ConsolidatedRating() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessment_Findings() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessment_QuestionnaireResponses() {
		return (EReference)riskAssessmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValuePair_Key() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValuePair_Value() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_ExternalId() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_ArtifactUrl() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Type() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_LastUpdated() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Metadata() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Type() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_BaseUrl() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_Artifacts() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeEvent_EventDate() {
		return (EAttribute)changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeEvent_Type() {
		return (EAttribute)changeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeEvent_Source() {
		return (EReference)changeEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeEvent_Artifact() {
		return (EReference)changeEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeEvent_Details() {
		return (EAttribute)changeEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskAssessableUnit() {
		return riskAssessableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessableUnit_DataClassification() {
		return (EAttribute)riskAssessableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskAssessableUnit_Owner() {
		return (EAttribute)riskAssessableUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_Components() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_IdentifiedRisks() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_Controls() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_Questionnaires() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_QuestionnaireResponses() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_Assessments() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_Artifacts() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_ChangeEvents() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskAssessableUnit_CurrentRating() {
		return (EReference)riskAssessableUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductType() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_BusinessLine() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_DevelopmentTeam() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_TechnologyStack() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_UsesPublicCloud() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_UsesAI() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_RegulatoryScope() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_OnboardingDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductionDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReviewCycleDays() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductComponent() {
		return productComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductComponent_ComponentType() {
		return (EAttribute)productComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductComponent_Version() {
		return (EAttribute)productComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductComponent_Environment() {
		return (EAttribute)productComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskRegister() {
		return riskRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskRegister_Entries() {
		return (EReference)riskRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskRegister_ReportDate() {
		return (EAttribute)riskRegisterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskRegisterEntry() {
		return riskRegisterEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskRegisterEntry_RiskAssessableUnit() {
		return (EReference)riskRegisterEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskRegisterEntry_IdentifiedRisk() {
		return (EReference)riskRegisterEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskNamespace() {
		return riskNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_RiskLevels() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_ControlCategories() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_RiskCategories() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_Questionnaires() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_DataSources() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_Products() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskNamespace_RiskRegisters() {
		return (EReference)riskNamespaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataClassification() {
		return dataClassificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTreatmentStrategy() {
		return treatmentStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTreatmentStatus() {
		return treatmentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionStatus() {
		return actionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssessmentStatus() {
		return assessmentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskStatus() {
		return riskStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlType() {
		return controlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlEffectiveness() {
		return controlEffectivenessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFindingType() {
		return findingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFindingStatus() {
		return findingStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQuestionType() {
		return questionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProductComponentType() {
		return productComponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChangeEventType() {
		return changeEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArtifactType() {
		return artifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskFactory getRiskFactory() {
		return (RiskFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		riskModelElementEClass = createEClass(RISK_MODEL_ELEMENT);
		createEAttribute(riskModelElementEClass, RISK_MODEL_ELEMENT__ID);
		createEAttribute(riskModelElementEClass, RISK_MODEL_ELEMENT__NAME);
		createEAttribute(riskModelElementEClass, RISK_MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(riskModelElementEClass, RISK_MODEL_ELEMENT__URI);

		riskLevelEClass = createEClass(RISK_LEVEL);
		createEAttribute(riskLevelEClass, RISK_LEVEL__SCORE);
		createEAttribute(riskLevelEClass, RISK_LEVEL__COLOR);

		controlCategoryEClass = createEClass(CONTROL_CATEGORY);

		riskCategoryEClass = createEClass(RISK_CATEGORY);
		createEReference(riskCategoryEClass, RISK_CATEGORY__SUB_CATEGORIES);
		createEReference(riskCategoryEClass, RISK_CATEGORY__RISKS);

		riskEClass = createEClass(RISK);
		createEAttribute(riskEClass, RISK__TRIGGERS);
		createEAttribute(riskEClass, RISK__CONSEQUENCES);
		createEAttribute(riskEClass, RISK__REGULATORY_REFERENCES);
		createEReference(riskEClass, RISK__RELATED_RISKS);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__CATEGORY);
		createEAttribute(controlEClass, CONTROL__TYPE);
		createEAttribute(controlEClass, CONTROL__EFFECTIVENESS);
		createEAttribute(controlEClass, CONTROL__AUTOMATED);
		createEAttribute(controlEClass, CONTROL__OWNER);
		createEAttribute(controlEClass, CONTROL__REVIEW_DATE);
		createEAttribute(controlEClass, CONTROL__EVIDENCE_URL);

		questionOptionEClass = createEClass(QUESTION_OPTION);
		createEAttribute(questionOptionEClass, QUESTION_OPTION__VALUE);
		createEAttribute(questionOptionEClass, QUESTION_OPTION__SCORE);
		createEReference(questionOptionEClass, QUESTION_OPTION__RISK_LEVEL);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__TYPE);
		createEAttribute(questionEClass, QUESTION__REQUIRED);
		createEAttribute(questionEClass, QUESTION__CATEGORY);
		createEAttribute(questionEClass, QUESTION__GUIDANCE);
		createEAttribute(questionEClass, QUESTION__WEIGHT);
		createEReference(questionEClass, QUESTION__RISK_CATEGORY);
		createEReference(questionEClass, QUESTION__OPTIONS);

		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__VERSION);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__APPLICABILITY);
		createEReference(questionnaireEClass, QUESTIONNAIRE__QUESTIONS);

		answerEClass = createEClass(ANSWER);
		createEReference(answerEClass, ANSWER__QUESTION);
		createEAttribute(answerEClass, ANSWER__VALUE);
		createEAttribute(answerEClass, ANSWER__SCORE);
		createEAttribute(answerEClass, ANSWER__NOTES);

		questionnaireResponseEClass = createEClass(QUESTIONNAIRE_RESPONSE);
		createEReference(questionnaireResponseEClass, QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE);
		createEAttribute(questionnaireResponseEClass, QUESTIONNAIRE_RESPONSE__RESPONSE_DATE);
		createEAttribute(questionnaireResponseEClass, QUESTIONNAIRE_RESPONSE__RESPONDENT);
		createEReference(questionnaireResponseEClass, QUESTIONNAIRE_RESPONSE__ANSWERS);
		createEAttribute(questionnaireResponseEClass, QUESTIONNAIRE_RESPONSE__TOTAL_SCORE);
		createEReference(questionnaireResponseEClass, QUESTIONNAIRE_RESPONSE__LEVEL);

		scoreComponentEClass = createEClass(SCORE_COMPONENT);
		createEAttribute(scoreComponentEClass, SCORE_COMPONENT__SCORE);
		createEAttribute(scoreComponentEClass, SCORE_COMPONENT__WEIGHT);
		createEReference(scoreComponentEClass, SCORE_COMPONENT__LEVEL);
		createEAttribute(scoreComponentEClass, SCORE_COMPONENT__SOURCE);
		createEAttribute(scoreComponentEClass, SCORE_COMPONENT__NOTES);

		findingEClass = createEClass(FINDING);
		createEReference(findingEClass, FINDING__SEVERITY);
		createEAttribute(findingEClass, FINDING__TYPE);
		createEAttribute(findingEClass, FINDING__STATUS);
		createEAttribute(findingEClass, FINDING__DUE_DATE);
		createEAttribute(findingEClass, FINDING__ASSIGNEE);
		createEAttribute(findingEClass, FINDING__TICKET_URL);

		treatmentActionEClass = createEClass(TREATMENT_ACTION);
		createEAttribute(treatmentActionEClass, TREATMENT_ACTION__ASSIGNEE);
		createEAttribute(treatmentActionEClass, TREATMENT_ACTION__DUE_DATE);
		createEAttribute(treatmentActionEClass, TREATMENT_ACTION__STATUS);
		createEAttribute(treatmentActionEClass, TREATMENT_ACTION__TICKET_URL);

		riskTreatmentEClass = createEClass(RISK_TREATMENT);
		createEAttribute(riskTreatmentEClass, RISK_TREATMENT__STRATEGY);
		createEAttribute(riskTreatmentEClass, RISK_TREATMENT__TARGET_DATE);
		createEAttribute(riskTreatmentEClass, RISK_TREATMENT__STATUS);
		createEAttribute(riskTreatmentEClass, RISK_TREATMENT__APPROVER);
		createEReference(riskTreatmentEClass, RISK_TREATMENT__ACTIONS);

		identifiedRiskEClass = createEClass(IDENTIFIED_RISK);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__RISK);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__LIKELIHOOD);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__IMPACT);
		createEAttribute(identifiedRiskEClass, IDENTIFIED_RISK__INHERENT_SCORE);
		createEAttribute(identifiedRiskEClass, IDENTIFIED_RISK__RESIDUAL_SCORE);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__RESIDUAL_LEVEL);
		createEAttribute(identifiedRiskEClass, IDENTIFIED_RISK__STATUS);
		createEAttribute(identifiedRiskEClass, IDENTIFIED_RISK__OWNER);
		createEAttribute(identifiedRiskEClass, IDENTIFIED_RISK__DUE_DATE);
		createEAttribute(identifiedRiskEClass, IDENTIFIED_RISK__NOTES);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__TREATMENT);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__CONTROLS);
		createEReference(identifiedRiskEClass, IDENTIFIED_RISK__FINDINGS);

		riskAssessmentEClass = createEClass(RISK_ASSESSMENT);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__ASSESSMENT_DATE);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__ASSESSOR);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__APPROVER);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__REVIEW_DATE);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__NEXT_REVIEW_DATE);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__STATUS);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__TRIGGER);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__SCORES);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__COMPOSITE_SCORE);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__CONSOLIDATED_RATING);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__FINDINGS);
		createEReference(riskAssessmentEClass, RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES);

		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__EXTERNAL_ID);
		createEAttribute(artifactEClass, ARTIFACT__ARTIFACT_URL);
		createEAttribute(artifactEClass, ARTIFACT__TYPE);
		createEAttribute(artifactEClass, ARTIFACT__LAST_UPDATED);
		createEReference(artifactEClass, ARTIFACT__METADATA);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__TYPE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__BASE_URL);
		createEReference(dataSourceEClass, DATA_SOURCE__ARTIFACTS);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEAttribute(changeEventEClass, CHANGE_EVENT__EVENT_DATE);
		createEAttribute(changeEventEClass, CHANGE_EVENT__TYPE);
		createEReference(changeEventEClass, CHANGE_EVENT__SOURCE);
		createEReference(changeEventEClass, CHANGE_EVENT__ARTIFACT);
		createEAttribute(changeEventEClass, CHANGE_EVENT__DETAILS);

		riskAssessableUnitEClass = createEClass(RISK_ASSESSABLE_UNIT);
		createEAttribute(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION);
		createEAttribute(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__OWNER);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__COMPONENTS);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__CONTROLS);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__QUESTIONNAIRES);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__ASSESSMENTS);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__ARTIFACTS);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__CHANGE_EVENTS);
		createEReference(riskAssessableUnitEClass, RISK_ASSESSABLE_UNIT__CURRENT_RATING);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_TYPE);
		createEAttribute(productEClass, PRODUCT__BUSINESS_LINE);
		createEAttribute(productEClass, PRODUCT__DEVELOPMENT_TEAM);
		createEAttribute(productEClass, PRODUCT__TECHNOLOGY_STACK);
		createEAttribute(productEClass, PRODUCT__USES_PUBLIC_CLOUD);
		createEAttribute(productEClass, PRODUCT__USES_AI);
		createEAttribute(productEClass, PRODUCT__REGULATORY_SCOPE);
		createEAttribute(productEClass, PRODUCT__ONBOARDING_DATE);
		createEAttribute(productEClass, PRODUCT__PRODUCTION_DATE);
		createEAttribute(productEClass, PRODUCT__REVIEW_CYCLE_DAYS);

		productComponentEClass = createEClass(PRODUCT_COMPONENT);
		createEAttribute(productComponentEClass, PRODUCT_COMPONENT__COMPONENT_TYPE);
		createEAttribute(productComponentEClass, PRODUCT_COMPONENT__VERSION);
		createEAttribute(productComponentEClass, PRODUCT_COMPONENT__ENVIRONMENT);

		riskRegisterEClass = createEClass(RISK_REGISTER);
		createEReference(riskRegisterEClass, RISK_REGISTER__ENTRIES);
		createEAttribute(riskRegisterEClass, RISK_REGISTER__REPORT_DATE);

		riskRegisterEntryEClass = createEClass(RISK_REGISTER_ENTRY);
		createEReference(riskRegisterEntryEClass, RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT);
		createEReference(riskRegisterEntryEClass, RISK_REGISTER_ENTRY__IDENTIFIED_RISK);

		riskNamespaceEClass = createEClass(RISK_NAMESPACE);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__RISK_LEVELS);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__CONTROL_CATEGORIES);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__RISK_CATEGORIES);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__QUESTIONNAIRES);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__DATA_SOURCES);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__PRODUCTS);
		createEReference(riskNamespaceEClass, RISK_NAMESPACE__RISK_REGISTERS);

		// Create enums
		dataClassificationEEnum = createEEnum(DATA_CLASSIFICATION);
		treatmentStrategyEEnum = createEEnum(TREATMENT_STRATEGY);
		treatmentStatusEEnum = createEEnum(TREATMENT_STATUS);
		actionStatusEEnum = createEEnum(ACTION_STATUS);
		assessmentStatusEEnum = createEEnum(ASSESSMENT_STATUS);
		riskStatusEEnum = createEEnum(RISK_STATUS);
		controlTypeEEnum = createEEnum(CONTROL_TYPE);
		controlEffectivenessEEnum = createEEnum(CONTROL_EFFECTIVENESS);
		findingTypeEEnum = createEEnum(FINDING_TYPE);
		findingStatusEEnum = createEEnum(FINDING_STATUS);
		questionTypeEEnum = createEEnum(QUESTION_TYPE);
		productComponentTypeEEnum = createEEnum(PRODUCT_COMPONENT_TYPE);
		changeEventTypeEEnum = createEEnum(CHANGE_EVENT_TYPE);
		artifactTypeEEnum = createEEnum(ARTIFACT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		riskLevelEClass.getESuperTypes().add(this.getRiskModelElement());
		controlCategoryEClass.getESuperTypes().add(this.getRiskModelElement());
		riskCategoryEClass.getESuperTypes().add(this.getRiskModelElement());
		riskEClass.getESuperTypes().add(this.getRiskModelElement());
		controlEClass.getESuperTypes().add(this.getRiskModelElement());
		questionOptionEClass.getESuperTypes().add(this.getRiskModelElement());
		questionEClass.getESuperTypes().add(this.getRiskModelElement());
		questionnaireEClass.getESuperTypes().add(this.getRiskModelElement());
		answerEClass.getESuperTypes().add(this.getRiskModelElement());
		questionnaireResponseEClass.getESuperTypes().add(this.getRiskModelElement());
		scoreComponentEClass.getESuperTypes().add(this.getRiskModelElement());
		findingEClass.getESuperTypes().add(this.getRiskModelElement());
		treatmentActionEClass.getESuperTypes().add(this.getRiskModelElement());
		riskTreatmentEClass.getESuperTypes().add(this.getRiskModelElement());
		identifiedRiskEClass.getESuperTypes().add(this.getRiskModelElement());
		riskAssessmentEClass.getESuperTypes().add(this.getRiskModelElement());
		artifactEClass.getESuperTypes().add(this.getRiskModelElement());
		dataSourceEClass.getESuperTypes().add(this.getRiskModelElement());
		changeEventEClass.getESuperTypes().add(this.getRiskModelElement());
		riskAssessableUnitEClass.getESuperTypes().add(this.getRiskModelElement());
		productEClass.getESuperTypes().add(this.getRiskAssessableUnit());
		productComponentEClass.getESuperTypes().add(this.getRiskAssessableUnit());
		riskRegisterEClass.getESuperTypes().add(this.getRiskModelElement());
		riskRegisterEntryEClass.getESuperTypes().add(this.getRiskModelElement());
		riskNamespaceEClass.getESuperTypes().add(this.getRiskModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(riskModelElementEClass, RiskModelElement.class, "RiskModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskModelElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, RiskModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RiskModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, RiskModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskModelElement_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, RiskModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskLevelEClass, RiskLevel.class, "RiskLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskLevel_Score(), ecorePackage.getEDouble(), "score", null, 0, 1, RiskLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskLevel_Color(), ecorePackage.getEString(), "color", null, 0, 1, RiskLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlCategoryEClass, ControlCategory.class, "ControlCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(riskCategoryEClass, RiskCategory.class, "RiskCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRiskCategory_SubCategories(), this.getRiskCategory(), null, "subCategories", null, 0, -1, RiskCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskCategory_Risks(), this.getRisk(), null, "risks", null, 0, -1, RiskCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskEClass, Risk.class, "Risk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRisk_Triggers(), ecorePackage.getEString(), "triggers", null, 0, -1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_Consequences(), ecorePackage.getEString(), "consequences", null, 0, -1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRisk_RegulatoryReferences(), ecorePackage.getEString(), "regulatoryReferences", null, 0, -1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRisk_RelatedRisks(), this.getRisk(), null, "relatedRisks", null, 0, -1, Risk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Category(), this.getControlCategory(), null, "category", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Type(), this.getControlType(), "type", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Effectiveness(), this.getControlEffectiveness(), "effectiveness", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Automated(), ecorePackage.getEBoolean(), "automated", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_ReviewDate(), ecorePackage.getEDate(), "reviewDate", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_EvidenceUrl(), ecorePackage.getEString(), "evidenceUrl", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionOptionEClass, QuestionOption.class, "QuestionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, QuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionOption_Score(), ecorePackage.getEDouble(), "score", null, 0, 1, QuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionOption_RiskLevel(), this.getRiskLevel(), null, "riskLevel", null, 0, 1, QuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Type(), this.getQuestionType(), "type", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Category(), ecorePackage.getEString(), "category", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Guidance(), ecorePackage.getEString(), "guidance", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_RiskCategory(), this.getRiskCategory(), null, "riskCategory", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Options(), this.getQuestionOption(), null, "options", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionnaire_Version(), ecorePackage.getEString(), "version", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_Applicability(), ecorePackage.getEString(), "applicability", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Questions(), this.getQuestion(), null, "questions", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnswer_Question(), this.getQuestion(), null, "question", null, 1, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Value(), ecorePackage.getEString(), "value", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Score(), ecorePackage.getEDouble(), "score", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionnaireResponseEClass, QuestionnaireResponse.class, "QuestionnaireResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaireResponse_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 1, 1, QuestionnaireResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaireResponse_ResponseDate(), ecorePackage.getEDate(), "responseDate", null, 0, 1, QuestionnaireResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaireResponse_Respondent(), ecorePackage.getEString(), "respondent", null, 0, 1, QuestionnaireResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaireResponse_Answers(), this.getAnswer(), null, "answers", null, 0, -1, QuestionnaireResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaireResponse_TotalScore(), ecorePackage.getEDouble(), "totalScore", null, 0, 1, QuestionnaireResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaireResponse_Level(), this.getRiskLevel(), null, "level", null, 0, 1, QuestionnaireResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreComponentEClass, ScoreComponent.class, "ScoreComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScoreComponent_Score(), ecorePackage.getEDouble(), "score", null, 0, 1, ScoreComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreComponent_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, ScoreComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScoreComponent_Level(), this.getRiskLevel(), null, "level", null, 0, 1, ScoreComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreComponent_Source(), ecorePackage.getEString(), "source", null, 0, 1, ScoreComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScoreComponent_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, ScoreComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findingEClass, Finding.class, "Finding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinding_Severity(), this.getRiskLevel(), null, "severity", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Type(), this.getFindingType(), "type", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Status(), this.getFindingStatus(), "status", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Assignee(), ecorePackage.getEString(), "assignee", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_TicketUrl(), ecorePackage.getEString(), "ticketUrl", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treatmentActionEClass, TreatmentAction.class, "TreatmentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreatmentAction_Assignee(), ecorePackage.getEString(), "assignee", null, 0, 1, TreatmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreatmentAction_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, TreatmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreatmentAction_Status(), this.getActionStatus(), "status", null, 0, 1, TreatmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreatmentAction_TicketUrl(), ecorePackage.getEString(), "ticketUrl", null, 0, 1, TreatmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskTreatmentEClass, RiskTreatment.class, "RiskTreatment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskTreatment_Strategy(), this.getTreatmentStrategy(), "strategy", null, 0, 1, RiskTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskTreatment_TargetDate(), ecorePackage.getEDate(), "targetDate", null, 0, 1, RiskTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskTreatment_Status(), this.getTreatmentStatus(), "status", null, 0, 1, RiskTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskTreatment_Approver(), ecorePackage.getEString(), "approver", null, 0, 1, RiskTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskTreatment_Actions(), this.getTreatmentAction(), null, "actions", null, 0, -1, RiskTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedRiskEClass, IdentifiedRisk.class, "IdentifiedRisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiedRisk_Risk(), this.getRisk(), null, "risk", null, 1, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedRisk_Likelihood(), this.getRiskLevel(), null, "likelihood", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedRisk_Impact(), this.getRiskLevel(), null, "impact", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedRisk_InherentScore(), ecorePackage.getEDouble(), "inherentScore", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedRisk_ResidualScore(), ecorePackage.getEDouble(), "residualScore", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedRisk_ResidualLevel(), this.getRiskLevel(), null, "residualLevel", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedRisk_Status(), this.getRiskStatus(), "status", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedRisk_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedRisk_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedRisk_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedRisk_Treatment(), this.getRiskTreatment(), null, "treatment", null, 0, 1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedRisk_Controls(), this.getControl(), null, "controls", null, 0, -1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedRisk_Findings(), this.getFinding(), null, "findings", null, 0, -1, IdentifiedRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskAssessmentEClass, RiskAssessment.class, "RiskAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskAssessment_AssessmentDate(), ecorePackage.getEDate(), "assessmentDate", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_Assessor(), ecorePackage.getEString(), "assessor", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_Approver(), ecorePackage.getEString(), "approver", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_ReviewDate(), ecorePackage.getEDate(), "reviewDate", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_NextReviewDate(), ecorePackage.getEDate(), "nextReviewDate", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_Status(), this.getAssessmentStatus(), "status", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_Trigger(), this.getChangeEvent(), null, "trigger", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_Scores(), this.getScoreComponent(), null, "scores", null, 0, -1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessment_CompositeScore(), ecorePackage.getEDouble(), "compositeScore", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_ConsolidatedRating(), this.getRiskLevel(), null, "consolidatedRating", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_Findings(), this.getFinding(), null, "findings", null, 0, -1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessment_QuestionnaireResponses(), this.getQuestionnaireResponse(), null, "questionnaireResponses", null, 0, -1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 1, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_ArtifactUrl(), ecorePackage.getEString(), "artifactUrl", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Type(), this.getArtifactType(), "type", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_LastUpdated(), ecorePackage.getEDate(), "lastUpdated", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Metadata(), this.getKeyValuePair(), null, "metadata", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_BaseUrl(), ecorePackage.getEString(), "baseUrl", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeEvent_EventDate(), ecorePackage.getEDate(), "eventDate", null, 0, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeEvent_Type(), this.getChangeEventType(), "type", null, 0, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeEvent_Source(), this.getDataSource(), null, "source", null, 0, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeEvent_Artifact(), this.getArtifact(), null, "artifact", null, 0, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeEvent_Details(), ecorePackage.getEString(), "details", null, 0, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskAssessableUnitEClass, RiskAssessableUnit.class, "RiskAssessableUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskAssessableUnit_DataClassification(), this.getDataClassification(), "dataClassification", null, 0, 1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskAssessableUnit_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_Components(), this.getProductComponent(), null, "components", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_IdentifiedRisks(), this.getIdentifiedRisk(), null, "identifiedRisks", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_Controls(), this.getControl(), null, "controls", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_Questionnaires(), this.getQuestionnaire(), null, "questionnaires", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_QuestionnaireResponses(), this.getQuestionnaireResponse(), null, "questionnaireResponses", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_Assessments(), this.getRiskAssessment(), null, "assessments", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_ChangeEvents(), this.getChangeEvent(), null, "changeEvents", null, 0, -1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskAssessableUnit_CurrentRating(), this.getRiskLevel(), null, "currentRating", null, 0, 1, RiskAssessableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_ProductType(), ecorePackage.getEString(), "productType", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_BusinessLine(), ecorePackage.getEString(), "businessLine", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_DevelopmentTeam(), ecorePackage.getEString(), "developmentTeam", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_TechnologyStack(), ecorePackage.getEString(), "technologyStack", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_UsesPublicCloud(), ecorePackage.getEBoolean(), "usesPublicCloud", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_UsesAI(), ecorePackage.getEBoolean(), "usesAI", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_RegulatoryScope(), ecorePackage.getEString(), "regulatoryScope", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_OnboardingDate(), ecorePackage.getEDate(), "onboardingDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductionDate(), ecorePackage.getEDate(), "productionDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ReviewCycleDays(), ecorePackage.getEInt(), "reviewCycleDays", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productComponentEClass, ProductComponent.class, "ProductComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductComponent_ComponentType(), this.getProductComponentType(), "componentType", null, 0, 1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductComponent_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductComponent_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskRegisterEClass, RiskRegister.class, "RiskRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRiskRegister_Entries(), this.getRiskRegisterEntry(), null, "entries", null, 0, -1, RiskRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskRegister_ReportDate(), ecorePackage.getEDate(), "reportDate", null, 0, 1, RiskRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskRegisterEntryEClass, RiskRegisterEntry.class, "RiskRegisterEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRiskRegisterEntry_RiskAssessableUnit(), this.getRiskAssessableUnit(), null, "riskAssessableUnit", null, 1, 1, RiskRegisterEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskRegisterEntry_IdentifiedRisk(), this.getIdentifiedRisk(), null, "identifiedRisk", null, 1, 1, RiskRegisterEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskNamespaceEClass, RiskNamespace.class, "RiskNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRiskNamespace_RiskLevels(), this.getRiskLevel(), null, "riskLevels", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskNamespace_ControlCategories(), this.getControlCategory(), null, "controlCategories", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskNamespace_RiskCategories(), this.getRiskCategory(), null, "riskCategories", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskNamespace_Questionnaires(), this.getQuestionnaire(), null, "questionnaires", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskNamespace_DataSources(), this.getDataSource(), null, "dataSources", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskNamespace_Products(), this.getProduct(), null, "products", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskNamespace_RiskRegisters(), this.getRiskRegister(), null, "riskRegisters", null, 0, -1, RiskNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataClassificationEEnum, DataClassification.class, "DataClassification");
		addEEnumLiteral(dataClassificationEEnum, DataClassification.PUBLIC);
		addEEnumLiteral(dataClassificationEEnum, DataClassification.INTERNAL);
		addEEnumLiteral(dataClassificationEEnum, DataClassification.CONFIDENTIAL);
		addEEnumLiteral(dataClassificationEEnum, DataClassification.RESTRICTED);
		addEEnumLiteral(dataClassificationEEnum, DataClassification.TOP_SECRET);

		initEEnum(treatmentStrategyEEnum, TreatmentStrategy.class, "TreatmentStrategy");
		addEEnumLiteral(treatmentStrategyEEnum, TreatmentStrategy.ACCEPT);
		addEEnumLiteral(treatmentStrategyEEnum, TreatmentStrategy.AVOID);
		addEEnumLiteral(treatmentStrategyEEnum, TreatmentStrategy.MITIGATE);
		addEEnumLiteral(treatmentStrategyEEnum, TreatmentStrategy.TRANSFER);

		initEEnum(treatmentStatusEEnum, TreatmentStatus.class, "TreatmentStatus");
		addEEnumLiteral(treatmentStatusEEnum, TreatmentStatus.PLANNED);
		addEEnumLiteral(treatmentStatusEEnum, TreatmentStatus.IN_PROGRESS);
		addEEnumLiteral(treatmentStatusEEnum, TreatmentStatus.COMPLETED);
		addEEnumLiteral(treatmentStatusEEnum, TreatmentStatus.OVERDUE);
		addEEnumLiteral(treatmentStatusEEnum, TreatmentStatus.CANCELLED);

		initEEnum(actionStatusEEnum, ActionStatus.class, "ActionStatus");
		addEEnumLiteral(actionStatusEEnum, ActionStatus.PENDING);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.IN_PROGRESS);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.DONE);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.CANCELLED);

		initEEnum(assessmentStatusEEnum, AssessmentStatus.class, "AssessmentStatus");
		addEEnumLiteral(assessmentStatusEEnum, AssessmentStatus.DRAFT);
		addEEnumLiteral(assessmentStatusEEnum, AssessmentStatus.UNDER_REVIEW);
		addEEnumLiteral(assessmentStatusEEnum, AssessmentStatus.APPROVED);
		addEEnumLiteral(assessmentStatusEEnum, AssessmentStatus.REJECTED);
		addEEnumLiteral(assessmentStatusEEnum, AssessmentStatus.OUTDATED);

		initEEnum(riskStatusEEnum, RiskStatus.class, "RiskStatus");
		addEEnumLiteral(riskStatusEEnum, RiskStatus.OPEN);
		addEEnumLiteral(riskStatusEEnum, RiskStatus.ACCEPTED);
		addEEnumLiteral(riskStatusEEnum, RiskStatus.MITIGATED);
		addEEnumLiteral(riskStatusEEnum, RiskStatus.TRANSFERRED);
		addEEnumLiteral(riskStatusEEnum, RiskStatus.CLOSED);

		initEEnum(controlTypeEEnum, ControlType.class, "ControlType");
		addEEnumLiteral(controlTypeEEnum, ControlType.PREVENTIVE);
		addEEnumLiteral(controlTypeEEnum, ControlType.DETECTIVE);
		addEEnumLiteral(controlTypeEEnum, ControlType.CORRECTIVE);
		addEEnumLiteral(controlTypeEEnum, ControlType.COMPENSATING);

		initEEnum(controlEffectivenessEEnum, ControlEffectiveness.class, "ControlEffectiveness");
		addEEnumLiteral(controlEffectivenessEEnum, ControlEffectiveness.HIGH);
		addEEnumLiteral(controlEffectivenessEEnum, ControlEffectiveness.MEDIUM);
		addEEnumLiteral(controlEffectivenessEEnum, ControlEffectiveness.LOW);
		addEEnumLiteral(controlEffectivenessEEnum, ControlEffectiveness.NOT_ASSESSED);

		initEEnum(findingTypeEEnum, FindingType.class, "FindingType");
		addEEnumLiteral(findingTypeEEnum, FindingType.GAP);
		addEEnumLiteral(findingTypeEEnum, FindingType.ISSUE);
		addEEnumLiteral(findingTypeEEnum, FindingType.OBSERVATION);
		addEEnumLiteral(findingTypeEEnum, FindingType.RECOMMENDATION);

		initEEnum(findingStatusEEnum, FindingStatus.class, "FindingStatus");
		addEEnumLiteral(findingStatusEEnum, FindingStatus.OPEN);
		addEEnumLiteral(findingStatusEEnum, FindingStatus.RESOLVED);
		addEEnumLiteral(findingStatusEEnum, FindingStatus.ACCEPTED);
		addEEnumLiteral(findingStatusEEnum, FindingStatus.DEFERRED);

		initEEnum(questionTypeEEnum, QuestionType.class, "QuestionType");
		addEEnumLiteral(questionTypeEEnum, QuestionType.YES_NO);
		addEEnumLiteral(questionTypeEEnum, QuestionType.MULTIPLE_CHOICE);
		addEEnumLiteral(questionTypeEEnum, QuestionType.SINGLE_CHOICE);
		addEEnumLiteral(questionTypeEEnum, QuestionType.TEXT);
		addEEnumLiteral(questionTypeEEnum, QuestionType.RATING);
		addEEnumLiteral(questionTypeEEnum, QuestionType.SCALE);
		addEEnumLiteral(questionTypeEEnum, QuestionType.DATE);

		initEEnum(productComponentTypeEEnum, ProductComponentType.class, "ProductComponentType");
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.REPOSITORY);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.DEPLOYABLE_UNIT);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.EPIC);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.DATABASE);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.API);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.THIRD_PARTY_SERVICE);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.CLOUD_SERVICE);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.AI_MODEL);
		addEEnumLiteral(productComponentTypeEEnum, ProductComponentType.INTEGRATION);

		initEEnum(changeEventTypeEEnum, ChangeEventType.class, "ChangeEventType");
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.NEW_FEATURE);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.ENHANCEMENT);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.DEPLOYMENT);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.SECURITY_VULNERABILITY);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.POLICY_CHANGE);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.REGULATION_CHANGE);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.THREAT_INTELLIGENCE);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.INCIDENT_REPORT);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.VENDOR_CHANGE);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.ARCHITECTURE_CHANGE);
		addEEnumLiteral(changeEventTypeEEnum, ChangeEventType.SCHEDULED_REVIEW);

		initEEnum(artifactTypeEEnum, ArtifactType.class, "ArtifactType");
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.ISSUE);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.EPIC);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.REPOSITORY);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.PIPELINE);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.DEPLOYMENT);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.SCAN_REPORT);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.DOCUMENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (dataClassificationEEnum,
		   source,
		   new String[] {
			   "documentation", "Classification of data handled by a product or component, determining the sensitivity level and applicable controls."
		   });
		addAnnotation
		  (dataClassificationEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Publicly available data with no restrictions."
		   });
		addAnnotation
		  (dataClassificationEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Internal use only; not for public disclosure."
		   });
		addAnnotation
		  (dataClassificationEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Sensitive data requiring restricted access (e.g., customer PII, financial data)."
		   });
		addAnnotation
		  (dataClassificationEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Highly sensitive data with strict access controls (e.g., payment card data, regulated data)."
		   });
		addAnnotation
		  (dataClassificationEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Most sensitive classification requiring maximum security controls."
		   });
		addAnnotation
		  (treatmentStrategyEEnum,
		   source,
		   new String[] {
			   "documentation", "Strategy for treating (responding to) an identified risk."
		   });
		addAnnotation
		  (treatmentStrategyEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Accept the risk without additional controls; typically used for low-impact or low-likelihood risks."
		   });
		addAnnotation
		  (treatmentStrategyEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Eliminate the risk by not engaging in the activity that creates it."
		   });
		addAnnotation
		  (treatmentStrategyEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Reduce the likelihood or impact of the risk through controls."
		   });
		addAnnotation
		  (treatmentStrategyEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Transfer the risk to a third party (e.g., insurance, outsourcing, contracts)."
		   });
		addAnnotation
		  (treatmentStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Current status of a risk treatment plan."
		   });
		addAnnotation
		  (actionStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Current status of a treatment action."
		   });
		addAnnotation
		  (assessmentStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Current lifecycle status of a risk assessment."
		   });
		addAnnotation
		  (assessmentStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Assessment is being authored; not yet submitted for review."
		   });
		addAnnotation
		  (assessmentStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Assessment has been submitted and is awaiting approval."
		   });
		addAnnotation
		  (assessmentStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Assessment has been reviewed and approved by the designated approver."
		   });
		addAnnotation
		  (assessmentStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Assessment was reviewed but rejected; must be revised."
		   });
		addAnnotation
		  (assessmentStatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Assessment was approved but is now past its review date or superseded by a change."
		   });
		addAnnotation
		  (riskStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Lifecycle status of an identified risk."
		   });
		addAnnotation
		  (controlTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "The nature of a risk control."
		   });
		addAnnotation
		  (controlTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Prevents a risk event from occurring (e.g., access controls, encryption)."
		   });
		addAnnotation
		  (controlTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Detects when a risk event has occurred (e.g., monitoring, audits, alerts)."
		   });
		addAnnotation
		  (controlTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Corrects the situation after a risk event (e.g., incident response, backups)."
		   });
		addAnnotation
		  (controlTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Provides an alternative control when a primary control cannot be implemented."
		   });
		addAnnotation
		  (controlEffectivenessEEnum,
		   source,
		   new String[] {
			   "documentation", "Assessed effectiveness of a control in reducing risk."
		   });
		addAnnotation
		  (findingTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "The type of a finding identified during a risk assessment."
		   });
		addAnnotation
		  (findingTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A missing control or capability required by policy or regulation."
		   });
		addAnnotation
		  (findingTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A control deficiency or active problem that increases risk."
		   });
		addAnnotation
		  (findingTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A noteworthy situation that may develop into an issue."
		   });
		addAnnotation
		  (findingTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "A suggested improvement to reduce risk further."
		   });
		addAnnotation
		  (findingStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Lifecycle status of a finding."
		   });
		addAnnotation
		  (questionTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Type of a question in a risk assessment questionnaire."
		   });
		addAnnotation
		  (questionTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Multiple options may be selected."
		   });
		addAnnotation
		  (questionTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Exactly one option must be selected."
		   });
		addAnnotation
		  (questionTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Free-form text answer."
		   });
		addAnnotation
		  (questionTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Numeric rating on a defined scale."
		   });
		addAnnotation
		  (questionTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Response on a sliding scale (e.g., 1-5 or 1-10)."
		   });
		addAnnotation
		  (questionTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Date answer (e.g., last penetration test date)."
		   });
		addAnnotation
		  (productComponentTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Type of a product component representing an independently assessable unit (RAU) below the product level."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A source code repository (e.g., a GitHub/GitLab repo)."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A deployable artifact such as a microservice, container image, or binary."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A Jira Epic or equivalent large work item representing a significant feature or initiative."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "A database or data store."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "An API or service endpoint."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "A third-party service or vendor dependency."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "A public or private cloud service (e.g., AWS S3, Azure Blob)."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "An AI/ML model used as part of the product."
		   });
		addAnnotation
		  (productComponentTypeEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "An integration point with another system."
		   });
		addAnnotation
		  (changeEventTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "The type of change event that may trigger a risk re-assessment."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A new feature or capability is being added to the product."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "An enhancement or modification to an existing feature."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A production deployment event."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "A security vulnerability discovered in a dependency or the product itself."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "An internal policy or standard has changed."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "A change in applicable laws or regulations."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "New threat intelligence relevant to the product\'s risk profile."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "A security or operational incident has been reported."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "A change in a vendor, supplier, or third-party dependency."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "A significant architectural change (e.g., migration to cloud, adoption of AI)."
		   });
		addAnnotation
		  (changeEventTypeEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "A periodic scheduled review is due."
		   });
		addAnnotation
		  (artifactTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Type of artifact in a data source system."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "An issue, ticket, or work item (e.g., Jira issue)."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A large work item such as a Jira Epic."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A source code repository."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "A CI/CD pipeline."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "A deployment to an environment."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "A security or code quality scan report."
		   });
		addAnnotation
		  (artifactTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "A document such as an architecture decision record, design document, or policy."
		   });
		addAnnotation
		  (riskModelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base class for all elements in the risk model. Provides common identification and documentation attributes."
		   });
		addAnnotation
		  (getRiskModelElement_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier for this element within its container. Used for cross-referencing between model elements."
		   });
		addAnnotation
		  (getRiskModelElement_Name(),
		   source,
		   new String[] {
			   "documentation", "Human-readable display name."
		   });
		addAnnotation
		  (getRiskModelElement_Description(),
		   source,
		   new String[] {
			   "documentation", "Detailed description. May contain Markdown content."
		   });
		addAnnotation
		  (getRiskModelElement_Uri(),
		   source,
		   new String[] {
			   "documentation", "Optional URI linking to an external resource (e.g., documentation, Confluence page)."
		   });
		addAnnotation
		  (riskLevelEClass,
		   source,
		   new String[] {
			   "documentation", "A defined risk level or rating (e.g., Critical, High, Medium, Low). Risk levels are ordered by their score value and used for likelihood, impact, and consolidated ratings."
		   });
		addAnnotation
		  (getRiskLevel_Score(),
		   source,
		   new String[] {
			   "documentation", "Numeric score associated with this level for quantitative calculations and aggregations."
		   });
		addAnnotation
		  (getRiskLevel_Color(),
		   source,
		   new String[] {
			   "documentation", "HTML color code for visualization in dashboards and reports (e.g., #FF0000 for red)."
		   });
		addAnnotation
		  (controlCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "A category of risk controls (e.g., Technical, Administrative, Physical, Legal)."
		   });
		addAnnotation
		  (riskCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "A category of risks in the risk taxonomy (e.g., Cybersecurity, Operational, Compliance, Financial, Reputational). Risk categories can be nested to form a hierarchy."
		   });
		addAnnotation
		  (getRiskCategory_SubCategories(),
		   source,
		   new String[] {
			   "documentation", "Sub-categories of this risk category, forming a hierarchy (e.g., Cybersecurity > Data Breach, Cybersecurity > DDoS)."
		   });
		addAnnotation
		  (getRiskCategory_Risks(),
		   source,
		   new String[] {
			   "documentation", "Risk types catalogued under this category."
		   });
		addAnnotation
		  (riskEClass,
		   source,
		   new String[] {
			   "documentation", "A defined type of risk in the risk catalog/ontology. Represents a potential negative outcome or threat that can be assessed against Risk Assessable Units."
		   });
		addAnnotation
		  (getRisk_Triggers(),
		   source,
		   new String[] {
			   "documentation", "Events or conditions that may cause this risk to materialize (risk triggers/causes)."
		   });
		addAnnotation
		  (getRisk_Consequences(),
		   source,
		   new String[] {
			   "documentation", "Potential consequences or impacts if this risk materializes."
		   });
		addAnnotation
		  (getRisk_RegulatoryReferences(),
		   source,
		   new String[] {
			   "documentation", "References to regulations, standards, or policies related to this risk (e.g., PCI-DSS 3.2, GDPR Article 32, FFIEC CAT)."
		   });
		addAnnotation
		  (getRisk_RelatedRisks(),
		   source,
		   new String[] {
			   "documentation", "Other risks in the catalog that are related to or can compound this risk."
		   });
		addAnnotation
		  (controlEClass,
		   source,
		   new String[] {
			   "documentation", "A risk control measure that reduces the likelihood or impact of a risk. Controls can be shared across multiple identified risks."
		   });
		addAnnotation
		  (getControl_Category(),
		   source,
		   new String[] {
			   "documentation", "The category of this control (e.g., Technical, Administrative)."
		   });
		addAnnotation
		  (getControl_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of control: Preventive, Detective, Corrective, or Compensating."
		   });
		addAnnotation
		  (getControl_Effectiveness(),
		   source,
		   new String[] {
			   "documentation", "Assessed effectiveness of this control in reducing risk."
		   });
		addAnnotation
		  (getControl_Automated(),
		   source,
		   new String[] {
			   "documentation", "Whether this control is automated (true) or manual (false)."
		   });
		addAnnotation
		  (getControl_Owner(),
		   source,
		   new String[] {
			   "documentation", "Person or team responsible for maintaining and operating this control."
		   });
		addAnnotation
		  (getControl_ReviewDate(),
		   source,
		   new String[] {
			   "documentation", "Date when this control was last reviewed for effectiveness."
		   });
		addAnnotation
		  (getControl_EvidenceUrl(),
		   source,
		   new String[] {
			   "documentation", "URL to evidence demonstrating this control is in place and operating effectively."
		   });
		addAnnotation
		  (questionOptionEClass,
		   source,
		   new String[] {
			   "documentation", "A selectable option for a choice-type question in a risk assessment questionnaire."
		   });
		addAnnotation
		  (getQuestionOption_Value(),
		   source,
		   new String[] {
			   "documentation", "The machine-readable value stored when this option is selected."
		   });
		addAnnotation
		  (getQuestionOption_Score(),
		   source,
		   new String[] {
			   "documentation", "Numeric score contribution when this option is selected, used for risk scoring aggregation."
		   });
		addAnnotation
		  (getQuestionOption_RiskLevel(),
		   source,
		   new String[] {
			   "documentation", "The risk level implied by selecting this option."
		   });
		addAnnotation
		  (questionEClass,
		   source,
		   new String[] {
			   "documentation", "A question in a risk assessment questionnaire. Questions can address topics such as cloud usage, AI adoption, data classification, third-party dependencies, and security controls."
		   });
		addAnnotation
		  (getQuestion_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of question (determines the expected answer format)."
		   });
		addAnnotation
		  (getQuestion_Required(),
		   source,
		   new String[] {
			   "documentation", "Whether this question must be answered for a questionnaire response to be complete."
		   });
		addAnnotation
		  (getQuestion_Category(),
		   source,
		   new String[] {
			   "documentation", "Grouping category within the questionnaire (e.g., Cloud, AI, Data, Third-Party, Security)."
		   });
		addAnnotation
		  (getQuestion_Guidance(),
		   source,
		   new String[] {
			   "documentation", "Guidance text to help respondents understand what is being asked."
		   });
		addAnnotation
		  (getQuestion_Weight(),
		   source,
		   new String[] {
			   "documentation", "Weight of this question in the overall questionnaire score calculation."
		   });
		addAnnotation
		  (getQuestion_RiskCategory(),
		   source,
		   new String[] {
			   "documentation", "The risk category this question primarily addresses."
		   });
		addAnnotation
		  (getQuestion_Options(),
		   source,
		   new String[] {
			   "documentation", "Selectable options for choice-type questions."
		   });
		addAnnotation
		  (questionnaireEClass,
		   source,
		   new String[] {
			   "documentation", "A structured set of questions used to gather information for a risk assessment. Questionnaires may contain hundreds of questions covering topics like public cloud use, AI adoption, data classification, third-party dependencies, and security controls. Different questionnaires may apply to different types of products or change triggers."
		   });
		addAnnotation
		  (getQuestionnaire_Version(),
		   source,
		   new String[] {
			   "documentation", "Version identifier for this questionnaire (e.g., 2.1, 2024-Q1)."
		   });
		addAnnotation
		  (getQuestionnaire_Applicability(),
		   source,
		   new String[] {
			   "documentation", "Description of when/where this questionnaire applies (e.g., all new products, products using public cloud, AI-enabled features)."
		   });
		addAnnotation
		  (getQuestionnaire_Questions(),
		   source,
		   new String[] {
			   "documentation", "Ordered list of questions in this questionnaire."
		   });
		addAnnotation
		  (answerEClass,
		   source,
		   new String[] {
			   "documentation", "An answer to a single question within a questionnaire response."
		   });
		addAnnotation
		  (getAnswer_Question(),
		   source,
		   new String[] {
			   "documentation", "The question being answered."
		   });
		addAnnotation
		  (getAnswer_Value(),
		   source,
		   new String[] {
			   "documentation", "The answer value (text, selected option value, or numeric score as string)."
		   });
		addAnnotation
		  (getAnswer_Score(),
		   source,
		   new String[] {
			   "documentation", "Computed risk score contribution from this answer."
		   });
		addAnnotation
		  (getAnswer_Notes(),
		   source,
		   new String[] {
			   "documentation", "Additional notes or justification provided by the respondent."
		   });
		addAnnotation
		  (questionnaireResponseEClass,
		   source,
		   new String[] {
			   "documentation", "A completed response to a questionnaire for a specific Risk Assessable Unit. The response is linked back to the questionnaire used and contains answers to all applicable questions."
		   });
		addAnnotation
		  (getQuestionnaireResponse_Questionnaire(),
		   source,
		   new String[] {
			   "documentation", "The questionnaire that was completed."
		   });
		addAnnotation
		  (getQuestionnaireResponse_ResponseDate(),
		   source,
		   new String[] {
			   "documentation", "Date when this questionnaire was completed."
		   });
		addAnnotation
		  (getQuestionnaireResponse_Respondent(),
		   source,
		   new String[] {
			   "documentation", "Name or identifier of the person who completed this questionnaire."
		   });
		addAnnotation
		  (getQuestionnaireResponse_Answers(),
		   source,
		   new String[] {
			   "documentation", "Answers to individual questions in the questionnaire."
		   });
		addAnnotation
		  (getQuestionnaireResponse_TotalScore(),
		   source,
		   new String[] {
			   "documentation", "Aggregated risk score computed from all weighted answers."
		   });
		addAnnotation
		  (getQuestionnaireResponse_Level(),
		   source,
		   new String[] {
			   "documentation", "The overall risk level derived from the questionnaire total score."
		   });
		addAnnotation
		  (scoreComponentEClass,
		   source,
		   new String[] {
			   "documentation", "A single scored dimension within a risk assessment, such as inherent risk, control effectiveness, or a specific questionnaire category score. Multiple score components are aggregated into a composite score."
		   });
		addAnnotation
		  (getScoreComponent_Score(),
		   source,
		   new String[] {
			   "documentation", "The numeric score for this component."
		   });
		addAnnotation
		  (getScoreComponent_Weight(),
		   source,
		   new String[] {
			   "documentation", "Weight of this component in the composite score calculation (0-1, where all weights should sum to 1)."
		   });
		addAnnotation
		  (getScoreComponent_Level(),
		   source,
		   new String[] {
			   "documentation", "The risk level corresponding to this component\'s score."
		   });
		addAnnotation
		  (getScoreComponent_Source(),
		   source,
		   new String[] {
			   "documentation", "Source or basis for this score (e.g., questionnaire response, SAST scan, manual assessment)."
		   });
		addAnnotation
		  (getScoreComponent_Notes(),
		   source,
		   new String[] {
			   "documentation", "Notes explaining the rationale for this score."
		   });
		addAnnotation
		  (findingEClass,
		   source,
		   new String[] {
			   "documentation", "An observation, gap, issue, or recommendation identified during a risk assessment."
		   });
		addAnnotation
		  (getFinding_Severity(),
		   source,
		   new String[] {
			   "documentation", "The severity of this finding."
		   });
		addAnnotation
		  (getFinding_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of finding: Gap, Issue, Observation, or Recommendation."
		   });
		addAnnotation
		  (getFinding_Status(),
		   source,
		   new String[] {
			   "documentation", "Current lifecycle status of this finding."
		   });
		addAnnotation
		  (getFinding_DueDate(),
		   source,
		   new String[] {
			   "documentation", "Target date for resolving this finding."
		   });
		addAnnotation
		  (getFinding_Assignee(),
		   source,
		   new String[] {
			   "documentation", "Person or team assigned to address this finding."
		   });
		addAnnotation
		  (getFinding_TicketUrl(),
		   source,
		   new String[] {
			   "documentation", "URL to the work item tracking resolution of this finding (e.g., Jira ticket)."
		   });
		addAnnotation
		  (treatmentActionEClass,
		   source,
		   new String[] {
			   "documentation", "A specific actionable step within a risk treatment plan."
		   });
		addAnnotation
		  (getTreatmentAction_Assignee(),
		   source,
		   new String[] {
			   "documentation", "Person or team responsible for executing this action."
		   });
		addAnnotation
		  (getTreatmentAction_DueDate(),
		   source,
		   new String[] {
			   "documentation", "Target completion date for this action."
		   });
		addAnnotation
		  (getTreatmentAction_Status(),
		   source,
		   new String[] {
			   "documentation", "Current status of this action."
		   });
		addAnnotation
		  (getTreatmentAction_TicketUrl(),
		   source,
		   new String[] {
			   "documentation", "URL to the work item or task tracking this action (e.g., Jira ticket, GitHub issue)."
		   });
		addAnnotation
		  (riskTreatmentEClass,
		   source,
		   new String[] {
			   "documentation", "A plan for treating (responding to) an identified risk, including the chosen strategy and specific actions."
		   });
		addAnnotation
		  (getRiskTreatment_Strategy(),
		   source,
		   new String[] {
			   "documentation", "The treatment strategy: Accept, Avoid, Mitigate, or Transfer."
		   });
		addAnnotation
		  (getRiskTreatment_TargetDate(),
		   source,
		   new String[] {
			   "documentation", "Target date for completing the treatment."
		   });
		addAnnotation
		  (getRiskTreatment_Status(),
		   source,
		   new String[] {
			   "documentation", "Current status of the treatment plan."
		   });
		addAnnotation
		  (getRiskTreatment_Approver(),
		   source,
		   new String[] {
			   "documentation", "Person who approved this treatment strategy (required for Accept strategy in some governance frameworks)."
		   });
		addAnnotation
		  (getRiskTreatment_Actions(),
		   source,
		   new String[] {
			   "documentation", "Specific actions to be taken as part of this treatment plan."
		   });
		addAnnotation
		  (identifiedRiskEClass,
		   source,
		   new String[] {
			   "documentation", "A specific risk identified for a Risk Assessable Unit, including its assessed likelihood, impact, and treatment information."
		   });
		addAnnotation
		  (getIdentifiedRisk_Risk(),
		   source,
		   new String[] {
			   "documentation", "Reference to the risk type in the risk catalog."
		   });
		addAnnotation
		  (getIdentifiedRisk_Likelihood(),
		   source,
		   new String[] {
			   "documentation", "Assessed likelihood of this risk occurring (inherent, before controls)."
		   });
		addAnnotation
		  (getIdentifiedRisk_Impact(),
		   source,
		   new String[] {
			   "documentation", "Assessed potential impact if this risk materializes (inherent, before controls)."
		   });
		addAnnotation
		  (getIdentifiedRisk_InherentScore(),
		   source,
		   new String[] {
			   "documentation", "Overall inherent risk score before controls are applied (typically likelihood score * impact score)."
		   });
		addAnnotation
		  (getIdentifiedRisk_ResidualScore(),
		   source,
		   new String[] {
			   "documentation", "Residual risk score after applying controls."
		   });
		addAnnotation
		  (getIdentifiedRisk_ResidualLevel(),
		   source,
		   new String[] {
			   "documentation", "The resulting risk level after applying controls (residual risk rating)."
		   });
		addAnnotation
		  (getIdentifiedRisk_Status(),
		   source,
		   new String[] {
			   "documentation", "Current lifecycle status of this identified risk."
		   });
		addAnnotation
		  (getIdentifiedRisk_Owner(),
		   source,
		   new String[] {
			   "documentation", "Person or team responsible for managing and monitoring this risk."
		   });
		addAnnotation
		  (getIdentifiedRisk_DueDate(),
		   source,
		   new String[] {
			   "documentation", "Target date for bringing this risk to an acceptable level."
		   });
		addAnnotation
		  (getIdentifiedRisk_Notes(),
		   source,
		   new String[] {
			   "documentation", "Additional context, rationale, or notes about this risk."
		   });
		addAnnotation
		  (getIdentifiedRisk_Treatment(),
		   source,
		   new String[] {
			   "documentation", "The treatment plan for this risk."
		   });
		addAnnotation
		  (getIdentifiedRisk_Controls(),
		   source,
		   new String[] {
			   "documentation", "Controls applied to reduce this risk."
		   });
		addAnnotation
		  (getIdentifiedRisk_Findings(),
		   source,
		   new String[] {
			   "documentation", "Findings related to this risk."
		   });
		addAnnotation
		  (riskAssessmentEClass,
		   source,
		   new String[] {
			   "documentation", "A risk assessment performed on a Risk Assessable Unit at a specific point in time. Assessments are triggered initially, periodically (scheduled review), or when a change is detected. The assessment captures individual scores, a consolidated rating, and findings."
		   });
		addAnnotation
		  (getRiskAssessment_AssessmentDate(),
		   source,
		   new String[] {
			   "documentation", "Date when this assessment was performed."
		   });
		addAnnotation
		  (getRiskAssessment_Assessor(),
		   source,
		   new String[] {
			   "documentation", "Person or system that performed this assessment."
		   });
		addAnnotation
		  (getRiskAssessment_Approver(),
		   source,
		   new String[] {
			   "documentation", "Person who reviewed and approved this assessment."
		   });
		addAnnotation
		  (getRiskAssessment_ReviewDate(),
		   source,
		   new String[] {
			   "documentation", "Date when this assessment was reviewed and approved."
		   });
		addAnnotation
		  (getRiskAssessment_NextReviewDate(),
		   source,
		   new String[] {
			   "documentation", "Scheduled date for the next periodic re-assessment."
		   });
		addAnnotation
		  (getRiskAssessment_Status(),
		   source,
		   new String[] {
			   "documentation", "Current lifecycle status of this assessment."
		   });
		addAnnotation
		  (getRiskAssessment_Trigger(),
		   source,
		   new String[] {
			   "documentation", "The change event that triggered this assessment, if it was event-driven rather than a scheduled review."
		   });
		addAnnotation
		  (getRiskAssessment_Scores(),
		   source,
		   new String[] {
			   "documentation", "Individual score components that feed into the consolidated rating."
		   });
		addAnnotation
		  (getRiskAssessment_CompositeScore(),
		   source,
		   new String[] {
			   "documentation", "The aggregated composite risk score computed from all weighted score components."
		   });
		addAnnotation
		  (getRiskAssessment_ConsolidatedRating(),
		   source,
		   new String[] {
			   "documentation", "The overall consolidated risk rating derived from the composite score."
		   });
		addAnnotation
		  (getRiskAssessment_Findings(),
		   source,
		   new String[] {
			   "documentation", "Findings (gaps, issues, recommendations) identified during this assessment."
		   });
		addAnnotation
		  (getRiskAssessment_QuestionnaireResponses(),
		   source,
		   new String[] {
			   "documentation", "Questionnaire responses used as input for this assessment."
		   });
		addAnnotation
		  (keyValuePairEClass,
		   source,
		   new String[] {
			   "documentation", "A generic key-value pair used for flexible metadata on artifacts."
		   });
		addAnnotation
		  (getKeyValuePair_Key(),
		   source,
		   new String[] {
			   "documentation", "Metadata key."
		   });
		addAnnotation
		  (getKeyValuePair_Value(),
		   source,
		   new String[] {
			   "documentation", "Metadata value."
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation", "An artifact in an external data source system (e.g., a Jira Epic, a GitHub repository, a CI/CD pipeline) that is relevant to risk assessment. Some artifacts are Risk Assessable Units (RAUs) themselves."
		   });
		addAnnotation
		  (getArtifact_ExternalId(),
		   source,
		   new String[] {
			   "documentation", "Identifier of this artifact in the source system (e.g., Jira issue key, GitHub repo name)."
		   });
		addAnnotation
		  (getArtifact_ArtifactUrl(),
		   source,
		   new String[] {
			   "documentation", "URL to this artifact in the source system."
		   });
		addAnnotation
		  (getArtifact_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of this artifact."
		   });
		addAnnotation
		  (getArtifact_LastUpdated(),
		   source,
		   new String[] {
			   "documentation", "Date/time when this artifact was last updated in the source system."
		   });
		addAnnotation
		  (getArtifact_Metadata(),
		   source,
		   new String[] {
			   "documentation", "Additional metadata from the source system stored as key-value pairs."
		   });
		addAnnotation
		  (dataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "A source system from which risk-relevant data is collected (e.g., Jira, GitHub, GitLab, SonarQube, Veracode, ServiceNow, AWS Security Hub). Data sources are polled or receive events to detect changes that may trigger risk re-assessments."
		   });
		addAnnotation
		  (getDataSource_Type(),
		   source,
		   new String[] {
			   "documentation", "Type/system name of this data source (e.g., Jira, GitHub, SonarQube, ServiceNow)."
		   });
		addAnnotation
		  (getDataSource_BaseUrl(),
		   source,
		   new String[] {
			   "documentation", "Base URL of this data source system."
		   });
		addAnnotation
		  (getDataSource_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Artifacts (tracked items) in this data source."
		   });
		addAnnotation
		  (changeEventEClass,
		   source,
		   new String[] {
			   "documentation", "An event representing a change detected in a data source that may require risk re-assessment. Change events are the mechanism by which the risk model is kept current with the state of the products being assessed."
		   });
		addAnnotation
		  (getChangeEvent_EventDate(),
		   source,
		   new String[] {
			   "documentation", "Date and time when this change occurred."
		   });
		addAnnotation
		  (getChangeEvent_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of change that occurred."
		   });
		addAnnotation
		  (getChangeEvent_Source(),
		   source,
		   new String[] {
			   "documentation", "The data source in which this change was detected."
		   });
		addAnnotation
		  (getChangeEvent_Artifact(),
		   source,
		   new String[] {
			   "documentation", "The specific artifact that changed."
		   });
		addAnnotation
		  (getChangeEvent_Details(),
		   source,
		   new String[] {
			   "documentation", "Additional details about what changed (e.g., CVE ID for a vulnerability, regulation name for a policy change)."
		   });
		addAnnotation
		  (riskAssessableUnitEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base class for all Risk Assessable Units (RAUs). An RAU is an entity at the right level of granularity to be independently assessed for risk. Examples of RAUs include a bank digital product, a Jira Epic, a code repository, or a deployable unit. Individual stories/tasks, source files, etc., are not RAUs. RAUs form a hierarchy - a product contains components which may themselves be RAUs."
		   });
		addAnnotation
		  (getRiskAssessableUnit_DataClassification(),
		   source,
		   new String[] {
			   "documentation", "The highest data classification level handled by this RAU."
		   });
		addAnnotation
		  (getRiskAssessableUnit_Owner(),
		   source,
		   new String[] {
			   "documentation", "Person or team responsible for this RAU and its risk posture."
		   });
		addAnnotation
		  (getRiskAssessableUnit_Components(),
		   source,
		   new String[] {
			   "documentation", "Sub-components of this RAU that are themselves independently risk assessable."
		   });
		addAnnotation
		  (getRiskAssessableUnit_IdentifiedRisks(),
		   source,
		   new String[] {
			   "documentation", "Risks identified for this RAU."
		   });
		addAnnotation
		  (getRiskAssessableUnit_Controls(),
		   source,
		   new String[] {
			   "documentation", "Controls in place for this RAU that reduce the likelihood or impact of identified risks."
		   });
		addAnnotation
		  (getRiskAssessableUnit_Questionnaires(),
		   source,
		   new String[] {
			   "documentation", "Questionnaires applicable to this RAU."
		   });
		addAnnotation
		  (getRiskAssessableUnit_QuestionnaireResponses(),
		   source,
		   new String[] {
			   "documentation", "Completed questionnaire responses for this RAU."
		   });
		addAnnotation
		  (getRiskAssessableUnit_Assessments(),
		   source,
		   new String[] {
			   "documentation", "Risk assessments performed on this RAU, ordered by date (most recent last)."
		   });
		addAnnotation
		  (getRiskAssessableUnit_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Artifacts in external data sources that are associated with this RAU (e.g., the Jira Epic, GitHub repo, deployment pipeline)."
		   });
		addAnnotation
		  (getRiskAssessableUnit_ChangeEvents(),
		   source,
		   new String[] {
			   "documentation", "Change events detected for this RAU."
		   });
		addAnnotation
		  (getRiskAssessableUnit_CurrentRating(),
		   source,
		   new String[] {
			   "documentation", "The current consolidated risk rating from the most recent approved assessment."
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "documentation", "A bank digital product or application being developed or maintained. This is the top-level Risk Assessable Unit. Product management creates the initial entry for the product in Jira or another system when development begins. The product is then assessed and re-assessed over its lifecycle."
		   });
		addAnnotation
		  (getProduct_ProductType(),
		   source,
		   new String[] {
			   "documentation", "Type of product (e.g., Web Application, Mobile App, API, Batch Process, Internal Tool, Data Platform)."
		   });
		addAnnotation
		  (getProduct_BusinessLine(),
		   source,
		   new String[] {
			   "documentation", "The business line or division that owns this product."
		   });
		addAnnotation
		  (getProduct_DevelopmentTeam(),
		   source,
		   new String[] {
			   "documentation", "Development team or squad responsible for building and maintaining this product."
		   });
		addAnnotation
		  (getProduct_TechnologyStack(),
		   source,
		   new String[] {
			   "documentation", "Technologies used in this product (e.g., Java, Spring Boot, React, PostgreSQL, AWS)."
		   });
		addAnnotation
		  (getProduct_UsesPublicCloud(),
		   source,
		   new String[] {
			   "documentation", "Whether this product uses public cloud infrastructure (triggers additional cloud-risk questionnaire)."
		   });
		addAnnotation
		  (getProduct_UsesAI(),
		   source,
		   new String[] {
			   "documentation", "Whether this product incorporates AI/ML capabilities (triggers additional AI-risk questionnaire and governance review)."
		   });
		addAnnotation
		  (getProduct_RegulatoryScope(),
		   source,
		   new String[] {
			   "documentation", "Regulations or standards this product must comply with (e.g., PCI-DSS, GDPR, SOX, FFIEC)."
		   });
		addAnnotation
		  (getProduct_OnboardingDate(),
		   source,
		   new String[] {
			   "documentation", "Date when the product was first registered for risk assessment."
		   });
		addAnnotation
		  (getProduct_ProductionDate(),
		   source,
		   new String[] {
			   "documentation", "Date when the product went live in production."
		   });
		addAnnotation
		  (getProduct_ReviewCycleDays(),
		   source,
		   new String[] {
			   "documentation", "Required review cycle in days for the risk assessment (e.g., 365 for annual, 180 for semi-annual). May vary by risk rating."
		   });
		addAnnotation
		  (productComponentEClass,
		   source,
		   new String[] {
			   "documentation", "A component of a bank digital product that is itself a Risk Assessable Unit (RAU). Examples include Jira Epics (but not stories or sub-tasks), code repositories, deployable units (microservices, containers), databases, and APIs. Smaller granularity items (individual source files, stories, sub-tasks) are not RAUs."
		   });
		addAnnotation
		  (getProductComponent_ComponentType(),
		   source,
		   new String[] {
			   "documentation", "The type of this product component."
		   });
		addAnnotation
		  (getProductComponent_Version(),
		   source,
		   new String[] {
			   "documentation", "Version identifier for this component."
		   });
		addAnnotation
		  (getProductComponent_Environment(),
		   source,
		   new String[] {
			   "documentation", "Deployment environment (e.g., Development, Staging, Production)."
		   });
		addAnnotation
		  (riskRegisterEClass,
		   source,
		   new String[] {
			   "documentation", "A risk register that aggregates identified risks across multiple Risk Assessable Units. The register provides a consolidated view of the risk landscape and is used for reporting to management and risk committees."
		   });
		addAnnotation
		  (getRiskRegister_Entries(),
		   source,
		   new String[] {
			   "documentation", "Entries in this risk register."
		   });
		addAnnotation
		  (getRiskRegister_ReportDate(),
		   source,
		   new String[] {
			   "documentation", "Date of this risk register snapshot."
		   });
		addAnnotation
		  (riskRegisterEntryEClass,
		   source,
		   new String[] {
			   "documentation", "An entry in the risk register linking an identified risk to its RAU and current assessment."
		   });
		addAnnotation
		  (getRiskRegisterEntry_RiskAssessableUnit(),
		   source,
		   new String[] {
			   "documentation", "The RAU to which this risk register entry applies."
		   });
		addAnnotation
		  (getRiskRegisterEntry_IdentifiedRisk(),
		   source,
		   new String[] {
			   "documentation", "The identified risk captured in this register entry."
		   });
		addAnnotation
		  (riskNamespaceEClass,
		   source,
		   new String[] {
			   "documentation", "Root container for the risk management model. Holds the risk taxonomy (categories, risk types), risk levels, control categories, questionnaires, data sources, and products. Serves as the shared ontology/dictionary for the organization\'s risk management terminology. Also contains the products subject to risk assessment and the data sources from which risk-relevant data is collected."
		   });
		addAnnotation
		  (getRiskNamespace_RiskLevels(),
		   source,
		   new String[] {
			   "documentation", "Defined risk levels (e.g., Critical, High, Medium, Low) ordered by score. These levels are used for likelihood, impact, and consolidated risk ratings."
		   });
		addAnnotation
		  (getRiskNamespace_ControlCategories(),
		   source,
		   new String[] {
			   "documentation", "Categories of risk controls used in this organization (e.g., Technical, Administrative, Physical, Legal)."
		   });
		addAnnotation
		  (getRiskNamespace_RiskCategories(),
		   source,
		   new String[] {
			   "documentation", "Root risk categories in the organization\'s risk taxonomy. Forms the shared risk dictionary/ontology."
		   });
		addAnnotation
		  (getRiskNamespace_Questionnaires(),
		   source,
		   new String[] {
			   "documentation", "Risk assessment questionnaires available in this organization. Different questionnaires may apply to different product types or change triggers."
		   });
		addAnnotation
		  (getRiskNamespace_DataSources(),
		   source,
		   new String[] {
			   "documentation", "External data sources (Jira, GitHub, SonarQube, etc.) from which risk-relevant artifacts and change events are collected."
		   });
		addAnnotation
		  (getRiskNamespace_Products(),
		   source,
		   new String[] {
			   "documentation", "Bank digital products subject to risk assessment."
		   });
		addAnnotation
		  (getRiskNamespace_RiskRegisters(),
		   source,
		   new String[] {
			   "documentation", "Risk registers providing consolidated views of the risk landscape."
		   });
	}

} //RiskPackageImpl
