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
import java.util.Scanner;

/**
 * A class representing a player on the game board.
 */
public class Player extends Character{
	/*
	 * Initializes the player object with a number of lives.
	 */
	public Player(int lives) {

	}

	/**
	 * 
	 */
	public Player() {
		this.lives = 5;
		this.id = 1;
		// TODO Auto-generated constructor stub
	}

	private int invincibility;
	private int flashlight;
	private int ammo = 1;
	private int range;
	Scanner keyboard = new Scanner(System.in);

	/*
	 * Shoots a bullet in the given direction.
	 */
	public void Shoot(Board grid, Ninja[] nins) {
		if (ammo < 0) {

			System.out.println("Which direction would you like to shoot?");
			System.out.println("1. Up");
			System.out.println("2. Left");
			System.out.println("3. Right");
			System.out.println("4. Down");
			System.out.print("Choice: ");
			int direction = keyboard.nextInt();

			switch (direction) {
			case 1: {
				int y = grid.getY(1);
				int x = grid.getX(1);

				for (y = grid.getY(1); y > 0; y--) {
					if (grid.getObj(x, y) > 19) {
						nins[grid.getObj(x, y)].Die();
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
						nins[grid.getObj(x, y)].Die();
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
						nins[grid.getObj(x, y)].Die();
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
						nins[grid.getObj(x, y)].Die();
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
		System.out.print("Choice: ");
		int direction = keyboard.nextInt();
		if (direction>0&&direction<5){
		grid.LookBoard(direction);}
		else{
			System.out.println("That is not a valid option");
		}
		// TODO Implement look

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.csupomona.cs.cs141.SpyNin.Character#Move()
	 */
	public Board Move(Board grid) {
		int move = 1;
		while (move == 1) {
			System.out.println("Which direction would you like to move?");
			System.out.println("1. Up");
			System.out.println("2. Left");
			System.out.println("3. Right");
			System.out.println("4. Down");
			System.out.print("Choice: ");
			int direction = keyboard.nextInt();

			switch (direction) {
			case 1: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if (grid.getObj(x - 1, y) != 10) {
					grid.setObj(x - 1, y, 1);
					grid.setObj(x, y, 0);
					move = 0;
				} else {
					System.out.println("There is a wall there.");
				}
				break;
				
			}
			case 2: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if (grid.getObj(x, y - 1) != 10) {
					grid.setObj(x, y - 1, 1);
					grid.setObj(x, y, 0);
					move = 0;
				} else {
					System.out.println("There is a wall there.");
				}
				break;
				
			}
			case 3: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if (grid.getObj(x, y + 1) != 10) {
					grid.setObj(x, y + 1, 1);
					grid.setObj(x, y, 0);
					move = 0;
				} else {
					System.out.println("There is a wall there.");
				}
				break;
				
			}
			case 4: {
				int y = grid.getY(1);
				int x = grid.getX(1);
				if (grid.getObj(x + 1, y) != 10) {
					grid.setObj(x + 1, y, 1);
					grid.setObj(x, y, 0);
					move = 0;
				} else {
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
		return grid;
	}

	public Board ninjaCheck(Board b) {
		Random r = new Random();
		int y = b.getY(1);
		int x = b.getX(1);
		if ((b.getObj(x, y - 1) >= 20) || (b.getObj(x, y + 1) >= 20)
				|| (b.getObj(x - 1, y) >= 20) || (b.getObj(x + 1, y) >= 20)) {
			Die();
			b.setObj(x, y, 0);
			if (b.getObj(9, 1) < 20) {
				b.setObj(9, 1, 1);
			} else {
				int temp = b.getObj(9, 1);
				while (temp != 0) {
					x = r.nextInt(11);
					y = r.nextInt(11);
					if (b.getObj(x, y) == 0) {
						b.setObj(x, y, temp);
						temp = 0;
						b.setObj(9, 1, 1);
					}
				}

			}

		}
		return b;
	}
}
