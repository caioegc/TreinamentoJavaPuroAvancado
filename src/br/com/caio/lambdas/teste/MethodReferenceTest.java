package br.com.caio.lambdas.teste;

import br.com.caio.lambdas.dominio.Anime;
import br.com.caio.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Naruto", 500),
                new Anime("One piece", 900),
                new Anime("DeathNoth", 80)));

        //Collections.sort(animes, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        //Collections.sort(animes, (a1, a2) -> AnimeComparator.animeComparar(a1, a2));
        //Collections.sort(animes, AnimeComparator::anymeByNome);
        //Collections.sort(animes, AnimeComparator::anymeByEpisodes);
        animes.sort(AnimeComparator::anymeByEpisodes);


        System.out.println(animes);
        }
}
