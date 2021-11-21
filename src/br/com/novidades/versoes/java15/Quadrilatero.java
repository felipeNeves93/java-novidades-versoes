package br.com.novidades.versoes.java15;

// Nesse exemplo, temos a classe quadrilatero, que só pode ser herdada pelas classes Quadrado e Retangulo.
// É adicionado a palavra sealed para definir que é uma classe com escopo de herança fechado, e a keyword
// permits para definir quais classes podem fazer parte.
public abstract sealed class Quadrilatero permits Quadrado, Retangulo {

    private int ladoSuperior;
    private int ladoInferior;
    private int ladoEsquerdo;
    private int ladoDireito;

    public int getLadoSuperior() {
        return ladoSuperior;
    }

    public void setLadoSuperior(int ladoSuperior) {
        this.ladoSuperior = ladoSuperior;
    }

    public int getLadoInferior() {
        return ladoInferior;
    }

    public void setLadoInferior(int ladoInferior) {
        this.ladoInferior = ladoInferior;
    }

    public int getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(int ladoEsquerdo) {
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public int getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(int ladoDireito) {
        this.ladoDireito = ladoDireito;
    }
}
