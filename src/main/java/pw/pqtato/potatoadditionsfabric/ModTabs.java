package pw.pqtato.potatoadditionsfabric;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import pw.pqtato.potatoadditionsfabric.items.ModItems;

public class ModTabs {
    public static ItemGroup ITEM_GROUP;
    public static ItemGroup DIY_ITEM_GROUP;
    public static ItemGroup CURRENCY_ITEM_GROUP;

    public static ItemGroup register(String name, Item item) {
        return FabricItemGroupBuilder.build(
                new Identifier(Reference.MOD_ID, name),
                () -> new ItemStack(item));
    }

    public static void init() {
        System.out.println("Initializing item groups");
        ITEM_GROUP = register("potatoadditions", ModItems.ICON_ITEM);
        DIY_ITEM_GROUP = register("diy", ModItems.DIY_ICON_ITEM);
        CURRENCY_ITEM_GROUP = register("currency", ModItems.CURRENCY_ICON_ITEM);
        System.out.println("Initialized item groups");
    }
}
