/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Admin
 */
import common.Validation;

public class ManagerEquation {

    // Allow user to calculate Superlative Equation
    
    public static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = Validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validation.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);

        System.out.print("Number is odd: ");
        if (Validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkOdd(x)) {
            System.out.print(x + " ");
        }

        System.out.print("\nNumber is even: ");
        if (Validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkEven(x)) {
            System.out.print(x + " ");
        }

        System.out.print("\nNumber is perfect square: ");
        if (Validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Allow user to calculate Quadratic Equation
    public static void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = Validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validation.checkInputDouble();
        System.out.print("Enter C: ");
        double c = Validation.checkInputDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No real roots.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Solution: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        }

        System.out.print("Number is odd: ");
        if (Validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkOdd(c)) {
            System.out.print(c + " ");
        }

        System.out.print("\nNumber is even: ");
        if (Validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkEven(c)) {
            System.out.print(c + " ");
        }

        System.out.print("\nNumber is perfect square: ");
        if (Validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
