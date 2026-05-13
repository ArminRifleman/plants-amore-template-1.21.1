package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.blockentity.RainbowTulipBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {

    public static BlockEntityType<RainbowTulipBlockEntity> RAINBOW_TULIP_BE;

    public static void register() {
        RAINBOW_TULIP_BE = Registry.register(
                BuiltInRegistries.BLOCK_ENTITY_TYPE,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", "rainbow_tulip"),
                BlockEntityType.Builder.of(RainbowTulipBlockEntity::new, ModBlocks.RAINBOW_TULIP).build(null)
        );
    }
}