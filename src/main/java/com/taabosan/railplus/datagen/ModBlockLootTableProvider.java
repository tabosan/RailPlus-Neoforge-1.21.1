package com.taabosan.railplus.datagen;

import com.taabosan.railplus.block.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(BlockInit.ENDER_STEEL_BLOCK.get());

        dropSelf(BlockInit.INVISIBLE_BUTTON.get());

        dropSelf(BlockInit.WHITE_FRAMED_LAMP.get());
        dropSelf(BlockInit.ORANGE_FRAMED_LAMP.get());
        dropSelf(BlockInit.MAGENTA_FRAMED_LAMP.get());
        dropSelf(BlockInit.LIGHT_BLUE_FRAMED_LAMP.get());
        dropSelf(BlockInit.YELLOW_FRAMED_LAMP.get());
        dropSelf(BlockInit.LIME_FRAMED_LAMP.get());
        dropSelf(BlockInit.PINK_FRAMED_LAMP.get());
        dropSelf(BlockInit.GRAY_FRAMED_LAMP.get());
        dropSelf(BlockInit.LIGHT_GRAY_FRAMED_LAMP.get());
        dropSelf(BlockInit.CYAN_FRAMED_LAMP.get());
        dropSelf(BlockInit.PURPLE_FRAMED_LAMP.get());
        dropSelf(BlockInit.BLUE_FRAMED_LAMP.get());
        dropSelf(BlockInit.BROWN_FRAMED_LAMP.get());
        dropSelf(BlockInit.GREEN_FRAMED_LAMP.get());
        dropSelf(BlockInit.RED_FRAMED_LAMP.get());
        dropSelf(BlockInit.BLACK_FRAMED_LAMP.get());

        add(BlockInit.WHITE_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.WHITE_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.ORANGE_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.ORANGE_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.MAGENTA_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.MAGENTA_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.LIGHT_BLUE_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.LIGHT_BLUE_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.YELLOW_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.YELLOW_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.LIME_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.LIME_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.PINK_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.PINK_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.GRAY_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.GRAY_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.LIGHT_GRAY_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.LIGHT_GRAY_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.CYAN_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.CYAN_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.PURPLE_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.PURPLE_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.BLUE_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.BLUE_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.BROWN_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.BROWN_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.GREEN_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.GREEN_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.RED_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.RED_FRAMED_LAMP_SLAB.get()));

        add(BlockInit.BLACK_FRAMED_LAMP_SLAB.get(),
                block -> createSlabItemTable(BlockInit.BLACK_FRAMED_LAMP_SLAB.get()));

        dropSelf(BlockInit.STONE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.COBBLESTONE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.NETHERRACK_HARDENED_BRICKS.get());
        dropSelf(BlockInit.NETHER_HARDENED_BRICKS.get());
        dropSelf(BlockInit.SANDSTONE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.RED_SANDSTONE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.GRANITE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.DIORITE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.ANDESITE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.BASALT_HARDENED_BRICKS.get());
        dropSelf(BlockInit.QUARTZ_HARDENED_BRICKS.get());
        dropSelf(BlockInit.BLACK_QUARTZ_HARDENED_BRICKS.get());
        dropSelf(BlockInit.NETHER_WART_HARDENED_BRICKS.get());
        dropSelf(BlockInit.RED_NETHER_HARDENED_BRICKS.get());
        dropSelf(BlockInit.ICE_HARDENED_BRICKS.get());
        dropSelf(BlockInit.SNOW_HARDENED_BRICKS.get());

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

        dropSelf(BlockInit.IRON_FLOOR.get());
        dropSelf(BlockInit.DIAMOND_FLOOR.get());
        dropSelf(BlockInit.EMERALD_FLOOR.get());

        dropSelf(BlockInit.IRON_BRICKS.get());
        dropSelf(BlockInit.GOLD_BRICKS.get());

        dropSelf(BlockInit.STONE_PAVEMENT.get());
        dropSelf(BlockInit.SANDSTONE_PAVEMENT.get());

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
