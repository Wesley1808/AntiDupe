package me.wesley1808.antidupe;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class AntiDupe {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "antidupe";

    public static void initialize() {
        LOGGER.info("AntiDupe initialized");
    }
}
