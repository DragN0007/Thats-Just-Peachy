package com.dragn0007.thatsjustpeachy.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class BobaItem extends Item {

    public MobEffectInstance[] effectInstances;

    public BobaItem(MobEffectInstance... effectInstances) {
        super(new Properties().craftRemainder(Items.GLASS_BOTTLE).food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.GROUP));
        this.effectInstances = effectInstances;
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 32;
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerEntity, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, playerEntity, hand);
    }
        @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if (!pLevel.isClientSide) {
            for (int i = 0; i < effectInstances.length; i++) {
                pLivingEntity.addEffect(effectInstances[i]);
            }
            pLivingEntity.getItemInHand(InteractionHand.MAIN_HAND).shrink(1);
        }
        if (pLivingEntity instanceof Player player) {
            if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
                player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(Items.GLASS_BOTTLE));
            } else if (!player.getInventory().add(new ItemStack(Items.GLASS_BOTTLE))) {
                player.drop(new ItemStack(Items.GLASS_BOTTLE), false);
            }

        }
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);

    }
}

