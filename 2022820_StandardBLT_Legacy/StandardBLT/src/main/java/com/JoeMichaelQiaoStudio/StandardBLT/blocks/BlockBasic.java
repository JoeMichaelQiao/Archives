package com.JoeMichaelQiaoStudio.StandardBLT.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {
    public BlockBasic(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        System.out.println(material + " [MATERIAL] " + name + " [BLOCK] Registered");
    }

}
