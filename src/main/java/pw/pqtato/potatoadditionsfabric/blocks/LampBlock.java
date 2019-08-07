package pw.pqtato.potatoadditionsfabric.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderLayer;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class LampBlock extends Block {
    public LampBlock() {
        super(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByHand(true).strength(0.5F, 0.5F).lightLevel(14).build());
    }

    @Environment(EnvType.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
