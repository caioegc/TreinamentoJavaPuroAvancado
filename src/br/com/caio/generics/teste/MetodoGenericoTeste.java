package br.com.caio.generics.teste;

import br.com.caio.generics.dominio.Barco;
import br.com.caio.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
//        criarArray(new Carro("Fiat"));
//        criarArray(new Carro("Chevrolet"));
//        criarArray(new Carro("Gol"));
//        criarArray(new Carro("BMW"));
//        criarArray(new Carro("BMW"));
//        criarArray(new Barco("Canoa"));
//        criarArray(new Barco("Lancha"));
//        criarArray(new Barco("Iate"));
    }


    private static <T> void criarArray(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}