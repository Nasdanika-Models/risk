/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.AssessmentStatus;
import org.nasdanika.models.risk.ChangeEvent;
import org.nasdanika.models.risk.Finding;
import org.nasdanika.models.risk.QuestionnaireResponse;
import org.nasdanika.models.risk.RiskAssessment;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.ScoreComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getAssessmentDate <em>Assessment Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getApprover <em>Approver</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getNextReviewDate <em>Next Review Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getScores <em>Scores</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getCompositeScore <em>Composite Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getConsolidatedRating <em>Consolidated Rating</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessmentImpl#getQuestionnaireResponses <em>Questionnaire Responses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentImpl extends RiskModelElementImpl implements RiskAssessment {
	/**
	 * The default value of the '{@link #getAssessmentDate() <em>Assessment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ASSESSMENT_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAssessor() <em>Assessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getApprover() <em>Approver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprover()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVIEW_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNextReviewDate() <em>Next Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_REVIEW_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AssessmentStatus STATUS_EDEFAULT = AssessmentStatus.DRAFT;

	/**
	 * The default value of the '{@link #getCompositeScore() <em>Composite Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeScore()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPOSITE_SCORE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAssessmentDate() {
		return (Date)eDynamicGet(RiskPackage.RISK_ASSESSMENT__ASSESSMENT_DATE, RiskPackage.Literals.RISK_ASSESSMENT__ASSESSMENT_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessmentDate(Date newAssessmentDate) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__ASSESSMENT_DATE, RiskPackage.Literals.RISK_ASSESSMENT__ASSESSMENT_DATE, newAssessmentDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssessor() {
		return (String)eDynamicGet(RiskPackage.RISK_ASSESSMENT__ASSESSOR, RiskPackage.Literals.RISK_ASSESSMENT__ASSESSOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessor(String newAssessor) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__ASSESSOR, RiskPackage.Literals.RISK_ASSESSMENT__ASSESSOR, newAssessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApprover() {
		return (String)eDynamicGet(RiskPackage.RISK_ASSESSMENT__APPROVER, RiskPackage.Literals.RISK_ASSESSMENT__APPROVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprover(String newApprover) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__APPROVER, RiskPackage.Literals.RISK_ASSESSMENT__APPROVER, newApprover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReviewDate() {
		return (Date)eDynamicGet(RiskPackage.RISK_ASSESSMENT__REVIEW_DATE, RiskPackage.Literals.RISK_ASSESSMENT__REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(Date newReviewDate) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__REVIEW_DATE, RiskPackage.Literals.RISK_ASSESSMENT__REVIEW_DATE, newReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNextReviewDate() {
		return (Date)eDynamicGet(RiskPackage.RISK_ASSESSMENT__NEXT_REVIEW_DATE, RiskPackage.Literals.RISK_ASSESSMENT__NEXT_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextReviewDate(Date newNextReviewDate) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__NEXT_REVIEW_DATE, RiskPackage.Literals.RISK_ASSESSMENT__NEXT_REVIEW_DATE, newNextReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentStatus getStatus() {
		return (AssessmentStatus)eDynamicGet(RiskPackage.RISK_ASSESSMENT__STATUS, RiskPackage.Literals.RISK_ASSESSMENT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(AssessmentStatus newStatus) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__STATUS, RiskPackage.Literals.RISK_ASSESSMENT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeEvent getTrigger() {
		return (ChangeEvent)eDynamicGet(RiskPackage.RISK_ASSESSMENT__TRIGGER, RiskPackage.Literals.RISK_ASSESSMENT__TRIGGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent basicGetTrigger() {
		return (ChangeEvent)eDynamicGet(RiskPackage.RISK_ASSESSMENT__TRIGGER, RiskPackage.Literals.RISK_ASSESSMENT__TRIGGER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(ChangeEvent newTrigger) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__TRIGGER, RiskPackage.Literals.RISK_ASSESSMENT__TRIGGER, newTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ScoreComponent> getScores() {
		return (EList<ScoreComponent>)eDynamicGet(RiskPackage.RISK_ASSESSMENT__SCORES, RiskPackage.Literals.RISK_ASSESSMENT__SCORES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCompositeScore() {
		return (Double)eDynamicGet(RiskPackage.RISK_ASSESSMENT__COMPOSITE_SCORE, RiskPackage.Literals.RISK_ASSESSMENT__COMPOSITE_SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeScore(double newCompositeScore) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__COMPOSITE_SCORE, RiskPackage.Literals.RISK_ASSESSMENT__COMPOSITE_SCORE, newCompositeScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getConsolidatedRating() {
		return (RiskLevel)eDynamicGet(RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING, RiskPackage.Literals.RISK_ASSESSMENT__CONSOLIDATED_RATING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetConsolidatedRating() {
		return (RiskLevel)eDynamicGet(RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING, RiskPackage.Literals.RISK_ASSESSMENT__CONSOLIDATED_RATING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsolidatedRating(RiskLevel newConsolidatedRating) {
		eDynamicSet(RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING, RiskPackage.Literals.RISK_ASSESSMENT__CONSOLIDATED_RATING, newConsolidatedRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Finding> getFindings() {
		return (EList<Finding>)eDynamicGet(RiskPackage.RISK_ASSESSMENT__FINDINGS, RiskPackage.Literals.RISK_ASSESSMENT__FINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<QuestionnaireResponse> getQuestionnaireResponses() {
		return (EList<QuestionnaireResponse>)eDynamicGet(RiskPackage.RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES, RiskPackage.Literals.RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.RISK_ASSESSMENT__SCORES:
				return ((InternalEList<?>)getScores()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_ASSESSMENT__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.RISK_ASSESSMENT__ASSESSMENT_DATE:
				return getAssessmentDate();
			case RiskPackage.RISK_ASSESSMENT__ASSESSOR:
				return getAssessor();
			case RiskPackage.RISK_ASSESSMENT__APPROVER:
				return getApprover();
			case RiskPackage.RISK_ASSESSMENT__REVIEW_DATE:
				return getReviewDate();
			case RiskPackage.RISK_ASSESSMENT__NEXT_REVIEW_DATE:
				return getNextReviewDate();
			case RiskPackage.RISK_ASSESSMENT__STATUS:
				return getStatus();
			case RiskPackage.RISK_ASSESSMENT__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case RiskPackage.RISK_ASSESSMENT__SCORES:
				return getScores();
			case RiskPackage.RISK_ASSESSMENT__COMPOSITE_SCORE:
				return getCompositeScore();
			case RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING:
				if (resolve) return getConsolidatedRating();
				return basicGetConsolidatedRating();
			case RiskPackage.RISK_ASSESSMENT__FINDINGS:
				return getFindings();
			case RiskPackage.RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES:
				return getQuestionnaireResponses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiskPackage.RISK_ASSESSMENT__ASSESSMENT_DATE:
				setAssessmentDate((Date)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__ASSESSOR:
				setAssessor((String)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__APPROVER:
				setApprover((String)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__REVIEW_DATE:
				setReviewDate((Date)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__NEXT_REVIEW_DATE:
				setNextReviewDate((Date)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__STATUS:
				setStatus((AssessmentStatus)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__TRIGGER:
				setTrigger((ChangeEvent)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__SCORES:
				getScores().clear();
				getScores().addAll((Collection<? extends ScoreComponent>)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__COMPOSITE_SCORE:
				setCompositeScore((Double)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING:
				setConsolidatedRating((RiskLevel)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Finding>)newValue);
				return;
			case RiskPackage.RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES:
				getQuestionnaireResponses().clear();
				getQuestionnaireResponses().addAll((Collection<? extends QuestionnaireResponse>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RiskPackage.RISK_ASSESSMENT__ASSESSMENT_DATE:
				setAssessmentDate(ASSESSMENT_DATE_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__ASSESSOR:
				setAssessor(ASSESSOR_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__APPROVER:
				setApprover(APPROVER_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__REVIEW_DATE:
				setReviewDate(REVIEW_DATE_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__NEXT_REVIEW_DATE:
				setNextReviewDate(NEXT_REVIEW_DATE_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__TRIGGER:
				setTrigger((ChangeEvent)null);
				return;
			case RiskPackage.RISK_ASSESSMENT__SCORES:
				getScores().clear();
				return;
			case RiskPackage.RISK_ASSESSMENT__COMPOSITE_SCORE:
				setCompositeScore(COMPOSITE_SCORE_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING:
				setConsolidatedRating((RiskLevel)null);
				return;
			case RiskPackage.RISK_ASSESSMENT__FINDINGS:
				getFindings().clear();
				return;
			case RiskPackage.RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES:
				getQuestionnaireResponses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RiskPackage.RISK_ASSESSMENT__ASSESSMENT_DATE:
				return ASSESSMENT_DATE_EDEFAULT == null ? getAssessmentDate() != null : !ASSESSMENT_DATE_EDEFAULT.equals(getAssessmentDate());
			case RiskPackage.RISK_ASSESSMENT__ASSESSOR:
				return ASSESSOR_EDEFAULT == null ? getAssessor() != null : !ASSESSOR_EDEFAULT.equals(getAssessor());
			case RiskPackage.RISK_ASSESSMENT__APPROVER:
				return APPROVER_EDEFAULT == null ? getApprover() != null : !APPROVER_EDEFAULT.equals(getApprover());
			case RiskPackage.RISK_ASSESSMENT__REVIEW_DATE:
				return REVIEW_DATE_EDEFAULT == null ? getReviewDate() != null : !REVIEW_DATE_EDEFAULT.equals(getReviewDate());
			case RiskPackage.RISK_ASSESSMENT__NEXT_REVIEW_DATE:
				return NEXT_REVIEW_DATE_EDEFAULT == null ? getNextReviewDate() != null : !NEXT_REVIEW_DATE_EDEFAULT.equals(getNextReviewDate());
			case RiskPackage.RISK_ASSESSMENT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RiskPackage.RISK_ASSESSMENT__TRIGGER:
				return basicGetTrigger() != null;
			case RiskPackage.RISK_ASSESSMENT__SCORES:
				return !getScores().isEmpty();
			case RiskPackage.RISK_ASSESSMENT__COMPOSITE_SCORE:
				return getCompositeScore() != COMPOSITE_SCORE_EDEFAULT;
			case RiskPackage.RISK_ASSESSMENT__CONSOLIDATED_RATING:
				return basicGetConsolidatedRating() != null;
			case RiskPackage.RISK_ASSESSMENT__FINDINGS:
				return !getFindings().isEmpty();
			case RiskPackage.RISK_ASSESSMENT__QUESTIONNAIRE_RESPONSES:
				return !getQuestionnaireResponses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentImpl
