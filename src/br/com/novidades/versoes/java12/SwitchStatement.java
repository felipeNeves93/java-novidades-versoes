package br.com.novidades.versoes.java12;

public class SwitchStatement {

    public static void main(String... args) {
        // A partir do java 12, a expressão switch ganhou uma extensão
        // onde ficou mais suscinta e é possivel trabalhar com retorno do switch

        // Nesse exemplo baseado na cor que setarmos para a variável, através do switch
        // em sua nova sintaxe informaremos se é uma cor neutra ou primaria.

        var cor = Cor.AMARELO;

        // Nao precisamos mais colocar o break, e a sintaxe agora ficou parecida
        // com as lambdas
        var resultado = switch (cor) {
            case VERMELHO, AMARELO, AZUL -> "Primaria";
            case BRANCO, PRETO, CINZA -> "Neutra";
        };

        // Aqui deve printar o resultado "Primaria" que é o retorno do switch
        System.out.println(resultado);
    }

    enum Cor {
        VERMELHO,
        AZUL,
        AMARELO,
        BRANCO,
        PRETO,
        CINZA
    }

}
