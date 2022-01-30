package aula02;

public class Soma {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 1000; i++) {
            num = num + i;
        }
        System.out.printf("A soma dos números de 1 a 1000 é %d\n", num);

    }
}
