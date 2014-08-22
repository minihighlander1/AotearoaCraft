package com.minihighlander1.AotearoaCraft.init;

import com.minihighlander1.AotearoaCraft.item.*;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Registering Items
    public static final ItemAC Pounamu = new ItemPounamu();
    public static final ItemAC RawPaua = new ItemRawPaua();
    public static final ItemAC PounamuClub = new ItemPounamuClub();
    public static final ItemAC PauaMeat = new ItemPauaMeat();
    public static final ItemAC PauaShell = new ItemPauaShell();
    public static final ItemAC Flax = new ItemFlax();
    public static final ItemAC Mussel = new ItemMussel();
    public static final ItemAC DriedFlax = new ItemDriedFlax();
    public static final ItemAC Kete = new ItemKete();
    public static final ItemAC Patu = new ItemPatu();
    public static final ItemAC Taiaha = new ItemTaiaha();


    public static void init()
    {
        GameRegistry.registerItem(Pounamu, "Pounamu");
        GameRegistry.registerItem(RawPaua, "RawPaua");
        GameRegistry.registerItem(PauaMeat, "PauaMeat");
        GameRegistry.registerItem(PounamuClub, "PounamuClub");
        GameRegistry.registerItem(PauaShell, "PauaShell");
        GameRegistry.registerItem(Flax, "Flax");
        GameRegistry.registerItem(Mussel, "Mussel");
        GameRegistry.registerItem(DriedFlax, "DriedFlax");
        GameRegistry.registerItem(Kete, "Kete");
        GameRegistry.registerItem(Patu, "Patu");
        GameRegistry.registerItem(Taiaha, "Taiaha");

    }

}













