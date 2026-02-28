/**
 */
package org.nasdanika.models.risk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry in the risk register linking an identified risk to its RAU and current assessment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskRegisterEntry#getRiskAssessableUnit <em>Risk Assessable Unit</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskRegisterEntry#getIdentifiedRisk <em>Identified Risk</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskRegisterEntry()
 * @model
 * @generated
 */
public interface RiskRegisterEntry extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Risk Assessable Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RAU to which this risk register entry applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Assessable Unit</em>' reference.
	 * @see #setRiskAssessableUnit(RiskAssessableUnit)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskRegisterEntry_RiskAssessableUnit()
	 * @model required="true"
	 * @generated
	 */
	RiskAssessableUnit getRiskAssessableUnit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskRegisterEntry#getRiskAssessableUnit <em>Risk Assessable Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessable Unit</em>' reference.
	 * @see #getRiskAssessableUnit()
	 * @generated
	 */
	void setRiskAssessableUnit(RiskAssessableUnit value);

	/**
	 * Returns the value of the '<em><b>Identified Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identified risk captured in this register entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identified Risk</em>' reference.
	 * @see #setIdentifiedRisk(IdentifiedRisk)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskRegisterEntry_IdentifiedRisk()
	 * @model required="true"
	 * @generated
	 */
	IdentifiedRisk getIdentifiedRisk();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskRegisterEntry#getIdentifiedRisk <em>Identified Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identified Risk</em>' reference.
	 * @see #getIdentifiedRisk()
	 * @generated
	 */
	void setIdentifiedRisk(IdentifiedRisk value);

} // RiskRegisterEntry
