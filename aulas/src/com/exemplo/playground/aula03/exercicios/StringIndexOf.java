package com.exemplo.playground.aula03.exercicios;

import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args) {
        String texto = new Scanner(System.in).nextLine();
        if(texto.indexOf(",") > 0 ){
            System.out.println(texto.substring(0, texto.indexOf(",")));
        }
        System.out.println();


    }
}
