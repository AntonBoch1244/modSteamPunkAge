package ru.MRMC.steampunk.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.creativeTabs;
import ru.MRMC.steampunk.registry.reference;

public class nickelOre extends Block
{

    public static String name = "nickelOre";
    public nickelOre()
    {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setBlockTextureName(reference.MOD_ID + ":" + name);
        this.setBlockName(reference.MOD_ID + reference.SEPARATOR + name);
        logHandler.debug("Block " + reference.MOD_ID + ":" + name + " as " + this.getUnlocalizedName());
    }

}
