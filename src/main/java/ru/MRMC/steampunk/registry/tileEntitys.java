package ru.MRMC.steampunk.registry;

import ru.MRMC.steampunk.tileEntitys.tileRepairingStation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public class tileEntitys
{
    public static TileEntity repairingStation = new tileRepairingStation();
    public static void register()
    {
        GameRegistry.registerTileEntity(tileRepairingStation.class, "repairingStation");
    }
}
