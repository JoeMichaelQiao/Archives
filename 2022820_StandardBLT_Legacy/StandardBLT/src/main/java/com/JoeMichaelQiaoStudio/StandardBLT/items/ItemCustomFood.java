package com.JoeMichaelQiaoStudio.StandardBLT.items;

import net.minecraft.item.ItemFood;

import static com.JoeMichaelQiaoStudio.StandardBLT.creative.CreativeTabsStandardBLT.TabStandardBLT;

public class ItemCustomFood extends ItemFood {
    public ItemCustomFood(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(TabStandardBLT);
        System.out.println(name + " [Food] Registered");
    }
}
