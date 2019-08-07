package pw.pqtato.potatoadditionsfabric.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class IconItem extends Item {
    public static final FoodComponent food = (new FoodComponent.Builder().hunger(20).saturationModifier(10.0F).build());

    public IconItem() {
        super(new Item.Settings().food(food));
    }

}
