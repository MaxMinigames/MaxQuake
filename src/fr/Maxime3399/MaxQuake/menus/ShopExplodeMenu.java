package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.equip.EquipLast;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.utils.CostUtils;

public class ShopExplodeMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 18, "§8Explosion");
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		ItemStack IS01 = new ItemStack(Material.SULPHUR);
		ItemMeta IM01 = IS01.getItemMeta();
		ArrayList<String> AL01 = new ArrayList<>();
		if(EquipLast.getExplode(qp) >= 1){
			AL01.add("§aDébloqué !");
			AL01.add(" ");
			if(qp.getEnable().contains("explode01")){
				IM01.setDisplayName("§bExplosion 1");
				AL01.add("§2Elément équipé");
			}else{
				IM01.setDisplayName("§aExplosion 1");
				AL01.add("§eClique pour équiper");
			}
		}
		IM01.setLore(AL01);
		IS01.setItemMeta(IM01);
		i.setItem(2, IS01);
		
		ItemStack IS02 = new ItemStack(Material.FEATHER);
		ItemMeta IM02 = IS02.getItemMeta();
		ArrayList<String> AL02 = new ArrayList<>();
		if(EquipLast.getExplode(qp) >= 2){
			AL02.add("§aDébloqué !");
			AL02.add(" ");
			if(qp.getEnable().contains("explode02")){
				IM02.setDisplayName("§bExplosion 2");
				AL02.add("§2Elément équipé");
			}else{
				IM02.setDisplayName("§aExplosion 2");
				AL02.add("§eClique pour équiper");
			}
		}else{
			AL02.add("§cBloqué !");
			AL02.add(" ");
			if(qp.getCoins() >= CostUtils.getExplodeCost(2)){
				IM02.setDisplayName("§6Explosion 2");
				AL02.add("§6Coût : "+CostUtils.getExplodeCost(2));
				AL02.add(" ");
				AL02.add("§eClique pour acheter");
			}else{
				IM02.setDisplayName("§cExplosion 2");
				AL02.add("§cCoût : "+CostUtils.getExplodeCost(2));
			}
		}
		IM02.setLore(AL02);
		IS02.setItemMeta(IM02);
		i.setItem(3, IS02);
		
		ItemStack IS03 = new ItemStack(Material.FIREBALL);
		ItemMeta IM03 = IS03.getItemMeta();
		ArrayList<String> AL03 = new ArrayList<>();
		if(EquipLast.getExplode(qp) >= 3){
			AL03.add("§aDébloqué !");
			AL03.add(" ");
			if(qp.getEnable().contains("explode03")){
				IM03.setDisplayName("§bExplosion 3");
				AL03.add("§2Elément équipé");
			}else{
				IM03.setDisplayName("§aExplosion 3");
				AL03.add("§eClique pour équiper");
			}
		}else{
			AL03.add("§cBloqué !");
			AL03.add(" ");
			if(EquipLast.getExplode(qp) == 2){
				if(qp.getCoins() >= CostUtils.getExplodeCost(3)){
					IM03.setDisplayName("§6Explosion 3");
					AL03.add("§6Coût : "+CostUtils.getExplodeCost(3));
					AL03.add(" ");
					AL03.add("§eClique pour acheter");
				}else{
					IM03.setDisplayName("§cExplosion 3");
					AL03.add("§cCoût : "+CostUtils.getExplodeCost(3));
				}
			}else{
				IM03.setDisplayName("§4Explosion 3");
				AL03.add("§cExplosion 2 requise");
			}
		}
		IM03.setLore(AL03);
		IS03.setItemMeta(IM03);
		i.setItem(4, IS03);
		
		ItemStack IS04 = new ItemStack(Material.SKULL_ITEM, 1, (short) 4);
		ItemMeta IM04 = IS04.getItemMeta();
		ArrayList<String> AL04 = new ArrayList<>();
		if(EquipLast.getExplode(qp) >= 4){
			AL04.add("§aDébloqué !");
			AL04.add(" ");
			if(qp.getEnable().contains("explode04")){
				IM04.setDisplayName("§bExplosion 4");
				AL04.add("§2Elément équipé");
			}else{
				IM04.setDisplayName("§aExplosion 4");
				AL04.add("§eClique pour équiper");
			}
		}else{
			AL04.add("§cBloqué !");
			AL04.add(" ");
			if(EquipLast.getExplode(qp) == 3){
				if(qp.getCoins() >= CostUtils.getExplodeCost(4)){
					IM04.setDisplayName("§6Explosion 4");
					AL04.add("§6Coût : "+CostUtils.getExplodeCost(4));
					AL04.add(" ");
					AL04.add("§eClique pour acheter");
				}else{
					IM04.setDisplayName("§cExplosion 4");
					AL04.add("§cCoût : "+CostUtils.getExplodeCost(4));
				}
			}else{
				IM04.setDisplayName("§4Explosion 4");
				AL04.add("§cExplosion 3 requise");
			}
		}
		IM04.setLore(AL04);
		IS04.setItemMeta(IM04);
		i.setItem(5, IS04);
		
		ItemStack IS05 = new ItemStack(Material.GOLD_NUGGET);
		ItemMeta IM05 = IS05.getItemMeta();
		ArrayList<String> AL05 = new ArrayList<>();
		if(EquipLast.getExplode(qp) >= 5){
			AL05.add("§aDébloqué !");
			AL05.add(" ");
			if(qp.getEnable().contains("explode05")){
				IM05.setDisplayName("§bExplosion 5");
				AL05.add("§2Elément équipé");
			}else{
				IM05.setDisplayName("§aExplosion 5");
				AL05.add("§eClique pour équiper");
			}
		}else{
			AL05.add("§cBloqué !");
			AL05.add(" ");
			if(EquipLast.getExplode(qp) == 4){
				if(qp.getCoins() >= CostUtils.getExplodeCost(5)){
					IM05.setDisplayName("§6Explosion 5");
					AL05.add("§6Coût : "+CostUtils.getExplodeCost(5));
					AL05.add(" ");
					AL05.add("§eClique pour acheter");
				}else{
					IM05.setDisplayName("§cExplosion 5");
					AL05.add("§cCoût : "+CostUtils.getExplodeCost(5));
				}
			}else{
				IM05.setDisplayName("§4Explosion 5");
				AL05.add("§cExplosion 3 requise");
			}
		}
		IM05.setLore(AL05);
		IS05.setItemMeta(IM05);
		i.setItem(6, IS05);
		
		ItemStack ISc = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMc = ISc.getItemMeta();
		IMc.setDisplayName("§6Coins : "+qp.getCoins());
		ISc.setItemMeta(IMc);
		i.setItem(13, ISc);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(17, ISba);
		
		p.openInventory(i);
		
	}

}
