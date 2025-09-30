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

public class GCD {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (!save.hasNextInt()) {
            System.out.println("Error: Please enter the valid integers only.");
            return;
        }
        int n1 = save.nextInt();
        
        System.out.print("Enter second number: ");
        if (!save.hasNextInt()) {
            System.out.println("Error: Please enter valid integers only.");
            return;
        }
        int n2 = save.nextInt();
        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Error: Both numbers must be positive integers.");
            save.close();
            return;
        }
        System.out.println("\nFinding GCD of " + n1 + " and " + n2 + ":");
        int gcd = 1;
        int smaller = Math.min(n1, n2);
        System.out.println("Checking divisors from 1 to " + smaller + ":");
        System.out.println("--------------------------------");
        for (int i = 1; i <= smaller; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                System.out.println("✓ " + i + " is a common divisor");
            }
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RESULTS:");
        System.out.println("=".repeat(50));
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is: " + gcd);
        System.out.println("\nEstablsihing mathematical Relationships:");
        System.out.println(n1 + " = " + (n1 / gcd) + " × " + gcd);
        System.out.println(n2 + " = " + (n2 / gcd) + " × " + gcd);
        System.out.println("\nVerifY:");
        System.out.println(n1 + " ÷ " + gcd + " = " + (n1 / gcd) + " (exact division)");
        System.out.println(n2 + " ÷ " + gcd + " = " + (n2 / gcd) + " (exact division)");
    }
}