package com.taabosan.railplus.block;

import com.taabosan.railplus.util.TagInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.PoweredRailBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PoweredSlabRailBlock extends PoweredRailBlock {
    public PoweredSlabRailBlock(Properties p_55218_, boolean isPoweredRail) {
        super(p_55218_, isPoweredRail);
    }

    public PoweredSlabRailBlock(Properties p_55218_) {
        super(p_55218_);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockState below = level.getBlockState(pos.below());
        return below.is(TagInit.Blocks.SLAB_RAIL_PLACEABLE) && canSupportRigidBlock(level, pos.below());
    }

    @Override
    public float getRailMaxSpeed(BlockState state, Level level, BlockPos pos, AbstractMinecart cart){
        float base = super.getRailMaxSpeed(state, level, pos, cart);
        return base * 1.5f;
    }
}
