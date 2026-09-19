package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.dragncrops.CropOverhaul;
import com.dragn0007.dragncrops.items.COItems;
import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import com.dragn0007.thatsjustpeachy.blocks.custom.PeachLantern;
import com.dragn0007.thatsjustpeachy.items.TJPItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class TJPItemModelProvider extends ItemModelProvider {
    public TJPItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ThatsJustPeachy.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(TJPItems.PEACH_LOGO);
        simpleItem(TJPItems.PEACH);
        simpleItem(TJPItems.PEACH_JAM);
        simpleItem(TJPItems.PEACH_TART);
        simpleItem(TJPItems.PEACH_CANDY);
        simpleItem(TJPItems.PEACH_GELATIN);
        advancedItem(TJPItems.UNFERMENTED_PEACH_MEAD, "unfermented_mead");
        simpleItem(TJPItems.PEACH_MEAD);
        simpleItem(TJPItems.PEACH_COCKTAIL);
        simpleItem(TJPItems.PEACH_PIE);
        simpleItem(TJPItems.PEACH_TEA);
        simpleItem(TJPItems.PEACH_MOONSHINE);
        simpleSpriteBlock(TJPBlocks.PEACH_SAPLING);
        advancedSpriteBlock(TJPBlocks.PEACH_DOOR);
        withExistingParent("peach_log", modLoc("block/peach_log"));
        withExistingParent("stripped_peach_log", modLoc("block/stripped_peach_log"));
        withExistingParent("peach_wood", modLoc("block/peach_wood"));
        withExistingParent("stripped_peach_wood", modLoc("block/stripped_peach_wood"));
        withExistingParent("peach_leaves", modLoc("block/peach_leaves_stage3"));
        withExistingParent("peach_trapdoor", modLoc("block/peach_trapdoor_bottom"));
        for (TJPBlocks.Woods color : TJPBlocks.Woods.values()) {advancedDoorSpriteBlock(TJPBlocks.DOORS.get(color));}
        advancedBlockItem(TJPBlocks.PEACH_FRAMED_GLASS_PANE, "peach_framed_glass");
        for (DyeColor color : DyeColor.values()) {ironBarsSpriteBlock(TJPBlocks.PEACH_FRAMED_PANES.get(color),
                "peach_framed_" + color.getName().toLowerCase() + "_stained_glass");}
        withExistingParent("peach_framed_glass", modLoc("block/peach_framed_glass"));
        for (DyeColor color : DyeColor.values()) {withExistingParent("peach_framed_" + color.getName().toLowerCase() + "_stained_glass",
                modLoc("block/peach_framed_" + color.getName().toLowerCase() + "_stained_glass"));}
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"item/" + getTextureName));
    }
    public ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"block/" + item.getId().getPath()));
    }
    public ItemModelBuilder advancedBlockItem(RegistryObject<Block> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"block/" + getTextureName));
    }
    private ItemModelBuilder simpleSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"block/" + block.getId().getPath()));
    }
    private ItemModelBuilder advancedSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"item/" + block.getId().getPath()));
    }
    private ItemModelBuilder advancedDoorSpriteBlock(RegistryObject<DoorBlock> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"item/" + block.getId().getPath()));
    }
    public ItemModelBuilder ironBarsSpriteBlock(RegistryObject<IronBarsBlock> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"block/" + getTextureName))
                .renderType(new ResourceLocation("minecraft", "translucent"));
    }
}