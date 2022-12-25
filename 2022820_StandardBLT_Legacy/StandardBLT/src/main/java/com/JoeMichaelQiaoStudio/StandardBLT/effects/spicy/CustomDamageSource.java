package com.JoeMichaelQiaoStudio.StandardBLT.effects.spicy;

import net.minecraft.util.DamageSource;

public class CustomDamageSource extends DamageSource
{
    public static final DamageSource SPICY = (new DamageSource("tooSpicy")).setDamageBypassesArmor();
    public static final DamageSource TOOTHACHE = (new DamageSource("toothache")).setDamageBypassesArmor();

    public CustomDamageSource(String damageTypeIn)
    {
        super(damageTypeIn);
    }
}
