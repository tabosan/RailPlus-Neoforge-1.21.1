package com.taabosan.railplus.datagen;

import com.taabosan.railplus.block.BlockInit;
import com.taabosan.railplus.block.FramedLampColor;
import com.taabosan.railplus.block.HardenedBricksType;
import com.taabosan.railplus.item.ItemInit;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(BlockInit.ENDER_STEEL_BLOCK.get());

        dropSelf(BlockInit.INVISIBLE_BUTTON.get());

        dropSelf(BlockInit.FLAT_LAMP.get());
        dropSelf(BlockInit.SQUARE_LAMP.get());

        for (FramedLampColor color : FramedLampColor.values()) {
            dropSelf(BlockInit.FRAMED_LAMPS.get(color).get());
            add(BlockInit.FRAMED_LAMP_SLABS.get(color).get(),
                    block -> createSlabItemTable(BlockInit.FRAMED_LAMP_SLABS.get(color).get()));
        }

        for (HardenedBricksType type : HardenedBricksType.values()) {
            dropSelf(BlockInit.HARDENED_BRICKS.get(type).get());
            add(BlockInit.HARDENED_BRICKS_SLABS.get(type).get(),
                    block -> createSlabItemTable(BlockInit.HARDENED_BRICKS_SLABS.get(type).get()));
        }

        dropSelf(BlockInit.BONE_TILE.get());
        dropSelf(BlockInit.CREAM_BONE_TILE.get());
        dropSelf(BlockInit.IVORY_BONE_TILE.get());
        dropSelf(BlockInit.BEIGE_BONE_TILE.get());
        dropSelf(BlockInit.SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.CREAM_SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.IVORY_SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.BEIGE_SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.KHAKI_SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.BLUE_SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.WHITE_SMOOTH_BONE_TILE.get());
        dropSelf(BlockInit.GRAY_SMOOTH_BONE_TILE.get());

        dropSelf(BlockInit.OAK_BOOKSHELF.get());
        dropSelf(BlockInit.SPRUCE_BOOKSHELF.get());
        dropSelf(BlockInit.BIRCH_BOOKSHELF.get());
        dropSelf(BlockInit.JUNGLE_BOOKSHELF.get());
        dropSelf(BlockInit.ACACIA_BOOKSHELF.get());
        dropSelf(BlockInit.CHERRY_BOOKSHELF.get());
        dropSelf(BlockInit.DARK_OAK_BOOKSHELF.get());
        dropSelf(BlockInit.MANGROVE_BOOKSHELF.get());
        dropSelf(BlockInit.BAMBOO_BOOKSHELF.get());
        dropSelf(BlockInit.CRIMSON_BOOKSHELF.get());
        dropSelf(BlockInit.WARPED_BOOKSHELF.get());

        dropSelf(BlockInit.OAK_LADDER.get());
        dropSelf(BlockInit.SPRUCE_LADDER.get());
        dropSelf(BlockInit.BIRCH_LADDER.get());
        dropSelf(BlockInit.JUNGLE_LADDER.get());
        dropSelf(BlockInit.ACACIA_LADDER.get());
        dropSelf(BlockInit.CHERRY_LADDER.get());
        dropSelf(BlockInit.DARK_OAK_LADDER.get());
        dropSelf(BlockInit.MANGROVE_LADDER.get());
        dropSelf(BlockInit.BAMBOO_LADDER.get());
        dropSelf(BlockInit.CRIMSON_LADDER.get());
        dropSelf(BlockInit.WARPED_LADDER.get());
        dropSelf(BlockInit.IRON_LADDER.get());

        add(BlockInit.WHITE_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.RED_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.BLUE_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.ORANGE_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.GREEN_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.LIME_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.YELLOW_VENDING_MACHINE.get(), this::createDoorTable);
        add(BlockInit.LOCKER.get(), this::createDoorTable);

        dropSelf(BlockInit.WHITE_SAND.get());
        dropSelf(BlockInit.DARK_EARTHEN_WALL.get());
        dropSelf(BlockInit.BROWN_EARTHEN_WALL.get());
        dropSelf(BlockInit.LIGHT_EARTHEN_WALL.get());
        dropSelf(BlockInit.GRAVELLY_SOIL.get());

        add(BlockInit.WHITE_SAND_SLAB.get(),
                block -> createSlabItemTable(BlockInit.WHITE_SAND_SLAB.get()));
        add(BlockInit.DARK_EARTHEN_WALL_SLAB.get(),
                block -> createSlabItemTable(BlockInit.DARK_EARTHEN_WALL_SLAB.get()));
        add(BlockInit.BROWN_EARTHEN_WALL_SLAB.get(),
                block -> createSlabItemTable(BlockInit.BROWN_EARTHEN_WALL_SLAB.get()));
        add(BlockInit.LIGHT_EARTHEN_WALL_SLAB.get(),
                block -> createSlabItemTable(BlockInit.LIGHT_EARTHEN_WALL_SLAB.get()));
        add(BlockInit.GRAVELLY_SOIL_SLAB.get(),
                block -> createSlabItemTable(BlockInit.GRAVELLY_SOIL_SLAB.get()));

        dropSelf(BlockInit.SHIKKUI.get());
        dropSelf(BlockInit.TATAMI.get());
        dropSelf(BlockInit.GREEN_TATAMI.get());
        dropSelf(BlockInit.BROWN_TATAMI.get());

        dropSelf(BlockInit.IRON_FLOOR.get());
        dropSelf(BlockInit.DIAMOND_FLOOR.get());
        dropSelf(BlockInit.EMERALD_FLOOR.get());
        dropSelf(BlockInit.IRON_BRICKS.get());
        dropSelf(BlockInit.GOLD_BRICKS.get());
        dropSelf(BlockInit.STONE_PAVEMENT.get());
        dropSelf(BlockInit.BEDROCK_PAVEMENT.get());
        dropSelf(BlockInit.SANDSTONE_PAVEMENT.get());

        add(BlockInit.IRON_FLOOR_SLAB.get(),
                block -> createSlabItemTable(BlockInit.IRON_FLOOR_SLAB.get()));
        add(BlockInit.IRON_BRICKS_SLAB.get(),
                block -> createSlabItemTable(BlockInit.IRON_BRICKS_SLAB.get()));
        add(BlockInit.GOLD_BRICKS_SLAB.get(),
                block -> createSlabItemTable(BlockInit.GOLD_BRICKS_SLAB.get()));
        add(BlockInit.STONE_PAVEMENT_SLAB.get(),
                block -> createSlabItemTable(BlockInit.STONE_PAVEMENT_SLAB.get()));
        add(BlockInit.BEDROCK_PAVEMENT_SLAB.get(),
                block -> createSlabItemTable(BlockInit.BEDROCK_PAVEMENT_SLAB.get()));
        add(BlockInit.SANDSTONE_PAVEMENT_SLAB.get(),
                block -> createSlabItemTable(BlockInit.SANDSTONE_PAVEMENT_SLAB.get()));

        dropSelf(BlockInit.DITCH.get());

        dropSelf(BlockInit.STATION_EDGE.get());

        dropSelf(BlockInit.PAVING_GRAVEL.get());
        dropSelf(BlockInit.PAVING_GRAVEL_STAIRS.get());
        add(BlockInit.PAVING_GRAVEL_SLAB.get(),
                block -> createSlabItemTable(BlockInit.PAVING_GRAVEL_SLAB.get()));

        dropSelf(BlockInit.PAVING_STONE.get());
        dropSelf(BlockInit.POWERED_PAVING_STONE.get());
        dropSelf(BlockInit.PAVING_STONE_STAIRS.get());
        add(BlockInit.PAVING_STONE_SLAB.get(),
                block -> createSlabItemTable(BlockInit.PAVING_STONE_SLAB.get()));

        dropSelf(BlockInit.SLAB_RAIL.get());
        dropSelf(BlockInit.POWERED_SLAB_RAIL.get());
        dropSelf(BlockInit.DETECTOR_SLAB_RAIL.get());
        dropSelf(BlockInit.ACTIVATOR_SLAB_RAIL.get());

        add(BlockInit.SLIGHTLY_RUSTED_RAIL.get(),
                createSilkTouchDispatchTable(
                        BlockInit.SLIGHTLY_RUSTED_RAIL.get(),
                        applyExplosionDecay(
                                BlockInit.SLIGHTLY_RUSTED_RAIL.get(),
                                LootItem.lootTableItem(ItemInit.RUSTED_TRACK.get())
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 5.0F)))
                        )
                )
        );

        add(BlockInit.RUSTED_RAIL.get(),
                createSilkTouchDispatchTable(
                        BlockInit.RUSTED_RAIL.get(),
                        applyExplosionDecay(
                                BlockInit.RUSTED_RAIL.get(),
                                LootItem.lootTableItem(ItemInit.RUSTED_TRACK.get())
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                        )
                )
        );

        add(BlockInit.HEAVILY_RUSTED_RAIL.get(),
                createSilkTouchDispatchTable(
                        BlockInit.HEAVILY_RUSTED_RAIL.get(),
                        applyExplosionDecay(
                                BlockInit.HEAVILY_RUSTED_RAIL.get(),
                                LootItem.lootTableItem(ItemInit.RUSTED_TRACK.get())
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0F, 1.0F)))
                        )
                )
        );

        add(BlockInit.RUINED_RAIL.get(),
                createSilkTouchOnlyTable(BlockInit.RUINED_RAIL.get())
        );

        dropSelf(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE.get());
        dropSelf(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get());

        dropSelf(BlockInit.RED_CACTUS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
