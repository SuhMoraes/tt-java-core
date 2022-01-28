package com.exemplo.playground.aula03.exercicios;

import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        String texto = new Scanner(System.in).nextLine();

        if(texto.length() <= 13 ) {
            System.out.printf("%s ", texto);
        } else {
            System.out.println(texto.substring(0, 13));
        }
    }
}
