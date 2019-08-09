package pw.pqtato.potatoadditionsfabric.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import pw.pqtato.potatoadditionsfabric.ModTabs;

public class HamburgerItem extends Item {
    public static final FoodComponent food = (new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build());

    public HamburgerItem() {
        super(new Settings().group(ModTabs.foodItemGroup).food(food));
    }

}
