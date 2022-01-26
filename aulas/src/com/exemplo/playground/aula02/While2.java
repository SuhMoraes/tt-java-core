package com.exemplo.playground.aula02;

public class While2 {

    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10){
            int multi = contador*7;
            System.out.printf("7 x %d - %d\n", contador, multi);
            contador = contador+1;
        }

    }

}
