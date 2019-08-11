package pw.pqtato.potatoadditionsfabric;

import net.fabricmc.api.ModInitializer;
import pw.pqtato.potatoadditionsfabric.blocks.ModBlocks;
import pw.pqtato.potatoadditionsfabric.items.ModItems;
import pw.pqtato.potatoadditionsfabric.updatechecker.UpdateChecker;

public class PotatoAdditionsFabricMod implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger();
        
        @Override
	public void onInitialize() {
		ModTabs.init();
		ModBlocks.init();
		ModItems.init();

		String modUpdateMessage = ModUpdateNotifier.getUpdateMessage();
		if (modUpdateMessage == null) {} else {
			LOGGER.info(modUpdateMessage);
		}
	}
}
