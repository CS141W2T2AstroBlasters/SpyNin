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

/**
 * This class represents the radar and the attributes and 
 * behaviors associated with radar that will be used in our
 * game, SpyNin.  The radar is a powerup available to the 
 * player in the game.  The radar's purpose is to reveal the 
 * location of the briefcase in the game.  Only the player 
 * will be able to decide whether or not to activate the radar.
 * In addition, the radar will not reveal the positions of the
 * enemy ninjas.
 * @author Johnny Lam
 *
 */
public class Radar {

	/**
	 * This is the constructor for the class {@link Radar}.  
	 * Initially the {@link Radar} is set to off.  This 
	 * might change during the course of the {@link Game}
	 * depending on the player's {@link choiceRadar} of whether
	 * to use the {@link Radar}
	 */
	public Radar() {
		
	}
	
	private boolean activeRadar=false;
	
	/**
	 * This method will turn on or off the {@link Radar} during
	 * the course of the {@link Game} to assist the player in 
	 * finding the {@link Briefcase}.  
	 * @param radar 
	 * @param choiceRadar the player's decision of whether or
	 * not to activate the radar
	 */

	public boolean isActiveRadar() {
		return activeRadar;
	}

	public void setActiveRadar(boolean activeRadar) {
		this.activeRadar = activeRadar;
	}
	
	

}
