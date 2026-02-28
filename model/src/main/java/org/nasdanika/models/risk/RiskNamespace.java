/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root container for the risk management model. Holds the risk taxonomy (categories, risk types), risk levels, control categories, questionnaires, data sources, and products. Serves as the shared ontology/dictionary for the organization's risk management terminology. Also contains the products subject to risk assessment and the data sources from which risk-relevant data is collected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getRiskLevels <em>Risk Levels</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getControlCategories <em>Control Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getRiskCategories <em>Risk Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getQuestionnaires <em>Questionnaires</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskNamespace#getRiskRegisters <em>Risk Registers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace()
 * @model
 * @generated
 */
public interface RiskNamespace extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Risk Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.RiskLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defined risk levels (e.g., Critical, High, Medium, Low) ordered by score. These levels are used for likelihood, impact, and consolidated risk ratings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Levels</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_RiskLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskLevel> getRiskLevels();

	/**
	 * Returns the value of the '<em><b>Control Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.ControlCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categories of risk controls used in this organization (e.g., Technical, Administrative, Physical, Legal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Categories</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_ControlCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlCategory> getControlCategories();

	/**
	 * Returns the value of the '<em><b>Risk Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.RiskCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root risk categories in the organization's risk taxonomy. Forms the shared risk dictionary/ontology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Categories</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_RiskCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskCategory> getRiskCategories();

	/**
	 * Returns the value of the '<em><b>Questionnaires</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Questionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk assessment questionnaires available in this organization. Different questionnaires may apply to different product types or change triggers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaires</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_Questionnaires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Questionnaire> getQuestionnaires();

	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External data sources (Jira, GitHub, SonarQube, etc.) from which risk-relevant artifacts and change events are collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sources</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_DataSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSource> getDataSources();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bank digital products subject to risk assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Risk Registers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.RiskRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk registers providing consolidated views of the risk landscape.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Registers</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskNamespace_RiskRegisters()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskRegister> getRiskRegisters();

} // RiskNamespace
