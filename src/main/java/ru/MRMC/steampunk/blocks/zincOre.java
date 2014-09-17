package ru.MRMC.steampunk.blocks;

import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.creativeTabs;
import ru.MRMC.steampunk.registry.reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class zincOre extends Block
{
    public String name = "zincOre";
    public zincOre()
    {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setBlockTextureName(reference.MOD_ID.toLowerCase() + ":" + name);
        logHandler.info("Block " + reference.MOD_ID + ":" + name);
    }

}