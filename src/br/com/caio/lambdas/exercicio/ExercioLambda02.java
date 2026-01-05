package br.com.caio.lambdas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercioLambda02 {
    public static void main(String[] args) {
        List<String> listNome = new ArrayList<>(List.of("Caio", "Gabriel"));

        List<Integer> lista = map(listNome, s -> s.length());
        System.out.println(lista);
    }

    private static <T, R> List<R> map(List<T> list , Function<T, R> function){
        List<R> result = new ArrayList<>();

        for(T t : list){
            R r = function.apply(t);
            result.add(r);
        }

        return result;
    }

}
