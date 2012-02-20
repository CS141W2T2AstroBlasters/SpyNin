package edu.csupomona.cs.cs141.SpyNin;
/**
 * 
 */

/**
 * This is the class for the Invincibility powerup. The powerup will only last a
 * certain number of turns.
 * 
 * @author Cody Sheppard
 * 
 */
public class Invincibility {

	/**
	 * This is the constructor for the Invincibility class. 
	 */
	public Invincibility() {

	}
	
	/**
	 * This is the amount of turns that the powerup will last.
	 */
	private int turns=5;

	/**
	 * @return the turns
	 */
	public int getTurns() {
		return turns;
	}
}
