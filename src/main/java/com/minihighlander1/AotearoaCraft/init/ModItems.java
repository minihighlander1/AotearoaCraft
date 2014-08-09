package com.minihighlander1.AotearoaCraft.init;

import com.minihighlander1.AotearoaCraft.item.*;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAC Pounamu = new ItemPounamu();
    public static final ItemAC RawPaua = new ItemRawPaua();
    public static final ItemAC PounamuClub = new ItemPounamuClub();
    public static final ItemAC PauaMeat = new ItemPauaMeat();
    public static final ItemAC PauaShell = new ItemPauaShell();

    public static void init()
    {
        GameRegistry.registerItem(Pounamu, "Pounamu");
        GameRegistry.registerItem(RawPaua, "RawPaua");
        GameRegistry.registerItem(PauaMeat, "PauaMeat");
        GameRegistry.registerItem(PounamuClub, "PounamuClub");
        GameRegistry.registerItem(PauaShell, "PauaShell");
    }

}
