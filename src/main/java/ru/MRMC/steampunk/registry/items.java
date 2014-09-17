package ru.MRMC.steampunk.registry;

import ru.MRMC.steampunk.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class items
{
    public static Item copperIngot = new copperIngot();
    public static Item zincIngot = new zincIngot();
    public static Item brassIngot = new brassIngot();
    public static Item nickelIngot = new nickelIngot();
    public static Item tinIngot = new tinIngot();
    public static Item leadIngot = new leadIngot();
    public static void register()
    {
        GameRegistry.registerItem(copperIngot, "copperIngot");
        GameRegistry.registerItem(zincIngot, "zincIngot");
        GameRegistry.registerItem(brassIngot, "brassIngot");
        GameRegistry.registerItem(nickelIngot, "nickelIngot");
        GameRegistry.registerItem(tinIngot, "tinIngot");
        GameRegistry.registerItem(leadIngot, "leadIngot");
    }



}
