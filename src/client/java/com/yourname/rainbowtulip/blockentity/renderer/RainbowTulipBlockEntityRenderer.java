package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.yourname.rainbowtulip.blockentity.RainbowTulipBlockEntity;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class RainbowTulipBlockEntityRenderer implements BlockEntityRenderer<RainbowTulipBlockEntity> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "entity/rainbow_tulip");

    private final RainbowTulipModel model;

    public RainbowTulipBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        this.model = new RainbowTulipModel(ctx.bakeLayer(RainbowTulipModel.LAYER_LOCATION));
    }

    @Override
    public void render(RainbowTulipBlockEntity blockEntity, float partialTick,
                       PoseStack poseStack, MultiBufferSource bufferSource,
                       int packedLight, int packedOverlay) {

        BlockPos pos = blockEntity.getBlockPos();
        Holder<Biome> biome = blockEntity.getLevel().getBiome(pos);
        int color = biome.value().getFoliageColor();

        // Pack ARGB tint from biome foliage color
        int tint = (0xFF << 24)
                 | (((color >> 16) & 0xFF) << 16)
                 | (((color >> 8)  & 0xFF) << 8)
                 |  ( color        & 0xFF);

        poseStack.pushPose();

        // Center the model within the block and flip upright
        poseStack.translate(0.5, 1.5, 0.5);
        poseStack.scale(1.0F, -1.0F, 1.0F);

        // Scale down from entity units (16px = 1 block) to block units
        float scale = 1.0F / 16.0F;
        poseStack.scale(scale, scale, scale);

        this.model.renderToBuffer(
            poseStack,
            bufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)),
            packedLight,
            OverlayTexture.NO_OVERLAY,
            tint
        );

        poseStack.popPose();
    }
}
