package interview;

public class array {
	public static int solution(int[] a){
		
		// Increasing sub array of a given array
		
		int start = 0,end = 0,count = 0,finalcount = 0,finalStart =0;
		
		for(int i=1;i<a.length;i++){
			if(a[i] > a[i-1]){
				end = i;
				count = end-start+1;
			}
			else{
				//finalcount = count;
				start =i;
				count =0;
			}
			
			if(count > finalcount){
				finalcount = count;
				finalStart = start;
			}
		}
		
		return finalStart;
	}
	
	public static void main(String [] args){
		int[] a = new int[10];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 1;
		a[4] = 2;
		a[5] = 30;
		a[6] = 0;
		a[7] = 50;
		a[8] = 1;
		a[9] = 6;
		
		
		System.out.println(solution(a));
		
	}

}
