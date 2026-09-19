package com.dragn0007.thatsjustpeachy.datagen.biglooter;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.FruitLeaves;
import com.dragn0007.dragncrops.blocks.custom.food.CanBlock;
import com.dragn0007.dragncrops.blocks.custom.food.CandyBlock;
import com.dragn0007.dragncrops.blocks.custom.food.JamJarBlock;
import com.dragn0007.dragncrops.blocks.custom.food.MeadBottleBlock;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import com.dragn0007.thatsjustpeachy.items.TJPItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Set;

public class TJPBlockLoot extends BlockLootSubProvider {
    public TJPBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.dropSelf(TJPBlocks.PEACH_LOG.get());
        this.dropSelf(TJPBlocks.STRIPPED_PEACH_LOG.get());
        this.dropSelf(TJPBlocks.PEACH_WOOD.get());
        this.dropSelf(TJPBlocks.STRIPPED_PEACH_WOOD.get());
        this.dropSelf(TJPBlocks.PEACH_PLANKS.get());
        this.dropSelf(TJPBlocks.PEACH_SLAB.get());
        this.dropSelf(TJPBlocks.PEACH_STAIRS.get());
        this.dropSelf(TJPBlocks.PEACH_SAPLING.get());
        this.dropSelf(TJPBlocks.PEACH_FENCE.get());
        this.dropSelf(TJPBlocks.PEACH_FENCE_GATE.get());
        this.dropSelf(TJPBlocks.PEACH_DOOR.get());
        this.dropSelf(TJPBlocks.PEACH_TRAPDOOR.get());
        
        LootItemCondition.Builder leafBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(TJPBlocks.PEACH_LEAVES.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FruitLeaves.AGE, 3));
        this.add(TJPBlocks.PEACH_LEAVES.get(),
                this.applyExplosionDecay(TJPBlocks.PEACH_LEAVES.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(TJPItems.PEACH.get())))
                                .withPool(LootPool.lootPool().when(leafBuilder).add(LootItem.lootTableItem(TJPItems.PEACH.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5815288F, 2))))));

        for (TJPBlocks.Woods color : TJPBlocks.Woods.values()) {this.dropSelf(TJPBlocks.DOORS.get(color).get());}
        for (DyeColor color : DyeColor.values()) {this.dropSelf(TJPBlocks.PAPER_LANTERNS.get(color).get());}
        for (DyeColor color : DyeColor.values()) {this.dropSelf(TJPBlocks.PEACH_LANTERNS.get(color).get());}
        this.dropSelf(TJPBlocks.PEACH_PAPER_LANTERN.get());
        this.dropSelf(TJPBlocks.PEACH_LANTERN.get());

        this.add(TJPBlocks.PEACH_MEAD.get(), createMeadDrops(TJPBlocks.PEACH_MEAD.get(), TJPItems.PEACH_MEAD.get()));
        this.dropOther(TJPBlocks.FERMENTED_PEACH_MEAD.get(), TJPBlocks.FERMENTED_PEACH_MEAD.get());
        this.dropOther(TJPBlocks.UNFERMENTED_PEACH_MEAD.get(), TJPItems.UNFERMENTED_PEACH_MEAD.get());
        this.add(TJPBlocks.PEACH_JAM.get(), createJamDrops(TJPBlocks.PEACH_JAM.get(), TJPItems.PEACH_JAM.get()));
        this.dropOther(TJPBlocks.PEACH_TART.get(), TJPItems.PEACH_TART.get());
        this.add(TJPBlocks.PEACH_CANDY.get(), createCandyDrops(TJPBlocks.PEACH_CANDY.get(), TJPItems.PEACH_CANDY.get()));
        this.dropOther(TJPBlocks.PEACH_GELATIN.get(), TJPItems.PEACH_GELATIN.get());
    }

    protected LootTable.Builder createJamDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(JamJarBlock.JAM_JARS, integer))))
                )));
    }

    protected LootTable.Builder createCandyDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(CandyBlock.CANDIES, integer))))
                )));
    }

    protected LootTable.Builder createMeadDrops(Block block, Item item) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(List.of(2, 3, 4, 5, 6, 7, 8),
                                        (integer) -> SetItemCountFunction.setCount(ConstantValue.exactly((float)integer.intValue()))
                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                .hasProperty(MeadBottleBlock.BOTTLES, integer))))
                )));
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return TJPBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
