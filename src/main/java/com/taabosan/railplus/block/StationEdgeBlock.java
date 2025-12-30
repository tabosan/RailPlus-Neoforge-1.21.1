package com.taabosan.railplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StationEdgeBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<StationEdgeBlock> CODEC = simpleCodec(StationEdgeBlock::new);

    public MapCodec<? extends StationEdgeBlock> codec() {return CODEC;}

    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(0, 0, 8, 16, 8, 16),
            Block.box(0, 8, 0, 16, 16, 16)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(0, 0, 0, 16, 8, 8),
            Block.box(0, 8, 0, 16, 16, 16)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(8, 0, 0, 16, 8, 16),
            Block.box(0, 8, 0, 16, 16, 16)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 0, 0, 8, 8, 16),
            Block.box(0, 8, 0, 16, 16, 16)
    );

    protected StationEdgeBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return switch (state.getValue(FACING)){
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case WEST -> SHAPE_WEST;
            case EAST -> SHAPE_EAST;
            default -> SHAPE_NORTH;
        };
    }
}
