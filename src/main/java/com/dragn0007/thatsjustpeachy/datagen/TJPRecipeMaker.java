package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class TJPRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public TJPRecipeMaker(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(TJPItems.PEACH_SODA.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.SUGAR)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPItems.PEACH_PASTRY.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.WHEAT)
                .pattern("BAB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.ACACIA_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.ACACIA_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.BIRCH_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.BIRCH_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.DARK_OAK_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.DARK_OAK_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.OAK_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.OAK_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.SPRUCE_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.SPRUCE_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.JUNGLE_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.JUNGLE_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.WARPED_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.WARPED_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.CRIMSON_PEACH_DOOR.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.CRIMSON_PLANKS)
                .pattern("BB ")
                .pattern("BBA")
                .pattern("BB ")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.ACACIA_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.BIRCH_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.DARK_OAK_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.OAK_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.SPRUCE_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.JUNGLE_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.WARPED_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get(), 2)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.CRIMSON_PLANKS)
                .pattern(" A ")
                .pattern("BBB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);
    }
}