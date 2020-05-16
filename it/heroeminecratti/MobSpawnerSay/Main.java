package it.heroeminecratti.MobSpawnerSay;

import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)new MyEvents(), (Plugin)this);
    }
    
    public void onDisable() {
    }
}
