package com.taabosan.railplus.block;

import net.minecraft.world.level.material.MapColor;

public enum HardenedBricksType {
    STONE("stone", MapColor.STONE),
    COBBLESTONE("cobblestone", MapColor.STONE),
    NETHERRACK("netherrack", MapColor.NETHER),
    NETHER("nether", MapColor.NETHER),
    SANDSTONE("sandstone", MapColor.SAND),
    RED_SANDSTONE("red_sandstone", MapColor.COLOR_ORANGE),
    GRANITE("granite", MapColor.DIRT),
    DIORITE("diorite", MapColor.QUARTZ),
    ANDESITE("andesite", MapColor.STONE),
    BASALT("basalt", MapColor.COLOR_BLACK),
    QUARTZ("quartz", MapColor.QUARTZ),
    BLACK_QUARTZ("black_quartz", MapColor.COLOR_BLACK),
    NETHER_WART("nether_wart", MapColor.COLOR_RED),
    RED_NETHER("red_nether", MapColor.NETHER),
    ICE("ice", MapColor.ICE),
    SNOW("snow", MapColor.SNOW);

    public final String name;
    public final MapColor mapColor;

    HardenedBricksType(String name, MapColor mapColor) {
        this.name = name;
        this.mapColor = mapColor;
    }

    public String blockName() {
        return name + "_hardened_bricks";
    }

    public String slabName() {
        return blockName() + "_slab";
    }
}
