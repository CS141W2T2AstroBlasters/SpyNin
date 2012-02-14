package edu.csupomona.cs.cs141.SpyNin;

import java.util.Scanner;

/**
 * A class representing a player on the game board.
 */
public class Player extends Character {
	/*
	 * Initializes the player object with a number of lives.
	 */
	public Player(int lives) {

	}

	private int invincibility;
	private int flashlight;
	private int ammo = 1;
	private int range;
	Scanner keyboard = new Scanner(System.in);

	/*
	 * Shoots a bullet in the given direction.
	 */
	public void Shoot(Board grid) {
		if (ammo < 0) {

			System.out.println("Which direction would you like to shoot?");
			System.out.println("1. Up");
			System.out.println("2. Left");
			System.out.println("3. Right");
			System.out.println("4. Down");
			int direction = keyboard.nextInt();

			switch (direction) {
			case 1: {
				int y = grid.getY(1);
				int x = grid.getX(1);

				for (y = grid.getY(1); y > 0; y--) {
					if (grid.getObj(x, y) > 19) {
						grid.setObj(x, y, 0);
					}
				}
				ammo--;
				break;
			}
			case 2: {
				int y = grid.getY(1);
				int x = grid.getX(1);

				for (x = grid.getY(1); x > 0; x--) {
					if (grid.getObj(x, y) > 19) {
						grid.setObj(x, y, 0);
					}
				}
				ammo--;
				break;
			}
			case 3: {
				int y = grid.getY(1);
				int x = grid.getX(1);

				for (x = grid.getY(1); x < 11; x++) {
					if (grid.getObj(x, y) > 19) {
						grid.setObj(x, y, 0);
					}
				}
				ammo--;
				break;
			}
			case 4: {
				int y = grid.getY(1);
				int x = grid.getX(1);

				for (y = grid.getY(1); y < 11; y++) {
					if (grid.getObj(x, y) > 19) {
						grid.setObj(x, y, 0);
					}
				}
				ammo--;
				break;
			}
			default: {
				System.out.println("That is not a valid option.");
				break;
			}

			}
		} else {
			System.out.println("You are out of ammo.");
		}

	}

	/*
	 * Allows the player to see range number of squares ahead in the given
	 * direction.
	 */
	public void Look(Board grid) {
		System.out.println("Which direction would you like to Look?");
		System.out.println("1. Up");
		System.out.println("2. Left");
		System.out.println("3. Right");
		System.out.println("4. Down");
		int direction = keyboard.nextInt();
		// TODO Implement look

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.csupomona.cs.cs141.SpyNin.Character#Move()
	 */
	@Override
	public void Move(Board grid) {
		int move=1;
		while (move==1) {
			System.out.println("Which direction would you like to move?");
			System.out.println("1. Up");
			System.out.println("2. Left");
			System.out.println("3. Right");
			System.out.println("4. Down");
			int direction = keyboard.nextInt();

			switch (direction) {
			case 1: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if(grid.getObj(x, y-1)!=10){
				grid.setObj(x, y-1, 1);
				grid.setObj(x, y, 0);
				move=0;
				}
				else{
					System.out.println("There is a wall there.");
				}
				break;
			}
			case 2: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if(grid.getObj(x-1, y)!=10){
				grid.setObj(x-1, y, 1);
				grid.setObj(x, y, 0);
				move=0;
				}
				else{
					System.out.println("There is a wall there.");
				}
				break;
			}
			case 3: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if(grid.getObj(x+1, y)!=10){
				grid.setObj(x+1, y, 1);
				grid.setObj(x, y, 0);
				move=0;
				}
				else{
					System.out.println("There is a wall there.");
				}
				break;
			}
			case 4: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if(grid.getObj(x, y+1)!=10){
				grid.setObj(x, y+1, 1);
				grid.setObj(x, y, 0);
				move=0;
				}
				else{
					System.out.println("There is a wall there.");
				}
				break;
			}
			default: {
				System.out.println("That is not a valid option.");
				break;
			}

			}
		}
	}
}
