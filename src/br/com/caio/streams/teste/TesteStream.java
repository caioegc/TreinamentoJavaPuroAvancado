package br.com.caio.streams.teste;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteStream {

    private static List<Animes> animesList = new ArrayList<>(List.of(
            new Animes("Naruto", 10),
            new Animes("DeathNoth", 5.50),
            new Animes("Attack on titan", 8.25),
            new Animes("Full Metal Aquimista", 3.99),
            new Animes("HunterxHunter", 2.50),
            new Animes("Dragon ball Z", 10.50)
    ));

    public static void main(String[] args) {
        animesList.sort(Comparator.comparing(Animes::getTitulo));

        List<String> listaDeAnimes = new ArrayList<>();

        for (Animes animes : animesList) {

            if(animes.getPreco() <= 10){
                listaDeAnimes.add(animes.getTitulo());
            }
            if(listaDeAnimes.size() >= 3){
                break;
            }

        }

        System.out.println(listaDeAnimes);
    }
}
