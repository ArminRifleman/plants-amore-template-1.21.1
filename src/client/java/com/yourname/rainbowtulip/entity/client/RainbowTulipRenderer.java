package com.yourname.rainbowtulip.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import org.jetbrains.annotations.NotNull;

public class RainbowTulipRenderer extends EntityRenderer<RainbowTulipEntity> {

    private static final ResourceLocation TEXTURE =
        ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/rainbow_tulip.png");

    private final RainbowTulipModel model;

    public RainbowTulipRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
        this.model = new RainbowTulipModel(ctx.bakeLayer(RainbowTulipModel.LAYER_LOCATION));
    }

    @Override
    @NotNull
    public ResourceLocation getTextureLocation(@NotNull RainbowTulipEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RainbowTulipEntity entity, float yaw, float partialTick,
                       PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {

        BlockPos pos = entity.blockPosition();
        Holder<Biome> biome = entity.level().getBiome(pos);
        int color = biome.value().getFoliageColor();

        int tint = (0xFF << 24)
                 | (((color >> 16) & 0xFF) << 16)
                 | (((color >> 8)  & 0xFF) << 8)
                 |  ( color        & 0xFF);

        poseStack.pushPose();

        // Flip the model upright — BlockBench exports are often upside-down for entity renderers
        poseStack.translate(0.0, 1.5, 0.0);
        poseStack.scale(1.0F, -1.0F, 1.0F);

        this.model.setupAnim(entity, 0, 0, partialTick, yaw, 0);
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
