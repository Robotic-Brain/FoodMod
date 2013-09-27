package de.roboticbrain.foodmod;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import de.roboticbrain.foodmod.configuration.ConfigurationHandler;
import de.roboticbrain.foodmod.network.PacketHandler;
import de.roboticbrain.foodmod.network.proxy.CommonProxy;
import de.roboticbrain.foodmod.util.LogHelper;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION_NUMBER)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class FoodMod {
    
    @Instance(Reference.MOD_ID)
    public static FoodMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    /*@EventHandler
    public void serverStarting(FMLServerStartingEvent event) {

        // Initialize the custom commands
        CommandHandler.initCommands(event);
    }*/

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        // Initialize the log helper
        LogHelper.init();

        // Initialize the configuration
        ConfigurationHandler.init(event.getModConfigurationDirectory());

        /*// Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
        ModItems.init();*/
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
