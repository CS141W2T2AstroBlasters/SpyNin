/**
 * CS 141: Introduction to Programming and Problem Solving
 *
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #4
 *
 * Team #2
 * 	<David Khacherian, Cody Sheppard, Jacob Longazo, Harrison Nguyen, Jonny Lam>
 */
package edu.csupomona.cs.cs141.SpyNin;

import java.util.Random;

/**
 * The object Board represents the grid, represented by an integer array by an
 * array, on which the game takes place. The difficulty will determine the
 * number of ninjas that will spawn on the board. The board facilitates the
 * placement of objects Ninja, Player, and PowerUp, represented by the behavior
 * placeNinja, placePlayer, and placePowerUp. The place briefcase
 * 
 * @author Harrison Nguyen
 */
public class Board {

	/**
	 * The field {@link grid} represents the 9 by 9 grid on which the object are
	 * placed. Once set, the board shouldn't change.
	 */
	private int[][] grid;

	/**
	 * The field {@link difficulty} represents the difficulty of the game. The
	 * changes in difficulty determines how many ninjas spawn and/or initial
	 * player's life count.
	 */
	private int difficulty;

	private int[][] staticGrid;

	public Board() {
		grid = new int[11][11];
		for (int[] pj : grid) {
			for (int p : pj) {
				p = 0;
			}
		}
		for (int i = 0; i < 11; i++) {
			grid[0][i] = 10;
			grid[i][0] = 10;
			grid[10][i] = 10;
			grid[i][10] = 10;
		}

		for (int i = 2; i < 9; i += 3) {
			for (int j = 2; j < 9; j += 3) {
				grid[i][j] = 8;
			}
		}
		Random rand = new Random();
		for (int n = 4; n < 8; n++) {
			while (true) {
				int x = rand.nextInt(11);
				int y = rand.nextInt(11);
				if ((grid[x][y] == 0) && (x != 8 && y != 1)
						&& (x != 9 && y != 2)) {
					grid[x][y] = n;
					break;
				}
			}
		}

		for (int n = 0; n < 1; n++) {
			while (true) {
				int x = rand.nextInt(11);
				int y = rand.nextInt(11);
				if (grid[x][y] == 8) {
					grid[x][y] = 3;
					break;
				}
			}
		}
		staticGrid = grid;

		grid[1][9] = 1;

		for (int n = 0; n < 5; n++) {
			while (true) {
				int x = rand.nextInt(11);
				int y = rand.nextInt(11);
				if ((grid[x][y] == 0) && (x != 8 && y != 1)
						&& (x != 9 && y != 2)) {
					grid[x][y] = 20 + n;
					break;
				}
			}
		}

	}

	public Board(int x, int y, int difficulty) {

	}

	/**
	* @param type The object id of the object to search for.
	* @return Returns the X coordinate of a given object on the board.
	*/
	public int getX(int type) {
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == type) {
					return (x);
				}
		}
		return (-1);
	}
	
	/**
	* @param type The object id of the object to search for.
	* @return Returns the Y coordinate of a given object on the board.
	*/
	public int getY(int type) {
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == type) {
					return (y);
				}
		}
		return (-1);
	}

	/**
	* @param x The X coordinate of the tile to search.
	* @param y The Y coordinate of the tile to search.
	* @return Returns the object id of the given tile..
	*/
	public int getObj(int x, int y) {

		int type = grid[x][y];
		return type;
	}

	/**
	* @param x The X coordinate of the tile to modify.
	* @param y The Y coordinate of the tile to modify.
	* @param type The object id of the object to place on the given tile.
	*/
	public void setObj(int x, int y, int type) {
		grid[x][y] = type;
	}

	/**
	 * @return Returns the game difficulty. 1: Easy, 2: Medium, 3: Hard, 4: GTFO NOOB
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty The difficulty at which to set the game.
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	* 
	*/
	public void testBoard() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[j][i] + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	* Prints the game board to standard out, replacing object id's with more friendly characters.
	*/
	public void displayBoard() {
		int positionY = 0;
		int positionX = 0;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == 1) {
					positionY = y;
				}
		}
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == 1) {
					positionX = x;
				}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (j == positionX && i == positionY) {
					System.out.print("X" + "\t");

				}

				else if ((j == positionX && i == (positionY - 1))
						|| (j == positionX && i == (positionY + 1))
						|| (j == (positionX - 1) && i == positionY)
						|| (j == (positionX + 1) && i == positionY)) {
					if (grid[j][i] == 4) {
						System.out.print("#" + "\t");
					}

					else if (grid[j][i] == 5) {
						System.out.print("=<" + "\t");
					}

					else if (grid[j][i] == 6) {
						System.out.print("**" + "\t");
					}

					else if (grid[j][i] == 7) {
						System.out.print("|`|" + "\t");
					}

					else if (grid[j][i] >= 20) {
						System.out.print("N" + "\t");
					}

					else if (grid[j][i] == 10 && i != 11) {
						System.out.print("~~~" + "\t");
					}

					else if (grid[j][i] == 10 || i == 11) {
						System.out.print("~~~");
					}

					else if (grid[j][i] == 8) {
						System.out.print("[R]" + "\t");
					}

					else if (grid[j][i] == 9 || grid[j][i] == 3) {
						System.out.print("[B]" + "\t");
					}

					else {
						System.out.print("-" + "\t");
					}

				} else {
					if (grid[j][i] == 10 && i != 11) {
						System.out.print("~~~" + "\t");
					}

					else if (grid[j][i] == 10 || i == 11) {
						System.out.print("~~~");
					}

					else if (grid[j][i] == 8 || grid[j][i] == 3) {
						System.out.print("[R]" + "\t");
					}

					else if (grid[j][i] == 9) {
						System.out.print("[B]" + "\t");
					}

					else {
						System.out.print("-" + "\t");
					}
				}
			}
			System.out.println();
		}
	}

}
