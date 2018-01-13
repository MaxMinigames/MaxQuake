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
import fr.Maxime3399.MaxQuake.menus.ShopExplodeMenu;
import fr.Maxime3399.MaxQuake.menus.ShopMainMenu;
import fr.Maxime3399.MaxQuake.utils.CostUtils;
import fr.Maxime3399.MaxQuake.utils.StringUtils;

public class ShopExplodeMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}else if(e.getInventory().getName().equalsIgnoreCase("§8Explosion")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
				
				if(name.contains("§bExplosion")){
					
					p.sendMessage("§cElement déjà équippé !");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§aExplosion")){
					
					String item = name.replaceAll("§aExplosion ", "");
					
					qp.setEnable(qp.getEnable().replaceAll(EquipCurrent.getExplodeString(qp), "explode"+StringUtils.counter(item)));
					p.sendMessage("§aElement équippé !");
					p.playSound(p.getLocation(), Sound.ANVIL_LAND, 100, 1);
					ShopExplodeMenu.openMenu(p);
					
				}else if(name.contains("§cExplosion")){
					
					p.sendMessage("§cTu n'as pas assez de coins !");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§4Explosion")){
					
					p.sendMessage("§cTu dois avoir l'explosion précédente !");
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 100, 1);
					
				}else if(name.contains("§6Explosion")){
					
					String item = name.replaceAll("§6Explosion ", "");
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
										int cost = CostUtils.getExplodeCost(EquipLast.getExplode(qp)+1);
										qp.setCoins(qp.getCoins()-cost);
										qp.setItems(qp.getItems().replaceAll("explode"+StringUtils.counter(""+EquipLast.getExplode(qp)), "explode"+StringUtils.counter(item)));
										ShopExplodeMenu.openMenu(p);
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
										ShopExplodeMenu.openMenu(p);
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
