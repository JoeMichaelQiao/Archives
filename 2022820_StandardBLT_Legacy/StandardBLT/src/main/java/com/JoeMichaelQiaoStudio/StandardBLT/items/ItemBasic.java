package com.JoeMichaelQiaoStudio.StandardBLT.items;

import net.minecraft.item.Item;

import static com.JoeMichaelQiaoStudio.StandardBLT.creative.CreativeTabsStandardBLT.TabStandardBLT;

public class ItemBasic extends Item {
    public ItemBasic(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(TabStandardBLT);
        System.out.println(name + " [ITEM] Registered");
    }

}
