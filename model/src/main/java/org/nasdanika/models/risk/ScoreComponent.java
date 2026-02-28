/**
 */
package org.nasdanika.models.risk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single scored dimension within a risk assessment, such as inherent risk, control effectiveness, or a specific questionnaire category score. Multiple score components are aggregated into a composite score.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.ScoreComponent#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ScoreComponent#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ScoreComponent#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ScoreComponent#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.ScoreComponent#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.risk.RiskPackage#getScoreComponent()
 * @model
 * @generated
 */
public interface ScoreComponent extends RiskModelElement {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numeric score for this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getScoreComponent_Score()
	 * @model
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ScoreComponent#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weight of this component in the composite score calculation (0-1, where all weights should sum to 1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.nasdanika.models.risk.RiskPackage#getScoreComponent_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ScoreComponent#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk level corresponding to this component's score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(RiskLevel)
	 * @see org.nasdanika.models.risk.RiskPackage#getScoreComponent_Level()
	 * @model
	 * @generated
	 */
	RiskLevel getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ScoreComponent#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source or basis for this score (e.g., questionnaire response, SAST scan, manual assessment).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getScoreComponent_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ScoreComponent#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes explaining the rationale for this score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see org.nasdanika.models.risk.RiskPackage#getScoreComponent_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.risk.ScoreComponent#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

} // ScoreComponent
