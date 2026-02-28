/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.Artifact;
import org.nasdanika.models.risk.ChangeEvent;
import org.nasdanika.models.risk.ChangeEventType;
import org.nasdanika.models.risk.DataSource;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.ChangeEventImpl#getEventDate <em>Event Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ChangeEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ChangeEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ChangeEventImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ChangeEventImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeEventImpl extends RiskModelElementImpl implements ChangeEvent {
	/**
	 * The default value of the '{@link #getEventDate() <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EVENT_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeEventType TYPE_EDEFAULT = ChangeEventType.NEW_FEATURE;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.CHANGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEventDate() {
		return (Date)eDynamicGet(RiskPackage.CHANGE_EVENT__EVENT_DATE, RiskPackage.Literals.CHANGE_EVENT__EVENT_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventDate(Date newEventDate) {
		eDynamicSet(RiskPackage.CHANGE_EVENT__EVENT_DATE, RiskPackage.Literals.CHANGE_EVENT__EVENT_DATE, newEventDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeEventType getType() {
		return (ChangeEventType)eDynamicGet(RiskPackage.CHANGE_EVENT__TYPE, RiskPackage.Literals.CHANGE_EVENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ChangeEventType newType) {
		eDynamicSet(RiskPackage.CHANGE_EVENT__TYPE, RiskPackage.Literals.CHANGE_EVENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getSource() {
		return (DataSource)eDynamicGet(RiskPackage.CHANGE_EVENT__SOURCE, RiskPackage.Literals.CHANGE_EVENT__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetSource() {
		return (DataSource)eDynamicGet(RiskPackage.CHANGE_EVENT__SOURCE, RiskPackage.Literals.CHANGE_EVENT__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(DataSource newSource) {
		eDynamicSet(RiskPackage.CHANGE_EVENT__SOURCE, RiskPackage.Literals.CHANGE_EVENT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getArtifact() {
		return (Artifact)eDynamicGet(RiskPackage.CHANGE_EVENT__ARTIFACT, RiskPackage.Literals.CHANGE_EVENT__ARTIFACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetArtifact() {
		return (Artifact)eDynamicGet(RiskPackage.CHANGE_EVENT__ARTIFACT, RiskPackage.Literals.CHANGE_EVENT__ARTIFACT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(Artifact newArtifact) {
		eDynamicSet(RiskPackage.CHANGE_EVENT__ARTIFACT, RiskPackage.Literals.CHANGE_EVENT__ARTIFACT, newArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetails() {
		return (String)eDynamicGet(RiskPackage.CHANGE_EVENT__DETAILS, RiskPackage.Literals.CHANGE_EVENT__DETAILS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetails(String newDetails) {
		eDynamicSet(RiskPackage.CHANGE_EVENT__DETAILS, RiskPackage.Literals.CHANGE_EVENT__DETAILS, newDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.CHANGE_EVENT__EVENT_DATE:
				return getEventDate();
			case RiskPackage.CHANGE_EVENT__TYPE:
				return getType();
			case RiskPackage.CHANGE_EVENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RiskPackage.CHANGE_EVENT__ARTIFACT:
				if (resolve) return getArtifact();
				return basicGetArtifact();
			case RiskPackage.CHANGE_EVENT__DETAILS:
				return getDetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiskPackage.CHANGE_EVENT__EVENT_DATE:
				setEventDate((Date)newValue);
				return;
			case RiskPackage.CHANGE_EVENT__TYPE:
				setType((ChangeEventType)newValue);
				return;
			case RiskPackage.CHANGE_EVENT__SOURCE:
				setSource((DataSource)newValue);
				return;
			case RiskPackage.CHANGE_EVENT__ARTIFACT:
				setArtifact((Artifact)newValue);
				return;
			case RiskPackage.CHANGE_EVENT__DETAILS:
				setDetails((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RiskPackage.CHANGE_EVENT__EVENT_DATE:
				setEventDate(EVENT_DATE_EDEFAULT);
				return;
			case RiskPackage.CHANGE_EVENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RiskPackage.CHANGE_EVENT__SOURCE:
				setSource((DataSource)null);
				return;
			case RiskPackage.CHANGE_EVENT__ARTIFACT:
				setArtifact((Artifact)null);
				return;
			case RiskPackage.CHANGE_EVENT__DETAILS:
				setDetails(DETAILS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RiskPackage.CHANGE_EVENT__EVENT_DATE:
				return EVENT_DATE_EDEFAULT == null ? getEventDate() != null : !EVENT_DATE_EDEFAULT.equals(getEventDate());
			case RiskPackage.CHANGE_EVENT__TYPE:
				return getType() != TYPE_EDEFAULT;
			case RiskPackage.CHANGE_EVENT__SOURCE:
				return basicGetSource() != null;
			case RiskPackage.CHANGE_EVENT__ARTIFACT:
				return basicGetArtifact() != null;
			case RiskPackage.CHANGE_EVENT__DETAILS:
				return DETAILS_EDEFAULT == null ? getDetails() != null : !DETAILS_EDEFAULT.equals(getDetails());
		}
		return super.eIsSet(featureID);
	}

} //ChangeEventImpl
