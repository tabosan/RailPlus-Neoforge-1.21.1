package com.taabosan.railplus.datagen;

import com.taabosan.railplus.RailPlus;
import com.taabosan.railplus.block.BlockInit;
import com.taabosan.railplus.block.FramedLampColor;
import com.taabosan.railplus.block.HardenedBricksType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static com.taabosan.railplus.block.BlockInit.*;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RailPlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BlockInit.ENDER_STEEL_BLOCK);

        buttonBlockWithItem(BlockInit.INVISIBLE_BUTTON.get());

        for (FramedLampColor color : FramedLampColor.values()) {
            blockWithItem(FRAMED_LAMPS.get(color));
            slabBlockWithItem(FRAMED_LAMP_SLABS.get(color).get(), FRAMED_LAMPS.get(color).get());
        }

        for (HardenedBricksType type : HardenedBricksType.values()) {
            blockWithItem(HARDENED_BRICKS.get(type));
            slabBlockWithItem(HARDENED_BRICKS_SLABS.get(type).get(), HARDENED_BRICKS.get(type).get());
        }

        blockWithItem(BlockInit.IRON_FLOOR);
        blockWithItem(BlockInit.DIAMOND_FLOOR);
        blockWithItem(BlockInit.EMERALD_FLOOR);

        blockWithItem(BlockInit.IRON_BRICKS);
        blockWithItem(BlockInit.GOLD_BRICKS);

        pavementBlockWithItem(BlockInit.STONE_PAVEMENT.get());
        pavementBlockWithItem(BlockInit.SANDSTONE_PAVEMENT.get());

        blockWithItem(BlockInit.PAVING_GRAVEL);
        stairsBlockWithItem(BlockInit.PAVING_GRAVEL_STAIRS.get(), BlockInit.PAVING_GRAVEL.get());
        slabBlockWithItem(BlockInit.PAVING_GRAVEL_SLAB.get(), BlockInit.PAVING_GRAVEL.get());

        blockWithItem(BlockInit.PAVING_STONE);

        blockItem(BlockInit.POWERED_PAVING_STONE.get());

        stairsBlockWithItem(BlockInit.PAVING_STONE_STAIRS.get(), BlockInit.PAVING_STONE.get());
        slabBlockWithItem(BlockInit.PAVING_STONE_SLAB.get(), BlockInit.PAVING_STONE.get());

        blockItem(BlockInit.OAK_BOOKSHELF.get());
        blockItem(BlockInit.SPRUCE_BOOKSHELF.get());
        blockItem(BlockInit.BIRCH_BOOKSHELF.get());
        blockItem(BlockInit.JUNGLE_BOOKSHELF.get());
        blockItem(BlockInit.ACACIA_BOOKSHELF.get());
        blockItem(BlockInit.CHERRY_BOOKSHELF.get());
        blockItem(BlockInit.DARK_OAK_BOOKSHELF.get());
        blockItem(BlockInit.MANGROVE_BOOKSHELF.get());
        blockItem(BlockInit.CRIMSON_BOOKSHELF.get());
        blockItem(BlockInit.WARPED_BOOKSHELF.get());


        blockItem(BlockInit.RED_CACTUS.get());

        fenceBlockWithItem(BlockInit.YELLOW_RAILROAD_CROSSING_FENCE.get());
        fenceBlockWithItem(BlockInit.WHITE_RAILROAD_CROSSING_FENCE.get());

    }

    private String getName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    private void blockItem(Block block) {
        simpleBlockItem(block, new ModelFile.UncheckedModelFile(blockTexture(block)));
    }

    private void pavementBlockWithItem(Block block){
        simpleBlockWithItem(block, models().cubeColumn(getName(block), blockTexture(block), blockTexture(block).withSuffix("_top")));
    }


    private void stairsBlockWithItem(Block block, Block fullTextureBlock) {
        stairsBlock((StairBlock) block, blockTexture(fullTextureBlock));
        blockItem(block);
    }

    private void slabBlockWithItem(Block block, Block fullTextureBlock) {
        slabBlock((SlabBlock) block, blockTexture(fullTextureBlock), blockTexture(fullTextureBlock));
        blockItem(block);
    }

    private void fenceBlockWithItem(Block block, Block fullTextureBlock) {
        fenceBlock((FenceBlock) block, blockTexture(fullTextureBlock));
        simpleBlockItem(block, models().fenceInventory(getName(block) + "_inventory", blockTexture(fullTextureBlock)));
    }

    private void fenceBlockWithItem(Block block) {
        fenceBlock((FenceBlock) block, blockTexture(block));
        simpleBlockItem(block, models().fenceInventory(getName(block) + "_inventory", blockTexture(block)));
    }

    private void buttonBlockWithItem(Block block, Block fullTextureBlock) {
        buttonBlock((ButtonBlock) block, blockTexture(fullTextureBlock));
        simpleBlockItem(block, models().buttonInventory(getName(block) + "_inventory", blockTexture(fullTextureBlock)));
    }

    private void buttonBlockWithItem(Block block) {
        buttonBlock((ButtonBlock) block, blockTexture(block));
        simpleBlockItem(block, models().buttonInventory(getName(block) + "_inventory", blockTexture(block)));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
