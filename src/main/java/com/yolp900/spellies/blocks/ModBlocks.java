package com.yolp900.spellies.blocks;

import com.yolp900.spellies.Spellies;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class ModBlocks {

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        // event.getRegistry().registerAll( ... );
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties().group(Spellies.itemGroup);

        // event.getRegistry().registerAll( ... );
    }

}
