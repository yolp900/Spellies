package com.yolp900.spellies.items.wands;

import com.yolp900.spellies.Spellies;
import net.minecraft.item.Item;

public abstract class Wand extends Item implements IWand {

    public Wand() {
        super(new Item.Properties().group(Spellies.itemGroup).maxStackSize(1));
    }

}
