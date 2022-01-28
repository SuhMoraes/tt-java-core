package com.exemplo.playground.aula03.exercicios;

import java.util.Scanner;

public class StringToLowerCaseToUpperCase {
    public static void main(String[] args) {
        String texto = new Scanner(System.in).nextLine();
        boolean espaço = false;

        for (int i = 0; i < texto.length(); i++) {
            String caracter = String.valueOf(texto.charAt(i));
            if(!espaço) {
                System.out.print(caracter.toUpperCase());
            } else  {
                System.out.printf(caracter.toLowerCase());
            }
        }
    }
}
