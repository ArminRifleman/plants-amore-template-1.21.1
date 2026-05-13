package com.yourname.rainbowtulip.entity.client;

import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RainbowTulipRenderer extends MobEntityRenderer<RainbowTulipEntity, RainbowTulipModel> {

    private static final Identifier TEXTURE =
        Identifier.of("rainbowtulip", "textures/entity/rainbow_tulip.png");

    public RainbowTulipRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RainbowTulipModel(ctx.getPart(RainbowTulipModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public Identifier getTexture(RainbowTulipEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RainbowTulipEntity entity, float yaw, float tickDelta,
                       MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {

        World world = entity.getWorld();
        BlockPos pos = entity.getBlockPos();

        // Sample biome foliage color at the entity's position
        int color = world.getFoliageColor(pos);

        float r = (float)((color >> 16) & 0xFF) / 255f;
        float g = (float)((color >> 8)  & 0xFF) / 255f;
        float b = (float)( color        & 0xFF) / 255f;

        // Pack r,g,b,a into a single ARGB int (1.21.1 render API)
        int tint = (0xFF << 24) | ((int)(r * 255) << 16) | ((int)(g * 255) << 8) | (int)(b * 255);

        matrices.push();
        this.setupTransforms(entity, matrices, tickDelta, yaw, tickDelta, 1.0f);
        this.scale(entity, matrices, tickDelta);

        this.model.render(
            matrices,
            vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(TEXTURE)),
            light,
            getOverlay(entity, 0.0f),
            tint
        );

        matrices.pop();

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }
}
