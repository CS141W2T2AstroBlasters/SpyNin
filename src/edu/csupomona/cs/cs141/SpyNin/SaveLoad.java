
package edu.csupomona.cs.cs141.SpyNin;
import java.io.Serializable;

/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #N
 *
 * Spies vs. Ninjas <need general description here>
 *
 * Team #2 / AstroBlasters
 *   <team-member-names-if-team-assignment>
 *   
 * This is the class is used to load and save games using the 
 * serialization interface.
 */
public class SaveLoad implements Serializable {
	
	/**
	 * Checks for saved games to determine whether or not a game can be 
	 * loaded.
	 */
	public boolean checkSaves(){
		return true;
	}
	
	 /**
	  * Saves a game by serializing it, saving all game states.
	  */
	public void saveGame(){}
	
	/**
	 * Loads a game by unserializing it, and continuing using the
	 * game states recorded from the loaded game.
	 */
	public void loadGame(){}

}
