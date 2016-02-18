/**
 * 
 */
package MathOperations;

import java.util.Scanner;

public class SumInt {
	
	public static int getSumOfDigits(int a) {
		  if (a < 0)
			  return getSumOfDigits(-a);

		  if (a < 10)
			  return a;

		  		return a % 10 + getSumOfDigits(a / 10);

		 }

	public static void main(String[] args) {
		
		int a;
		int sum;
    	
		System.out.print("Bведите целое число =  ");
    	Scanner sr = new Scanner(System.in);
    	a = sr.nextInt();
   
    	sum = getSumOfDigits (a);
   
    	System.out.println("Сумма цифр = " + sum);
	}
}

