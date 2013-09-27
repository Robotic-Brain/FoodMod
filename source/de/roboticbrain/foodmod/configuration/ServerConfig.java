package de.roboticbrain.foodmod.configuration;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ServerConfig {
    
    private static Configuration config;
    
    public static void init(File file) {
        config = new Configuration(file);
        
        config.load();
        
        if (config.hasChanged()) {
            config.save();
        }
    }
    
}
