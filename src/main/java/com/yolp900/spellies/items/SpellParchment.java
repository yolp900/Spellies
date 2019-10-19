package com.yolp900.spellies.items;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;

public class SpellParchment extends Item {

    public static final String REGISTRY_NAME = "spell_parchment";

    public SpellParchment() {
        super(new Item.Properties().group(Spellies.itemGroup));
    }

}
