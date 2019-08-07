package pw.pqtato.potatoadditionsfabric.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderLayer;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateFactory;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CeilingLightBlock extends Block {
    public static final BooleanProperty isLightOn = BooleanProperty.of("on");

    public CeilingLightBlock() {
        super(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByHand(true).strength(0.5F, 0.5F).lightLevel(14).build());
        setDefaultState(getStateFactory().getDefaultState().with(isLightOn, true));
    }

    protected void appendProperties(StateFactory.Builder<Block, BlockState> stateFactory) {
        stateFactory.add(isLightOn);
    }

    public boolean activate(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult blockHitResult) {
        if (state.get(isLightOn) == true) {
            world.setBlockState(pos, ModBlocks.CEILING_LIGHT_BLOCK.getDefaultState().with(isLightOn, false));
        } else {
            world.setBlockState(pos, ModBlocks.CEILING_LIGHT_BLOCK.getDefaultState().with(isLightOn, true));

        }
        return true;
    }

    @Override
    public int getLuminance(BlockState blockState_1) {
        if (blockState_1.get(isLightOn) == true) {
            return 14;
        } else {
            return 0;
        }
    }

    @Environment(EnvType.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
