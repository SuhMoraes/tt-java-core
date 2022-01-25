package com.exemplo.playground;

import java.util.Scanner;

public class TestePratico2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Avalie o nosso atendimento com uma nota de 1 a 5");
        int nota = sc.nextInt();

        switch(nota) {
            case 1:
                System.out.println("0/1 - Péssimo");
                break;
            case 2:
                System.out.println("2- Ruim");
                break;
            case 3:
                System.out.println("3 - Regular");
                break;
            case 4:
                System.out.println("4 - Bom");
                break;
            case 5:
                System.out.println("5 - Excelente");
                break;

        }

        sc.close();
    }

}
