package me.sheak.sadi.Core.events;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class Tabcompleterrr implements TabCompleter {

    List<String> argumwnts= new ArrayList<String>();
    List<String> argumwnts1= new ArrayList<String>();
    List<String> argumwnts2= new ArrayList<String>();
List<String> argumwnts3= new ArrayList<String>();
    List<String> argumwnts4= new ArrayList<String>();

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if(argumwnts.isEmpty()){
            argumwnts.add("crates");
        }
        if(argumwnts1.isEmpty()){
            argumwnts1.add("givekey");
        }
        if(argumwnts2.isEmpty()){
            argumwnts2.add("AllCrates");
            argumwnts2.add("BasicCrate");
            argumwnts2.add("BeginnerCrate");
            argumwnts2.add("ExpertCrate");
            argumwnts2.add("MasterCrate");
            argumwnts2.add("MiddleCrate");
            argumwnts2.add("MineChestExample");

        }
        if(argumwnts3.isEmpty()){
            argumwnts3.add("1");
            argumwnts3.add("32");
            argumwnts3.add("64");
        }
        if(argumwnts4.isEmpty()){
            argumwnts4.add("1");
        }
        List<String> result = new ArrayList<String>();
            if(strings.length==1){
                for(String a :argumwnts){
                    if(a.toLowerCase().startsWith(strings[0].toLowerCase()))
                        result.add(a);
                }
                return result;
            }
            List<String> result1 = new ArrayList<String>();
            if(strings.length==2){
                for(String a :argumwnts1){
                    if(a.toLowerCase().startsWith(strings[1].toLowerCase()))
                        result1.add(a);
                }
                return result1;
            }
            List<String> result2 = new ArrayList<String>();
            if(strings.length==3){
                for(String a :argumwnts2){
                    if(a.toLowerCase().startsWith(strings[2].toLowerCase()))
                        result2.add(a);
                }
                return result2;
            }
            List<String> result3 = new ArrayList<String>();
            if(strings.length==4){
                for(String a :argumwnts3){
                    if(a.toLowerCase().startsWith(strings[3].toLowerCase()))
                        result3.add(a);
                }
                return result3;
            }

            if(strings.length==5){
                return argumwnts4;
            }

        return null;
    }
}
