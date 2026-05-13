package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.RainbowTulipMod;
import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {

    public static final EntityType<RainbowTulipEntity> RAINBOW_TULIP =
        EntityType.Builder.<RainbowTulipEntity>of(RainbowTulipEntity::new, MobCategory.MISC)
            .sized(1.0F, 1.5F)
            .build("rainbowtulip:rainbow_tulip");

    public static void register() {
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(RainbowTulipMod.MOD_ID, "rainbow_tulip"),
            RAINBOW_TULIP
        );
    }
}
