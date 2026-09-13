package com.dragn0007.thatsjustpeachy.items;

import com.dragn0007.dragncrops.items.custom.*;
import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.blocks.TJPBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TJPItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThatsJustPeachy.MODID);

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build())));
    
    public static final RegistryObject<Item> PEACH_JAM = ITEMS.register("peach_jam",
            () -> new ShiftPlaceableItem(TJPBlocks.PEACH_JAM.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 0.8F).build()))));
    
    public static final RegistryObject<Item> PEACH_TART = ITEMS.register("peach_tart",
            () -> new PlaceablePixelPlacerItem(TJPBlocks.PEACH_TART.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F).build()))));
    
    public static final RegistryObject<Item> PEACH_CANDY = ITEMS.register("peach_candy",
            () -> new ShiftPlaceableItem(TJPBlocks.PEACH_CANDY.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.8F).build()))));
    
    public static final RegistryObject<Item> PEACH_GELATIN = ITEMS.register("peach_gelatin",
            () -> new ShiftPlaceableItem(TJPBlocks.PEACH_GELATIN.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1), 0.8F).build()))));
    
    public static final RegistryObject<Item> UNFERMENTED_PEACH_MEAD = ITEMS.register("unfermented_peach_mead",
            () -> new ShiftPlaceableDrinkItem(TJPBlocks.UNFERMENTED_PEACH_MEAD.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 0.8F)
                            .build()))));
    public static final RegistryObject<Item> PEACH_MEAD = ITEMS.register("peach_mead",
            () -> new ShiftPlaceableDrinkItem(TJPBlocks.PEACH_MEAD.get(), (new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.8F)
                            .build()))));

    public static final RegistryObject<Item> PEACH_COCKTAIL = ITEMS.register("peach_cocktail",
            () -> new DrinkItem((new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8F)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F)
                            .build()))));
    
    public static final RegistryObject<Item> PEACH_PIE = ITEMS.register("peach_pie",
            () -> new Item((new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.3F)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.8F)
                            .build()))));

    public static final RegistryObject<Item> PEACH_TEA = ITEMS.register("peach_tea",
            () -> new TeaItem((new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8F)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F)
                            .build()))));
    
    public static final RegistryObject<Item> PEACH_MOONSHINE = ITEMS.register("peach_moonshine",
            () -> new MoonshineItem((new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8F)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 0.8F)
                            .effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 0.8F)
                            .build()))));

    public static final RegistryObject<Item> PEACH_LOGO = ITEMS.register("peach_logo", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}