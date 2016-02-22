package MathOperations;

public class ChB {

	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 * @return 
	 */

/* public static int[][] printChessboard() { */
	
public static void main (String[] args) {    
	
	int[][] ChessBoardArray = new int[2][8];
	
    char WhiteLit = 'w';
    char BlackLit = 'b';
    
    for (int row = 0; row < ChessBoardArray.length; row++) {
        int[] x = ChessBoardArray[row];
        for (int col = 0; col < x.length; col++) {
            if ((row + col) % 2 == 0) {
            	ChessBoardArray[row][col] = WhiteLit;
            }
            else ChessBoardArray[row][col] = BlackLit;
            System.out.print((char)ChessBoardArray[row][col] + "\t");    
        }
        System.out.println();
        
    }
    
    return;
 }
 }
