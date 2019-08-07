package pw.pqtato.potatoadditionsfabric.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pw.pqtato.potatoadditionsfabric.ModTabs;
import pw.pqtato.potatoadditionsfabric.Reference;

public class ModItems {
    public static final Item iconItem = register("icon", new IconItem());
    public static final Item diyIconItem = register("diy_icon", new DIYIconItem());
    public static final Item currencyIconItem = register("currency_icon", new CurrencyIconItem());
    public static Item stoneCoinItem;
    public static Item ironCoinItem;
    public static Item goldCoinItem;
    public static Item rainbowCoinItem;
    public static Item ironCoinPieceItem;
    public static Item goldCoinPieceItem;
    public static Item rainbowCoinPieceItem;
    public static Item diyItem1;
    public static Item diyItem2;
    public static Item diyItem3;
    public static Item diyItem4;
    public static Item diyItem5;
    public static Item diyItem6;
    public static Item diyItem7;
    public static Item diyItem8;
    public static Item diyItem9;
    public static Item diyItem10;
    public static Item diyItem11;
    public static Item diyItem12;
    public static Item diyItem13;
    public static Item diyItem14;
    public static Item diyItem15;
    public static Item diyItem16;
    public static Item diyItem17;
    public static Item diyItem18;
    public static Item diyItem19;
    public static Item diyItem20;
    public static Item diyItem21;
    public static Item diyItem22;
    public static Item diyItem23;
    public static Item diyItem24;
    public static Item diyItem25;
    public static Item diyItem26;
    public static Item diyItem27;
    public static Item diyItem28;
    public static Item diyItem29;
    public static Item diyItem30;

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), item);
    }

    public static Item getProperties(ItemGroup itemGroup) {
        return new Item(new Item.Settings().group(itemGroup));
    }

    public static void init() {
        System.out.println("Initializing items");
        stoneCoinItem = register("stone_coin", getProperties(ModTabs.currencyItemGroup));
        ironCoinItem = register("iron_coin", getProperties(ModTabs.currencyItemGroup));
        goldCoinItem = register("gold_coin", getProperties(ModTabs.currencyItemGroup));
        rainbowCoinItem = register("rainbow_coin", getProperties(ModTabs.currencyItemGroup));
        ironCoinPieceItem = register("iron_coin_piece", getProperties(ModTabs.currencyItemGroup));
        goldCoinPieceItem = register("gold_coin_piece", getProperties(ModTabs.currencyItemGroup));
        rainbowCoinPieceItem = register("rainbow_coin_piece", getProperties(ModTabs.currencyItemGroup));
        diyItem1 = register("diyItem1", getProperties(ModTabs.diyItemGroup));
        diyItem2 = register("diyItem2", getProperties(ModTabs.diyItemGroup));
        diyItem3 = register("diyItem3", getProperties(ModTabs.diyItemGroup));
        diyItem4 = register("diyItem4", getProperties(ModTabs.diyItemGroup));
        diyItem5 = register("diyItem5", getProperties(ModTabs.diyItemGroup));
        diyItem6 = register("diyItem6", getProperties(ModTabs.diyItemGroup));
        diyItem7 = register("diyItem7", getProperties(ModTabs.diyItemGroup));
        diyItem8 = register("diyItem8", getProperties(ModTabs.diyItemGroup));
        diyItem9 = register("diyItem9", getProperties(ModTabs.diyItemGroup));
        diyItem10 = register("diyItem10", getProperties(ModTabs.diyItemGroup));
        diyItem11 = register("diyItem11", getProperties(ModTabs.diyItemGroup));
        diyItem12 = register("diyItem12", getProperties(ModTabs.diyItemGroup));
        diyItem13 = register("diyItem13", getProperties(ModTabs.diyItemGroup));
        diyItem14 = register("diyItem14", getProperties(ModTabs.diyItemGroup));
        diyItem15 = register("diyItem15", getProperties(ModTabs.diyItemGroup));
        diyItem16 = register("diyItem16", getProperties(ModTabs.diyItemGroup));
        diyItem17 = register("diyItem17", getProperties(ModTabs.diyItemGroup));
        diyItem18 = register("diyItem18", getProperties(ModTabs.diyItemGroup));
        diyItem19 = register("diyItem19", getProperties(ModTabs.diyItemGroup));
        diyItem20 = register("diyItem20", getProperties(ModTabs.diyItemGroup));
        diyItem21 = register("diyItem21", getProperties(ModTabs.diyItemGroup));
        diyItem22 = register("diyItem22", getProperties(ModTabs.diyItemGroup));
        diyItem23 = register("diyItem23", getProperties(ModTabs.diyItemGroup));
        diyItem24 = register("diyItem24", getProperties(ModTabs.diyItemGroup));
        diyItem25 = register("diyItem25", getProperties(ModTabs.diyItemGroup));
        diyItem26 = register("diyItem26", getProperties(ModTabs.diyItemGroup));
        diyItem27 = register("diyItem27", getProperties(ModTabs.diyItemGroup));
        diyItem28 = register("diyItem28", getProperties(ModTabs.diyItemGroup));
        diyItem29 = register("diyItem29", getProperties(ModTabs.diyItemGroup));
        diyItem30 = register("diyItem30", getProperties(ModTabs.diyItemGroup));
        System.out.println("Initialized items");
    }

}
