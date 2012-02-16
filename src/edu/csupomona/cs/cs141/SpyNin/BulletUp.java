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

/**
* A class to represent a powerup that gives the player extra bullets.
*/
public class BulletUp
{
	/*
	* Initializes the powerup with the number of extra bullets to be awarded to the player.
	*/
	public BulletUp()
	{
		num_bullets = 1;
	}
	
	/**
	* Whether or not the powerup is currently active.
	*/
	private boolean active;
	
	/**
	* The number of extra bullets that this powerup awards the player.
	*/
	public final int num_bullets;

	/**
	* Returns whether or not the powerup is currently active.
	*/
	public boolean isActive()
	{
		return active;
	}
}
