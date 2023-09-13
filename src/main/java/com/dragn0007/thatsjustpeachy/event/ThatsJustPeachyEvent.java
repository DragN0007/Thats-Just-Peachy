package com.dragn0007.thatsjustpeachy.event;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = ThatsJustPeachy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ThatsJustPeachyEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEACH_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEACH_SAPLING.get(), RenderType.cutout());

    }
}




