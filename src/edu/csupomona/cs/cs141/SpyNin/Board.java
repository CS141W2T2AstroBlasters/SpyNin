/**
 * CS 141: Introduction to Programming and Problem Solving
 *
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #4
 *
 * <description-of-assignment>
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
				if ((grid[x][y] == 0)&&(x!=8&&y!=1)&&(x!=9&&y!=2)) {
					grid[x][y] = n;
					break;
				}
			}
		}
		
		for (int n = 0; n < 1; n++) {
			while (true) {
				int x = rand.nextInt(11);
				int y = rand.nextInt(11);
				if ((grid[x][y] == 8) {
					grid[x][y] = 3;
					break;
				}
			}
		}
		staticGrid=grid;
		
		grid[9][1] = 1;

		
		for (int n = 0; n < 5; n++) {
			while (true) {
				int x = rand.nextInt(11);
				int y = rand.nextInt(11);
				if ((grid[x][y] == 0)&&(x!=8&&y!=1)&&(x!=9&&y!=2)) {
					grid[x][y] = 20+n;
					break;
				}
			}
		}
		
		

	}

	public Board(int x, int y,int difficulty) {

	}

	/**
	 * @return the grid
	 */
	public int[][] getGrid() {
		return grid;
	}

	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty
	 *            the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
}
