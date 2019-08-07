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
    public static Block LAMP_BLOCK;
    public static Block TABLE_BLOCK;
    public static Block CEILING_LIGHT_BLOCK;
    public static Block CEILING_LIGHT_ON_BLOCK;
    public static Block DIY_BLOCK_1;
    public static Block DIY_BLOCK_2;
    public static Block DIY_BLOCK_3;
    public static Block DIY_BLOCK_4;
    public static Block DIY_BLOCK_5;
    public static Block DIY_BLOCK_6;
    public static Block DIY_BLOCK_7;
    public static Block DIY_BLOCK_8;
    public static Block DIY_BLOCK_9;
    public static Block DIY_BLOCK_10;
    public static Block DIY_BLOCK_11;
    public static Block DIY_BLOCK_12;
    public static Block DIY_BLOCK_13;
    public static Block DIY_BLOCK_14;
    public static Block DIY_BLOCK_15;
    public static Block DIY_BLOCK_16;
    public static Block DIY_BLOCK_17;
    public static Block DIY_BLOCK_18;
    public static Block DIY_BLOCK_19;
    public static Block DIY_BLOCK_20;
    public static Block DIY_BLOCK_21;
    public static Block DIY_BLOCK_22;
    public static Block DIY_BLOCK_23;
    public static Block DIY_BLOCK_24;
    public static Block DIY_BLOCK_25;
    public static Block DIY_BLOCK_26;
    public static Block DIY_BLOCK_27;
    public static Block DIY_BLOCK_28;
    public static Block DIY_BLOCK_29;
    public static Block DIY_BLOCK_30;

    public static Block register(String name, Block block, ItemGroup itemGroup) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), new BlockItem(block, new Item.Settings().group(itemGroup)));
        return Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, name), block);
    }

    public static void init() {
        System.out.println("Initializing blocks");
        LAMP_BLOCK = register("lamp", new LampBlock(), ModTabs.ITEM_GROUP);
        TABLE_BLOCK = register("table", new TableBlock(), ModTabs.ITEM_GROUP);
        CEILING_LIGHT_BLOCK = register("ceiling_light", new CeilingLightBlock(), ModTabs.ITEM_GROUP);
        DIY_BLOCK_1 = register("diy_block_1", new Block(FabricBlockSettings.of(Material.WOOD).strength(0.5F, 0.5F).breakByHand(true).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_2 = register("diy_block_2", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_3 = register("diy_block_3", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_4 = register("diy_block_4", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_5 = register("diy_block_5", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_6 = register("diy_block_6", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_7 = register("diy_block_7", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_8 = register("diy_block_8", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_9 = register("diy_block_9", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_10 = register("diy_block_10", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_11 = register("diy_block_11", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_12 = register("diy_block_12", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_13 = register("diy_block_13", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_14 = register("diy_block_14", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_15 = register("diy_block_15", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_16 = register("diy_block_16", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_17 = register("diy_block_17", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_18 = register("diy_block_18", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_19 = register("diy_block_19", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_20 = register("diy_block_20", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_21 = register("diy_block_21", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_22 = register("diy_block_22", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_23 = register("diy_block_23", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_24 = register("diy_block_24", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_25 = register("diy_block_25", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_26 = register("diy_block_26", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_27 = register("diy_block_27", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_28 = register("diy_block_28", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_29 = register("diy_block_29", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        DIY_BLOCK_30 = register("diy_block_30", new Block(FabricBlockSettings.copy(ModBlocks.DIY_BLOCK_1).build()), ModTabs.DIY_ITEM_GROUP);
        System.out.println("Initialized blocks");
    }

}
