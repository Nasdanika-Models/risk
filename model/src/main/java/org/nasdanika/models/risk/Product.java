/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bank digital product or application being developed or maintained. This is the top-level Risk Assessable Unit. Product management creates the initial entry for the product in Jira or another system when development begins. The product is then assessed and re-assessed over its lifecycle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Product#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getBusinessLine <em>Business Line</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getDevelopmentTeam <em>Development Team</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getTechnologyStack <em>Technology Stack</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#isUsesPublicCloud <em>Uses Public Cloud</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#isUsesAI <em>Uses AI</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getRegulatoryScope <em>Regulatory Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getOnboardingDate <em>Onboarding Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getProductionDate <em>Production Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Product#getReviewCycleDays <em>Review Cycle Days</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends RiskAssessableUnit {
	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of product (e.g., Web Application, Mobile App, API, Batch Process, Internal Tool, Data Platform).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' attribute.
	 * @see #setProductType(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_ProductType()
	 * @model
	 * @generated
	 */
	String getProductType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' attribute.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(String value);

	/**
	 * Returns the value of the '<em><b>Business Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business line or division that owns this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Line</em>' attribute.
	 * @see #setBusinessLine(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_BusinessLine()
	 * @model
	 * @generated
	 */
	String getBusinessLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#getBusinessLine <em>Business Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Line</em>' attribute.
	 * @see #getBusinessLine()
	 * @generated
	 */
	void setBusinessLine(String value);

	/**
	 * Returns the value of the '<em><b>Development Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Development team or squad responsible for building and maintaining this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Development Team</em>' attribute.
	 * @see #setDevelopmentTeam(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_DevelopmentTeam()
	 * @model
	 * @generated
	 */
	String getDevelopmentTeam();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#getDevelopmentTeam <em>Development Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Team</em>' attribute.
	 * @see #getDevelopmentTeam()
	 * @generated
	 */
	void setDevelopmentTeam(String value);

	/**
	 * Returns the value of the '<em><b>Technology Stack</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technologies used in this product (e.g., Java, Spring Boot, React, PostgreSQL, AWS).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technology Stack</em>' attribute list.
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_TechnologyStack()
	 * @model
	 * @generated
	 */
	EList<String> getTechnologyStack();

	/**
	 * Returns the value of the '<em><b>Uses Public Cloud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this product uses public cloud infrastructure (triggers additional cloud-risk questionnaire).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Public Cloud</em>' attribute.
	 * @see #setUsesPublicCloud(boolean)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_UsesPublicCloud()
	 * @model
	 * @generated
	 */
	boolean isUsesPublicCloud();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#isUsesPublicCloud <em>Uses Public Cloud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Public Cloud</em>' attribute.
	 * @see #isUsesPublicCloud()
	 * @generated
	 */
	void setUsesPublicCloud(boolean value);

	/**
	 * Returns the value of the '<em><b>Uses AI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this product incorporates AI/ML capabilities (triggers additional AI-risk questionnaire and governance review).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses AI</em>' attribute.
	 * @see #setUsesAI(boolean)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_UsesAI()
	 * @model
	 * @generated
	 */
	boolean isUsesAI();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#isUsesAI <em>Uses AI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses AI</em>' attribute.
	 * @see #isUsesAI()
	 * @generated
	 */
	void setUsesAI(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulatory Scope</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulations or standards this product must comply with (e.g., PCI-DSS, GDPR, SOX, FFIEC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory Scope</em>' attribute list.
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_RegulatoryScope()
	 * @model
	 * @generated
	 */
	EList<String> getRegulatoryScope();

	/**
	 * Returns the value of the '<em><b>Onboarding Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when the product was first registered for risk assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onboarding Date</em>' attribute.
	 * @see #setOnboardingDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_OnboardingDate()
	 * @model
	 * @generated
	 */
	Date getOnboardingDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#getOnboardingDate <em>Onboarding Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onboarding Date</em>' attribute.
	 * @see #getOnboardingDate()
	 * @generated
	 */
	void setOnboardingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Production Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when the product went live in production.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Production Date</em>' attribute.
	 * @see #setProductionDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_ProductionDate()
	 * @model
	 * @generated
	 */
	Date getProductionDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#getProductionDate <em>Production Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Date</em>' attribute.
	 * @see #getProductionDate()
	 * @generated
	 */
	void setProductionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Review Cycle Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required review cycle in days for the risk assessment (e.g., 365 for annual, 180 for semi-annual). May vary by risk rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Cycle Days</em>' attribute.
	 * @see #setReviewCycleDays(int)
	 * @see org.nasdanika.models.risk.RiskPackage#getProduct_ReviewCycleDays()
	 * @model
	 * @generated
	 */
	int getReviewCycleDays();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Product#getReviewCycleDays <em>Review Cycle Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Cycle Days</em>' attribute.
	 * @see #getReviewCycleDays()
	 * @generated
	 */
	void setReviewCycleDays(int value);

} // Product
