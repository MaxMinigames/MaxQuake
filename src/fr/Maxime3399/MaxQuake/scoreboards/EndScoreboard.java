package fr.Maxime3399.MaxQuake.scoreboards;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;
import fr.Maxime3399.MaxQuake.managers.PlayersManagers;
import fr.Maxime3399.MaxQuake.utils.PlayerClasser;

public class EndScoreboard {

	private static Scoreboard s = Bukkit.getScoreboardManager().getMainScoreboard();
	
	public static void loadScoreboard(Player p){
		
	    Objective o = null;
	    ArrayList<Score> list = new ArrayList<>();
	    if(s.getObjective("WaitSb") != null){
	    	o = s.getObjective("WaitSb");
	    	o.unregister();
	    }
	    
    	o = s.registerNewObjective("WaitSb", "dummy");
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§e§lQUAKECRAFT");
	    
	    Score s1 = o.getScore("§0");
	    s1.setScore(9);
	    list.add(s1);
	    
	    Score s2 = o.getScore(" §6§lPartie terminée");
	    s2.setScore(8);
	    list.add(s2);
	    
	    Score s3 = o.getScore("§1");
	    s3.setScore(7);
	    list.add(s3);
	    
	    Player p1 = PlayerClasser.getFirstPlayer();
	    Player p2 = PlayerClasser.getSecondPlayer();
	    Player p3 = PlayerClasser.getThirdPlayer();
	    int online = 0;
	    for(Player pls : Bukkit.getOnlinePlayers()){
	    	QuakePlayer qp = PlayersManagers.getQuakePlayer(pls);
	    	if(qp.getRole().equalsIgnoreCase("player")){
	    		online++;
	    	}
	    }
	    Score s4 = o.getScore("§aJoueurs : "+online);
	    s4.setScore(6);
	    list.add(s4);
	    
	    Score s5 = o.getScore("§2");
	    s5.setScore(5);
	    list.add(s5);
	    
	    Score s6 = o.getScore("§e"+p1.getName()+" §r§6"+PlayersManagers.getQuakePlayer(p1).getCurrent_kills());
	    s6.setScore(4);
	    list.add(s6);
	    
	    if(p2 != null){
		    Score s7 = o.getScore("§e"+p2.getName()+" §r§6"+PlayersManagers.getQuakePlayer(p2).getCurrent_kills());
		    s7.setScore(3);
		    list.add(s7);
	    }
	    
	    if(p3 != null){
		    Score s8 = o.getScore("§e"+p3.getName()+" §r§6"+PlayersManagers.getQuakePlayer(p3).getCurrent_kills());
		    s8.setScore(2);
		    list.add(s8);
	    }
	    
	    Score s9 = o.getScore("§3");
	    s9.setScore(1);
	    list.add(s9);
	    
	    Score s10 = o.getScore("  §6§otest.maxime3399.fr");
	    s10.setScore(0);
	    list.add(s10);
	    
	    p.setScoreboard(s);
	    for(Score sc : list){
	    	s.resetScores(sc.toString());
	    }
		
	}
	
}
