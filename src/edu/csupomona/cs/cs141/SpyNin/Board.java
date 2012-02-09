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
package edu.csupomona.cs.cs141.prog_assgmnt_4;

/**
 * The object Board represents the grid, represented by an integer array by an array, on which the game 
 * takes place. The difficulty will determine the number of ninjas that will spawn on the board. The 
 * board facilitates the placement of objects Ninja, Player, and PowerUp, represented by the behavior
 * placeNinja, placePlayer, and placePowerUp. The place briefcase
 * 
 * @author Harrison Nguyen
 */
public class Board {
	
	/**
	 * The field {@link grid} represents the 9 by 9 grid on which the object are placed. Once set, the 
	 * board shouldn't change.
	 */
	private int[][] grid;
	
	/**
	 * The field {@link difficulty} represents the difficulty of the game. The changes in difficulty 
	 * determines how many ninjas spawn and/or initial player's life count.
	 */
	private int difficulty;

	/**
	 * @return the grid
	 */
	public int[][] getGrid() {
		return grid;
	}

	/**
	 * @param grid the grid to set
	 */
	public void setGrid(int[][] grid) {
		this.grid = grid;
	}

	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	/**
	 * The behavior {@link placeBriefcase} spawns a briefcase on the board. Once placed, the behavior 
	 * of the briefcase doesn't change for the rest of the round.
	 * @param grid
	 */
	public void placeBriefcase(int[][] grid) {
		
	}
	
	/**
	 * The method {@link placePlayer} spawns a player on the board. Once placed, the player can be
	 * moved using methods in the Player Class.
	 * @param grid
	 */
	public void placePlayer(Player[][] grid) {
		
	}	
	
	/**
	 * The method {@link placeNinja} spawns a ninja on the board. Once placed, the ninja is moved
	 * using methods in the Ninja Class.
	 * @param grid
	 */
	public void placeNinja(Ninja[][] grid) {
		
	}	
	
	/**
	 * The method {@link placePowerUp} spawns a power up on the board. Once spawned, the power ups 
	 * cannot be moved
	 * @param grid
	 */
	public void placePowerUp(PowerUp[][] grid) {
		
	}
}
