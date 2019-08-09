package pw.pqtato.potatoadditionsfabric.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import pw.pqtato.potatoadditionsfabric.ModTabs;

public class CrackerItem extends Item {
    public static final FoodComponent food = (new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).build());

    public CrackerItem() {
        super(new Settings().group(ModTabs.foodItemGroup).food(food));
    }

}
