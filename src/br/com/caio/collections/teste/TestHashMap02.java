package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Consumidor;
import br.com.caio.collections.entity.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMap02 {
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

        produto.put(consumidor1, manga4);
        produto.put(consumidor2, manga5);
        produto.put(consumidor3, manga1);

        for(Map.Entry<Consumidor, Manga> entry : produto.entrySet()){
            System.out.println(entry.getKey().getNome() + " = " + entry.getValue().getNome());
        }
    }
}
