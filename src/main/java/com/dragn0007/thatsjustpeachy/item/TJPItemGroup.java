package com.dragn0007.thatsjustpeachy.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TJPItemGroup {

    public static final CreativeModeTab GROUP = new CreativeModeTab("peachmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TJPItems.MODGROUP.get());
        }
    };

}
