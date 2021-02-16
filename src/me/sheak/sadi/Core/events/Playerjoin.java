package me.sheak.sadi.Core.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.*;

public class Playerjoin implements Listener {
    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e){
        if(e.getPlayer().hasPlayedBefore() ){
            e.getPlayer().sendMessage(readfile());
        }
    }

    public String createfile(){
        String st ="&adeadhorse&e*smp &7commands:\n" +
                "&e /sethome &a<name> &7 - set your home.\n" +
                "&e /home &a<name> &7 - teleport to your home.\n" +
                "&e /spawn &7 - teleport to spawn.\n" +
                "&e /tpa &a<name> &7 - send a tp request to another player.\n" +
                "&e /discord &7 - discord server.\n" +
                "&e /warp &a<name> &7 - teleport to a specified location.\n" +
                "&e /msg &a<name> <message> &7 - write a private message.\n" +
                "&e /land &7 - open protetion GUI.\n" +
                "&e /land help &7 - show protection help.";
        try {
            FileWriter  fr = new FileWriter("plugins/core.txt",false);
            PrintWriter printWriter =new PrintWriter(fr);
            printWriter.print(st);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return st;
    }

    public String readfile(){
        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader("plugins/core.txt"));
            String line ;
            StringBuffer sb = new StringBuffer();
            while ((line=bufferedReader.readLine())!=null){
            sb.append(line);
            sb.append("\n");
            }
            String s= sb.toString();
            String d ;
            d=ChatColor.translateAlternateColorCodes('&',s);
            return d;

        } catch (FileNotFoundException e) {
            String s=createfile();
            String d ;
            d=ChatColor.translateAlternateColorCodes('&',s);
            return d;

        } catch (IOException e) {
            e.printStackTrace();
        }

    return null;
    }

}
