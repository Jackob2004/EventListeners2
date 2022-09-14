package me.shadow_warrior_.eventlistener2;

import me.shadow_warrior_.eventlistener2.listeners.ShearSheepListener;
import me.shadow_warrior_.eventlistener2.listeners.XPBottleBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListener2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(),this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
