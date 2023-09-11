package com.dragn0007.thatsjustpeachy.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModPlacedFeatures {
    

    public static final Holder<PlacedFeature> PEACH_PLACED =
            PlacementUtils.register("peach_placed",
                    ModConfigFeatures.PEACH_SPAWN,
                    treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));


}
