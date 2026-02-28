/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for all Risk Assessable Units (RAUs). An RAU is an entity at the right level of granularity to be independently assessed for risk. Examples of RAUs include a bank digital product, a Jira Epic, a code repository, or a deployable unit. Individual stories/tasks, source files, etc., are not RAUs. RAUs form a hierarchy - a product contains components which may themselves be RAUs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getDataClassification <em>Data Classification</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getIdentifiedRisks <em>Identified Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getQuestionnaires <em>Questionnaires</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getQuestionnaireResponses <em>Questionnaire Responses</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getAssessments <em>Assessments</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getChangeEvents <em>Change Events</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessableUnit#getCurrentRating <em>Current Rating</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit()
 * @model abstract="true"
 * @generated
 */
public interface RiskAssessableUnit extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Data Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.DataClassification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest data classification level handled by this RAU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Classification</em>' attribute.
	 * @see org.nasdanika.models.risk.DataClassification
	 * @see #setDataClassification(DataClassification)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_DataClassification()
	 * @model
	 * @generated
	 */
	DataClassification getDataClassification();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessableUnit#getDataClassification <em>Data Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Classification</em>' attribute.
	 * @see org.nasdanika.models.risk.DataClassification
	 * @see #getDataClassification()
	 * @generated
	 */
	void setDataClassification(DataClassification value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person or team responsible for this RAU and its risk posture.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessableUnit#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.ProductComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-components of this RAU that are themselves independently risk assessable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Identified Risks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.IdentifiedRisk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risks identified for this RAU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identified Risks</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_IdentifiedRisks()
	 * @model containment="true"
	 * @generated
	 */
	EList<IdentifiedRisk> getIdentifiedRisks();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls in place for this RAU that reduce the likelihood or impact of identified risks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Questionnaires</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Questionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaires applicable to this RAU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaires</em>' reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_Questionnaires()
	 * @model
	 * @generated
	 */
	EList<Questionnaire> getQuestionnaires();

	/**
	 * Returns the value of the '<em><b>Questionnaire Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.QuestionnaireResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completed questionnaire responses for this RAU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire Responses</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_QuestionnaireResponses()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponse> getQuestionnaireResponses();

	/**
	 * Returns the value of the '<em><b>Assessments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.RiskAssessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk assessments performed on this RAU, ordered by date (most recent last).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessments</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_Assessments()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskAssessment> getAssessments();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts in external data sources that are associated with this RAU (e.g., the Jira Epic, GitHub repo, deployment pipeline).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_Artifacts()
	 * @model
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Change Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.ChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change events detected for this RAU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Events</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_ChangeEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangeEvent> getChangeEvents();

	/**
	 * Returns the value of the '<em><b>Current Rating</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current consolidated risk rating from the most recent approved assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Rating</em>' reference.
	 * @see #setCurrentRating(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessableUnit_CurrentRating()
	 * @model
	 * @generated
	 */
	RiskLevel getCurrentRating();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessableUnit#getCurrentRating <em>Current Rating</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Rating</em>' reference.
	 * @see #getCurrentRating()
	 * @generated
	 */
	void setCurrentRating(RiskLevel value);

} // RiskAssessableUnit
