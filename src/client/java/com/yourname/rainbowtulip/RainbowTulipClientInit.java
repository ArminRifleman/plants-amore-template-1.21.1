package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.blockentity.renderer.RainbowTulipBlockEntityRenderer;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import com.yourname.rainbowtulip.init.ModBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class RainbowTulipClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register the model layer so bakeLayer() works in the renderer constructor
        EntityModelLayerRegistry.registerModelLayer(
            RainbowTulipModel.LAYER_LOCATION,
            RainbowTulipModel::createBodyLayer
        );

        // Register the block entity renderer
        BlockEntityRendererRegistry.register(
            ModBlockEntities.RAINBOW_TULIP_BE,
            RainbowTulipBlockEntityRenderer::new
        );
    }
}
