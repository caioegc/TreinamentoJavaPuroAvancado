package br.com.caio.lambdas.service;

import br.com.caio.lambdas.dominio.Anime;

public class AnimeComparator {

    public static int anymeByNome(Anime a1, Anime a2){
        return a1.getNome().compareTo(a2.getNome());

    }

    public static int anymeByEpisodes(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());

    }

    public int animeByNome(Anime a1, Anime a2){
        return a1.getNome().compareTo(a2.getNome());
    }
}
