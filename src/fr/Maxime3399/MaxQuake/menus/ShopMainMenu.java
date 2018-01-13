package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipCounts;
import fr.Maxime3399.MaxQuake.equip.EquipItems;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class ShopMainMenu {
	
	public static void openMenu(Player p){
		
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		Inventory i = Bukkit.createInventory(null, 27, "§8Boutique");
		
		ItemStack IScase = EquipItems.getRailgunType(qp);
		ItemMeta IMcase = IScase.getItemMeta();
		ArrayList<String> ALcase = new ArrayList<>();
		IMcase.setDisplayName("§eApparence");
		ALcase.add("§9§l>§r §7Clique pour accèder");
		ALcase.add("§7au menu");
		ALcase.add(" ");
		ALcase.add("§7Débloqué : "+EquipCounts.getCases(qp)+"/14 ( "+EquipCounts.getCasePercentage(qp)+"% )");
		IMcase.setLore(ALcase);
		IScase.setItemMeta(IMcase);
		i.setItem(10, IScase);
		
		ItemStack IStrigger = EquipItems.getTriggerType(qp);
		ItemMeta IMtrigger = IStrigger.getItemMeta();
		ArrayList<String> ALtrigger = new ArrayList<>();
		IMtrigger.setDisplayName("§eRechargement");
		ALtrigger.add("§9§l>§r §7Clique pour accèder");
		ALtrigger.add("§7au menu");
		ALtrigger.add(" ");
		ALtrigger.add("§7Débloqué : "+EquipCounts.getTriggers(qp)+"/9 ( "+EquipCounts.getTriggerPercentage(qp)+"% )");
		IMtrigger.setLore(ALtrigger);
		IStrigger.setItemMeta(IMtrigger);
		i.setItem(12, IStrigger);
		
		ItemStack ISexplode = EquipItems.getExplodeType(qp);
		ItemMeta IMexplode = ISexplode.getItemMeta();
		ArrayList<String> ALexplode = new ArrayList<>();
		IMexplode.setDisplayName("§eExplosion");
		ALexplode.add("§9§l>§r §7Clique pour accèder");
		ALexplode.add("§7au menu");
		ALexplode.add(" ");
		ALexplode.add("§7Débloqué : "+EquipCounts.getExplodes(qp)+"/5 ( "+EquipCounts.getExplodesPercentage(qp)+"% )");
		IMexplode.setLore(ALexplode);
		ISexplode.setItemMeta(IMexplode);
		i.setItem(14, ISexplode);
		
		ItemStack IScolor = EquipItems.getColorType(qp);
		ItemMeta IMcolor = IScolor.getItemMeta();
		ArrayList<String> ALcolor = new ArrayList<>();
		IMcolor.setDisplayName("§eLaser");
		ALcolor.add("§9§l>§r §7Clique pour accèder");
		ALcolor.add("§7au menu");
		ALcolor.add(" ");
		ALcolor.add("§7Débloqué : "+EquipCounts.getColors(qp)+"/23 ( "+EquipCounts.getColorsPercentage(qp)+"% )");
		IMcolor.setLore(ALcolor);
		IScolor.setItemMeta(IMcolor);
		i.setItem(16, IScolor);
		
		p.openInventory(i);
		
	}

}
