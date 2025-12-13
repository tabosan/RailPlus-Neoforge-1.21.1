package com.taabosan.railplus.item;

import com.taabosan.railplus.RailPlus;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RailPlus.MOD_ID);

    public static final DeferredItem<Item> ENDER_DUST = ITEMS.registerItem("ender_dust",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> ENDER_STEEL_INGOT = ITEMS.registerItem("ender_steel_ingot",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> ENDER_PLATE = ITEMS.registerItem("ender_plate",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
