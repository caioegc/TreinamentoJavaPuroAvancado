package br.com.caio.streams.teste;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TesteStream05 {

    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10),
            new Animes("DeathNoth", 5.50),
            new Animes("Attack on titan", 8.25),
            new Animes("Full Metal Aquimista", 3.99),
            new Animes("HunterxHunter", 2.50),
            new Animes("Dragon ball Z", 10.50)
    ));

    public static void main(String[] args) {
        Stream<Animes> animesStream = animesList.stream();
        animesList.forEach(System.out::println);

       long i = animesStream.filter(a -> a.getPreco() <=10).count();
       long d = animesList.stream()
                       .distinct() //duplicados
                       .filter(a -> a.getPreco() <= 10)
                       .count();


        System.out.println(i);
        System.out.println(d);


    }



}