/**
 */
package org.nasdanika.models.risk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A defined type of risk in the risk catalog/ontology. Represents a potential negative outcome or threat that can be assessed against Risk Assessable Units.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Risk#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Risk#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Risk#getRegulatoryReferences <em>Regulatory References</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Risk#getRelatedRisks <em>Related Risks</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRisk()
 * @model
 * @generated
 */
public interface Risk extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Events or conditions that may cause this risk to materialize (risk triggers/causes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggers</em>' attribute list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRisk_Triggers()
	 * @model
	 * @generated
	 */
	EList<String> getTriggers();

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential consequences or impacts if this risk materializes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consequences</em>' attribute list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRisk_Consequences()
	 * @model
	 * @generated
	 */
	EList<String> getConsequences();

	/**
	 * Returns the value of the '<em><b>Regulatory References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References to regulations, standards, or policies related to this risk (e.g., PCI-DSS 3.2, GDPR Article 32, FFIEC CAT).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory References</em>' attribute list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRisk_RegulatoryReferences()
	 * @model
	 * @generated
	 */
	EList<String> getRegulatoryReferences();

	/**
	 * Returns the value of the '<em><b>Related Risks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other risks in the catalog that are related to or can compound this risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Risks</em>' reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRisk_RelatedRisks()
	 * @model
	 * @generated
	 */
	EList<Risk> getRelatedRisks();

} // Risk
