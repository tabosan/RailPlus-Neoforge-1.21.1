package com.taabosan.railplus.block;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;

public class InvisibleButtonBlockEntityRenderer implements BlockEntityRenderer<InvisibleButtonBlockEntity> {
    private final BlockRenderDispatcher dispatcher;

    public InvisibleButtonBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        this.dispatcher = ctx.getBlockRenderDispatcher();
    }

    @Override
    public void render(
            InvisibleButtonBlockEntity be,
            float partialTick,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int light,
            int overlay
    ) {
        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;
        if (player == null) return;

        // ===== 可視条件 =====
        if (!isHolding(player, be.getButtonItem())) {
            return;
        }

        BlockState state = be.getBlockState();

        poseStack.pushPose();

        // ★ ここが核心：モデルを直接描画
        dispatcher.getModelRenderer().renderModel(
                poseStack.last(),
                buffer.getBuffer(RenderType.solid()),
                state,
                dispatcher.getBlockModel(state),
                1.0F, 1.0F, 1.0F,
                light,
                OverlayTexture.NO_OVERLAY
        );

        poseStack.popPose();
    }

    private boolean isHolding(Player player, Item item) {
        return player.getMainHandItem().is(item)
                || player.getOffhandItem().is(item);
    }
}
