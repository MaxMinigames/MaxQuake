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

public class ShopColorMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 36, "§8Laser");
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		ItemStack IS01 = new ItemStack(Material.FIREWORK_CHARGE);
		ItemMeta IM01 = IS01.getItemMeta();
		ArrayList<String> AL01 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 1){
			AL01.add("§aDébloqué !");
			AL01.add(" ");
			if(qp.getEnable().contains("color01")){
				IM01.setDisplayName("§bLaser 1");
				AL01.add("§2Elément équipé");
			}else{
				IM01.setDisplayName("§aLaser 1");
				AL01.add("§eClique pour équiper");
			}
		}
		IM01.setLore(AL01);
		IS01.setItemMeta(IM01);
		i.addItem(IS01);
		
		ItemStack IS02 = new ItemStack(Material.INK_SACK, 1, (short) 15);
		ItemMeta IM02 = IS02.getItemMeta();
		ArrayList<String> AL02 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 2){
			AL02.add("§aDébloqué !");
			AL02.add(" ");
			if(qp.getEnable().contains("explode02")){
				IM02.setDisplayName("§bLaser 2");
				AL02.add("§2Elément équipé");
			}else{
				IM02.setDisplayName("§aLaser 2");
				AL02.add("§eClique pour équiper");
			}
		}else{
			AL02.add("§cBloqué !");
			AL02.add(" ");
			if(qp.getCoins() >= CostUtils.getColorCost(2)){
				IM02.setDisplayName("§6Laser 2");
				AL02.add("§6Coût : "+CostUtils.getColorCost(2));
				AL02.add(" ");
				AL02.add("§eClique pour acheter");
			}else{
				IM02.setDisplayName("§cLaser 2");
				AL02.add("§cCoût : "+CostUtils.getColorCost(2));
			}
		}
		IM02.setLore(AL02);
		IS02.setItemMeta(IM02);
		i.addItem(IS02);
		
		ItemStack IS03 = new ItemStack(Material.INK_SACK, 1, (short) 14);
		ItemMeta IM03 = IS03.getItemMeta();
		ArrayList<String> AL03 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 3){
			AL03.add("§aDébloqué !");
			AL03.add(" ");
			if(qp.getEnable().contains("color03")){
				IM03.setDisplayName("§bLaser 3");
				AL03.add("§2Elément équipé");
			}else{
				IM03.setDisplayName("§aLaser 3");
				AL03.add("§eClique pour équiper");
			}
		}else{
			AL03.add("§cBloqué !");
			AL03.add(" ");
			if(EquipLast.getColor(qp) == 2){
				if(qp.getCoins() >= CostUtils.getColorCost(3)){
					IM03.setDisplayName("§6Laser 3");
					AL03.add("§6Coût : "+CostUtils.getColorCost(3));
					AL03.add(" ");
					AL03.add("§eClique pour acheter");
				}else{
					IM03.setDisplayName("§cLaser 3");
					AL03.add("§cCoût : "+CostUtils.getColorCost(3));
				}
			}else{
				IM03.setDisplayName("§4Laser 3");
				AL03.add("§cLaser 2 requis");
			}
		}
		IM03.setLore(AL03);
		IS03.setItemMeta(IM03);
		i.addItem(IS03);
		
		ItemStack IS04 = new ItemStack(Material.INK_SACK, 1, (short) 13);
		ItemMeta IM04 = IS04.getItemMeta();
		ArrayList<String> AL04 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 4){
			AL04.add("§aDébloqué !");
			AL04.add(" ");
			if(qp.getEnable().contains("color04")){
				IM04.setDisplayName("§bLaser 4");
				AL04.add("§2Elément équipé");
			}else{
				IM04.setDisplayName("§aLaser 4");
				AL04.add("§eClique pour équiper");
			}
		}else{
			AL04.add("§cBloqué !");
			AL04.add(" ");
			if(EquipLast.getColor(qp) == 3){
				if(qp.getCoins() >= CostUtils.getColorCost(4)){
					IM04.setDisplayName("§6Laser 4");
					AL04.add("§6Coût : "+CostUtils.getColorCost(4));
					AL04.add(" ");
					AL04.add("§eClique pour acheter");
				}else{
					IM04.setDisplayName("§cLaser 4");
					AL04.add("§cCoût : "+CostUtils.getColorCost(4));
				}
			}else{
				IM04.setDisplayName("§4Laser 4");
				AL04.add("§cLaser 3 requis");
			}
		}
		IM04.setLore(AL04);
		IS04.setItemMeta(IM04);
		i.addItem(IS04);
		
		ItemStack IS05 = new ItemStack(Material.INK_SACK, 1, (short) 12);
		ItemMeta IM05 = IS05.getItemMeta();
		ArrayList<String> AL05 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 5){
			AL05.add("§aDébloqué !");
			AL05.add(" ");
			if(qp.getEnable().contains("color05")){
				IM05.setDisplayName("§bLaser 5");
				AL05.add("§2Elément équipé");
			}else{
				IM05.setDisplayName("§aLaser 5");
				AL05.add("§eClique pour équiper");
			}
		}else{
			AL05.add("§cBloqué !");
			AL05.add(" ");
			if(EquipLast.getColor(qp) == 4){
				if(qp.getCoins() >= CostUtils.getColorCost(5)){
					IM05.setDisplayName("§6Laser 5");
					AL05.add("§6Coût : "+CostUtils.getColorCost(5));
					AL05.add(" ");
					AL05.add("§eClique pour acheter");
				}else{
					IM05.setDisplayName("§cLaser 5");
					AL05.add("§cCoût : "+CostUtils.getColorCost(5));
				}
			}else{
				IM05.setDisplayName("§4Laser 5");
				AL05.add("§cLaser 4 requis");
			}
		}
		IM05.setLore(AL05);
		IS05.setItemMeta(IM05);
		i.addItem(IS05);
		
		ItemStack IS06 = new ItemStack(Material.INK_SACK, 1, (short) 11);
		ItemMeta IM06 = IS06.getItemMeta();
		ArrayList<String> AL06 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 6){
			AL06.add("§aDébloqué !");
			AL06.add(" ");
			if(qp.getEnable().contains("color06")){
				IM06.setDisplayName("§bLaser 6");
				AL06.add("§2Elément équipé");
			}else{
				IM06.setDisplayName("§aLaser 6");
				AL06.add("§eClique pour équiper");
			}
		}else{
			AL06.add("§cBloqué !");
			AL06.add(" ");
			if(EquipLast.getColor(qp) == 5){
				if(qp.getCoins() >= CostUtils.getColorCost(6)){
					IM06.setDisplayName("§6Laser 6");
					AL06.add("§6Coût : "+CostUtils.getColorCost(6));
					AL06.add(" ");
					AL06.add("§eClique pour acheter");
				}else{
					IM06.setDisplayName("§cLaser 6");
					AL06.add("§cCoût : "+CostUtils.getColorCost(6));
				}
			}else{
				IM06.setDisplayName("§4Laser 6");
				AL06.add("§cLaser 5 requis");
			}
		}
		IM06.setLore(AL06);
		IS06.setItemMeta(IM06);
		i.addItem(IS06);
		
		ItemStack IS07 = new ItemStack(Material.INK_SACK, 1, (short) 10);
		ItemMeta IM07 = IS07.getItemMeta();
		ArrayList<String> AL07 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 7){
			AL07.add("§aDébloqué !");
			AL07.add(" ");
			if(qp.getEnable().contains("color07")){
				IM07.setDisplayName("§bLaser 7");
				AL07.add("§2Elément équipé");
			}else{
				IM07.setDisplayName("§aLaser 7");
				AL07.add("§eClique pour équiper");
			}
		}else{
			AL07.add("§cBloqué !");
			AL07.add(" ");
			if(EquipLast.getColor(qp) == 6){
				if(qp.getCoins() >= CostUtils.getColorCost(7)){
					IM07.setDisplayName("§6Laser 7");
					AL07.add("§6Coût : "+CostUtils.getColorCost(7));
					AL07.add(" ");
					AL07.add("§eClique pour acheter");
				}else{
					IM07.setDisplayName("§cLaser 7");
					AL07.add("§cCoût : "+CostUtils.getColorCost(7));
				}
			}else{
				IM07.setDisplayName("§4Laser 7");
				AL07.add("§cLaser 6 requis");
			}
		}
		IM07.setLore(AL07);
		IS07.setItemMeta(IM07);
		i.addItem(IS07);
		
		ItemStack IS08 = new ItemStack(Material.INK_SACK, 1, (short) 9);
		ItemMeta IM08 = IS08.getItemMeta();
		ArrayList<String> AL08 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 8){
			AL08.add("§aDébloqué !");
			AL08.add(" ");
			if(qp.getEnable().contains("color08")){
				IM08.setDisplayName("§bLaser 8");
				AL08.add("§2Elément équipé");
			}else{
				IM08.setDisplayName("§aLaser 8");
				AL08.add("§eClique pour équiper");
			}
		}else{
			AL08.add("§cBloqué !");
			AL08.add(" ");
			if(EquipLast.getColor(qp) == 7){
				if(qp.getCoins() >= CostUtils.getColorCost(8)){
					IM08.setDisplayName("§6Laser 8");
					AL08.add("§6Coût : "+CostUtils.getColorCost(8));
					AL08.add(" ");
					AL08.add("§eClique pour acheter");
				}else{
					IM08.setDisplayName("§cLaser 8");
					AL08.add("§cCoût : "+CostUtils.getColorCost(8));
				}
			}else{
				IM08.setDisplayName("§4Laser 8");
				AL08.add("§cLaser 7 requis");
			}
		}
		IM08.setLore(AL08);
		IS08.setItemMeta(IM08);
		i.addItem(IS08);
		
		ItemStack IS09 = new ItemStack(Material.INK_SACK, 1, (short) 8);
		ItemMeta IM09 = IS09.getItemMeta();
		ArrayList<String> AL09 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 9){
			AL09.add("§aDébloqué !");
			AL09.add(" ");
			if(qp.getEnable().contains("color09")){
				IM09.setDisplayName("§bLaser 9");
				AL09.add("§2Elément équipé");
			}else{
				IM09.setDisplayName("§aLaser 9");
				AL09.add("§eClique pour équiper");
			}
		}else{
			AL09.add("§cBloqué !");
			AL09.add(" ");
			if(EquipLast.getColor(qp) == 8){
				if(qp.getCoins() >= CostUtils.getColorCost(9)){
					IM09.setDisplayName("§6Laser 9");
					AL09.add("§6Coût : "+CostUtils.getColorCost(9));
					AL09.add(" ");
					AL09.add("§eClique pour acheter");
				}else{
					IM09.setDisplayName("§cLaser 9");
					AL09.add("§cCoût : "+CostUtils.getColorCost(9));
				}
			}else{
				IM09.setDisplayName("§4Laser 9");
				AL09.add("§cLaser 8 requis");
			}
		}
		IM09.setLore(AL09);
		IS09.setItemMeta(IM09);
		i.addItem(IS09);
		
		ItemStack IS10 = new ItemStack(Material.INK_SACK, 1, (short) 7);
		ItemMeta IM10 = IS10.getItemMeta();
		ArrayList<String> AL10 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 10){
			AL10.add("§aDébloqué !");
			AL10.add(" ");
			if(qp.getEnable().contains("color10")){
				IM10.setDisplayName("§bLaser 10");
				AL10.add("§2Elément équipé");
			}else{
				IM10.setDisplayName("§aLaser 10");
				AL10.add("§eClique pour équiper");
			}
		}else{
			AL10.add("§cBloqué !");
			AL10.add(" ");
			if(EquipLast.getColor(qp) == 9){
				if(qp.getCoins() >= CostUtils.getColorCost(10)){
					IM10.setDisplayName("§6Laser 10");
					AL10.add("§6Coût : "+CostUtils.getColorCost(10));
					AL10.add(" ");
					AL10.add("§eClique pour acheter");
				}else{
					IM10.setDisplayName("§cLaser 10");
					AL10.add("§cCoût : "+CostUtils.getColorCost(10));
				}
			}else{
				IM10.setDisplayName("§4Laser 10");
				AL10.add("§cLaser 9 requis");
			}
		}
		IM10.setLore(AL10);
		IS10.setItemMeta(IM10);
		i.addItem(IS10);
		
		ItemStack IS11 = new ItemStack(Material.INK_SACK, 1, (short) 6);
		ItemMeta IM11 = IS11.getItemMeta();
		ArrayList<String> AL11 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 11){
			AL11.add("§aDébloqué !");
			AL11.add(" ");
			if(qp.getEnable().contains("color11")){
				IM11.setDisplayName("§bLaser 11");
				AL11.add("§2Elément équipé");
			}else{
				IM11.setDisplayName("§aLaser 11");
				AL11.add("§eClique pour équiper");
			}
		}else{
			AL11.add("§cBloqué !");
			AL11.add(" ");
			if(EquipLast.getColor(qp) == 10){
				if(qp.getCoins() >= CostUtils.getColorCost(11)){
					IM11.setDisplayName("§6Laser 11");
					AL11.add("§6Coût : "+CostUtils.getColorCost(11));
					AL11.add(" ");
					AL11.add("§eClique pour acheter");
				}else{
					IM11.setDisplayName("§cLaser 11");
					AL11.add("§cCoût : "+CostUtils.getColorCost(11));
				}
			}else{
				IM11.setDisplayName("§4Laser 11");
				AL11.add("§cLaser 10 requis");
			}
		}
		IM11.setLore(AL11);
		IS11.setItemMeta(IM11);
		i.addItem(IS11);
		
		ItemStack IS12 = new ItemStack(Material.INK_SACK, 1, (short) 5);
		ItemMeta IM12 = IS12.getItemMeta();
		ArrayList<String> AL12 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 12){
			AL12.add("§aDébloqué !");
			AL12.add(" ");
			if(qp.getEnable().contains("color12")){
				IM12.setDisplayName("§bLaser 12");
				AL12.add("§2Elément équipé");
			}else{
				IM12.setDisplayName("§aLaser 12");
				AL12.add("§eClique pour équiper");
			}
		}else{
			AL12.add("§cBloqué !");
			AL12.add(" ");
			if(EquipLast.getColor(qp) == 11){
				if(qp.getCoins() >= CostUtils.getColorCost(12)){
					IM12.setDisplayName("§6Laser 12");
					AL12.add("§6Coût : "+CostUtils.getColorCost(12));
					AL12.add(" ");
					AL12.add("§eClique pour acheter");
				}else{
					IM12.setDisplayName("§cLaser 12");
					AL12.add("§cCoût : "+CostUtils.getColorCost(12));
				}
			}else{
				IM12.setDisplayName("§4Laser 12");
				AL12.add("§cLaser 11 requis");
			}
		}
		IM12.setLore(AL12);
		IS12.setItemMeta(IM12);
		i.addItem(IS12);
		
		ItemStack IS13 = new ItemStack(Material.INK_SACK, 1, (short) 4);
		ItemMeta IM13 = IS13.getItemMeta();
		ArrayList<String> AL13 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 13){
			AL13.add("§aDébloqué !");
			AL13.add(" ");
			if(qp.getEnable().contains("color13")){
				IM13.setDisplayName("§bLaser 13");
				AL13.add("§2Elément équipé");
			}else{
				IM13.setDisplayName("§aLaser 13");
				AL13.add("§eClique pour équiper");
			}
		}else{
			AL13.add("§cBloqué !");
			AL13.add(" ");
			if(EquipLast.getColor(qp) == 12){
				if(qp.getCoins() >= CostUtils.getColorCost(13)){
					IM13.setDisplayName("§6Laser 13");
					AL13.add("§6Coût : "+CostUtils.getColorCost(13));
					AL13.add(" ");
					AL13.add("§eClique pour acheter");
				}else{
					IM13.setDisplayName("§cLaser 13");
					AL13.add("§cCoût : "+CostUtils.getColorCost(13));
				}
			}else{
				IM13.setDisplayName("§4Laser 13");
				AL13.add("§cLaser 12 requis");
			}
		}
		IM13.setLore(AL13);
		IS13.setItemMeta(IM13);
		i.addItem(IS13);
		
		ItemStack IS14 = new ItemStack(Material.INK_SACK, 1, (short) 3);
		ItemMeta IM14 = IS14.getItemMeta();
		ArrayList<String> AL14 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 14){
			AL14.add("§aDébloqué !");
			AL14.add(" ");
			if(qp.getEnable().contains("color14")){
				IM14.setDisplayName("§bLaser 14");
				AL14.add("§2Elément équipé");
			}else{
				IM14.setDisplayName("§aLaser 14");
				AL14.add("§eClique pour équiper");
			}
		}else{
			AL14.add("§cBloqué !");
			AL14.add(" ");
			if(EquipLast.getColor(qp) == 13){
				if(qp.getCoins() >= CostUtils.getColorCost(14)){
					IM14.setDisplayName("§6Laser 14");
					AL14.add("§6Coût : "+CostUtils.getColorCost(14));
					AL14.add(" ");
					AL14.add("§eClique pour acheter");
				}else{
					IM14.setDisplayName("§cLaser 14");
					AL14.add("§cCoût : "+CostUtils.getColorCost(14));
				}
			}else{
				IM14.setDisplayName("§4Laser 14");
				AL14.add("§cLaser 13 requis");
			}
		}
		IM14.setLore(AL14);
		IS14.setItemMeta(IM14);
		i.addItem(IS14);
		
		ItemStack IS15 = new ItemStack(Material.INK_SACK, 1, (short) 2);
		ItemMeta IM15 = IS15.getItemMeta();
		ArrayList<String> AL15 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 15){
			AL15.add("§aDébloqué !");
			AL15.add(" ");
			if(qp.getEnable().contains("color15")){
				IM15.setDisplayName("§bLaser 15");
				AL15.add("§2Elément équipé");
			}else{
				IM15.setDisplayName("§aLaser 15");
				AL15.add("§eClique pour équiper");
			}
		}else{
			AL15.add("§cBloqué !");
			AL15.add(" ");
			if(EquipLast.getColor(qp) == 14){
				if(qp.getCoins() >= CostUtils.getColorCost(15)){
					IM15.setDisplayName("§6Laser 15");
					AL15.add("§6Coût : "+CostUtils.getColorCost(15));
					AL15.add(" ");
					AL15.add("§eClique pour acheter");
				}else{
					IM15.setDisplayName("§cLaser 15");
					AL15.add("§cCoût : "+CostUtils.getColorCost(15));
				}
			}else{
				IM15.setDisplayName("§4Laser 15");
				AL15.add("§cLaser 14 requis");
			}
		}
		IM15.setLore(AL15);
		IS15.setItemMeta(IM15);
		i.addItem(IS15);
		
		ItemStack IS16 = new ItemStack(Material.INK_SACK, 1, (short) 1);
		ItemMeta IM16 = IS16.getItemMeta();
		ArrayList<String> AL16 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 16){
			AL16.add("§aDébloqué !");
			AL16.add(" ");
			if(qp.getEnable().contains("color16")){
				IM16.setDisplayName("§bLaser 16");
				AL16.add("§2Elément équipé");
			}else{
				IM16.setDisplayName("§aLaser 16");
				AL16.add("§eClique pour équiper");
			}
		}else{
			AL16.add("§cBloqué !");
			AL16.add(" ");
			if(EquipLast.getColor(qp) == 15){
				if(qp.getCoins() >= CostUtils.getColorCost(16)){
					IM16.setDisplayName("§6Laser 16");
					AL16.add("§6Coût : "+CostUtils.getColorCost(16));
					AL16.add(" ");
					AL16.add("§eClique pour acheter");
				}else{
					IM16.setDisplayName("§cLaser 16");
					AL16.add("§cCoût : "+CostUtils.getColorCost(16));
				}
			}else{
				IM16.setDisplayName("§4Laser 16");
				AL16.add("§cLaser 15 requis");
			}
		}
		IM16.setLore(AL16);
		IS16.setItemMeta(IM16);
		i.addItem(IS16);
		
		ItemStack IS17 = new ItemStack(Material.INK_SACK, 1, (short) 0);
		ItemMeta IM17 = IS17.getItemMeta();
		ArrayList<String> AL17 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 17){
			AL17.add("§aDébloqué !");
			AL17.add(" ");
			if(qp.getEnable().contains("color17")){
				IM17.setDisplayName("§bLaser 17");
				AL17.add("§2Elément équipé");
			}else{
				IM17.setDisplayName("§aLaser 17");
				AL17.add("§eClique pour équiper");
			}
		}else{
			AL17.add("§cBloqué !");
			AL17.add(" ");
			if(EquipLast.getColor(qp) == 16){
				if(qp.getCoins() >= CostUtils.getColorCost(17)){
					IM17.setDisplayName("§6Laser 17");
					AL17.add("§6Coût : "+CostUtils.getColorCost(17));
					AL17.add(" ");
					AL17.add("§eClique pour acheter");
				}else{
					IM17.setDisplayName("§cLaser 17");
					AL17.add("§cCoût : "+CostUtils.getColorCost(17));
				}
			}else{
				IM17.setDisplayName("§4Laser 17");
				AL17.add("§cLaser 16 requis");
			}
		}
		IM17.setLore(AL17);
		IS17.setItemMeta(IM17);
		i.addItem(IS17);
		
		ItemStack IS18 = new ItemStack(Material.COAL);
		ItemMeta IM18 = IS18.getItemMeta();
		ArrayList<String> AL18 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 18){
			AL18.add("§aDébloqué !");
			AL18.add(" ");
			if(qp.getEnable().contains("color18")){
				IM18.setDisplayName("§bLaser 18");
				AL18.add("§2Elément équipé");
			}else{
				IM18.setDisplayName("§aLaser 18");
				AL18.add("§eClique pour équiper");
			}
		}else{
			AL18.add("§cBloqué !");
			AL18.add(" ");
			if(EquipLast.getColor(qp) == 17){
				if(qp.getCoins() >= CostUtils.getColorCost(18)){
					IM18.setDisplayName("§6Laser 18");
					AL18.add("§6Coût : "+CostUtils.getColorCost(18));
					AL18.add(" ");
					AL18.add("§eClique pour acheter");
				}else{
					IM18.setDisplayName("§cLaser 18");
					AL18.add("§cCoût : "+CostUtils.getColorCost(18));
				}
			}else{
				IM18.setDisplayName("§4Laser 18");
				AL18.add("§cLaser 17 requis");
			}
		}
		IM18.setLore(AL18);
		IS18.setItemMeta(IM18);
		i.addItem(IS18);
		
		ItemStack IS19 = new ItemStack(Material.IRON_INGOT);
		ItemMeta IM19 = IS19.getItemMeta();
		ArrayList<String> AL19 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 19){
			AL19.add("§aDébloqué !");
			AL19.add(" ");
			if(qp.getEnable().contains("color19")){
				IM19.setDisplayName("§bLaser 19");
				AL19.add("§2Elément équipé");
			}else{
				IM19.setDisplayName("§aLaser 19");
				AL19.add("§eClique pour équiper");
			}
		}else{
			AL19.add("§cBloqué !");
			AL19.add(" ");
			if(EquipLast.getColor(qp) == 18){
				if(qp.getCoins() >= CostUtils.getColorCost(19)){
					IM19.setDisplayName("§6Laser 19");
					AL19.add("§6Coût : "+CostUtils.getColorCost(19));
					AL19.add(" ");
					AL19.add("§eClique pour acheter");
				}else{
					IM19.setDisplayName("§cLaser 19");
					AL19.add("§cCoût : "+CostUtils.getColorCost(19));
				}
			}else{
				IM19.setDisplayName("§4Laser 19");
				AL19.add("§cLaser 18 requis");
			}
		}
		IM19.setLore(AL19);
		IS19.setItemMeta(IM19);
		i.setItem(20, IS19);
		
		ItemStack IS20 = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IM20 = IS20.getItemMeta();
		ArrayList<String> AL20 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 20){
			AL20.add("§aDébloqué !");
			AL20.add(" ");
			if(qp.getEnable().contains("color20")){
				IM20.setDisplayName("§bLaser 20");
				AL20.add("§2Elément équipé");
			}else{
				IM20.setDisplayName("§aLaser 20");
				AL20.add("§eClique pour équiper");
			}
		}else{
			AL20.add("§cBloqué !");
			AL20.add(" ");
			if(EquipLast.getColor(qp) == 19){
				if(qp.getCoins() >= CostUtils.getColorCost(20)){
					IM20.setDisplayName("§6Laser 20");
					AL20.add("§6Coût : "+CostUtils.getColorCost(20));
					AL20.add(" ");
					AL20.add("§eClique pour acheter");
				}else{
					IM20.setDisplayName("§cLaser 20");
					AL20.add("§cCoût : "+CostUtils.getColorCost(20));
				}
			}else{
				IM20.setDisplayName("§4Laser 20");
				AL20.add("§cLaser 19 requis");
			}
		}
		IM20.setLore(AL20);
		IS20.setItemMeta(IM20);
		i.setItem(21, IS20);
		
		ItemStack IS21 = new ItemStack(Material.DIAMOND);
		ItemMeta IM21 = IS21.getItemMeta();
		ArrayList<String> AL21 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 21){
			AL21.add("§aDébloqué !");
			AL21.add(" ");
			if(qp.getEnable().contains("color21")){
				IM21.setDisplayName("§bLaser 21");
				AL21.add("§2Elément équipé");
			}else{
				IM21.setDisplayName("§aLaser 21");
				AL21.add("§eClique pour équiper");
			}
		}else{
			AL21.add("§cBloqué !");
			AL21.add(" ");
			if(EquipLast.getColor(qp) == 20){
				if(qp.getCoins() >= CostUtils.getColorCost(21)){
					IM21.setDisplayName("§6Laser 21");
					AL21.add("§6Coût : "+CostUtils.getColorCost(21));
					AL21.add(" ");
					AL21.add("§eClique pour acheter");
				}else{
					IM21.setDisplayName("§cLaser 21");
					AL21.add("§cCoût : "+CostUtils.getColorCost(21));
				}
			}else{
				IM21.setDisplayName("§4Laser 21");
				AL21.add("§cLaser 20 requis");
			}
		}
		IM21.setLore(AL21);
		IS21.setItemMeta(IM21);
		i.setItem(22, IS21);
		
		ItemStack IS22 = new ItemStack(Material.EMERALD);
		ItemMeta IM22 = IS22.getItemMeta();
		ArrayList<String> AL22 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 22){
			AL22.add("§aDébloqué !");
			AL22.add(" ");
			if(qp.getEnable().contains("color22")){
				IM22.setDisplayName("§bLaser 22");
				AL22.add("§2Elément équipé");
			}else{
				IM22.setDisplayName("§aLaser 22");
				AL22.add("§eClique pour équiper");
			}
		}else{
			AL22.add("§cBloqué !");
			AL22.add(" ");
			if(EquipLast.getColor(qp) == 21){
				if(qp.getCoins() >= CostUtils.getColorCost(22)){
					IM22.setDisplayName("§6Laser 22");
					AL22.add("§6Coût : "+CostUtils.getColorCost(22));
					AL22.add(" ");
					AL22.add("§eClique pour acheter");
				}else{
					IM22.setDisplayName("§cLaser 22");
					AL22.add("§cCoût : "+CostUtils.getColorCost(22));
				}
			}else{
				IM22.setDisplayName("§4Laser 22");
				AL22.add("§cLaser 21 requis");
			}
		}
		IM22.setLore(AL22);
		IS22.setItemMeta(IM22);
		i.setItem(23, IS22);
		
		ItemStack IS23 = new ItemStack(Material.NETHER_STAR);
		ItemMeta IM23 = IS23.getItemMeta();
		ArrayList<String> AL23 = new ArrayList<>();
		if(EquipLast.getColor(qp) >= 23){
			AL23.add("§aDébloqué !");
			AL23.add(" ");
			if(qp.getEnable().contains("color23")){
				IM23.setDisplayName("§bLaser 23");
				AL23.add("§2Elément équipé");
			}else{
				IM23.setDisplayName("§aLaser 23");
				AL23.add("§eClique pour équiper");
			}
		}else{
			AL23.add("§cBloqué !");
			AL23.add(" ");
			if(EquipLast.getColor(qp) == 22){
				if(qp.getCoins() >= CostUtils.getColorCost(23)){
					IM23.setDisplayName("§6Laser 23");
					AL23.add("§6Coût : "+CostUtils.getColorCost(23));
					AL23.add(" ");
					AL23.add("§eClique pour acheter");
				}else{
					IM23.setDisplayName("§cLaser 23");
					AL23.add("§cCoût : "+CostUtils.getColorCost(23));
				}
			}else{
				IM23.setDisplayName("§4Laser 23");
				AL23.add("§cLaser 22 requis");
			}
		}
		IM23.setLore(AL23);
		IS23.setItemMeta(IM23);
		i.setItem(24, IS23);
		
		ItemStack ISc = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMc = ISc.getItemMeta();
		IMc.setDisplayName("§6Coins : "+qp.getCoins());
		ISc.setItemMeta(IMc);
		i.setItem(31, ISc);
		
		ItemStack ISba = new ItemStack(Material.ARROW);
		ItemMeta IMba = ISba.getItemMeta();
		ArrayList<String> ALba = new ArrayList<>();
		IMba.setDisplayName("§8§oRetour");
		ALba.add("§9§l>§r §7Clique pour retourner au");
		ALba.add("§7menu principal");
		IMba.setLore(ALba);
		ISba.setItemMeta(IMba);
		i.setItem(35, ISba);
		
		p.openInventory(i);
		
	}

}
