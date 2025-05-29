package com.xMatyDen.cmdLogger;

import com.xMatyDen.cmdLogger.services.ConfigServices;
import com.xMatyDen.cmdLogger.services.TelegramSendLog;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.List;

public class Logger implements Listener {
    private final ConfigServices configServices;
    private final List<String> trackedCommands;
    private final TelegramSendLog sendLog;

    public Logger(ConfigServices configServices, TelegramSendLog sendLog) {
        this.configServices = configServices;
        trackedCommands = configServices.getLogCommands();
        this.sendLog = sendLog;
    }

    @EventHandler
    public void LogCMD(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String command = event.getMessage().split(" ")[0];
        if (trackedCommands.contains(command.toLowerCase())) {
            String fullCommand = event.getMessage();
            Location loc = player.getLocation();
            String world = loc.getWorld().getName();
            double x = loc.getX();
            double y = loc.getY();
            double z = loc.getZ();

            String message = String.format(configServices.getSendLogMessage(), player.getName(), fullCommand, world, x, y, z);
            sendLog.sendLog(message);
        }
    }
}
