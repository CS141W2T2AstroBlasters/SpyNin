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

import java.io.*;

/**
 * CS 141: Introduction to Programming and Problem Solving Professor: Edwin
 * Rodr&iacute;guez
 * 
 * Programming Assignment #N
 * 
 * Spies vs. Ninjas <need general description here>
 * 
 * Team #2 / AstroBlasters <team-member-names-if-team-assignment>
 * 
 * This is the class is used to load and save games using the serialization
 * interface.
 */
public class SaveLoad implements Serializable {

	/**
	 * Checks for saved games to determine whether or not a game can be loaded.
	 */
	public boolean checkSaves() {
		return true;
	}

	/**
	 * Saves a game by serializing it, saving all game states.
	 * 
	 * @throws FileNotFoundException
	 */
	public void saveGame(Board b, Player p, Ninja[] n)
			throws FileNotFoundException {

		FileOutputStream fos;

		fos = new FileOutputStream("SaveGame.dat");

		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fos);

			oos.writeObject(p);
			oos.writeObject(b);
			oos.writeObject(n);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}
	}

	/**
	 * Loads a game by unserializing it, and continuing using the game states
	 * recorded from the loaded game.
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public Board loadBoard() throws IOException, ClassNotFoundException {
		try {
		FileInputStream fis = new FileInputStream("SaveGame.dat");
		ObjectInputStream ois;
		Board b;
		
			ois = new ObjectInputStream(fis);
		
		
		b = (Board) ois.readObject();
		return b;
		
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		return null;	
	}

	public Player loadPlayer() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("SaveGame.dat");
			ObjectInputStream ois;
			Player p;
			
				ois = new ObjectInputStream(fis);
			
			
			p = (Player) ois.readObject();
			return p;
			
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			return null;

	}

	public Ninja[] loadNinjas() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("SaveGame.dat");
			ObjectInputStream ois;
			Ninja[] n;
			
				ois = new ObjectInputStream(fis);
			
			
			n = (Ninja[]) ois.readObject();
			return n;
			
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			return null;

	}

}
