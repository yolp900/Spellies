package com.yolp900.spellies.datagen;

import com.yolp900.spellies.Spellies;
import com.yolp900.spellies.items.DarkBindingReagent;
import com.yolp900.spellies.items.LightBindingReagent;
import com.yolp900.spellies.items.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {

    public ModRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.DARK_BINDING_REAGENT)
                .addIngredient(Tags.Items.DUSTS_GLOWSTONE)
                .addIngredient(Tags.Items.DUSTS_GLOWSTONE)
                .addIngredient(Tags.Items.DUSTS_REDSTONE)
                .addIngredient(Tags.Items.DUSTS_REDSTONE)
                .addIngredient(Tags.Items.DYES_BLACK)
                .addIngredient(Tags.Items.DYES_BLACK)
                .setGroup(Spellies.MOD_ID + "." + DarkBindingReagent.REGISTRY_NAME)
                .addCriterion(DarkBindingReagent.REGISTRY_NAME, InventoryChangeTrigger.Instance.forItems(Items.GLOWSTONE_DUST, Items.REDSTONE, Items.BLACK_DYE))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ModItems.LIGHT_BINDING_REAGENT)
                .addIngredient(Tags.Items.DUSTS_GLOWSTONE)
                .addIngredient(Tags.Items.DUSTS_GLOWSTONE)
                .addIngredient(Tags.Items.DUSTS_REDSTONE)
                .addIngredient(Tags.Items.DUSTS_REDSTONE)
                .addIngredient(Tags.Items.DYES_WHITE)
                .addIngredient(Tags.Items.DYES_WHITE)
                .setGroup(Spellies.MOD_ID + "." + LightBindingReagent.REGISTRY_NAME)
                .addCriterion(LightBindingReagent.REGISTRY_NAME, InventoryChangeTrigger.Instance.forItems(Items.GLOWSTONE_DUST, Items.REDSTONE, Items.WHITE_DYE))
                .build(consumer);
    }

}
