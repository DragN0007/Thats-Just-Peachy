package com.dragn0007.thatsjustpeachy.datagen;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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
        ResourceLocation registryName = Registry.BLOCK.getKey(block);
        if (registryName != null) {
            String namespace = registryName.getNamespace();
            String path = registryName.getPath();
            return withExistingParent(path,
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(namespace, "block/" + path));
        } else {
            return null;
        }
    }


    private ItemModelBuilder simpleItem(Item item) {
        ResourceLocation registryName = Registry.ITEM.getKey(item);
        if (registryName != null) {
            String namespace = registryName.getNamespace();
            String path = registryName.getPath();
            return withExistingParent(path,
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(namespace, "item/" + path));
        } else {
            return null;
        }
    }

    private ItemModelBuilder handheldItem(Item item) {
        ResourceLocation registryName = Registry.ITEM.getKey(item);
        if (registryName != null) {
            String namespace = registryName.getNamespace();
            String path = registryName.getPath();
            return withExistingParent(path,
                    new ResourceLocation("item/handheld")).texture("layer0",
                    new ResourceLocation(namespace, "item/" + path));
        } else {
            return null;
        }
    }
}