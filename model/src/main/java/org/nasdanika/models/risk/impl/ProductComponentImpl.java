/**
 */
package org.nasdanika.models.risk.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.ProductComponent;
import org.nasdanika.models.risk.ProductComponentType;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductComponentImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductComponentImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductComponentImpl extends RiskAssessableUnitImpl implements ProductComponent {
	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final ProductComponentType COMPONENT_TYPE_EDEFAULT = ProductComponentType.REPOSITORY;

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
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.PRODUCT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductComponentType getComponentType() {
		return (ProductComponentType)eDynamicGet(RiskPackage.PRODUCT_COMPONENT__COMPONENT_TYPE, RiskPackage.Literals.PRODUCT_COMPONENT__COMPONENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentType(ProductComponentType newComponentType) {
		eDynamicSet(RiskPackage.PRODUCT_COMPONENT__COMPONENT_TYPE, RiskPackage.Literals.PRODUCT_COMPONENT__COMPONENT_TYPE, newComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(RiskPackage.PRODUCT_COMPONENT__VERSION, RiskPackage.Literals.PRODUCT_COMPONENT__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(RiskPackage.PRODUCT_COMPONENT__VERSION, RiskPackage.Literals.PRODUCT_COMPONENT__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvironment() {
		return (String)eDynamicGet(RiskPackage.PRODUCT_COMPONENT__ENVIRONMENT, RiskPackage.Literals.PRODUCT_COMPONENT__ENVIRONMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(String newEnvironment) {
		eDynamicSet(RiskPackage.PRODUCT_COMPONENT__ENVIRONMENT, RiskPackage.Literals.PRODUCT_COMPONENT__ENVIRONMENT, newEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.PRODUCT_COMPONENT__COMPONENT_TYPE:
				return getComponentType();
			case RiskPackage.PRODUCT_COMPONENT__VERSION:
				return getVersion();
			case RiskPackage.PRODUCT_COMPONENT__ENVIRONMENT:
				return getEnvironment();
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
			case RiskPackage.PRODUCT_COMPONENT__COMPONENT_TYPE:
				setComponentType((ProductComponentType)newValue);
				return;
			case RiskPackage.PRODUCT_COMPONENT__VERSION:
				setVersion((String)newValue);
				return;
			case RiskPackage.PRODUCT_COMPONENT__ENVIRONMENT:
				setEnvironment((String)newValue);
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
			case RiskPackage.PRODUCT_COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case RiskPackage.PRODUCT_COMPONENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RiskPackage.PRODUCT_COMPONENT__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
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
			case RiskPackage.PRODUCT_COMPONENT__COMPONENT_TYPE:
				return getComponentType() != COMPONENT_TYPE_EDEFAULT;
			case RiskPackage.PRODUCT_COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case RiskPackage.PRODUCT_COMPONENT__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? getEnvironment() != null : !ENVIRONMENT_EDEFAULT.equals(getEnvironment());
		}
		return super.eIsSet(featureID);
	}

} //ProductComponentImpl
