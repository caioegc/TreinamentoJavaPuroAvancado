package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTeste {
    public static void main(String[] args) {

        List<Manga> listNome = new ArrayList<>();
        listNome.add(new Manga(50D, "Nanatsu N Taizai", 1L, 0));
        listNome.add(new Manga(25.1, "Attack on titan", 5L, 3));
        listNome.add(new Manga(26.50, "Sete pecados capitais", 4L, 0));
        listNome.add(new Manga(110.4, "Naruto", 2L,0));
        listNome.add(new Manga(20.15, "Dragon Ball", 3L, 3));

//        for (Manga m : listNome){
//            if(m.getQuantidade() == 0){
//                listNome.remove(m);
//                System.out.println(m);
//            }
//        }  -> FORMA ERRADA DE REMOVER

//        Iterator<Manga> it = listNome.iterator();
//        while(it.hasNext()){
//           if(it.next().getQuantidade() == 0){
//               it.remove();
//           }
//        } -> jeito certo de fazer;

        listNome.removeIf(manga -> manga.getQuantidade() == 0); //jeito atual de fazer rs
        System.out.println(listNome);

    }}
