package com.minihighlander1.AotearoaCraft.block;

import com.minihighlander1.AotearoaCraft.creativetab.CreativeTabAC;

public class BlockPounamu extends BlockAC
{
    //Creating Pounamu Block
    public BlockPounamu(){
    super();
        this.setBlockName("PounamuBlock");
        this.setHardness(10.0f);
        this.setResistance(5.0f);
        this.setStepSound(soundTypeMetal);
        this.getHarvestLevel(2);

}
}
