package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Pessoa;

public class TesteEquals {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Caio", 23);
        Pessoa pessoa2 = new Pessoa("Caio", 15);

        System.out.println(pessoa1.equals(pessoa2));
    }
}
