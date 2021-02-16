package me.sheak.sadi.Core;

import me.sheak.sadi.Core.events.Playerjoin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Commands commands=new Commands();
        getServer().getPluginManager().registerEvents(new Playerjoin(),this);
        getCommand("discord").setExecutor(commands);
        getCommand("giveway").setExecutor(commands);
    }

    @Override
    public void onDisable() {

    }



}
