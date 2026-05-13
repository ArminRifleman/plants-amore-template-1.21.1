package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.yourname.rainbowtulip.blockentity.RainbowTulipBlockEntity;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class RainbowTulipBlockEntityRenderer implements BlockEntityRenderer<RainbowTulipBlockEntity> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/rainbow_tulip.png");

    private final RainbowTulipModel model;

    public RainbowTulipBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        this.model = new RainbowTulipModel(ctx.bakeLayer(RainbowTulipModel.LAYER_LOCATION));
    }

    @Override
    public void render(RainbowTulipBlockEntity blockEntity, float partialTick,
                       PoseStack poseStack, MultiBufferSource bufferSource,
                       int packedLight, int packedOverlay) {

        poseStack.pushPose();

        // Anchor Y at the bone root height (~8.2 units / 16 = 0.5125 blocks)
        // so the stem base sits on the block surface rather than floating
        poseStack.translate(0.5625, 0.5125, 0.4906);

        // Scale to block units, flip Y to correct orientation
        poseStack.scale(1.0F / 16.0F, -1.0F / 16.0F, 1.0F / 16.0F);

        this.model.renderToBuffer(
            poseStack,
            bufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)),
            packedLight,
            OverlayTexture.NO_OVERLAY,
            0xFFFFFFFF
        );

        poseStack.popPose();
    }
}
