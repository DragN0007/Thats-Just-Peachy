package com.dragn0007.thatsjustpeachy.event;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import com.dragn0007.thatsjustpeachy.datagen.biglooter.TJPBlockLootTables;
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


        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.ACACIA_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.BIRCH_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.DARK_OAK_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.JUNGLE_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.OAK_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.SPRUCE_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.WARPED_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.CRIMSON_PEACH_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PEACH_STAINED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PEACH_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.BLACK_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.BLUE_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.BROWN_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.CYAN_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.GREEN_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.GRAY_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.LIGHT_BLUE_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.LIGHT_GRAY_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.LIME_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.MAGENTA_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.ORANGE_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.PINK_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.RED_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.WHITE_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TJPBlocks.YELLOW_STAINED_FANCY_PEACH_WINDOW.get(), RenderType.translucent());
    }
}




