package com.minihighlander1.AotearoaCraft.init;

import com.minihighlander1.AotearoaCraft.block.BlockAC;
import com.minihighlander1.AotearoaCraft.block.BlockColdRocks;
import com.minihighlander1.AotearoaCraft.block.BlockHotRocks;
import com.minihighlander1.AotearoaCraft.block.BlockPounamu;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Registering Blocks
    public static final BlockAC PounamuBlock = new BlockPounamu();
    public static final BlockAC ColdRocks = new BlockColdRocks(Material.rock);
    public static final BlockAC HotRocks = new BlockHotRocks(Material.rock);

        public static void init()
        {
            GameRegistry.registerBlock(PounamuBlock, "PounamuBlock");
            GameRegistry.registerBlock(ColdRocks, "ColdRocks");
            GameRegistry.registerBlock(HotRocks, "HotRocks");
        }

}
