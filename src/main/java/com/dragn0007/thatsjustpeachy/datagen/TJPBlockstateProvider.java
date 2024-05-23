package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import com.dragn0007.thatsjustpeachy.block.TJPBlocksLootGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TJPBlockstateProvider extends BlockStateProvider {
    public TJPBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ThatsJustPeachy.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        doorBlock((DoorBlock) TJPBlocksLootGen.ACACIA_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/acacia_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/acacia_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.BIRCH_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/birch_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/birch_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.DARK_OAK_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/dark_oak_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/dark_oak_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.JUNGLE_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/jungle_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/jungle_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.OAK_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/oak_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/oak_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.SPRUCE_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/spruce_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/spruce_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.WARPED_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/warped_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/warped_peach_door_top"));

        doorBlock((DoorBlock) TJPBlocksLootGen.CRIMSON_PEACH_DOOR.get(), new ResourceLocation(ThatsJustPeachy.MODID, "block/crimson_peach_door_bottom"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/crimson_peach_door_top"));

        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.ACACIA_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.BIRCH_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.DARK_OAK_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.JUNGLE_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.OAK_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.SPRUCE_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.CRIMSON_PEACH_TRAPDOOR.get()), true);
        trapdoorBlock((TrapDoorBlock) TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get(), blockTexture(TJPBlocksLootGen.WARPED_PEACH_TRAPDOOR.get()), true);

        paneBlock((IronBarsBlock) TJPBlocks.FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.PEACH_STAINED_GLASS_PANE.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/peach_stained_glass"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/peach_stained_glass_pane_top"));

        paneBlock((IronBarsBlock) TJPBlocks.PEACH_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/peach_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.BLACK_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/black_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.BLUE_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/blue_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.BROWN_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/brown_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.CYAN_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/cyan_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.GRAY_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/gray_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.GREEN_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/green_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.LIGHT_BLUE_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/light_blue_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.LIGHT_GRAY_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/light_gray_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.LIME_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/lime_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.MAGENTA_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/magenta_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.ORANGE_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/orange_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.PINK_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/pink_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.PURPLE_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/purple_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.RED_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/red_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.WHITE_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/white_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

        paneBlock((IronBarsBlock) TJPBlocks.YELLOW_STAINED_FANCY_PEACH_WINDOW.get(),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/yellow_stained_fancy_peach_window"),
                new ResourceLocation(ThatsJustPeachy.MODID, "block/fancy_peach_window_top"));

    }

}
