package ru.MRMC.steampunk.registry;

import ru.MRMC.steampunk.tileEntitys.repairingStation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public class tileEntitys
{
    public static TileEntity repairingStation = new repairingStation();
    public static void register()
    {
        GameRegistry.registerTileEntity(repairingStation.class, "repairingStation");
    }
}
