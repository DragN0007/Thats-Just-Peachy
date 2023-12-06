package com.dragn0007.thatsjustpeachy.world.feature;

import com.dragn0007.thatsjustpeachy.config.ThatsJustPeachyCommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class TJPPlacedFeatures {
    

    public static final Holder<PlacedFeature> PEACH_PLACED =
            PlacementUtils.register("peach_placed",
                    TJPConfigFeatures.PEACH_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, ThatsJustPeachyCommonConfig.TREE_WEIGHT.get(), 1)));


}
