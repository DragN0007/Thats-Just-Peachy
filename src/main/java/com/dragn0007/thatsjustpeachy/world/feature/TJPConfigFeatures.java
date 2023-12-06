package com.dragn0007.thatsjustpeachy.world.feature;

import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class TJPConfigFeatures {


    //PEACH
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PEACH = FeatureUtils.register("peach",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(TJPBlocks.PEACH_LOG.get()),
            new StraightTrunkPlacer(2, 2, 0),
            BlockStateProvider.simple(TJPBlocks.PEACH_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> PEACH_CHECKED =
            PlacementUtils.register("peach_checked",
                    PEACH, PlacementUtils.filteredByBlockSurvival(TJPBlocks.PEACH_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> PEACH_SPAWN =
            FeatureUtils.register("peach_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(PEACH_CHECKED, 0.1F)), PEACH_CHECKED));
    

}


