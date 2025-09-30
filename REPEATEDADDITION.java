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
public class REPEATEDADDITION {
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);
        int n1=(int)(Math.random()*10);
        int n2=(int)(Math.random()*10);
        int correctAnswer = n1 + n2;
        int answer;
        int attempts = 2;
        System.out.println("Addition quiz!");
        do {
            System.out.println("What is "+n1+"+"+n2+"?");
            answer =save.nextInt();
            attempts++;
            if(answer == n1+n2){
                System.out.println("The answer is correct! you have got it in" + attempts + " attempts(s).");
             
            }
            else {
                System.out.println("Incorrect. Review your answer!");
            }
        } while (answer != n1 + n2);
    }  
}  