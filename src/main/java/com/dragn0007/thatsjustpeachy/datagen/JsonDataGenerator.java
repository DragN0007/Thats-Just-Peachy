package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ThatsJustPeachy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (generator != null) {
            generator.addProvider(true, new TJPRecipeMaker(generator));
            generator.addProvider(true, new TJPLootTableProvider(generator));
            generator.addProvider(true, new TJPBlockstateProvider(generator, existingFileHelper));
            generator.addProvider(true, new TJPItemModelProvider(generator, existingFileHelper));
        }
    }
}
