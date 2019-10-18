package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;

public class DarkBindingReagent extends Item {

    public static final String REGISTRY_NAME = "dark_binding_reagent";

    public DarkBindingReagent() {
        super(new Item.Properties().group(Spellies.itemGroup));
    }

}
