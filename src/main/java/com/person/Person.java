package com.person;

/**
 * Created by smanvi on 6/23/17.
 */
public class Person {

    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void printAddress(int n) {

//        for (int i = 0; i < n; i++) {
//            System.out.println(this.address);
//        }

        int i=0;
        while ( i < n ){
            System.out.println(this.address);
            i++;
        }
    }
}
