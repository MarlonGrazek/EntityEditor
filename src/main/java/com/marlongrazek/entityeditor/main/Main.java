package com.marlongrazek.entityeditor.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("§eEntityEditor §fsuccessfully enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
