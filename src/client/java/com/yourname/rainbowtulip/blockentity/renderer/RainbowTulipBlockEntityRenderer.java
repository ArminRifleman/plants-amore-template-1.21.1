package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.yourname.rainbowtulip.blockentity.RainbowTulipBlockEntity;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;

public class RainbowTulipBlockEntityRenderer implements BlockEntityRenderer<RainbowTulipBlockEntity> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/rainbow_tulip.png");

    private static final float[] ROTATIONS = { 0f, 90f, 180f, 270f };

    // Default grass green used as fallback if biome has no override
    private static final int DEFAULT_GRASS = 0x79C05A;

    private final RainbowTulipModel model;

    public RainbowTulipBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        this.model = new RainbowTulipModel(ctx.bakeLayer(RainbowTulipModel.LAYER_LOCATION));
    }

    @Override
    public void render(RainbowTulipBlockEntity blockEntity, float partialTick,
                       PoseStack poseStack, MultiBufferSource bufferSource,
                       int packedLight, int packedOverlay) {

        BlockPos pos = blockEntity.getBlockPos();
        int hash = Mth.positiveModulo(pos.getX() * 73856093 ^ pos.getZ() * 19349663, 4);
        float yRot = ROTATIONS[hash];

        // Get biome grass color
        Biome biome = blockEntity.getLevel().getBiome(pos).value();
        BiomeSpecialEffects effects = biome.getSpecialEffects();
        int grassColor = effects.getGrassColorOverride()
                .orElseGet(() -> effects.getFoliageColorOverride()
                        .orElse(DEFAULT_GRASS));

        poseStack.pushPose();
        poseStack.translate(0.5, 0.0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(yRot));
        poseStack.scale(2.4F, -2.4F, 2.4F);
        poseStack.translate(0.0, -1.5, 0.0);

        var buffer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));
        model.renderWithBiomeTint(poseStack, buffer, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY, grassColor);

        poseStack.popPose();
    }
}
