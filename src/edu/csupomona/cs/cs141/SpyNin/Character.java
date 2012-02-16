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
 * 
 */

/**
 * @author cody
 *
 */
public abstract class Character implements Serializable {
	
	protected int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	protected int lives;
	
	public void Die(){
		lives--;
	}
	
	public abstract Board Move(Board grid);

}
