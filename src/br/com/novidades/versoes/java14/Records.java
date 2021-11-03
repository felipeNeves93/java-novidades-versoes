package br.com.novidades.versoes.java14;

public class Records {

    public static void main(String[] args) {

        // Foi adicionado uma nova palavra reservada chamada 'record', que surgiu como uma forma
        // de diminuir a quantidade de código que precisamos escrever ao criar um POJO simples.

        // Conforme pode ser visto na declaração da classe Pessoa, agora não é necessário declarar todos
        // os métodos "padrões", apenas utilizar a palavra reservada record, que o compilador se encarrega
        // do resto.

        var pessoa = new Pessoa("Felipe", "Neves", "felipe@email.com");

        // Como por padrão é criado um objeto imutável, não são declarados os setters, porem os outros metodos
        // como equals, hashcode, toString e getters sim.

        System.out.println(pessoa.nome());
        System.out.println(pessoa.toString());
    }
}
