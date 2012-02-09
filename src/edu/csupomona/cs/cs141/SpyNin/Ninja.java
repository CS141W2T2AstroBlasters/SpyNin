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

/**
 * The Ninja object determines the attributes and behavior of a ninja. A ninja has lives, which are 
 * reduced by one when the die. Ninjas can die and move. 
 * 
 * @author Harrison Nguyen
 */
public class Ninja {
	
	/**
	 * The field {@link life} determine the life count of a ninja. Initially, life start at 1. 
	 * The method {@link #die(int)} would reduce life by one. A ninja with life at zero will not 
	 * respawn.
	 */
	private int life;

	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}

	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}
	
	/**
	 * This method {@link moveNinja} determines which direction the ninja will or will not move. This 
	 * ninjas will always move one space, in any direction. The direction of movement is random, 
	 * determined by a psudo-random number generator from 0-4. Number {@code 0} means the ninja will not move.
	 * Number {@code 1}, {@code 2}, {@code 3}, {@code 4} means that the ninja will move.
	 */
	public void moveNinja(Ninja[][] grid) {
		
	}
	
	/**
	 * This method {@link die} subtracts a ninja's life by one. The @return lives is the original life 
	 * minus {@code 1}.
	 * @param life
	 */
	public int die(int life) {
		return life;
	}
}
