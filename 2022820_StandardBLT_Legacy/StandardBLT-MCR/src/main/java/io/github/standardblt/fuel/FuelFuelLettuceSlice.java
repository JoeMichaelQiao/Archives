
package io.github.standardblt.fuel;

import net.minecraft.item.ItemStack;

import io.github.standardblt.item.ItemLettuceSlice;
import io.github.standardblt.ElementsStandardBLT;

@ElementsStandardBLT.ModElement.Tag
public class FuelFuelLettuceSlice extends ElementsStandardBLT.ModElement {
	public FuelFuelLettuceSlice(ElementsStandardBLT instance) {
		super(instance, 27);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemLettuceSlice.block, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
