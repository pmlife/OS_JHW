package MatrixOperations;

import java.util.Arrays;

import com.itbursa.synekop.Matrix;

public class MatrixOps {
/*	3. —оздать класс "ћатрица".
 *  ласс должен иметь следующие пол€:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 *  
 *   ласс должен иметь следующие методы:
 *  1) сложение с другой матрицей;
 *  2) умножение на число;
 *  3) умножение на другую матрицу;
 *  4) транспонирование;
 *  5) вывод на печать.
*/
	
	private double[][] matrixx;
	private int rows;
	private int columns;

	/**
	 * Creates a new instance of Matrix rows-by-columns of 0's
	 * 
	 * @param rows
	 *            -number of rows
	 * @param columns
	 *            - number of columns
	 * @return 
	 */
	public void Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		matrixx = new double [rows][columns];
		Arrays.fill (matrixx, 0);
	}

	/**
	 * Creates a new instance of Matrix based on 2d array
	 * 
	 * @param data - data to fill the matrix
	 * @return 
	 */
	public void Matrix(double[][] matrixx) {
		rows = matrixx.length;
        columns = matrixx[0].length;
        this.matrixx = new double[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                    this.matrixx[i][j] = matrixx[i][j];
		
	}

	/**
	 * Returns the result of adding specified matrix to this matrix
	 * @param matrix
	 * @return 
	 * @return
	 */
	private void Matrix(Matrix X) { 
		this(X.matrixx); 
		}
	
	public Matrix plus(Matrix Y) {
		Matrix X = this;
        Matrix Result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                Result.matrixx[i][j] = X.matrixx[i][j] + Y.matrixx[i][j];
        return Result;
	}

	/**
	 * Returns the result of multiplying this matrix by specified number
	 */
	public Matrix times(double number) {
		
		Matrix X = this;
		int n = 5;
        Matrix Result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                Result.matrixx[i][j] = X.matrixx[i][j] * n;
        return Result;
        
	}

	/**
	 * Returns the result of multiplying this matrix by specified matrix
	 */
	public Matrix times(Matrix Y) {
		Matrix X = this;
        Matrix ResultMult = new Matrix(X.rows, Y.columns);
        for (int i = 0; i < ResultMult.rows; i++)
            for (int j = 0; j < ResultMult.columns; j++)
                for (int a = 0; a < X.rows; a++)
                ResultMult.data[i][j] += (X.matrixx[i][a] * Y.matrixx[a][j]);
        return ResultMult;
	}

	/**
	 * Transposes (turn all the rows of a given matrix into columns and
	 * vice-versa) this matrix
	 * @param <Matrix>
	 * 
	 * @return transpose of the invoking matrix
	 */
	public Matrix transpose() {
		 Matrix X = new Matrix(rows, columns);
	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < columns; j++)
	                X.matrixx[j][i] = this.matrixx[i][j];
	        return X;
	}

	/**
	 * Prints matrix to the "standard" output stream.
	 */
	public void print() {

		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) 
               System.out.printf("ћатрица ", matrixx[i][j]);
            System.out.println();
        }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
