/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.whileloop;

/**
 *
 * @author VU-STUDENTS
 */
public class DPN {
    public static void main(String[] args) {
        int count = 0; 
        int number = 2; 
        System.out.println("The first 50 prime numbers are:\n");
        while (count < 50) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                count++; 
                System.out.printf("%4d", number);
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}
