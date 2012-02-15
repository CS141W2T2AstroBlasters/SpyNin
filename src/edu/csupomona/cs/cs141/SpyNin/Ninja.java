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

import java.util.Random;
import edu.csupomona.cs.cs141.SpyNin.Player;

/**
 * The Ninja object determines the attributes and behavior of a ninja. A ninja
 * has lives, which are reduced by one when the die. Ninjas can die and move.
 * 
 * @author Harrison Nguyen
 */
public class Ninja extends Character {

	public Ninja(int id) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.csupomona.cs.cs141.SpyNin.Character#Move()
	 */
	@Override
	public void Move(Board grid) {
		Random r = new Random();
		int direction;
		direction = r.nextInt(5);
		switch (direction) {
			case 0: {
				break;
			}
			case 1: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x, y-1)==0){
					grid.setObj(x, y-1, 1);
					grid.setObj(x, y, 0);
				}
				break;
			}
			case 2: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x-1, y)==0){
					grid.setObj(x-1, y, 1);
					grid.setObj(x, y, 0);
				}
				break;
			}
			case 3: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x+1, y)==0){
					grid.setObj(x+1, y, 1);
					grid.setObj(x, y, 0);
				}
				break;
			}
			case 4: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x, y+1)==0){
					grid.setObj(x, y+1, 1);
					grid.setObj(x, y, 0);
				}
				break;
			}
		}
	// TODO Random Number generator for movement, should be the same as Player move basically	
	}

	public void killPlayer(Board grid) {
		int y = grid.getY(getId());
		int x = grid.getX(getId());
		if (grid.getObj(x, y + 1) == 1 || grid.getObj(x + 1, y) == 1
				|| grid.getObj(x, y - 1) == 1 || grid.getObj(x - 1, y) == 1) {
		}
		// TODO Check to see if Ninja kill player
	}
}
