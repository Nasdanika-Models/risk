/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.risk.RiskModelElement;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskModelElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskModelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.RiskModelElementImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RiskModelElementImpl extends MinimalEObjectImpl.Container implements RiskModelElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.RISK_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(RiskPackage.RISK_MODEL_ELEMENT__ID, RiskPackage.Literals.RISK_MODEL_ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(RiskPackage.RISK_MODEL_ELEMENT__ID, RiskPackage.Literals.RISK_MODEL_ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(RiskPackage.RISK_MODEL_ELEMENT__NAME, RiskPackage.Literals.RISK_MODEL_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(RiskPackage.RISK_MODEL_ELEMENT__NAME, RiskPackage.Literals.RISK_MODEL_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(RiskPackage.RISK_MODEL_ELEMENT__DESCRIPTION, RiskPackage.Literals.RISK_MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(RiskPackage.RISK_MODEL_ELEMENT__DESCRIPTION, RiskPackage.Literals.RISK_MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return (String)eDynamicGet(RiskPackage.RISK_MODEL_ELEMENT__URI, RiskPackage.Literals.RISK_MODEL_ELEMENT__URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		eDynamicSet(RiskPackage.RISK_MODEL_ELEMENT__URI, RiskPackage.Literals.RISK_MODEL_ELEMENT__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.RISK_MODEL_ELEMENT__ID:
				return getId();
			case RiskPackage.RISK_MODEL_ELEMENT__NAME:
				return getName();
			case RiskPackage.RISK_MODEL_ELEMENT__DESCRIPTION:
				return getDescription();
			case RiskPackage.RISK_MODEL_ELEMENT__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiskPackage.RISK_MODEL_ELEMENT__ID:
				setId((String)newValue);
				return;
			case RiskPackage.RISK_MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case RiskPackage.RISK_MODEL_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RiskPackage.RISK_MODEL_ELEMENT__URI:
				setUri((String)newValue);
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
			case RiskPackage.RISK_MODEL_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RiskPackage.RISK_MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RiskPackage.RISK_MODEL_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RiskPackage.RISK_MODEL_ELEMENT__URI:
				setUri(URI_EDEFAULT);
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
			case RiskPackage.RISK_MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case RiskPackage.RISK_MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case RiskPackage.RISK_MODEL_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case RiskPackage.RISK_MODEL_ELEMENT__URI:
				return URI_EDEFAULT == null ? getUri() != null : !URI_EDEFAULT.equals(getUri());
		}
		return super.eIsSet(featureID);
	}

} //RiskModelElementImpl
