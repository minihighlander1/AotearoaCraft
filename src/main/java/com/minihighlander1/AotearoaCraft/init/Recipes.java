package com.minihighlander1.AotearoaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        //Adding Shaped Crafting Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.PounamuBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.Pounamu));
        GameRegistry.addRecipe(new ItemStack(ModItems.PounamuClub), " xx", "zxx", "xz ", 'x', new ItemStack(ModItems.Pounamu), 'z', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ItemStack(ModItems.Patu), " xx", "zxx", "xz ", 'x', new ItemStack(Blocks.planks), 'z', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ItemStack(ModItems.Taiaha), " zx", " cz", "c  ", 'z', new ItemStack(Items.feather), 'x', new ItemStack(Items.flint), 'c', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.Kete), " z ", "xxx", "xxx", 'z', new ItemStack(Items.string), 'x', new ItemStack(ModItems.DriedFlax));

        //Adding Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.RawPaua), new ItemStack(ModItems.PauaMeat), 10);
        GameRegistry.addSmelting(new ItemStack(ModItems.Flax), new ItemStack(ModItems.DriedFlax), 15);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.ColdRocks), new ItemStack(ModBlocks.HotRocks), 50);

        //Adding Shapeless Crafting Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ColdRocks), new ItemStack(Blocks.cobblestone), new ItemStack(Items.snowball));

    }
}
