package com.inkzzz.spigot.armorevent;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Luke Denham on 31/05/2016.
 */
public final class ArmorEventPlugin extends JavaPlugin
{

    @Override
    public final void onEnable()
    {
        this.getServer().getPluginManager().registerEvents( new EventAnalyser(), this );
    }

}
