package alekc.mods.steampunk.items;

import alekc.mods.steampunk.handlers.logHandler;
import alekc.mods.steampunk.registry.creativeTabs;
import alekc.mods.steampunk.registry.reference;
import net.minecraft.item.Item;

public class nickelIngot extends Item
{
    public String name = "nickelIngot";
    public nickelIngot()
    {
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setUnlocalizedName(name);
        this.setTextureName(reference.MOD_ID.toLowerCase() + ":" + name);
        logHandler.info("Item " + reference.MOD_ID + ":" + name);
    }
}
