
import Controller.ManagerEquation;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    ManagerEquation.superlativeEquation();
                    break;
                case 2:
                    ManagerEquation.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}
