/**
 */
package org.nasdanika.models.risk;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A risk control measure that reduces the likelihood or impact of a risk. Controls can be shared across multiple identified risks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.Control#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Control#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Control#getEffectiveness <em>Effectiveness</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Control#isAutomated <em>Automated</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Control#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Control#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.Control#getEvidenceUrl <em>Evidence Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of this control (e.g., Technical, Administrative).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(ControlCategory)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_Category()
	 * @model
	 * @generated
	 */
	ControlCategory getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ControlCategory value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.ControlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of control: Preventive, Detective, Corrective, or Compensating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ControlType
	 * @see #setType(ControlType)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_Type()
	 * @model
	 * @generated
	 */
	ControlType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.risk.ControlType
	 * @see #getType()
	 * @generated
	 */
	void setType(ControlType value);

	/**
	 * Returns the value of the '<em><b>Effectiveness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.risk.ControlEffectiveness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessed effectiveness of this control in reducing risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effectiveness</em>' attribute.
	 * @see org.nasdanika.models.risk.ControlEffectiveness
	 * @see #setEffectiveness(ControlEffectiveness)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_Effectiveness()
	 * @model
	 * @generated
	 */
	ControlEffectiveness getEffectiveness();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#getEffectiveness <em>Effectiveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectiveness</em>' attribute.
	 * @see org.nasdanika.models.risk.ControlEffectiveness
	 * @see #getEffectiveness()
	 * @generated
	 */
	void setEffectiveness(ControlEffectiveness value);

	/**
	 * Returns the value of the '<em><b>Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this control is automated (true) or manual (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automated</em>' attribute.
	 * @see #setAutomated(boolean)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_Automated()
	 * @model
	 * @generated
	 */
	boolean isAutomated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#isAutomated <em>Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automated</em>' attribute.
	 * @see #isAutomated()
	 * @generated
	 */
	void setAutomated(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person or team responsible for maintaining and operating this control.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this control was last reviewed for effectiveness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Date</em>' attribute.
	 * @see #setReviewDate(Date)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_ReviewDate()
	 * @model
	 * @generated
	 */
	Date getReviewDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#getReviewDate <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' attribute.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Evidence Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to evidence demonstrating this control is in place and operating effectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence Url</em>' attribute.
	 * @see #setEvidenceUrl(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getControl_EvidenceUrl()
	 * @model
	 * @generated
	 */
	String getEvidenceUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.Control#getEvidenceUrl <em>Evidence Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Url</em>' attribute.
	 * @see #getEvidenceUrl()
	 * @generated
	 */
	void setEvidenceUrl(String value);

} // Control
