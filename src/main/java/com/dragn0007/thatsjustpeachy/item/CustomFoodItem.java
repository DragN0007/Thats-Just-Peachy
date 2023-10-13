package com.dragn0007.thatsjustpeachy.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class CustomFoodItem extends Item {

    public MobEffectInstance[] effectInstances;

    public CustomFoodItem(MobEffectInstance... effectInstances) {
        super(new Properties().craftRemainder(Items.GLASS_BOTTLE).tab(ModItemGroup.GROUP));
        this.effectInstances = effectInstances;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_EAT;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.EAT;
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
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);

    }
}

