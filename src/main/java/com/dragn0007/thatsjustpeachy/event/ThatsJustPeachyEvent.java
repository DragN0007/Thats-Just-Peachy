package com.dragn0007.thatsjustpeachy.event;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = ThatsJustPeachy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ThatsJustPeachyEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
    }
}




