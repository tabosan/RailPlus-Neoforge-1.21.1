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
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> ORANGE_FRAMED_LAMP = registerBlock("orange_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> MAGENTA_FRAMED_LAMP = registerBlock("magenta_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIGHT_BLUE_FRAMED_LAMP = registerBlock("light_blue_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> YELLOW_FRAMED_LAMP = registerBlock("yellow_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIME_FRAMED_LAMP = registerBlock("lime_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PINK_FRAMED_LAMP = registerBlock("pink_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> GRAY_FRAMED_LAMP = registerBlock("gray_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIGHT_GRAY_FRAMED_LAMP = registerBlock("light_gray_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> CYAN_FRAMED_LAMP = registerBlock("cyan_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PURPLE_FRAMED_LAMP = registerBlock("purple_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BLUE_FRAMED_LAMP = registerBlock("blue_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BROWN_FRAMED_LAMP = registerBlock("brown_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> GREEN_FRAMED_LAMP = registerBlock("green_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> RED_FRAMED_LAMP = registerBlock("red_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BLACK_FRAMED_LAMP = registerBlock("black_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    //hardened bricks
    public static final DeferredBlock<Block> STONE_HARDENED_BRICKS = registerBlock("stone_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> COBBLESTONE_HARDENED_BRICKS = registerBlock("cobblestone_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> NETHERRACK_HARDENED_BRICKS = registerBlock("netherrack_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> NETHER_HARDENED_BRICKS = registerBlock("nether_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> SANDSTONE_HARDENED_BRICKS = registerBlock("sandstone_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> RED_SANDSTONE_HARDENED_BRICKS = registerBlock("red_sandstone_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> GRANITE_HARDENED_BRICKS = registerBlock("granite_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> DIORITE_HARDENED_BRICKS = registerBlock("diorite_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> ANDESITE_HARDENED_BRICKS = registerBlock("andesite_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> BASALT_HARDENED_BRICKS = registerBlock("basalt_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> QUARTZ_HARDENED_BRICKS = registerBlock("quartz_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> BLACK_QUARTZ_HARDENED_BRICKS = registerBlock("black_quartz_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> NETHER_WART_HARDENED_BRICKS = registerBlock("nether_wart_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> RED_NETHER_HARDENED_BRICKS = registerBlock("red_nether_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.NETHER)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> ICE_HARDENED_BRICKS = registerBlock("ice_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.ICE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    public static final DeferredBlock<Block> SNOW_HARDENED_BRICKS = registerBlock("snow_hardened_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 1200f)
            ));

    //wooden bookshelf
    public static final DeferredBlock<BookshelfBlock> OAK_BOOKSHELF = registerBlock("oak_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));


    public static final DeferredBlock<BookshelfBlock> CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<Block> IRON_FLOOR = registerBlock("iron_floor",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f,9.0f)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<Block> DIAMOND_FLOOR = registerBlock("diamond_floor",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,9.0f)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<Block> EMERALD_FLOOR = registerBlock("emerald_floor",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.EMERALD)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,9.0f)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<Block> IRON_BRICKS = registerBlock("iron_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f,9.0f)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<Block> GOLD_BRICKS = registerBlock("gold_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f,9.0f)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<Block> STONE_PAVEMENT = registerBlock("stone_pavement",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,9.0f)
                    .sound(SoundType.STONE)
            ));

    public static final DeferredBlock<Block> SANDSTONE_PAVEMENT = registerBlock("sandstone_pavement",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,9.0f)
                    .sound(SoundType.STONE)
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

    public static final DeferredBlock<PoweredPavingStoneBlock> POWERED_PAVING_STONE = registerBlock("powered_paving_stone",
            () -> new PoweredPavingStoneBlock(BlockBehaviour.Properties.of()
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

    public  static final DeferredBlock<SlabRailBlock> SLAB_RAIL = registerBlock("slab_rail",
            () -> new SlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
            ));

    public  static final DeferredBlock<PoweredSlabRailBlock> POWERED_SLAB_RAIL = registerBlock("powered_slab_rail",
            () -> new PoweredSlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
            ,true
            ));

    public static final DeferredBlock<DetectorSlabRailBlock> DETECTOR_SLAB_RAIL = registerBlock("detector_slab_rail",
            () -> new DetectorSlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<PoweredSlabRailBlock> ACTIVATOR_SLAB_RAIL = registerBlock("activator_slab_rail",
            () -> new PoweredSlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<RedCactusBlock> RED_CACTUS = registerBlock("red_cactus",
            () -> new RedCactusBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .randomTicks()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY)
            ));

    //crossing fence
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
