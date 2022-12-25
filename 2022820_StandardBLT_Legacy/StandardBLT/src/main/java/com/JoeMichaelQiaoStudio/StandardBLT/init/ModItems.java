package com.JoeMichaelQiaoStudio.StandardBLT.init;

import com.JoeMichaelQiaoStudio.StandardBLT.Reference;
import com.JoeMichaelQiaoStudio.StandardBLT.items.ItemBasic;
import com.JoeMichaelQiaoStudio.StandardBLT.items.ItemCustomFood;
import com.JoeMichaelQiaoStudio.StandardBLT.items.Chilli;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.JoeMichaelQiaoStudio.StandardBLT.creative.CreativeTabsStandardBLT.TabStandardBLT;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModItems {

    public static ItemBasic BLTItem;
    static Item BLTFood;
    static Item BLTEffectFood;

    public static void init() {
        BLTItem = new ItemBasic("BLTItem");
        System.out.println("BLT init");
        BLTFood = new ItemCustomFood("BLTFood", 5, 0.3f, false).setCreativeTab(TabStandardBLT);
        BLTEffectFood = new Chilli("BLTEffectFood", 5, 0.3f, false).setCreativeTab(TabStandardBLT);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(BLTItem);
        event.getRegistry().registerAll(BLTFood, BLTEffectFood);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(BLTItem);
        registerRender(BLTFood);
        registerRender(BLTEffectFood);
        System.out.println("RegisterReaders");
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        System.out.println("###RedgsterReader### " + item.getRegistryName());
    }
}
