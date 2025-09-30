/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.whileloop;

/**
 *
 * @author VU-STUDENTS
 */
import java.util.Scanner;
public class GUESHING {
    public static void main(String[] args){
        int randomnumber =(int)(Math.random()*101);
        Scanner save = new Scanner(System.in);
        int guess;
        int attempts = 0;
        System.out.println("The randome numbers generated are between 0 and 100");
        System.out.println("Guess the Number!");
        while (true){
            System.out.println("Enter your Guess: ");
            guess = save.nextInt();
            attempts++;
                    if(guess < randomnumber){
                        System.out.println("TOO LOW! TRY AGAIN.");
                        
                    }
                    else if (guess>randomnumber){
                        System.out.println("TOO HIGH! TRY AGAIN.");
                        
                    }
                    else {
                        System.out.println("CONGRATULATIONS! YOU HAVE GUESSED THE NUMBER "+ randomnumber+ "CORRECTLY!");
                        System.out.println("Its my pleasure to " + attempts + " attempts.");
                    }
        }
    }
    
}
