package de.roboticbrain.foodmod;

public class Reference {
    public static final String MOD_ID = "rbFoodMod";
    public static final String MOD_NAME = "Food Mod";
    public static final String MOD_VERSION_NUMBER = "0.0.1";
    
    public static final String CHANNEL_NAME = "rbfoodmod";
    public static final String CLIENT_PROXY_CLASS = "de.roboticbrain.foodmod.network.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "de.roboticbrain.foodmod.network.proxy.CommonProxy";
    
    public static final String CONFIGURATION_DIR = CHANNEL_NAME;
    
    // File holding server specific configuration (e.g. BlockIDs and other internal stuff)
    public static final String SERVER_CONFIG_FILE = "server.cfg";
    
}
