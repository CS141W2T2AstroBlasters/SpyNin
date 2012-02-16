/**
 * @author zero-one
 * 
 * This class is here for testing the game package.
 * You can basically do anything you want here.
 */
import edu.csupomona.cs.cs141.SpyNin.*;
public class Debug_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new Board();
		int[][] grid =  board.getGrid();
		for (int i=0;i<11;i++){
			for (int j=0;j<11;j++){
				System.out.print(grid[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
