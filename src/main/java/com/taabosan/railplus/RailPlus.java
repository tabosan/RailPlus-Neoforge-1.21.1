package com.taabosan.railplus;

import com.taabosan.railplus.block.BlockInit;
import com.taabosan.railplus.creative_tab.CreativeTabInit;
import com.taabosan.railplus.item.ItemInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.ChunkRenderTypeSet;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(RailPlus.MOD_ID)
public class RailPlus {

    public static final String MOD_ID = "rail_plus";

    public static final Logger LOGGER = LogUtils.getLogger();



    public RailPlus(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        CreativeTabInit.register(modEventBus);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetUp(FMLClientSetupEvent event){
            ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_CACTUS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.SLAB_RAIL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.POWERED_SLAB_RAIL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.DETECTOR_SLAB_RAIL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockInit.ACTIVATOR_SLAB_RAIL.get(), RenderType.cutout());
        }
    }
}
