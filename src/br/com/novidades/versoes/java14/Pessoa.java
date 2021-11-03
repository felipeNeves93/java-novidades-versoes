package br.com.novidades.versoes.java14;

// Declarando a classe dessa forma, é criada uma classe imutavel, com todos os metodos
// Padrões (equals, hashcodem toString, getters e etc.
public record Pessoa(String nome, String sobrenome, String email) {
}
