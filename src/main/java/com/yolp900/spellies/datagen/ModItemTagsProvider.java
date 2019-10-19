package com.yolp900.spellies.datagen;

import com.yolp900.spellies.Spellies;
import com.yolp900.spellies.items.DarkBindingReagent;
import com.yolp900.spellies.items.LightBindingReagent;
import com.yolp900.spellies.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModItemTagsProvider extends ItemTagsProvider {

    public static final Tag<Item> BINDING_REAGENT = new ItemTags.Wrapper(new ResourceLocation(Spellies.MOD_ID, "binding_reagent"));
    public static final Tag<Item> DARK_BINDING_REAGENT = new ItemTags.Wrapper(new ResourceLocation(Spellies.MOD_ID, DarkBindingReagent.REGISTRY_NAME));
    public static final Tag<Item> LIGHT_BINDING_REAGENT = new ItemTags.Wrapper(new ResourceLocation(Spellies.MOD_ID, LightBindingReagent.REGISTRY_NAME));


    public ModItemTagsProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        super.registerTags();

        getBuilder(BINDING_REAGENT).add(ModItems.DARK_BINDING_REAGENT, ModItems.LIGHT_BINDING_REAGENT);
        getBuilder(DARK_BINDING_REAGENT).add(ModItems.DARK_BINDING_REAGENT);
        getBuilder(LIGHT_BINDING_REAGENT).add(ModItems.LIGHT_BINDING_REAGENT);
    }

    @Override
    public String getName() {
        return "Spellies Item Tags";
    }

}
