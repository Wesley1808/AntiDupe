package me.wesley1808.antidupe.forge;

import me.wesley1808.antidupe.AntiDupe;
import net.neoforged.fml.common.Mod;

@Mod(AntiDupe.MOD_ID)
public class AntiDupeNeoforge {

    public AntiDupeNeoforge() {
        AntiDupe.initialize();
    }
}