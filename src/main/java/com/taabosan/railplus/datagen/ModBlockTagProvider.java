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

                .add(BlockInit.INVISIBLE_BUTTON.get())

                .add(BlockInit.IRON_LADDER.get())

                .add(BlockInit.IRON_FLOOR.get())
                .add(BlockInit.DIAMOND_FLOOR.get())
                .add(BlockInit.EMERALD_FLOOR.get())

                .add(BlockInit.IRON_BRICKS.get())
                .add(BlockInit.GOLD_BRICKS.get())

                .add(BlockInit.STONE_PAVEMENT.get())
                .add(BlockInit.BEDROCK_PAVEMENT.get())
                .add(BlockInit.SANDSTONE_PAVEMENT.get())

                .add(BlockInit.DITCH.get())

                .add(BlockInit.STATION_EDGE.get())

                .add(BlockInit.PAVING_STONE.get())
                .add(BlockInit.POWERED_PAVING_STONE.get())
                .add(BlockInit.PAVING_STONE_STAIRS.get())
                .add(BlockInit.PAVING_STONE_SLAB.get())

                .add(BlockInit.SLAB_RAIL.get())
                .add(BlockInit.POWERED_SLAB_RAIL.get())
                .add(BlockInit.DETECTOR_SLAB_RAIL.get())
                .add(BlockInit.ACTIVATOR_SLAB_RAIL.get())
                .add(BlockInit.SLIGHTLY_RUSTED_RAIL.get())
                .add(BlockInit.RUSTED_RAIL.get())
                .add(BlockInit.HEAVILY_RUSTED_RAIL.get())
                .add(BlockInit.RUINED_RAIL.get())

                .add(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE.get())
                .add(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get())
        ;

        BlockInit.HARDENED_BRICKS.values().forEach(block -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get()));
        BlockInit.HARDENED_BRICKS_SLABS.values().forEach(block -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get()));

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BlockInit.WHITE_SAND.get())
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

                .add(BlockInit.OAK_LADDER.get())
                .add(BlockInit.SPRUCE_LADDER.get())
                .add(BlockInit.BIRCH_LADDER.get())
                .add(BlockInit.JUNGLE_LADDER.get())
                .add(BlockInit.ACACIA_LADDER.get())
                .add(BlockInit.CHERRY_LADDER.get())
                .add(BlockInit.DARK_OAK_LADDER.get())
                .add(BlockInit.MANGROVE_LADDER.get())
                .add(BlockInit.BAMBOO_LADDER.get())
                .add(BlockInit.CRIMSON_LADDER.get())
                .add(BlockInit.WARPED_LADDER.get())
        ;

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockInit.ENDER_STEEL_BLOCK.get())
                .add(BlockInit.IRON_FLOOR.get())
                .add(BlockInit.DIAMOND_FLOOR.get())
                .add(BlockInit.EMERALD_FLOOR.get())
                .add(BlockInit.IRON_BRICKS.get())
                .add(BlockInit.GOLD_BRICKS.get())
        ;

        BlockInit.HARDENED_BRICKS.values().forEach(block -> tag(BlockTags.NEEDS_DIAMOND_TOOL).add(block.get()));
        BlockInit.HARDENED_BRICKS_SLABS.values().forEach(block -> tag(BlockTags.NEEDS_DIAMOND_TOOL).add(block.get()));

        BlockInit.HARDENED_BRICKS_SLABS.values().forEach(block -> tag(BlockTags.SLABS).add(block.get()));

        tag(BlockTags.BUTTONS).add(BlockInit.INVISIBLE_BUTTON.get());

        tag(BlockTags.RAILS)
                .add(BlockInit.SLAB_RAIL.get())
                .add(BlockInit.POWERED_SLAB_RAIL.get())
                .add(BlockInit.DETECTOR_SLAB_RAIL.get())
                .add(BlockInit.ACTIVATOR_SLAB_RAIL.get())
                .add(BlockInit.SLIGHTLY_RUSTED_RAIL.get())
                .add(BlockInit.RUSTED_RAIL.get())
                .add(BlockInit.HEAVILY_RUSTED_RAIL.get())
                .add(BlockInit.RUINED_RAIL.get())
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
                .add(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get())
        ;

        tag(BlockTags.CLIMBABLE)
                .add(BlockInit.OAK_LADDER.get())
                .add(BlockInit.SPRUCE_LADDER.get())
                .add(BlockInit.BIRCH_LADDER.get())
                .add(BlockInit.JUNGLE_LADDER.get())
                .add(BlockInit.ACACIA_LADDER.get())
                .add(BlockInit.CHERRY_LADDER.get())
                .add(BlockInit.DARK_OAK_LADDER.get())
                .add(BlockInit.MANGROVE_LADDER.get())
                .add(BlockInit.BAMBOO_LADDER.get())
                .add(BlockInit.CRIMSON_LADDER.get())
                .add(BlockInit.WARPED_LADDER.get())
                .add(BlockInit.IRON_LADDER.get())
        ;

        tag(BlockTags.FALL_DAMAGE_RESETTING)
                .add(BlockInit.OAK_LADDER.get())
                .add(BlockInit.SPRUCE_LADDER.get())
                .add(BlockInit.BIRCH_LADDER.get())
                .add(BlockInit.JUNGLE_LADDER.get())
                .add(BlockInit.ACACIA_LADDER.get())
                .add(BlockInit.CHERRY_LADDER.get())
                .add(BlockInit.DARK_OAK_LADDER.get())
                .add(BlockInit.MANGROVE_LADDER.get())
                .add(BlockInit.BAMBOO_LADDER.get())
                .add(BlockInit.CRIMSON_LADDER.get())
                .add(BlockInit.WARPED_LADDER.get())
                .add(BlockInit.IRON_LADDER.get())
        ;
    }
}
