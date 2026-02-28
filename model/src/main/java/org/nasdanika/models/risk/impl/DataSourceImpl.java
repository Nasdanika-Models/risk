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
import org.nasdanika.models.risk.DataSource;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.DataSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.DataSourceImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.DataSourceImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceImpl extends RiskModelElementImpl implements DataSource {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(RiskPackage.DATA_SOURCE__TYPE, RiskPackage.Literals.DATA_SOURCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(RiskPackage.DATA_SOURCE__TYPE, RiskPackage.Literals.DATA_SOURCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseUrl() {
		return (String)eDynamicGet(RiskPackage.DATA_SOURCE__BASE_URL, RiskPackage.Literals.DATA_SOURCE__BASE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseUrl(String newBaseUrl) {
		eDynamicSet(RiskPackage.DATA_SOURCE__BASE_URL, RiskPackage.Literals.DATA_SOURCE__BASE_URL, newBaseUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(RiskPackage.DATA_SOURCE__ARTIFACTS, RiskPackage.Literals.DATA_SOURCE__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.DATA_SOURCE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.DATA_SOURCE__TYPE:
				return getType();
			case RiskPackage.DATA_SOURCE__BASE_URL:
				return getBaseUrl();
			case RiskPackage.DATA_SOURCE__ARTIFACTS:
				return getArtifacts();
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
			case RiskPackage.DATA_SOURCE__TYPE:
				setType((String)newValue);
				return;
			case RiskPackage.DATA_SOURCE__BASE_URL:
				setBaseUrl((String)newValue);
				return;
			case RiskPackage.DATA_SOURCE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case RiskPackage.DATA_SOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RiskPackage.DATA_SOURCE__BASE_URL:
				setBaseUrl(BASE_URL_EDEFAULT);
				return;
			case RiskPackage.DATA_SOURCE__ARTIFACTS:
				getArtifacts().clear();
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
			case RiskPackage.DATA_SOURCE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case RiskPackage.DATA_SOURCE__BASE_URL:
				return BASE_URL_EDEFAULT == null ? getBaseUrl() != null : !BASE_URL_EDEFAULT.equals(getBaseUrl());
			case RiskPackage.DATA_SOURCE__ARTIFACTS:
				return !getArtifacts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSourceImpl
