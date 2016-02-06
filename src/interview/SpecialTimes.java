package interview;

import java.util.HashSet;
import java.util.Set;

public class SpecialTimes {
	
	public static int getNoOfTimes(String start, String end){
		
		int startHour,startMin,startSec,endHour,endMin,endSec,count = 0;
		
		String[] parse = start.split(":");
		startHour = Integer.parseInt(parse[0]);
		startMin = Integer.parseInt(parse[1]);		
		startSec = Integer.parseInt(parse[2]);
		
		String[] parse1 = end.split(":");
		endHour = Integer.parseInt(parse1[0]);
		endMin = Integer.parseInt(parse1[1]);		
		endSec = Integer.parseInt(parse1[2]);
		
		
		
		for(int i= startHour;i<=endHour;i++){
			
			int limitMin = 0;
			if(startHour == endHour)
				limitMin = endMin;
			else
				limitMin = 60;
			
			for(int j= startMin;j<=limitMin;j++){
				
				int limitSec = 0;
				if(startMin == endMin)
					limitSec = endSec;
				else
					limitSec = 60;
				
				for(int k=startSec ;k<=limitSec;k++){
					Set<Integer> set = new HashSet<Integer>();
					set.add(i/10);
					set.add(i%10);
					set.add(j/10);
					set.add(j%10);
					set.add(k/10);
					set.add(k%10);
					
					if(set.size() <=2){
						count++;
					}
					
				}
			}
		}
		
		return count;
	}

	
	public static void main(String [] args){
		System.out.println(getNoOfTimes("00:00:00","23:59:59"));
	}
}
