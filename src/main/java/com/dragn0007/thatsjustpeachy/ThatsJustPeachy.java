package com.dragn0007.thatsjustpeachy;

import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import com.dragn0007.thatsjustpeachy.config.ThatsJustPeachyClientConfig;
import com.dragn0007.thatsjustpeachy.config.ThatsJustPeachyCommonConfig;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

import static com.dragn0007.thatsjustpeachy.ThatsJustPeachy.MODID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class ThatsJustPeachy
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "thatsjustpeachy";

    public ThatsJustPeachy()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        // Register ModItems
        TJPItems.register(eventBus);
        //Register ModBlocks
        TJPBlocks.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        //Register Configs
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThatsJustPeachyCommonConfig.SPEC, "thatsjustpeachy-common.toml");
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ComposterBlock.COMPOSTABLES.put(TJPItems.PEACH_PIT.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(TJPItems.PEACH.get(), 0.7F);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some dragn0007 code to dispatch IMC to another mod
        InterModComms.sendTo("thatsjustpeachy", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // Some dragn0007 code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
