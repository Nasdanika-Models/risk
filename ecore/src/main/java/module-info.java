import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.risk.ecore.ECoreGenRiskProcessorsCapabilityFactory;

module org.nasdanika.models.risk.ecore {
		
	requires transitive org.nasdanika.models.risk;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.risk.ecore;
	opens org.nasdanika.models.risk.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenRiskProcessorsCapabilityFactory; 		
	
}
