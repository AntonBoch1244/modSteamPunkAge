package ru.MRMC.steampunk.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class crafts
{
    static void workbench()
    {
        //this for crafting
    }
    static void fuel()
    {
        //this for fuel
    }
    static void smelting()
    {
        GameRegistry.addSmelting(blocks.copperOre, new ItemStack(items.copperIngot), 0.2F);
    }
    static void furnace()
    {
        fuel();
        smelting();
    }
    public static void register()
    {
        workbench();
        furnace();
    }
}
