package MathOperations;

public class EqualSumsOfTriads {
	/**
	 * Подсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * @return 
	 * 
	 */
	
	public static int getSixDigitNumbersCount() {
		
		int Result = 0;
		
		for (long i = 100000; i <= 999999; i++){
			int n1 = (int) (i / 100000);
			int n2 = (int) (i / 10000) % 10;
			int n3 = (int) (i / 1000) % 10;
			int n4 = (int) (i / 100) % 10;
			int n5 = (int) (i / 10) % 10;
			int n6 = (int) (i ) % 10;
			
			int SumLeft = n1 + n2 + n3;
			int SumRight = n4 + n5 + n6;
			
			if ( SumLeft == SumRight ){
			
				Result++;
			
			}
		}
		
		return Result;
	}
	
	public static void main(String[] args) {
	
		System.out.println(getSixDigitNumbersCount());

	}

}
