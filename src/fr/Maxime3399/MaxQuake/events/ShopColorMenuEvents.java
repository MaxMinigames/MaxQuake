package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scheduler.BukkitRunnable;

import fr.Maxime3399.MaxQuake.MainClass;
import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipCurrent;
import fr.Maxime3399.MaxQuake.equip.EquipLast;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.menus.ConfirmMenu;
import fr.Maxime3399.MaxQuake.menus.ShopColorMenu;
import fr.Maxime3399.MaxQuake.menus.ShopMainMenu;
import fr.Maxime3399.MaxQuake.utils.CostUtils;
import fr.Maxime3399.MaxQuake.utils.StringUtils;

public class ShopColorMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}else if(e.getInventory().getName().equalsIgnoreCase("§8Laser")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
				
				if(name.contains("§bLaser")){
					
					p.sendMessage("§cElement déjà équippé !");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§aLaser")){
					
					String item = name.replaceAll("§aLaser ", "");
					
					qp.setEnable(qp.getEnable().replaceAll(EquipCurrent.getColorString(qp), "color"+StringUtils.counter(item)));
					p.sendMessage("§aElement équippé !");
					p.playSound(p.getLocation(), Sound.ANVIL_LAND, 100, 1);
					ShopColorMenu.openMenu(p);
					
				}else if(name.contains("§cLaser")){
					
					p.sendMessage("§cTu n'as pas assez de coins !");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§4Laser")){
					
					p.sendMessage("§cTu dois avoir le laser précédent !");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§6Laser")){
					
					String item = name.replaceAll("§6Laser ", "");
					ConfirmMenu.confirm(p);
					
					new BukkitRunnable() {
						
						@Override
						public void run() {
							
							if(ConfirmMenu.getPlayer(p) == 1){
								
								ConfirmMenu.removePlayer(p);
								this.cancel();
								Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
									@Override
									public void run() {
										int cost = CostUtils.getColorCost(EquipLast.getColor(qp)+1);
										qp.setCoins(qp.getCoins()-cost);
										qp.setItems(qp.getItems().replaceAll("color"+StringUtils.counter(""+EquipLast.getColor(qp)), "color"+StringUtils.counter(item)));
										ShopColorMenu.openMenu(p);
										p.sendMessage("§aAchat effectué !");
										p.playSound(p.getLocation(), Sound.NOTE_PLING, 100, 2);
									}
								}, 1);
								
							}else if(ConfirmMenu.getPlayer(p) == 2){
								
								this.cancel();
								ConfirmMenu.removePlayer(p);
								Bukkit.getScheduler().scheduleSyncDelayedTask(MainClass.getInstance(), new Runnable() {
									@Override
									public void run() {
										ShopColorMenu.openMenu(p);
										p.sendMessage("§cAchat annulé.");
										p.playSound(p.getLocation(), Sound.VILLAGER_DEATH, 100, 1);
									}
								}, 1);
								
							}
							
						}
						
					}.runTaskTimerAsynchronously(MainClass.getInstance(), 1, 1);
					
				}else if(name.equalsIgnoreCase("§8§oRetour")){
					
					ShopMainMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.CLICK, 100, 1);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
