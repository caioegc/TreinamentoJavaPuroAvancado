package br.com.caio.streams.teste;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream06 {

    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10),
            new Animes("DeathNoth", 5.50),
            new Animes("Attack on titan", 8.25),
            new Animes("Full Metal Aquimista", 3.99),
            new Animes("HunterxHunter", 2.50),
            new Animes("Dragon ball Z", 10.50)
    ));

    public static void main(String[] args) {

        //busca
        System.out.println(animesList.stream().anyMatch(a -> a.getPreco() > 11)); // existe algum anime com preço maior que 10
        System.out.println(animesList.stream().allMatch(a -> a.getPreco() > 2)); // todos na lista são maiores que dois?
        System.out.println(animesList.stream().noneMatch(a -> a.getPreco() > 2)); // nenhum na lista são maiores que dois?

        animesList.stream()
                .filter(anime -> anime.getPreco() > 3)
                .findAny()
                .ifPresent(System.out::println);


        animesList.stream()
                .filter(anime -> anime.getPreco() > 3)
                .sorted(Comparator.comparing(Animes::getPreco))
                .findFirst()
                .ifPresent(System.out::println);

        animesList.stream()
                .filter(anime -> anime.getPreco() > 3).min(Comparator.comparing(Animes::getPreco))
                .ifPresent(System.out::println);




    }
}