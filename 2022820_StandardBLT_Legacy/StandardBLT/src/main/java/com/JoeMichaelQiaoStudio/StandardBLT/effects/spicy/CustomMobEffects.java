package com.JoeMichaelQiaoStudio.StandardBLT.effects.spicy;

import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class CustomMobEffects extends MobEffects {
    public static final Potion SPICY;
    public static final Potion TOOTHACHE;

    private static Potion getRegisteredMobEffect(String id)
    {
        Potion potion = Potion.REGISTRY.getObject(new ResourceLocation(id));

        if (potion == null)
        {
            throw new IllegalStateException("Invalid MobEffect requested: " + id);
        }
        else
        {
            return potion;
        }
    }

    static
    {
        SPICY = getRegisteredMobEffect("spicy");
        TOOTHACHE = getRegisteredMobEffect("toothache");
    }

}
