package io.github.blocksnmore.skyblock.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import io.github.blocksnmore.skyblock.util.Color;
import org.bukkit.entity.Player;

@CommandAlias("pingwar")
public class PingWars extends BaseCommand {
    @Default
    public void onDefault (Player P){
        P.sendMessage(Color.applyColor("&8[PingWars] &#ff8686Penis"));
    }
}
