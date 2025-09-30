/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.whileloop;

/**
 *
 * @author VU-STUDENTS
 */
public class PREDICTINGFUTURETUITION {
    public static void main(String[] args){
        int years = 0;
        double tuition = 10000;
        
        System.out.println("Calculating years for tuition to double...");
        
        while (tuition < 20000) {
            years++;
            tuition *= 1.07;
        }
        
        System.out.printf("It will take %d years for tuition to double from $10,000 to $%,.2f%n", 
                         years, tuition);
    }
}