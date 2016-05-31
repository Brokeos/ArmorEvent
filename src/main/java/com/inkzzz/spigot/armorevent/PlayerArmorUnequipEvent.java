package com.inkzzz.spigot.armorevent;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Luke Denham on 31/05/2016.
 */
public final class PlayerArmorUnequipEvent extends Event
{

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final ItemStack itemStack;

    public PlayerArmorUnequipEvent(Player player, ItemStack itemStack)
    {
        this.player = player;
        this.itemStack = itemStack;
    }

    public Player getPlayer()
    {
        return this.player;
    }

    public ItemStack getItemStack()
    {
        return this.itemStack;
    }

    @Override
    public HandlerList getHandlers()
    {
        return PlayerArmorUnequipEvent.HANDLER_LIST;
    }

    public static HandlerList getHandlerList()
    {
        return PlayerArmorUnequipEvent.HANDLER_LIST;
    }
}
