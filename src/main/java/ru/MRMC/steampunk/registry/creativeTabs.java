package ru.MRMC.steampunk.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class creativeTabs
{
   public static final CreativeTabs SPA_TAB = new CreativeTabs(reference.MOD_ID)
   {
       @Override
       public Item getTabIconItem()
       {
           return Item.getItemFromBlock(blocks.copperOre);
       }
   };
}

