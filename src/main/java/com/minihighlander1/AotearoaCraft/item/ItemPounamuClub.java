package com.minihighlander1.AotearoaCraft.item;

import com.minihighlander1.AotearoaCraft.creativetab.CreativeTabAC;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import javax.tools.Tool;



public class ItemPounamuClub extends ItemAC
{
//Fix Texture

    public ItemPounamuClub()
    {
        super();
        this.setUnlocalizedName("PounamuClub");
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabAC.AotearoaCraft_TAB);


    }

}
