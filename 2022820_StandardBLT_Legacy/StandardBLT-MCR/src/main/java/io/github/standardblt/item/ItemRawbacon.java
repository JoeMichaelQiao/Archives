
package io.github.standardblt.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import io.github.standardblt.creativetab.TabStandardBLTFoods;
import io.github.standardblt.ElementsStandardBLT;

@ElementsStandardBLT.ModElement.Tag
public class ItemRawbacon extends ElementsStandardBLT.ModElement {
	@GameRegistry.ObjectHolder("blt:rawbacon")
	public static final Item block = null;
	public ItemRawbacon(ElementsStandardBLT instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("blt:rawbacon", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(1, 1.6f, false);
			setUnlocalizedName("rawbacon");
			setRegistryName("rawbacon");
			setCreativeTab(TabStandardBLTFoods.tab);
			setMaxStackSize(64);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 16;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
