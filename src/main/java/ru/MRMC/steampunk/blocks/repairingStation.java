package ru.MRMC.steampunk.blocks;

import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.creativeTabs;
import ru.MRMC.steampunk.registry.reference;
import ru.MRMC.steampunk.registry.tileEntitys;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;

public class repairingStation extends Block
{
    public String name = "repairingStation";
    public repairingStation()
    {
        super(Material.anvil);
        this.setBlockName(name);
        this.setResistance(0F);
        this.setHardness(0F);
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setBlockTextureName(reference.MOD_ID.toLowerCase() + ":" + name);
        tileRepairingStation();
        logHandler.info("Block " + reference.MOD_ID + ":" + name);
    }
    private TileEntity tileRepairingStation(/*World world, int meta*/)
    {
        return tileEntitys.repairingStation;
    }
}
