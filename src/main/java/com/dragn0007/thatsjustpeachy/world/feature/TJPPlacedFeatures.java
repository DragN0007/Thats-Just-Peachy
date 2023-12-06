package com.dragn0007.thatsjustpeachy.world.feature;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class TJPPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ThatsJustPeachy.MODID);

    public static final RegistryObject<PlacedFeature> PEACH_CHECKED = PLACED_FEATURES.register("peach_checked",
            () -> new PlacedFeature(TJPConfigFeatures.PEACH.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(TJPBlocks.PEACH_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> PEACH_PLACED = PLACED_FEATURES.register("peach_placed",
            () -> new PlacedFeature(TJPConfigFeatures.PEACH_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.5F, 1))));


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
