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
public class ObjectPassing {

    public void passObject() {

        System.out.println("---------------Object passing---------------");
        System.out.println("How do you want to pass object?");
        System.out.println("1. Pass as argument");
        System.out.println("2. Pass as parameter");
        System.out.print("Your choice: ");

        Scanner input = new Scanner(System.in);

        int option = input.nextInt();

        switch (option) {

            case 1:
                Pass_Method person = new Pass_Method("Tajbir", 21);

                Pass_Method person2 = new Pass_Method("Tajbir Ahmmad", 21);

                System.out.println("Person == Admin? " + person.isPreson(person2));
                break;

            case 2:
                Pass_Method person3 = new Pass_Method("Monabbir Ahmmad", 20);

                Pass_Method person4 = new Pass_Method(person3);
                System.out.println("The 4th person is " + person4.name + " and his age is " + person4.age);
                break;

            default:
                System.out.println("Wrong option. Program closed..........");
        }

    }

}
