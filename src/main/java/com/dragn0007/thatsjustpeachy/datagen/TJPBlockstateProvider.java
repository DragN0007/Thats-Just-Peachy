package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.dragncrops.blocks.crop.base.FruitLeaves;
import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;

public class TJPBlockstateProvider extends BlockStateProvider {
    public TJPBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ThatsJustPeachy.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        logBlock(TJPBlocks.PEACH_LOG.get());
        logBlock(TJPBlocks.STRIPPED_PEACH_LOG.get());
        axisBlock(TJPBlocks.PEACH_WOOD.get(), blockTexture(TJPBlocks.PEACH_LOG.get()), blockTexture(TJPBlocks.PEACH_LOG.get()));
        axisBlock(TJPBlocks.STRIPPED_PEACH_WOOD.get(), blockTexture(TJPBlocks.STRIPPED_PEACH_LOG.get()), blockTexture(TJPBlocks.STRIPPED_PEACH_LOG.get()));
        blockWithItem(TJPBlocks.PEACH_PLANKS);
        stairsBlock((StairBlock) TJPBlocks.PEACH_STAIRS.get(), blockTexture(TJPBlocks.PEACH_PLANKS.get()));
        simpleBlockItem(TJPBlocks.PEACH_STAIRS.get(), models().stairs(TJPBlocks.PEACH_STAIRS.getId().getPath(),
                blockTexture(TJPBlocks.PEACH_PLANKS.get()), blockTexture(TJPBlocks.PEACH_PLANKS.get()), blockTexture(TJPBlocks.PEACH_PLANKS.get())));
        slabBlock((SlabBlock) TJPBlocks.PEACH_SLAB.get(), blockTexture(TJPBlocks.PEACH_PLANKS.get()), blockTexture(TJPBlocks.PEACH_PLANKS.get()));
        simpleBlockItem(TJPBlocks.PEACH_SLAB.get(), models().slab(TJPBlocks.PEACH_SLAB.getId().getPath(),
                blockTexture(TJPBlocks.PEACH_PLANKS.get()), blockTexture(TJPBlocks.PEACH_PLANKS.get()), blockTexture(TJPBlocks.PEACH_PLANKS.get())));
        simpleBlock(TJPBlocks.PEACH_SAPLING.get(), models().cross(TJPBlocks.PEACH_SAPLING.getId().getPath(),
                wildPlantTexture("peach_sapling")).renderType("cutout"));
        fenceBlock((FenceBlock) TJPBlocks.PEACH_FENCE.get(), blockTexture(TJPBlocks.PEACH_PLANKS.get()));
        simpleBlockItem(TJPBlocks.PEACH_FENCE.get(), models().fenceInventory(TJPBlocks.PEACH_FENCE.getId().getPath(),
                blockTexture(TJPBlocks.PEACH_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) TJPBlocks.PEACH_FENCE_GATE.get(), blockTexture(TJPBlocks.PEACH_PLANKS.get()));
        simpleBlockItem(TJPBlocks.PEACH_FENCE_GATE.get(), models().fenceGate(TJPBlocks.PEACH_FENCE_GATE.getId().getPath(),
                blockTexture(TJPBlocks.PEACH_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) TJPBlocks.PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/peach_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) TJPBlocks.PEACH_TRAPDOOR.get(), blockTexture(TJPBlocks.PEACH_TRAPDOOR.get()), true, "cutout");

        createLeaves((FruitLeaves) TJPBlocks.PEACH_LEAVES.get(), "peach_leaves", "peach_leaves",
                0, 1, 2, 3);

        for (TJPBlocks.Woods color : TJPBlocks.Woods.values()) {
            RegistryObject<DoorBlock> blockRegistryObject = TJPBlocks.DOORS.get(color);
            DoorBlock block = blockRegistryObject.get();
            doorBlockWithRenderType(block, new ResourceLocation(blockTexture(block) + "_bottom"),
                    new ResourceLocation(blockTexture(block) + "_top"), "cutout");
        }
    }

    public void createLeaves(FruitLeaves block, String modelNamePrefix, String textureNamePrefix, int... stageMap) {
        Property<Integer> ageProperty = block.getAgeProperty();
        int maxAge = Collections.max(ageProperty.getPossibleValues());

        if (stageMap == null || stageMap.length == 0) {
            stageMap = new int[maxAge + 1];
            for (int i = 0; i <= maxAge; i++) {
                stageMap[i] = i;
            }
        }

        final int[] finalStageMap = stageMap;

        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            int stage = finalStageMap[age];
            String modelName = modelNamePrefix + "_stage" + stage;
            String texturePath = textureNamePrefix + "_stage" + stage;

            return ConfiguredModel.builder()
                    .modelFile(models().cubeAll(modelName, new ResourceLocation(ThatsJustPeachy.MODID, "block/" + texturePath))
                            .renderType("cutout"))
                    .build();
        });
    }

    public ResourceLocation wildPlantTexture(String getTextureName) {
        return new ResourceLocation(ThatsJustPeachy.MODID,"block/" + getTextureName);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(ThatsJustPeachy.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
