package com.xMatyDen.cmdLogger.services;

import com.xMatyDen.cmdLogger.CmdLogger;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class ConfigServices {
    private final FileConfiguration config;

    public ConfigServices(CmdLogger plugin) {
        this.config = plugin.getConfig();
    }

    public String getOnEnableMessage() {
        return config.getString("OnEnable");
    }

    public String getOnDisableMessage() {
        return config.getString("OnDisable");
    }

    public String getBotToken() {
        return config.getString("BotSettings.botToken");
    }

    public String getBotID() {
        return config.getString("BotSettings.botID");
    }

    public String getChatID() {
        return config.getString("BotSettings.chatID");
    }

    public List<String> getLogCommands() {
        return config.getStringList("LogCommands");
    }

    public String getSendLogMessage() {
        return config.getString("SendLog");
    }

}
