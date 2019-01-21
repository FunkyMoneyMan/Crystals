package net.prosavage.crystals;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MiningEvent extends CrystalFunction implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        double random = Math.random();
        if (event.getBlock().getType() == Material.EMERALD_ORE) {
            if (random < .05)
                giveCrystal(event.getPlayer(), 1);
        }
        if (event.getBlock().getType() == Material.DIAMOND_ORE) {
            if (random < .04)
                giveCrystal(event.getPlayer(), 1);
        }
        if (event.getBlock().getType() == Material.GOLD_ORE) {
            if (random < .03)
                giveCrystal(event.getPlayer(), 1);
        }
        if (event.getBlock().getType() == Material.LAPIS_ORE) {
            if (random < .02)
                giveCrystal(event.getPlayer(), 1);
        }
        if (event.getBlock().getType() == Material.LAPIS_ORE) {
            if (random < .01)
                giveCrystal(event.getPlayer(), 1);
        }
    }
}
