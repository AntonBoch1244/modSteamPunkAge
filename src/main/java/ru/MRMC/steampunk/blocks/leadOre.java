package ru.MRMC.steampunk.blocks;

import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.creativeTabs;
import ru.MRMC.steampunk.registry.reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class leadOre extends Block
{
    public String name = "leadOre";
    public leadOre()
    {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setHarvestLevel("pickaxe", 1);
        this.setBlockTextureName(reference.MOD_ID.toLowerCase() + ":" + name);
        logHandler.debug("Block " + reference.MOD_ID + ":" + name + " as " + this.getUnlocalizedName());
    }
}
