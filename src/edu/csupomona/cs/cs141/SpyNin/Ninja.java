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
import java.util.Random;
/**
 * The Ninja object determines the attributes and behavior of a ninja. A ninja has lives, which are 
 * reduced by one when the die. Ninjas can die and move. 
 * 
 * @author Harrison Nguyen
 */
public class Ninja extends Character{
	
	/**
	 * ...
	 */
	private Random r = new Random();
	
	/**
	 * This constructor ...
	 */
	public Ninja(int num){
		this.id=num;
		this.lives=1;
	}
	/**
	 * ...
	 * (non-Javadoc)
	 * 
	 * @see edu.csupomona.cs.cs141.SpyNin.Character#Move()
	 * @return grid
	 */
	public Board Move(Board grid) {
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
		return grid;
	// TODO Random Number generator for movement, should be the same as Player move basically	
	}
}