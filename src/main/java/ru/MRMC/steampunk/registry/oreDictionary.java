package ru.MRMC.steampunk.registry;

import net.minecraftforge.oredict.OreDictionary;

public class oreDictionary
{
    static void registerOres()
    {
        OreDictionary.registerOre("oreCopper", blocks.copperOre);
        OreDictionary.registerOre("oreLead", blocks.leadOre);
        OreDictionary.registerOre("oreNickel", blocks.leadOre);
        OreDictionary.registerOre("oreTin", blocks.leadOre);
        OreDictionary.registerOre("oreZinc", blocks.zincOre);
    }
    static void registerItems()
    {
        OreDictionary.registerOre("ingotBrass", items.brassIngot);
        OreDictionary.registerOre("ingotCopper", items.copperIngot);
        OreDictionary.registerOre("ingotLead", items.leadIngot);
        OreDictionary.registerOre("ingotNickel", items.nickelIngot);
        OreDictionary.registerOre("ingotTin", items.tinIngot);
        OreDictionary.registerOre("ingotZinc", items.zincIngot);
    }
    public static void register()
    {
        registerOres();
        registerItems();
    }
}
