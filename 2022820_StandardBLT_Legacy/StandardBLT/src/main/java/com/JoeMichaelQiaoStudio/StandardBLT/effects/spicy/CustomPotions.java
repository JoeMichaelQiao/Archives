package com.JoeMichaelQiaoStudio.StandardBLT.effects.spicy;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;

import javax.annotation.Nonnull;
import java.awt.*;

public class CustomPotions extends Potion
{
    protected CustomPotions(boolean isBadEffectIn, int liquidColorIn)
    {
        super(isBadEffectIn, liquidColorIn);
    }

    @Override
    public void performEffect(@Nonnull EntityLivingBase en, int amp)
    {
        if(this == CustomMobEffects.SPICY);
        {
            if(en.getHealth() > 0)
            {
                float now = en.getHealth() / 2;
                en.attackEntityFrom(DamageSource.causeMobDamage(en), 0.1f);
            }
        }
    }

}
