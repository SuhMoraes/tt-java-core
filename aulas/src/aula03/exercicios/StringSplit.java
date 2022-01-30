package aula03.exercicios;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto =  new Scanner(System.in).nextLine();
        String[] textoSplit = texto.split(" ");
        for(int i =0; i< textoSplit.length; i++ ){
            System.out.println(textoSplit[i]);
        }

        sc.close();

    }
}
