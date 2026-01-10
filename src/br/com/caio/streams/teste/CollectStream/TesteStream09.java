package br.com.caio.streams.teste.CollectStream;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream09 {
    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10),
            new Animes("DeathNoth", 5.50),
            new Animes("Attack on titan", 8.25),
            new Animes("Full Metal Aquimista", 3.99),
            new Animes("HunterxHunter", 2.50),
            new Animes("Dragon ball Z", 10.50)
    ));


    public static void main(String[] args) {

        System.out.println(animesList.stream().count());
        System.out.println(animesList.stream().collect(Collectors.counting()));


        animesList.stream().map(Animes::getPreco).max(Comparator.comparing(a -> a)).ifPresent(System.out::println);
        animesList.stream().max(Comparator.comparing(Animes::getPreco));
        animesList.stream().collect(Collectors.maxBy(Comparator.comparing(a -> a.getPreco()))).ifPresent(System.out::println);

        DoubleSummaryStatistics collect = animesList.stream().collect(Collectors.summarizingDouble(Animes::getPreco));
        System.out.println(collect);

        String collect1 = animesList.stream()
                .map(Animes::getTitulo)
                .collect(Collectors.joining(", "));


        System.out.println(collect1);


    }
}
