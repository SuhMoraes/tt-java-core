package com.exemplo.playground.aula03.exercicios;

import java.util.Scanner;

public class StringTwitter {
    public static void main(String[] args) {
        String texto = new Scanner(System.in).nextLine();

        if (texto.length() > 140) {
            System.out.println(texto.substring(0, 137).concat("..."));
        } else {
            System.out.println(texto);
        }
    }
}
