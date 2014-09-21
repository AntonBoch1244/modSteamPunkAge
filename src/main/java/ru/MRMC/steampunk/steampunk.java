package ru.MRMC.steampunk;

import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.MOD_VERSION)

public class steampunk
{
    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        logHandler.trace("["+ reference.MOD_ID + "]" + "Starting Pre-Initializing.");
        logHandler.trace(reference.MOD_NAME + " " + reference.MOD_VERSION);
        tileEntitys.register();
        logHandler.trace("Tiles Loaded!");
        blocks.register();
        logHandler.trace("Blocks Loaded!");
        items.register();
        logHandler.trace("Items Loaded!");
        crafts.register();
        logHandler.trace("Crafts Loaded!");
        generators.register();
        logHandler.trace("Ore Generation Loaded!");
        logHandler.trace("[" + reference.MOD_ID + "]" + "Pre-Initializing complete.");
    }

}
