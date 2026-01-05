package br.com.caio.lambdas.teste;

import br.com.caio.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TesteLambda03 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(
                new Barco("Lancha", "Verde"),
                new Barco("Lancha", "Branca"),
                new Barco("Navio", "Rosa")));

        List<Barco> list = filtrar(barcos, b -> b.getCor().equalsIgnoreCase("Verde"));
        List<Barco> list2 = filtrar(barcos, b -> b.getNome().equalsIgnoreCase("Navio"));

        System.out.println(list);
        System.out.println(list2);
    }

    private static <T> List<T> filtrar(List<T> barcoList, Predicate<T> predicate){
        List<T> listBarco = new ArrayList<>();
        for(T t : barcoList){
            if(predicate.test(t)){
                listBarco.add(t);
            }
        }

        return listBarco;
    }

}
