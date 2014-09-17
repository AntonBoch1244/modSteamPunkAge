package alekc.mods.steampunk.registry;

import alekc.mods.steampunk.generators.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class generators
{
    public static copperOreGenerator copperOreGenerator = new copperOreGenerator();
    public static zincOreGenerator zincOreGenerator = new zincOreGenerator();
    public static leadOreGenerator leadOreGenerator = new leadOreGenerator();
    public static nickelOreGenerator nickelOreGenerator = new nickelOreGenerator();
    public static tinOreGenerator tinOreGenerator = new tinOreGenerator();
    public static void register()
    {
        GameRegistry.registerWorldGenerator(copperOreGenerator, 1);
        GameRegistry.registerWorldGenerator(zincOreGenerator, 2);
        GameRegistry.registerWorldGenerator(leadOreGenerator, 3);
        GameRegistry.registerWorldGenerator(nickelOreGenerator, 4);
        GameRegistry.registerWorldGenerator(tinOreGenerator, 5);
    }
}
