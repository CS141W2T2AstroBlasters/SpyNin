/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodriguez
 * 
 * Programming Assignment #1 -- Final Project Phase 2
 * 
 * The purpose of this assignment is to create the skeleton code
 * for our final project.  The skeleton code will facilitate the
 * process of creating the final product for our final project.
 * 
 * Team #2: AstroBlasters
 * 		<Members: Johnny L., David K., Harrison N., Cody S., Jacob L.>
 */
package edu.csupomona.cs.cs141.SpyNin;

import java.util.Scanner;

/**
 * This class represents the flashlight and the attributes and behaviors
 * associated with flashlight that will be used in our game, SpyNin. The
 * flashlight is a powerup available to the player in the game. The flashlight's
 * purpose is to further reveal the section he is facing to identify incoming
 * ninjas by lighting the section he is in. Only the player will be able to
 * decide to whether or not to use the flashlight.
 * 
 * @author Johnny Lam
 */
public class Flashlight {
	
	private int turns=5;

	/**
	 * @return the turns
	 */
	public int getTurns() {
		return turns;
	}

	/**
	 * This is the constructor for the class {@link Flashlight}. Initially the
	 * {@link Flashlight} is set to off. This might change during the course of
	 * the {@link Game} depending on the player's {@link #choiceFlashlight} of
	 * whether to use the {@link Flashlight}.
	 */
	public Flashlight() {

	}
	
	public int increaseSight(int range) {
		range = 1;
		return range;
	}
}
