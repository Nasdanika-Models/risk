/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.Risk;
import org.nasdanika.models.risk.RiskCategory;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskCategoryImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskCategoryImpl#getRisks <em>Risks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskCategoryImpl extends RiskModelElementImpl implements RiskCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RiskCategory> getSubCategories() {
		return (EList<RiskCategory>)eDynamicGet(RiskPackage.RISK_CATEGORY__SUB_CATEGORIES, RiskPackage.Literals.RISK_CATEGORY__SUB_CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(RiskPackage.RISK_CATEGORY__RISKS, RiskPackage.Literals.RISK_CATEGORY__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.RISK_CATEGORY__SUB_CATEGORIES:
				return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_CATEGORY__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.RISK_CATEGORY__SUB_CATEGORIES:
				return getSubCategories();
			case RiskPackage.RISK_CATEGORY__RISKS:
				return getRisks();
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
			case RiskPackage.RISK_CATEGORY__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends RiskCategory>)newValue);
				return;
			case RiskPackage.RISK_CATEGORY__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
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
			case RiskPackage.RISK_CATEGORY__SUB_CATEGORIES:
				getSubCategories().clear();
				return;
			case RiskPackage.RISK_CATEGORY__RISKS:
				getRisks().clear();
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
			case RiskPackage.RISK_CATEGORY__SUB_CATEGORIES:
				return !getSubCategories().isEmpty();
			case RiskPackage.RISK_CATEGORY__RISKS:
				return !getRisks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskCategoryImpl
