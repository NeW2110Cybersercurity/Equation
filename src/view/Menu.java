/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Admin
 */
import static common.Validation.checkInputIntLimit;
import java.util.Scanner;

public class Menu{

    private static final Scanner in = new Scanner(System.in);

    // Menu display
    public static int menu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Please choice one option:");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

}
