package com.JoeMichaelQiaoStudio.StandardBLT_Texture;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTEDMINECRAFTVERSION, useMetadata = true)
public class StandardBLT_Texture
{
    @Instance(Reference.MODID)
    public static StandardBLT_Texture instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
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
