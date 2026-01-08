package br.com.caio.generics.teste;

import java.util.List;

public class WildCardTest03 {
    public static void main(String[] args) {
        List<Cachorro> cachorro =  List.of(new Cachorro(), new Cachorro());
        List<Gato> gato = List.of(new Gato(), new Gato());

        consultaPrint(cachorro);

    }

    private static void consultaPrint(List<? extends Animal> animal) {
        for(Animal animals : animal){
            animals.consultar();

        }

    }
}