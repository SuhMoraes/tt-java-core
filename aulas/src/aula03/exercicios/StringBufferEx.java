package aula03.exercicios;

import java.util.Scanner;

public class StringBufferEx {
    public static void main(String[] args) {
        String texto;
        StringBuffer stringBuffer = new StringBuffer();

        do{
            System.out.println("Digite qualquer coisa, caso queira parar digite sair:");
            texto = new Scanner(System.in).nextLine();

        } while(texto.compareTo("sair") != 0);

        System.out.println(stringBuffer);

    }
}
