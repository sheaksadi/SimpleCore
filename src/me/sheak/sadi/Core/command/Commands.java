package me.sheak.sadi.Core.command;

import me.sheak.sadi.Core.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;


public class Commands implements CommandExecutor {


    private final Main plugin;

    public Commands(Main plugin) {
        this.plugin = plugin;
    }
    private BossBar bar;

    private int taskid=-1;

    private boolean barrunning=false;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args){
        if(str.equalsIgnoreCase("discord")){
            if(sender instanceof Player){
                if (args.length==0) {
                    TextComponent massage = new TextComponent(ChatColor.GREEN+ "Deadhorse"+ChatColor.YELLOW+"*smp "+ChatColor.BOLD+ "Discord");
                    massage.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/Twt8u7zUbh"));
                    massage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new Text(ChatColor.GOLD+ "Click here to join Discord Server")));
                    //sender.sendMessage(ChatColor.GREEN +"https://discord.gg/Twt8u7zUbh");
                    sender.spigot().sendMessage(massage);
                    return true;
                }
            }
        }


        if(str.equalsIgnoreCase("giveway")){
            if (sender.hasPermission("giveway")){
                if(args.length>=2){
                    if (barrunning){
                        sender.sendMessage(format("&c[&adeadhorse&e*giveaway&c]&bA giveway is already running "));
                        return true;
                    }

                    try {


                        //String arg = args[0];
                        String arg1=null;
                        String arg2=null ;
                        String arg3=null;
                        String arg4=null;
                        String arg5=null;
                        String arg6=null;
                        String arg7=null;
                        String arg8 =null;
                        String arg9=null;
                        String arg0 =null;

                        try {
                            if(args[1]!=null)
                            arg1 = args[1];
                        }
                        catch (Exception e){

                        }
                        try {
                        if(args[2]!=null)
                            arg2 = args[2];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[3]!=null)
                                arg3 = args[3];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[4]!=null)
                                arg4 = args[4];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[5]!=null)
                                arg5 = args[5];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[6]!=null)
                                arg6 = args[6];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[7]!=null)
                                arg7 = args[7];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[8]!=null)
                                arg8 = args[8];
                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[9]!=null)
                                arg9 = args[9];

                        }
                        catch (Exception e){

                        }
                        try {
                            if(args[10]!=null)
                                arg0 = args[0];
                        }
                        catch (Exception e){

                        }

                        String commandd ;

                       // int amount = Integer.parseInt(args[3]);
                        int times=1;

                            try {
                                times = Integer.parseInt(args[0]);
                            }
                            catch (Exception e){
                             sender.sendMessage(ChatColor.AQUA+"/giveway <winners> <command> (use player insted of name player will be chenged to winner )");
                             return  true;
                            }

                            //Player player = (Player)sender;


                        int activeplayers = Bukkit.getOnlinePlayers().size();

                        Player[] players= Bukkit.getOnlinePlayers().toArray(new Player[activeplayers]);

                        ArrayList<Integer> list = new ArrayList<Integer>();
                        for (int i=0; i<activeplayers; i++) {
                            list.add(i);
                        }
                        Collections.shuffle(list);

                       // if (activeplayers==1) {
                        ///    Bukkit.dispatchCommand(sender, arg0 + " " + arg1 + " " + arg2 + " " + players[0].getDisplayName() + " " + amount);
                         //   return true;
                        //}
                        try{
                            commandd="dad";

                            if(arg1!=(null))
                                commandd=arg1;

                            if(arg2!=(null))
                                commandd=arg1+" "+arg2;

                            if(arg3!=(null))
                                commandd=arg1+" "+arg2+" "+arg3;

                            if(arg4!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4;

                            if(arg5!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4+" "+arg5;

                            if(arg6!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4+" "+arg5+" "+arg6;

                            if(arg7!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4+" "+arg5+" "+arg6+" "+arg7;

                            if(arg8!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4+" "+arg5+" "+arg6+" "+arg7+" "+arg8;

                            if(arg9!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4+" "+arg5+" "+arg6+" "+arg7+" "+arg8+" "+arg9;

                            if(arg0!=(null))
                                commandd=arg1+" "+arg2+" "+arg3+" "+arg4+" "+arg5+" "+arg6+" "+arg7+" "+arg8+" "+arg9+" "+arg0;


                            final int Times=times;

                            final String Commandd=commandd;

                            sender.getServer().broadcastMessage(format("&c[&adeadhorse&e*giveaway&c]")+ChatColor.YELLOW+ " Giveaway has been started!");





                            bar= Bukkit.createBossBar(format("&e&lGiveaway has been started!"), BarColor.YELLOW, BarStyle.SOLID);
                            bar.setVisible(true);
                            barrunning=true;

                            for(Player p :Bukkit.getOnlinePlayers()){
                                bar.addPlayer(p);
                                p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 2.0F, 1.0F);

                            }



                            //bar.addPlayer((Player)sender);

                            taskid=Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                                //int count =-1;
                                double progress =1.0;
                                double time=1.0/400;

                                @Override
                                public void run() {
                                try {
                                    bar.setProgress(progress);
                                }catch (Exception e){
                                    bar.removeAll();
                                    Bukkit.getScheduler().cancelTask(taskid);
                                    sender.sendMessage(ChatColor.RED +"too many giveways");

                                }
                                    progress=progress-time;
                                    if(progress<=0){
                                        bar.removeAll();

                                    try {


                                        for (int x = 0; x < Times; x++) {
                                            int randomplayer = list.get(x);

                                            String ncommand = Commandd.replaceAll("player", players[randomplayer].getName());
                                            sender.getServer().broadcastMessage(format("&c[&adeadhorse&e*giveaway&c]") + ChatColor.YELLOW + "" + ChatColor.BOLD + players[randomplayer].getDisplayName() + "" + ChatColor.AQUA + " has won the giveaway!");
                                            Bukkit.dispatchCommand(sender, ncommand);


                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 2.5F, 1.0F);

                                            }

                                        }
                                    } catch (Exception e) {
                                        sender.sendMessage(format("&c[&adeadhorse&e*giveaway&c]")+ChatColor.AQUA+"Their aren't that much player");
                                    }
                                        barrunning=false;
                                        Bukkit.getScheduler().cancelTask(taskid);
                                        return;
                                    }


                                }
                            },0,0);


                        }catch (Exception e){
                            sender.sendMessage(ChatColor.RED+"Their aren't that much player");
                        }
                    }
                    catch (Exception e){
                        sender.sendMessage(ChatColor.RED+"/giveway <winners> <command> (use player insted of name player will be chenged to winner )");
                    }

                }else {
                    sender.sendMessage(ChatColor.BLUE+"/giveway <winners> <command> (use player insted of name player will be chenged to winner )");
                }
                return true;
            }
        }
        return true;
    }




    public String format(String msg)
    {
        return ChatColor.translateAlternateColorCodes('&',msg);
    }

}
