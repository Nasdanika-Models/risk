/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A risk assessment performed on a Risk Assessable Unit at a specific point in time. Assessments are triggered initially, periodically (scheduled review), or when a change is detected. The assessment captures individual scores, a consolidated rating, and findings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getAssessmentDate <em>Assessment Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getApprover <em>Approver</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getNextReviewDate <em>Next Review Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getScores <em>Scores</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getCompositeScore <em>Composite Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getConsolidatedRating <em>Consolidated Rating</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskAssessment#getQuestionnaireResponses <em>Questionnaire Responses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment()
 * @model
 * @generated
 */
public interface RiskAssessment extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Assessment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this assessment was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Date</em>' attribute.
	 * @see #setAssessmentDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_AssessmentDate()
	 * @model
	 * @generated
	 */
	Date getAssessmentDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getAssessmentDate <em>Assessment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Date</em>' attribute.
	 * @see #getAssessmentDate()
	 * @generated
	 */
	void setAssessmentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Assessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person or system that performed this assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessor</em>' attribute.
	 * @see #setAssessor(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_Assessor()
	 * @model
	 * @generated
	 */
	String getAssessor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getAssessor <em>Assessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessor</em>' attribute.
	 * @see #getAssessor()
	 * @generated
	 */
	void setAssessor(String value);

	/**
	 * Returns the value of the '<em><b>Approver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person who reviewed and approved this assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approver</em>' attribute.
	 * @see #setApprover(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_Approver()
	 * @model
	 * @generated
	 */
	String getApprover();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getApprover <em>Approver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver</em>' attribute.
	 * @see #getApprover()
	 * @generated
	 */
	void setApprover(String value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this assessment was reviewed and approved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Date</em>' attribute.
	 * @see #setReviewDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_ReviewDate()
	 * @model
	 * @generated
	 */
	Date getReviewDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getReviewDate <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' attribute.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Next Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheduled date for the next periodic re-assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Review Date</em>' attribute.
	 * @see #setNextReviewDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_NextReviewDate()
	 * @model
	 * @generated
	 */
	Date getNextReviewDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getNextReviewDate <em>Next Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Review Date</em>' attribute.
	 * @see #getNextReviewDate()
	 * @generated
	 */
	void setNextReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.AssessmentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current lifecycle status of this assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.AssessmentStatus
	 * @see #setStatus(AssessmentStatus)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_Status()
	 * @model
	 * @generated
	 */
	AssessmentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.AssessmentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AssessmentStatus value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The change event that triggered this assessment, if it was event-driven rather than a scheduled review.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(ChangeEvent)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_Trigger()
	 * @model
	 * @generated
	 */
	ChangeEvent getTrigger();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(ChangeEvent value);

	/**
	 * Returns the value of the '<em><b>Scores</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.ScoreComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual score components that feed into the consolidated rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scores</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_Scores()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScoreComponent> getScores();

	/**
	 * Returns the value of the '<em><b>Composite Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregated composite risk score computed from all weighted score components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Score</em>' attribute.
	 * @see #setCompositeScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_CompositeScore()
	 * @model
	 * @generated
	 */
	double getCompositeScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getCompositeScore <em>Composite Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Score</em>' attribute.
	 * @see #getCompositeScore()
	 * @generated
	 */
	void setCompositeScore(double value);

	/**
	 * Returns the value of the '<em><b>Consolidated Rating</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall consolidated risk rating derived from the composite score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consolidated Rating</em>' reference.
	 * @see #setConsolidatedRating(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_ConsolidatedRating()
	 * @model
	 * @generated
	 */
	RiskLevel getConsolidatedRating();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskAssessment#getConsolidatedRating <em>Consolidated Rating</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consolidated Rating</em>' reference.
	 * @see #getConsolidatedRating()
	 * @generated
	 */
	void setConsolidatedRating(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Findings (gaps, issues, recommendations) identified during this assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_Findings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

	/**
	 * Returns the value of the '<em><b>Questionnaire Responses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.QuestionnaireResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire responses used as input for this assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire Responses</em>' reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskAssessment_QuestionnaireResponses()
	 * @model
	 * @generated
	 */
	EList<QuestionnaireResponse> getQuestionnaireResponses();

} // RiskAssessment
