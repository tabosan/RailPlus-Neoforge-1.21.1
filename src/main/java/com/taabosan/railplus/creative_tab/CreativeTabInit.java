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
                output.accept(ItemInit.RUSTED_RAIL);
                output.accept(ItemInit.RUSTED_RAIL_BUNDLE);
                output.accept(ItemInit.RUSTED_RAIL_STACK);

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

                output.accept(BlockInit.STONE_HARDENED_BRICKS);
                output.accept(BlockInit.COBBLESTONE_HARDENED_BRICKS);
                output.accept(BlockInit.NETHERRACK_HARDENED_BRICKS);
                output.accept(BlockInit.NETHER_HARDENED_BRICKS);
                output.accept(BlockInit.SANDSTONE_HARDENED_BRICKS);
                output.accept(BlockInit.RED_SANDSTONE_HARDENED_BRICKS);
                output.accept(BlockInit.GRANITE_HARDENED_BRICKS);
                output.accept(BlockInit.DIORITE_HARDENED_BRICKS);
                output.accept(BlockInit.ANDESITE_HARDENED_BRICKS);
                output.accept(BlockInit.BASALT_HARDENED_BRICKS);
                output.accept(BlockInit.QUARTZ_HARDENED_BRICKS);
                output.accept(BlockInit.BLACK_QUARTZ_HARDENED_BRICKS);
                output.accept(BlockInit.NETHER_WART_HARDENED_BRICKS);
                output.accept(BlockInit.RED_NETHER_HARDENED_BRICKS);
                output.accept(BlockInit.ICE_HARDENED_BRICKS);
                output.accept(BlockInit.SNOW_HARDENED_BRICKS);

                output.accept(BlockInit.OAK_BOOKSHELF);
                output.accept(BlockInit.SPRUCE_BOOKSHELF);
                output.accept(BlockInit.BIRCH_BOOKSHELF);
                output.accept(BlockInit.JUNGLE_BOOKSHELF);
                output.accept(BlockInit.ACACIA_BOOKSHELF);
                output.accept(BlockInit.CHERRY_BOOKSHELF);
                output.accept(BlockInit.DARK_OAK_BOOKSHELF);
                output.accept(BlockInit.MANGROVE_BOOKSHELF);
                output.accept(BlockInit.CRIMSON_BOOKSHELF);
                output.accept(BlockInit.WARPED_BOOKSHELF);

                output.accept(BlockInit.IRON_FLOOR);
                output.accept(BlockInit.DIAMOND_FLOOR);
                output.accept(BlockInit.EMERALD_FLOOR);

                output.accept(BlockInit.IRON_BRICKS);
                output.accept(BlockInit.GOLD_BRICKS);

                output.accept(BlockInit.STONE_PAVEMENT);
                output.accept(BlockInit.SANDSTONE_PAVEMENT);

                output.accept(BlockInit.PAVING_GRAVEL);
                output.accept(BlockInit.PAVING_GRAVEL_STAIRS);
                output.accept(BlockInit.PAVING_GRAVEL_SLAB);
                output.accept(BlockInit.PAVING_STONE);
                output.accept(BlockInit.POWERED_PAVING_STONE);
                output.accept(BlockInit.PAVING_STONE_STAIRS);
                output.accept(BlockInit.PAVING_STONE_SLAB);

                output.accept(BlockInit.SLAB_RAIL);
                output.accept(BlockInit.POWERED_SLAB_RAIL);
                output.accept(BlockInit.DETECTOR_SLAB_RAIL);
                output.accept(BlockInit.ACTIVATOR_SLAB_RAIL);

                output.accept(BlockInit.RED_CACTUS);

                output.accept(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE);
                output.accept(BlockInit.WHITE_RAILROAD_CROSSING_FENCE);
            }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
