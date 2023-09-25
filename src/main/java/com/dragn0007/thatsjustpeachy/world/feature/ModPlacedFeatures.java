package com.dragn0007.thatsjustpeachy.world.feature;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.dragn0007.thatsjustpeachy.world.feature.ModConfigFeatures.PEACH;
import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ThatsJustPeachy.MODID);

    public static final RegistryObject<PlacedFeature> PEACH_CHECKED = PLACED_FEATURES.register("peach_checked",
            () -> new PlacedFeature(ModConfigFeatures.PEACH.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.PEACH_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> PEACH_PLACED = PLACED_FEATURES.register("peach_placed",
            () -> new PlacedFeature(ModConfigFeatures.PEACH_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.1F, 1))));


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
