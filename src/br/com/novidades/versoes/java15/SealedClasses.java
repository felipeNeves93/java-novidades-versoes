package br.com.novidades.versoes.java15;

public class SealedClasses {
    public static void main(String[] args) {
        // Sealed classes foram criadas com o intuito de promovoer um controle
        // maior sobre a hierarquia de heranças que uma classe pode ter, permitindo
        // ao desenvolvedor definir quais classes podem fazer parte da herança.

        // Nesse exemplo, criamos uma classe abstrata chamada Quadrilatero, que define que duas
        // classes podem herdar as características dela, que são Quadrado e Retangulo.

        // Esse controle foi atingido através da inclusão da palavra reservada 'sealed' na
        // declaração da classe (Funciona com interfaces também). Para maior entendimento,
        // Acesse as classes Quadrado, Retangulo e Quadrilatero que contem as declarações.
        var quadrado = new Quadrado(10);
        var retangulo = new Retangulo(20, 30);

        // Caso queiramos adicionar um novo membro na herança, é necessário mexer
        // Na classe Quadrilatero e declarar a nova classe pretendida, caso contrário,
        // Um erro em tempo de compilação irá ocorrer.
    }

}
