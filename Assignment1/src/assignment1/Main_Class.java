/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;
import jdk.nashorn.api.tree.ContinueTree;

/**
 *
 * @author User
 */
public class Main_Class {

    public static void main(String[] args) {

        System.out.println("---------------Please choose an option---------------");
        System.out.println("1. Fibonacci using recursion");
        System.out.println("2. Object passing");
        System.out.print("Your choice: ");

        Scanner input = new Scanner(System.in);

        int option = input.nextInt();

        switch (option) {

            case 1:
                Fibonacci obj = new Fibonacci();
                obj.result();
                break;

            case 2:
                ObjectPassing obj2 = new ObjectPassing();
                obj2.passObject();
                break;

            default:
                System.out.println("Wrong option. Program closed..........");
        }
    }

}
