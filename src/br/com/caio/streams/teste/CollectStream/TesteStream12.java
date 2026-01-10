package br.com.caio.streams.teste.CollectStream;

import br.com.caio.streams.dominio.Animes;
import br.com.caio.streams.dominio.Categoria;
import br.com.caio.streams.dominio.Promocao;

import java.util.*;
import java.util.stream.Collectors;

public class TesteStream12 {
    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10, Categoria.ROMANCE),
            new Animes("DeathNoth", 5.50, Categoria.DRAMA),
            new Animes("Attack on titan", 8.25, Categoria.FANTASY),
            new Animes("Full Metal Aquimista", 3.99, Categoria.ROMANCE),
            new Animes("HunterxHunter", 2.50, Categoria.FANTASY),
            new Animes("Dragon ball Z", 10.50, Categoria.DRAMA)
    ));


    public static void main(String[] args) {
        Map<Categoria, Long> collect = animesList.stream().collect(Collectors.groupingBy(Animes::getCategoria, Collectors.counting()));
        System.out.println(collect);
        Map<Categoria, Optional<Animes>> collect1 = animesList.stream().collect(Collectors.groupingBy(Animes::getCategoria, Collectors.maxBy(Comparator.comparing(Animes::getPreco))));
        System.out.println(collect1);
        Map<Categoria, Animes> collect2 = animesList.stream().collect(Collectors.groupingBy(Animes::getCategoria, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Animes::getPreco)), Optional::get)));
        System.out.println(collect2);
    }

    }



