package com.xMatyDen.cmdLogger;

import com.xMatyDen.cmdLogger.services.ConfigServices;
import com.xMatyDen.cmdLogger.services.TelegramSendLog;
import org.bukkit.plugin.java.JavaPlugin;

public final class CmdLogger extends JavaPlugin {
    private ConfigServices configServices;
    private TelegramSendLog telegramSendLog;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        reloadConfig();
        this.configServices = new ConfigServices(this);
        this.telegramSendLog = new TelegramSendLog(configServices, this);
        getLogger().info(configServices.getOnEnableMessage());
        getServer().getPluginManager().registerEvents(new Logger(configServices, telegramSendLog), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(configServices.getOnDisableMessage());
    }
}