/**
 * CS 141: Introduction to Programming and Problem Solving
 *
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #4 -- Final Project Milestone 3
 *
 * <The purpose of this assignment is to create executable 
 * code for the core of our final project. >
 *
 * Team #2: AstroBlasters
 * 		<Members: Johnny L., David K., Harrison N., Cody S., Jacob L.>
 */
package edu.csupomona.cs.cs141.SpyNin;

import java.io.Serializable;
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
public class Board implements Serializable {

	/**
	 * The field {@link grid} represents the 9 by 9 grid in which the objects are
	 * placed. Once set, the {@link Board} should not change. This field is for
	 * objects that are able to "move" in the game. For example, the player and 
	 * the ninjas.
	 */
	private int[][] grid;

	/**
	 * The field {@link difficulty} represents the difficulty of the game. The
	 * changes in difficulty determines how many ninjas spawn and/or initial
	 * player's life count.
	 */
	private int difficulty;
	/**
	 * This field {@link staticGrid} represents the 9 by 9 grid in which the
	 * objects are place. Once set, the {@link Board} should not change. This
	 * field is for objects that are unable to "move" in the game. For example, 
	 * the briefcase, and the powerups.
	 */
	private int[][] staticGrid;

	/**
	 * This constructor is for the class {@link Board}. This constructor
	 * places the walls, rooms, all the powerups, the briefcase, the player
	 * and the ninjas on the {@link Board}.
	 */
	public Board() {
		grid = new int[11][11];
		for (int[] pj : grid) {
			for (int p : pj) {
				p = 0;
			}
		}
		for (int i = 0; i < 11; i++) {// Places walls
			grid[0][i] = 10;
			grid[i][0] = 10;
			grid[10][i] = 10;
			grid[i][10] = 10;
		}

		for (int i = 2; i < 9; i += 3) {// Places rooms
			for (int j = 2; j < 9; j += 3) {
				grid[i][j] = 8;
			}
		}
		Random rand = new Random();
		for (int n = 4; n < 8; n++) {// Places powerups, Radar, Flashlight,
										// Radar, BulletUp
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

		for (int n = 0; n < 1; n++) {// Places briefcase
			while (true) {
				int x = rand.nextInt(11);
				int y = rand.nextInt(11);
				if (grid[x][y] == 8) {
					grid[x][y] = 3;
					break;
				}
			}
		}
		staticGrid = grid; // creates a board just full of non-moving objects

		grid[9][1] = 1;// Places the player

		for (int n = 0; n < 6; n++) {// Places the ninjas
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
	/**
	 * This constructor for the {@link Board} class with the parameters
	 * x, y and difficulty. 
	 */
	public Board(int x, int y, int difficulty) {

	}

	/**
	 * This method ...
	 * @return 
	 */
	public int getX(int type) {
		int pos = 0;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == type) {
					pos = x;
				}
		}
		return pos;
	}

	/**
	 * This method ... 
	 * @return 
	 */
	public int getY(int type) {
		int pos = 0;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == type) {
					pos = (y);
				}
		}
		return pos;
	}

	/**
	 * This method ...
	 * @return type
	 */
	public int getObj(int x, int y) {

		int type = grid[x][y];
		return type;
	}

	/**
	 * This method ...
	 * @return type
	 */
	public int getStatic(int x, int y) {

		int type = staticGrid[x][y];
		return type;
	}

	/**
	 * This method ...
	 */
	public void setObj(int x, int y, int type) {
		grid[x][y] = type;
	}

	/**
	 * This method ...
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * This method...
	 * @param difficulty The difficulty to set.
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * This method ...
	 */
	public void testBoard() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * This method ...
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
				if (i == positionX && j == positionY) {
					System.out.print("X" + "\t");

				}

				else if ((i == positionX && j == (positionY - 1))
						|| (i == positionX && j == (positionY + 1))
						|| (i == (positionX - 1) && j == positionY)
						|| (i == (positionX + 1) && j == positionY)) {
					if (staticGrid[i][j] == 4) {
						System.out.print("#" + "\t");
					}

					else if (staticGrid[i][j] == 5) {
						System.out.print("=<" + "\t");
					}

					else if (staticGrid[i][j] == 6) {
						System.out.print("**" + "\t");
					}

					else if (staticGrid[i][j] == 7) {
						System.out.print("|`|" + "\t");
					}

					else if (grid[i][j] >= 20) {
						System.out.print("N" + "\t");
					}

					else if (grid[i][j] == 10 && i != 11) {
						System.out.print("~~~" + "\t");
					}

					else if (grid[i][j] == 10 || i == 11) {
						System.out.print("~~~");
					}

					else if (staticGrid[i][j] == 8 || grid[i][j] == 3) {
						System.out.print("[R]" + "\t");
					}

					else if (staticGrid[i][j] == 9) {
						System.out.print("[B]" + "\t");
					}

					else {
						System.out.print("-" + "\t");
					}

				} else {
					if (grid[i][j] == 10 && i != 11) {
						System.out.print("~~~" + "\t");
					}

					else if (grid[i][j] == 10 || i == 11) {
						System.out.print("~~~");
					}

					else if (grid[i][j] == 8 || grid[i][j] == 3) {
						System.out.print("[R]" + "\t");
					}

					else if (grid[i][j] == 9) {
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

	/**
	 * This method ...
	 * @param direction
	 */
	public void LookBoard(int direction) {
		switch (direction) {
		case 1: {
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
					if (i == positionX && j == positionY) {
						System.out.print("X" + "\t");

					}

					else if ((positionX >= 3
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY)
							|| (i == (positionX + 1) && j == positionY)
							|| (i == (positionX - 2) && j == positionY) || (i == (positionX - 3) && j == positionY))
							|| (positionX == 2
									&& (i == positionX && j == (positionY - 1))
									|| (i == positionX && j == (positionY + 1))
									|| (i == (positionX - 1) && j == positionY)
									|| (i == (positionX + 1) && j == positionY) || (i == (positionX - 2) && j == positionY))
							|| (positionX == 1
									&& (i == positionX && j == (positionY - 1))
									|| (i == positionX && j == (positionY + 1))
									|| (i == (positionX - 1) && j == positionY) || (i == (positionX + 1) && j == positionY))) {
						if (staticGrid[i][j] == 4) {
							System.out.print("#" + "\t");
						}

						else if (staticGrid[i][j] == 5) {
							System.out.print("=<" + "\t");
						}

						else if (staticGrid[i][j] == 6) {
							System.out.print("**" + "\t");
						}

						else if (staticGrid[i][j] == 7) {
							System.out.print("|`|" + "\t");
						}

						else if (grid[i][j] >= 20) {
							System.out.print("N" + "\t");
						}

						else if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (staticGrid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (staticGrid[i][j] == 9) {
							System.out.print("[B]" + "\t");
						}

						else {
							System.out.print("-" + "\t");
						}

					} else {
						if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (grid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (grid[i][j] == 9) {
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
		case 2: {
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
					if (i == positionX && j == positionY) {
						System.out.print("X" + "\t");

					}

					else if (((positionY >= 3
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY)
							|| (i == (positionX + 1) && j == positionY)
							|| (i == (positionX) && j == positionY - 2) || (i == (positionX) && j == positionY - 3))
							|| (positionY == 2
									&& (i == positionX && j == (positionY - 1))
									|| (i == positionX && j == (positionY + 1))
									|| (i == (positionX - 1) && j == positionY)
									|| (i == (positionX + 1) && j == positionY) || (i == (positionX) && j == positionY - 2)) || (positionY == 10
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY) || (i == (positionX + 1) && j == positionY)))) {
						if (staticGrid[i][j] == 4) {
							System.out.print("#" + "\t");
						}

						else if (staticGrid[i][j] == 5) {
							System.out.print("=<" + "\t");
						}

						else if (staticGrid[i][j] == 6) {
							System.out.print("**" + "\t");
						}

						else if (staticGrid[i][j] == 7) {
							System.out.print("|`|" + "\t");
						}

						else if (grid[i][j] >= 20) {
							System.out.print("N" + "\t");
						}

						else if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (staticGrid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (staticGrid[i][j] == 9) {
							System.out.print("[B]" + "\t");
						}

						else {
							System.out.print("-" + "\t");
						}

					} else {
						if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (grid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (grid[i][j] == 9) {
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
		case 3: {
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
					if (i == positionX && j == positionY) {
						System.out.print("X" + "\t");

					}

					else if (((positionY <= 8
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY)
							|| (i == (positionX + 1) && j == positionY)
							|| (i == (positionX) && j == positionY + 2) || (i == (positionX) && j == positionY + 3))
							|| (positionY == 9
									&& (i == positionX && j == (positionY - 1))
									|| (i == positionX && j == (positionY + 1))
									|| (i == (positionX - 1) && j == positionY)
									|| (i == (positionX + 1) && j == positionY) || (i == (positionX) && j == positionY + 2)) || (positionY == 10
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY) || (i == (positionX + 1) && j == positionY)))) {
						if (staticGrid[i][j] == 4) {
							System.out.print("#" + "\t");
						}

						else if (staticGrid[i][j] == 5) {
							System.out.print("=<" + "\t");
						}

						else if (staticGrid[i][j] == 6) {
							System.out.print("**" + "\t");
						}

						else if (staticGrid[i][j] == 7) {
							System.out.print("|`|" + "\t");
						}

						else if (grid[i][j] >= 20) {
							System.out.print("N" + "\t");
						}

						else if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (staticGrid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (staticGrid[i][j] == 9) {
							System.out.print("[B]" + "\t");
						}

						else {
							System.out.print("-" + "\t");
						}

					} else {
						if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (grid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (grid[i][j] == 9) {
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
		case 4: {
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
					if (i == positionX && j == positionY) {
						System.out.print("X" + "\t");

					}

					else if (((positionX <= 8
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY)
							|| (i == (positionX + 1) && j == positionY)
							|| (i == (positionX + 2) && j == positionY) || (i == (positionX + 3) && j == positionY))
							|| (positionX == 9
									&& (i == positionX && j == (positionY - 1))
									|| (i == positionX && j == (positionY + 1))
									|| (i == (positionX - 1) && j == positionY)
									|| (i == (positionX + 1) && j == positionY) || (i == (positionX + 2) && j == positionY)) || (positionX == 10
							&& (i == positionX && j == (positionY - 1))
							|| (i == positionX && j == (positionY + 1))
							|| (i == (positionX - 1) && j == positionY) || (i == (positionX + 1) && j == positionY)))) {
						if (staticGrid[i][j] == 4) {
							System.out.print("#" + "\t");
						}

						else if (staticGrid[i][j] == 5) {
							System.out.print("=<" + "\t");
						}

						else if (staticGrid[i][j] == 6) {
							System.out.print("**" + "\t");
						}

						else if (staticGrid[i][j] == 7) {
							System.out.print("|`|" + "\t");
						}

						else if (grid[i][j] >= 20) {
							System.out.print("N" + "\t");
						}

						else if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (staticGrid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (staticGrid[i][j] == 9) {
							System.out.print("[B]" + "\t");
						}

						else {
							System.out.print("-" + "\t");
						}

					} else {
						if (grid[i][j] == 10 && i != 11) {
							System.out.print("~~~" + "\t");
						}

						else if (grid[i][j] == 10 || i == 11) {
							System.out.print("~~~");
						}

						else if (grid[i][j] == 8 || grid[i][j] == 3) {
							System.out.print("[R]" + "\t");
						}

						else if (grid[i][j] == 9) {
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

}
