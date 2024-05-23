package com.dragn0007.thatsjustpeachy.block.custom.vox;


import com.dragn0007.thatsjustpeachy.block.custom.DecorRotator;
import com.dragn0007.thatsjustpeachy.block.custom.WoodenDecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class BedsideCabinetVox extends WoodenDecorRotator {

    public BedsideCabinetVox() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(1, 3, 1, 15, 7, 2),
            Block.box(1, 8, 1, 15, 12, 2),
            Block.box(0, 2, 2, 16, 14, 16),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(0, 0, 0, 16, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(14, 3, 1, 15, 7, 15),
            Block.box(14, 8, 1, 15, 12, 15),
            Block.box(0, 2, 0, 14, 14, 16),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(0, 0, 0, 16, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(1, 3, 14, 15, 7, 15),
            Block.box(1, 8, 14, 15, 12, 15),
            Block.box(0, 2, 0, 16, 14, 14),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(0, 0, 0, 16, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(1, 3, 1, 2, 7, 15),
            Block.box(1, 8, 1, 2, 12, 15),
            Block.box(2, 2, 0, 16, 14, 16),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(0, 0, 0, 16, 2, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
