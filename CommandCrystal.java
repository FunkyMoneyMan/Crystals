package net.prosavage.crystals;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandCrystal extends CrystalFunction implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player) && !sender.hasPermission("crystal.give")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l[!] &cYou do not have permission!"));
            return true;
        }
        if (args.length != 2) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l[!] &cInvalid arguments. Use /crystal <player> <amount>"));
            return true;
        }
        if (Bukkit.getPlayer(args[0]) != null) {
            try {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aGiven " + args[1] + " &acrystals to " + args[0]));
                giveCrystal(Bukkit.getPlayer(args[0]), Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l[!] &cThe number you inserted was not a valid number"));
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l[!] &cThat player is not online"));
           }
        return true;
    }
}

