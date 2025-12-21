package com.taabosan.railplus.util;

import com.taabosan.railplus.RailPlus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static class Blocks {
        public static final TagKey<Block> SLAB_RAIL_PLACEABLE = createTag("slab_rail_placeable");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(RailPlus.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(RailPlus.MOD_ID, name));
        }
    }
}
