package br.com.caio.lambdas.teste;

import java.util.*;
import java.util.function.Consumer;

public class TesteLambda {
    public static void main(String[] args) {
       List<String> lista = new ArrayList<>(List.of("Caio", "Eduardo", "Rafael", "Gabriel", "Eliene", "Andre", "Vanessa"));
       List<Integer> lista2 = new ArrayList<>(List.of(10, 15, 20, 25, 30, 1,2,3,8,55,1000));
       Collections.sort(lista);
       Collections.sort(lista2);
       forReach(lista,  s -> System.out.println(s));
        System.out.println();
       forReach(lista2,  s -> System.out.println(s));
        System.out.println(lista);

        lista2.forEach(System.out::println);
    }


    private static <T> void forReach (List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }
}
