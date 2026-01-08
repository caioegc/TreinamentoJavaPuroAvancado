package br.com.caio.lambdas.teste;

import br.com.caio.lambdas.dominio.Anime;
import br.com.caio.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenteTeste02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Naruto", 500),
                new Anime("One piece", 900),
                new Anime("Among us", 10),
                new Anime("DeathNoth", 80)));

        animes.sort(animeComparator::animeByNome);
        animes.forEach(System.out::println);

        List<String> nomes = new ArrayList<>(List.of("Caio", "Rafael", "Gabriel"));
        nomes.sort(String::compareTo);

        List<Integer> nums = new ArrayList<>(List.of(50, 15, 20));
        nums.sort(Integer::compareTo);

        System.out.println(nomes);
        System.out.println(nums);

        Function<String, Integer> function = Integer::parseInt;

        System.out.println(function.apply("10"));

    }


}
