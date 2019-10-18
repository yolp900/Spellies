package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder(Spellies.MOD_ID + ":" + BindingReagentDarkItem.REGISTRY_NAME)
    public static BindingReagentDarkItem BINDING_REAGENT_DARK;

    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new BindingReagentDarkItem().setRegistryName(BindingReagentDarkItem.REGISTRY_NAME)
        );
    }

}
