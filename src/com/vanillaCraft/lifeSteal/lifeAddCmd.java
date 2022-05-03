package com.vanillaCraft.lifeSteal;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class lifeAddCmd implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        lifeStealMethod l = new lifeStealMethod();
        Player p = (Player) sender;
        if (p.isOp()) {
            if (cmd.getName().equals("lifeadd")) {
                if (args.length < 3 && args.length > 0) {
                    l.addHealth(args[0], Integer.parseInt(args[1]));
                }
            }
        }
        return true;
    }
    
}
