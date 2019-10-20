package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import com.yolp900.spellies.items.wands.BasicWand;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder(Spellies.MOD_ID + ":" + DarkBindingReagent.REGISTRY_NAME)
    public static DarkBindingReagent DARK_BINDING_REAGENT;

    @ObjectHolder(Spellies.MOD_ID + ":" + LightBindingReagent.REGISTRY_NAME)
    public static LightBindingReagent LIGHT_BINDING_REAGENT;

    @ObjectHolder(Spellies.MOD_ID + ":" + SpellParchment.REGISTRY_NAME)
    public static SpellParchment SPELL_PARCHMENT;

    @ObjectHolder(Spellies.MOD_ID + ":" + BasicWand.REGISTRY_NAME)
    public static BasicWand BASIC_WAND;

    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new DarkBindingReagent().setRegistryName(DarkBindingReagent.REGISTRY_NAME),
                new LightBindingReagent().setRegistryName(LightBindingReagent.REGISTRY_NAME),
                new SpellParchment().setRegistryName(SpellParchment.REGISTRY_NAME),
                new BasicWand().setRegistryName(BasicWand.REGISTRY_NAME)
        );
    }

}
