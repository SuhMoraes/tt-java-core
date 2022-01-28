package com.exemplo.playground.aula03.exercicios;

import java.util.Scanner;

public class StringCompareToTrimIsEmprty {
    public static void main(String[] args) {
        String email = new Scanner(System.in).nextLine();
        email.trim();
        System.out.println(email);
        if(email.compareTo("suhalvesmoraes@mail.com") == 0) {
            System.out.println("email correto");
        }
        if (email.isEmpty()){
            System.out.println("É necessário informar seu e-mail");

        }

    }
}
