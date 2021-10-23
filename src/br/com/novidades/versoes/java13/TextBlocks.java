package br.com.novidades.versoes.java13;

public class TextBlocks {

    public static void main(String... args) {
        // Iniciando da versão 13, trabalhar com jsons ficou mais facil no java.
        // Antes havia a necessidade de se usar uma string comum para manipular o json,
        // tornando mais trabalhoso a manutenção. Agora é possivel usar blocos de texto
        // para se formar um json, conforme exemplo abaixo.
        // Obs: Para declarar um novo TextBlock é necessário colocar as '"""' (tres aspas duplas)
        final var blocoTexto = """
                "nome": "Felipe",
                "sobrenome": "Neves",
                "profissao": %s
                \\t
                """;

        // Como pode ser observado, a classe do bloco de texto é uma string,
        // Não sendo criado nenhuma outra classe especial para comportar essa funcionalidade,
        // Ou seja, todas as funções da classe string funcionam nos texts blocks
        System.out.println(blocoTexto.getClass().getSimpleName());

        // Alguns métodos foram adicionados especificamente para tratamento de texts blocks, que são:

        // Formatted. Tem a mesma função do String.format(), so que para text blocks
        var blocoTextoFormatado = blocoTexto.formatted("programador");

        // Deve printar programador no lugar do %s
        System.out.println(blocoTextoFormatado);

        // translateEscapes. Converte escape caracters. Exemplo, de \\t para \t
        System.out.println(blocoTextoFormatado.translateEscapes());

        // stripIndent. Remove espaços em branco acidentais
        System.out.println(blocoTexto.stripIndent());
    }
}
