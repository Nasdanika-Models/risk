/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.risk.RiskFactory
 * @model kind="package"
 * @generated
 */
public interface RiskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "risk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/risk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.risk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiskPackage eINSTANCE = org.nasdanika.models.risk.impl.RiskPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskModelElementImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskModelElement()
	 * @generated
	 */
	int RISK_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MODEL_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MODEL_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MODEL_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MODEL_ELEMENT__URI = 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MODEL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskLevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskLevelImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__COLOR = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ControlCategoryImpl <em>Control Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ControlCategoryImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControlCategory()
	 * @generated
	 */
	int CONTROL_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATEGORY__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATEGORY__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATEGORY__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATEGORY__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>Control Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATEGORY_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CATEGORY_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskCategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskCategoryImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskCategory()
	 * @generated
	 */
	int RISK_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY__SUB_CATEGORIES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY__RISKS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_CATEGORY_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__TRIGGERS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__CONSEQUENCES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regulatory References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__REGULATORY_REFERENCES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__RELATED_RISKS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ControlImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CATEGORY = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TYPE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effectiveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__EFFECTIVENESS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__AUTOMATED = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OWNER = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__REVIEW_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Evidence Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__EVIDENCE_URL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.QuestionOptionImpl <em>Question Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.QuestionOptionImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionOption()
	 * @generated
	 */
	int QUESTION_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__VALUE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Risk Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION__RISK_LEVEL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Question Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Question Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPTION_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.QuestionImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRED = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CATEGORY = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__GUIDANCE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__WEIGHT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Risk Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RISK_CATEGORY = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTIONS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.QuestionnaireImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__VERSION = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__APPLICABILITY = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTIONS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.AnswerImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__QUESTION = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__VALUE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__NOTES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl <em>Questionnaire Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.QuestionnaireResponseImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionnaireResponse()
	 * @generated
	 */
	int QUESTIONNAIRE_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__RESPONSE_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Respondent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__RESPONDENT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__ANSWERS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__TOTAL_SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE__LEVEL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Questionnaire Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Questionnaire Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_RESPONSE_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ScoreComponentImpl <em>Score Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ScoreComponentImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getScoreComponent()
	 * @generated
	 */
	int SCORE_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__WEIGHT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__LEVEL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__SOURCE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT__NOTES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Score Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Score Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_COMPONENT_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.FindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.FindingImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__SEVERITY = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__TYPE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__STATUS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DUE_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ASSIGNEE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ticket Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__TICKET_URL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.TreatmentActionImpl <em>Treatment Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.TreatmentActionImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getTreatmentAction()
	 * @generated
	 */
	int TREATMENT_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__ASSIGNEE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__DUE_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__STATUS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ticket Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION__TICKET_URL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Treatment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Treatment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_ACTION_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskTreatmentImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskTreatment()
	 * @generated
	 */
	int RISK_TREATMENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__STRATEGY = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__TARGET_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__STATUS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Approver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__APPROVER = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT__ACTIONS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_TREATMENT_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl <em>Identified Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.IdentifiedRiskImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getIdentifiedRisk()
	 * @generated
	 */
	int IDENTIFIED_RISK = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__RISK = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__LIKELIHOOD = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__IMPACT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inherent Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__INHERENT_SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Residual Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__RESIDUAL_SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Residual Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__RESIDUAL_LEVEL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__STATUS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__OWNER = RISK_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__DUE_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__NOTES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__TREATMENT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__CONTROLS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK__FINDINGS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Identified Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Identified Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_RISK_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskAssessmentImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskAssessment()
	 * @generated
	 */
	int RISK_ASSESSMENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Assessment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__ASSESSMENT_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__ASSESSOR = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Approver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__APPROVER = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__REVIEW_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Next Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__NEXT_REVIEW_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__STATUS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__TRIGGER = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__SCORES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Composite Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__COMPOSITE_SCORE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Consolidated Rating</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__CONSOLIDATED_RATING = RISK_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__FINDINGS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Questionnaire Responses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.KeyValuePairImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ArtifactImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXTERNAL_ID = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ARTIFACT_URL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TYPE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LAST_UPDATED = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__METADATA = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.DataSourceImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TYPE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__BASE_URL = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ARTIFACTS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ChangeEventImpl <em>Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ChangeEventImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getChangeEvent()
	 * @generated
	 */
	int CHANGE_EVENT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__EVENT_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__TYPE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__SOURCE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__ARTIFACT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__DETAILS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl <em>Assessable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskAssessableUnitImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskAssessableUnit()
	 * @generated
	 */
	int RISK_ASSESSABLE_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Data Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__OWNER = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__COMPONENTS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identified Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__CONTROLS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Questionnaires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__QUESTIONNAIRES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Questionnaire Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__ASSESSMENTS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__ARTIFACTS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Change Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__CHANGE_EVENTS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Current Rating</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT__CURRENT_RATING = RISK_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Assessable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Assessable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSABLE_UNIT_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ProductImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = RISK_ASSESSABLE_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = RISK_ASSESSABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = RISK_ASSESSABLE_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__URI = RISK_ASSESSABLE_UNIT__URI;

	/**
	 * The feature id for the '<em><b>Data Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DATA_CLASSIFICATION = RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OWNER = RISK_ASSESSABLE_UNIT__OWNER;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COMPONENTS = RISK_ASSESSABLE_UNIT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Identified Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IDENTIFIED_RISKS = RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONTROLS = RISK_ASSESSABLE_UNIT__CONTROLS;

	/**
	 * The feature id for the '<em><b>Questionnaires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUESTIONNAIRES = RISK_ASSESSABLE_UNIT__QUESTIONNAIRES;

	/**
	 * The feature id for the '<em><b>Questionnaire Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUESTIONNAIRE_RESPONSES = RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ASSESSMENTS = RISK_ASSESSABLE_UNIT__ASSESSMENTS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ARTIFACTS = RISK_ASSESSABLE_UNIT__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Change Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CHANGE_EVENTS = RISK_ASSESSABLE_UNIT__CHANGE_EVENTS;

	/**
	 * The feature id for the '<em><b>Current Rating</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CURRENT_RATING = RISK_ASSESSABLE_UNIT__CURRENT_RATING;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_TYPE = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BUSINESS_LINE = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Development Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DEVELOPMENT_TEAM = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technology Stack</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TECHNOLOGY_STACK = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uses Public Cloud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__USES_PUBLIC_CLOUD = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses AI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__USES_AI = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Regulatory Scope</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REGULATORY_SCOPE = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Onboarding Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ONBOARDING_DATE = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Production Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTION_DATE = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Review Cycle Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REVIEW_CYCLE_DAYS = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = RISK_ASSESSABLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.ProductComponentImpl <em>Product Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.ProductComponentImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getProductComponent()
	 * @generated
	 */
	int PRODUCT_COMPONENT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__ID = RISK_ASSESSABLE_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__NAME = RISK_ASSESSABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__DESCRIPTION = RISK_ASSESSABLE_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__URI = RISK_ASSESSABLE_UNIT__URI;

	/**
	 * The feature id for the '<em><b>Data Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__DATA_CLASSIFICATION = RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__OWNER = RISK_ASSESSABLE_UNIT__OWNER;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__COMPONENTS = RISK_ASSESSABLE_UNIT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Identified Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__IDENTIFIED_RISKS = RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__CONTROLS = RISK_ASSESSABLE_UNIT__CONTROLS;

	/**
	 * The feature id for the '<em><b>Questionnaires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__QUESTIONNAIRES = RISK_ASSESSABLE_UNIT__QUESTIONNAIRES;

	/**
	 * The feature id for the '<em><b>Questionnaire Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__QUESTIONNAIRE_RESPONSES = RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__ASSESSMENTS = RISK_ASSESSABLE_UNIT__ASSESSMENTS;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__ARTIFACTS = RISK_ASSESSABLE_UNIT__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Change Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__CHANGE_EVENTS = RISK_ASSESSABLE_UNIT__CHANGE_EVENTS;

	/**
	 * The feature id for the '<em><b>Current Rating</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__CURRENT_RATING = RISK_ASSESSABLE_UNIT__CURRENT_RATING;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__COMPONENT_TYPE = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__VERSION = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__ENVIRONMENT = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT_FEATURE_COUNT = RISK_ASSESSABLE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT_OPERATION_COUNT = RISK_ASSESSABLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskRegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskRegisterImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskRegister()
	 * @generated
	 */
	int RISK_REGISTER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER__ENTRIES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Report Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER__REPORT_DATE = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskRegisterEntryImpl <em>Register Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskRegisterEntryImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskRegisterEntry()
	 * @generated
	 */
	int RISK_REGISTER_ENTRY = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Risk Assessable Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identified Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY__IDENTIFIED_RISK = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Register Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Register Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_REGISTER_ENTRY_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.impl.RiskNamespaceImpl
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskNamespace()
	 * @generated
	 */
	int RISK_NAMESPACE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__ID = RISK_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__NAME = RISK_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__DESCRIPTION = RISK_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__URI = RISK_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Risk Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__RISK_LEVELS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__CONTROL_CATEGORIES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Risk Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__RISK_CATEGORIES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Questionnaires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__QUESTIONNAIRES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__DATA_SOURCES = RISK_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__PRODUCTS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Risk Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE__RISK_REGISTERS = RISK_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE_FEATURE_COUNT = RISK_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_NAMESPACE_OPERATION_COUNT = RISK_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.DataClassification <em>Data Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.DataClassification
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getDataClassification()
	 * @generated
	 */
	int DATA_CLASSIFICATION = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.TreatmentStrategy <em>Treatment Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.TreatmentStrategy
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getTreatmentStrategy()
	 * @generated
	 */
	int TREATMENT_STRATEGY = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.TreatmentStatus <em>Treatment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.TreatmentStatus
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getTreatmentStatus()
	 * @generated
	 */
	int TREATMENT_STATUS = 29;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.ActionStatus
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 30;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.AssessmentStatus <em>Assessment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.AssessmentStatus
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getAssessmentStatus()
	 * @generated
	 */
	int ASSESSMENT_STATUS = 31;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.RiskStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.RiskStatus
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskStatus()
	 * @generated
	 */
	int RISK_STATUS = 32;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.ControlType
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.ControlEffectiveness <em>Control Effectiveness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.ControlEffectiveness
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControlEffectiveness()
	 * @generated
	 */
	int CONTROL_EFFECTIVENESS = 34;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.FindingType <em>Finding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.FindingType
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getFindingType()
	 * @generated
	 */
	int FINDING_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.FindingStatus <em>Finding Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.FindingStatus
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getFindingStatus()
	 * @generated
	 */
	int FINDING_STATUS = 36;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.QuestionType <em>Question Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.QuestionType
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionType()
	 * @generated
	 */
	int QUESTION_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.ProductComponentType <em>Product Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.ProductComponentType
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getProductComponentType()
	 * @generated
	 */
	int PRODUCT_COMPONENT_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.ChangeEventType <em>Change Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.ChangeEventType
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getChangeEventType()
	 * @generated
	 */
	int CHANGE_EVENT_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.risk.ArtifactType <em>Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.risk.ArtifactType
	 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 40;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.models.risk.RiskModelElement
	 * @generated
	 */
	EClass getRiskModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.risk.RiskModelElement#getId()
	 * @see #getRiskModelElement()
	 * @generated
	 */
	EAttribute getRiskModelElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.risk.RiskModelElement#getName()
	 * @see #getRiskModelElement()
	 * @generated
	 */
	EAttribute getRiskModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.risk.RiskModelElement#getDescription()
	 * @see #getRiskModelElement()
	 * @generated
	 */
	EAttribute getRiskModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskModelElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.nasdanika.models.risk.RiskModelElement#getUri()
	 * @see #getRiskModelElement()
	 * @generated
	 */
	EAttribute getRiskModelElement_Uri();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see org.nasdanika.models.risk.RiskLevel
	 * @generated
	 */
	EClass getRiskLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskLevel#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.nasdanika.models.risk.RiskLevel#getScore()
	 * @see #getRiskLevel()
	 * @generated
	 */
	EAttribute getRiskLevel_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskLevel#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.risk.RiskLevel#getColor()
	 * @see #getRiskLevel()
	 * @generated
	 */
	EAttribute getRiskLevel_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.ControlCategory <em>Control Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Category</em>'.
	 * @see org.nasdanika.models.risk.ControlCategory
	 * @generated
	 */
	EClass getControlCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.nasdanika.models.risk.RiskCategory
	 * @generated
	 */
	EClass getRiskCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskCategory#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see org.nasdanika.models.risk.RiskCategory#getSubCategories()
	 * @see #getRiskCategory()
	 * @generated
	 */
	EReference getRiskCategory_SubCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskCategory#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risks</em>'.
	 * @see org.nasdanika.models.risk.RiskCategory#getRisks()
	 * @see #getRiskCategory()
	 * @generated
	 */
	EReference getRiskCategory_Risks();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see org.nasdanika.models.risk.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.risk.Risk#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Triggers</em>'.
	 * @see org.nasdanika.models.risk.Risk#getTriggers()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Triggers();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.risk.Risk#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consequences</em>'.
	 * @see org.nasdanika.models.risk.Risk#getConsequences()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Consequences();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.risk.Risk#getRegulatoryReferences <em>Regulatory References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Regulatory References</em>'.
	 * @see org.nasdanika.models.risk.Risk#getRegulatoryReferences()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_RegulatoryReferences();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.risk.Risk#getRelatedRisks <em>Related Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Risks</em>'.
	 * @see org.nasdanika.models.risk.Risk#getRelatedRisks()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_RelatedRisks();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.nasdanika.models.risk.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.Control#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.nasdanika.models.risk.Control#getCategory()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Control#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.risk.Control#getType()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Control#getEffectiveness <em>Effectiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectiveness</em>'.
	 * @see org.nasdanika.models.risk.Control#getEffectiveness()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Effectiveness();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Control#isAutomated <em>Automated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automated</em>'.
	 * @see org.nasdanika.models.risk.Control#isAutomated()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Automated();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Control#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.nasdanika.models.risk.Control#getOwner()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Control#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see org.nasdanika.models.risk.Control#getReviewDate()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_ReviewDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Control#getEvidenceUrl <em>Evidence Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evidence Url</em>'.
	 * @see org.nasdanika.models.risk.Control#getEvidenceUrl()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_EvidenceUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.QuestionOption <em>Question Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Option</em>'.
	 * @see org.nasdanika.models.risk.QuestionOption
	 * @generated
	 */
	EClass getQuestionOption();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.QuestionOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.risk.QuestionOption#getValue()
	 * @see #getQuestionOption()
	 * @generated
	 */
	EAttribute getQuestionOption_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.QuestionOption#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.nasdanika.models.risk.QuestionOption#getScore()
	 * @see #getQuestionOption()
	 * @generated
	 */
	EAttribute getQuestionOption_Score();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.QuestionOption#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk Level</em>'.
	 * @see org.nasdanika.models.risk.QuestionOption#getRiskLevel()
	 * @see #getQuestionOption()
	 * @generated
	 */
	EReference getQuestionOption_RiskLevel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.nasdanika.models.risk.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.risk.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Question#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.models.risk.Question#isRequired()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Question#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.nasdanika.models.risk.Question#getCategory()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Question#getGuidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guidance</em>'.
	 * @see org.nasdanika.models.risk.Question#getGuidance()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Guidance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Question#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.models.risk.Question#getWeight()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.Question#getRiskCategory <em>Risk Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk Category</em>'.
	 * @see org.nasdanika.models.risk.Question#getRiskCategory()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_RiskCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.Question#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.nasdanika.models.risk.Question#getOptions()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Options();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see org.nasdanika.models.risk.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Questionnaire#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.risk.Questionnaire#getVersion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Questionnaire#getApplicability <em>Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability</em>'.
	 * @see org.nasdanika.models.risk.Questionnaire#getApplicability()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Applicability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.Questionnaire#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see org.nasdanika.models.risk.Questionnaire#getQuestions()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Questions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see org.nasdanika.models.risk.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.Answer#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see org.nasdanika.models.risk.Answer#getQuestion()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Question();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Answer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.risk.Answer#getValue()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Answer#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.nasdanika.models.risk.Answer#getScore()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Answer#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see org.nasdanika.models.risk.Answer#getNotes()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Notes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.QuestionnaireResponse <em>Questionnaire Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire Response</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse
	 * @generated
	 */
	EClass getQuestionnaireResponse();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Questionnaire</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse#getQuestionnaire()
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	EReference getQuestionnaireResponse_Questionnaire();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.QuestionnaireResponse#getResponseDate <em>Response Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Date</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse#getResponseDate()
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	EAttribute getQuestionnaireResponse_ResponseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.QuestionnaireResponse#getRespondent <em>Respondent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Respondent</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse#getRespondent()
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	EAttribute getQuestionnaireResponse_Respondent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.QuestionnaireResponse#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse#getAnswers()
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	EReference getQuestionnaireResponse_Answers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.QuestionnaireResponse#getTotalScore <em>Total Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Score</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse#getTotalScore()
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	EAttribute getQuestionnaireResponse_TotalScore();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.QuestionnaireResponse#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see org.nasdanika.models.risk.QuestionnaireResponse#getLevel()
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	EReference getQuestionnaireResponse_Level();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.ScoreComponent <em>Score Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score Component</em>'.
	 * @see org.nasdanika.models.risk.ScoreComponent
	 * @generated
	 */
	EClass getScoreComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ScoreComponent#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.nasdanika.models.risk.ScoreComponent#getScore()
	 * @see #getScoreComponent()
	 * @generated
	 */
	EAttribute getScoreComponent_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ScoreComponent#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.models.risk.ScoreComponent#getWeight()
	 * @see #getScoreComponent()
	 * @generated
	 */
	EAttribute getScoreComponent_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.ScoreComponent#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see org.nasdanika.models.risk.ScoreComponent#getLevel()
	 * @see #getScoreComponent()
	 * @generated
	 */
	EReference getScoreComponent_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ScoreComponent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.risk.ScoreComponent#getSource()
	 * @see #getScoreComponent()
	 * @generated
	 */
	EAttribute getScoreComponent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ScoreComponent#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see org.nasdanika.models.risk.ScoreComponent#getNotes()
	 * @see #getScoreComponent()
	 * @generated
	 */
	EAttribute getScoreComponent_Notes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see org.nasdanika.models.risk.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.Finding#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Severity</em>'.
	 * @see org.nasdanika.models.risk.Finding#getSeverity()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Finding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.risk.Finding#getType()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Finding#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.risk.Finding#getStatus()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Finding#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.nasdanika.models.risk.Finding#getDueDate()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Finding#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignee</em>'.
	 * @see org.nasdanika.models.risk.Finding#getAssignee()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Finding#getTicketUrl <em>Ticket Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Url</em>'.
	 * @see org.nasdanika.models.risk.Finding#getTicketUrl()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_TicketUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.TreatmentAction <em>Treatment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment Action</em>'.
	 * @see org.nasdanika.models.risk.TreatmentAction
	 * @generated
	 */
	EClass getTreatmentAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.TreatmentAction#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignee</em>'.
	 * @see org.nasdanika.models.risk.TreatmentAction#getAssignee()
	 * @see #getTreatmentAction()
	 * @generated
	 */
	EAttribute getTreatmentAction_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.TreatmentAction#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.nasdanika.models.risk.TreatmentAction#getDueDate()
	 * @see #getTreatmentAction()
	 * @generated
	 */
	EAttribute getTreatmentAction_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.TreatmentAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.risk.TreatmentAction#getStatus()
	 * @see #getTreatmentAction()
	 * @generated
	 */
	EAttribute getTreatmentAction_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.TreatmentAction#getTicketUrl <em>Ticket Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Url</em>'.
	 * @see org.nasdanika.models.risk.TreatmentAction#getTicketUrl()
	 * @see #getTreatmentAction()
	 * @generated
	 */
	EAttribute getTreatmentAction_TicketUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment</em>'.
	 * @see org.nasdanika.models.risk.RiskTreatment
	 * @generated
	 */
	EClass getRiskTreatment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskTreatment#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.nasdanika.models.risk.RiskTreatment#getStrategy()
	 * @see #getRiskTreatment()
	 * @generated
	 */
	EAttribute getRiskTreatment_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskTreatment#getTargetDate <em>Target Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Date</em>'.
	 * @see org.nasdanika.models.risk.RiskTreatment#getTargetDate()
	 * @see #getRiskTreatment()
	 * @generated
	 */
	EAttribute getRiskTreatment_TargetDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskTreatment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.risk.RiskTreatment#getStatus()
	 * @see #getRiskTreatment()
	 * @generated
	 */
	EAttribute getRiskTreatment_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskTreatment#getApprover <em>Approver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approver</em>'.
	 * @see org.nasdanika.models.risk.RiskTreatment#getApprover()
	 * @see #getRiskTreatment()
	 * @generated
	 */
	EAttribute getRiskTreatment_Approver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskTreatment#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.nasdanika.models.risk.RiskTreatment#getActions()
	 * @see #getRiskTreatment()
	 * @generated
	 */
	EReference getRiskTreatment_Actions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.IdentifiedRisk <em>Identified Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Risk</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk
	 * @generated
	 */
	EClass getIdentifiedRisk();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.IdentifiedRisk#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getRisk()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_Risk();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.IdentifiedRisk#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Likelihood</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getLikelihood()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_Likelihood();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.IdentifiedRisk#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impact</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getImpact()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_Impact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.IdentifiedRisk#getInherentScore <em>Inherent Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherent Score</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getInherentScore()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EAttribute getIdentifiedRisk_InherentScore();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.IdentifiedRisk#getResidualScore <em>Residual Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Score</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getResidualScore()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EAttribute getIdentifiedRisk_ResidualScore();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.IdentifiedRisk#getResidualLevel <em>Residual Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Residual Level</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getResidualLevel()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_ResidualLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.IdentifiedRisk#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getStatus()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EAttribute getIdentifiedRisk_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.IdentifiedRisk#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getOwner()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EAttribute getIdentifiedRisk_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.IdentifiedRisk#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getDueDate()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EAttribute getIdentifiedRisk_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.IdentifiedRisk#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getNotes()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EAttribute getIdentifiedRisk_Notes();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.risk.IdentifiedRisk#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Treatment</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getTreatment()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_Treatment();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.risk.IdentifiedRisk#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getControls()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.IdentifiedRisk#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Findings</em>'.
	 * @see org.nasdanika.models.risk.IdentifiedRisk#getFindings()
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	EReference getIdentifiedRisk_Findings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment
	 * @generated
	 */
	EClass getRiskAssessment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getAssessmentDate <em>Assessment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment Date</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getAssessmentDate()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_AssessmentDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getAssessor <em>Assessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessor</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getAssessor()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_Assessor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getApprover <em>Approver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approver</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getApprover()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_Approver();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getReviewDate()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_ReviewDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getNextReviewDate <em>Next Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Review Date</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getNextReviewDate()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_NextReviewDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getStatus()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_Status();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.RiskAssessment#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getTrigger()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessment#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scores</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getScores()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_Scores();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessment#getCompositeScore <em>Composite Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Score</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getCompositeScore()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_CompositeScore();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.RiskAssessment#getConsolidatedRating <em>Consolidated Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consolidated Rating</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getConsolidatedRating()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_ConsolidatedRating();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessment#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Findings</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getFindings()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_Findings();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.risk.RiskAssessment#getQuestionnaireResponses <em>Questionnaire Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaire Responses</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessment#getQuestionnaireResponses()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_QuestionnaireResponses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see org.nasdanika.models.risk.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.risk.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.risk.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.models.risk.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Artifact#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.nasdanika.models.risk.Artifact#getExternalId()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_ExternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Artifact#getArtifactUrl <em>Artifact Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Url</em>'.
	 * @see org.nasdanika.models.risk.Artifact#getArtifactUrl()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_ArtifactUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Artifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.risk.Artifact#getType()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Artifact#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated</em>'.
	 * @see org.nasdanika.models.risk.Artifact#getLastUpdated()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_LastUpdated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.Artifact#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.nasdanika.models.risk.Artifact#getMetadata()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Metadata();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.nasdanika.models.risk.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.DataSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.risk.DataSource#getType()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.DataSource#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see org.nasdanika.models.risk.DataSource#getBaseUrl()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_BaseUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.DataSource#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.models.risk.DataSource#getArtifacts()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Artifacts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Event</em>'.
	 * @see org.nasdanika.models.risk.ChangeEvent
	 * @generated
	 */
	EClass getChangeEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ChangeEvent#getEventDate <em>Event Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Date</em>'.
	 * @see org.nasdanika.models.risk.ChangeEvent#getEventDate()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EAttribute getChangeEvent_EventDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ChangeEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.risk.ChangeEvent#getType()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EAttribute getChangeEvent_Type();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.ChangeEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.risk.ChangeEvent#getSource()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EReference getChangeEvent_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.ChangeEvent#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact</em>'.
	 * @see org.nasdanika.models.risk.ChangeEvent#getArtifact()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EReference getChangeEvent_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ChangeEvent#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see org.nasdanika.models.risk.ChangeEvent#getDetails()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EAttribute getChangeEvent_Details();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskAssessableUnit <em>Assessable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessable Unit</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit
	 * @generated
	 */
	EClass getRiskAssessableUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessableUnit#getDataClassification <em>Data Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Classification</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getDataClassification()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EAttribute getRiskAssessableUnit_DataClassification();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskAssessableUnit#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getOwner()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EAttribute getRiskAssessableUnit_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getComponents()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getIdentifiedRisks <em>Identified Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identified Risks</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getIdentifiedRisks()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_IdentifiedRisks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getControls()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_Controls();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getQuestionnaires <em>Questionnaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaires</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getQuestionnaires()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_Questionnaires();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getQuestionnaireResponses <em>Questionnaire Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaire Responses</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getQuestionnaireResponses()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_QuestionnaireResponses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getAssessments <em>Assessments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessments</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getAssessments()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_Assessments();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getArtifacts()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskAssessableUnit#getChangeEvents <em>Change Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Events</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getChangeEvents()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_ChangeEvents();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.RiskAssessableUnit#getCurrentRating <em>Current Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Rating</em>'.
	 * @see org.nasdanika.models.risk.RiskAssessableUnit#getCurrentRating()
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	EReference getRiskAssessableUnit_CurrentRating();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.nasdanika.models.risk.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type</em>'.
	 * @see org.nasdanika.models.risk.Product#getProductType()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#getBusinessLine <em>Business Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Line</em>'.
	 * @see org.nasdanika.models.risk.Product#getBusinessLine()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_BusinessLine();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#getDevelopmentTeam <em>Development Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development Team</em>'.
	 * @see org.nasdanika.models.risk.Product#getDevelopmentTeam()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_DevelopmentTeam();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.risk.Product#getTechnologyStack <em>Technology Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Technology Stack</em>'.
	 * @see org.nasdanika.models.risk.Product#getTechnologyStack()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_TechnologyStack();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#isUsesPublicCloud <em>Uses Public Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses Public Cloud</em>'.
	 * @see org.nasdanika.models.risk.Product#isUsesPublicCloud()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UsesPublicCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#isUsesAI <em>Uses AI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses AI</em>'.
	 * @see org.nasdanika.models.risk.Product#isUsesAI()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UsesAI();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.risk.Product#getRegulatoryScope <em>Regulatory Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Regulatory Scope</em>'.
	 * @see org.nasdanika.models.risk.Product#getRegulatoryScope()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_RegulatoryScope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#getOnboardingDate <em>Onboarding Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onboarding Date</em>'.
	 * @see org.nasdanika.models.risk.Product#getOnboardingDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_OnboardingDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#getProductionDate <em>Production Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Date</em>'.
	 * @see org.nasdanika.models.risk.Product#getProductionDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.Product#getReviewCycleDays <em>Review Cycle Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Cycle Days</em>'.
	 * @see org.nasdanika.models.risk.Product#getReviewCycleDays()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ReviewCycleDays();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.ProductComponent <em>Product Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Component</em>'.
	 * @see org.nasdanika.models.risk.ProductComponent
	 * @generated
	 */
	EClass getProductComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ProductComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see org.nasdanika.models.risk.ProductComponent#getComponentType()
	 * @see #getProductComponent()
	 * @generated
	 */
	EAttribute getProductComponent_ComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ProductComponent#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.risk.ProductComponent#getVersion()
	 * @see #getProductComponent()
	 * @generated
	 */
	EAttribute getProductComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.ProductComponent#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.nasdanika.models.risk.ProductComponent#getEnvironment()
	 * @see #getProductComponent()
	 * @generated
	 */
	EAttribute getProductComponent_Environment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see org.nasdanika.models.risk.RiskRegister
	 * @generated
	 */
	EClass getRiskRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskRegister#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.models.risk.RiskRegister#getEntries()
	 * @see #getRiskRegister()
	 * @generated
	 */
	EReference getRiskRegister_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.risk.RiskRegister#getReportDate <em>Report Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Date</em>'.
	 * @see org.nasdanika.models.risk.RiskRegister#getReportDate()
	 * @see #getRiskRegister()
	 * @generated
	 */
	EAttribute getRiskRegister_ReportDate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskRegisterEntry <em>Register Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Entry</em>'.
	 * @see org.nasdanika.models.risk.RiskRegisterEntry
	 * @generated
	 */
	EClass getRiskRegisterEntry();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.RiskRegisterEntry#getRiskAssessableUnit <em>Risk Assessable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk Assessable Unit</em>'.
	 * @see org.nasdanika.models.risk.RiskRegisterEntry#getRiskAssessableUnit()
	 * @see #getRiskRegisterEntry()
	 * @generated
	 */
	EReference getRiskRegisterEntry_RiskAssessableUnit();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.risk.RiskRegisterEntry#getIdentifiedRisk <em>Identified Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identified Risk</em>'.
	 * @see org.nasdanika.models.risk.RiskRegisterEntry#getIdentifiedRisk()
	 * @see #getRiskRegisterEntry()
	 * @generated
	 */
	EReference getRiskRegisterEntry_IdentifiedRisk();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.risk.RiskNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace
	 * @generated
	 */
	EClass getRiskNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getRiskLevels <em>Risk Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk Levels</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getRiskLevels()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_RiskLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getControlCategories <em>Control Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Categories</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getControlCategories()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_ControlCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getRiskCategories <em>Risk Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk Categories</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getRiskCategories()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_RiskCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getQuestionnaires <em>Questionnaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questionnaires</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getQuestionnaires()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_Questionnaires();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sources</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getDataSources()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_DataSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getProducts()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.risk.RiskNamespace#getRiskRegisters <em>Risk Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk Registers</em>'.
	 * @see org.nasdanika.models.risk.RiskNamespace#getRiskRegisters()
	 * @see #getRiskNamespace()
	 * @generated
	 */
	EReference getRiskNamespace_RiskRegisters();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.DataClassification <em>Data Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Classification</em>'.
	 * @see org.nasdanika.models.risk.DataClassification
	 * @generated
	 */
	EEnum getDataClassification();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.TreatmentStrategy <em>Treatment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Treatment Strategy</em>'.
	 * @see org.nasdanika.models.risk.TreatmentStrategy
	 * @generated
	 */
	EEnum getTreatmentStrategy();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.TreatmentStatus <em>Treatment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Treatment Status</em>'.
	 * @see org.nasdanika.models.risk.TreatmentStatus
	 * @generated
	 */
	EEnum getTreatmentStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see org.nasdanika.models.risk.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.AssessmentStatus <em>Assessment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assessment Status</em>'.
	 * @see org.nasdanika.models.risk.AssessmentStatus
	 * @generated
	 */
	EEnum getAssessmentStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.RiskStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.nasdanika.models.risk.RiskStatus
	 * @generated
	 */
	EEnum getRiskStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see org.nasdanika.models.risk.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.ControlEffectiveness <em>Control Effectiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Effectiveness</em>'.
	 * @see org.nasdanika.models.risk.ControlEffectiveness
	 * @generated
	 */
	EEnum getControlEffectiveness();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.FindingType <em>Finding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Finding Type</em>'.
	 * @see org.nasdanika.models.risk.FindingType
	 * @generated
	 */
	EEnum getFindingType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.FindingStatus <em>Finding Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Finding Status</em>'.
	 * @see org.nasdanika.models.risk.FindingStatus
	 * @generated
	 */
	EEnum getFindingStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.QuestionType <em>Question Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Question Type</em>'.
	 * @see org.nasdanika.models.risk.QuestionType
	 * @generated
	 */
	EEnum getQuestionType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.ProductComponentType <em>Product Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Component Type</em>'.
	 * @see org.nasdanika.models.risk.ProductComponentType
	 * @generated
	 */
	EEnum getProductComponentType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.ChangeEventType <em>Change Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Event Type</em>'.
	 * @see org.nasdanika.models.risk.ChangeEventType
	 * @generated
	 */
	EEnum getChangeEventType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.risk.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Type</em>'.
	 * @see org.nasdanika.models.risk.ArtifactType
	 * @generated
	 */
	EEnum getArtifactType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RiskFactory getRiskFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskModelElementImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskModelElement()
		 * @generated
		 */
		EClass RISK_MODEL_ELEMENT = eINSTANCE.getRiskModelElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MODEL_ELEMENT__ID = eINSTANCE.getRiskModelElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MODEL_ELEMENT__NAME = eINSTANCE.getRiskModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getRiskModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MODEL_ELEMENT__URI = eINSTANCE.getRiskModelElement_Uri();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskLevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskLevelImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskLevel()
		 * @generated
		 */
		EClass RISK_LEVEL = eINSTANCE.getRiskLevel();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_LEVEL__SCORE = eINSTANCE.getRiskLevel_Score();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_LEVEL__COLOR = eINSTANCE.getRiskLevel_Color();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ControlCategoryImpl <em>Control Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ControlCategoryImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControlCategory()
		 * @generated
		 */
		EClass CONTROL_CATEGORY = eINSTANCE.getControlCategory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskCategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskCategoryImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskCategory()
		 * @generated
		 */
		EClass RISK_CATEGORY = eINSTANCE.getRiskCategory();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_CATEGORY__SUB_CATEGORIES = eINSTANCE.getRiskCategory_SubCategories();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_CATEGORY__RISKS = eINSTANCE.getRiskCategory_Risks();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskImpl <em>Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRisk()
		 * @generated
		 */
		EClass RISK = eINSTANCE.getRisk();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__TRIGGERS = eINSTANCE.getRisk_Triggers();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__CONSEQUENCES = eINSTANCE.getRisk_Consequences();

		/**
		 * The meta object literal for the '<em><b>Regulatory References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK__REGULATORY_REFERENCES = eINSTANCE.getRisk_RegulatoryReferences();

		/**
		 * The meta object literal for the '<em><b>Related Risks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK__RELATED_RISKS = eINSTANCE.getRisk_RelatedRisks();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ControlImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CATEGORY = eINSTANCE.getControl_Category();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TYPE = eINSTANCE.getControl_Type();

		/**
		 * The meta object literal for the '<em><b>Effectiveness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__EFFECTIVENESS = eINSTANCE.getControl_Effectiveness();

		/**
		 * The meta object literal for the '<em><b>Automated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__AUTOMATED = eINSTANCE.getControl_Automated();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__OWNER = eINSTANCE.getControl_Owner();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__REVIEW_DATE = eINSTANCE.getControl_ReviewDate();

		/**
		 * The meta object literal for the '<em><b>Evidence Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__EVIDENCE_URL = eINSTANCE.getControl_EvidenceUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.QuestionOptionImpl <em>Question Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.QuestionOptionImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionOption()
		 * @generated
		 */
		EClass QUESTION_OPTION = eINSTANCE.getQuestionOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_OPTION__VALUE = eINSTANCE.getQuestionOption_Value();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_OPTION__SCORE = eINSTANCE.getQuestionOption_Score();

		/**
		 * The meta object literal for the '<em><b>Risk Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_OPTION__RISK_LEVEL = eINSTANCE.getQuestionOption_RiskLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.QuestionImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REQUIRED = eINSTANCE.getQuestion_Required();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CATEGORY = eINSTANCE.getQuestion_Category();

		/**
		 * The meta object literal for the '<em><b>Guidance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__GUIDANCE = eINSTANCE.getQuestion_Guidance();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__WEIGHT = eINSTANCE.getQuestion_Weight();

		/**
		 * The meta object literal for the '<em><b>Risk Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__RISK_CATEGORY = eINSTANCE.getQuestion_RiskCategory();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.QuestionnaireImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__VERSION = eINSTANCE.getQuestionnaire_Version();

		/**
		 * The meta object literal for the '<em><b>Applicability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__APPLICABILITY = eINSTANCE.getQuestionnaire_Applicability();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTIONS = eINSTANCE.getQuestionnaire_Questions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.AnswerImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__QUESTION = eINSTANCE.getAnswer_Question();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__VALUE = eINSTANCE.getAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__SCORE = eINSTANCE.getAnswer_Score();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__NOTES = eINSTANCE.getAnswer_Notes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.QuestionnaireResponseImpl <em>Questionnaire Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.QuestionnaireResponseImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionnaireResponse()
		 * @generated
		 */
		EClass QUESTIONNAIRE_RESPONSE = eINSTANCE.getQuestionnaireResponse();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE = eINSTANCE.getQuestionnaireResponse_Questionnaire();

		/**
		 * The meta object literal for the '<em><b>Response Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_RESPONSE__RESPONSE_DATE = eINSTANCE.getQuestionnaireResponse_ResponseDate();

		/**
		 * The meta object literal for the '<em><b>Respondent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_RESPONSE__RESPONDENT = eINSTANCE.getQuestionnaireResponse_Respondent();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_RESPONSE__ANSWERS = eINSTANCE.getQuestionnaireResponse_Answers();

		/**
		 * The meta object literal for the '<em><b>Total Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_RESPONSE__TOTAL_SCORE = eINSTANCE.getQuestionnaireResponse_TotalScore();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_RESPONSE__LEVEL = eINSTANCE.getQuestionnaireResponse_Level();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ScoreComponentImpl <em>Score Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ScoreComponentImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getScoreComponent()
		 * @generated
		 */
		EClass SCORE_COMPONENT = eINSTANCE.getScoreComponent();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_COMPONENT__SCORE = eINSTANCE.getScoreComponent_Score();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_COMPONENT__WEIGHT = eINSTANCE.getScoreComponent_Weight();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_COMPONENT__LEVEL = eINSTANCE.getScoreComponent_Level();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_COMPONENT__SOURCE = eINSTANCE.getScoreComponent_Source();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_COMPONENT__NOTES = eINSTANCE.getScoreComponent_Notes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.FindingImpl <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.FindingImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getFinding()
		 * @generated
		 */
		EClass FINDING = eINSTANCE.getFinding();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDING__SEVERITY = eINSTANCE.getFinding_Severity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__TYPE = eINSTANCE.getFinding_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__STATUS = eINSTANCE.getFinding_Status();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__DUE_DATE = eINSTANCE.getFinding_DueDate();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__ASSIGNEE = eINSTANCE.getFinding_Assignee();

		/**
		 * The meta object literal for the '<em><b>Ticket Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__TICKET_URL = eINSTANCE.getFinding_TicketUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.TreatmentActionImpl <em>Treatment Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.TreatmentActionImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getTreatmentAction()
		 * @generated
		 */
		EClass TREATMENT_ACTION = eINSTANCE.getTreatmentAction();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT_ACTION__ASSIGNEE = eINSTANCE.getTreatmentAction_Assignee();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT_ACTION__DUE_DATE = eINSTANCE.getTreatmentAction_DueDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT_ACTION__STATUS = eINSTANCE.getTreatmentAction_Status();

		/**
		 * The meta object literal for the '<em><b>Ticket Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT_ACTION__TICKET_URL = eINSTANCE.getTreatmentAction_TicketUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskTreatmentImpl <em>Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskTreatmentImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskTreatment()
		 * @generated
		 */
		EClass RISK_TREATMENT = eINSTANCE.getRiskTreatment();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_TREATMENT__STRATEGY = eINSTANCE.getRiskTreatment_Strategy();

		/**
		 * The meta object literal for the '<em><b>Target Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_TREATMENT__TARGET_DATE = eINSTANCE.getRiskTreatment_TargetDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_TREATMENT__STATUS = eINSTANCE.getRiskTreatment_Status();

		/**
		 * The meta object literal for the '<em><b>Approver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_TREATMENT__APPROVER = eINSTANCE.getRiskTreatment_Approver();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_TREATMENT__ACTIONS = eINSTANCE.getRiskTreatment_Actions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.IdentifiedRiskImpl <em>Identified Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.IdentifiedRiskImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getIdentifiedRisk()
		 * @generated
		 */
		EClass IDENTIFIED_RISK = eINSTANCE.getIdentifiedRisk();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__RISK = eINSTANCE.getIdentifiedRisk_Risk();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__LIKELIHOOD = eINSTANCE.getIdentifiedRisk_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__IMPACT = eINSTANCE.getIdentifiedRisk_Impact();

		/**
		 * The meta object literal for the '<em><b>Inherent Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_RISK__INHERENT_SCORE = eINSTANCE.getIdentifiedRisk_InherentScore();

		/**
		 * The meta object literal for the '<em><b>Residual Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_RISK__RESIDUAL_SCORE = eINSTANCE.getIdentifiedRisk_ResidualScore();

		/**
		 * The meta object literal for the '<em><b>Residual Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__RESIDUAL_LEVEL = eINSTANCE.getIdentifiedRisk_ResidualLevel();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_RISK__STATUS = eINSTANCE.getIdentifiedRisk_Status();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_RISK__OWNER = eINSTANCE.getIdentifiedRisk_Owner();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_RISK__DUE_DATE = eINSTANCE.getIdentifiedRisk_DueDate();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_RISK__NOTES = eINSTANCE.getIdentifiedRisk_Notes();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__TREATMENT = eINSTANCE.getIdentifiedRisk_Treatment();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__CONTROLS = eINSTANCE.getIdentifiedRisk_Controls();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_RISK__FINDINGS = eINSTANCE.getIdentifiedRisk_Findings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskAssessmentImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskAssessment()
		 * @generated
		 */
		EClass RISK_ASSESSMENT = eINSTANCE.getRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Assessment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__ASSESSMENT_DATE = eINSTANCE.getRiskAssessment_AssessmentDate();

		/**
		 * The meta object literal for the '<em><b>Assessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__ASSESSOR = eINSTANCE.getRiskAssessment_Assessor();

		/**
		 * The meta object literal for the '<em><b>Approver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__APPROVER = eINSTANCE.getRiskAssessment_Approver();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__REVIEW_DATE = eINSTANCE.getRiskAssessment_ReviewDate();

		/**
		 * The meta object literal for the '<em><b>Next Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__NEXT_REVIEW_DATE = eINSTANCE.getRiskAssessment_NextReviewDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__STATUS = eINSTANCE.getRiskAssessment_Status();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__TRIGGER = eINSTANCE.getRiskAssessment_Trigger();

		/**
		 * The meta object literal for the '<em><b>Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__SCORES = eINSTANCE.getRiskAssessment_Scores();

		/**
		 * The meta object literal for the '<em><b>Composite Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__COMPOSITE_SCORE = eINSTANCE.getRiskAssessment_CompositeScore();

		/**
		 * The meta object literal for the '<em><b>Consolidated Rating</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__CONSOLIDATED_RATING = eINSTANCE.getRiskAssessment_ConsolidatedRating();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__FINDINGS = eINSTANCE.getRiskAssessment_Findings();

		/**
		 * The meta object literal for the '<em><b>Questionnaire Responses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES = eINSTANCE.getRiskAssessment_QuestionnaireResponses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.KeyValuePairImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ArtifactImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__EXTERNAL_ID = eINSTANCE.getArtifact_ExternalId();

		/**
		 * The meta object literal for the '<em><b>Artifact Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__ARTIFACT_URL = eINSTANCE.getArtifact_ArtifactUrl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__TYPE = eINSTANCE.getArtifact_Type();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__LAST_UPDATED = eINSTANCE.getArtifact_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__METADATA = eINSTANCE.getArtifact_Metadata();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.DataSourceImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__TYPE = eINSTANCE.getDataSource_Type();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__BASE_URL = eINSTANCE.getDataSource_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__ARTIFACTS = eINSTANCE.getDataSource_Artifacts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ChangeEventImpl <em>Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ChangeEventImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getChangeEvent()
		 * @generated
		 */
		EClass CHANGE_EVENT = eINSTANCE.getChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Event Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_EVENT__EVENT_DATE = eINSTANCE.getChangeEvent_EventDate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_EVENT__TYPE = eINSTANCE.getChangeEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_EVENT__SOURCE = eINSTANCE.getChangeEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_EVENT__ARTIFACT = eINSTANCE.getChangeEvent_Artifact();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_EVENT__DETAILS = eINSTANCE.getChangeEvent_Details();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl <em>Assessable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskAssessableUnitImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskAssessableUnit()
		 * @generated
		 */
		EClass RISK_ASSESSABLE_UNIT = eINSTANCE.getRiskAssessableUnit();

		/**
		 * The meta object literal for the '<em><b>Data Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION = eINSTANCE.getRiskAssessableUnit_DataClassification();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSABLE_UNIT__OWNER = eINSTANCE.getRiskAssessableUnit_Owner();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__COMPONENTS = eINSTANCE.getRiskAssessableUnit_Components();

		/**
		 * The meta object literal for the '<em><b>Identified Risks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS = eINSTANCE.getRiskAssessableUnit_IdentifiedRisks();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__CONTROLS = eINSTANCE.getRiskAssessableUnit_Controls();

		/**
		 * The meta object literal for the '<em><b>Questionnaires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__QUESTIONNAIRES = eINSTANCE.getRiskAssessableUnit_Questionnaires();

		/**
		 * The meta object literal for the '<em><b>Questionnaire Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES = eINSTANCE.getRiskAssessableUnit_QuestionnaireResponses();

		/**
		 * The meta object literal for the '<em><b>Assessments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__ASSESSMENTS = eINSTANCE.getRiskAssessableUnit_Assessments();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__ARTIFACTS = eINSTANCE.getRiskAssessableUnit_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Change Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__CHANGE_EVENTS = eINSTANCE.getRiskAssessableUnit_ChangeEvents();

		/**
		 * The meta object literal for the '<em><b>Current Rating</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSABLE_UNIT__CURRENT_RATING = eINSTANCE.getRiskAssessableUnit_CurrentRating();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ProductImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_TYPE = eINSTANCE.getProduct_ProductType();

		/**
		 * The meta object literal for the '<em><b>Business Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__BUSINESS_LINE = eINSTANCE.getProduct_BusinessLine();

		/**
		 * The meta object literal for the '<em><b>Development Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DEVELOPMENT_TEAM = eINSTANCE.getProduct_DevelopmentTeam();

		/**
		 * The meta object literal for the '<em><b>Technology Stack</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TECHNOLOGY_STACK = eINSTANCE.getProduct_TechnologyStack();

		/**
		 * The meta object literal for the '<em><b>Uses Public Cloud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__USES_PUBLIC_CLOUD = eINSTANCE.getProduct_UsesPublicCloud();

		/**
		 * The meta object literal for the '<em><b>Uses AI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__USES_AI = eINSTANCE.getProduct_UsesAI();

		/**
		 * The meta object literal for the '<em><b>Regulatory Scope</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REGULATORY_SCOPE = eINSTANCE.getProduct_RegulatoryScope();

		/**
		 * The meta object literal for the '<em><b>Onboarding Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ONBOARDING_DATE = eINSTANCE.getProduct_OnboardingDate();

		/**
		 * The meta object literal for the '<em><b>Production Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCTION_DATE = eINSTANCE.getProduct_ProductionDate();

		/**
		 * The meta object literal for the '<em><b>Review Cycle Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REVIEW_CYCLE_DAYS = eINSTANCE.getProduct_ReviewCycleDays();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.ProductComponentImpl <em>Product Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.ProductComponentImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getProductComponent()
		 * @generated
		 */
		EClass PRODUCT_COMPONENT = eINSTANCE.getProductComponent();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COMPONENT__COMPONENT_TYPE = eINSTANCE.getProductComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COMPONENT__VERSION = eINSTANCE.getProductComponent_Version();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_COMPONENT__ENVIRONMENT = eINSTANCE.getProductComponent_Environment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskRegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskRegisterImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskRegister()
		 * @generated
		 */
		EClass RISK_REGISTER = eINSTANCE.getRiskRegister();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_REGISTER__ENTRIES = eINSTANCE.getRiskRegister_Entries();

		/**
		 * The meta object literal for the '<em><b>Report Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_REGISTER__REPORT_DATE = eINSTANCE.getRiskRegister_ReportDate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskRegisterEntryImpl <em>Register Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskRegisterEntryImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskRegisterEntry()
		 * @generated
		 */
		EClass RISK_REGISTER_ENTRY = eINSTANCE.getRiskRegisterEntry();

		/**
		 * The meta object literal for the '<em><b>Risk Assessable Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_REGISTER_ENTRY__RISK_ASSESSABLE_UNIT = eINSTANCE.getRiskRegisterEntry_RiskAssessableUnit();

		/**
		 * The meta object literal for the '<em><b>Identified Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_REGISTER_ENTRY__IDENTIFIED_RISK = eINSTANCE.getRiskRegisterEntry_IdentifiedRisk();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.impl.RiskNamespaceImpl
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskNamespace()
		 * @generated
		 */
		EClass RISK_NAMESPACE = eINSTANCE.getRiskNamespace();

		/**
		 * The meta object literal for the '<em><b>Risk Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__RISK_LEVELS = eINSTANCE.getRiskNamespace_RiskLevels();

		/**
		 * The meta object literal for the '<em><b>Control Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__CONTROL_CATEGORIES = eINSTANCE.getRiskNamespace_ControlCategories();

		/**
		 * The meta object literal for the '<em><b>Risk Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__RISK_CATEGORIES = eINSTANCE.getRiskNamespace_RiskCategories();

		/**
		 * The meta object literal for the '<em><b>Questionnaires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__QUESTIONNAIRES = eINSTANCE.getRiskNamespace_Questionnaires();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__DATA_SOURCES = eINSTANCE.getRiskNamespace_DataSources();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__PRODUCTS = eINSTANCE.getRiskNamespace_Products();

		/**
		 * The meta object literal for the '<em><b>Risk Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_NAMESPACE__RISK_REGISTERS = eINSTANCE.getRiskNamespace_RiskRegisters();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.DataClassification <em>Data Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.DataClassification
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getDataClassification()
		 * @generated
		 */
		EEnum DATA_CLASSIFICATION = eINSTANCE.getDataClassification();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.TreatmentStrategy <em>Treatment Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.TreatmentStrategy
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getTreatmentStrategy()
		 * @generated
		 */
		EEnum TREATMENT_STRATEGY = eINSTANCE.getTreatmentStrategy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.TreatmentStatus <em>Treatment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.TreatmentStatus
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getTreatmentStatus()
		 * @generated
		 */
		EEnum TREATMENT_STATUS = eINSTANCE.getTreatmentStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.ActionStatus
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.AssessmentStatus <em>Assessment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.AssessmentStatus
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getAssessmentStatus()
		 * @generated
		 */
		EEnum ASSESSMENT_STATUS = eINSTANCE.getAssessmentStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.RiskStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.RiskStatus
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getRiskStatus()
		 * @generated
		 */
		EEnum RISK_STATUS = eINSTANCE.getRiskStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.ControlType
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.ControlEffectiveness <em>Control Effectiveness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.ControlEffectiveness
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getControlEffectiveness()
		 * @generated
		 */
		EEnum CONTROL_EFFECTIVENESS = eINSTANCE.getControlEffectiveness();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.FindingType <em>Finding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.FindingType
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getFindingType()
		 * @generated
		 */
		EEnum FINDING_TYPE = eINSTANCE.getFindingType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.FindingStatus <em>Finding Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.FindingStatus
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getFindingStatus()
		 * @generated
		 */
		EEnum FINDING_STATUS = eINSTANCE.getFindingStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.QuestionType <em>Question Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.QuestionType
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getQuestionType()
		 * @generated
		 */
		EEnum QUESTION_TYPE = eINSTANCE.getQuestionType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.ProductComponentType <em>Product Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.ProductComponentType
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getProductComponentType()
		 * @generated
		 */
		EEnum PRODUCT_COMPONENT_TYPE = eINSTANCE.getProductComponentType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.ChangeEventType <em>Change Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.ChangeEventType
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getChangeEventType()
		 * @generated
		 */
		EEnum CHANGE_EVENT_TYPE = eINSTANCE.getChangeEventType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.risk.ArtifactType <em>Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.risk.ArtifactType
		 * @see org.nasdanika.models.risk.impl.RiskPackageImpl#getArtifactType()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getArtifactType();

	}

} //RiskPackage
