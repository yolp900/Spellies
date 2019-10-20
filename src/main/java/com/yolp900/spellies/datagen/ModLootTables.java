package com.yolp900.spellies.datagen;

import com.yolp900.spellies.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;

public class ModLootTables extends BaseLootTableProvider {

    public ModLootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        lootTables.put(ModBlocks.SPELLBENCH, createStandardTable(ModBlocks.SPELLBENCH));
    }
}
