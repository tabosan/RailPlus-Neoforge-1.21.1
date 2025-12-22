package com.taabosan.railplus.block;

import net.minecraft.world.level.material.MapColor;

public enum FramedLampColor {
    WHITE("white", MapColor.SNOW),
    ORANGE("orange", MapColor.COLOR_ORANGE),
    MAGENTA("magenta", MapColor.COLOR_MAGENTA),
    LIGHT_BLUE("light_blue", MapColor.COLOR_LIGHT_BLUE),
    YELLOW("yellow", MapColor.COLOR_YELLOW),
    LIME("lime", MapColor.COLOR_LIGHT_GREEN),
    PINK("pink", MapColor.COLOR_PINK),
    GRAY("gray", MapColor.COLOR_GRAY),
    LIGHT_GRAY("light_gray", MapColor.COLOR_LIGHT_GRAY),
    CYAN("cyan", MapColor.COLOR_CYAN),
    PURPLE("purple", MapColor.COLOR_PURPLE),
    BLUE("blue", MapColor.COLOR_BLUE),
    BROWN("brown", MapColor.COLOR_BROWN),
    GREEN("green", MapColor.COLOR_GREEN),
    RED("red", MapColor.COLOR_RED),
    BLACK("black", MapColor.COLOR_BLACK);

    public final String name;
    public final MapColor mapColor;

    FramedLampColor(String name, MapColor mapColor) {
        this.name = name;
        this.mapColor = mapColor;
    }

    public String blockName() {
        return name + "_framed_lamp";
    }

    public String slabName() {
        return blockName() + "_slab";
    }
}

