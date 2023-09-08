package com.sieadev.allthebasics.commands.gamemode;

import com.sieadev.allthebasics.util.changeGamemode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.GameMode;
import org.bukkit.plugin.java.JavaPlugin;

public class gm2 implements CommandExecutor {
  
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("§cYou can not use this command in the Console.");
            return true;
        }
        Player p = (Player) sender;
        if (args.length > 0){
            String target = args[0];
            changeGamemode.changeGamemode(p, target, GameMode.ADVENTURE);
            return true;
        }
        changeGamemode.changeGamemode(p, null, GameMode.ADVENTURE);
        return true;
    }
}
