package com.dragn0007.thatsjustpeachy;

import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import com.dragn0007.thatsjustpeachy.world.feature.TJPConfigFeatures;
import com.dragn0007.thatsjustpeachy.world.feature.TJPPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import static com.dragn0007.thatsjustpeachy.ThatsJustPeachy.MODID;

@Mod(MODID)
public class ThatsJustPeachy
{
    public static final String MODID = "thatsjustpeachy";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ThatsJustPeachy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ModItems
        TJPItems.register(modEventBus);
        //Register ModBlocks
        TJPBlocks.register(modEventBus);
        TJPBlocksLootGen.register(modEventBus);
        //Register Configured Features
        TJPConfigFeatures.register(modEventBus);
        //Register Placed Features
        TJPPlacedFeatures.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        ComposterBlock.COMPOSTABLES.put(TJPItems.PEACH_PIT.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(TJPItems.PEACH.get(), 0.7F);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
