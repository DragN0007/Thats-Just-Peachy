package com.dragn0007.thatsjustpeachy.util;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TJPTags {
//    public static class Blocks {
//        public static final TagKey<Block> MUSHROOM =
//                tag("mushroom");
//
//        private static TagKey<Block> tag (String name) {
//            return BlockTags.create(new ResourceLocation(MedievalEmbroidery.MODID, name));
//        }
//        private static TagKey<Block> forgeTag (String name) {
//            return BlockTags.create(new ResourceLocation("forge", name));
//        }
//    }

    public static class Items {
        public static final TagKey<Item> MILK = forgeTag("milk");
        public static final TagKey<Item> LEAVES = forgeTag("leaves");
        public static final TagKey<Item> EGG = forgeTag("egg");
        public static final TagKey<Item> PEACH = forgeTag("peach");

        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(ThatsJustPeachy.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
