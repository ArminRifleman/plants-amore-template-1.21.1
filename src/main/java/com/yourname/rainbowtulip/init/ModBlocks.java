package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.block.RainbowTulipBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    public static final Block RAINBOW_TULIP = new RainbowTulipBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn((s, g, p, t) -> false)
    );

    public static void register() {
        Registry.register(
                BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", "rainbow_tulip"),
                RAINBOW_TULIP
        );

        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", "rainbow_tulip"),
                new BlockItem(RAINBOW_TULIP, new Item.Properties())
        );
    }
}