package fr.Maxime3399.MaxQuake.equip;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipCounts {
	
	public static int getColors(QuakePlayer qp){
		
		int result = 0;
		String eq = qp.getItems();
		
		if(eq.contains("color01")){
			result = 1;
		}
		if(eq.contains("color02")){
			result = 2;
		}
		if(eq.contains("color03")){
			result = 3;
		}
		if(eq.contains("color04")){
			result = 4;
		}
		if(eq.contains("color05")){
			result = 5;
		}
		if(eq.contains("color06")){
			result = 6;
		}
		if(eq.contains("color07")){
			result = 7;
		}
		if(eq.contains("color08")){
			result = 8;
		}
		if(eq.contains("color09")){
			result = 9;
		}
		if(eq.contains("color10")){
			result = 10;
		}
		if(eq.contains("color11")){
			result = 11;
		}
		if(eq.contains("color12")){
			result = 12;
		}
		if(eq.contains("color13")){
			result = 13;
		}
		if(eq.contains("color14")){
			result = 14;
		}
		if(eq.contains("color15")){
			result = 15;
		}
		if(eq.contains("color16")){
			result = 16;
		}
		if(eq.contains("color17")){
			result = 17;
		}
		if(eq.contains("color18")){
			result = 18;
		}
		if(eq.contains("color19")){
			result = 19;
		}
		if(eq.contains("color20")){
			result = 20;
		}
		if(eq.contains("color21")){
			result = 21;
		}
		if(eq.contains("color22")){
			result = 22;
		}
		if(eq.contains("color23")){
			result = 23;
		}
		
		return result;
		
	}
	
	public static int getColorsPercentage(QuakePlayer qp){
		
		int result = 0;
		int cases = getColors(qp);
		
		result = cases*100/23;
		
		return result;
		
	}
	
	public static int getExplodes(QuakePlayer qp){
		
		int result = 0;
		String eq = qp.getItems();
		
		if(eq.contains("explode01")){
			result = 1;
		}
		if(eq.contains("explode02")){
			result = 2;
		}
		if(eq.contains("explode03")){
			result = 3;
		}
		if(eq.contains("explode04")){
			result = 4;
		}
		if(eq.contains("explode05")){
			result = 5;
		}
		
		return result;
		
	}
	
	public static int getExplodesPercentage(QuakePlayer qp){
		
		int result = 0;
		int cases = getExplodes(qp);
		
		result = cases*100/5;
		
		return result;
		
	}
	
	public static int getTriggers(QuakePlayer qp){
		
		int result = 0;
		String eq = qp.getItems();
		
		if(eq.contains("trigger01")){
			result = 1;
		}
		if(eq.contains("trigger02")){
			result = 2;
		}
		if(eq.contains("trigger03")){
			result = 3;
		}
		if(eq.contains("trigger04")){
			result = 4;
		}
		if(eq.contains("trigger05")){
			result = 5;
		}
		if(eq.contains("trigger06")){
			result = 6;
		}
		if(eq.contains("trigger07")){
			result = 7;
		}
		if(eq.contains("trigger08")){
			result = 8;
		}
		if(eq.contains("trigger09")){
			result = 9;
		}
		
		return result;
		
	}
	
	public static int getTriggerPercentage(QuakePlayer qp){
		
		int result = 0;
		int cases = getTriggers(qp);
		
		result = cases*100/9;
		
		return result;
		
	}
	
	public static int getCases(QuakePlayer qp){
		
		int result = 0;
		String eq = qp.getItems();
		
		if(eq.contains("case01")){
			result = 1;
		}
		if(eq.contains("case02")){
			result = 2;
		}
		if(eq.contains("case03")){
			result = 3;
		}
		if(eq.contains("case04")){
			result = 4;
		}
		if(eq.contains("case05")){
			result = 5;
		}
		if(eq.contains("case06")){
			result = 6;
		}
		if(eq.contains("case07")){
			result = 7;
		}
		if(eq.contains("case08")){
			result = 8;
		}
		if(eq.contains("case09")){
			result = 9;
		}
		if(eq.contains("case10")){
			result = 10;
		}
		if(eq.contains("case11")){
			result = 11;
		}
		if(eq.contains("case12")){
			result = 12;
		}
		if(eq.contains("case13")){
			result = 13;
		}
		if(eq.contains("case14")){
			result = 14;
		}
		
		return result;
		
	}
	
	public static int getCasePercentage(QuakePlayer qp){
		
		int result = 0;
		int cases = getCases(qp);
		
		result = cases*100/14;
		
		return result;
		
	}

}
