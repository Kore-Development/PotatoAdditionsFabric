package pw.pqtato.potatoadditionsfabric;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import pw.pqtato.potatoadditionsfabric.items.ModItems;

public class ModTabs {
    public static ItemGroup itemGroup;
    public static ItemGroup diyItemGroup;
    public static ItemGroup currencyItemGroup;
    public static ItemGroup foodItemGroup;

    public static ItemGroup register(String name, Item item) {
        return FabricItemGroupBuilder.build(
                new Identifier(Reference.MOD_ID, name),
                () -> new ItemStack(item));
    }

    public static void init() {
        System.out.println("Initializing item groups");
        itemGroup = register("potatoadditions", ModItems.iconItem);
        diyItemGroup = register("diy", ModItems.diyIconItem);
        currencyItemGroup = register("currency", ModItems.currencyIconItem);
        foodItemGroup = register("food", ModItems.foodIconItem);
        System.out.println("Initialized item groups");
    }
}
