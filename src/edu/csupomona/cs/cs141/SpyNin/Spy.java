/**
 * 
 */

/**
 * This is the class for the player, the Spy that has to find the briefcase. The
 * player can move, shoot, and look on any given turn, and has a few powerups
 * that can be found on the board as well.
 * 
 * @author Cody Sheppard
 * 
 */
public class Spy {
	/**
	 * This value stores the amount of lives the player has. When it reaches 0,
	 * the player loses.
	 */
	private int lives;
	/**
	 * This value stores the amount of bullets the player has. The value will
	 * always be {@code 0 < ammo < 1}.
	 */
	private int ammo;
	/**
	 * This value determines if the player has the radar powerup. When
	 * {@link #radar} is {@code true}, the briefcase is revealed.
	 */
	private boolean radar;
	/**
	 * This stores the amount of turns the player is invincible. If the value is
	 * {@code 0} then the player is not invincible.
	 */
	private int invincibility;
	/**
	 * This stores the amount of turns the player has a flashlight. If
	 * {@code flashlight > 0} then the player has an extended sight range in the
	 * direction they just moved..
	 */
	private int flashlight;
	/**
	 * This stores the number of blocks ahead the player can see. If the
	 * {@link #flashlight} is active, the sight range is larger.
	 */
	private int sightRange;

	/**
	 * This is the constructor for the {@link Spy}.
	 */
	public Spy() {

	}

	/**
	 * This class moves the player on the {@link Board}.
	 */
	public void Move() {

	}

	/**
	 * This class shoots the Spy's gun, taking up {@link #ammo}, if the spy has
	 * a bullet.
	 */
	public void Shoot() {

	}

	/**
	 * This class extends the {@link #sightRange} by two in any direction.
	 */
	public void Look() {

	}

	/**
	 * This class is what happens when the player dies and loses, when the
	 * player's {@link #lives} reaches {@code 0}.
	 */
	public void Die() {

	}

}
