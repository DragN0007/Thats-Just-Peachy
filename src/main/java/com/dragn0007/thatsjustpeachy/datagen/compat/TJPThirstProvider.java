package com.dragn0007.thatsjustpeachy.datagen.compat;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.thatsjustpeachy.items.TJPItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import sfiomn.legendarysurvivaloverhaul.api.data.providers.ThirstDataProvider;

import java.util.concurrent.CompletableFuture;

/*
ModThirstProvider (renamed to COThirstProvider) originally by legendary_workshop, used in Legendary Survival Overhaul
Distributed under MIT

This class is used for Legendary Survival Overhaul compat with CO foods & drinks
 */

public class TJPThirstProvider extends ThirstDataProvider {

    public TJPThirstProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper) {
        super(CropOverhaul.MODID, output, lookupProvider, fileHelper);
    }

    @Override
    public void generate(HolderLookup.Provider provider, ExistingFileHelper existingFileHelper) {
        consumable(TJPItems.PEACH.get()).addThirst(thirstData(2, 0.3f));
        consumable(TJPItems.PEACH_JAM.get()).addThirst(thirstData(2, 0.3f));
        consumable(TJPItems.PEACH_COCKTAIL.get()).addThirst(thirstData(5, 0.7f));
        consumable(TJPItems.PEACH_TEA.get()).addThirst(thirstData(5, 1.0f));
        consumable(TJPItems.PEACH_MEAD.get()).addThirst(thirstData(2, 0.3f));
    }
}