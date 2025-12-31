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

import static com.taabosan.railplus.block.BlockInit.FRAMED_LAMPS;
import static com.taabosan.railplus.block.BlockInit.FRAMED_LAMP_SLABS;
import static com.taabosan.railplus.block.BlockInit.HARDENED_BRICKS;
import static com.taabosan.railplus.block.BlockInit.HARDENED_BRICKS_SLABS;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RailPlus.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RAIL_PLUS_TAB = CREATIVE_MODE_TABS.register("rail_plus_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.rail_plus.rail_plus"))
            .icon(() -> ItemInit.ENDER_STEEL_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemInit.RUSTED_TRACK);
                output.accept(ItemInit.RUSTED_TRACK_BUNDLE);
                output.accept(ItemInit.RUSTED_TRACK_STACK);

                output.accept(ItemInit.ENDER_DUST);
                output.accept(ItemInit.ENDER_STEEL_INGOT);
                output.accept(ItemInit.ENDER_PLATE);

                output.accept(BlockInit.ENDER_STEEL_BLOCK);

                output.accept(BlockInit.INVISIBLE_BUTTON);

                output.accept(BlockInit.FLAT_LAMP);
                output.accept(BlockInit.SQUARE_LAMP);

                FRAMED_LAMPS.values().forEach(output::accept);
                FRAMED_LAMP_SLABS.values().forEach(output::accept);

                HARDENED_BRICKS.values().forEach(output::accept);
                HARDENED_BRICKS_SLABS.values().forEach(output::accept);

                output.accept(BlockInit.BONE_TILE);
                output.accept(BlockInit.CREAM_BONE_TILE);
                output.accept(BlockInit.IVORY_BONE_TILE);
                output.accept(BlockInit.BEIGE_BONE_TILE);
                output.accept(BlockInit.SMOOTH_BONE_TILE);
                output.accept(BlockInit.CREAM_SMOOTH_BONE_TILE);
                output.accept(BlockInit.IVORY_SMOOTH_BONE_TILE);
                output.accept(BlockInit.BEIGE_SMOOTH_BONE_TILE);
                output.accept(BlockInit.KHAKI_SMOOTH_BONE_TILE);
                output.accept(BlockInit.BLUE_SMOOTH_BONE_TILE);
                output.accept(BlockInit.WHITE_SMOOTH_BONE_TILE);
                output.accept(BlockInit.GRAY_SMOOTH_BONE_TILE);

                output.accept(BlockInit.OAK_BOOKSHELF);
                output.accept(BlockInit.SPRUCE_BOOKSHELF);
                output.accept(BlockInit.BIRCH_BOOKSHELF);
                output.accept(BlockInit.JUNGLE_BOOKSHELF);
                output.accept(BlockInit.ACACIA_BOOKSHELF);
                output.accept(BlockInit.CHERRY_BOOKSHELF);
                output.accept(BlockInit.DARK_OAK_BOOKSHELF);
                output.accept(BlockInit.MANGROVE_BOOKSHELF);
                output.accept(BlockInit.BAMBOO_BOOKSHELF);
                output.accept(BlockInit.CRIMSON_BOOKSHELF);
                output.accept(BlockInit.WARPED_BOOKSHELF);

                output.accept(BlockInit.OAK_LADDER);
                output.accept(BlockInit.SPRUCE_LADDER);
                output.accept(BlockInit.BIRCH_LADDER);
                output.accept(BlockInit.JUNGLE_LADDER);
                output.accept(BlockInit.ACACIA_LADDER);
                output.accept(BlockInit.CHERRY_LADDER);
                output.accept(BlockInit.DARK_OAK_LADDER);
                output.accept(BlockInit.MANGROVE_LADDER);
                output.accept(BlockInit.BAMBOO_LADDER);
                output.accept(BlockInit.CRIMSON_LADDER);
                output.accept(BlockInit.WARPED_LADDER);
                output.accept(BlockInit.IRON_LADDER);

                output.accept(BlockInit.WHITE_VENDING_MACHINE);
                output.accept(BlockInit.RED_VENDING_MACHINE);
                output.accept(BlockInit.BLUE_VENDING_MACHINE);
                output.accept(BlockInit.ORANGE_VENDING_MACHINE);
                output.accept(BlockInit.GREEN_VENDING_MACHINE);
                output.accept(BlockInit.LIME_VENDING_MACHINE);
                output.accept(BlockInit.YELLOW_VENDING_MACHINE);
                output.accept(BlockInit.LOCKER);

                output.accept(BlockInit.WHITE_SAND);
                output.accept(BlockInit.WHITE_SAND_SLAB);

                output.accept(BlockInit.DARK_EARTHEN_WALL);
                output.accept(BlockInit.DARK_EARTHEN_WALL_SLAB);

                output.accept(BlockInit.BROWN_EARTHEN_WALL);
                output.accept(BlockInit.BROWN_EARTHEN_WALL_SLAB);

                output.accept(BlockInit.LIGHT_EARTHEN_WALL);
                output.accept(BlockInit.LIGHT_EARTHEN_WALL_SLAB);

                output.accept(BlockInit.GRAVELLY_SOIL);
                output.accept(BlockInit.GRAVELLY_SOIL_SLAB);

                output.accept(BlockInit.IRON_FLOOR);
                output.accept(BlockInit.IRON_FLOOR_SLAB);

                output.accept(BlockInit.DIAMOND_FLOOR);
                output.accept(BlockInit.EMERALD_FLOOR);

                output.accept(BlockInit.IRON_BRICKS);
                output.accept(BlockInit.IRON_BRICKS_SLAB);

                output.accept(BlockInit.GOLD_BRICKS);
                output.accept(BlockInit.GOLD_BRICKS_SLAB);

                output.accept(BlockInit.STONE_PAVEMENT);
                output.accept(BlockInit.STONE_PAVEMENT_SLAB);

                output.accept(BlockInit.BEDROCK_PAVEMENT);
                output.accept(BlockInit.BEDROCK_PAVEMENT_SLAB);

                output.accept(BlockInit.SANDSTONE_PAVEMENT);
                output.accept(BlockInit.SANDSTONE_PAVEMENT_SLAB);

                output.accept(BlockInit.SHIKKUI);
                output.accept(BlockInit.TATAMI);
                output.accept(BlockInit.GREEN_TATAMI);
                output.accept(BlockInit.BROWN_TATAMI);

                output.accept(BlockInit.DITCH);

                output.accept(BlockInit.STATION_EDGE);

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

                output.accept(BlockInit.SLIGHTLY_RUSTED_RAIL);
                output.accept(BlockInit.RUSTED_RAIL);
                output.accept(BlockInit.HEAVILY_RUSTED_RAIL);
                output.accept(BlockInit.RUINED_RAIL);

                output.accept(BlockInit.RED_CACTUS);

                output.accept(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE);
                output.accept(BlockInit.WHITE_RAILROAD_CROSSING_FENCE);
            }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
