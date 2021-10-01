package io.github.blocksnmore.skyblock;

import co.aikar.commands.PaperCommandManager;
import io.github.blocksnmore.skyblock.commands.PingWars;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Skyblock extends JavaPlugin {

    public static PaperCommandManager commandManager;
    public static FileConfiguration config;


    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        Skyblock.config = getConfig();
        Skyblock.commandManager = new PaperCommandManager(this);
        Skyblock.commandManager.registerCommand(new PingWars());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
