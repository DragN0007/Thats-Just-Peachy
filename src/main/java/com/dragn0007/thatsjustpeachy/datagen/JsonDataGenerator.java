package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ThatsJustPeachy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new TJPRecipeMaker(generator));
        generator.addProvider(new TJPLootTableProvider(generator));
        generator.addProvider(new TJPBlockstateProvider(generator, existingFileHelper));
        generator.addProvider(new TJPItemModelProvider(generator, existingFileHelper));
    }
}
