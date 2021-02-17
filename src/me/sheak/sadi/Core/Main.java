package me.sheak.sadi.Core;

import me.sheak.sadi.Core.command.Commands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Commands commands=new Commands(this);
        //getServer().getPluginManager().registerEvents(new Playerjoin(),this);
        getCommand("discord").setExecutor(commands);
        getCommand("giveway").setExecutor(commands);


    }

    @Override
    public void onDisable() {

    }



}
