package com.taabosan.railplus.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class PoweredPavingStoneBlock extends Block {

    public PoweredPavingStoneBlock(Properties properties) {
        super(properties);
    }

    public boolean isSignalSource(BlockState state){
        return true;
    }

    public int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
        return direction == Direction.DOWN ? 15 : 0;
    }
}
