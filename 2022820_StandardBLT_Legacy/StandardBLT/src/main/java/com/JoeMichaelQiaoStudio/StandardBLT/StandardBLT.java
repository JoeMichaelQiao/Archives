package com.JoeMichaelQiaoStudio.StandardBLT;

import com.JoeMichaelQiaoStudio.StandardBLT.init.ModBlocks;
import com.JoeMichaelQiaoStudio.StandardBLT.init.ModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTEDMINECRAFTVERSION, useMetadata = true)
public class StandardBLT
{
    @Instance(Reference.MODID)
    public static StandardBLT instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
        ModItems.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
    }

}
