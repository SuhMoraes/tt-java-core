package aula03;

public class StringExemplos {
    public static void main(String[] args) {
        String texto = "Hoje é quinta - feira!";
        String[] textoSplit = texto.split(" "); // Fatiou o texto
        System.out.println(texto.substring(1,15));
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.compareTo("Hoje é quinta.") == 0); // Compara e valida

        //Compara ignorando as letras minúsculas ou maiúsculas
        System.out.println(texto.compareToIgnoreCase("HOJE É QUINTA - FEIRA!") == 0 );


        System.out.println(texto.trim().compareTo("Hoje é quinta - feira!") == 0);

         System.out.println(texto.isEmpty());


    }
}
