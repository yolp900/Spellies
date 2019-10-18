package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;

public class BindingReagentDarkItem extends Item {

    public static final String REGISTRY_NAME = "binding_reagent_dark";

    public BindingReagentDarkItem() {
        super(new Item.Properties().group(Spellies.itemGroup));
    }

}
