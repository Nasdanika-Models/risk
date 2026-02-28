/**
 */
package org.nasdanika.models.risk.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.risk.Product;
import org.nasdanika.models.risk.RiskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getBusinessLine <em>Business Line</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getDevelopmentTeam <em>Development Team</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getTechnologyStack <em>Technology Stack</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#isUsesPublicCloud <em>Uses Public Cloud</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#isUsesAI <em>Uses AI</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getRegulatoryScope <em>Regulatory Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getOnboardingDate <em>Onboarding Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getProductionDate <em>Production Date</em>}</li>
 *   <li>{@link org.nasdanika.models.risk.impl.ProductImpl#getReviewCycleDays <em>Review Cycle Days</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends RiskAssessableUnitImpl implements Product {
	/**
	 * The default value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBusinessLine() <em>Business Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessLine()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_LINE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDevelopmentTeam() <em>Development Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPMENT_TEAM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isUsesPublicCloud() <em>Uses Public Cloud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsesPublicCloud()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USES_PUBLIC_CLOUD_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUsesAI() <em>Uses AI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsesAI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USES_AI_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getOnboardingDate() <em>Onboarding Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnboardingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ONBOARDING_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductionDate() <em>Production Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRODUCTION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReviewCycleDays() <em>Review Cycle Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewCycleDays()
	 * @generated
	 * @ordered
	 */
	protected static final int REVIEW_CYCLE_DAYS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductType() {
		return (String)eDynamicGet(RiskPackage.PRODUCT__PRODUCT_TYPE, RiskPackage.Literals.PRODUCT__PRODUCT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductType(String newProductType) {
		eDynamicSet(RiskPackage.PRODUCT__PRODUCT_TYPE, RiskPackage.Literals.PRODUCT__PRODUCT_TYPE, newProductType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusinessLine() {
		return (String)eDynamicGet(RiskPackage.PRODUCT__BUSINESS_LINE, RiskPackage.Literals.PRODUCT__BUSINESS_LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessLine(String newBusinessLine) {
		eDynamicSet(RiskPackage.PRODUCT__BUSINESS_LINE, RiskPackage.Literals.PRODUCT__BUSINESS_LINE, newBusinessLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevelopmentTeam() {
		return (String)eDynamicGet(RiskPackage.PRODUCT__DEVELOPMENT_TEAM, RiskPackage.Literals.PRODUCT__DEVELOPMENT_TEAM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopmentTeam(String newDevelopmentTeam) {
		eDynamicSet(RiskPackage.PRODUCT__DEVELOPMENT_TEAM, RiskPackage.Literals.PRODUCT__DEVELOPMENT_TEAM, newDevelopmentTeam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getTechnologyStack() {
		return (EList<String>)eDynamicGet(RiskPackage.PRODUCT__TECHNOLOGY_STACK, RiskPackage.Literals.PRODUCT__TECHNOLOGY_STACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsesPublicCloud() {
		return (Boolean)eDynamicGet(RiskPackage.PRODUCT__USES_PUBLIC_CLOUD, RiskPackage.Literals.PRODUCT__USES_PUBLIC_CLOUD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesPublicCloud(boolean newUsesPublicCloud) {
		eDynamicSet(RiskPackage.PRODUCT__USES_PUBLIC_CLOUD, RiskPackage.Literals.PRODUCT__USES_PUBLIC_CLOUD, newUsesPublicCloud);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsesAI() {
		return (Boolean)eDynamicGet(RiskPackage.PRODUCT__USES_AI, RiskPackage.Literals.PRODUCT__USES_AI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesAI(boolean newUsesAI) {
		eDynamicSet(RiskPackage.PRODUCT__USES_AI, RiskPackage.Literals.PRODUCT__USES_AI, newUsesAI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRegulatoryScope() {
		return (EList<String>)eDynamicGet(RiskPackage.PRODUCT__REGULATORY_SCOPE, RiskPackage.Literals.PRODUCT__REGULATORY_SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOnboardingDate() {
		return (Date)eDynamicGet(RiskPackage.PRODUCT__ONBOARDING_DATE, RiskPackage.Literals.PRODUCT__ONBOARDING_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnboardingDate(Date newOnboardingDate) {
		eDynamicSet(RiskPackage.PRODUCT__ONBOARDING_DATE, RiskPackage.Literals.PRODUCT__ONBOARDING_DATE, newOnboardingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getProductionDate() {
		return (Date)eDynamicGet(RiskPackage.PRODUCT__PRODUCTION_DATE, RiskPackage.Literals.PRODUCT__PRODUCTION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionDate(Date newProductionDate) {
		eDynamicSet(RiskPackage.PRODUCT__PRODUCTION_DATE, RiskPackage.Literals.PRODUCT__PRODUCTION_DATE, newProductionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReviewCycleDays() {
		return (Integer)eDynamicGet(RiskPackage.PRODUCT__REVIEW_CYCLE_DAYS, RiskPackage.Literals.PRODUCT__REVIEW_CYCLE_DAYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewCycleDays(int newReviewCycleDays) {
		eDynamicSet(RiskPackage.PRODUCT__REVIEW_CYCLE_DAYS, RiskPackage.Literals.PRODUCT__REVIEW_CYCLE_DAYS, newReviewCycleDays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiskPackage.PRODUCT__PRODUCT_TYPE:
				return getProductType();
			case RiskPackage.PRODUCT__BUSINESS_LINE:
				return getBusinessLine();
			case RiskPackage.PRODUCT__DEVELOPMENT_TEAM:
				return getDevelopmentTeam();
			case RiskPackage.PRODUCT__TECHNOLOGY_STACK:
				return getTechnologyStack();
			case RiskPackage.PRODUCT__USES_PUBLIC_CLOUD:
				return isUsesPublicCloud();
			case RiskPackage.PRODUCT__USES_AI:
				return isUsesAI();
			case RiskPackage.PRODUCT__REGULATORY_SCOPE:
				return getRegulatoryScope();
			case RiskPackage.PRODUCT__ONBOARDING_DATE:
				return getOnboardingDate();
			case RiskPackage.PRODUCT__PRODUCTION_DATE:
				return getProductionDate();
			case RiskPackage.PRODUCT__REVIEW_CYCLE_DAYS:
				return getReviewCycleDays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiskPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((String)newValue);
				return;
			case RiskPackage.PRODUCT__BUSINESS_LINE:
				setBusinessLine((String)newValue);
				return;
			case RiskPackage.PRODUCT__DEVELOPMENT_TEAM:
				setDevelopmentTeam((String)newValue);
				return;
			case RiskPackage.PRODUCT__TECHNOLOGY_STACK:
				getTechnologyStack().clear();
				getTechnologyStack().addAll((Collection<? extends String>)newValue);
				return;
			case RiskPackage.PRODUCT__USES_PUBLIC_CLOUD:
				setUsesPublicCloud((Boolean)newValue);
				return;
			case RiskPackage.PRODUCT__USES_AI:
				setUsesAI((Boolean)newValue);
				return;
			case RiskPackage.PRODUCT__REGULATORY_SCOPE:
				getRegulatoryScope().clear();
				getRegulatoryScope().addAll((Collection<? extends String>)newValue);
				return;
			case RiskPackage.PRODUCT__ONBOARDING_DATE:
				setOnboardingDate((Date)newValue);
				return;
			case RiskPackage.PRODUCT__PRODUCTION_DATE:
				setProductionDate((Date)newValue);
				return;
			case RiskPackage.PRODUCT__REVIEW_CYCLE_DAYS:
				setReviewCycleDays((Integer)newValue);
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
			case RiskPackage.PRODUCT__PRODUCT_TYPE:
				setProductType(PRODUCT_TYPE_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__BUSINESS_LINE:
				setBusinessLine(BUSINESS_LINE_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__DEVELOPMENT_TEAM:
				setDevelopmentTeam(DEVELOPMENT_TEAM_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__TECHNOLOGY_STACK:
				getTechnologyStack().clear();
				return;
			case RiskPackage.PRODUCT__USES_PUBLIC_CLOUD:
				setUsesPublicCloud(USES_PUBLIC_CLOUD_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__USES_AI:
				setUsesAI(USES_AI_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__REGULATORY_SCOPE:
				getRegulatoryScope().clear();
				return;
			case RiskPackage.PRODUCT__ONBOARDING_DATE:
				setOnboardingDate(ONBOARDING_DATE_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__PRODUCTION_DATE:
				setProductionDate(PRODUCTION_DATE_EDEFAULT);
				return;
			case RiskPackage.PRODUCT__REVIEW_CYCLE_DAYS:
				setReviewCycleDays(REVIEW_CYCLE_DAYS_EDEFAULT);
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
			case RiskPackage.PRODUCT__PRODUCT_TYPE:
				return PRODUCT_TYPE_EDEFAULT == null ? getProductType() != null : !PRODUCT_TYPE_EDEFAULT.equals(getProductType());
			case RiskPackage.PRODUCT__BUSINESS_LINE:
				return BUSINESS_LINE_EDEFAULT == null ? getBusinessLine() != null : !BUSINESS_LINE_EDEFAULT.equals(getBusinessLine());
			case RiskPackage.PRODUCT__DEVELOPMENT_TEAM:
				return DEVELOPMENT_TEAM_EDEFAULT == null ? getDevelopmentTeam() != null : !DEVELOPMENT_TEAM_EDEFAULT.equals(getDevelopmentTeam());
			case RiskPackage.PRODUCT__TECHNOLOGY_STACK:
				return !getTechnologyStack().isEmpty();
			case RiskPackage.PRODUCT__USES_PUBLIC_CLOUD:
				return isUsesPublicCloud() != USES_PUBLIC_CLOUD_EDEFAULT;
			case RiskPackage.PRODUCT__USES_AI:
				return isUsesAI() != USES_AI_EDEFAULT;
			case RiskPackage.PRODUCT__REGULATORY_SCOPE:
				return !getRegulatoryScope().isEmpty();
			case RiskPackage.PRODUCT__ONBOARDING_DATE:
				return ONBOARDING_DATE_EDEFAULT == null ? getOnboardingDate() != null : !ONBOARDING_DATE_EDEFAULT.equals(getOnboardingDate());
			case RiskPackage.PRODUCT__PRODUCTION_DATE:
				return PRODUCTION_DATE_EDEFAULT == null ? getProductionDate() != null : !PRODUCTION_DATE_EDEFAULT.equals(getProductionDate());
			case RiskPackage.PRODUCT__REVIEW_CYCLE_DAYS:
				return getReviewCycleDays() != REVIEW_CYCLE_DAYS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
