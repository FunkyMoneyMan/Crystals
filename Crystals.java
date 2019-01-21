package net.prosavage.crystals;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Crystals extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("crystal").setExecutor(new CommandCrystal());
        Bukkit.getPluginManager().registerEvents(new MiningEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
