package com.minihighlander1.AotearoaCraft.creativetab;

import com.minihighlander1.AotearoaCraft.init.ModItems;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by joe on 7/08/14.
 */
public class CreativeTabAC
{
    public static final CreativeTabs AotearoaCraft_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.PounamuClub;
        }
        @Override
    public String getTranslatedTabLabel()
        {
            return ("AotearoaCraft");
        }
    };
}
