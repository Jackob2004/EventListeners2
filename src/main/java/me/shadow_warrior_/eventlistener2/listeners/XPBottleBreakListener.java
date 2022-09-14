package me.shadow_warrior_.eventlistener2.listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class XPBottleBreakListener implements Listener {

    @EventHandler
    public void  onProjectileHitEvent(ProjectileHitEvent e) {
        String name = e.getEntity().getName();
        System.out.println(name);
        if (name.equals("Snowball")) {
            Block block = e.getHitBlock();
            block.breakNaturally();
        }
        }



}
