package br.com.caio.collections.teste;

import br.com.caio.collections.entity.Smarthphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TesteArray {
    public static void main(String[] args) {
        List nome = new ArrayList<>();
        List caio = new ArrayList<>();
        List<Integer> lista = new ArrayList<>();

        Smarthphone smarthphone1 = new Smarthphone("Iphone", 1);
        Smarthphone smarthphone2 = new Smarthphone("Iphone", 2);
        Smarthphone smarthphone3 = new Smarthphone("Samsung", 3);

        System.out.println(smarthphone1.equals(smarthphone3));

        nome.add(smarthphone1);
        nome.add(smarthphone2);
        nome.add(smarthphone3);
        caio.add("CAIO");
        caio.add(20);
        caio.add('a');
        caio.add(1.25);
        lista.add(1);
        lista.add(3);
        lista.add(2);


        for (Object o : caio){
            System.out.println(o);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


        for (Object o : nome){
            System.out.println(o);
        }

    }
}
