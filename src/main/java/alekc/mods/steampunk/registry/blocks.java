package alekc.mods.steampunk.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import alekc.mods.steampunk.blocks.*;
import net.minecraft.block.Block;

public class blocks
{
    public static Block copperOre = new copperOre();
    public static Block zincOre = new zincOre();
    public static Block leadOre = new leadOre();
    public static Block tinOre = new tinOre();
    public static Block nickelOre = new nickelOre();
    public static Block repairingStation = new repairingStation();
    public static void register()
    {
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(zincOre, "zincOre");
        GameRegistry.registerBlock(leadOre, "leadOre");
        GameRegistry.registerBlock(tinOre, "tinOre");
        GameRegistry.registerBlock(nickelOre, "nickelOre");
        GameRegistry.registerBlock(repairingStation, "repairingStation");
    }

}
