package com.taabosan.railplus.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.util.TriState;

import java.util.Iterator;

public class RedCactusBlock extends CactusBlock {

    public RedCactusBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Iterator var4 = Direction.Plane.HORIZONTAL.iterator();

        Direction direction;
        BlockState blockstate;
        do {
            if (!var4.hasNext()) {
                BlockState blockstate1 = level.getBlockState(pos.below());
                TriState soilDecision = blockstate1.canSustainPlant(level, pos.below(), Direction.UP, state);
                if (!soilDecision.isDefault()) {
                    return soilDecision.isTrue();
                }

                return (blockstate1.is(BlockInit.RED_CACTUS) || blockstate1.is(Blocks.NETHERRACK)) && !level.getBlockState(pos.above()).liquid();
            }

            direction = (Direction)var4.next();
            blockstate = level.getBlockState(pos.relative(direction));
        } while(!blockstate.isSolid() && !level.getFluidState(pos.relative(direction)).is(FluidTags.LAVA));

        return false;
    }
}
