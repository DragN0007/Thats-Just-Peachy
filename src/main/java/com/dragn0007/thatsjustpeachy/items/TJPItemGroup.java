package com.dragn0007.thatsjustpeachy.items;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TJPItemGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThatsJustPeachy.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("tjp",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TJPItems.PEACH_LOGO.get())).title(Component.translatable("itemGroup.tjp"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(TJPItems.PEACH.get());
                        output.accept(TJPItems.PEACH_JAM.get());
                        output.accept(TJPItems.PEACH_TART.get());
                        output.accept(TJPItems.PEACH_CANDY.get());
                        output.accept(TJPItems.PEACH_GELATIN.get());
                        output.accept(TJPItems.UNFERMENTED_PEACH_MEAD.get());
                        output.accept(TJPItems.PEACH_MEAD.get());
                        output.accept(TJPItems.PEACH_COCKTAIL.get());
                        output.accept(TJPItems.PEACH_PIE.get());
                        output.accept(TJPItems.PEACH_TEA.get());
                        output.accept(TJPItems.PEACH_MOONSHINE.get());
                        output.accept(TJPBlocks.PEACH_LOG.get());
                        output.accept(TJPBlocks.STRIPPED_PEACH_LOG.get());
                        output.accept(TJPBlocks.PEACH_WOOD.get());
                        output.accept(TJPBlocks.STRIPPED_PEACH_WOOD.get());
                        output.accept(TJPBlocks.PEACH_PLANKS.get());
                        output.accept(TJPBlocks.PEACH_LEAVES.get());
                        output.accept(TJPBlocks.PEACH_SAPLING.get().asItem().getDefaultInstance());
                        output.accept(TJPBlocks.PEACH_STAIRS.get());
                        output.accept(TJPBlocks.PEACH_SLAB.get());
                        output.accept(TJPBlocks.PEACH_FENCE.get());
                        output.accept(TJPBlocks.PEACH_FENCE_GATE.get());
                        output.accept(TJPBlocks.PEACH_DOOR.get());
                        output.accept(TJPBlocks.PEACH_TRAPDOOR.get());
                        for (TJPBlocks.Woods color : TJPBlocks.Woods.values()) {output.accept(TJPBlocks.DOORS.get(color).get());}
                        output.accept(TJPBlocks.PEACH_PAPER_LANTERN.get());
                        for (DyeColor color : DyeColor.values()) {output.accept(TJPBlocks.PAPER_LANTERNS.get(color).get());}
                        output.accept(TJPBlocks.PEACH_LANTERN.get());
                        for (DyeColor color : DyeColor.values()) {output.accept(TJPBlocks.PEACH_LANTERNS.get(color).get());}

                        output.accept(TJPBlocks.PEACH_FRAMED_GLASS.get());
                        for (DyeColor color : DyeColor.values()) {output.accept(TJPBlocks.PEACH_FRAMED_GLASSES.get(color).get());}
                        output.accept(TJPBlocks.PEACH_FRAMED_GLASS_PANE.get());
                        for (DyeColor color : DyeColor.values()) {output.accept(TJPBlocks.PEACH_FRAMED_PANES.get(color).get());}
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


