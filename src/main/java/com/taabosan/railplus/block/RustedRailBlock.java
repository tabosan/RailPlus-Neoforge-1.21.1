package com.taabosan.railplus.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RustedRailBlock extends RailBlock {
    private final float SPEED_MULTIPLIER;

    public RustedRailBlock(Properties p_55395_, float speedMultiplier) {
        super(p_55395_);
        this.SPEED_MULTIPLIER = speedMultiplier;
    }

    @Override
    public float getRailMaxSpeed(BlockState state, Level level, BlockPos pos, AbstractMinecart cart){
        float base = super.getRailMaxSpeed(state, level, pos, cart);
        return base * this.SPEED_MULTIPLIER;
    }
}
