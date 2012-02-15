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
        int mainMenu=startMenu();
        while (quit == false){
        switch (mainMenu){
        case 1:{
                while(true){
                        boolean play = startGame();
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
        
    playGame(){
            
    }
    public boolean startGame(){
        return play;
    }
        
    public int playerMenu(){
        return choice;
    }
        
    public void Win(){
                
    }
        
    public void Lose(){
                
    }
        
    public Board ninjaTurn(Board board){
        return board;
    }
}}
