package alekc.mods.steampunk;

import alekc.mods.steampunk.handlers.logHandler;
import alekc.mods.steampunk.registry.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.MOD_VERSION)

public class steampunk
{
    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        logHandler.info("["+ reference.MOD_ID + "]" + "Starting Pre-Initializing.");
        logHandler.info(reference.MOD_NAME + " " + reference.MOD_VERSION);
        tileEntitys.register();
        logHandler.info("Tiles Loaded!");
        blocks.register();
        logHandler.info("Blocks Loaded!");
        items.register();
        logHandler.info("Items Loaded!");
        crafts.register();
        logHandler.info("Crafts Loaded!");
        generators.register();
        logHandler.info("Ore Generation Loaded!");
        logHandler.info("[" + reference.MOD_ID + "]" + "Pre-Initializing complete.");
    }

}
