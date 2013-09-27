package de.roboticbrain.foodmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabFoodMod extends CreativeTabs {

    public CreativeTabFoodMod(int id, String label) {
        super(id, label);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return Item.diamond.itemID;
    }
    
}
