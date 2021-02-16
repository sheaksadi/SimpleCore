package me.sheak.sadi.Core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Commands implements CommandExecutor {

    List<Integer> list;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args){
        if(str.equalsIgnoreCase("discord")){
            if(sender instanceof Player){
                sender.sendMessage(ChatColor.GREEN +"https://discord.gg/Sb4ZNqvC");
                return true;
            }
        }



        if(str.equalsIgnoreCase("giveway")){
            if (sender.hasPermission("giveway")){
                if(args.length>=2){
                    try {
                        String arg0 = args[0];
                        String arg1 = args[1];
                        String arg2 = args[2];
                        int amount = Integer.parseInt(args[3]);
                        int times=1;

                            try {
                                times = Integer.parseInt(args[4]);
                            }
                            catch (Exception e){
                             times =1;
                            }

                        int activeplayers = Bukkit.getOnlinePlayers().size();

                        Player[] players= Bukkit.getOnlinePlayers().toArray(new Player[activeplayers]);

                        for( int x = 0;x <times;x++ ){
                            int randomplayer=returnrand(activeplayers,sender);
                            Bukkit.dispatchCommand(sender,arg0+" "+arg1+" "+arg2+" "+players[randomplayer].getDisplayName()+" "+amount);

                        }
                    }
                    catch (IllegalArgumentException e){
                        sender.sendMessage(ChatColor.RED+"/giveway crates givekey <crate> <amount> <winners>");
                    }

                }else {
                    sender.sendMessage(ChatColor.BLUE+"/giveway crates givekey <crate> <amount> <winners>");
                }

            }
        }
        return false;
    }

    public int returnrand(int activeplayers ,CommandSender sender){
        try {
            Random rand = new Random();
            int randomplayer = rand.nextInt(activeplayers);
            list = new ArrayList<Integer>();
            if (list.contains(randomplayer))
                returnrand(activeplayers,sender);

            list.add(randomplayer);


            return randomplayer;
        }catch (Exception e){
            sender.sendMessage(ChatColor.RED+"Their aren't that much player");
        }
        return 1;
    }
}
