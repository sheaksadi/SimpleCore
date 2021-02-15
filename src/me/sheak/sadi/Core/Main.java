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
        getServer().getPluginManager().registerEvents(new Playerjoin(),this);
    }

    @Override
    public void onDisable() {

    }
    public boolean onCommand(CommandSender sender, Command cmd,String str,String[] args){
        if(str.equalsIgnoreCase("discord")){
            if(sender instanceof Player){
                sender.sendMessage(ChatColor.GREEN +"https://discord.gg/Sb4ZNqvC");
                return true;
            }
        }
        return false;
    }
}
