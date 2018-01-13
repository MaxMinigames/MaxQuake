package fr.Maxime3399.MaxQuake.equip;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipItems {
	
	public static ItemStack getColorType(QuakePlayer qp){
		
		ItemStack result = null;
		String enable = qp.getEnable();
		
		if(enable.contains("color01")){
			result = new ItemStack(Material.FIREWORK_CHARGE);
		}else if(enable.contains("color02")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 15);
		}else if(enable.contains("color03")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 14);
		}else if(enable.contains("color04")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 13);
		}else if(enable.contains("color05")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 12);
		}else if(enable.contains("color06")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 11);
		}else if(enable.contains("color07")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 10);
		}else if(enable.contains("color08")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 9);
		}else if(enable.contains("color09")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 8);
		}else if(enable.contains("color10")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 7);
		}else if(enable.contains("color11")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 6);
		}else if(enable.contains("color12")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 5);
		}else if(enable.contains("color13")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 4);
		}else if(enable.contains("color14")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 3);
		}else if(enable.contains("color15")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 2);
		}else if(enable.contains("color16")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 1);
		}else if(enable.contains("color17")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 0);
		}else if(enable.contains("color18")){
			result = new ItemStack(Material.COAL);
		}else if(enable.contains("color19")){
			result = new ItemStack(Material.IRON_INGOT);
		}else if(enable.contains("color20")){
			result = new ItemStack(Material.GOLD_INGOT);
		}else if(enable.contains("color21")){
			result = new ItemStack(Material.DIAMOND);
		}else if(enable.contains("color22")){
			result = new ItemStack(Material.EMERALD);
		}else if(enable.contains("color23")){
			result = new ItemStack(Material.NETHER_STAR);
		}
		
		return result;
		
	}
	
	public static ItemStack getColorType(String color){
		
		ItemStack result = null;
		String enable = color;
		
		if(enable.contains("color01")){
			result = new ItemStack(Material.FIREWORK_CHARGE);
		}else if(enable.contains("color02")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 15);
		}else if(enable.contains("color03")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 14);
		}else if(enable.contains("color04")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 13);
		}else if(enable.contains("color05")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 12);
		}else if(enable.contains("color06")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 11);
		}else if(enable.contains("color07")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 10);
		}else if(enable.contains("color08")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 9);
		}else if(enable.contains("color09")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 8);
		}else if(enable.contains("color10")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 7);
		}else if(enable.contains("color11")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 6);
		}else if(enable.contains("color12")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 5);
		}else if(enable.contains("color13")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 4);
		}else if(enable.contains("color14")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 3);
		}else if(enable.contains("color15")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 2);
		}else if(enable.contains("color16")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 1);
		}else if(enable.contains("color17")){
			result = new ItemStack(Material.INK_SACK, 1, (short) 0);
		}else if(enable.contains("color18")){
			result = new ItemStack(Material.COAL);
		}else if(enable.contains("color19")){
			result = new ItemStack(Material.IRON_INGOT);
		}else if(enable.contains("color20")){
			result = new ItemStack(Material.GOLD_INGOT);
		}else if(enable.contains("color21")){
			result = new ItemStack(Material.DIAMOND);
		}else if(enable.contains("color22")){
			result = new ItemStack(Material.EMERALD);
		}else if(enable.contains("color23")){
			result = new ItemStack(Material.NETHER_STAR);
		}
		
		return result;
		
	}
	
	public static ItemStack getExplodeType(QuakePlayer qp){
		
		ItemStack result = null;
		String enable = qp.getEnable();
		
		if(enable.contains("explode01")){
			result = new ItemStack(Material.SULPHUR);
		}else if(enable.contains("explode02")){
			result = new ItemStack(Material.FEATHER);
		}else if(enable.contains("explode03")){
			result = new ItemStack(Material.FIREBALL);
		}else if(enable.contains("explode04")){
			result = new ItemStack(Material.SKULL_ITEM, 1, (short) 4);
		}else if(enable.contains("explode05")){
			result = new ItemStack(Material.GOLD_NUGGET);
		}
		
		return result;
		
	}
	
	public static ItemStack getExplodeType(String explode){
		
		ItemStack result = null;
		String enable = explode;
		
		if(enable.contains("explode01")){
			result = new ItemStack(Material.SULPHUR);
		}else if(enable.contains("explode02")){
			result = new ItemStack(Material.FEATHER);
		}else if(enable.contains("explode03")){
			result = new ItemStack(Material.FIREBALL);
		}else if(enable.contains("explode04")){
			result = new ItemStack(Material.SKULL_ITEM, 1, (short) 4);
		}else if(enable.contains("explode05")){
			result = new ItemStack(Material.GOLD_NUGGET);
		}
		
		return result;
		
	}
	
	public static ItemStack getTriggerType(QuakePlayer qp){
		
		ItemStack result = null;
		String enable = qp.getEnable();
		
		if(enable.contains("trigger01")){
			result = new ItemStack(Material.STONE_BUTTON, 20);
		}else if(enable.contains("trigger02")){
			result = new ItemStack(Material.STONE_BUTTON, 18);
		}else if(enable.contains("trigger03")){
			result = new ItemStack(Material.STONE_BUTTON, 16);
		}else if(enable.contains("trigger04")){
			result = new ItemStack(Material.STONE_BUTTON, 14);
		}else if(enable.contains("trigger05")){
			result = new ItemStack(Material.STONE_BUTTON, 12);
		}else if(enable.contains("trigger06")){
			result = new ItemStack(Material.STONE_BUTTON, 10);
		}else if(enable.contains("trigger07")){
			result = new ItemStack(Material.STONE_BUTTON, 8);
		}else if(enable.contains("trigger08")){
			result = new ItemStack(Material.STONE_BUTTON, 6);
		}else if(enable.contains("trigger09")){
			result = new ItemStack(Material.STONE_BUTTON, 4);
		}
		
		return result;
		
	}
	
	public static ItemStack getTriggerType(String trigger){
		
		ItemStack result = null;
		String enable = trigger;
		
		if(enable.contains("trigger01")){
			result = new ItemStack(Material.STONE_BUTTON, 20);
		}else if(enable.contains("trigger02")){
			result = new ItemStack(Material.STONE_BUTTON, 18);
		}else if(enable.contains("trigger03")){
			result = new ItemStack(Material.STONE_BUTTON, 16);
		}else if(enable.contains("trigger04")){
			result = new ItemStack(Material.STONE_BUTTON, 14);
		}else if(enable.contains("trigger05")){
			result = new ItemStack(Material.STONE_BUTTON, 12);
		}else if(enable.contains("trigger06")){
			result = new ItemStack(Material.STONE_BUTTON, 10);
		}else if(enable.contains("trigger07")){
			result = new ItemStack(Material.STONE_BUTTON, 8);
		}else if(enable.contains("trigger08")){
			result = new ItemStack(Material.STONE_BUTTON, 6);
		}else if(enable.contains("trigger09")){
			result = new ItemStack(Material.STONE_BUTTON, 4);
		}
		
		return result;
		
	}
	
	public static ItemStack getRailgunType(QuakePlayer qp){
		
		ItemStack result = null;
		String enable = qp.getEnable();
		
		if(enable.contains("case01")){
			result = new ItemStack(Material.STICK);
		}else if(enable.contains("case02")){
			result = new ItemStack(Material.STICK);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case03")){
			result = new ItemStack(Material.WOOD_HOE);
		}else if(enable.contains("case04")){
			result = new ItemStack(Material.WOOD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case05")){
			result = new ItemStack(Material.STONE_HOE);
		}else if(enable.contains("case06")){
			result = new ItemStack(Material.STONE_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case07")){
			result = new ItemStack(Material.IRON_HOE);
		}else if(enable.contains("case08")){
			result = new ItemStack(Material.IRON_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case09")){
			result = new ItemStack(Material.GOLD_HOE);
		}else if(enable.contains("case10")){
			result = new ItemStack(Material.GOLD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case11")){
			result = new ItemStack(Material.DIAMOND_HOE);
		}else if(enable.contains("case12")){
			result = new ItemStack(Material.DIAMOND_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case13")){
			result = new ItemStack(Material.BLAZE_ROD);
		}else if(enable.contains("case14")){
			result = new ItemStack(Material.BLAZE_ROD);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}
		
		return result;
		
	}
	
	public static ItemStack getRailgunType(String railgun){
		
		ItemStack result = null;
		String enable = railgun;
		
		if(enable.contains("case01")){
			result = new ItemStack(Material.STICK);
		}else if(enable.contains("case02")){
			result = new ItemStack(Material.STICK);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case03")){
			result = new ItemStack(Material.WOOD_HOE);
		}else if(enable.contains("case04")){
			result = new ItemStack(Material.WOOD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case05")){
			result = new ItemStack(Material.STONE_HOE);
		}else if(enable.contains("case06")){
			result = new ItemStack(Material.STONE_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case07")){
			result = new ItemStack(Material.IRON_HOE);
		}else if(enable.contains("case08")){
			result = new ItemStack(Material.IRON_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case09")){
			result = new ItemStack(Material.GOLD_HOE);
		}else if(enable.contains("case10")){
			result = new ItemStack(Material.GOLD_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case11")){
			result = new ItemStack(Material.DIAMOND_HOE);
		}else if(enable.contains("case12")){
			result = new ItemStack(Material.DIAMOND_HOE);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}else if(enable.contains("case13")){
			result = new ItemStack(Material.BLAZE_ROD);
		}else if(enable.contains("case14")){
			result = new ItemStack(Material.BLAZE_ROD);
			ItemMeta IM = result.getItemMeta();
			IM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			result.setItemMeta(IM);
		}
		
		return result;
		
	}

}
