
package io.github.standardblt.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import io.github.standardblt.item.ItemIronKnife;
import io.github.standardblt.ElementsStandardBLT;

@ElementsStandardBLT.ModElement.Tag
public class TabStandardBLTTools extends ElementsStandardBLT.ModElement {
	public TabStandardBLTTools(ElementsStandardBLT instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstandardblttools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIronKnife.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
