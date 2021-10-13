package br.com.novidades.versoes.java12;

public class InstanceOfPatternMatching {

    public static void main(String... args) {

        // Agora quando vamos realizar a verificacao se um elemento é instancia de alguma classe,
        // nao é necessario mais fazer o cast da variavel que queremos comparar, como no exemplo antigo abaixo
        Object numero = 10;

        // Aqui precisamos realizar o cast manualmente para (Integer)
        if (numero instanceof Integer) {
            Integer numeroConvertido = (Integer) numero;
            System.out.println(numeroConvertido);
        }

        // Na nova forma, podemos fazer a declaração da variavel convertida ja na verificação,
        // Deixando o codigo mais direto.
        if (numero instanceof Integer numeroConvertido) {
            System.out.println(numeroConvertido);
        }
    }
}
