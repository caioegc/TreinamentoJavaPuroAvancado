package br.com.caio.classesInternas;

import br.com.caio.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class barcoOrder implements Comparator<Barco>{
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonimaClasse02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha"), new Barco("Barco a vela")));
        barcoList.sort(new Comparator<Barco>(){
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        barcoList.forEach(System.out::println);
        }
    }


