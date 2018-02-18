package de.dytanic.cloudnet.bridge.event.bukkit;

import de.dytanic.cloudnet.lib.player.OfflinePlayer;
import lombok.Getter;
import org.bukkit.event.HandlerList;

@Getter
public class BukkitOfflinePlayerUpdateEvent extends BukkitCloudEvent {

    private static final HandlerList handlerList = new HandlerList();

    private OfflinePlayer offlinePlayer;

    public BukkitOfflinePlayerUpdateEvent(OfflinePlayer offlinePlayer)
    {
        this.offlinePlayer = offlinePlayer;
    }

    @Override
    public HandlerList getHandlers()
    {
        return handlerList;
    }

    public static HandlerList getHandlerList()
    {
        return handlerList;
    }

}