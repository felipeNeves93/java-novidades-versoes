package br.com.novidades.versoes.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTeeing {

    public static void main(String... args) {
        // O Teeing collector tem como função realizar o processamento de dois collectors,
        // e realizar o merge dos resultados. Nesse exemplo, vamos simular quatro notas de
        // um aluno, e realizar o calculo da media usando o Teeing Collector

        var mediaAluno = Stream.of(8, 6, 6, 4)
                .collect(Collectors.teeing(Collectors.summingDouble(nota -> nota),
                        Collectors.counting(), (somaNotas, quantidadeNotas) -> somaNotas / quantidadeNotas));

        // No primeiro Collectors, estamos chamando o novo 'teeing', e passando para ele como argumento dois outros
        // Collectors. O collector 'summingDouble' irá realizar a soma de todas as notas, e o Collector 'counting'
        // contar a quantidade de elementos. No fim, o ultimo parametro a ser passado para o teeing é a função que irá
        // Realizar o 'merge' dos resultados, no nosso caso, o calculo da  média, que nesse caso deve ser printado 6.0.

        System.out.println(mediaAluno);

    }
}
