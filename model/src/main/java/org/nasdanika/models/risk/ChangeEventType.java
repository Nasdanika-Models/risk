/**
 */
package org.nasdanika.models.risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Change Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The type of change event that may trigger a risk re-assessment.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.risk.RiskPackage#getChangeEventType()
 * @model
 * @generated
 */
public enum ChangeEventType implements Enumerator {
	/**
	 * The '<em><b>New Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A new feature or capability is being added to the product.
	 * <!-- end-model-doc -->
	 * @see #NEW_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_FEATURE(0, "NewFeature", "NewFeature"),

	/**
	 * The '<em><b>Enhancement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enhancement or modification to an existing feature.
	 * <!-- end-model-doc -->
	 * @see #ENHANCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENHANCEMENT(1, "Enhancement", "Enhancement"),

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A production deployment event.
	 * <!-- end-model-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(2, "Deployment", "Deployment"),

	/**
	 * The '<em><b>Security Vulnerability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security vulnerability discovered in a dependency or the product itself.
	 * <!-- end-model-doc -->
	 * @see #SECURITY_VULNERABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY_VULNERABILITY(3, "SecurityVulnerability", "SecurityVulnerability"),

	/**
	 * The '<em><b>Policy Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal policy or standard has changed.
	 * <!-- end-model-doc -->
	 * @see #POLICY_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	POLICY_CHANGE(4, "PolicyChange", "PolicyChange"),

	/**
	 * The '<em><b>Regulation Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A change in applicable laws or regulations.
	 * <!-- end-model-doc -->
	 * @see #REGULATION_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATION_CHANGE(5, "RegulationChange", "RegulationChange"),

	/**
	 * The '<em><b>Threat Intelligence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New threat intelligence relevant to the product's risk profile.
	 * <!-- end-model-doc -->
	 * @see #THREAT_INTELLIGENCE_VALUE
	 * @generated
	 * @ordered
	 */
	THREAT_INTELLIGENCE(6, "ThreatIntelligence", "ThreatIntelligence"),

	/**
	 * The '<em><b>Incident Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security or operational incident has been reported.
	 * <!-- end-model-doc -->
	 * @see #INCIDENT_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	INCIDENT_REPORT(7, "IncidentReport", "IncidentReport"),

	/**
	 * The '<em><b>Vendor Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A change in a vendor, supplier, or third-party dependency.
	 * <!-- end-model-doc -->
	 * @see #VENDOR_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	VENDOR_CHANGE(8, "VendorChange", "VendorChange"),

	/**
	 * The '<em><b>Architecture Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A significant architectural change (e.g., migration to cloud, adoption of AI).
	 * <!-- end-model-doc -->
	 * @see #ARCHITECTURE_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHITECTURE_CHANGE(9, "ArchitectureChange", "ArchitectureChange"),

	/**
	 * The '<em><b>Scheduled Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A periodic scheduled review is due.
	 * <!-- end-model-doc -->
	 * @see #SCHEDULED_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULED_REVIEW(10, "ScheduledReview", "ScheduledReview");

	/**
	 * The '<em><b>New Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A new feature or capability is being added to the product.
	 * <!-- end-model-doc -->
	 * @see #NEW_FEATURE
	 * @model name="NewFeature"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_FEATURE_VALUE = 0;

	/**
	 * The '<em><b>Enhancement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enhancement or modification to an existing feature.
	 * <!-- end-model-doc -->
	 * @see #ENHANCEMENT
	 * @model name="Enhancement"
	 * @generated
	 * @ordered
	 */
	public static final int ENHANCEMENT_VALUE = 1;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A production deployment event.
	 * <!-- end-model-doc -->
	 * @see #DEPLOYMENT
	 * @model name="Deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 2;

	/**
	 * The '<em><b>Security Vulnerability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security vulnerability discovered in a dependency or the product itself.
	 * <!-- end-model-doc -->
	 * @see #SECURITY_VULNERABILITY
	 * @model name="SecurityVulnerability"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VULNERABILITY_VALUE = 3;

	/**
	 * The '<em><b>Policy Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal policy or standard has changed.
	 * <!-- end-model-doc -->
	 * @see #POLICY_CHANGE
	 * @model name="PolicyChange"
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_CHANGE_VALUE = 4;

	/**
	 * The '<em><b>Regulation Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A change in applicable laws or regulations.
	 * <!-- end-model-doc -->
	 * @see #REGULATION_CHANGE
	 * @model name="RegulationChange"
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_CHANGE_VALUE = 5;

	/**
	 * The '<em><b>Threat Intelligence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New threat intelligence relevant to the product's risk profile.
	 * <!-- end-model-doc -->
	 * @see #THREAT_INTELLIGENCE
	 * @model name="ThreatIntelligence"
	 * @generated
	 * @ordered
	 */
	public static final int THREAT_INTELLIGENCE_VALUE = 6;

	/**
	 * The '<em><b>Incident Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A security or operational incident has been reported.
	 * <!-- end-model-doc -->
	 * @see #INCIDENT_REPORT
	 * @model name="IncidentReport"
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_REPORT_VALUE = 7;

	/**
	 * The '<em><b>Vendor Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A change in a vendor, supplier, or third-party dependency.
	 * <!-- end-model-doc -->
	 * @see #VENDOR_CHANGE
	 * @model name="VendorChange"
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_CHANGE_VALUE = 8;

	/**
	 * The '<em><b>Architecture Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A significant architectural change (e.g., migration to cloud, adoption of AI).
	 * <!-- end-model-doc -->
	 * @see #ARCHITECTURE_CHANGE
	 * @model name="ArchitectureChange"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHITECTURE_CHANGE_VALUE = 9;

	/**
	 * The '<em><b>Scheduled Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A periodic scheduled review is due.
	 * <!-- end-model-doc -->
	 * @see #SCHEDULED_REVIEW
	 * @model name="ScheduledReview"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULED_REVIEW_VALUE = 10;

	/**
	 * An array of all the '<em><b>Change Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeEventType[] VALUES_ARRAY =
		new ChangeEventType[] {
			NEW_FEATURE,
			ENHANCEMENT,
			DEPLOYMENT,
			SECURITY_VULNERABILITY,
			POLICY_CHANGE,
			REGULATION_CHANGE,
			THREAT_INTELLIGENCE,
			INCIDENT_REPORT,
			VENDOR_CHANGE,
			ARCHITECTURE_CHANGE,
			SCHEDULED_REVIEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeEventType get(int value) {
		switch (value) {
			case NEW_FEATURE_VALUE: return NEW_FEATURE;
			case ENHANCEMENT_VALUE: return ENHANCEMENT;
			case DEPLOYMENT_VALUE: return DEPLOYMENT;
			case SECURITY_VULNERABILITY_VALUE: return SECURITY_VULNERABILITY;
			case POLICY_CHANGE_VALUE: return POLICY_CHANGE;
			case REGULATION_CHANGE_VALUE: return REGULATION_CHANGE;
			case THREAT_INTELLIGENCE_VALUE: return THREAT_INTELLIGENCE;
			case INCIDENT_REPORT_VALUE: return INCIDENT_REPORT;
			case VENDOR_CHANGE_VALUE: return VENDOR_CHANGE;
			case ARCHITECTURE_CHANGE_VALUE: return ARCHITECTURE_CHANGE;
			case SCHEDULED_REVIEW_VALUE: return SCHEDULED_REVIEW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ChangeEventType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ChangeEventType
