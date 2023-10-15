package com.dragn0007.thatsjustpeachy.block.custom.vox;


import com.dragn0007.thatsjustpeachy.block.custom.DecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PeachLanternVox extends DecorRotator {

    public PeachLanternVox() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(7.4999999999999964, 13, 7.424999999999998, 8.499999999999998, 16, 8.425),
            Block.box(6.454124999999998, 6.49, 6.312874999999999, 9.434124999999998, 13.902749999999997, 9.538125),
            Block.box(4.9641249999999975, 7.98, 6.450125000000002, 10.924124999999998, 13.939999999999998, 9.400875),
            Block.box(3.474124999999998, 9.469999999999999, 6.487375000000002, 12.414124999999999, 12.45, 9.363624999999999)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(7.4723124999999975, 13, 7.4531874999999985, 8.472312500000001, 16, 8.4531875),
            Block.box(6.359187499999997, 6.49, 6.4073125, 9.5844375, 13.902749999999997, 9.3873125),
            Block.box(6.496437499999999, 7.98, 4.9173124999999995, 9.447187499999997, 13.939999999999998, 10.8773125),
            Block.box(6.533687499999999, 9.469999999999999, 3.4273125, 9.409937499999996, 12.45, 12.3673125)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(7.4999999999999964, 13, 7.424999999999998, 8.499999999999998, 16, 8.425),
            Block.box(6.454124999999998, 6.49, 6.312874999999999, 9.434124999999998, 13.902749999999997, 9.538125),
            Block.box(4.9641249999999975, 7.98, 6.450125000000002, 10.924124999999998, 13.939999999999998, 9.400875),
            Block.box(3.474124999999998, 9.469999999999999, 6.487375000000002, 12.414124999999999, 12.45, 9.363624999999999)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(7.4723124999999975, 13, 7.4531874999999985, 8.472312500000001, 16, 8.4531875),
            Block.box(6.359187499999997, 6.49, 6.4073125, 9.5844375, 13.902749999999997, 9.3873125),
            Block.box(6.496437499999999, 7.98, 4.9173124999999995, 9.447187499999997, 13.939999999999998, 10.8773125),
            Block.box(6.533687499999999, 9.469999999999999, 3.4273125, 9.409937499999996, 12.45, 12.3673125)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
