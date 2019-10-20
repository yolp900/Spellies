package com.yolp900.spellies.blocks;

import com.yolp900.spellies.Spellies;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder(Spellies.MOD_ID + ":" + Spellbench.REGISTRY_NAME)
    public static Spellbench SPELLBENCH;

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new Spellbench().setRegistryName(Spellbench.REGISTRY_NAME)
        );
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        Item.Properties properties = new Item.Properties().group(Spellies.itemGroup);

        event.getRegistry().registerAll(
                new BlockItem(SPELLBENCH, properties).setRegistryName(Spellbench.REGISTRY_NAME)
        );
    }

}
