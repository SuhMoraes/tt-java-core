package aula03;

public class Array {
    public static void main(String[] args) {
        int[] anos;                      // Apenas a declaração
        anos = new int[2];               // Declaração e instanciação = Array de tamanho 2 (0,1)
        anos[0] = 2020;                 // Atribuição do índice 0
        anos[1] = 2021;                 // Atribuição do indice 1
        System.out.println(anos.length); // Retorna o tamanho da array (2)
        System.out.println(anos[0]);    // Obtém o item do índice 0

        menor();
    }

    private static void menor() {
        // Encontre o menor valor da lista
        int[] num = {88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};
        int menor = 0;
        for(int i =0; i < num.length; i++) {
            if (i == 0 ) {
                menor = num[i];
            } else {
                if ( menor > num[i]){
                    menor = num[i];
                }
            }
        }
        System.out.printf("Menor numero da lista é %d\n", menor);

    }
}
