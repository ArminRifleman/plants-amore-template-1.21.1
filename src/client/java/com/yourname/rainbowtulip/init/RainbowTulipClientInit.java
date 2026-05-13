package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import com.yourname.rainbowtulip.blockentity.renderer.RainbowTulipBlockEntityRenderer;

public class RainbowTulipClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register the Blockbench model layer so it can be baked
        EntityModelLayerRegistry.registerModelLayer(
            RainbowTulipModel.LAYER_LOCATION,
            RainbowTulipModel::createBodyLayer
        );

        // Wire the block entity type to its renderer
        // Replace ModBlockEntities.RAINBOW_TULIP with your actual BlockEntityType field
        BlockEntityRendererRegistry.register(
            ModBlockEntities.RAINBOW_TULIP_BE,          // <-- your BlockEntityType<RainbowTulipBlockEntity>
            RainbowTulipBlockEntityRenderer::new
        );
    }
}
