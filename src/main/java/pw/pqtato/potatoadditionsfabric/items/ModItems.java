package pw.pqtato.potatoadditionsfabric.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pw.pqtato.potatoadditionsfabric.ModTabs;
import pw.pqtato.potatoadditionsfabric.Reference;

public class ModItems {
    public static final Item ICON_ITEM = register("icon", new IconItem());
    public static final Item DIY_ICON_ITEM = register("diy_icon", new DIYIconItem());
    public static final Item CURRENCY_ICON_ITEM = register("currency_icon", new CurrencyIconItem());
    public static Item STONE_COIN_ITEM;
    public static Item IRON_COIN_ITEM;
    public static Item GOLD_COIN_ITEM;
    public static Item RAINBOW_COIN_ITEM;
    public static Item IRON_COIN_PIECE_ITEM;
    public static Item GOLD_COIN_PIECE_ITEM;
    public static Item RAINBOW_COIN_PIECE_ITEM;
    public static Item DIY_ITEM_1;
    public static Item DIY_ITEM_2;
    public static Item DIY_ITEM_3;
    public static Item DIY_ITEM_4;
    public static Item DIY_ITEM_5;
    public static Item DIY_ITEM_6;
    public static Item DIY_ITEM_7;
    public static Item DIY_ITEM_8;
    public static Item DIY_ITEM_9;
    public static Item DIY_ITEM_10;
    public static Item DIY_ITEM_11;
    public static Item DIY_ITEM_12;
    public static Item DIY_ITEM_13;
    public static Item DIY_ITEM_14;
    public static Item DIY_ITEM_15;
    public static Item DIY_ITEM_16;
    public static Item DIY_ITEM_17;
    public static Item DIY_ITEM_18;
    public static Item DIY_ITEM_19;
    public static Item DIY_ITEM_20;
    public static Item DIY_ITEM_21;
    public static Item DIY_ITEM_22;
    public static Item DIY_ITEM_23;
    public static Item DIY_ITEM_24;
    public static Item DIY_ITEM_25;
    public static Item DIY_ITEM_26;
    public static Item DIY_ITEM_27;
    public static Item DIY_ITEM_28;
    public static Item DIY_ITEM_29;
    public static Item DIY_ITEM_30;

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), item);
    }

    public static Item getProperties(ItemGroup itemGroup) {
        return new Item(new Item.Settings().group(itemGroup));
    }

    public static void init() {
        System.out.println("Initializing items");
        STONE_COIN_ITEM = register("stone_coin", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        IRON_COIN_ITEM = register("iron_coin", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        GOLD_COIN_ITEM = register("gold_coin", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        RAINBOW_COIN_ITEM = register("rainbow_coin", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        IRON_COIN_PIECE_ITEM = register("iron_coin_piece", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        GOLD_COIN_PIECE_ITEM = register("gold_coin_piece", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        RAINBOW_COIN_PIECE_ITEM = register("rainbow_coin_piece", getProperties(ModTabs.CURRENCY_ITEM_GROUP));
        DIY_ITEM_1 = register("diy_item_1", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_2 = register("diy_item_2", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_3 = register("diy_item_3", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_4 = register("diy_item_4", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_5 = register("diy_item_5", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_6 = register("diy_item_6", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_7 = register("diy_item_7", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_8 = register("diy_item_8", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_9 = register("diy_item_9", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_10 = register("diy_item_10", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_11 = register("diy_item_11", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_12 = register("diy_item_12", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_13 = register("diy_item_13", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_14 = register("diy_item_14", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_15 = register("diy_item_15", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_16 = register("diy_item_16", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_17 = register("diy_item_17", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_18 = register("diy_item_18", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_19 = register("diy_item_19", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_20 = register("diy_item_20", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_21 = register("diy_item_21", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_22 = register("diy_item_22", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_23 = register("diy_item_23", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_24 = register("diy_item_24", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_25 = register("diy_item_25", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_26 = register("diy_item_26", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_27 = register("diy_item_27", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_28 = register("diy_item_28", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_29 = register("diy_item_29", getProperties(ModTabs.DIY_ITEM_GROUP));
        DIY_ITEM_30 = register("diy_item_30", getProperties(ModTabs.DIY_ITEM_GROUP));
        System.out.println("Initialized items");
    }

}
