package br.com.novidades.versoes.java15;

// Quando trabalhamos com a herança de sealed-classes, é necessário informar se a classe
// herda a sealed class, também é uma sealed-class, non-sealed ou final, dessa forma
// Isso garante que a hierarquia de classes permaneça finita.
// Nesse caso definimos que é uma non sealed class.
public non-sealed class Quadrado extends Quadrilatero {

    public Quadrado(int valorLado) {
        
        setLadoDireito(valorLado);
        setLadoEsquerdo(valorLado);
        setLadoSuperior(valorLado);
        setLadoInferior(valorLado);
    }
}
