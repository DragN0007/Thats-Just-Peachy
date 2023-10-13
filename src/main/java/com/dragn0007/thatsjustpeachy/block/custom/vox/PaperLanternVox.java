package com.dragn0007.thatsjustpeachy.block.custom.vox;


import com.dragn0007.thatsjustpeachy.block.custom.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PaperLanternVox extends DecorRotator {

    public PaperLanternVox() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(6, 6, 6, 10, 7, 10),
            Block.box(6, 13, 6, 10, 14, 10),
            Block.box(7.499999999999999, 14, 7.499999999999999, 8.500000000000002, 16, 8.500000000000002),
            Block.box(4.7, 7, 4.7, 11.3, 13, 11.3),
            Block.box(7, 3, 8, 9, 6, 8),
            Block.box(8, 3, 7, 8, 6, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(6, 6, 6, 10, 7, 10),
            Block.box(6, 13, 6, 10, 14, 10),
            Block.box(7.499999999999999, 14, 7.499999999999999, 8.500000000000002, 16, 8.500000000000002),
            Block.box(4.7, 7, 4.7, 11.3, 13, 11.3),
            Block.box(7, 3, 8, 9, 6, 8),
            Block.box(8, 3, 7, 8, 6, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(6, 6, 6, 10, 7, 10),
            Block.box(6, 13, 6, 10, 14, 10),
            Block.box(7.499999999999999, 14, 7.499999999999999, 8.500000000000002, 16, 8.500000000000002),
            Block.box(4.7, 7, 4.7, 11.3, 13, 11.3),
            Block.box(7, 3, 8, 9, 6, 8),
            Block.box(8, 3, 7, 8, 6, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(6, 6, 6, 10, 7, 10),
            Block.box(6, 13, 6, 10, 14, 10),
            Block.box(7.499999999999999, 14, 7.499999999999999, 8.500000000000002, 16, 8.500000000000002),
            Block.box(4.7, 7, 4.7, 11.3, 13, 11.3),
            Block.box(7, 3, 8, 9, 6, 8),
            Block.box(8, 3, 7, 8, 6, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
