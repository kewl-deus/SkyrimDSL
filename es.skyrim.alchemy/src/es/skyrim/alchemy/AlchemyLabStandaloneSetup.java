
package es.skyrim.alchemy;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AlchemyLabStandaloneSetup extends AlchemyLabStandaloneSetupGenerated{

	public static void doSetup() {
		new AlchemyLabStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

