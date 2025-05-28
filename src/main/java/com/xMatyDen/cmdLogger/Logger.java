package com.xMatyDen.cmdLogger;

import com.xMatyDen.cmdLogger.services.ConfigServices;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerCommandSendEvent;

import java.util.List;

public class Logger implements Listener {
    private final ConfigServices configServices;
    private List<String> trackedCommands;

    public Logger(ConfigServices configServices) {
        this.configServices = configServices;
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
        }
    }
}
