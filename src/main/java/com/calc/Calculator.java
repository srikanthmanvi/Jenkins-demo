package com.calc;

/**
 * Created by smanvi on 6/22/17.
 */
public class Calculator {

    public int add(int a, int b) {
        int result = a + b;
        System.out.println(String.format("Result of adding %d and %d is %d",a,b, result));
        return result;
    }


    public int multiply(int a, int b){
        return a * b;
    }
}