package ru.MRMC.steampunk.items;

import ru.MRMC.steampunk.handlers.logHandler;
import ru.MRMC.steampunk.registry.creativeTabs;
import ru.MRMC.steampunk.registry.reference;
import net.minecraft.item.Item;

public class brassIngot extends Item
{
    public String name = "brassIngot";
    public brassIngot()
    {
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setUnlocalizedName(name);
        this.setTextureName(reference.MOD_ID.toLowerCase() + ":" + name);
        logHandler.info("Item " + reference.MOD_ID + ":" + name);
    }
}
