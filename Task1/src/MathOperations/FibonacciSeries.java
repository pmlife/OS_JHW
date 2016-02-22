package MathOperations;

public class FibonacciSeries {

	/**
	 * Returns Fibonacci series (1, 1, 2, 3, 5, 8, 13, 21, …) of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */

public static int[] getFibonacciSeries(int length) {
	
	int[] FibonacciSeriesArray = new int[20];
	
	FibonacciSeriesArray [0] = 1;
	FibonacciSeriesArray [1] = 1;
    
	for (int i = 2; i < FibonacciSeriesArray.length; i++) {
		FibonacciSeriesArray [i] = FibonacciSeriesArray [i - 2] + FibonacciSeriesArray [i - 1];
	}
    return FibonacciSeriesArray;
}

public static void main(String[] args) {
	
	// TODO Auto-generated method stub
}

}
