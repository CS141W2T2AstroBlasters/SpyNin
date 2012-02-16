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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * * CS 141: Introduction to Programming and Problem Solving Professor: Edwin
 * Rodr&iacute;guez
 * 
 * Programming Assignment #N
 * 
 * Spies vs. Ninjas
 * 
 * Team #2 / AstroBlasters David Khacherian Jacob Longazo
 * 
 * This is the main class in which the game runs.
 */
public class Game {

	private static Scanner keyboard = new Scanner(System.in);
	/*private static SaveLoad sL = new SaveLoad();*/

	/**
	 * The main game loop. <Further explanation of implementation>
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		boolean quit = false;
		while (quit == false) {
			int mainMenu = startMenu();
			switch (mainMenu) {
			case 1: {
				while (true) {
					boolean play = startGame();
					break;
				}

			}
			/*case 2: {
				while (true) {
					boolean play = loadGame();
					break;
				}

			}*/

			case 3: {
				System.out.println("Thank you for playing our game!");
				quit = true;
				break;
			}

			default: {
				System.out.println("That is not a valid option.");
				break;
			}
			}
		}
	}

	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	/*public static boolean loadGame() throws IOException, ClassNotFoundException {

		Board board = sL.loadBoard();
		Player player = sL.loadPlayer();
		Ninja[] nins = sL.loadNinjas();
		BulletUp bullet = new BulletUp();
		Invincibility invinciblity = new Invincibility();
		Flashlight flash = new Flashlight();
		Radar radar = new Radar();
		boolean play = true;
		while (play == true) {
			boolean move=false,shoot=false,look=false,end=false;
			while ((move==false||shoot==false||look==false)&&end==false){
			int choice = playerMenu(board);
			switch (choice) {
			case 1: {
				if (move == false){
				board.displayBoard();
				player.Move(board);
				int x = board.getX(1);
				int y = board.getY(1);
				int wincheck = board.getStatic(x, y);
				if (wincheck == 3 || wincheck == 9) {
					Win();
					play = false;
					break;
				}
				move = true;}
				else {
					System.out.println("You have already moved");
				}
				break;
			}
			case 2: {
				board.displayBoard();
				player.Look(board);
				break;

			}
			case 3: {
				board.displayBoard();
				player.Shoot(board, nins);
				break;
			}
			case 4:{
				end = true;
				break;
			}
			case 5: {
				System.out.println("Would you like to Save your game?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print("Choice: ");
				int save = keyboard.nextInt();
				if (save == 1) {
					sL.saveGame(board, player, nins);
				}
				end = true;
				play = false;
				break;
			}
			default: {
				System.out.println("That is not a valid option.");
				break;
			}
			}
			}
			if (play == true) {
				board = ninjaTurn(board, nins);
				board = player.ninjaCheck(board);
				int losecheck = player.getLives();
				if (losecheck == 0) {
					Lose();
					play = false;
				}
			}
		}

		return play;
	}*/

	public static int startMenu() {
		System.out.println("Welcome to Spy vs Ninjas!");
		System.out.println();
		System.out.println("\tMenu");
		System.out.println();
		System.out.println("1. New Game");
		System.out.println("2. Load Game");
		System.out.println("3. Quit");
		System.out.print("Choice: ");
		int choice = keyboard.nextInt();
		return choice;
	}

	public static boolean startGame() throws FileNotFoundException {
		boolean play = true;
		Board board = new Board();
		Player player = new Player();
		Ninja[] nins = new Ninja[6];
		for (int i = 0; i < nins.length; i++) {
			nins[i] = new Ninja((20 + i));
		}
		BulletUp bullet = new BulletUp();
		Invincibility invinciblity = new Invincibility();
		Flashlight flash = new Flashlight();
		Radar radar = new Radar();
		
		while (play == true) {
			boolean move=false,shoot=false,look=false,end=false;
			while ((move==false||shoot==false||look==false)&&end==false){
			int choice = playerMenu(board);
			switch (choice) {
			case 1: {
				if (move == false){
				board.displayBoard();
				player.Move(board);
				int x = board.getX(1);
				int y = board.getY(1);
				int wincheck = board.getStatic(x, y);
				if (wincheck == 3 || wincheck == 9) {
					Win();
					play = false;
					break;
				}
				move = true;}
				else {
					System.out.println("You have already moved");
				}
				break;
			}
			case 2: {
				player.Look(board);
				break;

			}
			case 3: {
				board.displayBoard();
				player.Shoot(board, nins);
				break;
			}
			case 4:{
				end = true;
				break;
			}
			/*case 5: {
				System.out.println("Would you like to Save your game?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print("Choice: ");
				int save = keyboard.nextInt();
				if (save == 1) {
					sL.saveGame(board, player, nins);
				}
				end = true;
				play = false;
				break;
			}*/
			default: {
				System.out.println("That is not a valid option.");
				break;
			}
			}
			}
			if (play == true) {
				board = ninjaTurn(board, nins);
				board = player.ninjaCheck(board);
				int losecheck = player.getLives();
				if (losecheck == 0) {
					Lose();
					play = false;
				}
			}
		}

		return play;

	}

	public static int playerMenu(Board b) {
		b.displayBoard();
		System.out.println("1. Move");
		System.out.println("2. Look");
		System.out.println("3. Shoot");
		System.out.println("4. End Turn");
		System.out.println("5. Quit");
		System.out.print("Choice: ");
		int choice = keyboard.nextInt();
		return choice;
	}

	public static void Win() {
		System.out.println("You Win!");

	}

	public static void Lose() {
		System.out.println("You Lose!");

	}

	public static Board ninjaTurn(Board board, Ninja[] nins) {
		for (int i = 0; i < nins.length; i++) {
			board = nins[i].Move(board);
		}
		return board;
	}
}
