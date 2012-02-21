package edu.csupomona.cs.cs141.SpyNin;

import java.io.*;
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
		if((new File("board.obj").exists()) && (new File("player.obj").exists()))
		{
			return true;
		}
		return false;
	}
	
	 /**
	  * Saves a game by serializing it, saving all game states.
	  */
	public void saveGame(Board b, Player[] p){
		b.Serialize();
		for(Player pl : p)
		{
			pl.Serialize();
		}
	}
	
	/**
	 * Loads a game by unserializing it, and continuing using the
	 * game states recorded from the loaded game.
	 */
	public Board loadBoard(){
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("board.obj"));
		return (Board)is.readObject();
	}
	
	public Player loadPlayer(){
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("1.obj"));
		return (Player)is.readObject();
	}

	public Ninja[] loadNinjas(){
		Ninja[] ninjas = new Ninja[5];
		for (int i = 1; i <= 6; i++)
		{
			int id = 20 + i;
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(Integer.toString(id) + ".obj"));
			ninjas[i - 1] = is.readObject();
		}
	
		return ninjas;
	}
}
