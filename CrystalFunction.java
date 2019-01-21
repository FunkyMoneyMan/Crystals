package net.prosavage.crystals;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CrystalFunction {
    public void giveCrystal(Player player, Integer amount) {
        ItemStack crystals = new ItemStack(Material.QUARTZ, amount);
        ItemMeta meta = crystals.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lRealm Crystal"));
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.translateAlternateColorCodes('&',"&7A vibrant realm crystal that"));
        lore.add(ChatColor.translateAlternateColorCodes('&',"&7shakes upon being held."));
        meta.setLore(lore);
        crystals.setItemMeta(meta);
        player.getInventory().addItem(crystals);
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYou have recieved some realm crystals"));
    }
}
