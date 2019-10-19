package com.yolp900.spellies.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        super.registerTags();


    }

    @Override
    public String getName() {
        return "Spellies Block Tags";
    }
}
