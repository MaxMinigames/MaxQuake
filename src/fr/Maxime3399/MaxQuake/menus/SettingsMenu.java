package fr.Maxime3399.MaxQuake.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;

public class SettingsMenu {
	
	public static void openMenu(Player p){
		
		Inventory i = Bukkit.createInventory(null, 27, "�8Param�tres");
		QuakePlayer qp = PlayersManagers.getQuakePlayer(p);
		
		ItemStack ISlaser = new ItemStack(Material.FIREWORK);
		ItemMeta IMlaser = ISlaser.getItemMeta();
		ArrayList<String> ALlaser = new ArrayList<>();
		if(qp.getSettings().contains("laser")){
			IMlaser.setDisplayName("�cLaser");
			ALlaser.add("�9�l>�r �7Clique pour activer");
		}else{
			IMlaser.setDisplayName("�aLaser");
			ALlaser.add("�9�l>�r �7Clique pour d�sactiver");
			IMlaser.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMlaser.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMlaser.setLore(ALlaser);
		ISlaser.setItemMeta(IMlaser);
		i.setItem(10, ISlaser);
		
		ItemStack ISexplode = new ItemStack(Material.TNT);
		ItemMeta IMexplode = ISexplode.getItemMeta();
		ArrayList<String> ALexplode = new ArrayList<>();
		if(qp.getSettings().contains("explode")){
			IMexplode.setDisplayName("�cExplosions");
			ALexplode.add("�9�l>�r �7Clique pour activer");
		}else{
			IMexplode.setDisplayName("�aExplosions");
			ALexplode.add("�9�l>�r �7Clique pour d�sactiver");
			IMexplode.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMexplode.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMexplode.setLore(ALexplode);
		ISexplode.setItemMeta(IMexplode);
		i.setItem(11, ISexplode);
		
		ItemStack ISparticles = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta IMparticles = ISparticles.getItemMeta();
		ArrayList<String> ALparticles = new ArrayList<>();
		if(qp.getSettings().contains("particles")){
			IMparticles.setDisplayName("�cParticules");
			ALparticles.add("�9�l>�r �7Clique pour activer");
		}else{
			IMparticles.setDisplayName("�aParticules");
			ALparticles.add("�9�l>�r �7Clique pour d�sactiver");
			IMparticles.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMparticles.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMparticles.setLore(ALparticles);
		ISparticles.setItemMeta(IMparticles);
		i.setItem(12, ISparticles);
		
		ItemStack ISsounds = new ItemStack(Material.NOTE_BLOCK);
		ItemMeta IMsounds = ISsounds.getItemMeta();
		ArrayList<String> ALsounds = new ArrayList<>();
		if(qp.getSettings().contains("sounds")){
			IMsounds.setDisplayName("�cSons");
			ALsounds.add("�9�l>�r �7Clique pour activer");
		}else{
			IMsounds.setDisplayName("�aSons");
			ALsounds.add("�9�l>�r �7Clique pour d�sactiver");
			IMsounds.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMsounds.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMsounds.setLore(ALsounds);
		ISsounds.setItemMeta(IMsounds);
		i.setItem(13, ISsounds);
		
		ItemStack ISdeath = new ItemStack(Material.BONE);
		ItemMeta IMdeath = ISdeath.getItemMeta();
		ArrayList<String> ALdeath = new ArrayList<>();
		if(qp.getSettings().contains("death")){
			IMdeath.setDisplayName("�cMessages de mort");
			ALdeath.add("�9�l>�r �7Clique pour activer");
		}else{
			IMdeath.setDisplayName("�aMessages de mort");
			ALdeath.add("�9�l>�r �7Clique pour d�sactiver");
			IMdeath.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMdeath.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMdeath.setLore(ALdeath);
		ISdeath.setItemMeta(IMdeath);
		i.setItem(14, ISdeath);
		
		ItemStack IScoins = new ItemStack(Material.GOLD_INGOT);
		ItemMeta IMcoins = IScoins.getItemMeta();
		ArrayList<String> ALcoins = new ArrayList<>();
		if(qp.getSettings().contains("coins")){
			IMcoins.setDisplayName("�cMessages de gains");
			ALcoins.add("�9�l>�r �7Clique pour activer");
		}else{
			IMcoins.setDisplayName("�aMessages de gains");
			ALcoins.add("�9�l>�r �7Clique pour d�sactiver");
			IMcoins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMcoins.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMcoins.setLore(ALcoins);
		IScoins.setItemMeta(IMcoins);
		i.setItem(15, IScoins);
		
		ItemStack ISholo = new ItemStack(Material.SIGN);
		ItemMeta IMholo = ISholo.getItemMeta();
		ArrayList<String> ALholo = new ArrayList<>();
		if(qp.getSettings().contains("holo")){
			IMholo.setDisplayName("�cHologrammes");
			ALholo.add("�9�l>�r �7Clique pour activer");
		}else{
			IMholo.setDisplayName("�aHologrammes");
			ALholo.add("�9�l>�r �7Clique pour d�sactiver");
			IMholo.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			IMholo.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		IMholo.setLore(ALholo);
		ISholo.setItemMeta(IMholo);
		i.setItem(16, ISholo);
		
		p.openInventory(i);
		
	}

}
