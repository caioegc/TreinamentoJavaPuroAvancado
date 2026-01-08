package br.com.caio.generics.teste;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorro  =  List.of(new Cachorro(), new Cachorro());
        List<Gato> gato = List.of(new Gato(), new Gato());
        List<Animal> animal = new ArrayList<>();

        consultaAdicionar(animal);
        consultaPrint(animal);
        consultaPrint(animal);

    }

    private static void consultaPrint(List<? extends Animal> animal) {
        for(Animal animals : animal){
            animals.consultar();

        }

        //animal.add(new Cachorro());
    }

    private static void consultaAdicionar(List<? super Animal> animal){
        animal.add(new Cachorro("Caio", "15"));
        animal.add(new Gato("Lucas", "25"));
        Animal a = new Cachorro("Gabriel", "25");
        Animal b = new Gato("Rafael", "15");
        animal.add(a);
        animal.add(b);


    }
}