package com.dragn0007.thatsjustpeachy.event;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = ThatsJustPeachy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ThatsJustPeachyEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PEACH_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PEACH_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PAPER_LANTERN.get(), RenderType.cutout());

    }
}




