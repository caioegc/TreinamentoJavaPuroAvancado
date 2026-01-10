package br.com.caio.streams.teste;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream08 {

    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10),
            new Animes("DeathNoth", 5.50),
            new Animes("Attack on titan", 8.25),
            new Animes("Full Metal Aquimista", 3.99),
            new Animes("HunterxHunter", 2.50),
            new Animes("Dragon ball Z", 10.50)
    ));

    public static void main(String[] args) {

      animesList.stream()
              .map(Animes::getPreco)
              .filter(p -> p > 8)
              .reduce(Double::sum)
              .ifPresent(System.out::println);


     Double soma =   animesList.stream()
              .mapToDouble(Animes::getPreco)
             .filter(p -> p > 8)
              .sum();

        System.out.println(soma);

    }
}