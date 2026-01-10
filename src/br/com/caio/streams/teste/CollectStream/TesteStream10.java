package br.com.caio.streams.teste.CollectStream;

import br.com.caio.streams.dominio.Animes;
import br.com.caio.streams.dominio.Categoria;

import java.util.*;
import java.util.stream.Collectors;

public class TesteStream10 {
    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10, Categoria.ROMANCE),
            new Animes("DeathNoth", 5.50, Categoria.DRAMA),
            new Animes("Attack on titan", 8.25, Categoria.FANTASY),
            new Animes("Full Metal Aquimista", 3.99, Categoria.ROMANCE),
            new Animes("HunterxHunter", 2.50, Categoria.FANTASY),
            new Animes("Dragon ball Z", 10.50, Categoria.DRAMA)
    ));


    public static void main(String[] args) {

        Map<Categoria, List<Animes>> categoriaListMap = new HashMap<>();
        List<Animes> romance = new ArrayList<>();
        List<Animes> drama = new ArrayList<>();
        List<Animes> fantasia = new ArrayList<>();

        for (Animes animes : animesList) {
           switch (animes.getCategoria()){
               case DRAMA: drama.add(animes);
               break;
               case FANTASY: fantasia.add(animes);
               break;
               case ROMANCE: romance.add(animes);
               break;
           }
        }

        categoriaListMap.put(Categoria.DRAMA, drama);
        categoriaListMap.put(Categoria.FANTASY, fantasia);
        categoriaListMap.put(Categoria.ROMANCE, romance);

        System.out.println(categoriaListMap);

        Map<Categoria, List<Animes>> collect = animesList.stream().collect(Collectors.groupingBy(Animes::getCategoria));
        System.out.println(collect);

    }
    }

