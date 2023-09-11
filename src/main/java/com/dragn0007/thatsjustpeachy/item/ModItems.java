package com.dragn0007.thatsjustpeachy.item;


import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThatsJustPeachy.MODID);


    //Food
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(ModItemGroup.GROUP)));

    //Drinks
    public static final RegistryObject<Item> PEACH_TEA = ITEMS.register("peach_tea",
            () -> new CustomDrinkItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1, true, false)
            ));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}