package br.com.novidades.versoes.java15;


// Quando trabalhamos com a herança de sealed-classes, é necessário informar se a classe
// herda a sealed class, também é uma sealed-class, non-sealed ou final, dessa forma
// Isso garante que a hierarquia de classes permaneça finita.
// Nesse caso definimos que é uma class final, encerrando a herança nessa ramificação.
public final class Retangulo extends Quadrilatero {

    public Retangulo(int ladoSuperior, int ladoEsquerdo) {

        if (ladoSuperior == ladoEsquerdo) {
            throw new IllegalStateException("É um quadrado");
        }

        setLadoSuperior(ladoSuperior);
        setLadoInferior(ladoSuperior);
        setLadoEsquerdo(ladoEsquerdo);
        setLadoDireito(ladoEsquerdo);
    }
}
