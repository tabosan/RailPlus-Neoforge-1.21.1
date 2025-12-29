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

import static com.taabosan.railplus.block.BlockInit.FRAMED_LAMPS;
import static com.taabosan.railplus.block.BlockInit.FRAMED_LAMP_SLABS;
import static com.taabosan.railplus.block.BlockInit.HARDENED_BRICKS;
import static com.taabosan.railplus.block.BlockInit.HARDENED_BRICKS_SLABS;

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

        simpleBlock(BlockInit.FLAT_LAMP.get(), models().getExistingFile(modLoc("block/flat_lamp")));
        blockItem(BlockInit.FLAT_LAMP.get());

        simpleBlock(BlockInit.SQUARE_LAMP.get(), models().getExistingFile(modLoc("block/square_lamp")));
        blockItem(BlockInit.SQUARE_LAMP.get());

        horizontalBlockWithItem(BlockInit.OAK_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.SPRUCE_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.BIRCH_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.JUNGLE_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.ACACIA_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.CHERRY_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.DARK_OAK_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.MANGROVE_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.CRIMSON_BOOKSHELF.get());
        horizontalBlockWithItem(BlockInit.WARPED_BOOKSHELF.get());

        blockWithItem(BlockInit.WHITE_SAND);
        blockWithItem(BlockInit.DARK_EARTHEN_WALL);
        blockWithItem(BlockInit.BROWN_EARTHEN_WALL);
        blockWithItem(BlockInit.LIGHT_EARTHEN_WALL);
        blockWithItem(BlockInit.GRAVELLY_SOIL);

        rotatedPillarBlockWithItem(BlockInit.SHIKKUI.get());
        rotatedPillarBlockWithItem(BlockInit.TATAMI.get());
        rotatedPillarBlockWithItem(BlockInit.GREEN_TATAMI.get());
        rotatedPillarBlockWithItem(BlockInit.BROWN_TATAMI.get());

        blockWithItem(BlockInit.IRON_FLOOR);
        blockWithItem(BlockInit.DIAMOND_FLOOR);
        blockWithItem(BlockInit.EMERALD_FLOOR);

        blockWithItem(BlockInit.IRON_BRICKS);
        blockWithItem(BlockInit.GOLD_BRICKS);

        pavementBlockWithItem(BlockInit.STONE_PAVEMENT.get());
        pavementBlockWithItem(BlockInit.BEDROCK_PAVEMENT.get());
        pavementBlockWithItem(BlockInit.SANDSTONE_PAVEMENT.get());

        rotatedPillarBlockWithItem(BlockInit.DITCH.get());

        horizontalBlockWithItem(BlockInit.STATION_EDGE.get());

        blockWithItem(BlockInit.PAVING_GRAVEL);
        stairsBlockWithItem(BlockInit.PAVING_GRAVEL_STAIRS.get(), BlockInit.PAVING_GRAVEL.get());
        slabBlockWithItem(BlockInit.PAVING_GRAVEL_SLAB.get(), BlockInit.PAVING_GRAVEL.get());

        blockWithItem(BlockInit.PAVING_STONE);

        blockItem(BlockInit.POWERED_PAVING_STONE.get());

        stairsBlockWithItem(BlockInit.PAVING_STONE_STAIRS.get(), BlockInit.PAVING_STONE.get());
        slabBlockWithItem(BlockInit.PAVING_STONE_SLAB.get(), BlockInit.PAVING_STONE.get());

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

    private void horizontalBlockWithItem(Block block){
        horizontalBlock(block, models().getExistingFile(modLoc("block/" + getName(block))));
        blockItem(block);
    }

    private void pavementBlockWithItem(Block block){
        simpleBlockWithItem(block, models().cubeColumn(getName(block), blockTexture(block), blockTexture(block).withSuffix("_top")));
    }

    private void rotatedPillarBlockWithItem(Block block){
        axisBlock((RotatedPillarBlock) block, blockTexture(block).withSuffix("_side"), blockTexture(block).withSuffix("_top"));
        blockItem(block);
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
