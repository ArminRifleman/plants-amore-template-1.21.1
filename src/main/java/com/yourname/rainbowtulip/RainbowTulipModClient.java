package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import com.yourname.rainbowtulip.entity.client.RainbowTulipRenderer;
import com.yourname.rainbowtulip.init.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RainbowTulipModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register the model layer
        EntityModelLayerRegistry.registerModelLayer(
            RainbowTulipModel.LAYER_LOCATION,
            RainbowTulipModel::createBodyLayer
        );

        // Register the entity renderer
        EntityRendererRegistry.register(
            ModEntities.RAINBOW_TULIP,
            RainbowTulipRenderer::new
        );
    }
}
