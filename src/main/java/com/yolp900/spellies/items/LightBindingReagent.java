package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;

public class LightBindingReagent extends Item {

    public static final String REGISTRY_NAME = "light_binding_reagent";

    public LightBindingReagent() {
        super(new Item.Properties().group(Spellies.itemGroup));
    }

}
