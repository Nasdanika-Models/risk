/**
 */
package org.nasdanika.models.risk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A defined risk level or rating (e.g., Critical, High, Medium, Low). Risk levels are ordered by their score value and used for likelihood, impact, and consolidated ratings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.RiskLevel#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.RiskLevel#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getRiskLevel()
 * @model
 * @generated
 */
public interface RiskLevel extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numeric score associated with this level for quantitative calculations and aggregations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskLevel_Score()
	 * @model
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskLevel#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML color code for visualization in dashboards and reports (e.g., #FF0000 for red).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getRiskLevel_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.RiskLevel#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // RiskLevel
