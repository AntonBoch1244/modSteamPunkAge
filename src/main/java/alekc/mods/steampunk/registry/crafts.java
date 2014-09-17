package alekc.mods.steampunk.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class crafts
{
    public static void register()
    {
        GameRegistry.addSmelting(blocks.copperOre, new ItemStack(items.copperIngot), 0.2F);
    }
}
