package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Smarthphone;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class SmarthphoneComparable implements Comparator<Smarthphone>{
    @Override
    public int compare(Smarthphone o1, Smarthphone o2) {
       return o1.getNome().compareTo(o2.getNome());
    }
}

public class SetTreeTest {
    public static void main(String[] args) {
        Set<Smarthphone> smarthphone = new TreeSet<>(new SmarthphoneComparable());

        smarthphone.add(new Smarthphone("Caio", 23));
        smarthphone.add(new Smarthphone("Caio", 1));
        smarthphone.add(new Smarthphone("Andre", 58));
        smarthphone.add(new Smarthphone("Eliene", 58));
        smarthphone.add(new Smarthphone("Rafael", 21));
        smarthphone.add(new Smarthphone("Gabriel", 21));

        smarthphone.forEach(System.out::println);

    }
}
