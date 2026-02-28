/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A risk register that aggregates identified risks across multiple Risk Assessable Units. The register provides a consolidated view of the risk landscape and is used for reporting to management and risk committees.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskRegister#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskRegister#getReportDate <em>Report Date</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskRegister()
 * @model
 * @generated
 */
public interface RiskRegister extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.RiskRegisterEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entries in this risk register.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskRegister_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskRegisterEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Report Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of this risk register snapshot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Date</em>' attribute.
	 * @see #setReportDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskRegister_ReportDate()
	 * @model
	 * @generated
	 */
	Date getReportDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskRegister#getReportDate <em>Report Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Date</em>' attribute.
	 * @see #getReportDate()
	 * @generated
	 */
	void setReportDate(Date value);

} // RiskRegister
