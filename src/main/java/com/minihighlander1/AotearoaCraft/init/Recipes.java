package com.minihighlander1.AotearoaCraft.init;

import com.minihighlander1.AotearoaCraft.block.BlockAC;
import com.minihighlander1.AotearoaCraft.block.BlockPounamu;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.PounamuBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.Pounamu));
        GameRegistry.addRecipe(new ItemStack(ModItems.PounamuClub), " xx", "zxx", "xz ", 'x', new ItemStack(ModItems.Pounamu), 'z', new ItemStack(Items.string));

        GameRegistry.addSmelting(new ItemStack(ModItems.RawPaua), new ItemStack(ModItems.PauaMeat), 10);

    }
}
