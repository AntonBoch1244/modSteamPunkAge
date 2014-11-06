package ru.MRMC.steampunk.registry;

import net.minecraftforge.oredict.OreDictionary;

public class oreDictionary
{
    static void registerOres()
    {
        OreDictionary.registerOre("copperOre", blocks.copperOre);
        OreDictionary.registerOre("leadOre", blocks.leadOre);
        OreDictionary.registerOre("nickelOre", blocks.leadOre);
        OreDictionary.registerOre("tinOre", blocks.leadOre);
        OreDictionary.registerOre("zincOre", blocks.zincOre);
    }
    static void registerItems()
    {
        OreDictionary.registerOre("brassIngot", items.brassIngot);
        OreDictionary.registerOre("copperIngot", items.copperIngot);
        OreDictionary.registerOre("leadIngot", items.leadIngot);
        OreDictionary.registerOre("nickelIngot", items.nickelIngot);
        OreDictionary.registerOre("tinIngot", items.tinIngot);
        OreDictionary.registerOre("zincIngot", items.zincIngot);
    }
    public static void register()
    {
        registerOres();
        registerItems();
    }
}
