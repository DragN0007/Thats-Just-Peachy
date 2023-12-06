package com.dragn0007.thatsjustpeachy.item;


import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.TJPBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class TJPItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThatsJustPeachy.MODID);


    //Food
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(TJPItemGroup.GROUP)));
    public static final RegistryObject<Item> PEACH_CAKE = ITEMS.register("peach_cake",
            () -> new ItemNameBlockItem(TJPBlocks.PEACH_CAKE.get(), (new Item.Properties().tab(TJPItemGroup.GROUP))));
    public static final RegistryObject<Item> PEACH_JAM = ITEMS.register("peach_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(TJPItemGroup.GROUP)));
    public static final RegistryObject<Item> PEACH_TOAST = ITEMS.register("peach_toast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(TJPItemGroup.GROUP)));
    public static final RegistryObject<Item> PEACH_PIE = ITEMS.register("peach_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build()).tab(TJPItemGroup.GROUP)));
    public static final RegistryObject<Item> PEACH_ICECREAM = ITEMS.register("peach_icecream",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build()).tab(TJPItemGroup.GROUP)));
    public static final RegistryObject<Item> PEACH_PIT = ITEMS.register("peach_pit",
            () -> new ItemNameBlockItem(TJPBlocks.PEACH_SAPLING.get(), (new Item.Properties().tab(TJPItemGroup.GROUP))));


    //Drinks
    public static final RegistryObject<Item> PEACH_TEA = ITEMS.register("peach_tea",
            () -> new CustomDrinkItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false)
            ));
    public static final RegistryObject<Item> PEACH_BOBA = ITEMS.register("peach_boba",
            () -> new BobaItem(
                    new MobEffectInstance(MobEffects.JUMP, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false)
            ));
    public static final RegistryObject<Item> PEACH_JUICE = ITEMS.register("peach_juice",
            () -> new CustomDrinkItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 1, true, false)
            ));


    //IMMORTAL PEACH
    public static final RegistryObject<Item> IMMORTAL_PEACH = ITEMS.register("immortal_peach",
            () -> new CustomRareFoodItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 6000, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 6000, 1, true, false),
                    new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 1, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 6000, 1, true, false)
            ));


    public static final RegistryObject<Item> MODGROUP = ITEMS.register("modgroup",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}