package me.shadow_warrior_.eventlistener2;
import me.shadow_warrior_.eventlistener2.listeners.KillListener;
import me.shadow_warrior_.eventlistener2.listeners.ShearSheepListener;
import me.shadow_warrior_.eventlistener2.listeners.SnowballListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListener2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new SnowballListener(),this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new KillListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
