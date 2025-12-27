package com.taabosan.railplus.datagen;

import com.taabosan.railplus.block.BlockInit;
import com.taabosan.railplus.block.FramedLampColor;
import com.taabosan.railplus.block.HardenedBricksType;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

import static com.taabosan.railplus.block.BlockInit.FRAMED_LAMPS;
import static com.taabosan.railplus.block.BlockInit.FRAMED_LAMP_SLABS;
import static com.taabosan.railplus.block.BlockInit.HARDENED_BRICKS;
import static com.taabosan.railplus.block.BlockInit.HARDENED_BRICKS_SLABS;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(BlockInit.ENDER_STEEL_BLOCK.get());

        dropSelf(BlockInit.INVISIBLE_BUTTON.get());

        for (FramedLampColor color : FramedLampColor.values()) {
            dropSelf(FRAMED_LAMPS.get(color).get());
            add(FRAMED_LAMP_SLABS.get(color).get(),
                    block -> createSlabItemTable(FRAMED_LAMP_SLABS.get(color).get()));
        }

        for (HardenedBricksType type : HardenedBricksType.values()) {
            dropSelf(HARDENED_BRICKS.get(type).get());
            add(HARDENED_BRICKS_SLABS.get(type).get(),
                    block -> createSlabItemTable(HARDENED_BRICKS_SLABS.get(type).get()));
        }

        dropSelf(BlockInit.OAK_BOOKSHELF.get());
        dropSelf(BlockInit.SPRUCE_BOOKSHELF.get());
        dropSelf(BlockInit.BIRCH_BOOKSHELF.get());
        dropSelf(BlockInit.JUNGLE_BOOKSHELF.get());
        dropSelf(BlockInit.ACACIA_BOOKSHELF.get());
        dropSelf(BlockInit.CHERRY_BOOKSHELF.get());
        dropSelf(BlockInit.DARK_OAK_BOOKSHELF.get());
        dropSelf(BlockInit.MANGROVE_BOOKSHELF.get());
        dropSelf(BlockInit.CRIMSON_BOOKSHELF.get());
        dropSelf(BlockInit.WARPED_BOOKSHELF.get());

        dropSelf(BlockInit.WHITE_SAND.get());

        dropSelf(BlockInit.IRON_FLOOR.get());
        dropSelf(BlockInit.DIAMOND_FLOOR.get());
        dropSelf(BlockInit.EMERALD_FLOOR.get());

        dropSelf(BlockInit.IRON_BRICKS.get());
        dropSelf(BlockInit.GOLD_BRICKS.get());

        dropSelf(BlockInit.STONE_PAVEMENT.get());
        dropSelf(BlockInit.BEDROCK_PAVEMENT.get());
        dropSelf(BlockInit.SANDSTONE_PAVEMENT.get());

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

        dropSelf(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE.get());
        dropSelf(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get());

        dropSelf(BlockInit.RED_CACTUS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
