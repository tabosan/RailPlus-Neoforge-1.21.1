package com.taabosan.railplus.creative_tab;

import com.taabosan.railplus.RailPlus;
import com.taabosan.railplus.block.BlockInit;
import com.taabosan.railplus.item.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RailPlus.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RAIL_PLUS_TAB = CREATIVE_MODE_TABS.register("rail_plus_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.rail_plus.rail_plus"))
            .icon(() -> ItemInit.ENDER_STEEL_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemInit.ENDER_DUST);
                output.accept(ItemInit.ENDER_STEEL_INGOT);
                output.accept(ItemInit.ENDER_PLATE);

                output.accept(BlockInit.ENDER_STEEL_BLOCK);

                output.accept(BlockInit.WHITE_FRAMED_LAMP);
                output.accept(BlockInit.ORANGE_FRAMED_LAMP);
                output.accept(BlockInit.MAGENTA_FRAMED_LAMP);
                output.accept(BlockInit.LIGHT_BLUE_FRAMED_LAMP);
                output.accept(BlockInit.YELLOW_FRAMED_LAMP);
                output.accept(BlockInit.LIME_FRAMED_LAMP);
                output.accept(BlockInit.PINK_FRAMED_LAMP);
                output.accept(BlockInit.GRAY_FRAMED_LAMP);
                output.accept(BlockInit.LIGHT_GRAY_FRAMED_LAMP);
                output.accept(BlockInit.CYAN_FRAMED_LAMP);
                output.accept(BlockInit.PURPLE_FRAMED_LAMP);
                output.accept(BlockInit.BLUE_FRAMED_LAMP);
                output.accept(BlockInit.BROWN_FRAMED_LAMP);
                output.accept(BlockInit.GREEN_FRAMED_LAMP);
                output.accept(BlockInit.RED_FRAMED_LAMP);
                output.accept(BlockInit.BLACK_FRAMED_LAMP);

                output.accept(BlockInit.PAVING_GRAVEL);
                output.accept(BlockInit.PAVING_GRAVEL_STAIRS);
                output.accept(BlockInit.PAVING_GRAVEL_SLAB);
                output.accept(BlockInit.PAVING_STONE);
                output.accept(BlockInit.POWERED_PAVING_STONE);
                output.accept(BlockInit.PAVING_STONE_STAIRS);
                output.accept(BlockInit.PAVING_STONE_SLAB);

                output.accept(BlockInit.RED_CACTUS);

                output.accept(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE);
                output.accept(BlockInit.WHITE_RAILROAD_CROSSING_FENCE);
            }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
