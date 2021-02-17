package me.sheak.sadi.Core.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;




public class Commands implements CommandExecutor {


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
                             times =1;
                            }

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


                            sender.sendMessage(commandd);


                            for( int x = 0;x <times;x++ ){
                                 int randomplayer=list.get(x);

                                String ncommand= commandd.replaceAll("player",players[randomplayer].getName());

                                sender.sendMessage(ncommand);

                                Bukkit.dispatchCommand(sender,ncommand);

                             }
                        }catch (Exception e){
                            sender.sendMessage(ChatColor.RED+"Their aren't that much player");
                        }
                    }
                    catch (Exception e){
                        sender.sendMessage(ChatColor.RED+"/giveway <winners> <command> (use player insted of name player will be chenged to winner )");
                    }

                }else {
                    sender.sendMessage(ChatColor.BLUE+"/giveway <winners> <command> (use player insted of name player will be chenged to winner ");
                }
                return true;
            }
        }
        return true;
    }

}
