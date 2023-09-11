package com.dragn0007.thatsjustpeachy.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {

    public static final CreativeModeTab GROUP = new CreativeModeTab("PeachModTab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PEACH.get());
        }
    };

}
