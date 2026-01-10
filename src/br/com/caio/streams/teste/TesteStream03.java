package br.com.caio.streams.teste;

import br.com.caio.streams.dominio.Animes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream03 {

    public static void main(String[] args) {

        List<List<String>> jogadores = new ArrayList<>();
        List<String> jogadoresFluminense = new ArrayList<>(List.of("Samuel Xavierr", "Martinelli", "Ganso", "Fabio", "Cano"));
        List<String> jogadoresFlamengo = new ArrayList<>(List.of("Arrascaeta", "Jorginho", "Plata"));
        List<String> jogadoresBotafogo = new ArrayList<>(List.of("Barboza", "Savarino", "Alex Telles"));
        List<String> jogadoresVasco = new ArrayList<>(List.of("Coutinho"));

        jogadores.add(jogadoresFluminense);
        jogadores.add(jogadoresFlamengo);
        jogadores.add(jogadoresBotafogo);
        jogadores.add(jogadoresVasco);

        for (List<String> n : jogadores) {
            for (String f : n) {
                System.out.println(f);
            }
        }
        System.out.println("---");

        jogadores.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}