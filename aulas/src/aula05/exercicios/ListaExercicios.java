package aula05.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaExercicios {
    public static void main(String[] args) {
        //Popular uma lista com as seguintes cores: (Amarelo, Azul, Vermelho, Preto,
        //Branco, Azul)
        List<String> list = new ArrayList<>();
        list.add("Amarelo");
        list.add("Vermelho");
        list.add("Preto");
        list.add("Branco");
        list.add("Azul");

        //Imprimir o resultado
        System.out.println(list);

        // Remover o item 2 da lista
        list.remove(1);

        // Imprimir o resultado
        System.out.println(list);

        // Adicionar a cor (Marrom)
        list.add("Marrom");

        // Imprimir a quantidade de itens da lista
        System.out.println(list.size());

        // Imprimir o valor armazenado no último índice da lista
        int ultimoIndece = list.size() - 1;
        System.out.println(list.get(ultimoIndece));

        // Substituir o valor “Azul” por “Verde”
        int indiceAzul = list.indexOf("Azul");
        list.set(indiceAzul, "Verde");
        System.out.println(list);

        //Verificar se existe a cor “Azul” se não existir e houver a cor “Vermelho”, deve
        //ser adicionada a cor “Azul”, senão adicionar “Roxo”
        if(!list.contains("Azul") && list.contains("Vermelho")){
            list.add("Azul");
        } else {
            list.add("Roxo");
        }

        // Imprimir o conteúdo da collection
        System.out.println(list);


    }


}
