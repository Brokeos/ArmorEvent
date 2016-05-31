package com.inkzzz.spigot.armorevent;

import com.inkzzz.spigot.armorevent.PlayerArmorEquipEvent;
import com.inkzzz.spigot.armorevent.PlayerArmorUnequipEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.junit.Test;

/**
 * Created by Luke Denham on 31/05/2016.
 */
public class ArmorTest extends JavaPlugin implements Listener
{

    @Override
    public final void onEnable()
    {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Test
    @EventHandler
    public final void onEvent(final PlayerArmorEquipEvent event)
    {
        Bukkit.broadcastMessage( event.getPlayer().getName() + " has equipped " + event.getItemStack().getType().name() );
    }

    @Test
    @EventHandler
    public final void onEvent(final PlayerArmorUnequipEvent event)
    {
        Bukkit.broadcastMessage( event.getPlayer().getName() + " has unequipped " + event.getItemStack().getType().name() );
    }

}
