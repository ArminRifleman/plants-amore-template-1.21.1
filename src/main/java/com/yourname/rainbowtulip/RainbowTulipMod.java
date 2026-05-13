package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.init.ModEntities;
import net.fabricmc.api.ModInitializer;

public class RainbowTulipMod implements ModInitializer {

    public static final String MOD_ID = "rainbowtulip";

    @Override
    public void onInitialize() {
        ModEntities.register();
    }
}
