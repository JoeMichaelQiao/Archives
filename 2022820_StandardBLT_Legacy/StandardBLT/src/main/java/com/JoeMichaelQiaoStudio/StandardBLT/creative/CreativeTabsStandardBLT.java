package com.JoeMichaelQiaoStudio.StandardBLT.creative;

import com.JoeMichaelQiaoStudio.StandardBLT.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsStandardBLT {
    public static final CreativeTabs TabStandardBLT = new CreativeTabs("StandardBLT_Tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BLTItem);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImageName("item_search.png");
}
