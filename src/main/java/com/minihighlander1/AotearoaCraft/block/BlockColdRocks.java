package com.minihighlander1.AotearoaCraft.block;

import net.minecraft.block.material.Material;

public class BlockColdRocks extends BlockAC {
    public BlockColdRocks(Material rock) {
        super();
        this.setBlockName("ColdRocks");
        this.setHardness(5.0f);
        this.setResistance(10.0f);
        this.setStepSound(soundTypeStone);
        this.slipperiness = 1.0F;
        this.setTickRandomly(true);
    }
}

