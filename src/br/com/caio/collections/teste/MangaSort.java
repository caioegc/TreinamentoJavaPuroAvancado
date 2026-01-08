package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 class OrderById implements Comparator<Manga> {
     @Override
     public int compare(Manga o1, Manga o2) {
         return o1.getId().compareTo(o2.getId());
     }
 }

public class MangaSort {

    public static void main(String[] args) {
        List<Manga> listNome = new ArrayList<>();
        listNome.add(new Manga(50D, "Nanatsu N Taizai", 1L));
        listNome.add(new Manga(25.1, "Attack on titan", 5L));
        listNome.add(new Manga(26.50, "Sete pecados capitais", 4L));
        listNome.add(new Manga(110.4, "Naruto", 2L));
        listNome.add(new Manga(20.15, "Dragon Ball", 3L));

        Collections.sort(listNome);

        for (Manga m : listNome){
        System.out.println(m);
    }

        System.out.println();
        System.out.println("TROCA DE ORDENAÇÃO");
        System.out.println();

       // Collections.sort(listNome, new OrderByName());

        listNome.sort(new OrderById());
        for (Manga m : listNome){
            System.out.println(m);
}
}
 }
