package edu.csupomona.cs.cs141.SpyNin;
/**
 * 
 */

/**
 * @author cody
 *
 */
public abstract class Character {
	
	private int id;
	private int lives;
	
	public void Die(){
		lives--;
	}
	
	public abstract void Move();

}
