package MathOperations;

public class SumOfRow {
/*
* Returns sum of row: 1! - 2! + 3! – 4! + 5! - … + n!
* 
* @param n
*            - positive number
*/	

public static int factorial(int F)
    {
        int Result = 1;
        for (int i = 2; i <= F; ++i) {
            Result *= i;
        }
        return Result;
    }	
	
public static int getSumOfRow(int n) {
		
		int sum = 1;
		
		for (int i = 2; i <= n; i++)
			if (i % 2 == 0) {
             sum -= factorial(i);
            } 
			else {
             sum += factorial(i);
            }
		return sum;
		 }		
	
	
public static void main(String[] args) {
			
		System.out.println(getSumOfRow(5));
					       
		}

}