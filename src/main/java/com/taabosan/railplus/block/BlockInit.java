package com.taabosan.railplus.block;

import com.taabosan.railplus.RailPlus;
import com.taabosan.railplus.item.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.Map;
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

    public static final DeferredBlock<InvisibleButtonBlock> INVISIBLE_BUTTON = registerBlock("invisible_button",
            () -> new InvisibleButtonBlock(BlockSetType.STONE, 30, BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY)
            ));

    public static  final DeferredBlock<FlatLampBlock> FLAT_LAMP = registerBlock("flat_lamp",
            () -> new FlatLampBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .noOcclusion()
            ));

    public static  final DeferredBlock<SquareLampBlock> SQUARE_LAMP = registerBlock("square_lamp",
            () -> new SquareLampBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .strength(0.3f, 6.0f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .noOcclusion()
            ));

    //framed lamps
    public static final Map<FramedLampColor, DeferredBlock<Block>> FRAMED_LAMPS =
            new EnumMap<>(FramedLampColor.class);

    public static final Map<FramedLampColor, DeferredBlock<SlabBlock>> FRAMED_LAMP_SLABS =
            new EnumMap<>(FramedLampColor.class);

    //hardened bricks
    public static final Map<HardenedBricksType, DeferredBlock<Block>> HARDENED_BRICKS =
            new EnumMap<>(HardenedBricksType.class);

    public static final Map<HardenedBricksType, DeferredBlock<SlabBlock>> HARDENED_BRICKS_SLABS =
            new EnumMap<>(HardenedBricksType.class);

    static {
        for (FramedLampColor color : FramedLampColor.values()) {
            FRAMED_LAMPS.put(color,
                    registerBlock(color.blockName(),
                            () -> new Block(framedLampProperties(color.mapColor))));
        }

        for (FramedLampColor color : FramedLampColor.values()) {
            FRAMED_LAMP_SLABS.put(color,
                    registerBlock(color.slabName(),
                            () -> new SlabBlock(
                                    BlockBehaviour.Properties.ofFullCopy(
                                            FRAMED_LAMPS.get(color).get()
                                    )
                            )));
        }

        for (HardenedBricksType type : HardenedBricksType.values()) {
            HARDENED_BRICKS.put(type,
                    registerBlock(type.blockName(),
                            () -> new Block(hardenedBrickProperties(type.mapColor))));
        }

        for (HardenedBricksType type : HardenedBricksType.values()) {
            HARDENED_BRICKS_SLABS.put(type,
                    registerBlock(type.slabName(),
                            () -> new SlabBlock(
                                    BlockBehaviour.Properties.ofFullCopy(
                                            HARDENED_BRICKS.get(type).get()
                                    )
                            )));
        }
    }

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
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.CRIMSON_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    public static final DeferredBlock<BookshelfBlock> WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            () -> new BookshelfBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WARPED_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.5F,6.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
            ));

    //ladders
    public static final DeferredBlock<ModLadderBlock> OAK_LADDER = registerBlock("oak_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> SPRUCE_LADDER = registerBlock("spruce_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> BIRCH_LADDER = registerBlock("birch_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> JUNGLE_LADDER = registerBlock("jungle_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> ACACIA_LADDER = registerBlock("acacia_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> CHERRY_LADDER = registerBlock("cherry_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> MANGROVE_LADDER = registerBlock("mangrove_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> BAMBOO_LADDER = registerBlock("bamboo_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> CRIMSON_LADDER = registerBlock("crimson_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.CRIMSON_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> WARPED_LADDER = registerBlock("warped_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WARPED_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F,3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()
            ));

    public static final DeferredBlock<ModLadderBlock> IRON_LADDER = registerBlock("iron_ladder",
            () -> new ModLadderBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> WHITE_VENDING_MACHINE = registerBlock("white_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> RED_VENDING_MACHINE = registerBlock("red_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> BLUE_VENDING_MACHINE = registerBlock("blue_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> ORANGE_VENDING_MACHINE = registerBlock("orange_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> GREEN_VENDING_MACHINE = registerBlock("green_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> LIME_VENDING_MACHINE = registerBlock("lime_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> YELLOW_VENDING_MACHINE = registerBlock("yellow_vending_machine",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<VendingMachineBlock> LOCKER = registerBlock("locker",
            () -> new VendingMachineBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F,6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()
            ));

    public static final DeferredBlock<ColoredFallingBlock> WHITE_SAND = registerBlock("white_sand",
            () -> new ColoredFallingBlock(new ColorRGBA(12895428), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sound(SoundType.SAND)
            ));

    public static final DeferredBlock<Block> DARK_EARTHEN_WALL = registerBlock("dark_earthen_wall",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5F)
                    .sound(SoundType.GRAVEL)
            ));

    public static final DeferredBlock<Block> BROWN_EARTHEN_WALL = registerBlock("brown_earthen_wall",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5F)
                    .sound(SoundType.GRAVEL)
            ));

    public static final DeferredBlock<Block> LIGHT_EARTHEN_WALL = registerBlock("light_earthen_wall",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5F)
                    .sound(SoundType.GRAVEL)
            ));

    public static final DeferredBlock<Block> GRAVELLY_SOIL = registerBlock("gravelly_soil",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5F)
                    .sound(SoundType.GRAVEL)
            ));

    public static final DeferredBlock<RotatedPillarBlock> SHIKKUI = registerBlock("shikkui",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .strength(0.5F)
                    .sound(SoundType.WOOL)
            ));

    public static final DeferredBlock<RotatedPillarBlock> TATAMI = registerBlock("tatami",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.5F)
                    .sound(SoundType.WOOL)
            ));

    public static final DeferredBlock<RotatedPillarBlock> GREEN_TATAMI = registerBlock("green_tatami",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(0.5F)
                    .sound(SoundType.WOOL)
            ));

    public static final DeferredBlock<RotatedPillarBlock> BROWN_TATAMI = registerBlock("brown_tatami",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.5F)
                    .sound(SoundType.WOOL)
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
                    .strength(3.0f,9.0f)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<Block> EMERALD_FLOOR = registerBlock("emerald_floor",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.EMERALD)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f,9.0f)
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

    public static final DeferredBlock<Block> BEDROCK_PAVEMENT = registerBlock("bedrock_pavement",
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

    public static final DeferredBlock<RotatedPillarBlock> DITCH = registerBlock("ditch",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
            ));

    public static final DeferredBlock<StationEdgeBlock> STATION_EDGE = registerBlock("station_edge",
            () -> new StationEdgeBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,6.0f)
                    .sound(SoundType.STONE)
                    .noOcclusion()
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

    //rails
    public  static final DeferredBlock<SlabRailBlock> SLAB_RAIL = registerBlock("slab_rail",
            () -> new SlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
            ));

    public  static final DeferredBlock<PoweredSlabRailBlock> POWERED_SLAB_RAIL = registerBlock("powered_slab_rail",
            () -> new PoweredSlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
            ,true
            ));

    public static final DeferredBlock<DetectorSlabRailBlock> DETECTOR_SLAB_RAIL = registerBlock("detector_slab_rail",
            () -> new DetectorSlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<PoweredSlabRailBlock> ACTIVATOR_SLAB_RAIL = registerBlock("activator_slab_rail",
            () -> new PoweredSlabRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
            ));

    public static final DeferredBlock<RustedRailBlock> SLIGHTLY_RUSTED_RAIL = registerBlock("slightly_rusted_rail",
            () -> new RustedRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
            ,0.75F
            ));

    public static final DeferredBlock<RustedRailBlock> RUSTED_RAIL = registerBlock("rusted_rail",
            () -> new RustedRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
                    ,0.5F
            ));

    public static final DeferredBlock<RustedRailBlock> HEAVILY_RUSTED_RAIL = registerBlock("heavily_rusted_rail",
            () -> new RustedRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
                    ,0.25F
            ));

    public static final DeferredBlock<RustedRailBlock> RUINED_RAIL = registerBlock("ruined_rail",
            () -> new RustedRailBlock(BlockBehaviour.Properties.of()
                    .noCollission()
                    .strength(0.7F,6.0F)
                    .sound(SoundType.METAL)
                    ,0F
            ));


    public static final DeferredBlock<RedCactusBlock> RED_CACTUS = registerBlock("red_cactus",
            () -> new RedCactusBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .randomTicks()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY)
            ));

    //railroad crossing fence
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

    private static BlockBehaviour.Properties hardenedBrickProperties(MapColor color) {
        return BlockBehaviour.Properties.of()
                .mapColor(color)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5f, 1200f);
    }

    private static BlockBehaviour.Properties framedLampProperties(MapColor color) {
        return BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(0.3f, 6.0f)
                .sound(SoundType.GLASS)
                .lightLevel(state -> 15);
    }
}
