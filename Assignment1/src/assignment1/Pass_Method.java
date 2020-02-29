/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author User
 */
public class Pass_Method {

    String name;
    int age;

    Pass_Method(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Pass_Method(Pass_Method person) {
        this.name = person.name + " Tajbir";
        this.age = person.age + 1;
    }

    Boolean isPreson(Pass_Method person) {
        return (person.name == "Tajbir Ahmmad" && person.age == 21);
    }

}
