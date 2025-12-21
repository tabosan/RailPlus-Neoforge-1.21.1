package com.taabosan.railplus.datagen;

import com.taabosan.railplus.RailPlus;
import com.taabosan.railplus.block.BlockInit;
import com.taabosan.railplus.util.TagInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RailPlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.ENDER_STEEL_BLOCK.get())

                .add(BlockInit.STONE_HARDENED_BRICKS.get())
                .add(BlockInit.COBBLESTONE_HARDENED_BRICKS.get())
                .add(BlockInit.NETHERRACK_HARDENED_BRICKS.get())
                .add(BlockInit.NETHER_HARDENED_BRICKS.get())
                .add(BlockInit.SANDSTONE_HARDENED_BRICKS.get())
                .add(BlockInit.RED_SANDSTONE_HARDENED_BRICKS.get())
                .add(BlockInit.GRANITE_HARDENED_BRICKS.get())
                .add(BlockInit.DIORITE_HARDENED_BRICKS.get())
                .add(BlockInit.ANDESITE_HARDENED_BRICKS.get())
                .add(BlockInit.BASALT_HARDENED_BRICKS.get())
                .add(BlockInit.QUARTZ_HARDENED_BRICKS.get())
                .add(BlockInit.BLACK_QUARTZ_HARDENED_BRICKS.get())
                .add(BlockInit.NETHER_WART_HARDENED_BRICKS.get())
                .add(BlockInit.RED_NETHER_HARDENED_BRICKS.get())
                .add(BlockInit.ICE_HARDENED_BRICKS.get())
                .add(BlockInit.SNOW_HARDENED_BRICKS.get())

                .add(BlockInit.IRON_FLOOR.get())
                .add(BlockInit.DIAMOND_FLOOR.get())
                .add(BlockInit.EMERALD_FLOOR.get())

                .add(BlockInit.IRON_BRICKS.get())
                .add(BlockInit.GOLD_BRICKS.get())

                .add(BlockInit.STONE_PAVEMENT.get())
                .add(BlockInit.SANDSTONE_PAVEMENT.get())

                .add(BlockInit.PAVING_STONE.get())
                .add(BlockInit.POWERED_PAVING_STONE.get())
                .add(BlockInit.PAVING_STONE_STAIRS.get())
                .add(BlockInit.PAVING_STONE_SLAB.get())
                .add(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE.get())
                .add(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get())
        ;

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BlockInit.PAVING_GRAVEL.get())
                .add(BlockInit.PAVING_GRAVEL_STAIRS.get())
                .add(BlockInit.PAVING_GRAVEL_SLAB.get())
        ;

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockInit.OAK_BOOKSHELF.get())
                .add(BlockInit.SPRUCE_BOOKSHELF.get())
                .add(BlockInit.BIRCH_BOOKSHELF.get())
                .add(BlockInit.JUNGLE_BOOKSHELF.get())
                .add(BlockInit.ACACIA_BOOKSHELF.get())
                .add(BlockInit.CHERRY_BOOKSHELF.get())
                .add(BlockInit.DARK_OAK_BOOKSHELF.get())
                .add(BlockInit.MANGROVE_BOOKSHELF.get())
                .add(BlockInit.CRIMSON_BOOKSHELF.get())
                .add(BlockInit.WARPED_BOOKSHELF.get())
        ;

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockInit.ENDER_STEEL_BLOCK.get())
                .add(BlockInit.IRON_FLOOR.get())
                .add(BlockInit.DIAMOND_FLOOR.get())
                .add(BlockInit.EMERALD_FLOOR.get())
                .add(BlockInit.IRON_BRICKS.get())
                .add(BlockInit.GOLD_BRICKS.get())
        ;

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.STONE_HARDENED_BRICKS.get())
                .add(BlockInit.COBBLESTONE_HARDENED_BRICKS.get())
                .add(BlockInit.NETHERRACK_HARDENED_BRICKS.get())
                .add(BlockInit.NETHER_HARDENED_BRICKS.get())
                .add(BlockInit.SANDSTONE_HARDENED_BRICKS.get())
                .add(BlockInit.RED_SANDSTONE_HARDENED_BRICKS.get())
                .add(BlockInit.GRANITE_HARDENED_BRICKS.get())
                .add(BlockInit.DIORITE_HARDENED_BRICKS.get())
                .add(BlockInit.ANDESITE_HARDENED_BRICKS.get())
                .add(BlockInit.BASALT_HARDENED_BRICKS.get())
                .add(BlockInit.QUARTZ_HARDENED_BRICKS.get())
                .add(BlockInit.BLACK_QUARTZ_HARDENED_BRICKS.get())
                .add(BlockInit.NETHER_WART_HARDENED_BRICKS.get())
                .add(BlockInit.RED_NETHER_HARDENED_BRICKS.get())
                .add(BlockInit.ICE_HARDENED_BRICKS.get())
                .add(BlockInit.SNOW_HARDENED_BRICKS.get())
        ;

        tag(BlockTags.RAILS)
                .add(BlockInit.SLAB_RAIL.get())
                .add(BlockInit.POWERED_SLAB_RAIL.get())
                .add(BlockInit.DETECTOR_SLAB_RAIL.get())
                .add(BlockInit.ACTIVATOR_SLAB_RAIL.get())
        ;

        tag(TagInit.Blocks.SLAB_RAIL_PLACEABLE)
                .add(BlockInit.PAVING_GRAVEL.get())
                .add(BlockInit.PAVING_GRAVEL_STAIRS.get())
                .add(BlockInit.PAVING_GRAVEL_SLAB.get())
                .add(BlockInit.PAVING_STONE.get())
                .add(BlockInit.POWERED_PAVING_STONE.get())
                .add(BlockInit.PAVING_STONE_STAIRS.get())
                .add(BlockInit.PAVING_STONE_SLAB.get())
        ;

        tag(BlockTags.FENCES)
                .add(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE.get())
                .add(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get());
        ;
    }
}
