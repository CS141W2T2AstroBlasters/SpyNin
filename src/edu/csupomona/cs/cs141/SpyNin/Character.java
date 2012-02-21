package edu.csupomona.cs.cs141.SpyNin;

import java.io.*;

/**
 * 
 */

/**
 * @author cody
 *
 */
public abstract class Character implements Serializable {

	public void Serialize()
	{
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(Integer.toString(id) + ".obj"));
			os.writeObject(this);
			os.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
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
