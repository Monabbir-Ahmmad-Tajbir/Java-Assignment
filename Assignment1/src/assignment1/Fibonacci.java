/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public void result() {

        System.out.println("---------------Fibonacci using recursion---------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers should be in the series: ");
        int maxNumb = input.nextInt();

        System.out.print("Fibonacci Series of " + maxNumb + " numbers: ");
        for (int i = 0; i < maxNumb; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
