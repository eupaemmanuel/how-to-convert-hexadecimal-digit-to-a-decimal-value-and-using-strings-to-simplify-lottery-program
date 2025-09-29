/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.main.hextodecimal;

/**
 *
 * @author Emma
 */

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        
        System.out.print("Enter a hexadecimal digit: ");
        String input = save.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Invalid input: Empty input");
        } else {
            char hexChar = input.charAt(0);
            String hexString = String.valueOf(hexChar);
            
            try {
                int decimalValue = Integer.parseInt(hexString, 16);
                System.out.println("Decimal value: " + decimalValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Not a hexadecimal digit");
            }
        }
        
             
    }
}