package com.exemplo.playground;

public class DoWhile {
    public static void main(String[] args) {

        int num1 = 150;
        int num2 = 300;

        do {
            System.out.println(num1++);
        } while (num1 < num2);
        System.out.println(num1);


    }
}
