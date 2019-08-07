package pw.pqtato.potatoadditionsfabric;

import net.fabricmc.api.ModInitializer;
import pw.pqtato.potatoadditionsfabric.blocks.ModBlocks;
import pw.pqtato.potatoadditionsfabric.items.ModItems;


public class PotatoAdditionsFabricMod implements ModInitializer {

	@Override
	public void onInitialize() {
		ModTabs.init();
		ModBlocks.init();
		ModItems.init();
	}
}
