package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TJPBlockstateProvider extends BlockStateProvider {
    public TJPBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ThatsJustPeachy.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.ACACIA_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/acacia_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/acacia_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.BIRCH_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/birch_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/birch_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.DARK_OAK_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/dark_oak_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/dark_oak_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.JUNGLE_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/jungle_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/jungle_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.OAK_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/oak_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/oak_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.SPRUCE_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/spruce_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/spruce_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.WARPED_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/warped_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/warped_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.CRIMSON_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/crimson_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/crimson_peach_door_top"), "cutout");

        doorBlockWithRenderType((DoorBlock) TJPBlocksLootGen.MANGROVE_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/mangrove_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/mangrove_peach_door_top"), "cutout");



        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get()), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocksLootGen.MANGROVE_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.MANGROVE_PEACH_TRAPDOOR.get()), true, "cutout");
    }

}
