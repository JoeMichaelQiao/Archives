
package io.github.standardblt.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.standardblt.item.ItemWoodenknife;
import io.github.standardblt.item.ItemStoneKnife;
import io.github.standardblt.item.ItemIronKnife;
import io.github.standardblt.item.ItemGoldenKnife;
import io.github.standardblt.item.ItemDiamondKnife;
import io.github.standardblt.ElementsStandardBLT;

@ElementsStandardBLT.ModElement.Tag
public class OreDictKnife extends ElementsStandardBLT.ModElement {
	public OreDictKnife(ElementsStandardBLT instance) {
		super(instance, 19);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("knife", new ItemStack(ItemWoodenknife.block, (int) (1)));
		OreDictionary.registerOre("knife", new ItemStack(ItemStoneKnife.block, (int) (1)));
		OreDictionary.registerOre("knife", new ItemStack(ItemIronKnife.block, (int) (1)));
		OreDictionary.registerOre("knife", new ItemStack(ItemGoldenKnife.block, (int) (1)));
		OreDictionary.registerOre("knife", new ItemStack(ItemDiamondKnife.block, (int) (1)));
	}
}
