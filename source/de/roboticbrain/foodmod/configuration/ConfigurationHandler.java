package de.roboticbrain.foodmod.configuration;

import java.io.File;

import de.roboticbrain.foodmod.Reference;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
    
    private Configuration config;
    
    public static void init(File configDir) {
        
        // Absolute directory path holding all mod specific configuration
        String modCfgDir = configDir.getAbsolutePath() + File.separator + Reference.CONFIGURATION_DIR + File.separator;
        
        //UserConfig.init(new File(modCfgDir + Reference.USER_CONFIG_FILE));
        ServerConfig.init(new File(modCfgDir + Reference.SERVER_CONFIG_FILE));
    }
    
}
