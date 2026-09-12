package com.dragn0007.thatsjustpeachy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ThatsJustPeachy.MODID)
public class ThatsJustPeachy {

    public static final String MODID = "thatsjustpeachy";

    public ThatsJustPeachy() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        TJPItems.register(eventBus);
        TJPItemGroup.register(eventBus);
        TJPBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(final FMLCommonSetupEvent event) {

    }
}