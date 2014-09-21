package ru.MRMC.steampunk.items;

import net.minecraftforge.oredict.OreDictionary;
import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.creativeTabs;
import ru.MRMC.steampunk.registry.reference;
import net.minecraft.item.Item;

public class leadIngot extends Item
{
    public String name = "leadIngot";
    public leadIngot()
    {
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setUnlocalizedName(name);
        this.setTextureName(reference.MOD_ID + ":" +name);
        OreDictionary.getOreID(name);
        this.setUnlocalizedName(reference.MOD_ID + reference.SEPARATOR + name);
        logHandler.debug("Item " + reference.MOD_ID + ":" + name + " as " + this.getUnlocalizedName());
    }
}
