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

public class SUMOFUNSPECIFIEDNUMBER {
    public static void main(String[] args) {
        Scanner SAVE = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter the numbers to calculate their sum: ");
        while (true) {
            number = SAVE.nextInt();
            if (number == 0) {
                break;
            }
           sum += number;
            System.out.println("Added " + number + " | Running total: " + sum);
        }
        System.out.println("\nThe sum of all numbers is: " + sum);
        
    }
}