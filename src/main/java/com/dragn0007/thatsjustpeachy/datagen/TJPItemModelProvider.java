package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TJPItemModelProvider extends ItemModelProvider {
    public TJPItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ThatsJustPeachy.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(TJPItems.PEACH_SODA.get());
        simpleItem(TJPItems.PEACH_PASTRY.get());

    }

     private ItemModelBuilder simpleSpriteBlockItem(Block block) {
        return withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"block/" + block.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ThatsJustPeachy.MODID,"item/" + item.getRegistryName().getPath()));
    }
}