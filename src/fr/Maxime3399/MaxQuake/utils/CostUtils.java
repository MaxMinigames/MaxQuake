package fr.Maxime3399.MaxQuake.utils;

public class CostUtils {
	
	public static int getCaseCost(int level){
		
		int result = 200;
		
		if(level == 2){
			result = 200;
		}else if(level == 3){
			result = 400;
		}else if(level == 4){
			result = 800;
		}else if(level == 5){
			result = 1600;
		}else if(level == 6){
			result = 3200;
		}else if(level == 7){
			result = 6400;
		}else if(level == 8){
			result = 12800;
		}else if(level == 9){
			result = 25600;
		}else if(level == 10){
			result = 51200;
		}else if(level == 11){
			result = 102400;
		}else if(level == 12){
			result = 204800;
		}else if(level == 13){
			result = 409600;
		}else if(level == 14){
			result = 819200;
		}
		
		return result;
		
	}
	
	public static int getTriggerCost(int level){
		
		int result = 1000;
		
		if(level == 2){
			result = 2000;
		}else if(level == 3){
			result = 5000;
		}else if(level == 4){
			result = 12000;
		}else if(level == 5){
			result = 28000;
		}else if(level == 6){
			result = 60000;
		}else if(level == 7){
			result = 130000;
		}else if(level == 8){
			result = 300000;
		}else if(level == 9){
			result = 1000000;
		}
		
		return result;
		
	}
	
	public static int getExplodeCost(int level){
		
		int result = 500;
		
		if(level == 2){
			result = 2000;
		}else if(level == 3){
			result = 5000;
		}else if(level == 4){
			result = 15000;
		}else if(level == 5){
			result = 40000;
		}
		
		return result;
		
	}
	
	public static int getColorCost(int level){
		
		int result = 100;
		
		if(level == 2){
			result = 200;
		}else if(level == 3){
			result = 300;
		}else if(level == 4){
			result = 400;
		}else if(level == 5){
			result = 500;
		}else if(level == 6){
			result = 600;
		}else if(level == 7){
			result = 700;
		}else if(level == 8){
			result = 800;
		}else if(level == 9){
			result = 900;
		}else if(level == 10){
			result = 1000;
		}else if(level == 11){
			result = 1100;
		}else if(level == 12){
			result = 1200;
		}else if(level == 13){
			result = 1300;
		}else if(level == 14){
			result = 1400;
		}else if(level == 15){
			result = 1500;
		}else if(level == 16){
			result = 1600;
		}else if(level == 17){
			result = 1700;
		}else if(level == 18){
			result = 2200;
		}else if(level == 19){
			result = 3000;
		}else if(level == 20){
			result = 4000;
		}else if(level == 21){
			result = 5500;
		}else if(level == 22){
			result = 8000;
		}else if(level == 23){
			result = 12000;
		}
		
		return result;
		
	}

}
