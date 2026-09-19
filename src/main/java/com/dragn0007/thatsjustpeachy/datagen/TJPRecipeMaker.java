package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.dragncrops.util.COTags;
import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import com.dragn0007.thatsjustpeachy.items.TJPItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Locale;
import java.util.function.Consumer;

public class TJPRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public TJPRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        buildCommonRecipes(pFinishedRecipeConsumer);
        buildWoodRecipes(pFinishedRecipeConsumer, TJPBlocks.PEACH);
    }

    public void buildCommonRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TJPItems.PEACH_JAM.get())
                .requires(TJPItems.PEACH.get())
                .requires(TJPItems.PEACH.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TJPItems.PEACH_CANDY.get())
                .requires(TJPItems.PEACH.get())
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TJPItems.PEACH_TART.get())
                .requires(TJPItems.PEACH_JAM.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TJPItems.PEACH_GELATIN.get())
                .requires(TJPItems.PEACH_JAM.get())
                .requires(TJPItems.PEACH.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.SUGAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COItems.UNFERMENTED_APPLE_MEAD.get())
                .requires(TJPItems.PEACH.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.GRAIN.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TJPItems.PEACH_COCKTAIL.get())
                .requires(TJPItems.PEACH.get())
                .requires(COTags.Items.SUGAR)
                .requires(COItems.COCONUT.get())
                .requires(COItems.LIME.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TJPItems.PEACH_PIE.get())
                .requires(TJPItems.PEACH.get())
                .requires(TJPItems.PEACH.get())
                .requires(COTags.Items.SUGAR)
                .requires(COTags.Items.FLOUR)
                .requires(COTags.Items.EGG)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(COTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);
    }

    private static void buildWoodRecipes(Consumer<FinishedRecipe> consumer, TJPBlocks.WoodType wood) {
        Block planks = wood.planks().get();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4)
                .requires(Ingredient.of(wood.log().get(), wood.stripped_log().get(), wood.wood().get(), wood.stripped_wood().get()))
                .unlockedBy("has_log", has(wood.log().get()))
                .save(consumer, getConversionRecipeName(planks, wood.log().get()));

        stairBuilder(wood.wood().get(), Ingredient.of(wood.log().get()))
                .unlockedBy("has_log", has(wood.log().get()))
                .save(consumer);

        stairBuilder(wood.stairs().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, wood.slab().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        fenceBuilder(wood.fence().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        fenceGateBuilder(wood.fenceGate().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        doorBuilder(wood.door().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        trapdoorBuilder(wood.trapdoor().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        for (TJPBlocks.Woods color : TJPBlocks.Woods.values()) {
            Item planksItem = BuiltInRegistries.ITEM.get(new ResourceLocation("minecraft", color.name().toLowerCase() + "_planks"));
            Item doorItem = BuiltInRegistries.ITEM.get(new ResourceLocation(ThatsJustPeachy.MODID, color.name().toLowerCase() + "_peach_door"));
            doorBuilder(doorItem, Ingredient.of(planksItem))
                    .unlockedBy("has_planks", has(planksItem))
                    .save(consumer);
        }
    }
}