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
/**
 * The Ninja object determines the attributes and behavior of a ninja. A ninja has lives, which are 
 * reduced by one when the die. Ninjas can die and move. 
 * 
 * @author Harrison Nguyen
 */
public class Ninja extends Character{
	private Random r = new Random();
	

	public Ninja(int num){
		this.id=num;
		this.lives=1;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.csupomona.cs.cs141.SpyNin.Character#Move()
	 */
	// Added an argument for ninja to define which ninja is moving where. Created Exception up top.
	public Board Move(Board grid) {
		int direction;
		direction = r.nextInt(4);
		switch (direction) {
			case 0: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x, y-1)==0){
					grid.setObj(x, y-1, id);
					grid.setObj(x, y, 0);
				}
				break;
			}
			case 1: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x-1, y)==0){
					grid.setObj(x-1, y, id);
					grid.setObj(x, y, 0);
				}
				break;
			}
			case 2: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x+1, y)==0){
					grid.setObj(x+1, y, id);
					grid.setObj(x, y, 0);
				}
				break;
			}
			case 3: {
				int y = grid.getY(getId());
				int x = grid.getX(getId());
				if(grid.getObj(x, y+1)==0){
					grid.setObj(x, y+1, id);
					grid.setObj(x, y, 0);
				}
				break;
			}
		}
		return grid;
	// TODO Random Number generator for movement, should be the same as Player move basically	
	}
}