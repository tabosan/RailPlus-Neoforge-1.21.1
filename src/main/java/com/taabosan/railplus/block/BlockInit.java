package com.taabosan.railplus.block;

import com.taabosan.railplus.RailPlus;
import com.taabosan.railplus.item.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PoweredBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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

    public static final DeferredBlock<Block> ENDER_STEEL_BLOCK = registerBlock("ender_steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops().strength(5f, 6f).sound(SoundType.METAL)));

    //coloured framed lamps

    public static final DeferredBlock<Block> WHITE_FRAMED_LAMP = registerBlock("white_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> ORANGE_FRAMED_LAMP = registerBlock("orange_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> MAGENTA_FRAMED_LAMP = registerBlock("magenta_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIGHT_BLUE_FRAMED_LAMP = registerBlock("light_blue_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> YELLOW_FRAMED_LAMP = registerBlock("yellow_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIME_FRAMED_LAMP = registerBlock("lime_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PINK_FRAMED_LAMP = registerBlock("pink_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> GRAY_FRAMED_LAMP = registerBlock("gray_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> LIGHT_GRAY_FRAMED_LAMP = registerBlock("light_gray_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> CYAN_FRAMED_LAMP = registerBlock("cyan_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PURPLE_FRAMED_LAMP = registerBlock("purple_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BLUE_FRAMED_LAMP = registerBlock("blue_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BROWN_FRAMED_LAMP = registerBlock("brown_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> GREEN_FRAMED_LAMP = registerBlock("green_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> RED_FRAMED_LAMP = registerBlock("red_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> BLACK_FRAMED_LAMP = registerBlock("black_framed_lamp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(0.5f, 10f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> 15)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PAVING_GRAVEL = registerBlock("paving_gravel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,10f)
                    .sound(SoundType.GRAVEL)
                    .isValidSpawn(BlockInit::never)
            ));

    public static final DeferredBlock<Block> PAVING_STONE = registerBlock("paving_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,10f)
                    .sound(SoundType.STONE)
                    .isValidSpawn(BlockInit::never)
            ));

    public static final DeferredBlock<Block> POWERED_PAVING_STONE = registerBlock("powered_paving_stone",
            () -> new PoweredBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f,10f)
                    .sound(SoundType.STONE)
                    .isValidSpawn(BlockInit::never)
                    .isRedstoneConductor(BlockInit::never)
            ));

    public static final DeferredBlock<Block> RED_CACTUS = registerBlock("red_cactus",
            () -> new RedCactusBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .randomTicks()
                    .strength(0.4f)
                    .sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY)
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
