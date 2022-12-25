
package io.github.standardblt.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import io.github.standardblt.item.ItemStandardBLT;
import io.github.standardblt.ElementsStandardBLT;

@ElementsStandardBLT.ModElement.Tag
public class TabStandardBLTFoods extends ElementsStandardBLT.ModElement {
	public TabStandardBLTFoods(ElementsStandardBLT instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstandardbltfoods") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemStandardBLT.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
