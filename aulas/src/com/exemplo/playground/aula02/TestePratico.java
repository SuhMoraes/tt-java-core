package com.exemplo.playground.aula02;

import java.util.Scanner;

public class TestePratico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if( nota >= 7){
            System.out.println("Passou de Ano");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
