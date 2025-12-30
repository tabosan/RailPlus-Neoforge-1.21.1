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
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModLadderBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<ModLadderBlock> CODEC = simpleCodec(ModLadderBlock::new);

    private static VoxelShape NORTH = Block.box(0,0,13,16,16,16);
    private static VoxelShape SOUTH = Block.box(0,0,0,16,16,3);
    private static VoxelShape WEST = Block.box(13,0,0,16,16,16);
    private static VoxelShape EAST = Block.box(0,0,0,3,16,16);

    public MapCodec<? extends ModLadderBlock> codec() {return CODEC;}

    public ModLadderBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return switch (state.getValue(FACING)){
            case NORTH -> NORTH;
            case SOUTH -> SOUTH;
            case WEST -> WEST;
            case EAST -> EAST;
            default -> NORTH;
        };
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }
}
