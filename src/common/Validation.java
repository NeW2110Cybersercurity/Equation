/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;


import java.util.Scanner;

public class Validation {

    public static final Scanner in = new Scanner(System.in);

    // Check user input integer within a specified range
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number in the range [" + min + ", " + max + "]!");
                System.out.print("Enter again: ");
            }
        }
    }

    // Check user input double
    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input only double!!");
                System.out.print("Enter again: ");
            }
        }
    }

    // Check if a number is odd
    public static boolean checkOdd(double n) {
        return n % 2 == 1;
    }

    // Check if a number is even
    public static boolean checkEven(double n) {
        return n % 2 == 0;
    }

    // Check if a number is a perfect square
    public static boolean checkSquareNumber(double n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}
