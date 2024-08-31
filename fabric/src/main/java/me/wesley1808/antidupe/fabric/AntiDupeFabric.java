package me.wesley1808.antidupe.fabric;

import me.wesley1808.antidupe.AntiDupe;
import net.fabricmc.api.ModInitializer;

public class AntiDupeFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        AntiDupe.initialize();
    }
}