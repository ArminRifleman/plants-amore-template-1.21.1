package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.entity.RainbowTulipEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "rainbowtulip");

    public static final RegistryObject<EntityType<RainbowTulipEntity>> RAINBOW_TULIP =
        ENTITY_TYPES.register("rainbow_tulip", () ->
            EntityType.Builder.<RainbowTulipEntity>of(RainbowTulipEntity::new, MobCategory.MISC)
                .sized(1.0F, 1.5F)
                .build("rainbow_tulip")
        );
}
