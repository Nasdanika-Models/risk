/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A category of risks in the risk taxonomy (e.g., Cybersecurity, Operational, Compliance, Financial, Reputational). Risk categories can be nested to form a hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskCategory#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskCategory#getRisks <em>Risks</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskCategory()
 * @model
 * @generated
 */
public interface RiskCategory extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.RiskCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-categories of this risk category, forming a hierarchy (e.g., Cybersecurity > Data Breach, Cybersecurity > DDoS).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskCategory_SubCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskCategory> getSubCategories();

	/**
	 * Returns the value of the '<em><b>Risks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk types catalogued under this category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risks</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskCategory_Risks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Risk> getRisks();

} // RiskCategory
