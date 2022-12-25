package com.JoeMichaelQiaoStudio.StandardBLT.items;

import com.JoeMichaelQiaoStudio.StandardBLT.effects.spicy.CustomMobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Chilli extends ItemCustomFood
{
    public Chilli(String name, int amount, float saturation, boolean isWolfFood)
    {
        super("Chilli", 1, (float) 0.5, false);
        setAlwaysEdible();
        System.out.println(name + " [EffectFood] Registered");
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if(!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(CustomMobEffects.SPICY, 2, 1, false, true));
            // DurationIn is count by tick(20 ticks per second), so X second is (X*20) tick.
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
