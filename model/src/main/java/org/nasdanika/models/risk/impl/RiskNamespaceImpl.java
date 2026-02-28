/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.risk.ControlCategory;
import org.nasdanika.models.risk.DataSource;
import org.nasdanika.models.risk.Product;
import org.nasdanika.models.risk.Questionnaire;
import org.nasdanika.models.risk.RiskCategory;
import org.nasdanika.models.risk.RiskLevel;
import org.nasdanika.models.risk.RiskNamespace;
import org.nasdanika.models.risk.RiskPackage;
import org.nasdanika.models.risk.RiskRegister;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getRiskLevels <em>Risk Levels</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getControlCategories <em>Control Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getRiskCategories <em>Risk Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getQuestionnaires <em>Questionnaires</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskNamespaceImpl#getRiskRegisters <em>Risk Registers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskNamespaceImpl extends RiskModelElementImpl implements RiskNamespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RiskLevel> getRiskLevels() {
		return (EList<RiskLevel>)eDynamicGet(RiskPackage.RISK_NAMESPACE__RISK_LEVELS, RiskPackage.Literals.RISK_NAMESPACE__RISK_LEVELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlCategory> getControlCategories() {
		return (EList<ControlCategory>)eDynamicGet(RiskPackage.RISK_NAMESPACE__CONTROL_CATEGORIES, RiskPackage.Literals.RISK_NAMESPACE__CONTROL_CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RiskCategory> getRiskCategories() {
		return (EList<RiskCategory>)eDynamicGet(RiskPackage.RISK_NAMESPACE__RISK_CATEGORIES, RiskPackage.Literals.RISK_NAMESPACE__RISK_CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Questionnaire> getQuestionnaires() {
		return (EList<Questionnaire>)eDynamicGet(RiskPackage.RISK_NAMESPACE__QUESTIONNAIRES, RiskPackage.Literals.RISK_NAMESPACE__QUESTIONNAIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataSource> getDataSources() {
		return (EList<DataSource>)eDynamicGet(RiskPackage.RISK_NAMESPACE__DATA_SOURCES, RiskPackage.Literals.RISK_NAMESPACE__DATA_SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Product> getProducts() {
		return (EList<Product>)eDynamicGet(RiskPackage.RISK_NAMESPACE__PRODUCTS, RiskPackage.Literals.RISK_NAMESPACE__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RiskRegister> getRiskRegisters() {
		return (EList<RiskRegister>)eDynamicGet(RiskPackage.RISK_NAMESPACE__RISK_REGISTERS, RiskPackage.Literals.RISK_NAMESPACE__RISK_REGISTERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.RISK_NAMESPACE__RISK_LEVELS:
				return ((InternalEList<?>)getRiskLevels()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_NAMESPACE__CONTROL_CATEGORIES:
				return ((InternalEList<?>)getControlCategories()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_NAMESPACE__RISK_CATEGORIES:
				return ((InternalEList<?>)getRiskCategories()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_NAMESPACE__QUESTIONNAIRES:
				return ((InternalEList<?>)getQuestionnaires()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_NAMESPACE__DATA_SOURCES:
				return ((InternalEList<?>)getDataSources()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_NAMESPACE__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case RiskPackage.RISK_NAMESPACE__RISK_REGISTERS:
				return ((InternalEList<?>)getRiskRegisters()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.RISK_NAMESPACE__RISK_LEVELS:
				return getRiskLevels();
			case RiskPackage.RISK_NAMESPACE__CONTROL_CATEGORIES:
				return getControlCategories();
			case RiskPackage.RISK_NAMESPACE__RISK_CATEGORIES:
				return getRiskCategories();
			case RiskPackage.RISK_NAMESPACE__QUESTIONNAIRES:
				return getQuestionnaires();
			case RiskPackage.RISK_NAMESPACE__DATA_SOURCES:
				return getDataSources();
			case RiskPackage.RISK_NAMESPACE__PRODUCTS:
				return getProducts();
			case RiskPackage.RISK_NAMESPACE__RISK_REGISTERS:
				return getRiskRegisters();
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
			case RiskPackage.RISK_NAMESPACE__RISK_LEVELS:
				getRiskLevels().clear();
				getRiskLevels().addAll((Collection<? extends RiskLevel>)newValue);
				return;
			case RiskPackage.RISK_NAMESPACE__CONTROL_CATEGORIES:
				getControlCategories().clear();
				getControlCategories().addAll((Collection<? extends ControlCategory>)newValue);
				return;
			case RiskPackage.RISK_NAMESPACE__RISK_CATEGORIES:
				getRiskCategories().clear();
				getRiskCategories().addAll((Collection<? extends RiskCategory>)newValue);
				return;
			case RiskPackage.RISK_NAMESPACE__QUESTIONNAIRES:
				getQuestionnaires().clear();
				getQuestionnaires().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case RiskPackage.RISK_NAMESPACE__DATA_SOURCES:
				getDataSources().clear();
				getDataSources().addAll((Collection<? extends DataSource>)newValue);
				return;
			case RiskPackage.RISK_NAMESPACE__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case RiskPackage.RISK_NAMESPACE__RISK_REGISTERS:
				getRiskRegisters().clear();
				getRiskRegisters().addAll((Collection<? extends RiskRegister>)newValue);
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
			case RiskPackage.RISK_NAMESPACE__RISK_LEVELS:
				getRiskLevels().clear();
				return;
			case RiskPackage.RISK_NAMESPACE__CONTROL_CATEGORIES:
				getControlCategories().clear();
				return;
			case RiskPackage.RISK_NAMESPACE__RISK_CATEGORIES:
				getRiskCategories().clear();
				return;
			case RiskPackage.RISK_NAMESPACE__QUESTIONNAIRES:
				getQuestionnaires().clear();
				return;
			case RiskPackage.RISK_NAMESPACE__DATA_SOURCES:
				getDataSources().clear();
				return;
			case RiskPackage.RISK_NAMESPACE__PRODUCTS:
				getProducts().clear();
				return;
			case RiskPackage.RISK_NAMESPACE__RISK_REGISTERS:
				getRiskRegisters().clear();
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
			case RiskPackage.RISK_NAMESPACE__RISK_LEVELS:
				return !getRiskLevels().isEmpty();
			case RiskPackage.RISK_NAMESPACE__CONTROL_CATEGORIES:
				return !getControlCategories().isEmpty();
			case RiskPackage.RISK_NAMESPACE__RISK_CATEGORIES:
				return !getRiskCategories().isEmpty();
			case RiskPackage.RISK_NAMESPACE__QUESTIONNAIRES:
				return !getQuestionnaires().isEmpty();
			case RiskPackage.RISK_NAMESPACE__DATA_SOURCES:
				return !getDataSources().isEmpty();
			case RiskPackage.RISK_NAMESPACE__PRODUCTS:
				return !getProducts().isEmpty();
			case RiskPackage.RISK_NAMESPACE__RISK_REGISTERS:
				return !getRiskRegisters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskNamespaceImpl
