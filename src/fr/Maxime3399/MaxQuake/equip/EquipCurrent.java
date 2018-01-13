package fr.Maxime3399.MaxQuake.equip;

import fr.Maxime3399.MaxQuake.custom.QuakePlayer;

public class EquipCurrent {
	
	public static int getCase(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getEnable();
		
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
	
	public static String getCaseString(QuakePlayer qp){
		
		String result = "case01";
		String items = qp.getEnable();
		
		if(items.contains("case02")){
			result = "case02";
		}else if(items.contains("case03")){
			result = "case03";
		}else if(items.contains("case04")){
			result = "case04";
		}else if(items.contains("case05")){
			result = "case05";
		}else if(items.contains("case06")){
			result = "case06";
		}else if(items.contains("case07")){
			result = "case07";
		}else if(items.contains("case08")){
			result = "case08";
		}else if(items.contains("case09")){
			result = "case09";
		}else if(items.contains("case10")){
			result = "case10";
		}else if(items.contains("case11")){
			result = "case11";
		}else if(items.contains("case12")){
			result = "case12";
		}else if(items.contains("case13")){
			result = "case13";
		}else if(items.contains("case14")){
			result = "case14";
		}
		
		return result;
		
	}
	
	public static int getTrigger(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getEnable();
		
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
	
	public static String getTriggerString(QuakePlayer qp){
		
		String result = "trigger01";
		String items = qp.getEnable();
		
		if(items.contains("trigger02")){
			result = "trigger02";
		}else if(items.contains("trigger03")){
			result = "trigger03";
		}else if(items.contains("trigger04")){
			result = "trigger04";
		}else if(items.contains("trigger05")){
			result = "trigger05";
		}else if(items.contains("trigger06")){
			result = "trigger06";
		}else if(items.contains("trigger07")){
			result = "trigger07";
		}else if(items.contains("trigger08")){
			result = "trigger08";
		}else if(items.contains("trigger09")){
			result = "trigger09";
		}
		
		return result;
		
	}
	
	public static int getExplode(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getEnable();
		
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
	
	public static String getExplodeString(QuakePlayer qp){
		
		String result = "explode01";
		String items = qp.getEnable();
		
		if(items.contains("explode02")){
			result = "explode02";
		}else if(items.contains("explode03")){
			result = "explode03";
		}else if(items.contains("explode04")){
			result = "explode04";
		}else if(items.contains("explode05")){
			result = "explode05";
		}
		
		return result;
		
	}
	
	public static int getColor(QuakePlayer qp){
		
		int result = 1;
		String items = qp.getEnable();
		
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
	
	public static String getColorString(QuakePlayer qp){
		
		String result = "color01";
		String items = qp.getEnable();
		
		if(items.contains("color02")){
			result = "color02";
		}else if(items.contains("color03")){
			result = "color03";
		}else if(items.contains("color04")){
			result = "color04";
		}else if(items.contains("color05")){
			result = "color05";
		}else if(items.contains("color06")){
			result = "color06";
		}else if(items.contains("color07")){
			result = "color07";
		}else if(items.contains("color08")){
			result = "color08";
		}else if(items.contains("color09")){
			result = "color09";
		}else if(items.contains("color10")){
			result = "color10";
		}else if(items.contains("color11")){
			result = "color11";
		}else if(items.contains("color12")){
			result = "color12";
		}else if(items.contains("color13")){
			result = "color13";
		}else if(items.contains("color14")){
			result = "color14";
		}else if(items.contains("color15")){
			result = "color15";
		}else if(items.contains("color16")){
			result = "color16";
		}else if(items.contains("color17")){
			result = "color17";
		}else if(items.contains("color18")){
			result = "color18";
		}else if(items.contains("color19")){
			result = "color19";
		}else if(items.contains("color20")){
			result = "color20";
		}else if(items.contains("color21")){
			result = "color21";
		}else if(items.contains("color22")){
			result = "color22";
		}else if(items.contains("color23")){
			result = "color23";
		}
		
		return result;
		
	}

}
