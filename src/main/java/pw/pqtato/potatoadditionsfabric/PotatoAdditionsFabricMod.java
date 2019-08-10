package pw.pqtato.potatoadditionsfabric;

import net.fabricmc.api.ModInitializer;
import pw.pqtato.potatoadditionsfabric.blocks.ModBlocks;
import pw.pqtato.potatoadditionsfabric.items.ModItems;
import pw.pqtato.potatoadditionsfabric.updatechecker.UpdateChecker;

public class PotatoAdditionsFabricMod implements ModInitializer {

	@Override
	public void onInitialize() {
		ModTabs.init();
		ModBlocks.init();
		ModItems.init();
		System.out.println(UpdateChecker.checkForUpdate());
	}
}
