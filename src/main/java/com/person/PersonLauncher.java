package com.person;

/**
 * Created by smanvi on 6/23/17.
 */
public class PersonLauncher {

    public static void main(String args[]) {
        Person p1 = new Person("John", 30, "Cary, NC");
        Person p2 = new Person("David", 50, "Raleigh, NC");

        p1.printAddress(5);
        p2.printAddress(10);


//        System.out.println(p1.getAddress());
    }

}
