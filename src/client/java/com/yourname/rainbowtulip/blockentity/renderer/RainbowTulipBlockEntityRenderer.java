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

        // No scaling — ModelPart coordinates are already in block units (1 unit = 1 block)
        // Just center on the block and flip Y
        poseStack.translate(0.5, 0.0, 0.5);
        poseStack.scale(1.0F, -1.0F, 1.0F);
        poseStack.translate(0.0, -1.5, 0.0);

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
