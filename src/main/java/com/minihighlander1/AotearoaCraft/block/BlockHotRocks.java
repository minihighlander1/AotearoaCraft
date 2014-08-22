package com.minihighlander1.AotearoaCraft.block;

import com.minihighlander1.AotearoaCraft.creativetab.CreativeTabAC;
import net.minecraft.block.material.Material;

public class BlockHotRocks extends BlockAC
{
    public BlockHotRocks(Material rock)
    {
        super();
        this.setBlockName("HotRocks");
        this.setCreativeTab(CreativeTabAC.AotearoaCraft_TAB);
        this.setHardness(10.0f);
        this.setResistance(4.0f);
        this.setStepSound(soundTypeStone);
        this.setTickRandomly(true);
        this.setLightLevel(1.5f);
    }
}
