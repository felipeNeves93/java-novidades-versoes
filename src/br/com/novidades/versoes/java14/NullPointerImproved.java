package br.com.novidades.versoes.java14;

public class NullPointerImproved {

    // Antes o nullPointer trazia apenas a linha e a cascata de erros de onde havia ocorrido o problema.
    public static void main(String... args) {

        // Com as melhorias que vieram com o Java 14, a assertividade do erro do NullPointer melhorou,
        // Trazendo a causa de forma mais clara, como no exemplo abaixo ao tentar acessar uma posição de um array nulo.
        char[] arrayNulo = null;

        // A mensagem de erro deve informar especificamente que nao pode ser acessado um elemento de um array nulo.
        System.out.println(arrayNulo[1]);
    }
}
