package edu.csupomona.cs.cs141.SpyNin;

/**
 * A class to represent a powerup that gives the player extra bullets.
 */
public class BulletUp {
	/*
	 * Initializes the powerup with the number of extra bullets to be awarded to
	 * the player.
	 */
	public BulletUp(int bullets) {
		num_bullets = bullets;
	}

	/**
	 * Whether or not the powerup is currently active.
	 */
	private boolean active;

	/**
	 * The number of extra bullets that this powerup awards the player.
	 */
	public final int num_bullets;

	/**
	 * Returns whether or not the powerup is currently active.
	 */
	public boolean isActive() {
		return active;
	}
}
