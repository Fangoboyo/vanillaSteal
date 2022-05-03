package com.vanillaCraft.lifeSteal;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class listener implements Listener{
    @EventHandler
    public void onPlayerSlain(PlayerDeathEvent e) {
        Player victim = e.getEntity();
        
        // null checker
        if (victim.getKiller() == null) {
            return;
        }
        Player killer = victim.getKiller();
        lifeStealMethod l = new lifeStealMethod();
        l.changeHealth(killer, victim);
    }
}
