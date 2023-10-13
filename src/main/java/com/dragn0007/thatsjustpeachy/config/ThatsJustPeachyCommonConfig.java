package com.dragn0007.thatsjustpeachy.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ThatsJustPeachyCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Float> TREE_WEIGHT;






    static {
        BUILDER.push("Configs for That's Just Peachy!");

        TREE_WEIGHT = BUILDER.comment("How often should the Peach Trees spawn? Default is 0.5F - Be careful, may cause server to crash when changed (If it does, just set it back to default).")
                .define("Peach Tree Spawn Weight", 0.5F);



        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
