/**
 */
package org.nasdanika.models.risk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A component of a bank digital product that is itself a Risk Assessable Unit (RAU). Examples include Jira Epics (but not stories or sub-tasks), code repositories, deployable units (microservices, containers), databases, and APIs. Smaller granularity items (individual source files, stories, sub-tasks) are not RAUs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.ProductComponent#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ProductComponent#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ProductComponent#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getProductComponent()
 * @model
 * @generated
 */
public interface ProductComponent extends RiskAssessableUnit {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.ProductComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this product component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ProductComponentType
	 * @see #setComponentType(ProductComponentType)
	 * @see org.nasdanika.models.risk.RiskPackage#getProductComponent_ComponentType()
	 * @model
	 * @generated
	 */
	ProductComponentType getComponentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ProductComponent#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ProductComponentType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ProductComponentType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version identifier for this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getProductComponent_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ProductComponent#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deployment environment (e.g., Development, Staging, Production).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getProductComponent_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ProductComponent#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

} // ProductComponent
