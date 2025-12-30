package com.taabosan.railplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FlatLampBlock extends FaceAttachedHorizontalDirectionalBlock {
    public static final MapCodec<FlatLampBlock> CODEC = simpleCodec(FlatLampBlock::new);

    private static final VoxelShape FLOOR = Block.box(3, 0, 3, 13, 2, 13);
    private static final VoxelShape CEILING = Block.box(3, 14, 3, 13, 16, 13);
    private static final VoxelShape WALL_NORTH = Block.box(3, 3, 14, 13, 13, 16);
    private static final VoxelShape WALL_SOUTH = Block.box(3, 3, 0, 13, 13, 2);
    private static final VoxelShape WALL_WEST = Block.box(14, 3, 3, 16, 13, 13);
    private static final VoxelShape WALL_EAST = Block.box(0, 3, 3, 2, 13, 13);

    public MapCodec<? extends FlatLampBlock> codec() {return CODEC;}

    public FlatLampBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACE, AttachFace.FLOOR).setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        AttachFace face = state.getValue(FACE);
        Direction dir = state.getValue(FACING);

        return switch(face) {
            case FLOOR -> FLOOR;
            case CEILING -> CEILING;
            case WALL -> switch (dir){
                case NORTH -> WALL_NORTH;
                case SOUTH -> WALL_SOUTH;
                case EAST -> WALL_EAST;
                case WEST -> WALL_WEST;
                default -> FLOOR;
            };
        };
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, FACE});
    }
}
