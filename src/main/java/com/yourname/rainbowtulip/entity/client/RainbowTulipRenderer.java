package com.yourname.rainbowtulip.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class RainbowTulipRenderer extends MobRenderer<RainbowTulipEntity, RainbowTulipModel> {

    private static final ResourceLocation TEXTURE =
        ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/rainbow_tulip.png");

    public RainbowTulipRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new RainbowTulipModel(ctx.bakeLayer(RainbowTulipModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(RainbowTulipEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RainbowTulipEntity entity, float yaw, float partialTick,
                       PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {

        Level level = entity.level();
        BlockPos pos = entity.blockPosition();

        // Sample biome foliage color at the entity's position
        int color = level.getFoliageColor(pos);

        float r = (float)((color >> 16) & 0xFF) / 255f;
        float g = (float)((color >> 8)  & 0xFF) / 255f;
        float b = (float)( color        & 0xFF) / 255f;

        // Pack into ARGB int for 1.21.1 render API
        int tint = (0xFF << 24) | ((int)(r * 255) << 16) | ((int)(g * 255) << 8) | (int)(b * 255);

        poseStack.pushPose();
        this.setupRotations(entity, poseStack, partialTick, yaw, partialTick, 1.0f);
        this.scale(entity, poseStack, partialTick);

        this.model.renderToBuffer(
            poseStack,
            bufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)),
            packedLight,
            OverlayTexture.NO_OVERLAY,
            tint
        );

        poseStack.popPose();

        super.render(entity, yaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
