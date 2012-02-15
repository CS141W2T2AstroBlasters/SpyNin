/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Spies vs. Ninjas 
 *
 * Team #2 / AstroBlasters
 *   David Khacherian
 *	 Jacob Longazo
 *   
 * This is the main class in which the game runs.
 */

package edu.csupomona.cs.cs141.SpyNin;
import java.util.Scanner;

public class Game {
	
	/**
	 * Whether or not the game has been won.
	 */
	public boolean winGame;
    private static Scanner keyboard = new Scanner(System.in);

	/**
	 * The main game loop. <Further explanation of implementation>
	 * @param args
	 */
	public static void main(String[] args){
                boolean quit=false;
                while (quit == false){
                int mainMenu=startMenu();
                switch (mainMenu){
                case 1:{
                        while(true){
                                boolean play = startGame();
                                break;
                        }
                        
                        
                }
                case 2:{
                        
                }
                
                case 3:{
                        
                }
                
                default:{
                        
                }
                }
                }
        }
        
        public static int startMenu(){
                System.out.println("1. New Game");
                System.out.println("1. Load Game");
                System.out.println("1. Quit");
                System.out.print("Choice: ");
                int choice = keyboard.nextInt();
                return choice;
        }
        
        public static boolean startGame(){
                boolean play = true;
                Board board = new Board();
                Player player = new Player();
                Ninja[] nins = new Ninja[6];
                for (int i = 0;i<nins.length;i++){
                        nins[i]=new Ninja((20+i));
                }
                BulletUp bullet = new BulletUp();
                Invincibility invinciblity = new Invincibility();
                Flashlight flash = new Flashlight();
                Radar radar = new Radar();
                while (play == true){
                        int choice = playerMenu();
                        switch (choice){
                        case 1:{
                                board.displayBoard();
                                player.Move(board);
                                int x = board.getX(1);
                                int y = board.getY(1);
                                int wincheck=board.getStatic(x, y);
                                if (wincheck==3||wincheck==9){
                                        Win();
                                        play = false;
                                        break;
                                }
                                break;
                        }
                        case 2:{
                                board.displayBoard();
                                player.Look(board);
                                break;
                                
                        }
                        case 3:{
                                board.displayBoard();
                                player.Shoot(board);
                                break;                        
                        }
                        case 4:{
                                play = false;
                                break;
                        }
                        default:{
                                System.out.println("That is not a valid option.");
                                break;
                        }
                        }
                        board = ninjaTurn(board, nins);
                        int losecheck = player.getLives();
                        if (losecheck == 0){
                                Lose();
                                play = false;
                        }
                }
                
                
                return play;
                
        }
        
        public static int playerMenu(){
                System.out.println("1. Move");
                System.out.println("1. Look");
                System.out.println("1. Shoot");
                System.out.println("1. Quit");
                int choice = keyboard.nextInt();
                return choice;
        }
        
        public static void Win(){
                System.out.println("You Win!");
                
        }
        
        public static void Lose(){
                System.out.println("You Lose!");
                
        }
        
        public static Board ninjaTurn(Board board,Ninja[] nins){
                for (int i = 0;i<nins.length;i++){
                        nins[i].Move(board);
                        nins[i].killPlayer(board);
                }
                return board;
        }
}
