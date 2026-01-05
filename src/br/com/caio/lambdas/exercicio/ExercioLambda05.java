package br.com.caio.lambdas.exercicio;

import br.com.caio.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExercioLambda05 {
    public static void main(String[] args) {;
        List<Carro> barcos = new ArrayList<>(List.of(
                new Carro("BMW", "Vermelha"),
                new Carro("Siena", "Prata"),
                new Carro("Fox", "Prata"),
                new Carro("Ford ka", "Branco")));

        List<Carro> strings = filter(barcos, a -> a.getCor().equalsIgnoreCase("Prata"));
        strings.forEach(System.out::println);
    }

    private static<T> List<T> filter(List<T> list, Predicate<T>predicate){
        List<T> retorno = new ArrayList<>();

        for(T t : list){
            if(predicate.test(t)){
                retorno.add(t);
            }
        }
        return retorno;
    }
}
