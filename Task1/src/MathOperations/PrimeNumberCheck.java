package MathOperations;

public class PrimeNumberCheck {

	public static boolean isPrime(int x) {
		
		if (x < 2) return false;
	    for (int i = 2; i*i <= x; i++)
	        if (x % i == 0) return false;
	    		return true;
	}	
	
	public static void main(String[] args) {
		
		int x = 839;
		
		if (isPrime(x)) 
			   System.out.println(x + " - простое число");
		else 
			   System.out.println(x + " - составное число");
		       
	}

}
