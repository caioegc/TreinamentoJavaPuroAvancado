package br.com.caio.padraodeprojeto.builder.test;

import br.com.caio.padraodeprojeto.builder.entity.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaBuilder()
                .primeiroNome("Caio")
                .ultimoNome("Carvalho")
                .email("dudueocara77@gmail.com")
                .build();

        System.out.println(build);
    }
}
