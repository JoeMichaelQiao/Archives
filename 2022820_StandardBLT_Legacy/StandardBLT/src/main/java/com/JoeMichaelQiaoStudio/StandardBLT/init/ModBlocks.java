package com.JoeMichaelQiaoStudio.StandardBLT.init;

import com.JoeMichaelQiaoStudio.StandardBLT.Reference;
import com.JoeMichaelQiaoStudio.StandardBLT.blocks.BlockBasic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModBlocks {

    public static Block BLTBlock;

    public static void init() {
        BLTBlock = new BlockBasic("BLTBlock", Material.ROCK).setHardness(1.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(1.0f);
        BLTBlock.setHarvestLevel("pickaxe", 0);
        System.out.println("BLTBlock init");
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BLTBlock);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(BLTBlock).setRegistryName(BLTBlock.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(BLTBlock));
        System.out.println("RegisterReaders");
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        System.out.println("###RedgsterReader### " + item.getRegistryName());
    }
}
