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
 * This class represents the flashlight and the attributes and 
 * behaviors associated with flashlight that will be used in our 
 * game, SpyNin.  The flashlight is a powerup available to the 
 * player in the game.  The flashlight's purpose is to further 
 * reveal the section he is facing to identify incoming ninjas by 
 * lighting the section he is in.  Only the player will be able 
 * to decide to whether or not to use the flashlight.
 * 
 * @author Johnny Lam
 */
public class Flashlight {
	
	/**
	 * This field represents the player's choice of whether to
	 * use the {@link Flashlight} or not.  Whatever the player
	 * decides will be passed to the method {@link activateFlashlight}.
	 */
	private String choiceFlashlight;
	
	/**
	 * This is the constructor for the class {@link Flashlight}. 
	 * Initially the {@link Flashlight} is set to off.  This 
	 * might change during the course of the {@link Game} depending 
	 * on the player's {@link #choiceFlashlight} of whether to 
	 * use the {@link Flashlight}.
	 */
	public Flashlight() {
		
	}
	
	/**
	 * This method will turn on or off the {@link Flashlight} 
	 * during the course of the {@link Game} to assist the player in
	 * finding the {@link Briefcase} and avoiding or killing {@link 
	 * Ninja}.
	 * @param choiceFlashlight the player's decision of whether or 
	 * not to activate the flashlight
	 */
	public void activateFlashlight (String choiceFlashlight) {
		this.choiceFlashlight = choiceFlashlight;
		
	}
}
