package com.xMatyDen.cmdLogger;

import com.xMatyDen.cmdLogger.services.ConfigServices;
import org.bukkit.plugin.java.JavaPlugin;

public final class CmdLogger extends JavaPlugin {
    private final ConfigServices configServices;

    public CmdLogger(ConfigServices configServices) {
        this.configServices = configServices;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();
        getLogger().info(configServices.getOnEnableMessage());
    }

    @Override
    public void onDisable() {
        getLogger().info(configServices.getOnDisableMessage());
    }
}