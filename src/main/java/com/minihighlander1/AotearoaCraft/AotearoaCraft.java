package com.minihighlander1.AotearoaCraft;

import com.minihighlander1.AotearoaCraft.handler.ConfigurationHandler;
import com.minihighlander1.AotearoaCraft.init.ModBlocks;
import com.minihighlander1.AotearoaCraft.init.ModItems;
import com.minihighlander1.AotearoaCraft.init.Recipes;
import com.minihighlander1.AotearoaCraft.proxy.Iproxy;
import com.minihighlander1.AotearoaCraft.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
 public class AotearoaCraft {
    @Mod.Instance(Reference.MOD_ID)
    public static AotearoaCraft Instance;

    @SidedProxy(clientSide = "com.minihighlander1.AotearoaCraft.proxy.ClientProxy", serverSide = "com.minihighlander1.AotearoaCraft.proxy.ServerProxy")
    public static Iproxy proxy;


    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event)
    {

    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();


    }
    @Mod.EventHandler()
    public void Init(FMLInitializationEvent event)
    {
        Recipes.init();
    }
    @Mod.EventHandler()
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}

