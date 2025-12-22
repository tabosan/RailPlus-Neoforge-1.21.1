package com.taabosan.railplus.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class InvisibleButtonBlockEntity extends BlockEntity {
    private final Item buttonItem;

    public InvisibleButtonBlockEntity(BlockPos pos, BlockState blockState) {
        super(BlockEntityInit.INVISIBLE_BUTTON.get(), pos, blockState);
        this.buttonItem = BlockInit.INVISIBLE_BUTTON.get().asItem();
    }

    public Item getButtonItem() {
        return buttonItem;
    }
}
