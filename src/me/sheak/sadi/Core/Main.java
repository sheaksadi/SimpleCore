package me.sheak.sadi.Core;

import me.sheak.sadi.Core.command.Commands;
import me.sheak.sadi.Core.events.Playerjoin;
import me.sheak.sadi.Core.command.Tabcompleterrr;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Commands commands=new Commands();

        getServer().getPluginManager().registerEvents(new Playerjoin(),this);
        getCommand("discord").setExecutor(commands);
        getCommand("giveway").setExecutor(commands);
        getCommand("giveway").setTabCompleter(new Tabcompleterrr());
    }

    @Override
    public void onDisable() {

    }



}
