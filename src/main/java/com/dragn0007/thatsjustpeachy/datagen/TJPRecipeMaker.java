package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import com.dragn0007.thatsjustpeachy.datagen.biglooter.TJPBlockLootTables;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class TJPRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public TJPRecipeMaker(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.PEACH_BEDSIDE_CABINET.get(), 2)
                .define('A', TJPBlocks.PEACH_LOG.get())
                .define('B', TJPBlocks.PEACH_PLANKS.get())
                .define('C', TJPBlocks.STRIPPED_PEACH_LOG.get())
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.ACACIA_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.ACACIA_LOG)
                .define('B', Blocks.ACACIA_PLANKS)
                .define('C', Blocks.STRIPPED_ACACIA_LOG)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.BIRCH_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.BIRCH_LOG)
                .define('B', Blocks.BIRCH_PLANKS)
                .define('C', Blocks.STRIPPED_BIRCH_LOG)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.DARK_OAK_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.DARK_OAK_LOG)
                .define('B', Blocks.DARK_OAK_PLANKS)
                .define('C', Blocks.STRIPPED_DARK_OAK_LOG)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.JUNGLE_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.JUNGLE_LOG)
                .define('B', Blocks.JUNGLE_PLANKS)
                .define('C', Blocks.STRIPPED_JUNGLE_LOG)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.OAK_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.OAK_LOG)
                .define('B', Blocks.OAK_PLANKS)
                .define('C', Blocks.STRIPPED_OAK_LOG)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.SPRUCE_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.SPRUCE_LOG)
                .define('B', Blocks.SPRUCE_PLANKS)
                .define('C', Blocks.STRIPPED_SPRUCE_LOG)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.CRIMSON_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.CRIMSON_STEM)
                .define('B', Blocks.CRIMSON_PLANKS)
                .define('C', Blocks.STRIPPED_CRIMSON_STEM)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocksLootGen.WARPED_BEDSIDE_CABINET.get(), 2)
                .define('A', Blocks.WARPED_STEM)
                .define('B', Blocks.WARPED_PLANKS)
                .define('C', Blocks.STRIPPED_WARPED_STEM)
                .pattern("CCC")
                .pattern("BAB")
                .pattern("CCC")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);




        ShapedRecipeBuilder.shaped(TJPItems.PEACH_COOKIE.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.WHEAT)
                .pattern(" A ")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TJPItems.ICED_PEACH_COOKIE.get(), 1)
                .requires(TJPItems.PEACH_COOKIE.get())
                .requires(Items.MILK_BUCKET)
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPItems.PEACH_CUPCAKE.get(), 3)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.WHEAT)
                .define('C', Items.MILK_BUCKET)
                .pattern(" C ")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(TJPItems.PEACH_CUPCAKE_FANCY.get(), 1)
                .requires(TJPItems.PEACH.get())
                .requires(TJPItems.PEACH_CUPCAKE.get())
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TJPItems.PEACH.get()).build()))
                .save(pFinishedRecipeConsumer);





        ShapedRecipeBuilder.shaped(TJPBlocks.PEACH_STAINED_GLASS_PANE.get(), 8)
                .define('A', TJPItems.PEACH.get())
                .define('B', Blocks.GLASS_PANE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_peach", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.FANCY_PEACH_WINDOW.get(), 8)
                .define('A', TJPItems.PEACH.get())
                .define('B', Items.IRON_NUGGET)
                .define('C', Blocks.GLASS_PANE)
                .pattern("BCB")
                .pattern("CAC")
                .pattern("BCB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.PEACH_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', TJPItems.PEACH.get())
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.BLACK_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.BLACK_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.BLUE_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.BLUE_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.BROWN_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.BROWN_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.CYAN_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.CYAN_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.GREEN_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.GREEN_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.GRAY_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.GRAY_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.LIGHT_GRAY_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.LIGHT_GRAY_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.LIGHT_BLUE_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.LIGHT_BLUE_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.LIME_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.LIME_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.ORANGE_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.ORANGE_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.PINK_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.PINK_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.PURPLE_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.PURPLE_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.RED_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.RED_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.WHITE_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.WHITE_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(TJPBlocks.YELLOW_STAINED_FANCY_PEACH_WINDOW.get(), 8)
                .define('A', Items.YELLOW_DYE)
                .define('B', TJPBlocks.FANCY_PEACH_WINDOW.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_glass_pane", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);






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