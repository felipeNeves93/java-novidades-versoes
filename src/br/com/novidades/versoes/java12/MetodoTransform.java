package br.com.novidades.versoes.java12;

import java.io.IOException;
import java.nio.file.Files;

public class MetodoTransform {

    public static void main(String... args) {

        // Metodo Transform da classe String
        // Permite passar uma function como argumento para manipular uma string
        var textoComTodasAsLetrasA = "aaabbbccc";
        var textoSemAsLetrasA = textoComTodasAsLetrasA.transform(texto -> texto.replaceAll("a", ""));

        // Deve printar o valor do texto como 'bbbccc'
        System.out.println(textoSemAsLetrasA);
    }
}
