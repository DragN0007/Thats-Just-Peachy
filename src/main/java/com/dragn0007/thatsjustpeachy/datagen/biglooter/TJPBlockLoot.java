package com.dragn0007.thatsjustpeachy.datagen.biglooter;

import com.dragn0007.dragncrops.blocks.COBlocks;
import com.dragn0007.dragncrops.blocks.crop.base.FruitLeaves;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import com.dragn0007.thatsjustpeachy.items.TJPItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

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
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return TJPBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
