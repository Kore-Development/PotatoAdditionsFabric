package pw.pqtato.potatoadditionsfabric.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pw.pqtato.potatoadditionsfabric.ModTabs;
import pw.pqtato.potatoadditionsfabric.Reference;

public class ModBlocks {
    public static Block lampBlock;
    public static Block tableBlock;
    public static Block ceilingLightBlock;
    public static Block diyBlock1;
    public static Block diyBlock2;
    public static Block diyBlock3;
    public static Block diyBlock4;
    public static Block diyBlock5;
    public static Block diyBlock6;
    public static Block diyBlock7;
    public static Block diyBlock8;
    public static Block diyBlock9;
    public static Block diyBlock10;
    public static Block diyBlock11;
    public static Block diyBlock12;
    public static Block diyBlock13;
    public static Block diyBlock14;
    public static Block diyBlock15;
    public static Block diyBlock16;
    public static Block diyBlock17;
    public static Block diyBlock18;
    public static Block diyBlock19;
    public static Block diyBlock20;
    public static Block diyBlock21;
    public static Block diyBlock22;
    public static Block diyBlock23;
    public static Block diyBlock24;
    public static Block diyBlock25;
    public static Block diyBlock26;
    public static Block diyBlock27;
    public static Block diyBlock28;
    public static Block diyBlock29;
    public static Block diyBlock30;

    public static Block register(String name, Block block, ItemGroup itemGroup) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), new BlockItem(block, new Item.Settings().group(itemGroup)));
        return Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, name), block);
    }

    public static void init() {
        System.out.println("Initializing blocks");
        lampBlock = register("lamp", new LampBlock(), ModTabs.itemGroup);
        tableBlock = register("table", new TableBlock(), ModTabs.itemGroup);
        ceilingLightBlock = register("ceiling_light", new CeilingLightBlock(), ModTabs.itemGroup);
        diyBlock1 = register("diy_block_1", new Block(FabricBlockSettings.of(Material.WOOD).strength(0.5F, 0.5F).breakByHand(true).build()), ModTabs.diyItemGroup);
        diyBlock2 = register("diy_block_2", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock3 = register("diy_block_3", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock4 = register("diy_block_4", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock5 = register("diy_block_5", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock6 = register("diy_block_6", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock7 = register("diy_block_7", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock8 = register("diy_block_8", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock9 = register("diy_block_9", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock10 = register("diy_block_10", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock11 = register("diy_block_11", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock12 = register("diy_block_12", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock13 = register("diy_block_13", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock14 = register("diy_block_14", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock15 = register("diy_block_15", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock16 = register("diy_block_16", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock17 = register("diy_block_17", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock18 = register("diy_block_18", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock19 = register("diy_block_19", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock20 = register("diy_block_20", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock21 = register("diy_block_21", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock22 = register("diy_block_22", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock23 = register("diy_block_23", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock24 = register("diy_block_24", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock25 = register("diy_block_25", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock26 = register("diy_block_26", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock27 = register("diy_block_27", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock28 = register("diy_block_28", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock29 = register("diy_block_29", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        diyBlock30 = register("diy_block_30", new Block(FabricBlockSettings.copy(ModBlocks.diyBlock1).build()), ModTabs.diyItemGroup);
        System.out.println("Initialized blocks");
    }

}
