package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Consumidor;
import br.com.caio.collections.entity.Manga;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMap03 {
    public static void main(String[] args) {

        Map<Consumidor, Manga> produto = new HashMap<>();

        Consumidor consumidor1 = new Consumidor("Caio");
        Consumidor consumidor2 = new Consumidor("Gabriel");
        Consumidor consumidor3 = new Consumidor("Rafael");

          Manga manga1 = new Manga(50D, "Nanatsu N Taizai", 1L);
          Manga manga2 = new Manga(25.1, "Attack on titan", 5L);
          Manga manga3 = new Manga(26.50, "Sete pecados capitais", 4L);
          Manga manga4 = new Manga(110.4, "Naruto", 2L);
          Manga manga5 = new Manga(20.15, "Dragon Ball", 3L);

        List<Manga> listManga = List.of(manga1, manga2, manga3);
        List<Manga> listManga2 = List.of(manga5, manga3);
        List<Manga> listManga3 = List.of(manga4);

        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();

        consumidorListMap.put(consumidor1, listManga2);
        consumidorListMap.put(consumidor2, listManga);
        consumidorListMap.put(consumidor3, listManga3);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorListMap.entrySet()){
            System.out.println("---" +entry.getKey().getNome());
            for(Manga m : entry.getValue()){
                System.out.println("--------" + m.getNome());
            }


        }
    }



}
