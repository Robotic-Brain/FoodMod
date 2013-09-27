package de.roboticbrain.foodmod.configuration;

import java.io.File;

import de.roboticbrain.foodmod.lib.ItemIds;
import de.roboticbrain.foodmod.lib.Strings;
import net.minecraftforge.common.Configuration;

public class ServerConfig {
    
    private static Configuration config;
    
    public static void init(File file) {
        config = new Configuration(file);
        
        config.load();
        
        ItemIds.DUMMY = config.getItem(Strings.DUMMY_ITEM_NAME, ItemIds.DUMMY_DEFAULT).getInt(ItemIds.DUMMY_DEFAULT);
        
        if (config.hasChanged()) {
            config.save();
        }
    }
    
}
