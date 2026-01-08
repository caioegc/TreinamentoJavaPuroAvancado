package br.com.caio.lambdas.teste;

import br.com.caio.lambdas.dominio.Anime;
import br.com.caio.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTeste04 {

    public static void main(String[] args) {
        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;

        AnimeComparator animeComparator = animeComparatorSupplier.get();
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Naruto", 500),
                new Anime("One piece", 900),
                new Anime("Among us", 10),
                new Anime("DeathNoth", 80)));

        animes.sort(animeComparator::animeByNome);
        System.out.println(animes);
    }
}
