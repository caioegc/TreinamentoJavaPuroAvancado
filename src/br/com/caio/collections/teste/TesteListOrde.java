package br.com.caio.collections.teste;

import java.util.*;

public class TesteListOrde {
    public static void main(String[] args) {
        List<String> listNome = new ArrayList<>();
        listNome.add("Caio");
        listNome.add("Andre");
        listNome.add("Gabriel");
        listNome.add("Eliene");
        listNome.add("Rafael");

        Collections.sort(listNome);
        listNome.forEach(System.out::println);
    }
}
