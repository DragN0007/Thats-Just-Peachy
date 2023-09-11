package com.dragn0007.thatsjustpeachy.world;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = ThatsJustPeachy.MODID)
public class ModWorldEvents {



    @SubscribeEvent
            public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

    ModTreeGeneration.generateTrees(event);


    }
}
