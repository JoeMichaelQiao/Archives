
package io.github.standardblt.fuel;

import net.minecraft.item.ItemStack;

import io.github.standardblt.item.ItemLettuce;
import io.github.standardblt.ElementsStandardBLT;

@ElementsStandardBLT.ModElement.Tag
public class FuelFuleLettuce extends ElementsStandardBLT.ModElement {
	public FuelFuleLettuce(ElementsStandardBLT instance) {
		super(instance, 28);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemLettuce.block, (int) (1)).getItem())
			return 800;
		return 0;
	}
}
