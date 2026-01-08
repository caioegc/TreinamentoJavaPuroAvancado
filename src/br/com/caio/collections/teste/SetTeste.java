package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        Set<Manga> manga = new HashSet<>();

        manga.add(new Manga(50D, "Nanatsu N Taizai", 1L, 0));
        manga.add(new Manga(25.1, "Attack on titan", 5L, 3));
        manga.add(new Manga(26.50, "Sete pecados capitais", 4L, 0));
        manga.add(new Manga(110.4, "Naruto", 2L,0));
        manga.add(new Manga(20.15, "Dragon Ball", 3L, 3));
        manga.add(new Manga(20.15, "Dragon Ball", 5L, 3));
        manga.add(new Manga(20.15, "Dragon Ball", 2L, 3));


        manga.forEach(System.out::println);
    }
}
