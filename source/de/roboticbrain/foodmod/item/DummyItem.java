package de.roboticbrain.foodmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;
import de.roboticbrain.foodmod.FoodMod;
import de.roboticbrain.foodmod.lib.Strings;

public class DummyItem extends Item {

    public DummyItem(int id) {
        super(id);
        
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.DUMMY_ITEM_NAME);
        this.setCreativeTab(FoodMod.creativeTab);
        this.maxStackSize = 64;
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            byte data = 0;
            
            NBTTagCompound pNbt = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
            data = pNbt.getByte("rbTest");
            
            player.sendChatToPlayer(ChatMessageComponent.createFromText("Blub " + data));
            player.sendChatToPlayer(ChatMessageComponent.createFromText(world.getSaveHandler().getMapFileFromName("test").getAbsolutePath()));
            
            data++;
            
            pNbt.setByte("rbTest", data);
            player.getEntityData().setCompoundTag(EntityPlayer.PERSISTED_NBT_TAG, pNbt);
        }
        return stack;
    }
    
}
