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

/**
 * This is the abtract class {@link Character} for the {@link Player}
 * and {@link Ninja}.
 */

public abstract class Character implements Serializable {
	
	/**
	 * This field represents the identification number used to identify
	 * the {@link Character}.
	 */
	protected int id;
	
	/**
	 * This field represents the number of lives the {@link Character} has.
	 */
	protected int lives;
	
	/**
	 * This method returns the identification number of the {@link Character}.
	 */
	public int getId() {
		return id;
	}

	/**
	 * This method ...
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * This method returns the number of {@link lives}.
	 */
	public int getLives() {
		return lives;
	}

	/**
	 * This method ...
	 */
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	/**
	 * This method subtracts the number of {@link lives} from the {@link
	 * Character}.
	 */
	public void Die(){
		lives--;
	}
	
	/**
	 * This ...
	 */
	public abstract Board Move(Board grid);

}
