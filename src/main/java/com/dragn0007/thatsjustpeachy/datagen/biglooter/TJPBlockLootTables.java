package com.dragn0007.thatsjustpeachy.datagen.biglooter;

import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class TJPBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.add(TJPBlocksLootGen.ACACIA_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.BIRCH_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.DARK_OAK_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.OAK_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.JUNGLE_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.SPRUCE_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.WARPED_PEACH_DOOR.get(), BlockLoot::createDoorTable);
        this.add(TJPBlocksLootGen.CRIMSON_PEACH_DOOR.get(), BlockLoot::createDoorTable);

        this.dropSelf(TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get());
        this.dropSelf(TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get());

        this.dropSelf(TJPBlocksLootGen.PEACH_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.ACACIA_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.BIRCH_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.DARK_OAK_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.OAK_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.JUNGLE_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.SPRUCE_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.WARPED_BEDSIDE_CABINET.get());
        this.dropSelf(TJPBlocksLootGen.CRIMSON_BEDSIDE_CABINET.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TJPBlocksLootGen.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
