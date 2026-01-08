package br.com.caio.lambdas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioLambda04 {
    public static void main(String[] args) {
        List<String> string = List.of("Naruto", "Sasuke", "Sakura");
        List<Integer> inteiro = list(string, a -> a.length());
        List<String> string2 = list(string, a -> a.toUpperCase());

        System.out.println(inteiro);
        System.out.println(string2);
        System.out.println("---");
        inteiro.forEach(System.out::println);
        string2.forEach(System.out::println);



    }

    private static <T, R> List<R> list(List<T> listaFora, Function<T, R> function){
        List<R> list2 = new ArrayList<>();
        for(T t : listaFora){
            R r = function.apply(t);
            list2.add(r);

        }

        return list2;
    }
}
