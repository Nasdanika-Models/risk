/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.Artifact;
import org.nasdanika.models.risk.ChangeEvent;
import org.nasdanika.models.risk.Control;
import org.nasdanika.models.risk.DataClassification;
import org.nasdanika.models.risk.IdentifiedRisk;
import org.nasdanika.models.risk.ProductComponent;
import org.nasdanika.models.risk.Questionnaire;
import org.nasdanika.models.risk.QuestionnaireResponse;
import org.nasdanika.models.risk.RiskAssessableUnit;
import org.nasdanika.models.risk.RiskAssessment;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessable Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getDataClassification <em>Data Classification</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getIdentifiedRisks <em>Identified Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getQuestionnaires <em>Questionnaires</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getQuestionnaireResponses <em>Questionnaire Responses</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getAssessments <em>Assessments</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getChangeEvents <em>Change Events</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskAssessableUnitImpl#getCurrentRating <em>Current Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RiskAssessableUnitImpl extends RiskModelElementImpl implements RiskAssessableUnit {
	/**
	 * The default value of the '{@link #getDataClassification() <em>Data Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataClassification()
	 * @generated
	 * @ordered
	 */
	protected static final DataClassification DATA_CLASSIFICATION_EDEFAULT = DataClassification.PUBLIC;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessableUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_ASSESSABLE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataClassification getDataClassification() {
		return (DataClassification)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataClassification(DataClassification newDataClassification) {
		eDynamicSet(RiskPackage.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION, newDataClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwner() {
		return (String)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__OWNER, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(String newOwner) {
		eDynamicSet(RiskPackage.RISK_ASSESSABLE_UNIT__OWNER, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProductComponent> getComponents() {
		return (EList<ProductComponent>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__COMPONENTS, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IdentifiedRisk> getIdentifiedRisks() {
		return (EList<IdentifiedRisk>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Control> getControls() {
		return (EList<Control>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__CONTROLS, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Questionnaire> getQuestionnaires() {
		return (EList<Questionnaire>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRES, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__QUESTIONNAIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<QuestionnaireResponse> getQuestionnaireResponses() {
		return (EList<QuestionnaireResponse>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RiskAssessment> getAssessments() {
		return (EList<RiskAssessment>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__ASSESSMENTS, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__ASSESSMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__ARTIFACTS, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ChangeEvent> getChangeEvents() {
		return (EList<ChangeEvent>)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getCurrentRating() {
		return (RiskLevel)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__CURRENT_RATING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel basicGetCurrentRating() {
		return (RiskLevel)eDynamicGet(RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__CURRENT_RATING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRating(RiskLevel newCurrentRating) {
		eDynamicSet(RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING, RiskPackage.Literals.RISK_ASSESSABLE_UNIT__CURRENT_RATING, newCurrentRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.RISK_ASSESSABLE_UNIT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS:
				return ((InternalEList<?>)getIdentifiedRisks()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_ASSESSABLE_UNIT__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES:
				return ((InternalEList<?>)getQuestionnaireResponses()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_ASSESSABLE_UNIT__ASSESSMENTS:
				return ((InternalEList<?>)getAssessments()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS:
				return ((InternalEList<?>)getChangeEvents()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION:
				return getDataClassification();
			case RiskPackage.RISK_ASSESSABLE_UNIT__OWNER:
				return getOwner();
			case RiskPackage.RISK_ASSESSABLE_UNIT__COMPONENTS:
				return getComponents();
			case RiskPackage.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS:
				return getIdentifiedRisks();
			case RiskPackage.RISK_ASSESSABLE_UNIT__CONTROLS:
				return getControls();
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRES:
				return getQuestionnaires();
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES:
				return getQuestionnaireResponses();
			case RiskPackage.RISK_ASSESSABLE_UNIT__ASSESSMENTS:
				return getAssessments();
			case RiskPackage.RISK_ASSESSABLE_UNIT__ARTIFACTS:
				return getArtifacts();
			case RiskPackage.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS:
				return getChangeEvents();
			case RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING:
				if (resolve) return getCurrentRating();
				return basicGetCurrentRating();
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
			case RiskPackage.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION:
				setDataClassification((DataClassification)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__OWNER:
				setOwner((String)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ProductComponent>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS:
				getIdentifiedRisks().clear();
				getIdentifiedRisks().addAll((Collection<? extends IdentifiedRisk>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRES:
				getQuestionnaires().clear();
				getQuestionnaires().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES:
				getQuestionnaireResponses().clear();
				getQuestionnaireResponses().addAll((Collection<? extends QuestionnaireResponse>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__ASSESSMENTS:
				getAssessments().clear();
				getAssessments().addAll((Collection<? extends RiskAssessment>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS:
				getChangeEvents().clear();
				getChangeEvents().addAll((Collection<? extends ChangeEvent>)newValue);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING:
				setCurrentRating((RiskLevel)newValue);
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
			case RiskPackage.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION:
				setDataClassification(DATA_CLASSIFICATION_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__COMPONENTS:
				getComponents().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS:
				getIdentifiedRisks().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__CONTROLS:
				getControls().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRES:
				getQuestionnaires().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES:
				getQuestionnaireResponses().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__ASSESSMENTS:
				getAssessments().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__ARTIFACTS:
				getArtifacts().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS:
				getChangeEvents().clear();
				return;
			case RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING:
				setCurrentRating((RiskLevel)null);
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
			case RiskPackage.RISK_ASSESSABLE_UNIT__DATA_CLASSIFICATION:
				return getDataClassification() != DATA_CLASSIFICATION_EDEFAULT;
			case RiskPackage.RISK_ASSESSABLE_UNIT__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case RiskPackage.RISK_ASSESSABLE_UNIT__COMPONENTS:
				return !getComponents().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__IDENTIFIED_RISKS:
				return !getIdentifiedRisks().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__CONTROLS:
				return !getControls().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRES:
				return !getQuestionnaires().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__QUESTIONNAIRE_RESPONSES:
				return !getQuestionnaireResponses().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__ASSESSMENTS:
				return !getAssessments().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__ARTIFACTS:
				return !getArtifacts().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__CHANGE_EVENTS:
				return !getChangeEvents().isEmpty();
			case RiskPackage.RISK_ASSESSABLE_UNIT__CURRENT_RATING:
				return basicGetCurrentRating() != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessableUnitImpl
