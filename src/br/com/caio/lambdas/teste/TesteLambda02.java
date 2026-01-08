package br.com.caio.lambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TesteLambda02 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Caio", "Eduardo"));
        List<Integer> list = map(lista, s -> s.length());
        List<String> list2 = map(lista, s -> s.toUpperCase());
        System.out.println(list);
        System.out.println(list2);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T t : list){
            R r = function.apply(t);
            result.add(r);
        }

    return result;
    }
}
