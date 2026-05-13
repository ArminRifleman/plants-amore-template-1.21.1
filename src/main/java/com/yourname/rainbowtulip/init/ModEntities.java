package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.RainbowTulipMod;
import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<RainbowTulipEntity> RAINBOW_TULIP =
        EntityType.Builder.<RainbowTulipEntity>create(RainbowTulipEntity::new, SpawnGroup.MISC)
            .dimensions(1.0F, 1.5F)
            .build();

    public static void register() {
        Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(RainbowTulipMod.MOD_ID, "rainbow_tulip"),
            RAINBOW_TULIP
        );
    }
}
