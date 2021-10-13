package br.com.novidades.versoes.java12;

import java.io.IOException;
import java.nio.file.Files;

public class MetodoFileMismatch {

    public static void main(String... args) {

        // File Mismatch
        // Metodo que serve para comparar dois arquivos, e encontrar a posição do primeiro
        // byte que difere um do outro.
        try {
            var arquivoUm = Files.createTempFile("arquivo1", ".txt");
            var arquivoDois = Files.createTempFile("arquivo2", ".txt");

            // Nesse primeiro exemplo, o resultado deve ser -1, pois ambos os conteudos dos arquivos são idênticos
            Files.writeString(arquivoUm, "Ola Mundo");
            Files.writeString(arquivoDois, "Ola Mundo");

            var posicaoByteDiferente = Files.mismatch(arquivoUm, arquivoDois);
            // deve printar -1
            System.out.println(posicaoByteDiferente);

            // Já nesse outro exemplo, deve printar o valor 4, que é onde a letra 'm' se difere da 'M'

            var arquivoTres = Files.createTempFile("arquivo3", ".txt");
            var arquivoQuatro = Files.createTempFile("arquivo4", ".txt");

            // Nesse primeiro exemplo, o resultado deve ser -1, pois ambos os conteudos dos arquivos são idênticos
            Files.writeString(arquivoTres, "Ola Mundo");
            Files.writeString(arquivoQuatro, "Ola mundo");

            posicaoByteDiferente = Files.mismatch(arquivoTres, arquivoQuatro);
            // deve printar 4
            System.out.println(posicaoByteDiferente);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
