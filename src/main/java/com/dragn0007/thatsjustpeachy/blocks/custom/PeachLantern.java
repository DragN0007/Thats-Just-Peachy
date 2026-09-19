package com.dragn0007.thatsjustpeachy.blocks.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PeachLantern extends Block {
    public PeachLantern() {
        super(Properties.of().mapColor(MapColor.WOOL).strength(0.2F).sound(SoundType.WOOL).lightLevel((p_50872_) -> 15));
    }

    public static final VoxelShape AABB = Stream.of(
            Block.box(3, 7, 3, 13, 16, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext context) {return AABB;}
}
