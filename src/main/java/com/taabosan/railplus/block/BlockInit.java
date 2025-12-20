package com.taabosan.railplus.block;

import com.taabosan.railplus.RailPlus;
import com.taabosan.railplus.item.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RailPlus.MOD_ID);

    public static Boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos, EntityType<?> entity) {
        return false;
    }

    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }

    private static StairBlock stair(Block base) {
        return new StairBlock(
                base.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(base)
        );
    }

    public static final DeferredBlock<Block> ENDER_STEEL_BLOCK = registerBlock("ender_steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(DyeColor.GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));

    //coloured framed lamps

    public static final DeferredBlock<Block> WHITE_FRAMED_LAMP = registerBlock("white_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> ORANGE_FRAMED_LAMP = registerBlock("orange_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> MAGENTA_FRAMED_LAMP = registerBlock("magenta_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIGHT_BLUE_FRAMED_LAMP = registerBlock("light_blue_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> YELLOW_FRAMED_LAMP = registerBlock("yellow_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIME_FRAMED_LAMP = registerBlock("lime_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PINK_FRAMED_LAMP = registerBlock("pink_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> GRAY_FRAMED_LAMP = registerBlock("gray_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIGHT_GRAY_FRAMED_LAMP = registerBlock("light_gray_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> CYAN_FRAMED_LAMP = registerBlock("cyan_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PURPLE_FRAMED_LAMP = registerBlock("purple_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BLUE_FRAMED_LAMP = registerBlock("blue_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BROWN_FRAMED_LAMP = registerBlock("brown_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> GREEN_FRAMED_LAMP = registerBlock("green_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> RED_FRAMED_LAMP = registerBlock("red_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BLACK_FRAMED_LAMP = registerBlock("black_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PAVING_GRAVEL = registerBlock("paving_gravel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5f)
                    .sound(SoundType.GRAVEL)
                    .isValidSpawn(BlockInit::never)
            ));

    public static final DeferredBlock<StairBlock> PAVING_GRAVEL_STAIRS = registerBlock("paving_gravel_stairs",
            () -> stair(PAVING_GRAVEL.get()));

    public static final DeferredBlock<SlabBlock> PAVING_GRAVEL_SLAB = registerBlock("paving_gravel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(PAVING_GRAVEL.get())));

    public static final DeferredBlock<Block> PAVING_STONE = registerBlock("paving_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,6.0f)
                    .sound(SoundType.STONE)
                    .isValidSpawn(BlockInit::never)
            ));

    public static final DeferredBlock<PoweredBlock> POWERED_PAVING_STONE = registerBlock("powered_paving_stone",
            () -> new PoweredBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,6.0f)
                    .sound(SoundType.STONE)
                    .isValidSpawn(BlockInit::never)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<StairBlock> PAVING_STONE_STAIRS = registerBlock("paving_stone_stairs",
            () -> stair(PAVING_STONE.get()));

    public static final DeferredBlock<SlabBlock> PAVING_STONE_SLAB = registerBlock("paving_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(PAVING_STONE.get())));

    public static final DeferredBlock<RedCactusBlock> RED_CACTUS = registerBlock("red_cactus",
            () -> new RedCactusBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .randomTicks()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY)
            ));

    public static final DeferredBlock<FenceBlock> YELLOW_RAILROAD_CROSSING_FENCE = registerBlock("yellow_railroad_crossing_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f)
            ));

    public static final DeferredBlock<FenceBlock> WHITE_RAILROAD_CROSSING_FENCE = registerBlock("white_railroad_crossing_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f)
            ));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register( IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
