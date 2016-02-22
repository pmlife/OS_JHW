package MathOperations;

public class PascalsTriangle {

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
public static void main(String[] args) {
		
    int [][] TriangleArray = new int [10][];
    TriangleArray[0] = new int [1];
    TriangleArray[1] = new int [2];
    TriangleArray[1][0] = TriangleArray[1][1] = 1;
    System.out.println(TriangleArray[0][0] = 1);
    System.out.println(TriangleArray[1][0] + "\t" + TriangleArray[1][1]);
    for (int i = 2; i < 10; i++)
    {
        TriangleArray[i] = new int [i+1];
        System.out.print((TriangleArray[i][0] = 1) + "\t");
        for (int j = 1; j < i; j++)
        {
            System.out.print((TriangleArray[i][j] = TriangleArray[i-1][j-1] + TriangleArray[i-1][j]) + "\t");
        }
        System.out.println(TriangleArray[i][i]=1);
    }
}
}
