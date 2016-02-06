
public class Count {
	
	public static void main(String[] args){
		
		System.out.println(random(8));
		
	Boolean stop = false;
	int i = 1;

	for( i=1; i<17; i++){
		
		long n = (int) Math.pow(2, i);
		long recursionTime  = random((long) Math.pow(2, i));
		long multiplicationTime = 2*n*n*n;
		System.out.println("Problem size = "+n+" Recursion Time = "+recursionTime +" and Multiplication Time = "+multiplicationTime);
		if(recursionTime < multiplicationTime){
			System.out.println("n is : "+n);
			break;
		}
	}
	
	//System.out.println("Value is : " +i);
		
		
}
	
	public static long random(long n){
		if(n ==1)
			return 2;
		
		return (7*(random(n/2)) + 9*n*n/2);
	}
}
