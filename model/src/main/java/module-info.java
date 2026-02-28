import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.risk.util.RiskEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.risk {
	exports org.nasdanika.models.risk;
	exports org.nasdanika.models.risk.impl;
	exports org.nasdanika.models.risk.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with RiskEPackageResourceSetCapabilityFactory;
	
}