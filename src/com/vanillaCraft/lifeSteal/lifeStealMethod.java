package com.vanillaCraft.lifeSteal;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class lifeStealMethod {
    public void changeHealth(Player slayer, Player victim) {
        slayer.setMaxHealth(slayer.getMaxHealth() + 1);
        victim.setMaxHealth(victim.getMaxHealth() - 1);
    }
    public void addHealth(String playerName, int amnt) {
        Player p = Bukkit.getServer().getPlayer(playerName);
        p.setMaxHealth(p.getMaxHealth() + amnt);
    }
    public void subtractHealth(String playerName, int amnt) {
        Player p = Bukkit.getServer().getPlayer(playerName);
        p.setMaxHealth(p.getMaxHealth() - amnt);
    }
}
