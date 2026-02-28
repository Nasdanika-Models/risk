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

import org.nasdanika.models.risk.Artifact;
import org.nasdanika.models.risk.ArtifactType;
import org.nasdanika.models.risk.KeyValuePair;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.ArtifactImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ArtifactImpl#getArtifactUrl <em>Artifact Url</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ArtifactImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ArtifactImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ArtifactImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends RiskModelElementImpl implements Artifact {
	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getArtifactUrl() <em>Artifact Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactType TYPE_EDEFAULT = ArtifactType.ISSUE;

	/**
	 * The default value of the '{@link #getLastUpdated() <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eDynamicGet(RiskPackage.ARTIFACT__EXTERNAL_ID, RiskPackage.Literals.ARTIFACT__EXTERNAL_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eDynamicSet(RiskPackage.ARTIFACT__EXTERNAL_ID, RiskPackage.Literals.ARTIFACT__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactUrl() {
		return (String)eDynamicGet(RiskPackage.ARTIFACT__ARTIFACT_URL, RiskPackage.Literals.ARTIFACT__ARTIFACT_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactUrl(String newArtifactUrl) {
		eDynamicSet(RiskPackage.ARTIFACT__ARTIFACT_URL, RiskPackage.Literals.ARTIFACT__ARTIFACT_URL, newArtifactUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactType getType() {
		return (ArtifactType)eDynamicGet(RiskPackage.ARTIFACT__TYPE, RiskPackage.Literals.ARTIFACT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ArtifactType newType) {
		eDynamicSet(RiskPackage.ARTIFACT__TYPE, RiskPackage.Literals.ARTIFACT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdated() {
		return (Date)eDynamicGet(RiskPackage.ARTIFACT__LAST_UPDATED, RiskPackage.Literals.ARTIFACT__LAST_UPDATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdated(Date newLastUpdated) {
		eDynamicSet(RiskPackage.ARTIFACT__LAST_UPDATED, RiskPackage.Literals.ARTIFACT__LAST_UPDATED, newLastUpdated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getMetadata() {
		return (EList<KeyValuePair>)eDynamicGet(RiskPackage.ARTIFACT__METADATA, RiskPackage.Literals.ARTIFACT__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskPackage.ARTIFACT__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case RiskPackage.ARTIFACT__EXTERNAL_ID:
				return getExternalId();
			case RiskPackage.ARTIFACT__ARTIFACT_URL:
				return getArtifactUrl();
			case RiskPackage.ARTIFACT__TYPE:
				return getType();
			case RiskPackage.ARTIFACT__LAST_UPDATED:
				return getLastUpdated();
			case RiskPackage.ARTIFACT__METADATA:
				return getMetadata();
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
			case RiskPackage.ARTIFACT__EXTERNAL_ID:
				setExternalId((String)newValue);
				return;
			case RiskPackage.ARTIFACT__ARTIFACT_URL:
				setArtifactUrl((String)newValue);
				return;
			case RiskPackage.ARTIFACT__TYPE:
				setType((ArtifactType)newValue);
				return;
			case RiskPackage.ARTIFACT__LAST_UPDATED:
				setLastUpdated((Date)newValue);
				return;
			case RiskPackage.ARTIFACT__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case RiskPackage.ARTIFACT__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
				return;
			case RiskPackage.ARTIFACT__ARTIFACT_URL:
				setArtifactUrl(ARTIFACT_URL_EDEFAULT);
				return;
			case RiskPackage.ARTIFACT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RiskPackage.ARTIFACT__LAST_UPDATED:
				setLastUpdated(LAST_UPDATED_EDEFAULT);
				return;
			case RiskPackage.ARTIFACT__METADATA:
				getMetadata().clear();
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
			case RiskPackage.ARTIFACT__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? getExternalId() != null : !EXTERNAL_ID_EDEFAULT.equals(getExternalId());
			case RiskPackage.ARTIFACT__ARTIFACT_URL:
				return ARTIFACT_URL_EDEFAULT == null ? getArtifactUrl() != null : !ARTIFACT_URL_EDEFAULT.equals(getArtifactUrl());
			case RiskPackage.ARTIFACT__TYPE:
				return getType() != TYPE_EDEFAULT;
			case RiskPackage.ARTIFACT__LAST_UPDATED:
				return LAST_UPDATED_EDEFAULT == null ? getLastUpdated() != null : !LAST_UPDATED_EDEFAULT.equals(getLastUpdated());
			case RiskPackage.ARTIFACT__METADATA:
				return !getMetadata().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
