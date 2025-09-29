/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.lottery;

/**
 *
 * @author Emma
 */

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        String lottery = "" + (int)(Math.random() * 90 + 10);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();
        
        System.out.println("Lottery number: " + lottery);
        
        if (guess.equals(lottery)) {
            System.out.println("$10,000 Prize!");
        } else if (lottery.indexOf(guess.charAt(0)) >= 0 && lottery.indexOf(guess.charAt(1)) >= 0) {
            System.out.println("$3,000 Prize!");
        } else if (lottery.indexOf(guess.charAt(0)) >= 0 || lottery.indexOf(guess.charAt(1)) >= 0) {
            System.out.println("$1,000 Prize!");
        } else {
            System.out.println("No prize");
        }
    }
}