package it.heroeminecratti.MobSpawnerSay;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.Listener;

public class MyEvents implements Listener
{
    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Material material = block.getType();
        Player player = event.getPlayer();
        if (material.equals((Object)Material.SPAWNER)) {
            player.sendMessage(ChatColor.GREEN + "Hai distrutto uno spawner");
        }
    }
}
