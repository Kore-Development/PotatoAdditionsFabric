package pw.pqtato.potatoadditionsfabric.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import pw.pqtato.potatoadditionsfabric.ModTabs;

public class CheeseItem extends Item {
    public static final FoodComponent food = (new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).build());

    public CheeseItem() {
        super(new Settings().group(ModTabs.foodItemGroup).food(food));
    }

}
