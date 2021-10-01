package io.github.blocksnmore.skyblock.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Dependency;
import io.github.blocksnmore.skyblock.Skyblock;
import io.github.blocksnmore.skyblock.util.Color;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

@CommandAlias("pingwar")
public class PingWars extends BaseCommand {
    @Dependency("Main")
    private static Skyblock main;
    @Default
    public void onDefault (Player p){
        Bukkit.broadcast(Component.text(Color.applyColor("&d[Ping Wars] &eGetting Ping...")));
        main.getServer().getScheduler().scheduleSyncDelayedTask(main, new Runnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()){
                    int playerPing = getPlayerPing(player);
                }
            }
        },20*1);
    }
    private int getPlayerPing(Player p) {
        int ping = -1;
        try {
            ping = p.getClass()
                    .getMethod("getHandle")
                    .invoke(p)
                    .getClass()
                    .getField("ping")
                    .getInt(p.getClass().getMethod("getHandle").invoke(p));
        } catch (Exception exception) {
        }
        return ping;
    }
}
