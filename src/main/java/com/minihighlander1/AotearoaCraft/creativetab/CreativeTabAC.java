package com.minihighlander1.AotearoaCraft.creativetab;

import com.minihighlander1.AotearoaCraft.init.ModItems;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAC
{
    //Creating Creative Tab
    public static final CreativeTabs AotearoaCraft_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.Kete;
        }
        @Override
    public String getTranslatedTabLabel()
        {
            return ("AotearoaCraft");
        }
    };
}
