/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific risk identified for a Risk Assessable Unit, including its assessed likelihood, impact, and treatment information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getInherentScore <em>Inherent Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getResidualScore <em>Residual Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getResidualLevel <em>Residual Level</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.IdentifiedRisk#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk()
 * @model
 * @generated
 */
public interface IdentifiedRisk extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the risk type in the risk catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk</em>' reference.
	 * @see #setRisk(Risk)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Risk()
	 * @model required="true"
	 * @generated
	 */
	Risk getRisk();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getRisk <em>Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' reference.
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(Risk value);

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessed likelihood of this risk occurring (inherent, before controls).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Likelihood</em>' reference.
	 * @see #setLikelihood(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Likelihood()
	 * @model
	 * @generated
	 */
	RiskLevel getLikelihood();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getLikelihood <em>Likelihood</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' reference.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessed potential impact if this risk materializes (inherent, before controls).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impact</em>' reference.
	 * @see #setImpact(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Impact()
	 * @model
	 * @generated
	 */
	RiskLevel getImpact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getImpact <em>Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' reference.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Inherent Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overall inherent risk score before controls are applied (typically likelihood score * impact score).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherent Score</em>' attribute.
	 * @see #setInherentScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_InherentScore()
	 * @model
	 * @generated
	 */
	double getInherentScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getInherentScore <em>Inherent Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherent Score</em>' attribute.
	 * @see #getInherentScore()
	 * @generated
	 */
	void setInherentScore(double value);

	/**
	 * Returns the value of the '<em><b>Residual Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Residual risk score after applying controls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residual Score</em>' attribute.
	 * @see #setResidualScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_ResidualScore()
	 * @model
	 * @generated
	 */
	double getResidualScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getResidualScore <em>Residual Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Score</em>' attribute.
	 * @see #getResidualScore()
	 * @generated
	 */
	void setResidualScore(double value);

	/**
	 * Returns the value of the '<em><b>Residual Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resulting risk level after applying controls (residual risk rating).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residual Level</em>' reference.
	 * @see #setResidualLevel(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_ResidualLevel()
	 * @model
	 * @generated
	 */
	RiskLevel getResidualLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getResidualLevel <em>Residual Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Level</em>' reference.
	 * @see #getResidualLevel()
	 * @generated
	 */
	void setResidualLevel(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.RiskStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current lifecycle status of this identified risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.RiskStatus
	 * @see #setStatus(RiskStatus)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Status()
	 * @model
	 * @generated
	 */
	RiskStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.risk.RiskStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RiskStatus value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person or team responsible for managing and monitoring this risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target date for bringing this risk to an acceptable level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional context, rationale, or notes about this risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Treatment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The treatment plan for this risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treatment</em>' containment reference.
	 * @see #setTreatment(RiskTreatment)
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Treatment()
	 * @model containment="true"
	 * @generated
	 */
	RiskTreatment getTreatment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.IdentifiedRisk#getTreatment <em>Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment</em>' containment reference.
	 * @see #getTreatment()
	 * @generated
	 */
	void setTreatment(RiskTreatment value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls applied to reduce this risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Controls()
	 * @model
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.risk.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Findings related to this risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see org.nasdanika.models.risk.RiskPackage#getIdentifiedRisk_Findings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

} // IdentifiedRisk
