package MathOperations;

/**
 * 1.9. Создать целый шестимерный массив с двумя значениями в каждом
 * измерении. Заполнить массив числами из начала натурального ряда: 1, 2, 3,
 * … Сказать, сколько потребуется чисел ?
 * 
 * @return
 */

public class SixDimensionArray {
	
public static int createSixDimensionArray() {
	int CountNumbers = 0;
    int[][][][][][] SixDimensionArray = new int[2][2][2][2][2][2];


    for (int i = 0; i < SixDimensionArray.length; i++) {
        int[][][][][] FiveDimensionArray = SixDimensionArray[i];
        for (int j = 0; j < FiveDimensionArray.length; j++) {
            int[][][][] FourDimentionArray = FiveDimensionArray[j];
            for (int k = 0; k < FourDimentionArray.length; k++) {
                int[][][] ThreeDimensionArray = FourDimentionArray[k];
                for (int l = 0; l < ThreeDimensionArray.length; l++) {
                    int[][] TwoDimensionArray = ThreeDimensionArray[l];
                    for (int m = 0; m < TwoDimensionArray.length; m++) {
                        int[] OneDimensionArray = TwoDimensionArray[m];
                        for (int n = 0; n < OneDimensionArray.length; n++) {
                        	OneDimensionArray[n] = CountNumbers;
                            CountNumbers++;
                        }
                    }
                }
            }
        }
    }
    return CountNumbers;
}

public static void main(String[] args) {
	
	System.out.println(createSixDimensionArray());

}


}
