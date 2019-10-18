package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder(Spellies.MOD_ID + ":" + DarkBindingReagent.REGISTRY_NAME)
    public static DarkBindingReagent DARK_BINDING_REAGENT;

    @ObjectHolder(Spellies.MOD_ID + ":" + LightBindingReagent.REGISTRY_NAME)
    public static LightBindingReagent LIGHT_BINDING_REAGENT;

    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new DarkBindingReagent().setRegistryName(DarkBindingReagent.REGISTRY_NAME),
                new LightBindingReagent().setRegistryName(LightBindingReagent.REGISTRY_NAME)
        );
    }

}
