package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import com.yourname.rainbowtulip.entity.client.RainbowTulipRenderer;
import com.yourname.rainbowtulip.init.ModEntities;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("rainbowtulip")
public class RainbowTulipMod {

    public RainbowTulipMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.ENTITY_TYPES.register(bus);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::registerRenderers);
    }

    private void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RainbowTulipModel.LAYER_LOCATION,
            RainbowTulipModel::createBodyLayer);
    }

    private void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RAINBOW_TULIP.get(),
            RainbowTulipRenderer::new);
    }
}
