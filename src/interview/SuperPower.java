package interview;

public class SuperPower {
	
	public static int superPower(int z) {

		for(int i=2;i<=Math.sqrt(z);i++){
			
			for(int j=1;j<(3.322 *Math.log10(z)); j++){
				
				if(Math.pow(i, j) == z){
					System.out.println( i+" power "+j);
					return 1;
				}
			}
		}
		
		return 0;
    }
	
	public static void main(String [] args){
		
		System.out.println(superPower(10200));
	}

}
