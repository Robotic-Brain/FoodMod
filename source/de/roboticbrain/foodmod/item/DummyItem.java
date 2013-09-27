package de.roboticbrain.foodmod.item;

import net.minecraft.item.Item;
import de.roboticbrain.foodmod.FoodMod;
import de.roboticbrain.foodmod.lib.Strings;

public class DummyItem extends Item {

    public DummyItem(int id) {
        super(id);
        
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.DUMMY_ITEM_NAME);
        this.setCreativeTab(FoodMod.creativeTab);
    }
    
}
