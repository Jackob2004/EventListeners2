package me.shadow_warrior_.eventlistener2.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.potion.PotionEffectType.INCREASE_DAMAGE;

public class KillListener implements Listener {
    @EventHandler
    public void onPlayerKill(EntityDeathEvent e) {
        Player player = e.getEntity().getKiller();
        if (player.hasPermission("eventlistener2.szal")) {
            PotionEffect effect = e.getEntity().getKiller().getPotionEffect(PotionEffectType.WATER_BREATHING);
                if (effect != null) {
                    player.addPotionEffect(new PotionEffect(INCREASE_DAMAGE, 40, 20));
                }
            }


    }
}
