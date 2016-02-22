package MathOperations;

public class OneHundredPrimeDigits {

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */

public static boolean isPrime(int x) {
		
		if (x < 2) return false;
	    for (int i = 2; i*i <= x; i++)
	        if (x % i == 0) return false;
	    return true;
	}	
	

public int[] getPrimeSeries(int length) {
	int[] PrimeSeriesArray = new int[100];
	
	int i = 0;
	int membervalue = 2;
	
	 while (true) {
         if (isPrime(membervalue)) {
        	 PrimeSeriesArray[i] = membervalue;
             i++;
             if (i == 100) {
                 break;
             			}
         			}
         membervalue++;
     	}
     return PrimeSeriesArray;
	
	}	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
