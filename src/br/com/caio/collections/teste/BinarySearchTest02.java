package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> listNome = new ArrayList<>();
        listNome.add(new Manga(50D, "Nanatsu N Taizai", 1L));
        listNome.add(new Manga(25.1, "Attack on titan", 5L));
        listNome.add(new Manga(26.50, "Sete pecados capitais", 4L));
        listNome.add(new Manga(110.4, "Naruto", 2L));
        listNome.add(new Manga(20.15, "Dragon Ball", 3L));

        for (int i = 0; i < listNome.size(); i++) {
            System.out.println(listNome.get(i));
        }

        System.out.println();

        Collections.sort(listNome);
        for (int i = 0; i < listNome.size(); i++) {
            System.out.println(listNome.get(i));
        }

        System.out.println();
        System.out.println("Binary:");
        Manga mangaToSearch = new Manga(25.1, "Attack on titan", 5L);
        System.out.println(Collections.binarySearch(listNome, mangaToSearch));

        System.out.println();
        listNome.sort(new OrderById());
        for (int i = 0; i < listNome.size(); i++) {
            System.out.println(listNome.get(i));
        }

        System.out.println();
        System.out.println("Binary:");
        Manga mangaToSearch2 = new Manga(25.1, "Attack on titan", 5L);
        System.out.println(Collections.binarySearch(listNome, mangaToSearch2, new OrderById() ));
    }
    }


