package fr.Maxime3399.MaxQuake.equip;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipLast {
	
	public static int getCase(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getItems();
		
		if(items.contains("case02")){
			result = 2;
		}else if(items.contains("case03")){
			result = 3;
		}else if(items.contains("case04")){
			result = 4;
		}else if(items.contains("case05")){
			result = 5;
		}else if(items.contains("case06")){
			result = 6;
		}else if(items.contains("case07")){
			result = 7;
		}else if(items.contains("case08")){
			result = 8;
		}else if(items.contains("case09")){
			result = 9;
		}else if(items.contains("case10")){
			result = 10;
		}else if(items.contains("case11")){
			result = 11;
		}else if(items.contains("case12")){
			result = 12;
		}else if(items.contains("case13")){
			result = 13;
		}else if(items.contains("case14")){
			result = 14;
		}
		
		return result;
		
	}
	
	public static int getTrigger(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getItems();
		
		if(items.contains("trigger02")){
			result = 2;
		}else if(items.contains("trigger03")){
			result = 3;
		}else if(items.contains("trigger04")){
			result = 4;
		}else if(items.contains("trigger05")){
			result = 5;
		}else if(items.contains("trigger06")){
			result = 6;
		}else if(items.contains("trigger07")){
			result = 7;
		}else if(items.contains("trigger08")){
			result = 8;
		}else if(items.contains("trigger09")){
			result = 9;
		}
		
		return result;
		
	}
	
	public static int getExplode(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getItems();
		
		if(items.contains("explode02")){
			result = 2;
		}else if(items.contains("explode03")){
			result = 3;
		}else if(items.contains("explode04")){
			result = 4;
		}else if(items.contains("explode05")){
			result = 5;
		}
		
		return result;
		
	}
	
	public static int getColor(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getItems();
		
		if(items.contains("color02")){
			result = 2;
		}else if(items.contains("color03")){
			result = 3;
		}else if(items.contains("color04")){
			result = 4;
		}else if(items.contains("color05")){
			result = 5;
		}else if(items.contains("color06")){
			result = 6;
		}else if(items.contains("color07")){
			result = 7;
		}else if(items.contains("color08")){
			result = 8;
		}else if(items.contains("color09")){
			result = 9;
		}else if(items.contains("color10")){
			result = 10;
		}else if(items.contains("color11")){
			result = 11;
		}else if(items.contains("color12")){
			result = 12;
		}else if(items.contains("color13")){
			result = 13;
		}else if(items.contains("color14")){
			result = 14;
		}else if(items.contains("color15")){
			result = 15;
		}else if(items.contains("color16")){
			result = 16;
		}else if(items.contains("color17")){
			result = 17;
		}else if(items.contains("color18")){
			result = 18;
		}else if(items.contains("color19")){
			result = 19;
		}else if(items.contains("color20")){
			result = 20;
		}else if(items.contains("color21")){
			result = 21;
		}else if(items.contains("color22")){
			result = 22;
		}else if(items.contains("color23")){
			result = 23;
		}
		
		return result;
		
	}

}
