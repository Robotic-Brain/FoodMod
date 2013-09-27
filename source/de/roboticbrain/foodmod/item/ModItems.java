package de.roboticbrain.foodmod.item;

import de.roboticbrain.foodmod.lib.ItemIds;
import net.minecraft.item.Item;

public class ModItems {
    
    public static Item dummy;
    
    public static void init() {
        dummy = new DummyItem(ItemIds.DUMMY);
    }
    
}
