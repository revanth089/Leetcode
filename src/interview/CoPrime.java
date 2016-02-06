package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoPrime {

	public static int coprimeFinder(int n){
		int temp =n;
		//List<Integer> factors = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		float value = 1;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				
				set.add(i);
				n /= i;
			}
		}
		//System.out.println(set);
		for(int x:set){
			value *= (1-(1.0/x));
		}
		float retVal = temp*value;
		return (int) (retVal);
	}


/*	public static void main(String []args){
		//System.out.println(coprimeFinder(4600));
		int[] a = new int[4];
		a[0] = 36;
		a[1] = 72;
		a[2] = 1;
		a[3] = 100000;
		System.out.println(coprimeCount(a));
		
	}*/
	

	
	
	static int coprimeCount(int[] A) {
		
		int retVal[] = new int[A.length];
		
		for(int i =0;i<A.length;i++){
			retVal[i] = coprimeFinder(A[i]);
			//System.out.println(retVal[i] );
		}
		return retVal[1];
	}
	
}
