package com.dragn0007.thatsjustpeachy;

import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import com.dragn0007.thatsjustpeachy.world.feature.TJPConfigFeatures;
import com.dragn0007.thatsjustpeachy.world.feature.TJPPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
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

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class ThatsJustPeachy
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "thatsjustpeachy";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "thatsjustpeachy" namespace

    public ThatsJustPeachy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ModItems
        TJPItems.register(modEventBus);
        //Register ModBlocks
        TJPBlocks.register(modEventBus);
        //Register Configured Features
        TJPConfigFeatures.register(modEventBus);
        //Register Placed Features
        TJPPlacedFeatures.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("Peaches! >> {}", ForgeRegistries.BLOCKS.getKey(TJPBlocks.PEACH_CAKE.get()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
