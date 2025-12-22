package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ByNomeSort implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class PessoaSort {
    public static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();

        pessoa.add(new Pessoa("Caio", 23));
        pessoa.add(new Pessoa("Gabriel", 21));
        pessoa.add(new Pessoa("Rafael", 21));
        pessoa.add(new Pessoa("Andre", 58));
        pessoa.add(new Pessoa("Eliene", 45));

        Collections.sort(pessoa);

        for (Pessoa p : pessoa){
            System.out.println(p);
        }

        System.out.println("\n-------------\n");

        pessoa.sort(new ByNomeSort());
        for(Pessoa p : pessoa){
            System.out.println(p);
        }
    }
}
