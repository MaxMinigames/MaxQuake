package fr.Maxime3399.MaxQuake.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.menus.SettingsMenu;

public class SettingsMenuEvents implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		if(e.getInventory() == null){
			
			return;
			
		}else if(e.getInventory().getName().equalsIgnoreCase("�8Param�tres")){
			
			if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR){
				
				return;
				
			}else{
				
				String name = e.getCurrentItem().getItemMeta().getDisplayName();
				Player p = (Player) e.getWhoClicked();
				QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
				
				if(name.contains("�a")){
					
					String par = "";
					if(name.equalsIgnoreCase("�aLaser")){
						par = "laser";
					}else if(name.equalsIgnoreCase("�aExplosions")){
						par = "explode";
					}else if(name.equalsIgnoreCase("�aParticules")){
						par = "particles";
					}else if(name.equalsIgnoreCase("�aSons")){
						par = "sounds";
					}else if(name.equalsIgnoreCase("�aMessages de mort")){
						par = "death";
					}else if(name.equalsIgnoreCase("�aMessages de gains")){
						par = "coins";
					}else if(name.equalsIgnoreCase("�aHologrammes")){
						par = "holo";
					}
					
					qp.setSettings(qp.getSettings()+par);
					SettingsMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.ARROW_HIT, 100, 2);
					
				}else if(name.contains("�c")){
					
					String par = "";
					if(name.equalsIgnoreCase("�cLaser")){
						par = "laser";
					}else if(name.equalsIgnoreCase("�cExplosions")){
						par = "explode";
					}else if(name.equalsIgnoreCase("�cParticules")){
						par = "particles";
					}else if(name.equalsIgnoreCase("�cSons")){
						par = "sounds";
					}else if(name.equalsIgnoreCase("�cMessages de mort")){
						par = "death";
					}else if(name.equalsIgnoreCase("�cMessages de gains")){
						par = "coins";
					}else if(name.equalsIgnoreCase("�cHologrammes")){
						par = "holo";
					}
					
					qp.setSettings(qp.getSettings().replaceAll(par, ""));
					SettingsMenu.openMenu(p);
					p.playSound(p.getLocation(), Sound.ARROW_HIT, 100, 2);
					
				}
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
