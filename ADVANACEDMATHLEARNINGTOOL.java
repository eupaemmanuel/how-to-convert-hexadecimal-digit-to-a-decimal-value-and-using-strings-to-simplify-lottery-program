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
public class ADVANACEDMATHLEARNINGTOOL {
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);
        System.out.println("WELCOME TO THIS SESSION!");
        System.out.println("How many problems would you like to solve?");
        int Questions = save.nextInt();
        int n = 0;
        System.out.println("\nBegins with " + Questions + " problems!\n");
        
        for (int i = 1; i <= Questions; i++){
            int n1 = (int)(Math.random() * 100);
            int n2 = (int)(Math.random() * 100);
            
            // Ensure n1 >= n2 to avoid negative answers
            if (n1 < n2){
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            
            // Display question (this should be outside the if condition)
            System.out.print("Question " + i + ": " + n1 + " - " + n2 + " = ");
            int answer = save.nextInt();
            
            // Check if answer is correct
            if (answer == n1 - n2){
                System.out.println("Correct!");
                n++;
            } else {
                System.out.println("Incorrect. The answer is " + (n1 - n2));
            }
            System.out.println();
        }
        System.out.println("Total questions: " + Questions);
        System.out.println("Correct Answers: " + n);
        System.out.println("Score: " + (n * 100 / Questions) + "%");
        
     
    }
}