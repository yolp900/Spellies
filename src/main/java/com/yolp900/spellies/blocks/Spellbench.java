package com.yolp900.spellies.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Spellbench extends Block {

    public static final String REGISTRY_NAME = "spellbench";

    public Spellbench() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F).sound(SoundType.STONE));
    }

}
