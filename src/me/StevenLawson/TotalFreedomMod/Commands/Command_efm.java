package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "See how to become admin.", aliases = "ai", usage = "/<command>")
public class Command_admininfo extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.playerMsg(sender_p, "Hey There! Your Viewing Info About Are mod!", ChatColor.BLUE);
        TFM_Util.playerMsg(sender_p, "Go to our forums at http://emeraldfreedomftw.boards.net", ChatColor.PURPLE);
        TFM_Util.playerMsg(sender_p, "Create a thread in the Super Admin applications forum following the template:", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "v-1 [BETA] Built by TheGamingSprite And reuben4545", ChatColor.RED);
        TFM_Util.playerMsg(sender_p, "we do need staff so go ahead and apply", ChatColor.DARK_GREEN);
        TFM_Util.playerMsg(sender_p, "Remember Follow the rules and stay EMERALD!", ChatColor.GOLD);
        return true;
    }
}
