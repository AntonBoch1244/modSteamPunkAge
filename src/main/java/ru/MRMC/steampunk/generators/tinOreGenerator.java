package ru.MRMC.steampunk.generators;

import ru.MRMC.steampunk.registry.blocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class tinOreGenerator implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
                         IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        { case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16); }
    }

    private void generateOverworld(World world, Random random, int x, int z)
    {
        this.addOreSpawn(blocks.tinOre, world, random, x, z, 16, 16, 4 + random.nextInt(1), 10, 15, 50);
    }
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ,
                            int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY;
        assert maxX > 0 && maxX <= 16;
        assert minY > 0;
        assert maxY < 256 && maxY > 0;
        assert maxZ > 0 && maxZ <= 16;

        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
