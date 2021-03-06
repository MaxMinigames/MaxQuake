package fr.Maxime3399.MaxQuake.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import fr.Maxime3399.MaxQuake.MainClass;

public class DataUtils {
	
	private static String database = MainClass.getInstance().getConfig().getString("Database");
	
	public static void registerPlugin(){
		
		try{
			MySQLUtils.state.executeUpdate("CREATE TABLE IF NOT EXISTS `maxquake` (`uuid` varchar(255) NOT NULL,`info-name` varchar(255) NOT NULL,`info-coins` int(255) NOT NULL,`info-items` varchar(255) NOT NULL,`info-enable` varchar(255) NOT NULL,`info-params` varchar(255) NOT NULL,`info-kills` int(255) NOT NULL,`info-death` int(255) NOT NULL,`info-booster_speed` int(255) NOT NULL,`info-booster_shoot` int(255) NOT NULL,`info-win` int(255) NOT NULL,`info-play` int(255) NOT NULL,`info-totalCoins` int(255) NOT NULL , PRIMARY KEY (`uuid`)) ENGINE = MyISAM;");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void registerPlayer(Player p){
		
		try{
			MySQLUtils.state.executeUpdate("INSERT INTO `maxquake` (`uuid`, `info-name`, `info-coins`, `info-items`, `info-enable`, `info-params`, `info-kills`, `info-death`, `info-booster_speed`, `info-booster_shoot`, `info-win`, `info-play`, `info-totalCoins`) VALUES ('"+p.getUniqueId().toString()+"', '"+p.getName()+"', '0', 'case01,trigger01,explode01,color01', 'case01,trigger01,explode01,color01', '', '0', '0', '0', '0', '0', '0', '0');");
		}catch(SQLException e){

		}
		
	}
	
	public static String getPlayerStringInfo(String uuid, String info){
		
		String result = null;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+database+"`.`maxquake` WHERE uuid = '"+uuid+"'");
			r.next();
			result = r.getString("info-"+info);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static int getPlayerIntInfo(String uuid, String info){
		
		int result = 0;
		
		try{
			ResultSet r = MySQLUtils.state.executeQuery("SELECT * FROM `"+database+"`.`maxquake` WHERE uuid = '"+uuid+"'");
			r.next();
			result = r.getInt("info-"+info);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static void setPlayerStringInfo(String uuid, String info, String value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `"+database+"`.`maxquake` SET `info-"+info+"` = '"+value+"' WHERE `maxquake`.`uuid` = '"+uuid+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static void setPlayerIntInfo(String uuid, String info, int value){
		
		try{
			MySQLUtils.state.executeUpdate("UPDATE `"+database+"`.`maxquake` SET `info-"+info+"` = '"+value+"' WHERE `maxquake`.`uuid` = '"+uuid+"';");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
