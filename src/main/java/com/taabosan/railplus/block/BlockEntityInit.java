package com.taabosan.railplus.block;

import com.taabosan.railplus.RailPlus;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, RailPlus.MOD_ID);

    public static final Supplier<BlockEntityType<InvisibleButtonBlockEntity>> INVISIBLE_BUTTON = BLOCK_ENTITY_TYPES.register("invisible_button",
            () -> BlockEntityType.Builder.of(InvisibleButtonBlockEntity::new,
                    BlockInit.INVISIBLE_BUTTON.get()).build(null));
}
