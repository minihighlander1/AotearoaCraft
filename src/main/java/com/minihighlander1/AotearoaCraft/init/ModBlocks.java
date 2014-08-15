package com.minihighlander1.AotearoaCraft.init;

import com.minihighlander1.AotearoaCraft.block.BlockAC;
import com.minihighlander1.AotearoaCraft.block.BlockPounamu;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Registering Blocks
    public static final BlockAC PounamuBlock = new BlockPounamu();

        public static void init()
        {
            GameRegistry.registerBlock(PounamuBlock, "PounamuBlock");
        }

}
