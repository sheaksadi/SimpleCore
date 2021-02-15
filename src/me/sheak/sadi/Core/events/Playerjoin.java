package me.sheak.sadi.Core.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.*;

public class Playerjoin implements Listener {
    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e){
        if(!e.getPlayer().hasPlayedBefore() ){
            e.getPlayer().sendMessage(readfile());
        }
    }

    public void createfile(){

        try {
            FileWriter  fr = new FileWriter("plugins/core.txt",false);
            PrintWriter printWriter =new PrintWriter(fr);

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


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
            createfile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    return null;
    }

}
