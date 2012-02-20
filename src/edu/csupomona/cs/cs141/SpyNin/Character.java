package edu.csupomona.cs.cs141.SpyNin;

import java.io.Serializable;

/**
 * 
 */

/**
 * @author cody
 *
 */
public abstract class Character implements Serializable {
	
	protected int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	protected int lives;
	
	public void Die(){
		lives--;
	}
	
	public abstract Board Move(Board grid);

}
