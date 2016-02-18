package MathOperations;

import java.util.Scanner;

public class NOD {
/* Алгоритм Евклида. 
 * Для нахождения наибольшего общего делителя двух чисел a и b (a и b – целые положительные числа, причем a больше или равно b) 
 * последовательно выполняется деление с остатком, которое дает ряд равенств вида
 * a=b*q1+r1, 0<r1<b
 * b=r1*q2+r2, 0<r2<r1
 * r1=r2*q3+r3, 0<r3<r2
 * ...
 * Деление заканчивается, когда r(k+1)=0, при этом rk=НОД(a, b).
 */
	   
    public static int getCommonDivisor (int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return getCommonDivisor (b, x);
    }
	
    public static void main(String[] args) {
    	
    	int a;
		int b;
    	
		System.out.print("Bведите число A =  ");
    	Scanner sr1 = new Scanner(System.in);
    	a = sr1.nextInt();
    	
    	System.out.print("Bведите число B =  ");
    	Scanner sr2 = new Scanner(System.in);
    	b = sr2.nextInt();
    	
        System.out.println("НОД =" + " " + getCommonDivisor (a, b));
    }
}
