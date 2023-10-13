package com.dragn0007.thatsjustpeachy.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ThatsJustPeachyClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for That's Just Peachy!");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
