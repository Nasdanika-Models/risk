/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.Question;
import org.nasdanika.models.risk.Questionnaire;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.QuestionnaireImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends RiskModelElementImpl implements Questionnaire {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABILITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(RiskPackage.QUESTIONNAIRE__VERSION, RiskPackage.Literals.QUESTIONNAIRE__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE__VERSION, RiskPackage.Literals.QUESTIONNAIRE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicability() {
		return (String)eDynamicGet(RiskPackage.QUESTIONNAIRE__APPLICABILITY, RiskPackage.Literals.QUESTIONNAIRE__APPLICABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicability(String newApplicability) {
		eDynamicSet(RiskPackage.QUESTIONNAIRE__APPLICABILITY, RiskPackage.Literals.QUESTIONNAIRE__APPLICABILITY, newApplicability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Question> getQuestions() {
		return (EList<Question>)eDynamicGet(RiskPackage.QUESTIONNAIRE__QUESTIONS, RiskPackage.Literals.QUESTIONNAIRE__QUESTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.QUESTIONNAIRE__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.QUESTIONNAIRE__VERSION:
				return getVersion();
			case RiskPackage.QUESTIONNAIRE__APPLICABILITY:
				return getApplicability();
			case RiskPackage.QUESTIONNAIRE__QUESTIONS:
				return getQuestions();
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
			case RiskPackage.QUESTIONNAIRE__VERSION:
				setVersion((String)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE__APPLICABILITY:
				setApplicability((String)newValue);
				return;
			case RiskPackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
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
			case RiskPackage.QUESTIONNAIRE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RiskPackage.QUESTIONNAIRE__APPLICABILITY:
				setApplicability(APPLICABILITY_EDEFAULT);
				return;
			case RiskPackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
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
			case RiskPackage.QUESTIONNAIRE__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case RiskPackage.QUESTIONNAIRE__APPLICABILITY:
				return APPLICABILITY_EDEFAULT == null ? getApplicability() != null : !APPLICABILITY_EDEFAULT.equals(getApplicability());
			case RiskPackage.QUESTIONNAIRE__QUESTIONS:
				return !getQuestions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl
